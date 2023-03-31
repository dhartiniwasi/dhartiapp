package p309ne;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p244ge.C10351a0;
import p244ge.C10355b0;
import p253he.C10543e;
import p327pe.C12175a;
import p327pe.C12176b;
import p327pe.C12177c;
import p327pe.C12179e;
import p336qe.C12231c;

/* renamed from: ne.f */
/* compiled from: Platform */
public class C12008f {

    /* renamed from: a */
    private static final C12008f f44972a = m57886k();

    /* renamed from: b */
    private static final Logger f44973b = Logger.getLogger(C10351a0.class.getName());

    /* renamed from: b */
    public static List<String> m57882b(List<C10355b0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10355b0 b0Var = list.get(i);
            if (b0Var != C10355b0.HTTP_1_0) {
                arrayList.add(b0Var.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m57883e(List<C10355b0> list) {
        C12231c cVar = new C12231c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10355b0 b0Var = list.get(i);
            if (b0Var != C10355b0.HTTP_1_0) {
                cVar.mo36787a0(b0Var.toString().length());
                cVar.mo36821w0(b0Var.toString());
            }
        }
        return cVar.mo36779V();
    }

    /* renamed from: i */
    private static C12008f m57884i() {
        C12008f w = C11999a.m57846w();
        if (w != null) {
            return w;
        }
        C12008f w2 = C12000b.m57852w();
        Objects.requireNonNull(w2, "No platform found on Android");
        return w2;
    }

    /* renamed from: j */
    private static C12008f m57885j() {
        C12004c u;
        if (m57889r() && (u = C12004c.m57869u()) != null) {
            return u;
        }
        C12007e u2 = C12007e.m57879u();
        if (u2 != null) {
            return u2;
        }
        C12008f u3 = C12005d.m57875u();
        if (u3 != null) {
            return u3;
        }
        return new C12008f();
    }

    /* renamed from: k */
    private static C12008f m57886k() {
        if (m57888p()) {
            return m57884i();
        }
        return m57885j();
    }

    /* renamed from: l */
    public static C12008f m57887l() {
        return f44972a;
    }

    /* renamed from: p */
    public static boolean m57888p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: r */
    public static boolean m57889r() {
        if ("conscrypt".equals(C10543e.m53056q("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo36374a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C12177c mo36357c(X509TrustManager x509TrustManager) {
        return new C12175a(mo36358d(x509TrustManager));
    }

    /* renamed from: d */
    public C12179e mo36358d(X509TrustManager x509TrustManager) {
        return new C12176b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo36373f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) throws IOException {
    }

    /* renamed from: h */
    public void mo36359h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: m */
    public SSLContext mo36360m() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: o */
    public Object mo36361o(String str) {
        if (f44973b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: q */
    public boolean mo36362q(String str) {
        return true;
    }

    /* renamed from: s */
    public void mo36363s(int i, String str, Throwable th) {
        f44973b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: t */
    public void mo36364t(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo36363s(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
