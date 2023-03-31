package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2663nj {

    /* renamed from: a */
    private final Handler f14041a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2700oj f14042b;

    public C2663nj(Handler handler, C2700oj ojVar) {
        Objects.requireNonNull(handler);
        this.f14041a = handler;
        this.f14042b = ojVar;
    }

    /* renamed from: b */
    public final void mo12633b(int i) {
        this.f14041a.post(new C2626mj(this, i));
    }

    /* renamed from: c */
    public final void mo12634c(int i, long j, long j2) {
        this.f14041a.post(new C2552kj(this, i, j, j2));
    }

    /* renamed from: d */
    public final void mo12635d(String str, long j, long j2) {
        this.f14041a.post(new C2478ij(this, str, j, j2));
    }

    /* renamed from: e */
    public final void mo12636e(C2627mk mkVar) {
        this.f14041a.post(new C2589lj(this, mkVar));
    }

    /* renamed from: f */
    public final void mo12637f(C2627mk mkVar) {
        this.f14041a.post(new C2440hj(this, mkVar));
    }

    /* renamed from: g */
    public final void mo12638g(C2774qi qiVar) {
        this.f14041a.post(new C2515jj(this, qiVar));
    }
}
