package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cr0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7877a;

    /* renamed from: b */
    final /* synthetic */ String f7878b;

    /* renamed from: c */
    final /* synthetic */ int f7879c;

    /* renamed from: d */
    final /* synthetic */ gr0 f7880d;

    cr0(gr0 gr0, String str, String str2, int i) {
        this.f7880d = gr0;
        this.f7877a = str;
        this.f7878b = str2;
        this.f7879c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f7877a);
        hashMap.put("cachedSrc", this.f7878b);
        hashMap.put("totalBytes", Integer.toString(this.f7879c));
        gr0.m13478g(this.f7880d, "onPrecacheEvent", hashMap);
    }
}
