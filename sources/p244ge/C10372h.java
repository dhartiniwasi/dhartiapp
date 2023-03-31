package p244ge;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p327pe.C12177c;
import p336qe.C12235f;

/* renamed from: ge.h */
/* compiled from: CertificatePinner */
public final class C10372h {

    /* renamed from: c */
    public static final C10372h f41117c = new C10373a().mo33330a();

    /* renamed from: a */
    private final Set<C10374b> f41118a;

    /* renamed from: b */
    private final C12177c f41119b;

    /* renamed from: ge.h$a */
    /* compiled from: CertificatePinner */
    public static final class C10373a {

        /* renamed from: a */
        private final List<C10374b> f41120a = new ArrayList();

        /* renamed from: a */
        public C10372h mo33330a() {
            return new C10372h(new LinkedHashSet(this.f41120a), (C12177c) null);
        }
    }

    /* renamed from: ge.h$b */
    /* compiled from: CertificatePinner */
    static final class C10374b {

        /* renamed from: a */
        final String f41121a;

        /* renamed from: b */
        final String f41122b;

        /* renamed from: c */
        final String f41123c;

        /* renamed from: d */
        final C12235f f41124d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo33331a(String str) {
            if (!this.f41121a.startsWith("*.")) {
                return str.equals(this.f41122b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f41122b.length()) {
                String str2 = this.f41122b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10374b) {
                C10374b bVar = (C10374b) obj;
                return this.f41121a.equals(bVar.f41121a) && this.f41123c.equals(bVar.f41123c) && this.f41124d.equals(bVar.f41124d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f41121a.hashCode()) * 31) + this.f41123c.hashCode()) * 31) + this.f41124d.hashCode();
        }

        public String toString() {
            return this.f41123c + this.f41124d.mo36834a();
        }
    }

    C10372h(Set<C10374b> set, C12177c cVar) {
        this.f41118a = set;
        this.f41119b = cVar;
    }

    /* renamed from: c */
    public static String m52399c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m52401e((X509Certificate) certificate).mo36834a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static C12235f m52400d(X509Certificate x509Certificate) {
        return C12235f.m58767r(x509Certificate.getPublicKey().getEncoded()).mo36844u();
    }

    /* renamed from: e */
    static C12235f m52401e(X509Certificate x509Certificate) {
        return C12235f.m58767r(x509Certificate.getPublicKey().getEncoded()).mo36845v();
    }

    /* renamed from: a */
    public void mo33325a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C10374b> b = mo33326b(str);
        if (!b.isEmpty()) {
            C12177c cVar = this.f41119b;
            if (cVar != null) {
                list = cVar.mo36365a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b.size();
                C12235f fVar = null;
                C12235f fVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C10374b bVar = b.get(i2);
                    if (bVar.f41123c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = m52401e(x509Certificate);
                        }
                        if (bVar.f41124d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f41123c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = m52400d(x509Certificate);
                        }
                        if (bVar.f41124d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f41123c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(m52399c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = b.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(b.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C10374b> mo33326b(String str) {
        List<C10374b> emptyList = Collections.emptyList();
        for (C10374b next : this.f41118a) {
            if (next.mo33331a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10372h) {
            C10372h hVar = (C10372h) obj;
            if (!Objects.equals(this.f41119b, hVar.f41119b) || !this.f41118a.equals(hVar.f41118a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10372h mo33328f(C12177c cVar) {
        if (Objects.equals(this.f41119b, cVar)) {
            return this;
        }
        return new C10372h(this.f41118a, cVar);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f41119b) * 31) + this.f41118a.hashCode();
    }
}
