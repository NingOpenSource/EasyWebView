package org.ning.easywebview.core;


import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/**
 * Created by yanni on 2017/2/4.
 */
public class WebViewClient extends android.webkit.WebViewClient {
    private android.webkit.WebViewClient webViewClient;

    /**
     *
     */
    public static class Listener extends android.webkit.WebViewClient{

    }
    public WebViewClient(android.webkit.WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public Listener getListener() {
        return listener;
    }

    /**
     * 在点击请求的是链接是才会调用，重写此方法返回true表明点击网页里面的链接还是在当前的webview里跳转，
     * 不跳到浏览器那边。这个函数我们可以做很多操作，比如我们读取到某些特殊的URL，于是就可以不打开地址，
     * 取消这个操作，进行预先定义的其他操作，这对一个程序是非常必要的。
     *
     * @param view
     * @param url
     * @return
     */
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (listener != null) listener.shouldOverrideUrlLoading(view, url);
        return webViewClient.shouldOverrideUrlLoading(view, url);
    }

    /**
     * (更新历史记录)
     *
     * @param view
     * @param url
     * @param isReload
     */
    @Override
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        if (listener != null) listener.doUpdateVisitedHistory(view, url, isReload);
        webViewClient.doUpdateVisitedHistory(view, url, isReload);
    }

    /**
     * (应用程序重新请求网页数据)
     *
     * @param view
     * @param dontResend
     * @param resend
     */
    @Override
    public void onFormResubmission(WebView view, Message dontResend, Message resend) {
        if (listener != null) listener.onFormResubmission(view, dontResend, resend);
        webViewClient.onFormResubmission(view, dontResend, resend);
    }

    /**
     * 在加载页面资源时会调用，每一个资源（比如图片）的加载都会调用一次。
     *
     * @param view
     * @param url
     */
    @Override
    public void onLoadResource(WebView view, String url) {
        if (listener != null) listener.onLoadResource(view, url);
        webViewClient.onLoadResource(view, url);
    }

    /**
     * 这个事件就是开始载入页面调用的，通常我们可以在这设定一个loading的页面，告诉用户程序在等待网络响应。
     *
     * @param view
     * @param url
     * @param favicon
     */
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        if (listener != null) listener.onPageStarted(view, url, favicon);
        webViewClient.onPageStarted(view, url, favicon);
    }

    /**
     * 在页面加载结束时调用。同样道理，我们知道一个页面载入完成，于是我们可以关闭loading 条，切换程序动作。
     *
     * @param view
     * @param url
     */
    @Override
    public void onPageFinished(WebView view, String url) {
        if (listener != null) listener.onPageFinished(view, url);
        webViewClient.onPageFinished(view, url);
    }

    /**
     * (报告错误信息)
     *
     * @param view
     * @param request
     * @param error
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        if (listener != null) listener.onReceivedError(view, request, error);
        webViewClient.onReceivedError(view, request, error);
    }

    /**
     * 获取返回信息授权请求
     *
     * @param view
     * @param request
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) {
        if (listener != null) listener.onReceivedClientCertRequest(view, request);
        webViewClient.onReceivedClientCertRequest(view, request);
    }

    /**
     * 重写此方法可以让webview处理https请求。
     *
     * @param view
     * @param handler
     * @param error
     */
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        if (listener != null) listener.onReceivedSslError(view, handler, error);
        webViewClient.onReceivedSslError(view, handler, error);
    }

    /**
     * WebView发生改变时调用
     *
     * @param view
     * @param oldScale
     * @param newScale
     */
    @Override
    public void onScaleChanged(WebView view, float oldScale, float newScale) {
        if (listener != null) listener.onScaleChanged(view, oldScale, newScale);
        webViewClient.onScaleChanged(view, oldScale, newScale);
    }

    /**
     * Key事件未被加载时调用
     *
     * @param view
     * @param event
     */
    @Override
    public void onUnhandledKeyEvent(WebView view, KeyEvent event) {
        if (listener != null) listener.onUnhandledKeyEvent(view, event);
        webViewClient.onUnhandledKeyEvent(view, event);
    }

    /**
     * 重写此方法才能够处理在浏览器中的按键事件。
     *
     * @param view
     * @param event
     * @return
     */
    @Override
    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        if (listener != null) listener.shouldOverrideKeyEvent(view, event);
        return webViewClient.shouldOverrideKeyEvent(view, event);
    }
}