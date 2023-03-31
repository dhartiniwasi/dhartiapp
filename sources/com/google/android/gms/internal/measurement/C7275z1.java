package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p033d5.C4141r;
import p088l5.C4956b;
import p402y5.C13035m;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7275z1 extends C7164s2 {

    /* renamed from: e */
    final /* synthetic */ String f32222e;

    /* renamed from: f */
    final /* synthetic */ String f32223f;

    /* renamed from: g */
    final /* synthetic */ Context f32224g;

    /* renamed from: h */
    final /* synthetic */ Bundle f32225h;

    /* renamed from: i */
    final /* synthetic */ C6904c3 f32226i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7275z1(C6904c3 c3Var, String str, String str2, Context context, Bundle bundle) {
        super(c3Var, true);
        this.f32226i = c3Var;
        this.f32222e = str;
        this.f32223f = str2;
        this.f32224g = context;
        this.f32225h = bundle;
    }

    /* renamed from: a */
    public final void mo22992a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f32226i.m39704s(this.f32222e, this.f32223f)) {
                String str4 = this.f32223f;
                str2 = this.f32222e;
                str = str4;
                str3 = this.f32226i.f31606a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C4141r.m28221k(this.f32224g);
            C6904c3 c3Var = this.f32226i;
            c3Var.f31614i = c3Var.mo23177y(this.f32224g, true);
            if (this.f32226i.f31614i == null) {
                Log.w(this.f32226i.f31606a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m9484a(this.f32224g, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m9485c(this.f32224g, ModuleDescriptor.MODULE_ID);
            ((C6953f1) C4141r.m28221k(this.f32226i.f31614i)).initialize(C4956b.m31385o3(this.f32224g), new C7083n1(74029, (long) Math.max(a, c), c < a, str3, str2, str, this.f32225h, C13035m.m61349a(this.f32224g)), this.f32044a);
        } catch (Exception e) {
            this.f32226i.m39701p(e, true, false);
        }
    }
}
