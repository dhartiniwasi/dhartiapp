package p316oc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: oc.a */
/* compiled from: CustomSSLSocketFactory */
public class C12073a extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f45101a;

    public C12073a() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.f45101a = instance.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m58059a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return m58059a(this.f45101a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f45101a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f45101a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m58059a(this.f45101a.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) throws IOException {
        return m58059a(this.f45101a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m58059a(this.f45101a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m58059a(this.f45101a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m58059a(this.f45101a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
