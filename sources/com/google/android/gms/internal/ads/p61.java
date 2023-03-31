package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import p066i4.C4680t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p61 implements C4680t {

    /* renamed from: a */
    private final eb1 f15708a;

    /* renamed from: b */
    private final AtomicBoolean f15709b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicBoolean f15710c = new AtomicBoolean(false);

    public p61(eb1 eb1) {
        this.f15708a = eb1;
    }

    /* renamed from: c */
    private final void m18351c() {
        if (!this.f15710c.get()) {
            this.f15710c.set(true);
            this.f15708a.zza();
        }
    }

    /* renamed from: a */
    public final void mo8931a() {
    }

    /* renamed from: b */
    public final boolean mo13146b() {
        return this.f15709b.get();
    }

    /* renamed from: d */
    public final void mo8932d() {
        this.f15708a.mo9867e();
    }

    /* renamed from: i5 */
    public final void mo8933i5() {
    }

    /* renamed from: o3 */
    public final void mo8934o3() {
    }

    /* renamed from: p */
    public final void mo8935p(int i) {
        this.f15709b.set(true);
        m18351c();
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
        m18351c();
    }
}
