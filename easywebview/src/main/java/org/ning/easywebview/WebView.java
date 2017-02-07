package org.ning.easywebview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

/**
 *
 * Created by yanni on 2017/2/3.
 */
public class WebView extends android.webkit.WebView{
    public WebView(Context context) {
        super(context);
    }

    public WebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public WebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public WebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public WebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        super(context, attrs, defStyleAttr, privateBrowsing);
        init();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && canGoBack()) {
            goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void init(){
        initDefaultConfig();
    }

    private void initDefaultConfig(){
        setWebViewClient(new org.ning.easywebview.core.WebViewClient());
        {
            WebSettings webSettings=getSettings();
            webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
            webSettings.setJavaScriptEnabled(true);
            webSettings.setAllowFileAccess(true);
            webSettings.setBuiltInZoomControls(false);
            webSettings.setSupportZoom(false);
            webSettings.setUseWideViewPort(true);
            webSettings.setLoadWithOverviewMode(true);
            webSettings.setLoadsImagesAutomatically(true);
            webSettings.setDomStorageEnabled(true);
            webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            webSettings.setDatabasePath(new Config(getContext()).getDataBasePath());
            // 设置 Application Caches 缓存目录
            webSettings.setAppCachePath(new Config(getContext()).getAppCachePath());
            webSettings.setDatabaseEnabled(true);
            webSettings.setAppCacheEnabled(true);
        }
    }

    @Override
    public WebSettings getSettings() {
        return new org.ning.easywebview.core.WebSettings(super.getSettings());
    }

    @Override
    public void setWebViewClient(WebViewClient client) {
        super.setWebViewClient(client);
    }
}
