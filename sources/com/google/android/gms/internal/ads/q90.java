package com.google.android.gms.internal.ads;

import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q90 implements kn0 {

    /* renamed from: a */
    final /* synthetic */ z90 f16296a;

    /* renamed from: b */
    final /* synthetic */ ny2 f16297b;

    /* renamed from: c */
    final /* synthetic */ aa0 f16298c;

    q90(aa0 aa0, z90 z90, ny2 ny2) {
        this.f16298c = aa0;
        this.f16296a = z90;
        this.f16297b = ny2;
    }

    public final void zza() {
        synchronized (this.f16298c.f6499a) {
            this.f16298c.f6507i = 1;
            C4794n1.m30693k("Failed loading new engine. Marking new engine destroyable.");
            this.f16296a.mo15570g();
            if (((Boolean) x00.f19924d.mo13438e()).booleanValue()) {
                aa0 aa0 = this.f16298c;
                if (aa0.f6503e != null) {
                    az2 e = aa0.f6503e;
                    ny2 ny2 = this.f16297b;
                    ny2.mo11826G(false);
                    e.mo8629b(ny2.mo11831W());
                }
            }
        }
    }
}
