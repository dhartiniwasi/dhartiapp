package p309ne;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p244ge.C10355b0;
import p253he.C10543e;
import p327pe.C12177c;
import p327pe.C12179e;

/* renamed from: ne.b */
/* compiled from: AndroidPlatform */
class C12000b extends C12008f {

    /* renamed from: c */
    private final Class<?> f44948c;

    /* renamed from: d */
    private final Class<?> f44949d;

    /* renamed from: e */
    private final Method f44950e;

    /* renamed from: f */
    private final Method f44951f;

    /* renamed from: g */
    private final Method f44952g;

    /* renamed from: h */
    private final Method f44953h;

    /* renamed from: i */
    private final C12002b f44954i = C12002b.m57865b();

    /* renamed from: ne.b$a */
    /* compiled from: AndroidPlatform */
    static final class C12001a extends C12177c {

        /* renamed from: a */
        private final Object f44955a;

        /* renamed from: b */
        private final Method f44956b;

        C12001a(Object obj, Method method) {
            this.f44955a = obj;
            this.f44956b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo36365a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f44956b.invoke(this.f44955a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C12001a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: ne.b$b */
    /* compiled from: AndroidPlatform */
    static final class C12002b {

        /* renamed from: a */
        private final Method f44957a;

        /* renamed from: b */
        private final Method f44958b;

        /* renamed from: c */
        private final Method f44959c;

        C12002b(Method method, Method method2, Method method3) {
            this.f44957a = method;
            this.f44958b = method2;
            this.f44959c = method3;
        }

        /* renamed from: b */
        static C12002b m57865b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C12002b(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo36368a(String str) {
            Method method = this.f44957a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f44958b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo36369c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f44959c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: ne.b$c */
    /* compiled from: AndroidPlatform */
    static final class C12003c implements C12179e {

        /* renamed from: a */
        private final X509TrustManager f44960a;

        /* renamed from: b */
        private final Method f44961b;

        C12003c(X509TrustManager x509TrustManager, Method method) {
            this.f44961b = method;
            this.f44960a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo36370a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f44961b.invoke(this.f44960a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C12003c)) {
                return false;
            }
            C12003c cVar = (C12003c) obj;
            if (!this.f44960a.equals(cVar.f44960a) || !this.f44961b.equals(cVar.f44961b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f44960a.hashCode() + (this.f44961b.hashCode() * 31);
        }
    }

    C12000b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f44948c = cls;
        this.f44949d = cls2;
        this.f44950e = method;
        this.f44951f = method2;
        this.f44952g = method3;
        this.f44953h = method4;
    }

    /* renamed from: u */
    private boolean m57850u(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo36362q(str);
        }
    }

    /* renamed from: v */
    private boolean m57851v(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m57850u(str, cls, obj);
        }
    }

    /* renamed from: w */
    public static C12008f m57852w() {
        if (!C12008f.m57888p()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                    Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                    return new C12000b(cls, cls2, declaredMethod, method, cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: x */
    static int m57853x() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public C12177c mo36357c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C12001a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo36357c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public C12179e mo36358d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C12003c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo36358d(x509TrustManager);
        }
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) throws IOException {
        if (this.f44949d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f44950e.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f44951f.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.f44953h.invoke(sSLSocket, new Object[]{C12008f.m57883e(list)});
        }
    }

    /* renamed from: h */
    public void mo36359h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C10543e.m53065z(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    /* renamed from: m */
    public SSLContext mo36360m() {
        boolean z = true;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 16 || i >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        if (!this.f44949d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f44952g.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public Object mo36361o(String str) {
        return this.f44954i.mo36368a(str);
    }

    /* renamed from: q */
    public boolean mo36362q(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m57851v(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo36362q(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* renamed from: s */
    public void mo36363s(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: t */
    public void mo36364t(String str, Object obj) {
        if (!this.f44954i.mo36369c(obj)) {
            mo36363s(5, str, (Throwable) null);
        }
    }
}
