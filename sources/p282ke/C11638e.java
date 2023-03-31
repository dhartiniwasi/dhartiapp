package p282ke;

import java.util.List;
import p244ge.C10367f0;
import p244ge.C10383n;
import p244ge.C10384o;
import p244ge.C10395w;
import p244ge.C10397x;
import p336qe.C12235f;

/* renamed from: ke.e */
/* compiled from: HttpHeaders */
public final class C11638e {

    /* renamed from: a */
    private static final C12235f f44201a = C12235f.m58766o("\"\\");

    /* renamed from: b */
    private static final C12235f f44202b = C12235f.m58766o("\t ,=");

    /* renamed from: a */
    public static long m56726a(C10395w wVar) {
        return m56733h(wVar.mo33401c("Content-Length"));
    }

    /* renamed from: b */
    public static long m56727b(C10367f0 f0Var) {
        return m56726a(f0Var.mo33296n());
    }

    /* renamed from: c */
    public static boolean m56728c(C10367f0 f0Var) {
        if (f0Var.mo33301w().mo33258f().equals("HEAD")) {
            return false;
        }
        int f = f0Var.mo33292f();
        if (((f >= 100 && f < 200) || f == 204 || f == 304) && m56727b(f0Var) == -1 && !"chunked".equalsIgnoreCase(f0Var.mo33294h("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m56729d(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: e */
    public static void m56730e(C10384o oVar, C10397x xVar, C10395w wVar) {
        if (oVar != C10384o.f41286a) {
            List<C10383n> f = C10383n.m52436f(xVar, wVar);
            if (!f.isEmpty()) {
                oVar.mo33365a(xVar, f);
            }
        }
    }

    /* renamed from: f */
    public static int m56731f(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static int m56732g(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: h */
    private static long m56733h(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
