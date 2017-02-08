package org.ning.easywebview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
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
        if (!isSinglePageMode&&(keyCode == KeyEvent.KEYCODE_BACK) && canGoBack()) {
            goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private final void init(){
        initDefaultConfig();
    }

    /**
     * 是否為單頁面模式
     */
    private boolean isSinglePageMode=false;

    /**
     * 是否為單頁面模式
     */
    public final boolean isSinglePageMode() {
        return isSinglePageMode;
    }

    /**
     * 是否為單頁面模式
     */
    public final void setSinglePageMode(boolean singlePageMode) {
        isSinglePageMode = singlePageMode;
    }


    private final void initDefaultConfig(){
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
    private OnScrollListener onScrollListener;

    @Override
    protected void onScrollChanged(final int l, final int t, final int oldl,
                                   final int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);

        if (onScrollListener != null) {
            onScrollListener.onScroll(l - oldl, t - oldt);
        }
    }

    public final OnScrollListener getOnScrollListener() {
        return onScrollListener;
    }

    public final void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    @Override
    public final void setOnScrollChangeListener(OnScrollChangeListener l) {
        super.setOnScrollChangeListener(l);
    }

    /**
     * Impliment in the activity/fragment/view that you want to listen to the webview
     */
    public static interface OnScrollListener {
        public void onScroll(int dx, int dy);
    }
    @Override
    public final WebSettings getSettings() {
        return new org.ning.easywebview.core.WebSettings(super.getSettings());
    }

    private org.ning.easywebview.core.WebViewClient webViewClient;
    private org.ning.easywebview.core.WebChromeClient webChromeClient;
    @Override
    public final void setWebChromeClient(WebChromeClient client) {
        super.setWebChromeClient(webChromeClient=new org.ning.easywebview.core.WebChromeClient(client));
    }

    public final org.ning.easywebview.core.WebChromeClient getWebChromeClient() {
        return webChromeClient;
    }

    @Override
    public final void setWebViewClient(WebViewClient client) {
        super.setWebViewClient(webViewClient=new org.ning.easywebview.core.WebViewClient(client));
    }

    public final org.ning.easywebview.core.WebViewClient getWebViewClient() {
        return webViewClient;
    }
}
