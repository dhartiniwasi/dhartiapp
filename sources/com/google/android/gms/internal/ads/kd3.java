package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fd3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kd3 extends gd3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<qd3, Thread> f12038a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater<qd3, qd3> f12039b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater<fd3, qd3> f12040c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater<fd3, jd3> f12041d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater<fd3, Object> f12042e;

    kd3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super((fd3.C2360a) null);
        this.f12038a = atomicReferenceFieldUpdater;
        this.f12039b = atomicReferenceFieldUpdater2;
        this.f12040c = atomicReferenceFieldUpdater3;
        this.f12041d = atomicReferenceFieldUpdater4;
        this.f12042e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final jd3 mo10479a(fd3 fd3, jd3 jd3) {
        return this.f12041d.getAndSet(fd3, jd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final qd3 mo10480b(fd3 fd3, qd3 qd3) {
        return this.f12040c.getAndSet(fd3, qd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10481c(qd3 qd3, qd3 qd32) {
        this.f12039b.lazySet(qd3, qd32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10482d(qd3 qd3, Thread thread) {
        this.f12038a.lazySet(qd3, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo10483e(fd3 fd3, jd3 jd3, jd3 jd32) {
        return rd3.m19796a(this.f12041d, fd3, jd3, jd32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10484f(fd3 fd3, Object obj, Object obj2) {
        return rd3.m19796a(this.f12042e, fd3, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo10485g(fd3 fd3, qd3 qd3, qd3 qd32) {
        return rd3.m19796a(this.f12040c, fd3, qd3, qd32);
    }
}
