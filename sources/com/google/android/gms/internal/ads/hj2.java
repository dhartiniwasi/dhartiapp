package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p053g4.C4409t;
import p073j4.C4751b2;
import p081k5.C4888c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hj2 implements tj2 {

    /* renamed from: a */
    private final mf3 f10345a;

    /* renamed from: b */
    private final Context f10346b;

    /* renamed from: c */
    private final vm0 f10347c;

    public hj2(mf3 mf3, Context context, vm0 vm0) {
        this.f10345a = mf3;
        this.f10346b = context;
        this.f10347c = vm0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ij2 mo10824a() throws Exception {
        int i;
        boolean g = C4888c.m31075a(this.f10346b).mo18674g();
        C4409t.m29326r();
        boolean a = C4751b2.m30606a(this.f10346b);
        String str = this.f10347c.f19150a;
        C4409t.m29326r();
        boolean b = C4751b2.m30607b();
        C4409t.m29326r();
        ApplicationInfo applicationInfo = this.f10346b.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new ij2(g, a, str, b, i, DynamiteModule.m9485c(this.f10346b, ModuleDescriptor.MODULE_ID), DynamiteModule.m9484a(this.f10346b, ModuleDescriptor.MODULE_ID));
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f10345a.mo12324a(new gj2(this));
    }

    public final int zza() {
        return 35;
    }
}
