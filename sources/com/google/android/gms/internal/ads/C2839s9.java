package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2839s9 {

    /* renamed from: a */
    private final AtomicInteger f17306a = new AtomicInteger();

    /* renamed from: b */
    private final Set f17307b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue f17308c = new PriorityBlockingQueue();

    /* renamed from: d */
    private final PriorityBlockingQueue f17309d = new PriorityBlockingQueue();

    /* renamed from: e */
    private final C3060y8 f17310e;

    /* renamed from: f */
    private final C2430h9 f17311f;

    /* renamed from: g */
    private final C2467i9[] f17312g;

    /* renamed from: h */
    private C2170a9 f17313h;

    /* renamed from: i */
    private final List f17314i = new ArrayList();

    /* renamed from: j */
    private final List f17315j = new ArrayList();

    /* renamed from: k */
    private final C2355f9 f17316k;

    public C2839s9(C3060y8 y8Var, C2430h9 h9Var, int i) {
        C2355f9 f9Var = new C2355f9(new Handler(Looper.getMainLooper()));
        this.f17310e = y8Var;
        this.f17311f = h9Var;
        this.f17312g = new C2467i9[4];
        this.f17316k = f9Var;
    }

    /* renamed from: a */
    public final C2727p9 mo13962a(C2727p9 p9Var) {
        p9Var.mo13180k(this);
        synchronized (this.f17307b) {
            this.f17307b.add(p9Var);
        }
        p9Var.mo13181n(this.f17306a.incrementAndGet());
        p9Var.mo13186t("add-to-queue");
        mo13964c(p9Var, 0);
        this.f17308c.add(p9Var);
        return p9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13963b(C2727p9 p9Var) {
        synchronized (this.f17307b) {
            this.f17307b.remove(p9Var);
        }
        synchronized (this.f17314i) {
            for (C2802r9 zza : this.f17314i) {
                zza.zza();
            }
        }
        mo13964c(p9Var, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13964c(C2727p9 p9Var, int i) {
        synchronized (this.f17315j) {
            for (C2765q9 zza : this.f17315j) {
                zza.zza();
            }
        }
    }

    /* renamed from: d */
    public final void mo13965d() {
        C2170a9 a9Var = this.f17313h;
        if (a9Var != null) {
            a9Var.mo8264b();
        }
        C2467i9[] i9VarArr = this.f17312g;
        for (int i = 0; i < 4; i++) {
            C2467i9 i9Var = i9VarArr[i];
            if (i9Var != null) {
                i9Var.mo11062a();
            }
        }
        C2170a9 a9Var2 = new C2170a9(this.f17308c, this.f17309d, this.f17310e, this.f17316k, (byte[]) null);
        this.f17313h = a9Var2;
        a9Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C2467i9 i9Var2 = new C2467i9(this.f17309d, this.f17311f, this.f17310e, this.f17316k, (byte[]) null);
            this.f17312g[i2] = i9Var2;
            i9Var2.start();
        }
    }
}
