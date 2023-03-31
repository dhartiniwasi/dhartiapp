package p244ge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p244ge.C10357c0;
import p253he.C10543e;

/* renamed from: ge.p */
/* compiled from: Dispatcher */
public final class C10386p {

    /* renamed from: a */
    private int f41287a = 64;

    /* renamed from: b */
    private int f41288b = 5;

    /* renamed from: c */
    private Runnable f41289c;

    /* renamed from: d */
    private ExecutorService f41290d;

    /* renamed from: e */
    private final Deque<C10357c0.C10358a> f41291e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C10357c0.C10358a> f41292f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C10357c0> f41293g = new ArrayDeque();

    /* renamed from: e */
    private <T> void m52447e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f41289c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m52448f() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: f */
    private boolean m52448f() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C10357c0.C10358a> it = this.f41291e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10357c0.C10358a next = it.next();
                if (this.f41292f.size() >= this.f41287a) {
                    break;
                } else if (next.mo33251b().get() < this.f41288b) {
                    it.remove();
                    next.mo33251b().incrementAndGet();
                    arrayList.add(next);
                    this.f41292f.add(next);
                }
            }
            z = mo33371g() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C10357c0.C10358a) arrayList.get(i)).mo33252d(mo33368b());
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo33367a(C10357c0 c0Var) {
        this.f41293g.add(c0Var);
    }

    /* renamed from: b */
    public synchronized ExecutorService mo33368b() {
        if (this.f41290d == null) {
            this.f41290d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C10543e.m53035H("OkHttp Dispatcher", false));
        }
        return this.f41290d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33369c(C10357c0.C10358a aVar) {
        aVar.mo33251b().decrementAndGet();
        m52447e(this.f41292f, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo33370d(C10357c0 c0Var) {
        m52447e(this.f41293g, c0Var);
    }

    /* renamed from: g */
    public synchronized int mo33371g() {
        return this.f41292f.size() + this.f41293g.size();
    }
}
