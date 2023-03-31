package p161w3;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p161w3.C5948l;

/* renamed from: w3.q */
/* compiled from: ListenerSet */
public final class C5957q<T> {

    /* renamed from: a */
    private final C5923d f29125a;

    /* renamed from: b */
    private final C5954n f29126b;

    /* renamed from: c */
    private final C5959b<T> f29127c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<C5960c<T>> f29128d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f29129e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f29130f;

    /* renamed from: g */
    private boolean f29131g;

    /* renamed from: w3.q$a */
    /* compiled from: ListenerSet */
    public interface C5958a<T> {
        void invoke(T t);
    }

    /* renamed from: w3.q$b */
    /* compiled from: ListenerSet */
    public interface C5959b<T> {
        /* renamed from: a */
        void mo139a(T t, C5948l lVar);
    }

    /* renamed from: w3.q$c */
    /* compiled from: ListenerSet */
    private static final class C5960c<T> {

        /* renamed from: a */
        public final T f29132a;

        /* renamed from: b */
        private C5948l.C5950b f29133b = new C5948l.C5950b();

        /* renamed from: c */
        private boolean f29134c;

        /* renamed from: d */
        private boolean f29135d;

        public C5960c(T t) {
            this.f29132a = t;
        }

        /* renamed from: a */
        public void mo20651a(int i, C5958a<T> aVar) {
            if (!this.f29135d) {
                if (i != -1) {
                    this.f29133b.mo20639a(i);
                }
                this.f29134c = true;
                aVar.invoke(this.f29132a);
            }
        }

        /* renamed from: b */
        public void mo20652b(C5959b<T> bVar) {
            if (!this.f29135d && this.f29134c) {
                C5948l e = this.f29133b.mo20643e();
                this.f29133b = new C5948l.C5950b();
                this.f29134c = false;
                bVar.mo139a(this.f29132a, e);
            }
        }

        /* renamed from: c */
        public void mo20653c(C5959b<T> bVar) {
            this.f29135d = true;
            if (this.f29134c) {
                bVar.mo139a(this.f29132a, this.f29133b.mo20643e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5960c.class != obj.getClass()) {
                return false;
            }
            return this.f29132a.equals(((C5960c) obj).f29132a);
        }

        public int hashCode() {
            return this.f29132a.hashCode();
        }
    }

    public C5957q(Looper looper, C5923d dVar, C5959b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m35194g(Message message) {
        Iterator<C5960c<T>> it = this.f29128d.iterator();
        while (it.hasNext()) {
            it.next().mo20652b(this.f29127c);
            if (this.f29126b.mo20600d(0)) {
                return true;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m35195h(CopyOnWriteArraySet copyOnWriteArraySet, int i, C5958a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C5960c) it.next()).mo20651a(i, aVar);
        }
    }

    /* renamed from: c */
    public void mo20644c(T t) {
        if (!this.f29131g) {
            C5917a.m34872e(t);
            this.f29128d.add(new C5960c(t));
        }
    }

    /* renamed from: d */
    public C5957q<T> mo20645d(Looper looper, C5923d dVar, C5959b<T> bVar) {
        return new C5957q<>(this.f29128d, looper, dVar, bVar);
    }

    /* renamed from: e */
    public C5957q<T> mo20646e(Looper looper, C5959b<T> bVar) {
        return mo20645d(looper, this.f29125a, bVar);
    }

    /* renamed from: f */
    public void mo20647f() {
        if (!this.f29130f.isEmpty()) {
            if (!this.f29126b.mo20600d(0)) {
                C5954n nVar = this.f29126b;
                nVar.mo20603g(nVar.mo20599c(0));
            }
            boolean z = !this.f29129e.isEmpty();
            this.f29129e.addAll(this.f29130f);
            this.f29130f.clear();
            if (!z) {
                while (!this.f29129e.isEmpty()) {
                    this.f29129e.peekFirst().run();
                    this.f29129e.removeFirst();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo20648i(int i, C5958a<T> aVar) {
        this.f29130f.add(new C12905p(new CopyOnWriteArraySet(this.f29128d), i, aVar));
    }

    /* renamed from: j */
    public void mo20649j() {
        Iterator<C5960c<T>> it = this.f29128d.iterator();
        while (it.hasNext()) {
            it.next().mo20653c(this.f29127c);
        }
        this.f29128d.clear();
        this.f29131g = true;
    }

    /* renamed from: k */
    public void mo20650k(int i, C5958a<T> aVar) {
        mo20648i(i, aVar);
        mo20647f();
    }

    private C5957q(CopyOnWriteArraySet<C5960c<T>> copyOnWriteArraySet, Looper looper, C5923d dVar, C5959b<T> bVar) {
        this.f29125a = dVar;
        this.f29128d = copyOnWriteArraySet;
        this.f29127c = bVar;
        this.f29129e = new ArrayDeque<>();
        this.f29130f = new ArrayDeque<>();
        this.f29126b = dVar.mo20587c(looper, new C12904o(this));
    }
}
