package p244ge;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p253he.C10543e;

/* renamed from: ge.m */
/* compiled from: ConnectionSpec */
public final class C10381m {

    /* renamed from: e */
    private static final C10378j[] f41259e;

    /* renamed from: f */
    private static final C10378j[] f41260f;

    /* renamed from: g */
    public static final C10381m f41261g;

    /* renamed from: h */
    public static final C10381m f41262h;

    /* renamed from: i */
    public static final C10381m f41263i;

    /* renamed from: j */
    public static final C10381m f41264j = new C10382a(false).mo33353a();

    /* renamed from: a */
    final boolean f41265a;

    /* renamed from: b */
    final boolean f41266b;

    /* renamed from: c */
    final String[] f41267c;

    /* renamed from: d */
    final String[] f41268d;

    static {
        C10378j jVar = C10378j.f41228n1;
        C10378j jVar2 = C10378j.f41231o1;
        C10378j jVar3 = C10378j.f41234p1;
        C10378j jVar4 = C10378j.f41187Z0;
        C10378j jVar5 = C10378j.f41198d1;
        C10378j jVar6 = C10378j.f41189a1;
        C10378j jVar7 = C10378j.f41201e1;
        C10378j jVar8 = C10378j.f41219k1;
        C10378j jVar9 = C10378j.f41216j1;
        C10378j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        f41259e = jVarArr;
        C10378j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, C10378j.f41157K0, C10378j.f41159L0, C10378j.f41212i0, C10378j.f41215j0, C10378j.f41148G, C10378j.f41156K, C10378j.f41217k};
        f41260f = jVarArr2;
        C10382a b = new C10382a(true).mo33354b(jVarArr);
        C10377i0 i0Var = C10377i0.TLS_1_3;
        C10377i0 i0Var2 = C10377i0.TLS_1_2;
        f41261g = b.mo33357e(i0Var, i0Var2).mo33356d(true).mo33353a();
        f41262h = new C10382a(true).mo33354b(jVarArr2).mo33357e(i0Var, i0Var2).mo33356d(true).mo33353a();
        f41263i = new C10382a(true).mo33354b(jVarArr2).mo33357e(i0Var, i0Var2, C10377i0.TLS_1_1, C10377i0.TLS_1_0).mo33356d(true).mo33353a();
    }

    C10381m(C10382a aVar) {
        this.f41265a = aVar.f41269a;
        this.f41267c = aVar.f41270b;
        this.f41268d = aVar.f41271c;
        this.f41266b = aVar.f41272d;
    }

    /* renamed from: e */
    private C10381m m52419e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f41267c != null) {
            strArr = C10543e.m53064y(C10378j.f41190b, sSLSocket.getEnabledCipherSuites(), this.f41267c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f41268d != null) {
            strArr2 = C10543e.m53064y(C10543e.f41569j, sSLSocket.getEnabledProtocols(), this.f41268d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int v = C10543e.m53061v(C10378j.f41190b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && v != -1) {
            strArr = C10543e.m53047h(strArr, supportedCipherSuites[v]);
        }
        return new C10382a(this).mo33355c(strArr).mo33358f(strArr2).mo33353a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33344a(SSLSocket sSLSocket, boolean z) {
        C10381m e = m52419e(sSLSocket, z);
        String[] strArr = e.f41268d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e.f41267c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<C10378j> mo33345b() {
        String[] strArr = this.f41267c;
        if (strArr != null) {
            return C10378j.m52415c(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo33346c(SSLSocket sSLSocket) {
        if (!this.f41265a) {
            return false;
        }
        String[] strArr = this.f41268d;
        if (strArr != null && !C10543e.m53029B(C10543e.f41569j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f41267c;
        if (strArr2 == null || C10543e.m53029B(C10378j.f41190b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo33347d() {
        return this.f41265a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10381m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C10381m mVar = (C10381m) obj;
        boolean z = this.f41265a;
        if (z != mVar.f41265a) {
            return false;
        }
        return !z || (Arrays.equals(this.f41267c, mVar.f41267c) && Arrays.equals(this.f41268d, mVar.f41268d) && this.f41266b == mVar.f41266b);
    }

    /* renamed from: f */
    public boolean mo33349f() {
        return this.f41266b;
    }

    /* renamed from: g */
    public List<C10377i0> mo33350g() {
        String[] strArr = this.f41268d;
        if (strArr != null) {
            return C10377i0.m52412b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f41265a) {
            return ((((527 + Arrays.hashCode(this.f41267c)) * 31) + Arrays.hashCode(this.f41268d)) * 31) + (this.f41266b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f41265a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(mo33345b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(mo33350g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f41266b + ")";
    }

    /* renamed from: ge.m$a */
    /* compiled from: ConnectionSpec */
    public static final class C10382a {

        /* renamed from: a */
        boolean f41269a;

        /* renamed from: b */
        String[] f41270b;

        /* renamed from: c */
        String[] f41271c;

        /* renamed from: d */
        boolean f41272d;

        C10382a(boolean z) {
            this.f41269a = z;
        }

        /* renamed from: a */
        public C10381m mo33353a() {
            return new C10381m(this);
        }

        /* renamed from: b */
        public C10382a mo33354b(C10378j... jVarArr) {
            if (this.f41269a) {
                String[] strArr = new String[jVarArr.length];
                for (int i = 0; i < jVarArr.length; i++) {
                    strArr[i] = jVarArr[i].f41257a;
                }
                return mo33355c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: c */
        public C10382a mo33355c(String... strArr) {
            if (!this.f41269a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f41270b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: d */
        public C10382a mo33356d(boolean z) {
            if (this.f41269a) {
                this.f41272d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C10382a mo33357e(C10377i0... i0VarArr) {
            if (this.f41269a) {
                String[] strArr = new String[i0VarArr.length];
                for (int i = 0; i < i0VarArr.length; i++) {
                    strArr[i] = i0VarArr[i].f41135a;
                }
                return mo33358f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: f */
        public C10382a mo33358f(String... strArr) {
            if (!this.f41269a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f41271c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public C10382a(C10381m mVar) {
            this.f41269a = mVar.f41265a;
            this.f41270b = mVar.f41267c;
            this.f41271c = mVar.f41268d;
            this.f41272d = mVar.f41266b;
        }
    }
}
