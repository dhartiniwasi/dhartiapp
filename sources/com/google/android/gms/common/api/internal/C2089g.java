package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2053b;
import p017b5.C1799h;
import p017b5.C1800h0;
import p033d5.C4141r;
import p180z4.C6366d;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C2089g<A extends C2051a.C2053b, ResultT> {

    /* renamed from: a */
    private final C6366d[] f6179a;

    /* renamed from: b */
    private final boolean f6180b;

    /* renamed from: c */
    private final int f6181c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C2090a<A extends C2051a.C2053b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1799h<A, C9977j<ResultT>> f6182a;

        /* renamed from: b */
        private boolean f6183b = true;

        /* renamed from: c */
        private C6366d[] f6184c;

        /* renamed from: d */
        private int f6185d = 0;

        /* synthetic */ C2090a(C1800h0 h0Var) {
        }

        /* renamed from: a */
        public C2089g<A, ResultT> mo8061a() {
            C4141r.m28212b(this.f6182a != null, "execute parameter required");
            return new C2128u0(this, this.f6184c, this.f6183b, this.f6185d);
        }

        /* renamed from: b */
        public C2090a<A, ResultT> mo8062b(C1799h<A, C9977j<ResultT>> hVar) {
            this.f6182a = hVar;
            return this;
        }

        /* renamed from: c */
        public C2090a<A, ResultT> mo8063c(boolean z) {
            this.f6183b = z;
            return this;
        }

        /* renamed from: d */
        public C2090a<A, ResultT> mo8064d(C6366d... dVarArr) {
            this.f6184c = dVarArr;
            return this;
        }

        /* renamed from: e */
        public C2090a<A, ResultT> mo8065e(int i) {
            this.f6185d = i;
            return this;
        }
    }

    protected C2089g(C6366d[] dVarArr, boolean z, int i) {
        this.f6179a = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.f6180b = z2;
        this.f6181c = i;
    }

    /* renamed from: a */
    public static <A extends C2051a.C2053b, ResultT> C2090a<A, ResultT> m9277a() {
        return new C2090a<>((C1800h0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8057b(A a, C9977j<ResultT> jVar) throws RemoteException;

    /* renamed from: c */
    public boolean mo8058c() {
        return this.f6180b;
    }

    /* renamed from: d */
    public final int mo8059d() {
        return this.f6181c;
    }

    /* renamed from: e */
    public final C6366d[] mo8060e() {
        return this.f6179a;
    }
}
