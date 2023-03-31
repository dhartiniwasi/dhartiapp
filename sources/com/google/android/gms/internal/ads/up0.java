package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class up0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f18662a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    final /* synthetic */ vp0 f18663b;

    up0(vp0 vp0) {
        this.f18663b = vp0;
    }

    /* renamed from: a */
    private final Socket m21771a(Socket socket) throws SocketException {
        vp0 vp0 = this.f18663b;
        if (vp0.f19192o > 0) {
            socket.setReceiveBufferSize(vp0.f19192o);
        }
        this.f18663b.f19193p.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f18662a.createSocket(str, i);
        m21771a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f18662a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f18662a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f18662a.createSocket(str, i, inetAddress, i2);
        m21771a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f18662a.createSocket(inetAddress, i);
        m21771a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f18662a.createSocket(inetAddress, i, inetAddress2, i2);
        m21771a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f18662a.createSocket(socket, str, i, z);
        m21771a(createSocket);
        return createSocket;
    }
}
