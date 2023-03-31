package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p016b4.C1781a;
import p060h4.C4565p4;
import p060h4.C4567q0;
import p060h4.C4569q2;
import p060h4.C4571q4;
import p060h4.C4584t;
import p060h4.C4607w4;

/* renamed from: com.google.android.gms.internal.ads.wt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C3007wt {

    /* renamed from: a */
    private C4567q0 f19770a;

    /* renamed from: b */
    private final Context f19771b;

    /* renamed from: c */
    private final String f19772c;

    /* renamed from: d */
    private final C4569q2 f19773d;

    /* renamed from: e */
    private final int f19774e;

    /* renamed from: f */
    private final C1781a.C1782a f19775f;

    /* renamed from: g */
    private final nb0 f19776g = new nb0();

    /* renamed from: h */
    private final C4565p4 f19777h;

    public C3007wt(Context context, String str, C4569q2 q2Var, int i, C1781a.C1782a aVar) {
        this.f19771b = context;
        this.f19772c = str;
        this.f19773d = q2Var;
        this.f19774e = i;
        this.f19775f = aVar;
        this.f19777h = C4565p4.f24948a;
    }

    /* renamed from: a */
    public final void mo14991a() {
        try {
            this.f19770a = C4584t.m30035a().mo18127d(this.f19771b, C4571q4.m29982J1(), this.f19772c, this.f19776g);
            C4607w4 w4Var = new C4607w4(this.f19774e);
            C4567q0 q0Var = this.f19770a;
            if (q0Var != null) {
                q0Var.mo10883y5(w4Var);
                this.f19770a.mo10882y3(new C2525jt(this.f19775f, this.f19772c));
                this.f19770a.mo10860Z2(this.f19777h.mo18106a(this.f19771b, this.f19773d));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
