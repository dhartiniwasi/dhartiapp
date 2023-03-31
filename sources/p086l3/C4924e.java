package p086l3;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p021c2.C1850h;
import p079k3.C4874h;
import p079k3.C4875i;
import p079k3.C4876j;
import p079k3.C4879l;
import p079k3.C4880m;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: l3.e */
/* compiled from: CeaDecoder */
abstract class C4924e implements C4875i {

    /* renamed from: a */
    private final ArrayDeque<C4926b> f25994a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<C4880m> f25995b;

    /* renamed from: c */
    private final PriorityQueue<C4926b> f25996c;

    /* renamed from: d */
    private C4926b f25997d;

    /* renamed from: e */
    private long f25998e;

    /* renamed from: f */
    private long f25999f;

    /* renamed from: l3.e$b */
    /* compiled from: CeaDecoder */
    private static final class C4926b extends C4879l implements Comparable<C4926b> {
        /* access modifiers changed from: private */

        /* renamed from: r */
        public long f26000r;

        private C4926b() {
        }

        /* renamed from: D */
        public int compareTo(C4926b bVar) {
            if (mo7034s() == bVar.mo7034s()) {
                long j = this.f5432e - bVar.f5432e;
                if (j == 0) {
                    j = this.f26000r - bVar.f26000r;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
                return -1;
            } else if (mo7034s()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: l3.e$c */
    /* compiled from: CeaDecoder */
    private static final class C4927c extends C4880m {

        /* renamed from: f */
        private C1850h.C1851a<C4927c> f26001f;

        public C4927c(C1850h.C1851a<C4927c> aVar) {
            this.f26001f = aVar;
        }

        /* renamed from: w */
        public final void mo7053w() {
            this.f26001f.mo7054a(this);
        }
    }

    public C4924e() {
        for (int i = 0; i < 10; i++) {
            this.f25994a.add(new C4926b());
        }
        this.f25995b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f25995b.add(new C4927c(new C11757d(this)));
        }
        this.f25996c = new PriorityQueue<>();
    }

    /* renamed from: n */
    private void m31288n(C4926b bVar) {
        bVar.mo7029n();
        this.f25994a.add(bVar);
    }

    /* renamed from: a */
    public void mo7041a() {
    }

    /* renamed from: b */
    public void mo18644b(long j) {
        this.f25998e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C4874h mo18741f();

    public void flush() {
        this.f25999f = 0;
        this.f25998e = 0;
        while (!this.f25996c.isEmpty()) {
            m31288n((C4926b) C5953m0.m35138j(this.f25996c.poll()));
        }
        C4926b bVar = this.f25997d;
        if (bVar != null) {
            m31288n(bVar);
            this.f25997d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo18742g(C4879l lVar);

    /* renamed from: h */
    public C4879l mo7043d() throws C4876j {
        C5917a.m34873f(this.f25997d == null);
        if (this.f25994a.isEmpty()) {
            return null;
        }
        C4926b pollFirst = this.f25994a.pollFirst();
        this.f25997d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public C4880m mo7042c() throws C4876j {
        if (this.f25995b.isEmpty()) {
            return null;
        }
        while (!this.f25996c.isEmpty() && ((C4926b) C5953m0.m35138j(this.f25996c.peek())).f5432e <= this.f25998e) {
            C4926b bVar = (C4926b) C5953m0.m35138j(this.f25996c.poll());
            if (bVar.mo7034s()) {
                C4880m mVar = (C4880m) C5953m0.m35138j(this.f25995b.pollFirst());
                mVar.mo7028k(4);
                m31288n(bVar);
                return mVar;
            }
            mo18742g(bVar);
            if (mo18745l()) {
                C4874h f = mo18741f();
                C4880m mVar2 = (C4880m) C5953m0.m35138j(this.f25995b.pollFirst());
                mVar2.mo18659x(bVar.f5432e, f, Long.MAX_VALUE);
                m31288n(bVar);
                return mVar2;
            }
            m31288n(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C4880m mo18771j() {
        return this.f25995b.pollFirst();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo18772k() {
        return this.f25998e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo18745l();

    /* renamed from: m */
    public void mo7044e(C4879l lVar) throws C4876j {
        C5917a.m34868a(lVar == this.f25997d);
        C4926b bVar = (C4926b) lVar;
        if (bVar.mo7033r()) {
            m31288n(bVar);
        } else {
            long j = this.f25999f;
            this.f25999f = 1 + j;
            long unused = bVar.f26000r = j;
            this.f25996c.add(bVar);
        }
        this.f25997d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18773o(C4880m mVar) {
        mVar.mo7029n();
        this.f25995b.add(mVar);
    }
}
