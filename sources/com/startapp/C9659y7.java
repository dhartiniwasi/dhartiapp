package com.startapp;

import android.os.Handler;
import android.webkit.WebView;
import com.startapp.C8971g5;

/* renamed from: com.startapp.y7 */
/* compiled from: Sta */
public class C9659y7 extends C8971g5 {

    /* renamed from: com.startapp.y7$a */
    /* compiled from: Sta */
    public class C9660a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WebView f39445a;

        public C9660a(C9659y7 y7Var, WebView webView) {
            this.f39445a = webView;
        }

        public void run() {
            try {
                this.f39445a.setBackgroundColor(0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo29390a(WebView webView) {
        new Handler().postDelayed(new C9660a(this, webView), 1000);
    }

    /* renamed from: b */
    public void mo29394b(WebView webView) {
        this.f36827C = false;
        webView.setOnTouchListener(new C8971g5.C8976e());
        if (this.f36761h.equals("interstitial")) {
            webView.setBackgroundColor(0);
        }
    }
}
