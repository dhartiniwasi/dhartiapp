package p273je;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p244ge.C10381m;
import p253he.C10539a;

/* renamed from: je.b */
/* compiled from: ConnectionSpecSelector */
final class C11578b {

    /* renamed from: a */
    private final List<C10381m> f44051a;

    /* renamed from: b */
    private int f44052b = 0;

    /* renamed from: c */
    private boolean f44053c;

    /* renamed from: d */
    private boolean f44054d;

    C11578b(List<C10381m> list) {
        this.f44051a = list;
    }

    /* renamed from: c */
    private boolean m56513c(SSLSocket sSLSocket) {
        for (int i = this.f44052b; i < this.f44051a.size(); i++) {
            if (this.f44051a.get(i).mo33346c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10381m mo35674a(SSLSocket sSLSocket) throws IOException {
        C10381m mVar;
        int i = this.f44052b;
        int size = this.f44051a.size();
        while (true) {
            if (i >= size) {
                mVar = null;
                break;
            }
            mVar = this.f44051a.get(i);
            if (mVar.mo33346c(sSLSocket)) {
                this.f44052b = i + 1;
                break;
            }
            i++;
        }
        if (mVar != null) {
            this.f44053c = m56513c(sSLSocket);
            C10539a.f41555a.mo33230c(mVar, sSLSocket, this.f44054d);
            return mVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f44054d + ", modes=" + this.f44051a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo35675b(IOException iOException) {
        this.f44054d = true;
        if (!this.f44053c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
