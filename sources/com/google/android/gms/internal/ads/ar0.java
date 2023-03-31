package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ar0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6734a;

    /* renamed from: b */
    final /* synthetic */ String f6735b;

    /* renamed from: c */
    final /* synthetic */ long f6736c;

    /* renamed from: d */
    final /* synthetic */ long f6737d;

    /* renamed from: e */
    final /* synthetic */ long f6738e;

    /* renamed from: f */
    final /* synthetic */ long f6739f;

    /* renamed from: g */
    final /* synthetic */ long f6740g;

    /* renamed from: h */
    final /* synthetic */ boolean f6741h;

    /* renamed from: i */
    final /* synthetic */ int f6742i;

    /* renamed from: r */
    final /* synthetic */ int f6743r;

    /* renamed from: s */
    final /* synthetic */ gr0 f6744s;

    ar0(gr0 gr0, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f6744s = gr0;
        this.f6734a = str;
        this.f6735b = str2;
        this.f6736c = j;
        this.f6737d = j2;
        this.f6738e = j3;
        this.f6739f = j4;
        this.f6740g = j5;
        this.f6741h = z;
        this.f6742i = i;
        this.f6743r = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f6734a);
        hashMap.put("cachedSrc", this.f6735b);
        hashMap.put("bufferedDuration", Long.toString(this.f6736c));
        hashMap.put("totalDuration", Long.toString(this.f6737d));
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f6738e));
            hashMap.put("qoeCachedBytes", Long.toString(this.f6739f));
            hashMap.put("totalBytes", Long.toString(this.f6740g));
            hashMap.put("reportTime", Long.toString(C4409t.m29310b().mo18370a()));
        }
        hashMap.put("cacheReady", true != this.f6741h ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f6742i));
        hashMap.put("playerPreparedCount", Integer.toString(this.f6743r));
        gr0.m13478g(this.f6744s, "onPrecacheEvent", hashMap);
    }
}
