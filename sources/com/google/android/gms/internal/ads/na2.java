package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import p053g4.C4395f;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class na2 implements C4395f {

    /* renamed from: a */
    private final t91 f13923a;

    /* renamed from: b */
    private final oa1 f13924b;

    /* renamed from: c */
    private final sh1 f13925c;

    /* renamed from: d */
    private final lh1 f13926d;

    /* renamed from: e */
    private final x11 f13927e;

    /* renamed from: f */
    final AtomicBoolean f13928f = new AtomicBoolean(false);

    na2(t91 t91, oa1 oa1, sh1 sh1, lh1 lh1, x11 x11) {
        this.f13923a = t91;
        this.f13924b = oa1;
        this.f13925c = sh1;
        this.f13926d = lh1;
        this.f13927e = x11;
    }

    /* renamed from: a */
    public final synchronized void mo8713a(View view) {
        if (this.f13928f.compareAndSet(false, true)) {
            this.f13927e.mo9822Z();
            this.f13926d.mo12019p0(view);
        }
    }

    /* renamed from: d */
    public final void mo8714d() {
        if (this.f13928f.get()) {
            this.f13923a.onAdClicked();
        }
    }

    /* renamed from: e */
    public final void mo8715e() {
        if (this.f13928f.get()) {
            this.f13924b.zza();
            this.f13925c.zza();
        }
    }
}
