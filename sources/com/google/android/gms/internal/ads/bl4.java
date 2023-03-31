package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bl4 {

    /* renamed from: d */
    public static final vk4 f7344d = new vk4(0, -9223372036854775807L, (uk4) null);

    /* renamed from: e */
    public static final vk4 f7345e = new vk4(1, -9223372036854775807L, (uk4) null);

    /* renamed from: f */
    public static final vk4 f7346f = new vk4(2, -9223372036854775807L, (uk4) null);

    /* renamed from: g */
    public static final vk4 f7347g = new vk4(3, -9223372036854775807L, (uk4) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f7348a = gb2.m13183q("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public wk4 f7349b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f7350c;

    public bl4(String str) {
    }

    /* renamed from: b */
    public static vk4 m10462b(boolean z, long j) {
        return new vk4(z ? 1 : 0, j, (uk4) null);
    }

    /* renamed from: a */
    public final long mo8861a(xk4 xk4, tk4 tk4, int i) {
        Looper myLooper = Looper.myLooper();
        v91.m22048b(myLooper);
        this.f7350c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new wk4(this, myLooper, xk4, tk4, i, elapsedRealtime).mo14945c(0);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void mo8862g() {
        wk4 wk4 = this.f7349b;
        v91.m22048b(wk4);
        wk4.mo14943a(false);
    }

    /* renamed from: h */
    public final void mo8863h() {
        this.f7350c = null;
    }

    /* renamed from: i */
    public final void mo8864i(int i) throws IOException {
        IOException iOException = this.f7350c;
        if (iOException == null) {
            wk4 wk4 = this.f7349b;
            if (wk4 != null) {
                wk4.mo14944b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void mo8865j(yk4 yk4) {
        wk4 wk4 = this.f7349b;
        if (wk4 != null) {
            wk4.mo14943a(true);
        }
        this.f7348a.execute(new zk4(yk4));
        this.f7348a.shutdown();
    }

    /* renamed from: k */
    public final boolean mo8866k() {
        return this.f7350c != null;
    }

    /* renamed from: l */
    public final boolean mo8867l() {
        return this.f7349b != null;
    }
}
