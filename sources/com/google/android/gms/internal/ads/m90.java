package com.google.android.gms.internal.ads;

import java.util.Map;
import p073j4.C4758d1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class m90 implements e60 {

    /* renamed from: a */
    final /* synthetic */ u80 f13279a;

    /* renamed from: b */
    final /* synthetic */ C4758d1 f13280b;

    /* renamed from: c */
    final /* synthetic */ aa0 f13281c;

    m90(aa0 aa0, C2955ve veVar, u80 u80, C4758d1 d1Var) {
        this.f13281c = aa0;
        this.f13279a = u80;
        this.f13280b = d1Var;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.e60, java.lang.Object] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        ba0 ba0 = (ba0) obj;
        synchronized (this.f13281c.f6499a) {
            pm0.m18666f("JS Engine is requesting an update");
            if (this.f13281c.f6507i == 0) {
                pm0.m18666f("Starting reload.");
                this.f13281c.f6507i = 2;
                this.f13281c.mo8283d((C2955ve) null);
            }
            this.f13279a.mo8703d("/requestReload", this.f13280b.mo18446a());
        }
    }
}
