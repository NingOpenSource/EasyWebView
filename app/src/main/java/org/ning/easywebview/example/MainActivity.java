package org.ning.easywebview.example;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebViewClient;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.single.EmptyPermissionListener;

import org.ning.easywebview.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        init();

    }
    private void init(){
//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
//                view.loadUrl(url);
//                return false;
//            }
//        });
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
                return true;
            }
        });
        Dexter.withActivity(this).withPermission(Manifest.permission.INTERNET).withListener(new EmptyPermissionListener(){
            @Override
            public void onPermissionDenied(PermissionDeniedResponse response) {
                super.onPermissionDenied(response);
                init();
            }

            @Override
            public void onPermissionGranted(PermissionGrantedResponse response) {
                super.onPermissionGranted(response);
//                webView.loadUrl("http://varietyshop.oschina.io/example/projects/videos/");
                webView.loadUrl("http://192.168.0.220/appapi/home/index.html");
            }
        }).check();
    }

}
