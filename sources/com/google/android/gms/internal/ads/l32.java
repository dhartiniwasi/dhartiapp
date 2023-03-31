package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l32 implements lb1, z91 {

    /* renamed from: c */
    private static final Object f12634c = new Object();

    /* renamed from: d */
    private static int f12635d;

    /* renamed from: a */
    private final C4800p1 f12636a;

    /* renamed from: b */
    private final v32 f12637b;

    public l32(v32 v32, C4800p1 p1Var) {
        this.f12637b = v32;
        this.f12636a = p1Var;
    }

    /* renamed from: a */
    private final void m15801a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue() && !this.f12636a.mo18501f0()) {
            Object obj = f12634c;
            synchronized (obj) {
                i = f12635d;
                intValue = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14633n5)).intValue();
            }
            if (i < intValue) {
                this.f12637b.mo14669e(z);
                synchronized (obj) {
                    f12635d++;
                }
            }
        }
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        m15801a(true);
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        m15801a(false);
    }
}
