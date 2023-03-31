package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j51 implements lb1, C2894tr {

    /* renamed from: a */
    private final is2 f11232a;

    /* renamed from: b */
    private final oa1 f11233b;

    /* renamed from: c */
    private final ub1 f11234c;

    /* renamed from: d */
    private final AtomicBoolean f11235d = new AtomicBoolean();

    /* renamed from: e */
    private final AtomicBoolean f11236e = new AtomicBoolean();

    public j51(is2 is2, oa1 oa1, ub1 ub1) {
        this.f11232a = is2;
        this.f11233b = oa1;
        this.f11234c = ub1;
    }

    /* renamed from: a */
    private final void m14709a() {
        if (this.f11235d.compareAndSet(false, true)) {
            this.f11233b.zza();
        }
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        if (this.f11232a.f10978f == 1 && srVar.f17627j) {
            m14709a();
        }
        if (srVar.f17627j && this.f11236e.compareAndSet(false, true)) {
            this.f11234c.zza();
        }
    }

    /* renamed from: a0 */
    public final synchronized void mo10019a0() {
        if (this.f11232a.f10978f != 1) {
            m14709a();
        }
    }
}
