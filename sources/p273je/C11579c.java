package p273je;

import java.io.IOException;
import java.net.ProtocolException;
import p244ge.C10360d0;
import p244ge.C10366f;
import p244ge.C10367f0;
import p244ge.C10370g0;
import p244ge.C10391u;
import p253he.C10539a;
import p282ke.C11635c;
import p282ke.C11641h;
import p336qe.C12231c;
import p336qe.C12236g;
import p336qe.C12237h;
import p336qe.C12241l;
import p336qe.C12251s;
import p336qe.C12252t;

/* renamed from: je.c */
/* compiled from: Exchange */
public final class C11579c {

    /* renamed from: a */
    final C11590k f44055a;

    /* renamed from: b */
    final C10366f f44056b;

    /* renamed from: c */
    final C10391u f44057c;

    /* renamed from: d */
    final C11582d f44058d;

    /* renamed from: e */
    final C11635c f44059e;

    /* renamed from: f */
    private boolean f44060f;

    /* renamed from: je.c$a */
    /* compiled from: Exchange */
    private final class C11580a extends C12236g {

        /* renamed from: b */
        private boolean f44061b;

        /* renamed from: c */
        private long f44062c;

        /* renamed from: d */
        private long f44063d;

        /* renamed from: e */
        private boolean f44064e;

        C11580a(C12251s sVar, long j) {
            super(sVar);
            this.f44062c = j;
        }

        /* renamed from: a */
        private IOException m56532a(IOException iOException) {
            if (this.f44061b) {
                return iOException;
            }
            this.f44061b = true;
            return C11579c.this.mo35676a(this.f44063d, false, true, iOException);
        }

        public void close() throws IOException {
            if (!this.f44064e) {
                this.f44064e = true;
                long j = this.f44062c;
                if (j == -1 || this.f44063d == j) {
                    try {
                        super.close();
                        m56532a((IOException) null);
                    } catch (IOException e) {
                        throw m56532a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m56532a(e);
            }
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            if (!this.f44064e) {
                long j2 = this.f44062c;
                if (j2 == -1 || this.f44063d + j <= j2) {
                    try {
                        super.mo35694k1(cVar, j);
                        this.f44063d += j;
                    } catch (IOException e) {
                        throw m56532a(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f44062c + " bytes but received " + (this.f44063d + j));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: je.c$b */
    /* compiled from: Exchange */
    final class C11581b extends C12237h {

        /* renamed from: b */
        private final long f44066b;

        /* renamed from: c */
        private long f44067c;

        /* renamed from: d */
        private boolean f44068d;

        /* renamed from: e */
        private boolean f44069e;

        C11581b(C12252t tVar, long j) {
            super(tVar);
            this.f44066b = j;
            if (j == 0) {
                mo35695b((IOException) null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IOException mo35695b(IOException iOException) {
            if (this.f44068d) {
                return iOException;
            }
            this.f44068d = true;
            return C11579c.this.mo35676a(this.f44067c, true, false, iOException);
        }

        public void close() throws IOException {
            if (!this.f44069e) {
                this.f44069e = true;
                try {
                    super.close();
                    mo35695b((IOException) null);
                } catch (IOException e) {
                    throw mo35695b(e);
                }
            }
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            if (!this.f44069e) {
                try {
                    long z = mo36851a().mo33810z(cVar, j);
                    if (z == -1) {
                        mo35695b((IOException) null);
                        return -1;
                    }
                    long j2 = this.f44067c + z;
                    long j3 = this.f44066b;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f44066b + " bytes but received " + j2);
                        }
                    }
                    this.f44067c = j2;
                    if (j2 == j3) {
                        mo35695b((IOException) null);
                    }
                    return z;
                } catch (IOException e) {
                    throw mo35695b(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public C11579c(C11590k kVar, C10366f fVar, C10391u uVar, C11582d dVar, C11635c cVar) {
        this.f44055a = kVar;
        this.f44056b = fVar;
        this.f44057c = uVar;
        this.f44058d = dVar;
        this.f44059e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IOException mo35676a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo35690o(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f44057c.mo33386p(this.f44056b, iOException);
            } else {
                this.f44057c.mo33384n(this.f44056b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f44057c.mo33391u(this.f44056b, iOException);
            } else {
                this.f44057c.mo33389s(this.f44056b, j);
            }
        }
        return this.f44055a.mo35738g(this, z2, z, iOException);
    }

    /* renamed from: b */
    public void mo35677b() {
        this.f44059e.cancel();
    }

    /* renamed from: c */
    public C11583e mo35678c() {
        return this.f44059e.mo35795f();
    }

    /* renamed from: d */
    public C12251s mo35679d(C10360d0 d0Var, boolean z) throws IOException {
        this.f44060f = z;
        long a = d0Var.mo33253a().mo33284a();
        this.f44057c.mo33385o(this.f44056b);
        return new C11580a(this.f44059e.mo35789a(d0Var, a), a);
    }

    /* renamed from: e */
    public void mo35680e() {
        this.f44059e.cancel();
        this.f44055a.mo35738g(this, true, true, (IOException) null);
    }

    /* renamed from: f */
    public void mo35681f() throws IOException {
        try {
            this.f44059e.mo35793d();
        } catch (IOException e) {
            this.f44057c.mo33386p(this.f44056b, e);
            mo35690o(e);
            throw e;
        }
    }

    /* renamed from: g */
    public void mo35682g() throws IOException {
        try {
            this.f44059e.mo35797h();
        } catch (IOException e) {
            this.f44057c.mo33386p(this.f44056b, e);
            mo35690o(e);
            throw e;
        }
    }

    /* renamed from: h */
    public boolean mo35683h() {
        return this.f44060f;
    }

    /* renamed from: i */
    public void mo35684i() {
        this.f44059e.mo35795f().mo35710p();
    }

    /* renamed from: j */
    public void mo35685j() {
        this.f44055a.mo35738g(this, true, false, (IOException) null);
    }

    /* renamed from: k */
    public C10370g0 mo35686k(C10367f0 f0Var) throws IOException {
        try {
            this.f44057c.mo33390t(this.f44056b);
            String h = f0Var.mo33294h("Content-Type");
            long c = this.f44059e.mo35791c(f0Var);
            return new C11641h(h, c, C12241l.m58807b(new C11581b(this.f44059e.mo35790b(f0Var), c)));
        } catch (IOException e) {
            this.f44057c.mo33391u(this.f44056b, e);
            mo35690o(e);
            throw e;
        }
    }

    /* renamed from: l */
    public C10367f0.C10368a mo35687l(boolean z) throws IOException {
        try {
            C10367f0.C10368a e = this.f44059e.mo35794e(z);
            if (e != null) {
                C10539a.f41555a.mo33234g(e, this);
            }
            return e;
        } catch (IOException e2) {
            this.f44057c.mo33391u(this.f44056b, e2);
            mo35690o(e2);
            throw e2;
        }
    }

    /* renamed from: m */
    public void mo35688m(C10367f0 f0Var) {
        this.f44057c.mo33392v(this.f44056b, f0Var);
    }

    /* renamed from: n */
    public void mo35689n() {
        this.f44057c.mo33393w(this.f44056b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo35690o(IOException iOException) {
        this.f44058d.mo35700h();
        this.f44059e.mo35795f().mo35715v(iOException);
    }

    /* renamed from: p */
    public void mo35691p(C10360d0 d0Var) throws IOException {
        try {
            this.f44057c.mo33388r(this.f44056b);
            this.f44059e.mo35796g(d0Var);
            this.f44057c.mo33387q(this.f44056b, d0Var);
        } catch (IOException e) {
            this.f44057c.mo33386p(this.f44056b, e);
            mo35690o(e);
            throw e;
        }
    }
}
