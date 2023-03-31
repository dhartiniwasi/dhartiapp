package p309ne;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p244ge.C10355b0;

/* renamed from: ne.c */
/* compiled from: ConscryptPlatform */
public class C12004c extends C12008f {
    private C12004c() {
    }

    /* renamed from: u */
    public static C12004c m57869u() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C12004c();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: v */
    private Provider m57870v() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: f */
    public void mo36373f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C12008f.m57882b(list).toArray(new String[0]));
            return;
        }
        super.mo36355g(sSLSocket, str, list);
    }

    /* renamed from: m */
    public SSLContext mo36360m() {
        try {
            return SSLContext.getInstance("TLSv1.3", m57870v());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m57870v());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo36356n(sSLSocket);
    }
}
