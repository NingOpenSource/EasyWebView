package org.ning.easywebview.utils;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象的持久化存储<br>
 * Created by Lyon_Yan on 2015/3/25 0025.<br>
 *
 * @author 颜宁<br>
 *         2016年5月30日下午3:33:25<br>
 */
public class ObjectFileManager {
    private static final String SUFFIX = ".dat";
    /**
     * 持久化对象的存储目录
     */
    private String path = null;

    /**
     * 文件夹初始化 (例如：vd/sd/)
     */
    public ObjectFileManager(String path) {
        File file = new File(this.path = path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /**
     *
     * @author 颜宁<br>
     *         2016年5月30日下午3:11:58<br>
     * @param context
     */
    public ObjectFileManager(Context context) {
        try {
            File file = new File(this.path = context.getFilesDir().getAbsolutePath() + File.separator + "dat");
            if (!file.exists()) {
                file.mkdirs();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 持久化对象存储函数
     *
     * @param name
     *            对象的名称（也是保存文件的名称）
     * @param object
     *            序列化的对象
     * @return 成功则返回true
     */
    public boolean save(String name, Serializable object) {
        File file = new File(path + File.separator + name + SUFFIX);
        try {
            if (file.exists()) {
                return false;
            } else {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 持久化对象升级函数
     *
     * @param name
     *            对象的名称（也是保存文件的名称）
     * @param object
     *            序列化的对象
     * @return 成功则返回true
     */
    public boolean update(String name, Serializable object) {
        File file = new File(path + File.separator + name + SUFFIX);
        try {
            if (!file.exists()) {
                return false;
            } else {
                file.delete();
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 持久化对象删除函数
     *
     * @param name
     *            对象的名称（也是保存文件的名称）
     * @return 成功则返回true
     */
    public boolean remove(String name) {
        File file = new File(path + File.separator + name + SUFFIX);
        try {
            if (!file.exists()) {
                return true;
            } else {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 获取指定存储的对象
     *
     * @param name
     *            对象的名称（也是保存文件的名称）
     * @return 成功则返回对象，失败则返回null
     */
    public Object get(String name) {
        Object object = null;
        File file = new File(path + File.separator + name + SUFFIX);
        if (!file.exists()) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try {
                object = objectInputStream.readObject();
            } catch (IOException e) {
            }
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return object;
    }

    /**
     * 判断对象是否存在此目录
     *
     * @param name
     *            对象的名称（也是保存文件的名称）
     * @return
     */
    public boolean exists(String name) {
        return new File(path + File.separator + name + SUFFIX).exists();
    }
}