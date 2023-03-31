package com.startapp;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* renamed from: com.startapp.o5 */
/* compiled from: Sta */
public class C9193o5 {

    /* renamed from: a */
    public boolean f38003a = false;

    /* renamed from: b */
    public Runnable f38004b = null;

    public C9193o5(Context context, Runnable runnable) {
        this.f38004b = runnable;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (!this.f38003a) {
            this.f38003a = true;
            this.f38004b.run();
        }
    }
}
