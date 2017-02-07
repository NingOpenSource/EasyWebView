package org.ning.easywebview;

import android.content.Context;

import org.ning.easywebview.utils.ObjectFileManager;

import java.io.File;
import java.util.HashMap;

/**
 * Created by yanni on 2017/2/4.
 */

class Config {
    public static HashMap<String, String> configMap = new HashMap<>();
    private static String path;
    private static ObjectFileManager objectFileManager;
    private static final String DATABASE="database";
    private static final String APP_CACHE="appCache";
    public Config(Context context) {
        if (path == null || "".equals(path))
            path = context.getFilesDir().getAbsolutePath() + File.separator + "EasyWebView";
        if (objectFileManager == null)
            objectFileManager = new ObjectFileManager(path);
        {
            File file=new File(path);
            if (!file.exists())file.mkdirs();
        }
    }

    public String getDataBasePath(){
        File file=new File(path,DATABASE);
        if (!file.exists())file.mkdirs();
        return file.getAbsolutePath();
    }

    public String getAppCachePath(){
        File file=new File(path,APP_CACHE);
        if (!file.exists())file.mkdirs();
        return file.getAbsolutePath();
    }
}
