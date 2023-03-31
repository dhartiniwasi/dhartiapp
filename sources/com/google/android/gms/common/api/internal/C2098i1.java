package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p017b5.C1822t;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2098i1 extends C1822t {

    /* renamed from: a */
    final /* synthetic */ Dialog f6222a;

    /* renamed from: b */
    final /* synthetic */ C2101j1 f6223b;

    C2098i1(C2101j1 j1Var, Dialog dialog) {
        this.f6223b = j1Var;
        this.f6222a = dialog;
    }

    /* renamed from: a */
    public final void mo6993a() {
        this.f6223b.f6228b.m9356o();
        if (this.f6222a.isShowing()) {
            this.f6222a.dismiss();
        }
    }
}
