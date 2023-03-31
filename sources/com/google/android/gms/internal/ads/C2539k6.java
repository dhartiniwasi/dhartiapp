package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2539k6 implements C2576l6 {

    /* renamed from: a */
    private final List f11920a;

    /* renamed from: b */
    private final C2792r[] f11921b;

    /* renamed from: c */
    private boolean f11922c;

    /* renamed from: d */
    private int f11923d;

    /* renamed from: e */
    private int f11924e;

    /* renamed from: f */
    private long f11925f = -9223372036854775807L;

    public C2539k6(List list) {
        this.f11920a = list;
        this.f11921b = new C2792r[list.size()];
    }

    /* renamed from: f */
    private final boolean m15212f(y22 y22, int i) {
        if (y22.mo15296i() == 0) {
            return false;
        }
        if (y22.mo15306s() != i) {
            this.f11922c = false;
        }
        this.f11923d--;
        return this.f11922c;
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f11922c = false;
        this.f11925f = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) {
        if (!this.f11922c) {
            return;
        }
        if (this.f11923d != 2 || m15212f(y22, 32)) {
            if (this.f11923d != 1 || m15212f(y22, 0)) {
                int k = y22.mo15298k();
                int i = y22.mo15296i();
                for (C2792r c : this.f11921b) {
                    y22.mo15293f(k);
                    c.mo8821c(y22, i);
                }
                this.f11924e += i;
            }
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        for (int i = 0; i < this.f11921b.length; i++) {
            C2948v7 v7Var = (C2948v7) this.f11920a.get(i);
            y7Var.mo15334c();
            C2792r n = tn4.mo10060n(y7Var.mo15332a(), 3);
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9764h(y7Var.mo15333b());
            e2Var.mo9776s("application/dvbsubs");
            e2Var.mo9766i(Collections.singletonList(v7Var.f18961b));
            e2Var.mo9768k(v7Var.f18960a);
            n.mo8823e(e2Var.mo9782y());
            this.f11921b[i] = n;
        }
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if ((i & 4) != 0) {
            this.f11922c = true;
            if (j != -9223372036854775807L) {
                this.f11925f = j;
            }
            this.f11924e = 0;
            this.f11923d = 2;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
        if (this.f11922c) {
            if (this.f11925f != -9223372036854775807L) {
                for (C2792r f : this.f11921b) {
                    f.mo8824f(this.f11925f, 1, this.f11924e, 0, (C2755q) null);
                }
            }
            this.f11922c = false;
        }
    }
}
