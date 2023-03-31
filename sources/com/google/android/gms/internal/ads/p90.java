package com.google.android.gms.internal.ads;

import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class p90 implements mn0 {

    /* renamed from: a */
    final /* synthetic */ z90 f15763a;

    /* renamed from: b */
    final /* synthetic */ ny2 f15764b;

    /* renamed from: c */
    final /* synthetic */ aa0 f15765c;

    p90(aa0 aa0, z90 z90, ny2 ny2) {
        this.f15765c = aa0;
        this.f15763a = z90;
        this.f15764b = ny2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo10110b(Object obj) {
        u80 u80 = (u80) obj;
        synchronized (this.f15765c.f6499a) {
            this.f15765c.f6507i = 0;
            aa0 aa0 = this.f15765c;
            if (!(aa0.f6506h == null || this.f15763a == aa0.f6506h)) {
                C4794n1.m30693k("New JS engine is loaded, marking previous one as destroyable.");
                this.f15765c.f6506h.mo15570g();
            }
            this.f15765c.f6506h = this.f15763a;
            if (((Boolean) x00.f19924d.mo13438e()).booleanValue()) {
                aa0 aa02 = this.f15765c;
                if (aa02.f6503e != null) {
                    az2 e = aa02.f6503e;
                    ny2 ny2 = this.f15764b;
                    ny2.mo11826G(true);
                    e.mo8629b(ny2.mo11831W());
                }
            }
        }
    }
}
