package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.pg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2735pg implements Callable {

    /* renamed from: a */
    private final C2993wf f15853a;

    /* renamed from: b */
    private final C3063yb f15854b;

    public C2735pg(C2993wf wfVar, C3063yb ybVar) {
        this.f15853a = wfVar;
        this.f15854b = ybVar;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f15853a.mo14911l() != null) {
            this.f15853a.mo14911l().get();
        }
        C2730pc c = this.f15853a.mo14903c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.f15854b) {
                C3063yb ybVar = this.f15854b;
                byte[] b = c.mo9400b();
                ybVar.mo13422k(b, 0, b.length, ex3.m12308a());
            }
            return null;
        } catch (ey3 | NullPointerException unused) {
            return null;
        }
    }
}
