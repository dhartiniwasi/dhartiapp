package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bu2 {

    /* renamed from: a */
    private final Deque f7460a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable f7461b;

    /* renamed from: c */
    private final mf3 f7462c;

    public bu2(Callable callable, mf3 mf3) {
        this.f7461b = callable;
        this.f7462c = mf3;
    }

    /* renamed from: a */
    public final synchronized lf3 mo8946a() {
        mo8948c(1);
        return (lf3) this.f7460a.poll();
    }

    /* renamed from: b */
    public final synchronized void mo8947b(lf3 lf3) {
        this.f7460a.addFirst(lf3);
    }

    /* renamed from: c */
    public final synchronized void mo8948c(int i) {
        int size = i - this.f7460a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f7460a.add(this.f7462c.mo12324a(this.f7461b));
        }
    }
}
