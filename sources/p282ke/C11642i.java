package p282ke;

import java.net.Proxy;
import p244ge.C10360d0;
import p244ge.C10397x;

/* renamed from: ke.i */
/* compiled from: RequestLine */
public final class C11642i {
    /* renamed from: a */
    public static String m56749a(C10360d0 d0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(d0Var.mo33258f());
        sb.append(' ');
        if (m56750b(d0Var, type)) {
            sb.append(d0Var.mo33260h());
        } else {
            sb.append(m56751c(d0Var.mo33260h()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m56750b(C10360d0 d0Var, Proxy.Type type) {
        return !d0Var.mo33257e() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m56751c(C10397x xVar) {
        String g = xVar.mo33422g();
        String i = xVar.mo33425i();
        if (i == null) {
            return g;
        }
        return g + '?' + i;
    }
}
