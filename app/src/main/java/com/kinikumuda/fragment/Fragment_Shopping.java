package com.kinikumuda.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kinikumuda.serbaserbu.R;

public class Fragment_Shopping extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        View v = inflater.inflate(R.layout.fragment__shopping, container, false);


        WebView webView = (WebView) v.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.warungkita.info/cart/");

        return v;

//        WebView myWebView = myView.findViewById(R.id.webview);
//        myWebView.setWebViewClient(new WebViewClient());
//        myWebView.loadUrl("http://localhost/serbaserbu.id/");
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//
//        return myView;
    }
}