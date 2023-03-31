package com.onesignal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.onesignal.c4 */
/* compiled from: TLS12SocketFactory */
public class C8326c4 extends SSLSocketFactory {

    /* renamed from: a */
    SSLSocketFactory f35383a;

    public C8326c4(SSLSocketFactory sSLSocketFactory) {
        this.f35383a = sSLSocketFactory;
    }

    /* renamed from: a */
    private Socket m46367a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return m46367a(this.f35383a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f35383a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f35383a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m46367a(this.f35383a.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) throws IOException {
        return m46367a(this.f35383a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m46367a(this.f35383a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m46367a(this.f35383a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m46367a(this.f35383a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
