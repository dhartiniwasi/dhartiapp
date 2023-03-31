package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class a13 implements Runnable {

    /* renamed from: a */
    private final WebView f6372a;

    /* renamed from: b */
    final /* synthetic */ b13 f6373b;

    a13(b13 b13) {
        this.f6373b = b13;
        this.f6372a = b13.f7070d;
    }

    public final void run() {
        this.f6372a.destroy();
    }
}
