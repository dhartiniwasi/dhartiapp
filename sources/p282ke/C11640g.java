package p282ke;

import java.io.IOException;
import java.util.List;
import p244ge.C10360d0;
import p244ge.C10366f;
import p244ge.C10367f0;
import p244ge.C10399y;
import p273je.C11579c;
import p273je.C11590k;

/* renamed from: ke.g */
/* compiled from: RealInterceptorChain */
public final class C11640g implements C10399y.C10400a {

    /* renamed from: a */
    private final List<C10399y> f44203a;

    /* renamed from: b */
    private final C11590k f44204b;

    /* renamed from: c */
    private final C11579c f44205c;

    /* renamed from: d */
    private final int f44206d;

    /* renamed from: e */
    private final C10360d0 f44207e;

    /* renamed from: f */
    private final C10366f f44208f;

    /* renamed from: g */
    private final int f44209g;

    /* renamed from: h */
    private final int f44210h;

    /* renamed from: i */
    private final int f44211i;

    /* renamed from: j */
    private int f44212j;

    public C11640g(List<C10399y> list, C11590k kVar, C11579c cVar, int i, C10360d0 d0Var, C10366f fVar, int i2, int i3, int i4) {
        this.f44203a = list;
        this.f44204b = kVar;
        this.f44205c = cVar;
        this.f44206d = i;
        this.f44207e = d0Var;
        this.f44208f = fVar;
        this.f44209g = i2;
        this.f44210h = i3;
        this.f44211i = i4;
    }

    /* renamed from: a */
    public int mo33447a() {
        return this.f44210h;
    }

    /* renamed from: b */
    public int mo33448b() {
        return this.f44211i;
    }

    /* renamed from: c */
    public C10367f0 mo33449c(C10360d0 d0Var) throws IOException {
        return mo35801g(d0Var, this.f44204b, this.f44205c);
    }

    /* renamed from: d */
    public int mo33450d() {
        return this.f44209g;
    }

    /* renamed from: e */
    public C10360d0 mo33451e() {
        return this.f44207e;
    }

    /* renamed from: f */
    public C11579c mo35800f() {
        C11579c cVar = this.f44205c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public C10367f0 mo35801g(C10360d0 d0Var, C11590k kVar, C11579c cVar) throws IOException {
        if (this.f44206d < this.f44203a.size()) {
            this.f44212j++;
            C11579c cVar2 = this.f44205c;
            if (cVar2 != null && !cVar2.mo35678c().mo35714u(d0Var.mo33260h())) {
                throw new IllegalStateException("network interceptor " + this.f44203a.get(this.f44206d - 1) + " must retain the same host and port");
            } else if (this.f44205c == null || this.f44212j <= 1) {
                C11640g gVar = new C11640g(this.f44203a, kVar, cVar, this.f44206d + 1, d0Var, this.f44208f, this.f44209g, this.f44210h, this.f44211i);
                C10399y yVar = this.f44203a.get(this.f44206d);
                C10367f0 a = yVar.mo33446a(gVar);
                if (cVar != null && this.f44206d + 1 < this.f44203a.size() && gVar.f44212j != 1) {
                    throw new IllegalStateException("network interceptor " + yVar + " must call proceed() exactly once");
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + yVar + " returned null");
                } else if (a.mo33289a() != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + yVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f44203a.get(this.f44206d - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: h */
    public C11590k mo35802h() {
        return this.f44204b;
    }
}
