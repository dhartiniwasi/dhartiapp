package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2734pf implements e43 {

    /* renamed from: a */
    private final g23 f15832a;

    /* renamed from: b */
    private final y23 f15833b;

    /* renamed from: c */
    private final C2288dg f15834c;

    /* renamed from: d */
    private final C2696of f15835d;

    /* renamed from: e */
    private final C3103ze f15836e;

    /* renamed from: f */
    private final C2363fg f15837f;

    C2734pf(g23 g23, y23 y23, C2288dg dgVar, C2696of ofVar, C3103ze zeVar, C2363fg fgVar) {
        this.f15832a = g23;
        this.f15833b = y23;
        this.f15834c = dgVar;
        this.f15835d = ofVar;
        this.f15836e = zeVar;
        this.f15837f = fgVar;
    }

    /* renamed from: b */
    private final Map m18603b() {
        HashMap hashMap = new HashMap();
        C2730pc b = this.f15833b.mo15315b();
        hashMap.put("v", this.f15832a.mo10379b());
        hashMap.put("gms", Boolean.valueOf(this.f15832a.mo10380c()));
        hashMap.put("int", b.mo13213F0());
        hashMap.put("up", Boolean.valueOf(this.f15835d.mo12904a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13268a(View view) {
        this.f15834c.mo9572d(view);
    }

    /* renamed from: d */
    public final Map mo9797d() {
        Map b = m18603b();
        C2730pc a = this.f15833b.mo15314a();
        b.put("gai", Boolean.valueOf(this.f15832a.mo10381d()));
        b.put("did", a.mo13212E0());
        b.put("dst", Integer.valueOf(a.mo13217s0() - 1));
        b.put("doo", Boolean.valueOf(a.mo13214p0()));
        C3103ze zeVar = this.f15836e;
        if (zeVar != null) {
            b.put("nt", Long.valueOf(zeVar.mo15583a()));
        }
        C2363fg fgVar = this.f15837f;
        if (fgVar != null) {
            b.put("vs", Long.valueOf(fgVar.mo10159c()));
            b.put("vf", Long.valueOf(this.f15837f.mo10158b()));
        }
        return b;
    }

    /* renamed from: e */
    public final Map mo9798e() {
        return m18603b();
    }

    public final Map zza() {
        Map b = m18603b();
        b.put("lts", Long.valueOf(this.f15834c.mo9570a()));
        return b;
    }
}
