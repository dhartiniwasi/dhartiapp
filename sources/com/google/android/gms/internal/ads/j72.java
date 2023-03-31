package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4596v;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class j72 implements uj1 {

    /* renamed from: a */
    private final is2 f11262a;

    /* renamed from: b */
    private final kd0 f11263b;

    /* renamed from: c */
    private final boolean f11264c;

    /* renamed from: d */
    private oa1 f11265d = null;

    j72(is2 is2, kd0 kd0, boolean z) {
        this.f11262a = is2;
        this.f11263b = kd0;
        this.f11264c = z;
    }

    /* renamed from: a */
    public final void mo10408a(boolean z, Context context, ja1 ja1) throws tj1 {
        boolean z2;
        try {
            if (this.f11264c) {
                z2 = this.f11263b.mo11085P(C4956b.m31385o3(context));
            } else {
                z2 = this.f11263b.mo11096r4(C4956b.m31385o3(context));
            }
            if (!z2) {
                throw new tj1("Adapter failed to show.");
            } else if (this.f11265d != null) {
                if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14649p1)).booleanValue() && this.f11262a.f10967Z == 2) {
                    this.f11265d.zza();
                }
            }
        } catch (Throwable th) {
            throw new tj1(th);
        }
    }

    /* renamed from: b */
    public final void mo11335b(oa1 oa1) {
        this.f11265d = oa1;
    }
}
