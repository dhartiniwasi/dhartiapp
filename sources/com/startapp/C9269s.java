package com.startapp;

import android.content.DialogInterface;
import android.webkit.WebView;

/* renamed from: com.startapp.s */
/* compiled from: Sta */
public class C9269s implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f38175a;

    public C9269s(WebView webView) {
        this.f38175a = webView;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f38175a.stopLoading();
    }
}
