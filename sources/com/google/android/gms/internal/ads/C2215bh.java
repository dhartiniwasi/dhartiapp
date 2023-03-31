package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.bh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2215bh extends C2513jh {

    /* renamed from: i */
    private final StackTraceElement[] f7252i;

    public C2215bh(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(wfVar, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", ybVar, i, 45);
        this.f7252i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f7252i;
        if (obj != null) {
            int i = 1;
            C2659nf nfVar = new C2659nf((String) this.f11604f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f11603e) {
                this.f11603e.mo15411x(nfVar.f13987b.longValue());
                if (nfVar.f13988c.booleanValue()) {
                    C3063yb ybVar = this.f11603e;
                    if (true != nfVar.f13989d.booleanValue()) {
                        i = 2;
                    }
                    ybVar.mo15380V(i);
                } else {
                    this.f11603e.mo15380V(3);
                }
            }
        }
    }
}
