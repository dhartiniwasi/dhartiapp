package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ee3 extends de3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f8778a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater f8779b;

    ee3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((ce3) null);
        this.f8778a = atomicReferenceFieldUpdater;
        this.f8779b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo9561a(ge3 ge3) {
        return this.f8779b.decrementAndGet(ge3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9562b(com.google.android.gms.internal.ads.ge3 r2, java.util.Set r3, java.util.Set r4) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = r1.f8778a
        L_0x0002:
            r0 = 0
            boolean r0 = androidx.concurrent.futures.C0600b.m2800a(r3, r2, r0, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r0 = r3.get(r2)
            if (r0 == 0) goto L_0x0002
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ee3.mo9562b(com.google.android.gms.internal.ads.ge3, java.util.Set, java.util.Set):void");
    }
}
