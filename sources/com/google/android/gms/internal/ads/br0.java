package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class br0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7430a;

    /* renamed from: b */
    final /* synthetic */ String f7431b;

    /* renamed from: c */
    final /* synthetic */ int f7432c;

    /* renamed from: d */
    final /* synthetic */ int f7433d;

    /* renamed from: e */
    final /* synthetic */ long f7434e;

    /* renamed from: f */
    final /* synthetic */ long f7435f;

    /* renamed from: g */
    final /* synthetic */ boolean f7436g;

    /* renamed from: h */
    final /* synthetic */ int f7437h;

    /* renamed from: i */
    final /* synthetic */ int f7438i;

    /* renamed from: r */
    final /* synthetic */ gr0 f7439r;

    br0(gr0 gr0, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f7439r = gr0;
        this.f7430a = str;
        this.f7431b = str2;
        this.f7432c = i;
        this.f7433d = i2;
        this.f7434e = j;
        this.f7435f = j2;
        this.f7436g = z;
        this.f7437h = i3;
        this.f7438i = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f7430a);
        hashMap.put("cachedSrc", this.f7431b);
        hashMap.put("bytesLoaded", Integer.toString(this.f7432c));
        hashMap.put("totalBytes", Integer.toString(this.f7433d));
        hashMap.put("bufferedDuration", Long.toString(this.f7434e));
        hashMap.put("totalDuration", Long.toString(this.f7435f));
        hashMap.put("cacheReady", true != this.f7436g ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f7437h));
        hashMap.put("playerPreparedCount", Integer.toString(this.f7438i));
        gr0.m13478g(this.f7439r, "onPrecacheEvent", hashMap);
    }
}
