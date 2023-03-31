package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p033d5.C4141r;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2101j1 implements Runnable {

    /* renamed from: a */
    private final C2095h1 f6227a;

    /* renamed from: b */
    final /* synthetic */ C2104k1 f6228b;

    C2101j1(C2104k1 k1Var, C2095h1 h1Var) {
        this.f6228b = k1Var;
        this.f6227a = h1Var;
    }

    public final void run() {
        if (this.f6228b.f6232b) {
            C6362b b = this.f6227a.mo8074b();
            if (b.mo21754L1()) {
                C2104k1 k1Var = this.f6228b;
                k1Var.f6083a.startActivityForResult(GoogleApiActivity.m9047a(k1Var.mo8001b(), (PendingIntent) C4141r.m28221k(b.mo21753K1()), this.f6227a.mo8073a(), false), 1);
                return;
            }
            C2104k1 k1Var2 = this.f6228b;
            if (k1Var2.f6235e.mo21773d(k1Var2.mo8001b(), b.mo21751I1(), (String) null) != null) {
                C2104k1 k1Var3 = this.f6228b;
                k1Var3.f6235e.mo21789z(k1Var3.mo8001b(), this.f6228b.f6083a, b.mo21751I1(), 2, this.f6228b);
            } else if (b.mo21751I1() == 18) {
                C2104k1 k1Var4 = this.f6228b;
                Dialog u = k1Var4.f6235e.mo21784u(k1Var4.mo8001b(), this.f6228b);
                C2104k1 k1Var5 = this.f6228b;
                k1Var5.f6235e.mo21785v(k1Var5.mo8001b().getApplicationContext(), new C2098i1(this, u));
            } else {
                this.f6228b.m9355l(b, this.f6227a.mo8073a());
            }
        }
    }
}
