package p371uc;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: uc.b */
/* compiled from: ConnectionSpec */
public final class C12726b {

    /* renamed from: e */
    private static final C12725a[] f46630e;

    /* renamed from: f */
    public static final C12726b f46631f;

    /* renamed from: g */
    public static final C12726b f46632g;

    /* renamed from: h */
    public static final C12726b f46633h = new C12728b(false).mo37636e();

    /* renamed from: a */
    final boolean f46634a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f46635b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f46636c;

    /* renamed from: d */
    final boolean f46637d;

    static {
        C12725a[] aVarArr = {C12725a.TLS_AES_128_GCM_SHA256, C12725a.TLS_AES_256_GCM_SHA384, C12725a.TLS_CHACHA20_POLY1305_SHA256, C12725a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C12725a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C12725a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C12725a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C12725a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, C12725a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, C12725a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C12725a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C12725a.TLS_RSA_WITH_AES_128_GCM_SHA256, C12725a.TLS_RSA_WITH_AES_256_GCM_SHA384, C12725a.TLS_RSA_WITH_AES_128_CBC_SHA, C12725a.TLS_RSA_WITH_AES_256_CBC_SHA, C12725a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f46630e = aVarArr;
        C12728b g = new C12728b(true).mo37638g(aVarArr);
        C12747k kVar = C12747k.TLS_1_3;
        C12747k kVar2 = C12747k.TLS_1_2;
        C12726b e = g.mo37641j(kVar, kVar2).mo37639h(true).mo37636e();
        f46631f = e;
        f46632g = new C12728b(e).mo37641j(kVar, kVar2, C12747k.TLS_1_1, C12747k.TLS_1_0).mo37639h(true).mo37636e();
    }

    /* renamed from: e */
    private C12726b m60353e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f46635b != null) {
            strArr = (String[]) C12748l.m60430c(cls, this.f46635b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C12728b(this).mo37637f(strArr).mo37640i((String[]) C12748l.m60430c(cls, this.f46636c, enabledProtocols)).mo37636e();
    }

    /* renamed from: c */
    public void mo37629c(SSLSocket sSLSocket, boolean z) {
        C12726b e = m60353e(sSLSocket, z);
        sSLSocket.setEnabledProtocols(e.f46636c);
        String[] strArr = e.f46635b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<C12725a> mo37630d() {
        String[] strArr = this.f46635b;
        if (strArr == null) {
            return null;
        }
        C12725a[] aVarArr = new C12725a[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f46635b;
            if (i >= strArr2.length) {
                return C12748l.m60428a(aVarArr);
            }
            aVarArr[i] = C12725a.m60350a(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12726b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12726b bVar = (C12726b) obj;
        boolean z = this.f46634a;
        if (z != bVar.f46634a) {
            return false;
        }
        return !z || (Arrays.equals(this.f46635b, bVar.f46635b) && Arrays.equals(this.f46636c, bVar.f46636c) && this.f46637d == bVar.f46637d);
    }

    /* renamed from: f */
    public boolean mo37632f() {
        return this.f46637d;
    }

    /* renamed from: g */
    public List<C12747k> mo37633g() {
        C12747k[] kVarArr = new C12747k[this.f46636c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f46636c;
            if (i >= strArr.length) {
                return C12748l.m60428a(kVarArr);
            }
            kVarArr[i] = C12747k.m60427a(strArr[i]);
            i++;
        }
    }

    public int hashCode() {
        if (this.f46634a) {
            return ((((527 + Arrays.hashCode(this.f46635b)) * 31) + Arrays.hashCode(this.f46636c)) * 31) + (this.f46637d ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f46634a) {
            return "ConnectionSpec()";
        }
        List<C12725a> d = mo37630d();
        if (d == null) {
            str = "[use default]";
        } else {
            str = d.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + mo37633g() + ", supportsTlsExtensions=" + this.f46637d + ")";
    }

    /* renamed from: uc.b$b */
    /* compiled from: ConnectionSpec */
    public static final class C12728b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f46638a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f46639b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f46640c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f46641d;

        public C12728b(boolean z) {
            this.f46638a = z;
        }

        /* renamed from: e */
        public C12726b mo37636e() {
            return new C12726b(this);
        }

        /* renamed from: f */
        public C12728b mo37637f(String... strArr) {
            if (this.f46638a) {
                if (strArr == null) {
                    this.f46639b = null;
                } else {
                    this.f46639b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C12728b mo37638g(C12725a... aVarArr) {
            if (this.f46638a) {
                String[] strArr = new String[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    strArr[i] = aVarArr[i].f46629a;
                }
                this.f46639b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C12728b mo37639h(boolean z) {
            if (this.f46638a) {
                this.f46641d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C12728b mo37640i(String... strArr) {
            if (this.f46638a) {
                if (strArr == null) {
                    this.f46640c = null;
                } else {
                    this.f46640c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: j */
        public C12728b mo37641j(C12747k... kVarArr) {
            if (!this.f46638a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (kVarArr.length != 0) {
                String[] strArr = new String[kVarArr.length];
                for (int i = 0; i < kVarArr.length; i++) {
                    strArr[i] = kVarArr[i].f46696a;
                }
                this.f46640c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        public C12728b(C12726b bVar) {
            this.f46638a = bVar.f46634a;
            this.f46639b = bVar.f46635b;
            this.f46640c = bVar.f46636c;
            this.f46641d = bVar.f46637d;
        }
    }

    private C12726b(C12728b bVar) {
        this.f46634a = bVar.f46638a;
        this.f46635b = bVar.f46639b;
        this.f46636c = bVar.f46640c;
        this.f46637d = bVar.f46641d;
    }
}
