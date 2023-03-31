package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4527j2;
import p060h4.C4571q4;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a51 extends r31 {

    /* renamed from: i */
    private final h40 f6413i;

    /* renamed from: j */
    private final Runnable f6414j;

    /* renamed from: k */
    private final Executor f6415k;

    public a51(u51 u51, h40 h40, Runnable runnable, Executor executor) {
        super(u51);
        this.f6413i = h40;
        this.f6414j = runnable;
        this.f6415k = executor;
    }

    /* renamed from: o */
    static /* synthetic */ void m9581o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo8205b() {
        this.f6415k.execute(new z41(this, new y41(new AtomicReference(this.f6414j))));
    }

    /* renamed from: h */
    public final int mo8206h() {
        return 0;
    }

    /* renamed from: i */
    public final View mo8207i() {
        return null;
    }

    /* renamed from: j */
    public final C4527j2 mo8208j() {
        return null;
    }

    /* renamed from: k */
    public final js2 mo8209k() {
        return null;
    }

    /* renamed from: l */
    public final js2 mo8210l() {
        return null;
    }

    /* renamed from: m */
    public final void mo8211m() {
    }

    /* renamed from: n */
    public final void mo8212n(ViewGroup viewGroup, C4571q4 q4Var) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo8213p(Runnable runnable) {
        try {
            if (!this.f6413i.mo10069p0(C4956b.m31385o3(runnable))) {
                m9581o(((y41) runnable).f20464a);
            }
        } catch (RemoteException unused) {
            m9581o(((y41) runnable).f20464a);
        }
    }
}
