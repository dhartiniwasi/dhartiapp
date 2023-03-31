package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2051a;
import java.util.ArrayList;
import p017b5.C1811n;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2129v extends C2137z {

    /* renamed from: b */
    private final ArrayList<C2051a.C2060f> f6293b;

    /* renamed from: c */
    final /* synthetic */ C2071a0 f6294c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2129v(C2071a0 a0Var, ArrayList<C2051a.C2060f> arrayList) {
        super(a0Var, (C1811n) null);
        this.f6294c = a0Var;
        this.f6293b = arrayList;
    }

    /* renamed from: a */
    public final void mo8122a() {
        C2071a0 a0Var = this.f6294c;
        a0Var.f6089a.f6220v.f6165p = C2071a0.m9174y(a0Var);
        ArrayList<C2051a.C2060f> arrayList = this.f6293b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2071a0 a0Var2 = this.f6294c;
            arrayList.get(i).mo6939i(a0Var2.f6103o, a0Var2.f6089a.f6220v.f6165p);
        }
    }
}
