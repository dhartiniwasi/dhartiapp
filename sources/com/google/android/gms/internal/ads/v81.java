package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class v81 implements w91, zg1, re1, ma1, C2894tr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final oa1 f18968a;

    /* renamed from: b */
    private final is2 f18969b;

    /* renamed from: c */
    private final ScheduledExecutorService f18970c;

    /* renamed from: d */
    private final Executor f18971d;

    /* renamed from: e */
    private final uf3 f18972e = uf3.m21609D();

    /* renamed from: f */
    private ScheduledFuture f18973f;

    /* renamed from: g */
    private final AtomicBoolean f18974g = new AtomicBoolean();

    public v81(oa1 oa1, is2 is2, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f18968a = oa1;
        this.f18969b = is2;
        this.f18970c = scheduledExecutorService;
        this.f18971d = executor;
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14431S8)).booleanValue() && this.f18969b.f10967Z != 2 && srVar.f17627j && this.f18974g.compareAndSet(false, true)) {
            C4794n1.m30693k("Full screen 1px impression occurred");
            this.f18968a.zza();
        }
    }

    /* renamed from: R */
    public final synchronized void mo10490R(C4623z2 z2Var) {
        if (!this.f18972e.isDone()) {
            ScheduledFuture scheduledFuture = this.f18973f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f18972e.mo9806h(new Exception());
        }
    }

    /* renamed from: T */
    public final void mo11823T() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14649p1)).booleanValue()) {
            is2 is2 = this.f18969b;
            if (is2.f10967Z != 2) {
                return;
            }
            if (is2.f11001r == 0) {
                this.f18968a.zza();
                return;
            }
            cf3.m10920r(this.f18972e, new t81(this), this.f18971d);
            this.f18973f = this.f18970c.schedule(new s81(this), (long) this.f18969b.f11001r, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: W */
    public final void mo8333W() {
    }

    /* renamed from: Y */
    public final void mo8334Y() {
        int i = this.f18969b.f10967Z;
        if (i == 0 || i == 1) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14431S8)).booleanValue()) {
                this.f18968a.zza();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo13036a() {
        if (!this.f18972e.isDone()) {
            ScheduledFuture scheduledFuture = this.f18973f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f18972e.mo9805g(Boolean.TRUE);
        }
    }

    /* renamed from: b */
    public final void mo13037b() {
    }

    /* renamed from: c */
    public final void mo11824c() {
    }

    /* renamed from: c0 */
    public final void mo8335c0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo14694e() {
        synchronized (this) {
            if (!this.f18972e.isDone()) {
                this.f18972e.mo9805g(Boolean.TRUE);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo8336e0() {
    }

    /* renamed from: j */
    public final void mo8337j(oh0 oh0, String str, String str2) {
    }

    /* renamed from: x */
    public final void mo8338x() {
    }
}
