package com.example.parthpatel.textrecognizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSearch extends AppCompatActivity {
    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_search);

        Bundle bd = getIntent().getExtras();
        String url = bd.getString("url");

        mywebview = findViewById(R.id.Myweb);
        WebSettings webSettings =mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://www.google.com/search?q="+url);
        mywebview.setWebViewClient(new WebViewClient());
    }
}
