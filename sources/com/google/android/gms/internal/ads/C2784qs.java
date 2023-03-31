package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.qs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C2784qs implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C2821rs f16507a;

    /* renamed from: b */
    public final /* synthetic */ C2524js f16508b;

    /* renamed from: c */
    public final /* synthetic */ WebView f16509c;

    /* renamed from: d */
    public final /* synthetic */ boolean f16510d;

    public /* synthetic */ C2784qs(C2821rs rsVar, C2524js jsVar, WebView webView, boolean z) {
        this.f16507a = rsVar;
        this.f16508b = jsVar;
        this.f16509c = webView;
        this.f16510d = z;
    }

    public final void onReceiveValue(Object obj) {
        C2821rs rsVar = this.f16507a;
        C2524js jsVar = this.f16508b;
        WebView webView = this.f16509c;
        boolean z = this.f16510d;
        rsVar.f17088e.mo14371d(jsVar, webView, (String) obj, z);
    }
}
