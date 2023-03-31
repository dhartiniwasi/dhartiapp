package com.startapp;

import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;

/* renamed from: com.startapp.ld */
/* compiled from: Sta */
public class C9120ld implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9139md f37282a;

    /* renamed from: com.startapp.ld$a */
    /* compiled from: Sta */
    public class C9121a implements MessageQueue.IdleHandler {
        public C9121a() {
        }

        public boolean queueIdle() {
            C9139md mdVar = C9120ld.this.f37282a;
            if (mdVar.f37309c != null) {
                return false;
            }
            try {
                WebView webView = new WebView(mdVar.f37307a);
                if (mdVar.f37310d == null) {
                    mdVar.f37310d = webView.getSettings().getUserAgentString();
                }
                mdVar.f37309c = webView;
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public C9120ld(C9139md mdVar) {
        this.f37282a = mdVar;
    }

    public void run() {
        try {
            MessageQueue myQueue = Looper.myQueue();
            if (myQueue != null) {
                myQueue.addIdleHandler(new C9121a());
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }
}
