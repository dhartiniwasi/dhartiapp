package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.wg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2994wg extends C2513jh {

    /* renamed from: i */
    private static volatile String f19618i;

    /* renamed from: j */
    private static final Object f19619j = new Object();

    public C2994wg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", ybVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        this.f11603e.mo15402r("E");
        if (f19618i == null) {
            synchronized (f19619j) {
                if (f19618i == null) {
                    f19618i = (String) this.f11604f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f11603e) {
            this.f11603e.mo15402r(f19618i);
        }
    }
}
