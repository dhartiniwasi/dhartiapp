package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p060h4.C4596v;
import p060h4.C4607w4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xe2 implements sj2 {

    /* renamed from: a */
    private final C4607w4 f20078a;

    /* renamed from: b */
    private final vm0 f20079b;

    /* renamed from: c */
    private final boolean f20080c;

    public xe2(C4607w4 w4Var, vm0 vm0, boolean z) {
        this.f20078a = w4Var;
        this.f20079b = vm0;
        this.f20080c = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f20079b.f19152c >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14662q4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14672r4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f20080c);
        }
        C4607w4 w4Var = this.f20078a;
        if (w4Var != null) {
            int i = w4Var.f25053a;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
