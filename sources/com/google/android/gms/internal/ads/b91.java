package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b91 {

    /* renamed from: a */
    private final kx2 f7160a;

    /* renamed from: b */
    private final vm0 f7161b;

    /* renamed from: c */
    private final ApplicationInfo f7162c;

    /* renamed from: d */
    private final String f7163d;

    /* renamed from: e */
    private final List f7164e;

    /* renamed from: f */
    private final PackageInfo f7165f;

    /* renamed from: g */
    private final v34 f7166g;

    /* renamed from: h */
    private final String f7167h;

    /* renamed from: i */
    private final wj2 f7168i;

    /* renamed from: j */
    private final C4800p1 f7169j;

    public b91(kx2 kx2, vm0 vm0, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, v34 v34, C4800p1 p1Var, String str2, wj2 wj2) {
        this.f7160a = kx2;
        this.f7161b = vm0;
        this.f7162c = applicationInfo;
        this.f7163d = str;
        this.f7164e = list;
        this.f7165f = packageInfo;
        this.f7166g = v34;
        this.f7167h = str2;
        this.f7168i = wj2;
        this.f7169j = p1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ yg0 mo8697a(lf3 lf3) throws Exception {
        return new yg0((Bundle) lf3.get(), this.f7161b, this.f7162c, this.f7163d, this.f7164e, this.f7165f, (String) ((lf3) this.f7166g.mo8155d()).get(), this.f7167h, (xu2) null, (String) null, ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14624m6)).booleanValue() ? this.f7169j.mo18501f0() : false);
    }

    /* renamed from: b */
    public final lf3 mo8698b() {
        kx2 kx2 = this.f7160a;
        return tw2.m21276c(this.f7168i.mo14939a(new Bundle()), ex2.SIGNALS, kx2).mo8577a();
    }

    /* renamed from: c */
    public final lf3 mo8699c() {
        lf3 b = mo8698b();
        return this.f7160a.mo8965a(ex2.REQUEST_PARCEL, b, (lf3) this.f7166g.mo8155d()).mo13884a(new a91(this, b)).mo8577a();
    }
}
