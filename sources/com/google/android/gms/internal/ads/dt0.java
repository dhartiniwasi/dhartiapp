package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import p053g4.C4390a;
import p053g4.C4401l;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class dt0 implements s83 {

    /* renamed from: a */
    public final /* synthetic */ Context f8406a;

    /* renamed from: b */
    public final /* synthetic */ mu0 f8407b;

    /* renamed from: c */
    public final /* synthetic */ String f8408c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8409d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8410e;

    /* renamed from: f */
    public final /* synthetic */ C2955ve f8411f;

    /* renamed from: g */
    public final /* synthetic */ n00 f8412g;

    /* renamed from: h */
    public final /* synthetic */ vm0 f8413h;

    /* renamed from: i */
    public final /* synthetic */ C4401l f8414i;

    /* renamed from: r */
    public final /* synthetic */ C4390a f8415r;

    /* renamed from: s */
    public final /* synthetic */ C2971vu f8416s;

    /* renamed from: t */
    public final /* synthetic */ is2 f8417t;

    /* renamed from: u */
    public final /* synthetic */ ls2 f8418u;

    public /* synthetic */ dt0(Context context, mu0 mu0, String str, boolean z, boolean z2, C2955ve veVar, n00 n00, vm0 vm0, c00 c00, C4401l lVar, C4390a aVar, C2971vu vuVar, is2 is2, ls2 ls2) {
        this.f8406a = context;
        this.f8407b = mu0;
        this.f8408c = str;
        this.f8409d = z;
        this.f8410e = z2;
        this.f8411f = veVar;
        this.f8412g = n00;
        this.f8413h = vm0;
        this.f8414i = lVar;
        this.f8415r = aVar;
        this.f8416s = vuVar;
        this.f8417t = is2;
        this.f8418u = ls2;
    }

    public final Object zza() {
        Context context = this.f8406a;
        mu0 mu0 = this.f8407b;
        String str = this.f8408c;
        boolean z = this.f8409d;
        boolean z2 = this.f8410e;
        C2955ve veVar = this.f8411f;
        n00 n00 = this.f8412g;
        vm0 vm0 = this.f8413h;
        C4401l lVar = this.f8414i;
        C4390a aVar = this.f8415r;
        C2971vu vuVar = this.f8416s;
        is2 is2 = this.f8417t;
        ls2 ls2 = this.f8418u;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = pt0.f15986m0;
            lt0 lt0 = new lt0(new pt0(new lu0(context), mu0, str, z, z2, veVar, n00, vm0, (c00) null, lVar, aVar, vuVar, is2, ls2));
            lt0.setWebViewClient(C4409t.m29327s().mo18422d(lt0, vuVar, z2));
            lt0.setWebChromeClient(new us0(lt0));
            return lt0;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
