package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class x63 extends r63 {

    /* renamed from: b */
    final /* synthetic */ IBinder f20011b;

    /* renamed from: c */
    final /* synthetic */ a73 f20012c;

    x63(a73 a73, IBinder iBinder) {
        this.f20012c = a73;
        this.f20011b = iBinder;
    }

    /* renamed from: a */
    public final void mo8223a() {
        this.f20012c.f6458a.f7147m = m63.m16435I6(this.f20011b);
        b73.m10223n(this.f20012c.f6458a);
        this.f20012c.f6458a.f7141g = false;
        for (Runnable run : this.f20012c.f6458a.f7138d) {
            run.run();
        }
        this.f20012c.f6458a.f7138d.clear();
    }
}
