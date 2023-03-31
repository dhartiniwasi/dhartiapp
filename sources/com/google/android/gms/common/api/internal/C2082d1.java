package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C2079d;
import p180z4.C6366d;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2082d1 extends C2134x0<Boolean> {

    /* renamed from: c */
    public final C2079d.C2080a<?> f6147c;

    public C2082d1(C2079d.C2080a<?> aVar, C9977j<Boolean> jVar) {
        super(4, jVar);
        this.f6147c = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8034d(C2102k kVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo7000f(C2115o0<?> o0Var) {
        if (o0Var.mo8114v().get(this.f6147c) == null) {
            return false;
        }
        throw null;
    }

    /* renamed from: g */
    public final C6366d[] mo7001g(C2115o0<?> o0Var) {
        if (o0Var.mo8114v().get(this.f6147c) == null) {
            return null;
        }
        throw null;
    }

    /* renamed from: h */
    public final void mo8053h(C2115o0<?> o0Var) throws RemoteException {
        if (o0Var.mo8114v().remove(this.f6147c) == null) {
            this.f6300b.mo32546e(Boolean.FALSE);
        } else {
            o0Var.mo8113t();
            throw null;
        }
    }
}
