package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Status;
import p017b5.C1803j;
import p017b5.C1825w;
import p180z4.C6366d;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2078c1<ResultT> extends C1825w {

    /* renamed from: b */
    private final C2089g<C2051a.C2053b, ResultT> f6139b;

    /* renamed from: c */
    private final C9977j<ResultT> f6140c;

    /* renamed from: d */
    private final C1803j f6141d;

    public C2078c1(int i, C2089g<C2051a.C2053b, ResultT> gVar, C9977j<ResultT> jVar, C1803j jVar2) {
        super(i);
        this.f6140c = jVar;
        this.f6139b = gVar;
        this.f6141d = jVar2;
        if (i == 2 && gVar.mo8058c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo8031a(Status status) {
        this.f6140c.mo32545d(this.f6141d.mo6914a(status));
    }

    /* renamed from: b */
    public final void mo8032b(Exception exc) {
        this.f6140c.mo32545d(exc);
    }

    /* renamed from: c */
    public final void mo8033c(C2115o0<?> o0Var) throws DeadObjectException {
        try {
            this.f6139b.mo8057b(o0Var.mo8113t(), this.f6140c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo8031a(C2085e1.m9252e(e2));
        } catch (RuntimeException e3) {
            this.f6140c.mo32545d(e3);
        }
    }

    /* renamed from: d */
    public final void mo8034d(C2102k kVar, boolean z) {
        kVar.mo8082d(this.f6140c, z);
    }

    /* renamed from: f */
    public final boolean mo7000f(C2115o0<?> o0Var) {
        return this.f6139b.mo8058c();
    }

    /* renamed from: g */
    public final C6366d[] mo7001g(C2115o0<?> o0Var) {
        return this.f6139b.mo8060e();
    }
}
