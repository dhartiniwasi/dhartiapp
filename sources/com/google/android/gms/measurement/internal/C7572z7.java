package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C7572z7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7313b8 f33227a;

    /* renamed from: b */
    public final /* synthetic */ int f33228b;

    /* renamed from: c */
    public final /* synthetic */ C7352f3 f33229c;

    /* renamed from: d */
    public final /* synthetic */ Intent f33230d;

    public /* synthetic */ C7572z7(C7313b8 b8Var, int i, C7352f3 f3Var, Intent intent) {
        this.f33227a = b8Var;
        this.f33228b = i;
        this.f33229c = f3Var;
        this.f33230d = intent;
    }

    public final void run() {
        this.f33227a.mo24179c(this.f33228b, this.f33229c, this.f33230d);
    }
}
