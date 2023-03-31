package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dr0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8396a;

    /* renamed from: b */
    final /* synthetic */ String f8397b;

    /* renamed from: c */
    final /* synthetic */ long f8398c;

    /* renamed from: d */
    final /* synthetic */ gr0 f8399d;

    dr0(gr0 gr0, String str, String str2, long j) {
        this.f8399d = gr0;
        this.f8396a = str;
        this.f8397b = str2;
        this.f8398c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f8396a);
        hashMap.put("cachedSrc", this.f8397b);
        hashMap.put("totalDuration", Long.toString(this.f8398c));
        gr0.m13478g(this.f8399d, "onPrecacheEvent", hashMap);
    }
}
