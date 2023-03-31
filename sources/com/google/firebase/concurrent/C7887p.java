package com.google.firebase.concurrent;

import androidx.concurrent.futures.C0589a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.p */
/* compiled from: DelegatingScheduledFuture */
class C7887p<V> extends C0589a<V> implements ScheduledFuture<V> {

    /* renamed from: h */
    private final ScheduledFuture<?> f34289h;

    /* renamed from: com.google.firebase.concurrent.p$a */
    /* compiled from: DelegatingScheduledFuture */
    class C7888a implements C7889b<V> {
        C7888a() {
        }

        /* renamed from: a */
        public void mo26285a(Throwable th) {
            boolean unused = C7887p.this.mo2716z(th);
        }

        public void set(V v) {
            boolean unused = C7887p.this.mo2715y(v);
        }
    }

    /* renamed from: com.google.firebase.concurrent.p$b */
    /* compiled from: DelegatingScheduledFuture */
    interface C7889b<T> {
        /* renamed from: a */
        void mo26285a(Throwable th);

        void set(T t);
    }

    /* renamed from: com.google.firebase.concurrent.p$c */
    /* compiled from: DelegatingScheduledFuture */
    interface C7890c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo26256a(C7889b<T> bVar);
    }

    C7887p(C7890c<V> cVar) {
        this.f34289h = cVar.mo26256a(new C7888a());
    }

    /* renamed from: E */
    public int compareTo(Delayed delayed) {
        return this.f34289h.compareTo(delayed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2705b() {
        this.f34289h.cancel(mo2704B());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f34289h.getDelay(timeUnit);
    }
}
