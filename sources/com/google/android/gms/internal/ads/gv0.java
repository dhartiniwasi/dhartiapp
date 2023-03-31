package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gv0 {

    /* renamed from: f */
    public static final za4 f10062f = hu0.f10495a;

    /* renamed from: a */
    public final int f10063a = 1;

    /* renamed from: b */
    public final String f10064b;

    /* renamed from: c */
    public final int f10065c;

    /* renamed from: d */
    private final C2388g4[] f10066d;

    /* renamed from: e */
    private int f10067e;

    public gv0(String str, C2388g4... g4VarArr) {
        this.f10064b = str;
        this.f10066d = g4VarArr;
        int b = d90.m11363b(g4VarArr[0].f9673l);
        this.f10065c = b == -1 ? d90.m11363b(g4VarArr[0].f9672k) : b;
        m13543d(g4VarArr[0].f9664c);
        int i = g4VarArr[0].f9666e;
    }

    /* renamed from: d */
    private static String m13543d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    public final int mo10648a(C2388g4 g4Var) {
        for (int i = 0; i <= 0; i++) {
            if (g4Var == this.f10066d[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C2388g4 mo10649b(int i) {
        return this.f10066d[i];
    }

    /* renamed from: c */
    public final gv0 mo10650c(String str) {
        return new gv0(str, this.f10066d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gv0.class == obj.getClass()) {
            gv0 gv0 = (gv0) obj;
            return this.f10064b.equals(gv0.f10064b) && Arrays.equals(this.f10066d, gv0.f10066d);
        }
    }

    public final int hashCode() {
        int i = this.f10067e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.f10064b.hashCode() + 527) * 31) + Arrays.hashCode(this.f10066d);
        this.f10067e = hashCode;
        return hashCode;
    }
}
