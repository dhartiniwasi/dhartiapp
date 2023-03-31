package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d84 implements e74 {

    /* renamed from: a */
    private final wa1 f8139a;

    /* renamed from: b */
    private boolean f8140b;

    /* renamed from: c */
    private long f8141c;

    /* renamed from: d */
    private long f8142d;

    /* renamed from: e */
    private fe0 f8143e = fe0.f9258d;

    public d84(wa1 wa1) {
        this.f8139a = wa1;
    }

    /* renamed from: a */
    public final void mo9462a(long j) {
        this.f8141c = j;
        if (this.f8140b) {
            this.f8142d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo9463b() {
        if (!this.f8140b) {
            this.f8142d = SystemClock.elapsedRealtime();
            this.f8140b = true;
        }
    }

    /* renamed from: c */
    public final void mo9147c(fe0 fe0) {
        if (this.f8140b) {
            mo9462a(zza());
        }
        this.f8143e = fe0;
    }

    /* renamed from: d */
    public final void mo9464d() {
        if (this.f8140b) {
            mo9462a(zza());
            this.f8140b = false;
        }
    }

    /* renamed from: e */
    public final fe0 mo9148e() {
        return this.f8143e;
    }

    public final long zza() {
        long j;
        long j2 = this.f8141c;
        if (!this.f8140b) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8142d;
        fe0 fe0 = this.f8143e;
        if (fe0.f9260a == 1.0f) {
            j = gb2.m13168f0(elapsedRealtime);
        } else {
            j = fe0.mo10147a(elapsedRealtime);
        }
        return j2 + j;
    }
}
