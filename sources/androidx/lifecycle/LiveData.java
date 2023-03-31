package androidx.lifecycle;

import androidx.lifecycle.C1208j;
import java.util.Map;
import p075k.C4834a;
import p082l.C4890b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f3255k = new Object();

    /* renamed from: a */
    final Object f3256a = new Object();

    /* renamed from: b */
    private C4890b<C1229u<? super T>, LiveData<T>.c> f3257b = new C4890b<>();

    /* renamed from: c */
    int f3258c = 0;

    /* renamed from: d */
    private boolean f3259d;

    /* renamed from: e */
    private volatile Object f3260e;

    /* renamed from: f */
    volatile Object f3261f;

    /* renamed from: g */
    private int f3262g;

    /* renamed from: h */
    private boolean f3263h;

    /* renamed from: i */
    private boolean f3264i;

    /* renamed from: j */
    private final Runnable f3265j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C1216l {

        /* renamed from: e */
        final C1220n f3266e;

        /* renamed from: f */
        final /* synthetic */ LiveData f3267f;

        /* renamed from: c */
        public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
            C1208j.C1211c b = this.f3266e.getLifecycle().mo4400b();
            if (b == C1208j.C1211c.DESTROYED) {
                this.f3267f.mo4353i(this.f3270a);
                return;
            }
            C1208j.C1211c cVar = null;
            while (cVar != b) {
                mo4358e(mo4356j());
                cVar = b;
                b = this.f3266e.getLifecycle().mo4400b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4355i() {
            this.f3266e.getLifecycle().mo4401c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo4356j() {
            return this.f3266e.getLifecycle().mo4400b().mo4403a(C1208j.C1211c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1170a implements Runnable {
        C1170a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3256a) {
                obj = LiveData.this.f3261f;
                LiveData.this.f3261f = LiveData.f3255k;
            }
            LiveData.this.mo4354j(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1171b extends LiveData<T>.c {
        C1171b(C1229u<? super T> uVar) {
            super(uVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo4356j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1172c {

        /* renamed from: a */
        final C1229u<? super T> f3270a;

        /* renamed from: b */
        boolean f3271b;

        /* renamed from: c */
        int f3272c = -1;

        C1172c(C1229u<? super T> uVar) {
            this.f3270a = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4358e(boolean z) {
            if (z != this.f3271b) {
                this.f3271b = z;
                LiveData.this.mo4347b(z ? 1 : -1);
                if (this.f3271b) {
                    LiveData.this.mo4348d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4355i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract boolean mo4356j();
    }

    public LiveData() {
        Object obj = f3255k;
        this.f3261f = obj;
        this.f3265j = new C1170a();
        this.f3260e = obj;
        this.f3262g = -1;
    }

    /* renamed from: a */
    static void m5324a(String str) {
        if (!C4834a.m30860e().mo18577b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m5325c(LiveData<T>.c cVar) {
        if (cVar.f3271b) {
            if (!cVar.mo4356j()) {
                cVar.mo4358e(false);
                return;
            }
            int i = cVar.f3272c;
            int i2 = this.f3262g;
            if (i < i2) {
                cVar.f3272c = i2;
                cVar.f3270a.mo3983a(this.f3260e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4347b(int i) {
        int i2 = this.f3258c;
        this.f3258c = i + i2;
        if (!this.f3259d) {
            this.f3259d = true;
            while (true) {
                try {
                    int i3 = this.f3258c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo4350f();
                        } else if (z2) {
                            mo4351g();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f3259d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4348d(LiveData<T>.c cVar) {
        if (this.f3263h) {
            this.f3264i = true;
            return;
        }
        this.f3263h = true;
        do {
            this.f3264i = false;
            if (cVar == null) {
                C4890b<K, V>.d f = this.f3257b.mo18685f();
                while (f.hasNext()) {
                    m5325c((C1172c) ((Map.Entry) f.next()).getValue());
                    if (this.f3264i) {
                        break;
                    }
                }
            } else {
                m5325c(cVar);
                cVar = null;
            }
        } while (this.f3264i);
        this.f3263h = false;
    }

    /* renamed from: e */
    public void mo4349e(C1229u<? super T> uVar) {
        m5324a("observeForever");
        C1171b bVar = new C1171b(uVar);
        C1172c k = this.f3257b.mo18679k(uVar, bVar);
        if (k instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (k == null) {
            bVar.mo4358e(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo4350f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo4351g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo4352h(T t) {
        boolean z;
        synchronized (this.f3256a) {
            z = this.f3261f == f3255k;
            this.f3261f = t;
        }
        if (z) {
            C4834a.m30860e().mo18578c(this.f3265j);
        }
    }

    /* renamed from: i */
    public void mo4353i(C1229u<? super T> uVar) {
        m5324a("removeObserver");
        C1172c l = this.f3257b.mo18680l(uVar);
        if (l != null) {
            l.mo4355i();
            l.mo4358e(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4354j(T t) {
        m5324a("setValue");
        this.f3262g++;
        this.f3260e = t;
        mo4348d((LiveData<T>.c) null);
    }
}
