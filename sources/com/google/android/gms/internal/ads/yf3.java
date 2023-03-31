package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yf3 implements Runnable {

    /* renamed from: a */
    ag3 f20591a;

    yf3(ag3 ag3) {
        this.f20591a = ag3;
    }

    public final void run() {
        lf3 E;
        String str;
        ag3 ag3 = this.f20591a;
        if (ag3 != null && (E = ag3.f6556h) != null) {
            this.f20591a = null;
            if (E.isDone()) {
                ag3.mo10139w(E);
                return;
            }
            try {
                ScheduledFuture G = ag3.f6557i;
                ScheduledFuture unused = ag3.f6557i = null;
                str = "Timed out";
                if (G != null) {
                    long abs = Math.abs(G.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                ag3.mo9806h(new zf3(str + ": " + E, (vf3) null));
                E.cancel(true);
            } catch (Throwable th) {
                E.cancel(true);
                throw th;
            }
        }
    }
}
