package p327pe;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: pe.b */
/* compiled from: BasicTrustRootIndex */
public final class C12176b implements C12179e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f45261a = new LinkedHashMap();

    public C12176b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f45261a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f45261a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo36370a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f45261a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12176b) || !((C12176b) obj).f45261a.equals(this.f45261a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45261a.hashCode();
    }
}
