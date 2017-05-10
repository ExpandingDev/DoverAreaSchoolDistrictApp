package com.example.emailey.doverareaschooldistrictapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by EMailey on 5/10/2017.
 */

public class MenuFragment extends Fragment  {
    public WebView fDistrictHomeView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View menu = inflater.inflate(R.layout.menu_fragment, container, false);
        fDistrictHomeView = (WebView) menu.findViewById(R.id.fdistrictpagewebview);
        fDistrictHomeView.loadUrl("http://www.doversd.org/");

        //Enable Javascript
        WebSettings webSettings = fDistrictHomeView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return menu;

    }}