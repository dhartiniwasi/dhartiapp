package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.mg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2623mg extends C2513jh {

    /* renamed from: i */
    private static volatile Long f13327i;

    /* renamed from: j */
    private static final Object f13328j = new Object();

    public C2623mg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", ybVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (f13327i == null) {
            synchronized (f13328j) {
                if (f13327i == null) {
                    f13327i = (Long) this.f11604f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f11603e) {
            this.f11603e.mo15397n0(f13327i.longValue());
        }
    }
}
