package p291le;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p244ge.C10351a0;
import p244ge.C10360d0;
import p244ge.C10367f0;
import p244ge.C10395w;
import p244ge.C10397x;
import p253he.C10539a;
import p253he.C10543e;
import p273je.C11583e;
import p282ke.C11635c;
import p282ke.C11638e;
import p282ke.C11642i;
import p282ke.C11644k;
import p336qe.C12231c;
import p336qe.C12233d;
import p336qe.C12234e;
import p336qe.C12238i;
import p336qe.C12251s;
import p336qe.C12252t;
import p336qe.C12253u;

/* renamed from: le.a */
/* compiled from: Http1ExchangeCodec */
public final class C11790a implements C11635c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10351a0 f44437a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11583e f44438b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12234e f44439c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12233d f44440d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f44441e = 0;

    /* renamed from: f */
    private long f44442f = 262144;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10395w f44443g;

    /* renamed from: le.a$b */
    /* compiled from: Http1ExchangeCodec */
    private abstract class C11792b implements C12252t {

        /* renamed from: a */
        protected final C12238i f44444a;

        /* renamed from: b */
        protected boolean f44445b;

        private C11792b() {
            this.f44444a = new C12238i(C11790a.this.f44439c.mo33809o());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo36028a() {
            if (C11790a.this.f44441e != 6) {
                if (C11790a.this.f44441e == 5) {
                    C11790a.this.m57150s(this.f44444a);
                    int unused = C11790a.this.f44441e = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C11790a.this.f44441e);
            }
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return this.f44444a;
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            try {
                return C11790a.this.f44439c.mo33810z(cVar, j);
            } catch (IOException e) {
                C11790a.this.f44438b.mo35710p();
                mo36028a();
                throw e;
            }
        }
    }

    /* renamed from: le.a$c */
    /* compiled from: Http1ExchangeCodec */
    private final class C11793c implements C12251s {

        /* renamed from: a */
        private final C12238i f44447a;

        /* renamed from: b */
        private boolean f44448b;

        C11793c() {
            this.f44447a = new C12238i(C11790a.this.f44440d.mo36029o());
        }

        public synchronized void close() throws IOException {
            if (!this.f44448b) {
                this.f44448b = true;
                C11790a.this.f44440d.mo36821w0("0\r\n\r\n");
                C11790a.this.m57150s(this.f44447a);
                int unused = C11790a.this.f44441e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f44448b) {
                C11790a.this.f44440d.flush();
            }
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            if (this.f44448b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C11790a.this.f44440d.mo36768G0(j);
                C11790a.this.f44440d.mo36821w0("\r\n");
                C11790a.this.f44440d.mo35694k1(cVar, j);
                C11790a.this.f44440d.mo36821w0("\r\n");
            }
        }

        /* renamed from: o */
        public C12253u mo36029o() {
            return this.f44447a;
        }
    }

    /* renamed from: le.a$d */
    /* compiled from: Http1ExchangeCodec */
    private class C11794d extends C11792b {

        /* renamed from: d */
        private final C10397x f44450d;

        /* renamed from: e */
        private long f44451e = -1;

        /* renamed from: f */
        private boolean f44452f = true;

        C11794d(C10397x xVar) {
            super();
            this.f44450d = xVar;
        }

        /* renamed from: b */
        private void m57173b() throws IOException {
            if (this.f44451e != -1) {
                C11790a.this.f44439c.mo36781W0();
            }
            try {
                this.f44451e = C11790a.this.f44439c.mo36769G1();
                String trim = C11790a.this.f44439c.mo36781W0().trim();
                if (this.f44451e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f44451e + trim + "\"");
                } else if (this.f44451e == 0) {
                    this.f44452f = false;
                    C11790a aVar = C11790a.this;
                    C10395w unused = aVar.f44443g = aVar.m57157z();
                    C11638e.m56730e(C11790a.this.f44437a.mo33212g(), this.f44450d, C11790a.this.f44443g);
                    mo36028a();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f44445b) {
                if (this.f44452f && !C10543e.m53054o(this, 100, TimeUnit.MILLISECONDS)) {
                    C11790a.this.f44438b.mo35710p();
                    mo36028a();
                }
                this.f44445b = true;
            }
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f44445b) {
                throw new IllegalStateException("closed");
            } else if (!this.f44452f) {
                return -1;
            } else {
                long j2 = this.f44451e;
                if (j2 == 0 || j2 == -1) {
                    m57173b();
                    if (!this.f44452f) {
                        return -1;
                    }
                }
                long z = super.mo33810z(cVar, Math.min(j, this.f44451e));
                if (z != -1) {
                    this.f44451e -= z;
                    return z;
                }
                C11790a.this.f44438b.mo35710p();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo36028a();
                throw protocolException;
            }
        }
    }

    /* renamed from: le.a$e */
    /* compiled from: Http1ExchangeCodec */
    private class C11795e extends C11792b {

        /* renamed from: d */
        private long f44454d;

        C11795e(long j) {
            super();
            this.f44454d = j;
            if (j == 0) {
                mo36028a();
            }
        }

        public void close() throws IOException {
            if (!this.f44445b) {
                if (this.f44454d != 0 && !C10543e.m53054o(this, 100, TimeUnit.MILLISECONDS)) {
                    C11790a.this.f44438b.mo35710p();
                    mo36028a();
                }
                this.f44445b = true;
            }
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f44445b) {
                long j2 = this.f44454d;
                if (j2 == 0) {
                    return -1;
                }
                long z = super.mo33810z(cVar, Math.min(j2, j));
                if (z != -1) {
                    long j3 = this.f44454d - z;
                    this.f44454d = j3;
                    if (j3 == 0) {
                        mo36028a();
                    }
                    return z;
                }
                C11790a.this.f44438b.mo35710p();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo36028a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: le.a$f */
    /* compiled from: Http1ExchangeCodec */
    private final class C11796f implements C12251s {

        /* renamed from: a */
        private final C12238i f44456a;

        /* renamed from: b */
        private boolean f44457b;

        private C11796f() {
            this.f44456a = new C12238i(C11790a.this.f44440d.mo36029o());
        }

        public void close() throws IOException {
            if (!this.f44457b) {
                this.f44457b = true;
                C11790a.this.m57150s(this.f44456a);
                int unused = C11790a.this.f44441e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.f44457b) {
                C11790a.this.f44440d.flush();
            }
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            if (!this.f44457b) {
                C10543e.m53044e(cVar.mo36771I(), 0, j);
                C11790a.this.f44440d.mo35694k1(cVar, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        /* renamed from: o */
        public C12253u mo36029o() {
            return this.f44456a;
        }
    }

    /* renamed from: le.a$g */
    /* compiled from: Http1ExchangeCodec */
    private class C11797g extends C11792b {

        /* renamed from: d */
        private boolean f44459d;

        private C11797g() {
            super();
        }

        public void close() throws IOException {
            if (!this.f44445b) {
                if (!this.f44459d) {
                    mo36028a();
                }
                this.f44445b = true;
            }
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f44445b) {
                throw new IllegalStateException("closed");
            } else if (this.f44459d) {
                return -1;
            } else {
                long z = super.mo33810z(cVar, j);
                if (z != -1) {
                    return z;
                }
                this.f44459d = true;
                mo36028a();
                return -1;
            }
        }
    }

    public C11790a(C10351a0 a0Var, C11583e eVar, C12234e eVar2, C12233d dVar) {
        this.f44437a = a0Var;
        this.f44438b = eVar;
        this.f44439c = eVar2;
        this.f44440d = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m57150s(C12238i iVar) {
        C12253u i = iVar.mo36860i();
        iVar.mo36861j(C12253u.f45422d);
        i.mo36853a();
        i.mo36854b();
    }

    /* renamed from: t */
    private C12251s m57151t() {
        if (this.f44441e == 1) {
            this.f44441e = 2;
            return new C11793c();
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: u */
    private C12252t m57152u(C10397x xVar) {
        if (this.f44441e == 4) {
            this.f44441e = 5;
            return new C11794d(xVar);
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: v */
    private C12252t m57153v(long j) {
        if (this.f44441e == 4) {
            this.f44441e = 5;
            return new C11795e(j);
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: w */
    private C12251s m57154w() {
        if (this.f44441e == 1) {
            this.f44441e = 2;
            return new C11796f();
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: x */
    private C12252t m57155x() {
        if (this.f44441e == 4) {
            this.f44441e = 5;
            this.f44438b.mo35710p();
            return new C11797g();
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: y */
    private String m57156y() throws IOException {
        String l0 = this.f44439c.mo36805l0(this.f44442f);
        this.f44442f -= (long) l0.length();
        return l0;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public C10395w m57157z() throws IOException {
        C10395w.C10396a aVar = new C10395w.C10396a();
        while (true) {
            String y = m57156y();
            if (y.length() == 0) {
                return aVar.mo33413d();
            }
            C10539a.f41555a.mo33228a(aVar, y);
        }
    }

    /* renamed from: A */
    public void mo36026A(C10367f0 f0Var) throws IOException {
        long b = C11638e.m56727b(f0Var);
        if (b != -1) {
            C12252t v = m57153v(b);
            C10543e.m53032E(v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            v.close();
        }
    }

    /* renamed from: B */
    public void mo36027B(C10395w wVar, String str) throws IOException {
        if (this.f44441e == 0) {
            this.f44440d.mo36821w0(str).mo36821w0("\r\n");
            int h = wVar.mo33405h();
            for (int i = 0; i < h; i++) {
                this.f44440d.mo36821w0(wVar.mo33402e(i)).mo36821w0(": ").mo36821w0(wVar.mo33407i(i)).mo36821w0("\r\n");
            }
            this.f44440d.mo36821w0("\r\n");
            this.f44441e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f44441e);
    }

    /* renamed from: a */
    public C12251s mo35789a(C10360d0 d0Var, long j) throws IOException {
        if (d0Var.mo33253a() != null && d0Var.mo33253a().mo33286e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(d0Var.mo33255c("Transfer-Encoding"))) {
            return m57151t();
        } else {
            if (j != -1) {
                return m57154w();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: b */
    public C12252t mo35790b(C10367f0 f0Var) {
        if (!C11638e.m56728c(f0Var)) {
            return m57153v(0);
        }
        if ("chunked".equalsIgnoreCase(f0Var.mo33294h("Transfer-Encoding"))) {
            return m57152u(f0Var.mo33301w().mo33260h());
        }
        long b = C11638e.m56727b(f0Var);
        if (b != -1) {
            return m57153v(b);
        }
        return m57155x();
    }

    /* renamed from: c */
    public long mo35791c(C10367f0 f0Var) {
        if (!C11638e.m56728c(f0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(f0Var.mo33294h("Transfer-Encoding"))) {
            return -1;
        }
        return C11638e.m56727b(f0Var);
    }

    public void cancel() {
        C11583e eVar = this.f44438b;
        if (eVar != null) {
            eVar.mo35703c();
        }
    }

    /* renamed from: d */
    public void mo35793d() throws IOException {
        this.f44440d.flush();
    }

    /* renamed from: e */
    public C10367f0.C10368a mo35794e(boolean z) throws IOException {
        int i = this.f44441e;
        if (i == 1 || i == 3) {
            try {
                C11644k a = C11644k.m56758a(m57156y());
                C10367f0.C10368a j = new C10367f0.C10368a().mo33315o(a.f44217a).mo33307g(a.f44218b).mo33312l(a.f44219c).mo33310j(m57157z());
                if (z && a.f44218b == 100) {
                    return null;
                }
                if (a.f44218b == 100) {
                    this.f44441e = 3;
                    return j;
                }
                this.f44441e = 4;
                return j;
            } catch (EOFException e) {
                C11583e eVar = this.f44438b;
                String z2 = eVar != null ? eVar.mo35711q().mo33335a().mo33199l().mo33434z() : "unknown";
                throw new IOException("unexpected end of stream on " + z2, e);
            }
        } else {
            throw new IllegalStateException("state: " + this.f44441e);
        }
    }

    /* renamed from: f */
    public C11583e mo35795f() {
        return this.f44438b;
    }

    /* renamed from: g */
    public void mo35796g(C10360d0 d0Var) throws IOException {
        mo36027B(d0Var.mo33256d(), C11642i.m56749a(d0Var, this.f44438b.mo35711q().mo33336b().type()));
    }

    /* renamed from: h */
    public void mo35797h() throws IOException {
        this.f44440d.flush();
    }
}
