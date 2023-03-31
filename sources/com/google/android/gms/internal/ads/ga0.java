package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ga0 {

    /* renamed from: a */
    private final Object f9791a = new Object();

    /* renamed from: b */
    private final Object f9792b = new Object();

    /* renamed from: c */
    private pa0 f9793c;

    /* renamed from: d */
    private pa0 f9794d;

    /* renamed from: c */
    private static final Context m13094c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final pa0 mo10444a(Context context, vm0 vm0, az2 az2) {
        pa0 pa0;
        synchronized (this.f9791a) {
            if (this.f9793c == null) {
                this.f9793c = new pa0(m13094c(context), vm0, (String) C4596v.m30088c().mo12227b(C2679nz.f14497a), az2);
            }
            pa0 = this.f9793c;
        }
        return pa0;
    }

    /* renamed from: b */
    public final pa0 mo10445b(Context context, vm0 vm0, az2 az2) {
        pa0 pa0;
        synchronized (this.f9792b) {
            if (this.f9794d == null) {
                this.f9794d = new pa0(m13094c(context), vm0, (String) o10.f14794b.mo13438e(), az2);
            }
            pa0 = this.f9794d;
        }
        return pa0;
    }
}
