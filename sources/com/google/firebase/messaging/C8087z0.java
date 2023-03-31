package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.z0 */
/* compiled from: TopicsStore */
final class C8087z0 {

    /* renamed from: d */
    private static WeakReference<C8087z0> f34796d;

    /* renamed from: a */
    private final SharedPreferences f34797a;

    /* renamed from: b */
    private C8077v0 f34798b;

    /* renamed from: c */
    private final Executor f34799c;

    private C8087z0(SharedPreferences sharedPreferences, Executor executor) {
        this.f34799c = executor;
        this.f34797a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C8087z0 m44467b(Context context, Executor executor) {
        C8087z0 z0Var;
        synchronized (C8087z0.class) {
            z0Var = null;
            WeakReference<C8087z0> weakReference = f34796d;
            if (weakReference != null) {
                z0Var = (C8087z0) weakReference.get();
            }
            if (z0Var == null) {
                z0Var = new C8087z0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                z0Var.m44468d();
                f34796d = new WeakReference<>(z0Var);
            }
        }
        return z0Var;
    }

    /* renamed from: d */
    private synchronized void m44468d() {
        this.f34798b = C8077v0.m44436d(this.f34797a, "topic_operation_queue", ",", this.f34799c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo26761a(C8085y0 y0Var) {
        return this.f34798b.mo26736b(y0Var.mo26757e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C8085y0 mo26762c() {
        return C8085y0.m44460a(this.f34798b.mo26737f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized boolean mo26763e(C8085y0 y0Var) {
        return this.f34798b.mo26738g(y0Var.mo26757e());
    }
}
