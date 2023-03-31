package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qr0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f16503a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ rr0 f16504b;

    qr0(rr0 rr0) {
        this.f16504b = rr0;
    }

    /* renamed from: a */
    private final Socket m19334a(Socket socket) throws SocketException {
        rr0 rr0 = this.f16504b;
        if (rr0.f17076s > 0) {
            socket.setReceiveBufferSize(rr0.f17076s);
        }
        this.f16504b.f17077t.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f16503a.createSocket(str, i);
        m19334a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f16503a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f16503a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f16503a.createSocket(str, i, inetAddress, i2);
        m19334a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f16503a.createSocket(inetAddress, i);
        m19334a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f16503a.createSocket(inetAddress, i, inetAddress2, i2);
        m19334a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f16503a.createSocket(socket, str, i, z);
        m19334a(createSocket);
        return createSocket;
    }
}
