package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2671nr {

    /* renamed from: a */
    private final Handler f14175a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2708or f14176b;

    public C2671nr(Handler handler, C2708or orVar) {
        Objects.requireNonNull(handler);
        this.f14175a = handler;
        this.f14176b = orVar;
    }

    /* renamed from: b */
    public final void mo12697b(String str, long j, long j2) {
        this.f14175a.post(new C2448hr(this, str, j, j2));
    }

    /* renamed from: c */
    public final void mo12698c(C2627mk mkVar) {
        this.f14175a.post(new C2634mr(this, mkVar));
    }

    /* renamed from: d */
    public final void mo12699d(int i, long j) {
        this.f14175a.post(new C2523jr(this, i, j));
    }

    /* renamed from: e */
    public final void mo12700e(C2627mk mkVar) {
        this.f14175a.post(new C2411gr(this, mkVar));
    }

    /* renamed from: f */
    public final void mo12701f(C2774qi qiVar) {
        this.f14175a.post(new C2486ir(this, qiVar));
    }

    /* renamed from: g */
    public final void mo12702g(Surface surface) {
        this.f14175a.post(new C2597lr(this, surface));
    }

    /* renamed from: h */
    public final void mo12703h(int i, int i2, int i3, float f) {
        this.f14175a.post(new C2560kr(this, i, i2, i3, f));
    }
}
