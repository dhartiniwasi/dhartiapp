package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wj2 {

    /* renamed from: a */
    private final Context f19653a;

    /* renamed from: b */
    private final Set f19654b;

    /* renamed from: c */
    private final Executor f19655c;

    /* renamed from: d */
    private final yy2 f19656d;

    /* renamed from: e */
    private final gv1 f19657e;

    public wj2(Context context, Executor executor, Set set, yy2 yy2, gv1 gv1) {
        this.f19653a = context;
        this.f19655c = executor;
        this.f19654b = set;
        this.f19656d = yy2;
        this.f19657e = gv1;
    }

    /* renamed from: a */
    public final lf3 mo14939a(Object obj) {
        ny2 a = my2.m16825a(this.f19653a, 8);
        a.mo11828T();
        ArrayList arrayList = new ArrayList(this.f19654b.size());
        for (tj2 tj2 : this.f19654b) {
            lf3 d = tj2.mo8340d();
            d.mo10135j(new uj2(this, tj2), dn0.f8330f);
            arrayList.add(d);
        }
        lf3 a2 = cf3.m10905c(arrayList).mo8777a(new vj2(arrayList, obj), this.f19655c);
        if (az2.m10140a()) {
            xy2.m23609a(a2, this.f19656d, a);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14940b(tj2 tj2) {
        long b = C4409t.m29310b().mo18371b() - C4409t.m29310b().mo18371b();
        if (((Boolean) h10.f10147a.mo13438e()).booleanValue()) {
            String c = r83.m19614c(tj2.getClass().getCanonicalName());
            C4794n1.m30693k("Signal runtime (ms) : " + c + " = " + b);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14384O1)).booleanValue()) {
            fv1 a = this.f19657e.mo10653a();
            a.mo10303b("action", "lat_ms");
            a.mo10303b("lat_grp", "sig_lat_grp");
            a.mo10303b("lat_id", String.valueOf(tj2.zza()));
            a.mo10303b("clat_ms", String.valueOf(b));
            a.mo10309h();
        }
    }
}
