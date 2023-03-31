package p244ge;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p253he.C10543e;

/* renamed from: ge.v */
/* compiled from: Handshake */
public final class C10394v {

    /* renamed from: a */
    private final C10377i0 f41298a;

    /* renamed from: b */
    private final C10378j f41299b;

    /* renamed from: c */
    private final List<Certificate> f41300c;

    /* renamed from: d */
    private final List<Certificate> f41301d;

    private C10394v(C10377i0 i0Var, C10378j jVar, List<Certificate> list, List<Certificate> list2) {
        this.f41298a = i0Var;
        this.f41299b = jVar;
        this.f41300c = list;
        this.f41301d = list2;
    }

    /* renamed from: b */
    public static C10394v m52485b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C10378j b = C10378j.m52414b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C10377i0 a = C10377i0.m52411a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C10543e.m53059t(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C10543e.m53059t(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C10394v(a, b, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: c */
    private List<String> m52486c(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) next).getSubjectDN()));
            } else {
                arrayList.add(next.getType());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C10378j mo33396a() {
        return this.f41299b;
    }

    /* renamed from: d */
    public List<Certificate> mo33397d() {
        return this.f41300c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10394v)) {
            return false;
        }
        C10394v vVar = (C10394v) obj;
        if (!this.f41298a.equals(vVar.f41298a) || !this.f41299b.equals(vVar.f41299b) || !this.f41300c.equals(vVar.f41300c) || !this.f41301d.equals(vVar.f41301d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f41298a.hashCode()) * 31) + this.f41299b.hashCode()) * 31) + this.f41300c.hashCode()) * 31) + this.f41301d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f41298a + " cipherSuite=" + this.f41299b + " peerCertificates=" + m52486c(this.f41300c) + " localCertificates=" + m52486c(this.f41301d) + '}';
    }
}
