package com.google.android.gms.internal.ads;

import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class r63 implements Runnable {

    /* renamed from: a */
    private final C9977j f16854a;

    r63() {
        this.f16854a = null;
    }

    public r63(C9977j jVar) {
        this.f16854a = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8223a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9977j mo13687b() {
        return this.f16854a;
    }

    /* renamed from: c */
    public final void mo13688c(Exception exc) {
        C9977j jVar = this.f16854a;
        if (jVar != null) {
            jVar.mo32545d(exc);
        }
    }

    public final void run() {
        try {
            mo8223a();
        } catch (Exception e) {
            mo13688c(e);
        }
    }
}
