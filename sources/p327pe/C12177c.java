package p327pe;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p309ne.C12008f;

/* renamed from: pe.c */
/* compiled from: CertificateChainCleaner */
public abstract class C12177c {
    /* renamed from: b */
    public static C12177c m58464b(X509TrustManager x509TrustManager) {
        return C12008f.m57887l().mo36357c(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo36365a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
