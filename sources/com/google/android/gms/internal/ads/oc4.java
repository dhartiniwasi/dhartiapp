package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oc4 {

    /* renamed from: a */
    private Exception f15044a;

    /* renamed from: b */
    private long f15045b;

    public oc4(long j) {
    }

    /* renamed from: a */
    public final void mo12900a() {
        this.f15044a = null;
    }

    /* renamed from: b */
    public final void mo12901b(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f15044a == null) {
            this.f15044a = exc;
            this.f15045b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f15045b) {
            Exception exc2 = this.f15044a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(exc2, new Object[]{exc});
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f15044a;
            this.f15044a = null;
            throw exc3;
        }
    }
}
