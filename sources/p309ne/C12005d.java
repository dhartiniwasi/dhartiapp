package p309ne;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p244ge.C10355b0;
import p253he.C10543e;

/* renamed from: ne.d */
/* compiled from: Jdk8WithJettyBootPlatform */
class C12005d extends C12008f {

    /* renamed from: c */
    private final Method f44962c;

    /* renamed from: d */
    private final Method f44963d;

    /* renamed from: e */
    private final Method f44964e;

    /* renamed from: f */
    private final Class<?> f44965f;

    /* renamed from: g */
    private final Class<?> f44966g;

    /* renamed from: ne.d$a */
    /* compiled from: Jdk8WithJettyBootPlatform */
    private static class C12006a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f44967a;

        /* renamed from: b */
        boolean f44968b;

        /* renamed from: c */
        String f44969c;

        C12006a(List<String> list) {
            this.f44967a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C10543e.f41561b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f44968b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f44967a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f44967a.contains(str)) {
                            this.f44969c = str;
                            return str;
                        }
                    }
                    String str2 = this.f44967a.get(0);
                    this.f44969c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f44969c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C12005d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f44962c = method;
        this.f44963d = method2;
        this.f44964e = method3;
        this.f44965f = cls;
        this.f44966g = cls2;
    }

    /* renamed from: u */
    public static C12008f m57875u() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new C12005d(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo36374a(SSLSocket sSLSocket) {
        try {
            this.f44964e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) {
        List<String> b = C12008f.m57882b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C12008f.class.getClassLoader(), new Class[]{this.f44965f, this.f44966g}, new C12006a(b));
            this.f44962c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        try {
            C12006a aVar = (C12006a) Proxy.getInvocationHandler(this.f44963d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f44968b;
            if (!z && aVar.f44969c == null) {
                C12008f.m57887l().mo36363s(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f44969c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
