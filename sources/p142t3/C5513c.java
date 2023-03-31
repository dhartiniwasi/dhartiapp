package p142t3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5931f;
import p161w3.C5953m0;
import p161w3.C5961r;
import p182a7.C6408b;

/* renamed from: t3.c */
/* compiled from: WebvttCssParser */
final class C5513c {

    /* renamed from: c */
    private static final Pattern f27989c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f27990d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final C5918a0 f27991a = new C5918a0();

    /* renamed from: b */
    private final StringBuilder f27992b = new StringBuilder();

    /* renamed from: a */
    private void m33489a(C5514d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f27989c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo19819z((String) C5917a.m34872e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] Q0 = C5953m0.m35101Q0(str, "\\.");
            String str2 = Q0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo19818y(str2.substring(0, indexOf2));
                dVar.mo19817x(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo19818y(str2);
            }
            if (Q0.length > 1) {
                dVar.mo19816w((String[]) C5953m0.m35083H0(Q0, 1, Q0.length));
            }
        }
    }

    /* renamed from: b */
    private static boolean m33490b(C5918a0 a0Var) {
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        byte[] d = a0Var.mo20551d();
        if (e + 2 > f) {
            return false;
        }
        int i = e + 1;
        if (d[e] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= f) {
                a0Var.mo20547P(f - a0Var.mo20552e());
                return true;
            } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                i2 = i3 + 1;
                f = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    private static boolean m33491c(C5918a0 a0Var) {
        char k = m33498k(a0Var, a0Var.mo20552e());
        if (k != 9 && k != 10 && k != 12 && k != 13 && k != ' ') {
            return false;
        }
        a0Var.mo20547P(1);
        return true;
    }

    /* renamed from: e */
    private static void m33492e(String str, C5514d dVar) {
        Matcher matcher = f27990d.matcher(C6408b.m37506e(str));
        if (!matcher.matches()) {
            C5961r.m35215i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C5917a.m34872e(matcher.group(2));
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.mo19813t(3);
                break;
            case 1:
                dVar.mo19813t(2);
                break;
            case 2:
                dVar.mo19813t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.mo19812s(Float.parseFloat((String) C5917a.m34872e(matcher.group(1))));
    }

    /* renamed from: f */
    private static String m33493f(C5918a0 a0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        while (e < f && !z) {
            char c = (char) a0Var.mo20551d()[e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                e++;
                sb.append(c);
            }
        }
        a0Var.mo20547P(e - a0Var.mo20552e());
        return sb.toString();
    }

    /* renamed from: g */
    static String m33494g(C5918a0 a0Var, StringBuilder sb) {
        m33501n(a0Var);
        if (a0Var.mo20548a() == 0) {
            return null;
        }
        String f = m33493f(a0Var, sb);
        if (!"".equals(f)) {
            return f;
        }
        return "" + ((char) a0Var.mo20534C());
    }

    /* renamed from: h */
    private static String m33495h(C5918a0 a0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int e = a0Var.mo20552e();
            String g = m33494g(a0Var, sb);
            if (g == null) {
                return null;
            }
            if ("}".equals(g) || ";".equals(g)) {
                a0Var.mo20546O(e);
                z = true;
            } else {
                sb2.append(g);
            }
        }
        return sb2.toString();
    }

    /* renamed from: i */
    private static String m33496i(C5918a0 a0Var, StringBuilder sb) {
        m33501n(a0Var);
        if (a0Var.mo20548a() < 5 || !"::cue".equals(a0Var.mo20573z(5))) {
            return null;
        }
        int e = a0Var.mo20552e();
        String g = m33494g(a0Var, sb);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            a0Var.mo20546O(e);
            return "";
        }
        String l = "(".equals(g) ? m33499l(a0Var) : null;
        if (!")".equals(m33494g(a0Var, sb))) {
            return null;
        }
        return l;
    }

    /* renamed from: j */
    private static void m33497j(C5918a0 a0Var, C5514d dVar, StringBuilder sb) {
        m33501n(a0Var);
        String f = m33493f(a0Var, sb);
        if (!"".equals(f) && ":".equals(m33494g(a0Var, sb))) {
            m33501n(a0Var);
            String h = m33495h(a0Var, sb);
            if (h != null && !"".equals(h)) {
                int e = a0Var.mo20552e();
                String g = m33494g(a0Var, sb);
                if (!";".equals(g)) {
                    if ("}".equals(g)) {
                        a0Var.mo20546O(e);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f)) {
                    dVar.mo19810q(C5931f.m34980b(h));
                } else if ("background-color".equals(f)) {
                    dVar.mo19807n(C5931f.m34980b(h));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(f)) {
                        if ("over".equals(h)) {
                            dVar.mo19815v(1);
                        } else if ("under".equals(h)) {
                            dVar.mo19815v(2);
                        }
                    } else if ("text-combine-upright".equals(f)) {
                        if (!"all".equals(h) && !h.startsWith("digits")) {
                            z = false;
                        }
                        dVar.mo19809p(z);
                    } else if ("text-decoration".equals(f)) {
                        if ("underline".equals(h)) {
                            dVar.mo19793A(true);
                        }
                    } else if ("font-family".equals(f)) {
                        dVar.mo19811r(h);
                    } else if ("font-weight".equals(f)) {
                        if ("bold".equals(h)) {
                            dVar.mo19808o(true);
                        }
                    } else if ("font-style".equals(f)) {
                        if ("italic".equals(h)) {
                            dVar.mo19814u(true);
                        }
                    } else if ("font-size".equals(f)) {
                        m33492e(h, dVar);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private static char m33498k(C5918a0 a0Var, int i) {
        return (char) a0Var.mo20551d()[i];
    }

    /* renamed from: l */
    private static String m33499l(C5918a0 a0Var) {
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        boolean z = false;
        while (e < f && !z) {
            int i = e + 1;
            z = ((char) a0Var.mo20551d()[e]) == ')';
            e = i;
        }
        return a0Var.mo20573z((e - 1) - a0Var.mo20552e()).trim();
    }

    /* renamed from: m */
    static void m33500m(C5918a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.mo20562o()));
    }

    /* renamed from: n */
    static void m33501n(C5918a0 a0Var) {
        while (true) {
            boolean z = true;
            while (a0Var.mo20548a() > 0 && z) {
                if (!m33491c(a0Var) && !m33490b(a0Var)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public List<C5514d> mo19792d(C5918a0 a0Var) {
        this.f27992b.setLength(0);
        int e = a0Var.mo20552e();
        m33500m(a0Var);
        this.f27991a.mo20544M(a0Var.mo20551d(), a0Var.mo20552e());
        this.f27991a.mo20546O(e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = m33496i(this.f27991a, this.f27992b);
            if (i == null || !"{".equals(m33494g(this.f27991a, this.f27992b))) {
                return arrayList;
            }
            C5514d dVar = new C5514d();
            m33489a(dVar, i);
            String str = null;
            boolean z = false;
            while (!z) {
                int e2 = this.f27991a.mo20552e();
                String g = m33494g(this.f27991a, this.f27992b);
                boolean z2 = g == null || "}".equals(g);
                if (!z2) {
                    this.f27991a.mo20546O(e2);
                    m33497j(this.f27991a, dVar, this.f27992b);
                }
                str = g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
