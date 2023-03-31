package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.cq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2261cq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f7866a = C2893tq.m21181l("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3040xp f7867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f7868c;

    public C2261cq(String str) {
    }

    /* renamed from: a */
    public final long mo9247a(C3077yp ypVar, C3003wp wpVar, int i) {
        Looper myLooper = Looper.myLooper();
        C2335eq.m12245e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C3040xp(this, myLooper, ypVar, wpVar, i, elapsedRealtime).mo15211c(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void mo9248f() {
        this.f7867b.mo15209a(false);
    }

    /* renamed from: g */
    public final void mo9249g(int i) throws IOException {
        IOException iOException = this.f7868c;
        if (iOException == null) {
            C3040xp xpVar = this.f7867b;
            if (xpVar != null) {
                xpVar.mo15210b(xpVar.f20294c);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo9250h(Runnable runnable) {
        C3040xp xpVar = this.f7867b;
        if (xpVar != null) {
            xpVar.mo15209a(true);
        }
        this.f7866a.execute(runnable);
        this.f7866a.shutdown();
    }

    /* renamed from: i */
    public final boolean mo9251i() {
        return this.f7867b != null;
    }
}
