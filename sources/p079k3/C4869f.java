package p079k3;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import p161w3.C5917a;
import p190b7.C6685q;

/* renamed from: k3.f */
/* compiled from: ExoplayerCuesDecoder */
public final class C4869f implements C4875i {

    /* renamed from: a */
    private final C4867c f25795a = new C4867c();

    /* renamed from: b */
    private final C4879l f25796b = new C4879l();

    /* renamed from: c */
    private final Deque<C4880m> f25797c = new ArrayDeque();

    /* renamed from: d */
    private int f25798d;

    /* renamed from: e */
    private boolean f25799e;

    /* renamed from: k3.f$a */
    /* compiled from: ExoplayerCuesDecoder */
    class C4870a extends C4880m {
        C4870a() {
        }

        /* renamed from: w */
        public void mo7053w() {
            C4869f.this.m31000j(this);
        }
    }

    /* renamed from: k3.f$b */
    /* compiled from: ExoplayerCuesDecoder */
    private static final class C4871b implements C4874h {

        /* renamed from: a */
        private final long f25801a;

        /* renamed from: b */
        private final C6685q<C4864b> f25802b;

        public C4871b(long j, C6685q<C4864b> qVar) {
            this.f25801a = j;
            this.f25802b = qVar;
        }

        /* renamed from: a */
        public int mo18648a(long j) {
            return this.f25801a > j ? 0 : -1;
        }

        /* renamed from: b */
        public long mo18649b(int i) {
            C5917a.m34868a(i == 0);
            return this.f25801a;
        }

        /* renamed from: c */
        public List<C4864b> mo18650c(long j) {
            return j >= this.f25801a ? this.f25802b : C6685q.m38445x();
        }

        /* renamed from: j */
        public int mo18651j() {
            return 1;
        }
    }

    public C4869f() {
        for (int i = 0; i < 2; i++) {
            this.f25797c.addFirst(new C4870a());
        }
        this.f25798d = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m31000j(C4880m mVar) {
        C5917a.m34873f(this.f25797c.size() < 2);
        C5917a.m34868a(!this.f25797c.contains(mVar));
        mVar.mo7029n();
        this.f25797c.addFirst(mVar);
    }

    /* renamed from: a */
    public void mo7041a() {
        this.f25799e = true;
    }

    /* renamed from: b */
    public void mo18644b(long j) {
    }

    public void flush() {
        C5917a.m34873f(!this.f25799e);
        this.f25796b.mo7029n();
        this.f25798d = 0;
    }

    /* renamed from: g */
    public C4879l mo7043d() throws C4876j {
        C5917a.m34873f(!this.f25799e);
        if (this.f25798d != 0) {
            return null;
        }
        this.f25798d = 1;
        return this.f25796b;
    }

    /* renamed from: h */
    public C4880m mo7042c() throws C4876j {
        C5917a.m34873f(!this.f25799e);
        if (this.f25798d != 2 || this.f25797c.isEmpty()) {
            return null;
        }
        C4880m removeFirst = this.f25797c.removeFirst();
        if (this.f25796b.mo7034s()) {
            removeFirst.mo7028k(4);
        } else {
            C4879l lVar = this.f25796b;
            C4871b bVar = new C4871b(lVar.f5432e, this.f25795a.mo18643a(((ByteBuffer) C5917a.m34872e(lVar.f5430c)).array()));
            removeFirst.mo18659x(this.f25796b.f5432e, bVar, 0);
        }
        this.f25796b.mo7029n();
        this.f25798d = 0;
        return removeFirst;
    }

    /* renamed from: i */
    public void mo7044e(C4879l lVar) throws C4876j {
        boolean z = true;
        C5917a.m34873f(!this.f25799e);
        C5917a.m34873f(this.f25798d == 1);
        if (this.f25796b != lVar) {
            z = false;
        }
        C5917a.m34868a(z);
        this.f25798d = 2;
    }
}
