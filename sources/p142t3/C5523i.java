package p142t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6249m2;

/* renamed from: t3.i */
/* compiled from: WebvttParserUtil */
public final class C5523i {

    /* renamed from: a */
    private static final Pattern f28039a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m33572a(C5918a0 a0Var) {
        String o;
        while (true) {
            String o2 = a0Var.mo20562o();
            if (o2 == null) {
                return null;
            }
            if (f28039a.matcher(o2).matches()) {
                do {
                    o = a0Var.mo20562o();
                    if (o == null) {
                        break;
                    }
                } while (o.isEmpty());
            } else {
                Matcher matcher = C5516f.f28013a.matcher(o2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m33573b(C5918a0 a0Var) {
        String o = a0Var.mo20562o();
        return o != null && o.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m33574c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m33575d(String str) throws NumberFormatException {
        String[] R0 = C5953m0.m35103R0(str, "\\.");
        long j = 0;
        for (String parseLong : C5953m0.m35101Q0(R0[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (R0.length == 2) {
            j2 += Long.parseLong(R0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: e */
    public static void m33576e(C5918a0 a0Var) throws C6249m2 {
        int e = a0Var.mo20552e();
        if (!m33573b(a0Var)) {
            a0Var.mo20546O(e);
            throw C6249m2.m36661a("Expected WEBVTT. Got " + a0Var.mo20562o(), (Throwable) null);
        }
    }
}
