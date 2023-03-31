package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s13 {

    /* renamed from: a */
    private final BlockingQueue f17193a;

    /* renamed from: b */
    private final ThreadPoolExecutor f17194b;

    /* renamed from: c */
    private final ArrayDeque f17195c = new ArrayDeque();

    /* renamed from: d */
    private r13 f17196d = null;

    public s13() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f17193a = linkedBlockingQueue;
        this.f17194b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m20115c() {
        r13 r13 = (r13) this.f17195c.poll();
        this.f17196d = r13;
        if (r13 != null) {
            r13.executeOnExecutor(this.f17194b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo13932a(r13 r13) {
        this.f17196d = null;
        m20115c();
    }

    /* renamed from: b */
    public final void mo13933b(r13 r13) {
        r13.mo13653b(this);
        this.f17195c.add(r13);
        if (this.f17196d == null) {
            m20115c();
        }
    }
}
