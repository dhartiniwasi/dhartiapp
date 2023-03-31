package p371uc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p336qe.C12231c;

/* renamed from: uc.h */
/* compiled from: Platform */
public class C12736h {

    /* renamed from: b */
    public static final Logger f46656b = Logger.getLogger(C12736h.class.getName());

    /* renamed from: c */
    private static final String[] f46657c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final C12736h f46658d = m60400d();

    /* renamed from: a */
    private final Provider f46659a;

    /* renamed from: uc.h$a */
    /* compiled from: Platform */
    class C12737a implements PrivilegedExceptionAction<Method> {
        C12737a() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: uc.h$b */
    /* compiled from: Platform */
    class C12738b implements PrivilegedExceptionAction<Method> {
        C12738b() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
        }
    }

    /* renamed from: uc.h$c */
    /* compiled from: Platform */
    class C12739c implements PrivilegedExceptionAction<Method> {
        C12739c() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: uc.h$d */
    /* compiled from: Platform */
    private static class C12740d extends C12736h {

        /* renamed from: e */
        private final C12735g<Socket> f46660e;

        /* renamed from: f */
        private final C12735g<Socket> f46661f;

        /* renamed from: g */
        private final Method f46662g;

        /* renamed from: h */
        private final Method f46663h;

        /* renamed from: i */
        private final C12735g<Socket> f46664i;

        /* renamed from: j */
        private final C12735g<Socket> f46665j;

        /* renamed from: k */
        private final C12744h f46666k;

        public C12740d(C12735g<Socket> gVar, C12735g<Socket> gVar2, Method method, Method method2, C12735g<Socket> gVar3, C12735g<Socket> gVar4, Provider provider, C12744h hVar) {
            super(provider);
            this.f46660e = gVar;
            this.f46661f = gVar2;
            this.f46662g = method;
            this.f46663h = method2;
            this.f46664i = gVar3;
            this.f46665j = gVar4;
            this.f46666k = hVar;
        }

        /* renamed from: c */
        public void mo37659c(SSLSocket sSLSocket, String str, List<C12745i> list) {
            if (str != null) {
                this.f46660e.mo37655e(sSLSocket, Boolean.TRUE);
                this.f46661f.mo37655e(sSLSocket, str);
            }
            if (this.f46665j.mo37657g(sSLSocket)) {
                this.f46665j.mo37656f(sSLSocket, C12736h.m60399b(list));
            }
        }

        /* renamed from: h */
        public String mo37661h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f46664i.mo37657g(sSLSocket) && (bArr = (byte[]) this.f46664i.mo37656f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C12748l.f46698b);
            }
            return null;
        }

        /* renamed from: i */
        public C12744h mo37662i() {
            return this.f46666k;
        }
    }

    /* renamed from: uc.h$e */
    /* compiled from: Platform */
    private static class C12741e extends C12736h {

        /* renamed from: e */
        private final Method f46667e;

        /* renamed from: f */
        private final Method f46668f;

        /* synthetic */ C12741e(Provider provider, Method method, Method method2, C12737a aVar) {
            this(provider, method, method2);
        }

        /* renamed from: c */
        public void mo37659c(SSLSocket sSLSocket, String str, List<C12745i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (C12745i next : list) {
                if (next != C12745i.HTTP_1_0) {
                    arrayList.add(next.toString());
                }
            }
            try {
                this.f46667e.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: h */
        public String mo37661h(SSLSocket sSLSocket) {
            try {
                return (String) this.f46668f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: i */
        public C12744h mo37662i() {
            return C12744h.ALPN_AND_NPN;
        }

        private C12741e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f46667e = method;
            this.f46668f = method2;
        }
    }

    /* renamed from: uc.h$f */
    /* compiled from: Platform */
    private static class C12742f extends C12736h {

        /* renamed from: e */
        private final Method f46669e;

        /* renamed from: f */
        private final Method f46670f;

        /* renamed from: g */
        private final Method f46671g;

        /* renamed from: h */
        private final Class<?> f46672h;

        /* renamed from: i */
        private final Class<?> f46673i;

        public C12742f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f46669e = method;
            this.f46670f = method2;
            this.f46671g = method3;
            this.f46672h = cls;
            this.f46673i = cls2;
        }

        /* renamed from: a */
        public void mo37658a(SSLSocket sSLSocket) {
            try {
                this.f46671g.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                C12736h.f46656b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", e);
            }
        }

        /* renamed from: c */
        public void mo37659c(SSLSocket sSLSocket, String str, List<C12745i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C12745i iVar = list.get(i);
                if (iVar != C12745i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C12736h.class.getClassLoader(), new Class[]{this.f46672h, this.f46673i}, new C12743g(arrayList));
                this.f46669e.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (InvocationTargetException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: h */
        public String mo37661h(SSLSocket sSLSocket) {
            try {
                C12743g gVar = (C12743g) Proxy.getInvocationHandler(this.f46670f.invoke((Object) null, new Object[]{sSLSocket}));
                if (!gVar.f46675b && gVar.f46676c == null) {
                    C12736h.f46656b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (gVar.f46675b) {
                    return null;
                } else {
                    return gVar.f46676c;
                }
            } catch (InvocationTargetException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }

        /* renamed from: i */
        public C12744h mo37662i() {
            return C12744h.ALPN_AND_NPN;
        }
    }

    /* renamed from: uc.h$g */
    /* compiled from: Platform */
    private static class C12743g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f46674a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f46675b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f46676c;

        public C12743g(List<String> list) {
            this.f46674a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C12748l.f46697a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f46675b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f46674a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f46674a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f46676c = str;
                            return str;
                        }
                    }
                    String str2 = this.f46674a.get(0);
                    this.f46676c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f46676c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: uc.h$h */
    /* compiled from: Platform */
    public enum C12744h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C12736h(Provider provider) {
        this.f46659a = provider;
    }

    /* renamed from: b */
    public static byte[] m60399b(List<C12745i> list) {
        C12231c cVar = new C12231c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C12745i iVar = list.get(i);
            if (iVar != C12745i.HTTP_1_0) {
                cVar.mo36787a0(iVar.toString().length());
                cVar.mo36821w0(iVar.toString());
            }
        }
        return cVar.mo36779V();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p371uc.C12736h m60400d() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.security.Provider r8 = m60402f()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L_0x00a3
            uc.g r4 = new uc.g
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r5[r3] = r6
            java.lang.String r6 = "setUseSessionTickets"
            r4.<init>(r2, r6, r5)
            uc.g r5 = new uc.g
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7
            java.lang.String r7 = "setHostname"
            r5.<init>(r2, r7, r6)
            uc.g r6 = new uc.g
            java.lang.Class[] r7 = new java.lang.Class[r3]
            java.lang.String r9 = "getAlpnSelectedProtocol"
            r6.<init>(r0, r9, r7)
            uc.g r7 = new uc.g
            java.lang.Class[] r9 = new java.lang.Class[r1]
            r9[r3] = r0
            java.lang.String r0 = "setAlpnProtocols"
            r7.<init>(r2, r0, r9)
            java.lang.String r0 = "android.net.TrafficStats"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r9 = "tagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.reflect.Method r9 = r0.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r10 = "untagSocket"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r1[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            goto L_0x005a
        L_0x0058:
            r9 = r2
        L_0x0059:
            r0 = r2
        L_0x005a:
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "GmsCore_OpenSSL"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Conscrypt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Ssl_Guard"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007f
            goto L_0x0094
        L_0x007f:
            boolean r1 = m60404k()
            if (r1 == 0) goto L_0x0088
            uc.h$h r1 = p371uc.C12736h.C12744h.ALPN_AND_NPN
            goto L_0x0096
        L_0x0088:
            boolean r1 = m60403j()
            if (r1 == 0) goto L_0x0091
            uc.h$h r1 = p371uc.C12736h.C12744h.NPN
            goto L_0x0096
        L_0x0091:
            uc.h$h r1 = p371uc.C12736h.C12744h.NONE
            goto L_0x0096
        L_0x0094:
            uc.h$h r1 = p371uc.C12736h.C12744h.ALPN_AND_NPN
        L_0x0096:
            r10 = r1
            uc.h$d r11 = new uc.h$d
            r1 = r11
            r2 = r4
            r3 = r5
            r4 = r9
            r5 = r0
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L_0x00a3:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getDefault()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.security.Provider r0 = r0.getProvider()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.init(r2, r2, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            javax.net.ssl.SSLEngine r4 = r4.createSSLEngine()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            uc.h$a r5 = new uc.h$a     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.invoke(r4, r6)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            uc.h$b r4 = new uc.h$b     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            uc.h$c r5 = new uc.h$c     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            uc.h$e r6 = new uc.h$e     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r6.<init>(r0, r4, r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            return r6
        L_0x00e4:
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = "$Provider"
            r5.append(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r7 = "$ClientProvider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r8 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "$ServerProvider"
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r9 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6[r1] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r5 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r6 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r7 = r4.getMethod(r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            uc.h$f r1 = new uc.h$f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r4 = r1
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            return r1
        L_0x015a:
            uc.h r1 = new uc.h
            r1.<init>(r0)
            return r1
        L_0x0160:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p371uc.C12736h.m60400d():uc.h");
    }

    /* renamed from: e */
    public static C12736h m60401e() {
        return f46658d;
    }

    /* renamed from: f */
    private static Provider m60402f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f46657c) {
                if (str.equals(provider.getClass().getName())) {
                    f46656b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f46656b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    private static boolean m60403j() {
        try {
            C12736h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            f46656b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m60404k() {
        try {
            C12736h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            f46656b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo37658a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo37659c(SSLSocket sSLSocket, String str, List<C12745i> list) {
    }

    /* renamed from: g */
    public Provider mo37660g() {
        return this.f46659a;
    }

    /* renamed from: h */
    public String mo37661h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public C12744h mo37662i() {
        return C12744h.NONE;
    }
}
