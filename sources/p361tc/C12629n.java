package p361tc;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p182a7.C6431n;
import p371uc.C12726b;
import p371uc.C12734f;
import p371uc.C12745i;

/* renamed from: tc.n */
/* compiled from: OkHttpTlsUpgrader */
final class C12629n {

    /* renamed from: a */
    static final List<C12745i> f46367a = Collections.unmodifiableList(Arrays.asList(new C12745i[]{C12745i.HTTP_2}));

    /* renamed from: a */
    static String m60112a(String str) {
        return (!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1);
    }

    /* renamed from: b */
    public static SSLSocket m60113b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C12726b bVar) throws IOException {
        C6431n.m37562o(sSLSocketFactory, "sslSocketFactory");
        C6431n.m37562o(socket, "socket");
        C6431n.m37562o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        bVar.mo37629c(sSLSocket, false);
        String h = C12625k.m60094e().mo37515h(sSLSocket, str, bVar.mo37632f() ? f46367a : null);
        List<C12745i> list = f46367a;
        boolean contains = list.contains(C12745i.m60425a(h));
        C6431n.m37570w(contains, "Only " + list + " are supported, but negotiated protocol is %s", h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C12734f.f46651a;
        }
        if (hostnameVerifier.verify(m60112a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
