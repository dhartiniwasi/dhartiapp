package p244ge;

import java.io.Closeable;
import p244ge.C10395w;
import p273je.C11579c;

/* renamed from: ge.f0 */
/* compiled from: Response */
public final class C10367f0 implements Closeable {

    /* renamed from: a */
    final C10360d0 f41088a;

    /* renamed from: b */
    final C10355b0 f41089b;

    /* renamed from: c */
    final int f41090c;

    /* renamed from: d */
    final String f41091d;

    /* renamed from: e */
    final C10394v f41092e;

    /* renamed from: f */
    final C10395w f41093f;

    /* renamed from: g */
    final C10370g0 f41094g;

    /* renamed from: h */
    final C10367f0 f41095h;

    /* renamed from: i */
    final C10367f0 f41096i;

    /* renamed from: r */
    final C10367f0 f41097r;

    /* renamed from: s */
    final long f41098s;

    /* renamed from: t */
    final long f41099t;

    /* renamed from: u */
    final C11579c f41100u;

    /* renamed from: v */
    private volatile C10362e f41101v;

    C10367f0(C10368a aVar) {
        this.f41088a = aVar.f41102a;
        this.f41089b = aVar.f41103b;
        this.f41090c = aVar.f41104c;
        this.f41091d = aVar.f41105d;
        this.f41092e = aVar.f41106e;
        this.f41093f = aVar.f41107f.mo33413d();
        this.f41094g = aVar.f41108g;
        this.f41095h = aVar.f41109h;
        this.f41096i = aVar.f41110i;
        this.f41097r = aVar.f41111j;
        this.f41098s = aVar.f41112k;
        this.f41099t = aVar.f41113l;
        this.f41100u = aVar.f41114m;
    }

    /* renamed from: a */
    public C10370g0 mo33289a() {
        return this.f41094g;
    }

    /* renamed from: b */
    public C10362e mo33290b() {
        C10362e eVar = this.f41101v;
        if (eVar != null) {
            return eVar;
        }
        C10362e k = C10362e.m52334k(this.f41093f);
        this.f41101v = k;
        return k;
    }

    public void close() {
        C10370g0 g0Var = this.f41094g;
        if (g0Var != null) {
            g0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: f */
    public int mo33292f() {
        return this.f41090c;
    }

    /* renamed from: g */
    public C10394v mo33293g() {
        return this.f41092e;
    }

    /* renamed from: h */
    public String mo33294h(String str) {
        return mo33295m(str, (String) null);
    }

    /* renamed from: m */
    public String mo33295m(String str, String str2) {
        String c = this.f41093f.mo33401c(str);
        return c != null ? c : str2;
    }

    /* renamed from: n */
    public C10395w mo33296n() {
        return this.f41093f;
    }

    /* renamed from: p */
    public C10368a mo33297p() {
        return new C10368a(this);
    }

    /* renamed from: q */
    public C10367f0 mo33298q() {
        return this.f41097r;
    }

    /* renamed from: t */
    public long mo33299t() {
        return this.f41099t;
    }

    public String toString() {
        return "Response{protocol=" + this.f41089b + ", code=" + this.f41090c + ", message=" + this.f41091d + ", url=" + this.f41088a.mo33260h() + '}';
    }

    /* renamed from: w */
    public C10360d0 mo33301w() {
        return this.f41088a;
    }

    /* renamed from: x */
    public long mo33302x() {
        return this.f41098s;
    }

    /* renamed from: ge.f0$a */
    /* compiled from: Response */
    public static class C10368a {

        /* renamed from: a */
        C10360d0 f41102a;

        /* renamed from: b */
        C10355b0 f41103b;

        /* renamed from: c */
        int f41104c;

        /* renamed from: d */
        String f41105d;

        /* renamed from: e */
        C10394v f41106e;

        /* renamed from: f */
        C10395w.C10396a f41107f;

        /* renamed from: g */
        C10370g0 f41108g;

        /* renamed from: h */
        C10367f0 f41109h;

        /* renamed from: i */
        C10367f0 f41110i;

        /* renamed from: j */
        C10367f0 f41111j;

        /* renamed from: k */
        long f41112k;

        /* renamed from: l */
        long f41113l;

        /* renamed from: m */
        C11579c f41114m;

        public C10368a() {
            this.f41104c = -1;
            this.f41107f = new C10395w.C10396a();
        }

        /* renamed from: e */
        private void m52371e(C10367f0 f0Var) {
            if (f0Var.f41094g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m52372f(String str, C10367f0 f0Var) {
            if (f0Var.f41094g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (f0Var.f41095h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (f0Var.f41096i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (f0Var.f41097r != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: a */
        public C10368a mo33303a(String str, String str2) {
            this.f41107f.mo33410a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C10368a mo33304b(C10370g0 g0Var) {
            this.f41108g = g0Var;
            return this;
        }

        /* renamed from: c */
        public C10367f0 mo33305c() {
            if (this.f41102a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f41103b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f41104c < 0) {
                throw new IllegalStateException("code < 0: " + this.f41104c);
            } else if (this.f41105d != null) {
                return new C10367f0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: d */
        public C10368a mo33306d(C10367f0 f0Var) {
            if (f0Var != null) {
                m52372f("cacheResponse", f0Var);
            }
            this.f41110i = f0Var;
            return this;
        }

        /* renamed from: g */
        public C10368a mo33307g(int i) {
            this.f41104c = i;
            return this;
        }

        /* renamed from: h */
        public C10368a mo33308h(C10394v vVar) {
            this.f41106e = vVar;
            return this;
        }

        /* renamed from: i */
        public C10368a mo33309i(String str, String str2) {
            this.f41107f.mo33415f(str, str2);
            return this;
        }

        /* renamed from: j */
        public C10368a mo33310j(C10395w wVar) {
            this.f41107f = wVar.mo33404f();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo33311k(C11579c cVar) {
            this.f41114m = cVar;
        }

        /* renamed from: l */
        public C10368a mo33312l(String str) {
            this.f41105d = str;
            return this;
        }

        /* renamed from: m */
        public C10368a mo33313m(C10367f0 f0Var) {
            if (f0Var != null) {
                m52372f("networkResponse", f0Var);
            }
            this.f41109h = f0Var;
            return this;
        }

        /* renamed from: n */
        public C10368a mo33314n(C10367f0 f0Var) {
            if (f0Var != null) {
                m52371e(f0Var);
            }
            this.f41111j = f0Var;
            return this;
        }

        /* renamed from: o */
        public C10368a mo33315o(C10355b0 b0Var) {
            this.f41103b = b0Var;
            return this;
        }

        /* renamed from: p */
        public C10368a mo33316p(long j) {
            this.f41113l = j;
            return this;
        }

        /* renamed from: q */
        public C10368a mo33317q(C10360d0 d0Var) {
            this.f41102a = d0Var;
            return this;
        }

        /* renamed from: r */
        public C10368a mo33318r(long j) {
            this.f41112k = j;
            return this;
        }

        C10368a(C10367f0 f0Var) {
            this.f41104c = -1;
            this.f41102a = f0Var.f41088a;
            this.f41103b = f0Var.f41089b;
            this.f41104c = f0Var.f41090c;
            this.f41105d = f0Var.f41091d;
            this.f41106e = f0Var.f41092e;
            this.f41107f = f0Var.f41093f.mo33404f();
            this.f41108g = f0Var.f41094g;
            this.f41109h = f0Var.f41095h;
            this.f41110i = f0Var.f41096i;
            this.f41111j = f0Var.f41097r;
            this.f41112k = f0Var.f41098s;
            this.f41113l = f0Var.f41099t;
            this.f41114m = f0Var.f41100u;
        }
    }
}
