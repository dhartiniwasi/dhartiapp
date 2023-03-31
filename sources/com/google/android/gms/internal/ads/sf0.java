package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p060h4.C4541l4;
import p060h4.C4547m4;
import p060h4.C4565p4;
import p060h4.C4569q2;
import p060h4.C4571q4;
import p060h4.C4584t;
import p088l5.C4954a;
import p088l5.C4956b;
import p122q4.C5401c;
import p179z3.C6323b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class sf0 {

    /* renamed from: d */
    private static fl0 f17449d;

    /* renamed from: a */
    private final Context f17450a;

    /* renamed from: b */
    private final C6323b f17451b;

    /* renamed from: c */
    private final C4569q2 f17452c;

    public sf0(Context context, C6323b bVar, C4569q2 q2Var) {
        this.f17450a = context;
        this.f17451b = bVar;
        this.f17452c = q2Var;
    }

    /* renamed from: a */
    public static fl0 m20343a(Context context) {
        fl0 fl0;
        synchronized (sf0.class) {
            if (f17449d == null) {
                f17449d = C4584t.m30035a().mo18133n(context, new nb0());
            }
            fl0 = f17449d;
        }
        return fl0;
    }

    /* renamed from: b */
    public final void mo13993b(C5401c cVar) {
        C4541l4 l4Var;
        fl0 a = m20343a(this.f17450a);
        if (a == null) {
            cVar.mo19282a("Internal Error, query info generator is null.");
            return;
        }
        C4954a o3 = C4956b.m31385o3(this.f17450a);
        C4569q2 q2Var = this.f17452c;
        if (q2Var == null) {
            l4Var = new C4547m4().mo18073a();
        } else {
            l4Var = C4565p4.f24948a.mo18106a(this.f17450a, q2Var);
        }
        try {
            a.mo9624s5(o3, new jl0((String) null, this.f17451b.name(), (C4571q4) null, l4Var), new rf0(this, cVar));
        } catch (RemoteException unused) {
            cVar.mo19282a("Internal Error.");
        }
    }
}
