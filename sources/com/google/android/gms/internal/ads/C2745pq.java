package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.pq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2745pq implements C2485iq {

    /* renamed from: a */
    private boolean f15950a;

    /* renamed from: b */
    private long f15951b;

    /* renamed from: c */
    private long f15952c;

    /* renamed from: d */
    private C2959vi f15953d = C2959vi.f19105d;

    /* renamed from: A */
    public final long mo9926A() {
        long j;
        long j2 = this.f15951b;
        if (!this.f15950a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15952c;
        C2959vi viVar = this.f15953d;
        if (viVar.f19106a == 1.0f) {
            j = C2216bi.m10386a(elapsedRealtime);
        } else {
            j = viVar.mo14773a(elapsedRealtime);
        }
        return j2 + j;
    }

    /* renamed from: B */
    public final C2959vi mo9927B(C2959vi viVar) {
        if (this.f15950a) {
            mo13323a(mo9926A());
        }
        this.f15953d = viVar;
        return viVar;
    }

    /* renamed from: a */
    public final void mo13323a(long j) {
        this.f15951b = j;
        if (this.f15950a) {
            this.f15952c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo13324b() {
        if (!this.f15950a) {
            this.f15952c = SystemClock.elapsedRealtime();
            this.f15950a = true;
        }
    }

    /* renamed from: c */
    public final void mo13325c() {
        if (this.f15950a) {
            mo13323a(mo9926A());
            this.f15950a = false;
        }
    }

    /* renamed from: d */
    public final void mo13326d(C2485iq iqVar) {
        mo13323a(iqVar.mo9926A());
        this.f15953d = iqVar.mo9930u();
    }

    /* renamed from: u */
    public final C2959vi mo9930u() {
        throw null;
    }
}
