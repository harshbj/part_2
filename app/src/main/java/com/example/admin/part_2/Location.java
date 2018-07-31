package com.example.admin.part_2;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Location extends AppCompatActivity {

    WebView location;
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
final String url = "https://www.google.co.in/maps/place/Vidyavardhini's+College+of+Engineering+and+Technology/@19.3838696,72.8265449,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7aec0a4b41bef:0xbd1a4ca919d6a613!8m2!3d19.3838696!4d72.8287336";


        location = (WebView)findViewById(R.id.location);
        cardView = (CardView)findViewById(R.id.locationcard);
        location.setWebViewClient(new locationload());
        location.getSettings().setJavaScriptEnabled(true);
        location.getSettings().setDomStorageEnabled(true);
        location.setOverScrollMode(location.OVER_SCROLL_NEVER);
        location.loadUrl(url);
        setTitle("Location");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public class locationload extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            cardView.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            cardView.setVisibility(View.GONE);
        }


    }

    @Override
    public boolean onNavigateUp() {
        finish();
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && location.canGoBack()) {
            location.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }




}
