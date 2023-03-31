package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7543w8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f33167a;

    /* renamed from: b */
    final /* synthetic */ String f33168b = "_err";

    /* renamed from: c */
    final /* synthetic */ Bundle f33169c;

    /* renamed from: d */
    final /* synthetic */ C7553x8 f33170d;

    C7543w8(C7553x8 x8Var, String str, String str2, Bundle bundle) {
        this.f33170d = x8Var;
        this.f33167a = str;
        this.f33169c = bundle;
    }

    public final void run() {
        this.f33170d.f33191a.mo24130i((C7524v) C4141r.m28221k(this.f33170d.f33191a.mo24129h0().mo24407w0(this.f33167a, this.f33168b, this.f33169c, "auto", this.f33170d.f33191a.mo24116a().mo18370a(), false, true)), this.f33167a);
    }
}
