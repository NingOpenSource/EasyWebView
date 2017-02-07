package org.ning.easywebview.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;

/**
 * Created by yanni on 2017/2/7.
 */
public class WebChromeClient extends android.webkit.WebChromeClient {
    public static class Listener extends android.webkit.WebChromeClient {

    }

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public Listener getListener() {
        return listener;
    }

    private android.webkit.WebChromeClient webChromeClient;

    public WebChromeClient(android.webkit.WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (listener != null) listener.onConsoleMessage(consoleMessage);
        return super.onConsoleMessage(consoleMessage);
    }

    @Override
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (listener != null) listener.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        return
                webChromeClient.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        if (listener != null) listener.onJsAlert(view, url, message, result);
        return
                webChromeClient.onJsAlert(view, url, message, result);
    }

    @Override
    public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {
        if (listener != null) listener.onJsBeforeUnload(view, url, message, result);
        return
                webChromeClient.onJsBeforeUnload(view, url, message, result);
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        if (listener != null) listener.onJsConfirm(view, url, message, result);
        return
                webChromeClient.onJsConfirm(view, url, message, result);
    }

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        if (listener != null) listener.onJsPrompt(view, url, message, defaultValue, result);
        return
                webChromeClient.onJsPrompt(view, url, message, defaultValue, result);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
        if (listener != null) listener.onShowFileChooser(webView, filePathCallback, fileChooserParams);
        return
                webChromeClient.onShowFileChooser(webView, filePathCallback, fileChooserParams);
    }

    @Override
    public void onCloseWindow(WebView window) {
        if (listener != null) listener.onCloseWindow(window);
        webChromeClient.onCloseWindow(window);
    }

    @Override
    public void onGeolocationPermissionsHidePrompt() {
        if (listener != null) listener.onGeolocationPermissionsHidePrompt();
        webChromeClient.onGeolocationPermissionsHidePrompt();
    }

    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        if (listener != null) listener.onGeolocationPermissionsShowPrompt(origin, callback);
        webChromeClient.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override
    public void onHideCustomView() {
        if (listener != null) listener.onHideCustomView();
        webChromeClient.onHideCustomView();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onPermissionRequest(PermissionRequest request) {
        if (listener != null) listener.onPermissionRequest(request);
        webChromeClient.onPermissionRequest(request);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onPermissionRequestCanceled(PermissionRequest request) {
        if (listener != null) listener.onPermissionRequestCanceled(request);
        webChromeClient.onPermissionRequestCanceled(request);
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        if (listener != null) listener.onProgressChanged(view, newProgress);
        webChromeClient.onProgressChanged(view, newProgress);
    }

    @Override
    public void onReceivedIcon(WebView view, Bitmap icon) {
        if (listener != null) listener.onReceivedIcon(view, icon);
        webChromeClient.onReceivedIcon(view, icon);
    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        if (listener != null) listener.onReceivedTitle(view, title);
        webChromeClient.onReceivedTitle(view, title);
    }

    @Override
    public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
        if (listener != null) listener.onReceivedTouchIconUrl(view, url, precomposed);
        webChromeClient.onReceivedTouchIconUrl(view, url, precomposed);
    }

    @Override
    public void onRequestFocus(WebView view) {
        if (listener != null) listener.onRequestFocus(view);
        webChromeClient.onRequestFocus(view);
    }

    @Override
    public void onShowCustomView(View view, CustomViewCallback callback) {
        if (listener != null) listener.onShowCustomView(view, callback);
        webChromeClient.onShowCustomView(view, callback);
    }

    @Override
    public boolean onJsTimeout() {if (listener != null) listener.onJsTimeout();
        return
                webChromeClient.onJsTimeout();
    }

    @Override
    public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) {
        if (listener != null) listener.onShowCustomView(view, requestedOrientation, callback);
        webChromeClient.onShowCustomView(view, requestedOrientation, callback);
    }

    @Override
    public void onConsoleMessage(String message, int lineNumber, String sourceID) {
        if (listener != null) listener.onConsoleMessage(message, lineNumber, sourceID);
        webChromeClient.onConsoleMessage(message, lineNumber, sourceID);
    }

    @Override
    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, WebStorage.QuotaUpdater quotaUpdater) {
        if (listener != null) listener.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
        webChromeClient.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
    }

    @Override
    public void onReachedMaxAppCacheSize(long requiredStorage, long quota, WebStorage.QuotaUpdater quotaUpdater) {
        if (listener != null) listener.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
        webChromeClient.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
    }
}