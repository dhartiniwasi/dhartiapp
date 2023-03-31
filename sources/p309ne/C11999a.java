package p309ne;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p244ge.C10355b0;

/* renamed from: ne.a */
/* compiled from: Android10Platform */
class C11999a extends C12000b {
    C11999a(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    /* renamed from: w */
    public static C12008f m57846w() {
        if (!C12008f.m57888p()) {
            return null;
        }
        try {
            if (C12000b.m57853x() >= 29) {
                return new C11999a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    /* renamed from: y */
    private void m57847y(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) throws IOException {
        try {
            m57847y(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C12008f.m57882b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
