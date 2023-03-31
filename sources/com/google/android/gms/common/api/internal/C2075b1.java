package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2073b;
import p007a5.C0111g;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2075b1<A extends C2073b<? extends C0111g, C2051a.C2053b>> extends C2085e1 {

    /* renamed from: b */
    protected final A f6116b;

    public C2075b1(int i, A a) {
        super(i);
        this.f6116b = (C2073b) C4141r.m28222l(a, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo8031a(Status status) {
        try {
            this.f6116b.mo8030v(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo8032b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f6116b.mo8030v(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo8033c(C2115o0<?> o0Var) throws DeadObjectException {
        try {
            this.f6116b.mo8029t(o0Var.mo8113t());
        } catch (RuntimeException e) {
            mo8032b(e);
        }
    }

    /* renamed from: d */
    public final void mo8034d(C2102k kVar, boolean z) {
        kVar.mo8081c(this.f6116b, z);
    }
}
