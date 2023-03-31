package p309ne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p244ge.C10355b0;

/* renamed from: ne.e */
/* compiled from: Jdk9Platform */
final class C12007e extends C12008f {

    /* renamed from: c */
    final Method f44970c;

    /* renamed from: d */
    final Method f44971d;

    C12007e(Method method, Method method2) {
        this.f44970c = method;
        this.f44971d = method2;
    }

    /* renamed from: u */
    public static C12007e m57879u() {
        try {
            return new C12007e(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo36355g(SSLSocket sSLSocket, String str, List<C10355b0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = C12008f.m57882b(list);
            this.f44970c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    /* renamed from: n */
    public String mo36356n(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f44971d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
