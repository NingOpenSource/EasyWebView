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

import java.util.ArrayList;

/**
 * Created by yanni on 2017/2/7.
 */
public class WebChromeClient extends android.webkit.WebChromeClient {
    public static class Listener extends android.webkit.WebChromeClient {

    }

    private android.webkit.WebChromeClient webChromeClient;
    private ArrayList<Listener> listeners=new ArrayList<>();

    public ArrayList<Listener> getListeners() {
        return listeners;
    }

    public WebChromeClient(android.webkit.WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        for(Listener listener:listeners) listener.onConsoleMessage(consoleMessage);
        return super.onConsoleMessage(consoleMessage);
    }

    @Override
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        for(Listener listener:listeners) listener.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        return
                webChromeClient.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        for(Listener listener:listeners) listener.onJsAlert(view, url, message, result);
        return
                webChromeClient.onJsAlert(view, url, message, result);
    }

    @Override
    public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {
        for(Listener listener:listeners) listener.onJsBeforeUnload(view, url, message, result);
        return
                webChromeClient.onJsBeforeUnload(view, url, message, result);
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        for(Listener listener:listeners) listener.onJsConfirm(view, url, message, result);
        return
                webChromeClient.onJsConfirm(view, url, message, result);
    }

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        for(Listener listener:listeners) listener.onJsPrompt(view, url, message, defaultValue, result);
        return
                webChromeClient.onJsPrompt(view, url, message, defaultValue, result);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
        for(Listener listener:listeners) listener.onShowFileChooser(webView, filePathCallback, fileChooserParams);
        return
                webChromeClient.onShowFileChooser(webView, filePathCallback, fileChooserParams);
    }

    @Override
    public void onCloseWindow(WebView window) {
        for(Listener listener:listeners) listener.onCloseWindow(window);
        webChromeClient.onCloseWindow(window);
    }

    @Override
    public void onGeolocationPermissionsHidePrompt() {
        for(Listener listener:listeners) listener.onGeolocationPermissionsHidePrompt();
        webChromeClient.onGeolocationPermissionsHidePrompt();
    }

    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        for(Listener listener:listeners) listener.onGeolocationPermissionsShowPrompt(origin, callback);
        webChromeClient.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override
    public void onHideCustomView() {
        for(Listener listener:listeners) listener.onHideCustomView();
        webChromeClient.onHideCustomView();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onPermissionRequest(PermissionRequest request) {
        for(Listener listener:listeners) listener.onPermissionRequest(request);
        webChromeClient.onPermissionRequest(request);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onPermissionRequestCanceled(PermissionRequest request) {
        for(Listener listener:listeners) listener.onPermissionRequestCanceled(request);
        webChromeClient.onPermissionRequestCanceled(request);
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        for(Listener listener:listeners) listener.onProgressChanged(view, newProgress);
        webChromeClient.onProgressChanged(view, newProgress);
    }

    @Override
    public void onReceivedIcon(WebView view, Bitmap icon) {
        for(Listener listener:listeners) listener.onReceivedIcon(view, icon);
        webChromeClient.onReceivedIcon(view, icon);
    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        for(Listener listener:listeners) listener.onReceivedTitle(view, title);
        webChromeClient.onReceivedTitle(view, title);
    }

    @Override
    public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
        for(Listener listener:listeners) listener.onReceivedTouchIconUrl(view, url, precomposed);
        webChromeClient.onReceivedTouchIconUrl(view, url, precomposed);
    }

    @Override
    public void onRequestFocus(WebView view) {
        for(Listener listener:listeners) listener.onRequestFocus(view);
        webChromeClient.onRequestFocus(view);
    }

    @Override
    public void onShowCustomView(View view, CustomViewCallback callback) {
        for(Listener listener:listeners) listener.onShowCustomView(view, callback);
        webChromeClient.onShowCustomView(view, callback);
    }

    @Override
    public boolean onJsTimeout() {for(Listener listener:listeners) listener.onJsTimeout();
        return
                webChromeClient.onJsTimeout();
    }

    @Override
    public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) {
        for(Listener listener:listeners) listener.onShowCustomView(view, requestedOrientation, callback);
        webChromeClient.onShowCustomView(view, requestedOrientation, callback);
    }

    @Override
    public void onConsoleMessage(String message, int lineNumber, String sourceID) {
        for(Listener listener:listeners) listener.onConsoleMessage(message, lineNumber, sourceID);
        webChromeClient.onConsoleMessage(message, lineNumber, sourceID);
    }

    @Override
    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, WebStorage.QuotaUpdater quotaUpdater) {
        for(Listener listener:listeners) listener.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
        webChromeClient.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
    }

    @Override
    public void onReachedMaxAppCacheSize(long requiredStorage, long quota, WebStorage.QuotaUpdater quotaUpdater) {
        for(Listener listener:listeners) listener.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
        webChromeClient.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
    }
}