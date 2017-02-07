package org.ning.easywebview.core;


import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by yanni on 2017/2/4.
 */

public class WebSettings extends android.webkit.WebSettings {
    private android.webkit.WebSettings defaultWebSettings;
    public WebSettings(android.webkit.WebSettings defaultWebSettings) {
        this.defaultWebSettings = defaultWebSettings;
    }

    @Override
    public void setSupportZoom(boolean b) {
        defaultWebSettings.setSupportZoom(b);
    }

    @Override
    public boolean supportZoom() {
        return defaultWebSettings.supportZoom();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void setMediaPlaybackRequiresUserGesture(boolean b) {
        defaultWebSettings.setMediaPlaybackRequiresUserGesture(b);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public boolean getMediaPlaybackRequiresUserGesture() {
        return defaultWebSettings.getMediaPlaybackRequiresUserGesture();
    }

    @Override
    public void setBuiltInZoomControls(boolean b) {
        defaultWebSettings.setBuiltInZoomControls(b);
    }

    @Override
    public boolean getBuiltInZoomControls() {
        return defaultWebSettings.getBuiltInZoomControls();
    }

    @Override
    public void setDisplayZoomControls(boolean b) {
        defaultWebSettings.setDisplayZoomControls(b);
    }

    @Override
    public boolean getDisplayZoomControls() {
        return defaultWebSettings.getDisplayZoomControls();
    }

    @Override
    public void setAllowFileAccess(boolean b) {
        defaultWebSettings.setAllowFileAccess(b);
    }

    @Override
    public boolean getAllowFileAccess() {
        return defaultWebSettings.getAllowFileAccess();
    }

    @Override
    public void setAllowContentAccess(boolean b) {
        defaultWebSettings.setAllowContentAccess(b);
    }

    @Override
    public boolean getAllowContentAccess() {
        return defaultWebSettings.getAllowContentAccess();
    }

    @Override
    public void setLoadWithOverviewMode(boolean b) {
        defaultWebSettings.setLoadWithOverviewMode(b);
    }

    @Override
    public boolean getLoadWithOverviewMode() {
        return defaultWebSettings.getLoadWithOverviewMode();
    }

    @Override
    public void setEnableSmoothTransition(boolean b) {
        defaultWebSettings.setEnableSmoothTransition(b);
    }

    @Override
    public boolean enableSmoothTransition() {
        return defaultWebSettings.enableSmoothTransition();
    }

    @Override
    public void setSaveFormData(boolean b) {
        defaultWebSettings.setSaveFormData(b);
    }

    @Override
    public boolean getSaveFormData() {
        return defaultWebSettings.getSaveFormData();
    }

    @Override
    public void setSavePassword(boolean b) {
        defaultWebSettings.setSavePassword(b);
    }

    @Override
    public boolean getSavePassword() {
        return defaultWebSettings.getSavePassword();
    }

    @Override
    public void setTextZoom(int i) {
        defaultWebSettings.setTextZoom(i);
    }

    @Override
    public int getTextZoom() {
        return defaultWebSettings.getTextZoom();
    }

    @Override
    public void setDefaultZoom(ZoomDensity zoomDensity) {
        defaultWebSettings.setDefaultZoom(zoomDensity);
    }

    @Override
    public ZoomDensity getDefaultZoom() {
        return defaultWebSettings.getDefaultZoom();
    }

    @Override
    public void setLightTouchEnabled(boolean b) {
        defaultWebSettings.setLightTouchEnabled(b);
    }

    @Override
    public boolean getLightTouchEnabled() {
        return defaultWebSettings.getLightTouchEnabled();
    }

    @Override
    public void setUseWideViewPort(boolean b) {
        defaultWebSettings.setLightTouchEnabled(b);
    }

    @Override
    public boolean getUseWideViewPort() {
        return defaultWebSettings.getUseWideViewPort();
    }

    @Override
    public void setSupportMultipleWindows(boolean b) {
        defaultWebSettings.setSupportMultipleWindows(b);
    }

    @Override
    public boolean supportMultipleWindows() {
        return defaultWebSettings.supportMultipleWindows();
    }

    @Override
    public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
        defaultWebSettings.setLayoutAlgorithm(layoutAlgorithm);
    }

    @Override
    public LayoutAlgorithm getLayoutAlgorithm() {
        return defaultWebSettings.getLayoutAlgorithm();
    }

    @Override
    public void setStandardFontFamily(String s) {
        defaultWebSettings.setStandardFontFamily(s);
    }

    @Override
    public String getStandardFontFamily() {
        return defaultWebSettings.getStandardFontFamily();
    }

    @Override
    public void setFixedFontFamily(String s) {
        defaultWebSettings.setFixedFontFamily(s);
    }

    @Override
    public String getFixedFontFamily() {
        return defaultWebSettings.getFixedFontFamily();
    }

    @Override
    public void setSansSerifFontFamily(String s) {
        defaultWebSettings.setSansSerifFontFamily(s);
    }

    @Override
    public String getSansSerifFontFamily() {
        return defaultWebSettings.getSansSerifFontFamily();
    }

    @Override
    public void setSerifFontFamily(String s) {
        defaultWebSettings.setSerifFontFamily(s);
    }

    @Override
    public String getSerifFontFamily() {
        return defaultWebSettings.getSerifFontFamily();
    }

    @Override
    public void setCursiveFontFamily(String s) {
        defaultWebSettings.setCursiveFontFamily(s);
    }

    @Override
    public String getCursiveFontFamily() {
        return defaultWebSettings.getCursiveFontFamily();
    }

    @Override
    public void setFantasyFontFamily(String s) {
        defaultWebSettings.setFantasyFontFamily(s);
    }

    @Override
    public String getFantasyFontFamily() {
        return defaultWebSettings.getFantasyFontFamily();
    }

    @Override
    public void setMinimumFontSize(int i) {
        defaultWebSettings.setMinimumFontSize(i);
    }

    @Override
    public int getMinimumFontSize() {
        return defaultWebSettings.getMinimumFontSize();
    }

    @Override
    public void setMinimumLogicalFontSize(int i) {
        defaultWebSettings.setMinimumLogicalFontSize(i);
    }

    @Override
    public int getMinimumLogicalFontSize() {
        return defaultWebSettings.getMinimumLogicalFontSize();
    }

    @Override
    public void setDefaultFontSize(int i) {
        defaultWebSettings.setDefaultFontSize(i);
    }

    @Override
    public int getDefaultFontSize() {
        return defaultWebSettings.getDefaultFontSize();
    }

    @Override
    public void setDefaultFixedFontSize(int i) {
        defaultWebSettings.setDefaultFixedFontSize(i);
    }

    @Override
    public int getDefaultFixedFontSize() {
        return defaultWebSettings.getDefaultFixedFontSize();
    }

    @Override
    public void setLoadsImagesAutomatically(boolean b) {
        defaultWebSettings.setLoadsImagesAutomatically(b);
    }

    @Override
    public boolean getLoadsImagesAutomatically() {
        return defaultWebSettings.getLoadsImagesAutomatically();
    }

    @Override
    public void setBlockNetworkImage(boolean b) {
        defaultWebSettings.setBlockNetworkImage(b);
    }

    @Override
    public boolean getBlockNetworkImage() {
        return defaultWebSettings.getBlockNetworkImage();
    }

    @Override
    public void setBlockNetworkLoads(boolean b) {
        defaultWebSettings.setBlockNetworkLoads(b);
    }

    @Override
    public boolean getBlockNetworkLoads() {
        return defaultWebSettings.getBlockNetworkLoads();
    }

    @Override
    public void setJavaScriptEnabled(boolean b) {
        defaultWebSettings.setJavaScriptEnabled(b);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void setAllowUniversalAccessFromFileURLs(boolean b) {
        defaultWebSettings.setAllowUniversalAccessFromFileURLs(b);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void setAllowFileAccessFromFileURLs(boolean b) {
        defaultWebSettings.setAllowFileAccessFromFileURLs(b);
    }

    @Override
    public void setPluginState(PluginState pluginState) {
        defaultWebSettings.setPluginState(pluginState);
    }

    @Override
    public void setDatabasePath(String s) {
        defaultWebSettings.setDatabasePath(s);
    }

    @Override
    public void setGeolocationDatabasePath(String s) {
        defaultWebSettings.setGeolocationDatabasePath(s);
    }

    @Override
    public void setAppCacheEnabled(boolean b) {
        defaultWebSettings.setAppCacheEnabled(b);
    }

    @Override
    public void setAppCachePath(String s) {
        defaultWebSettings.setAppCachePath(s);
    }

    @Override
    public void setAppCacheMaxSize(long l) {
        defaultWebSettings.setAppCacheMaxSize(l);
    }

    @Override
    public void setDatabaseEnabled(boolean b) {
        defaultWebSettings.setDatabaseEnabled(b);
    }

    @Override
    public void setDomStorageEnabled(boolean b) {
        defaultWebSettings.setDomStorageEnabled(b);
    }

    @Override
    public boolean getDomStorageEnabled() {
        return defaultWebSettings.getDomStorageEnabled();
    }

    @Override
    public String getDatabasePath() {
        return defaultWebSettings.getDatabasePath();
    }

    @Override
    public boolean getDatabaseEnabled() {
        return defaultWebSettings.getDatabaseEnabled();
    }

    @Override
    public void setGeolocationEnabled(boolean b) {
        defaultWebSettings.setGeolocationEnabled(b);
    }

    @Override
    public boolean getJavaScriptEnabled() {
        return defaultWebSettings.getJavaScriptEnabled();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean getAllowUniversalAccessFromFileURLs() {
        return defaultWebSettings.getAllowUniversalAccessFromFileURLs();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean getAllowFileAccessFromFileURLs() {
        return defaultWebSettings.getAllowFileAccessFromFileURLs();
    }

    @Override
    public PluginState getPluginState() {
        return defaultWebSettings.getPluginState();
    }

    @Override
    public void setJavaScriptCanOpenWindowsAutomatically(boolean b) {
        defaultWebSettings.setJavaScriptCanOpenWindowsAutomatically(b);
    }

    @Override
    public boolean getJavaScriptCanOpenWindowsAutomatically() {
        return defaultWebSettings.getJavaScriptCanOpenWindowsAutomatically();
    }

    @Override
    public void setDefaultTextEncodingName(String s) {
        defaultWebSettings.setDefaultTextEncodingName(s);
    }

    @Override
    public String getDefaultTextEncodingName() {
        return defaultWebSettings.getDefaultTextEncodingName();
    }

    @Override
    public void setUserAgentString(String s) {
        defaultWebSettings.setUserAgentString(s);
    }

    @Override
    public String getUserAgentString() {
        return defaultWebSettings.getUserAgentString();
    }

    @Override
    public void setNeedInitialFocus(boolean b) {
        defaultWebSettings.setNeedInitialFocus(b);
    }

    @Override
    public void setRenderPriority(RenderPriority renderPriority) {
        defaultWebSettings.setRenderPriority(renderPriority);
    }

    @Override
    public void setCacheMode(int i) {
        defaultWebSettings.setCacheMode(i);
    }

    @Override
    public int getCacheMode() {
        return defaultWebSettings.getCacheMode();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void setMixedContentMode(int i) {
        defaultWebSettings.setMixedContentMode(i);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public int getMixedContentMode() {
        return defaultWebSettings.getMixedContentMode();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void setOffscreenPreRaster(boolean b) {
        defaultWebSettings.setOffscreenPreRaster(b);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean getOffscreenPreRaster() {
        return defaultWebSettings.getOffscreenPreRaster();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void setDisabledActionModeMenuItems(int i) {
        defaultWebSettings.setDisabledActionModeMenuItems(i);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public int getDisabledActionModeMenuItems() {
        return defaultWebSettings.getDisabledActionModeMenuItems();
    }
}
