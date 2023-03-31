package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zq0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f21226a;

    /* renamed from: b */
    final /* synthetic */ String f21227b;

    /* renamed from: c */
    final /* synthetic */ int f21228c;

    /* renamed from: d */
    final /* synthetic */ int f21229d;

    /* renamed from: e */
    final /* synthetic */ gr0 f21230e;

    zq0(gr0 gr0, String str, String str2, int i, int i2, boolean z) {
        this.f21230e = gr0;
        this.f21226a = str;
        this.f21227b = str2;
        this.f21228c = i;
        this.f21229d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f21226a);
        hashMap.put("cachedSrc", this.f21227b);
        hashMap.put("bytesLoaded", Integer.toString(this.f21228c));
        hashMap.put("totalBytes", Integer.toString(this.f21229d));
        hashMap.put("cacheReady", "0");
        gr0.m13478g(this.f21230e, "onPrecacheEvent", hashMap);
    }
}
