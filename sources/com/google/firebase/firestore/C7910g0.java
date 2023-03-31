package com.google.firebase.firestore;

import com.google.firebase.firestore.C7913h0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import p218e6.C9959a;
import p218e6.C9963c;
import p218e6.C9965d;
import p218e6.C9967e;
import p218e6.C9969f;
import p218e6.C9973h;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9979k;
import p247h8.C10432b;

/* renamed from: com.google.firebase.firestore.g0 */
/* compiled from: LoadBundleTask */
public class C7910g0 extends C9975i<C7913h0> {

    /* renamed from: a */
    private final Object f34338a = new Object();

    /* renamed from: b */
    private C7913h0 f34339b = C7913h0.f34345g;

    /* renamed from: c */
    private final C9977j<C7913h0> f34340c;

    /* renamed from: d */
    private final C9975i<C7913h0> f34341d;

    /* renamed from: e */
    private final Queue<C7911a> f34342e;

    /* renamed from: com.google.firebase.firestore.g0$a */
    /* compiled from: LoadBundleTask */
    private static class C7911a {

        /* renamed from: a */
        Executor f34343a;

        /* renamed from: b */
        C7918j0<C7913h0> f34344b;

        C7911a(Executor executor, C7918j0<C7913h0> j0Var) {
            this.f34343a = executor == null ? C9979k.f39917a : executor;
            this.f34344b = j0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m43737c(C7913h0 h0Var) {
            this.f34344b.mo26381a(h0Var);
        }

        /* renamed from: b */
        public void mo26371b(C7913h0 h0Var) {
            this.f34343a.execute(new C7906f0(this, h0Var));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f34344b.equals(((C7911a) obj).f34344b);
        }

        public int hashCode() {
            return this.f34344b.hashCode();
        }
    }

    public C7910g0() {
        C9977j<C7913h0> jVar = new C9977j<>();
        this.f34340c = jVar;
        this.f34341d = jVar.mo32542a();
        this.f34342e = new ArrayDeque();
    }

    /* renamed from: a */
    public C9975i<C7913h0> mo26346a(Executor executor, C9963c cVar) {
        return this.f34341d.mo26346a(executor, cVar);
    }

    /* renamed from: b */
    public C9975i<C7913h0> mo26347b(C9965d<C7913h0> dVar) {
        return this.f34341d.mo26347b(dVar);
    }

    /* renamed from: c */
    public C9975i<C7913h0> mo26348c(Executor executor, C9965d<C7913h0> dVar) {
        return this.f34341d.mo26348c(executor, dVar);
    }

    /* renamed from: d */
    public C9975i<C7913h0> mo26349d(C9967e eVar) {
        return this.f34341d.mo26349d(eVar);
    }

    /* renamed from: e */
    public C9975i<C7913h0> mo26350e(Executor executor, C9967e eVar) {
        return this.f34341d.mo26350e(executor, eVar);
    }

    /* renamed from: f */
    public C9975i<C7913h0> mo26351f(C9969f<? super C7913h0> fVar) {
        return this.f34341d.mo26351f(fVar);
    }

    /* renamed from: g */
    public C9975i<C7913h0> mo26352g(Executor executor, C9969f<? super C7913h0> fVar) {
        return this.f34341d.mo26352g(executor, fVar);
    }

    /* renamed from: h */
    public <TContinuationResult> C9975i<TContinuationResult> mo26353h(C9959a<C7913h0, TContinuationResult> aVar) {
        return this.f34341d.mo26353h(aVar);
    }

    /* renamed from: i */
    public <TContinuationResult> C9975i<TContinuationResult> mo26354i(Executor executor, C9959a<C7913h0, TContinuationResult> aVar) {
        return this.f34341d.mo26354i(executor, aVar);
    }

    /* renamed from: j */
    public <TContinuationResult> C9975i<TContinuationResult> mo26355j(C9959a<C7913h0, C9975i<TContinuationResult>> aVar) {
        return this.f34341d.mo26355j(aVar);
    }

    /* renamed from: k */
    public <TContinuationResult> C9975i<TContinuationResult> mo26356k(Executor executor, C9959a<C7913h0, C9975i<TContinuationResult>> aVar) {
        return this.f34341d.mo26356k(executor, aVar);
    }

    /* renamed from: l */
    public Exception mo26357l() {
        return this.f34341d.mo26357l();
    }

    /* renamed from: o */
    public boolean mo26360o() {
        return this.f34341d.mo26360o();
    }

    /* renamed from: p */
    public boolean mo26361p() {
        return this.f34341d.mo26361p();
    }

    /* renamed from: q */
    public boolean mo26362q() {
        return this.f34341d.mo26362q();
    }

    /* renamed from: r */
    public <TContinuationResult> C9975i<TContinuationResult> mo26363r(C9973h<C7913h0, TContinuationResult> hVar) {
        return this.f34341d.mo26363r(hVar);
    }

    /* renamed from: s */
    public <TContinuationResult> C9975i<TContinuationResult> mo26364s(Executor executor, C9973h<C7913h0, TContinuationResult> hVar) {
        return this.f34341d.mo26364s(executor, hVar);
    }

    /* renamed from: t */
    public C7910g0 mo26365t(C7918j0<C7913h0> j0Var) {
        C7911a aVar = new C7911a((Executor) null, j0Var);
        synchronized (this.f34338a) {
            this.f34342e.add(aVar);
        }
        return this;
    }

    /* renamed from: u */
    public C7913h0 mo26358m() {
        return this.f34341d.mo26358m();
    }

    /* renamed from: v */
    public <X extends Throwable> C7913h0 mo26359n(Class<X> cls) throws Throwable {
        return this.f34341d.mo26359n(cls);
    }

    /* renamed from: w */
    public void mo26368w(Exception exc) {
        synchronized (this.f34338a) {
            C7913h0 h0Var = new C7913h0(this.f34339b.mo26375d(), this.f34339b.mo26379g(), this.f34339b.mo26374c(), this.f34339b.mo26378f(), exc, C7913h0.C7914a.ERROR);
            this.f34339b = h0Var;
            for (C7911a b : this.f34342e) {
                b.mo26371b(h0Var);
            }
            this.f34342e.clear();
        }
        this.f34340c.mo32543b(exc);
    }

    /* renamed from: x */
    public void mo26369x(C7913h0 h0Var) {
        boolean equals = h0Var.mo26376e().equals(C7913h0.C7914a.SUCCESS);
        C10432b.m52648d(equals, "Expected success, but was " + h0Var.mo26376e(), new Object[0]);
        synchronized (this.f34338a) {
            this.f34339b = h0Var;
            for (C7911a b : this.f34342e) {
                b.mo26371b(this.f34339b);
            }
            this.f34342e.clear();
        }
        this.f34340c.mo32544c(h0Var);
    }

    /* renamed from: y */
    public void mo26370y(C7913h0 h0Var) {
        synchronized (this.f34338a) {
            this.f34339b = h0Var;
            for (C7911a b : this.f34342e) {
                b.mo26371b(h0Var);
            }
        }
    }
}
