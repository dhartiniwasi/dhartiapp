package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7272ye;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7309b4 implements C7272ye {

    /* renamed from: a */
    final /* synthetic */ C7331d4 f32368a;

    C7309b4(C7331d4 d4Var) {
        this.f32368a = d4Var;
    }

    /* renamed from: a */
    public final void mo24029a(int i, String str, List list, boolean z, boolean z2) {
        C7330d3 d3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            d3Var = this.f32368a.f32389a.mo24135l().mo24255p();
        } else if (i2 != 1) {
            if (i2 == 3) {
                d3Var = this.f32368a.f32389a.mo24135l().mo24260v();
            } else if (i2 != 4) {
                d3Var = this.f32368a.f32389a.mo24135l().mo24259u();
            } else if (z) {
                d3Var = this.f32368a.f32389a.mo24135l().mo24263y();
            } else if (!z2) {
                d3Var = this.f32368a.f32389a.mo24135l().mo24262x();
            } else {
                d3Var = this.f32368a.f32389a.mo24135l().mo24261w();
            }
        } else if (z) {
            d3Var = this.f32368a.f32389a.mo24135l().mo24258t();
        } else if (!z2) {
            d3Var = this.f32368a.f32389a.mo24135l().mo24257r();
        } else {
            d3Var = this.f32368a.f32389a.mo24135l().mo24256q();
        }
        int size = list.size();
        if (size == 1) {
            d3Var.mo24209b(str, list.get(0));
        } else if (size == 2) {
            d3Var.mo24210c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            d3Var.mo24208a(str);
        } else {
            d3Var.mo24211d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
