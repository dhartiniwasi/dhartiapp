package com.google.android.gms.internal.ads;

import android.os.IBinder;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ga2 implements gb1 {

    /* renamed from: a */
    boolean f9796a = false;

    /* renamed from: b */
    final /* synthetic */ g52 f9797b;

    /* renamed from: c */
    final /* synthetic */ in0 f9798c;

    /* renamed from: d */
    final /* synthetic */ ha2 f9799d;

    ga2(ha2 ha2, g52 g52, in0 in0) {
        this.f9799d = ha2;
        this.f9797b = g52;
        this.f9798c = in0;
    }

    /* renamed from: a */
    private final synchronized void m13098a(C4623z2 z2Var) {
        int i = 1;
        if (true == ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14257B4)).booleanValue()) {
            i = 3;
        }
        this.f9798c.mo11173e(new h52(i, z2Var));
    }

    /* renamed from: b */
    public final synchronized void mo10446b() {
        this.f9798c.mo11172d((Object) null);
    }

    /* renamed from: g */
    public final synchronized void mo10447g(int i) {
        if (!this.f9796a) {
            this.f9796a = true;
            m13098a(new C4623z2(i, ha2.m13762e(this.f9797b.f9704a, i), "undefined", (C4623z2) null, (IBinder) null));
        }
    }

    /* renamed from: o0 */
    public final synchronized void mo10448o0(C4623z2 z2Var) {
        if (!this.f9796a) {
            this.f9796a = true;
            m13098a(z2Var);
        }
    }

    /* renamed from: p0 */
    public final synchronized void mo10449p0(int i, String str) {
        if (!this.f9796a) {
            this.f9796a = true;
            if (str == null) {
                str = ha2.m13762e(this.f9797b.f9704a, i);
            }
            m13098a(new C4623z2(i, str, "undefined", (C4623z2) null, (IBinder) null));
        }
    }
}
