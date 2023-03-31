package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7101o3;
import com.google.android.gms.internal.measurement.C7213v3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
abstract class C7512t9 {

    /* renamed from: a */
    final String f33004a;

    /* renamed from: b */
    final int f33005b;

    /* renamed from: c */
    Boolean f33006c;

    /* renamed from: d */
    Boolean f33007d;

    /* renamed from: e */
    Long f33008e;

    /* renamed from: f */
    Long f33009f;

    C7512t9(String str, int i) {
        this.f33004a = str;
        this.f33005b = i;
    }

    /* renamed from: d */
    private static Boolean m41914d(String str, int i, boolean z, String str2, List list, String str3, C7352f3 f3Var) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (f3Var != null) {
                        f3Var.mo24261w().mo24209b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m41915e(BigDecimal bigDecimal, C7101o3 o3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C4141r.m28221k(o3Var);
        if (o3Var.mo23715I()) {
            boolean z = true;
            if (o3Var.mo23720N() != 1) {
                if (o3Var.mo23720N() == 5) {
                    if (!o3Var.mo23719M() || !o3Var.mo23718L()) {
                        return null;
                    }
                } else if (!o3Var.mo23716J()) {
                    return null;
                }
                int N = o3Var.mo23720N();
                if (o3Var.mo23720N() == 5) {
                    if (C7325c9.m41390N(o3Var.mo23713G()) && C7325c9.m41390N(o3Var.mo23712F())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(o3Var.mo23713G());
                            bigDecimal3 = new BigDecimal(o3Var.mo23712F());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C7325c9.m41390N(o3Var.mo23711E())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(o3Var.mo23711E());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (N == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = N - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    static Boolean m41916f(String str, C7213v3 v3Var, C7352f3 f3Var) {
        String str2;
        List list;
        C4141r.m28221k(v3Var);
        if (str == null || !v3Var.mo23943K() || v3Var.mo23944L() == 1) {
            return null;
        }
        if (v3Var.mo23944L() == 7) {
            if (v3Var.mo23937C() == 0) {
                return null;
            }
        } else if (!v3Var.mo23942J()) {
            return null;
        }
        int L = v3Var.mo23944L();
        boolean H = v3Var.mo23940H();
        if (H || L == 2 || L == 7) {
            str2 = v3Var.mo23938F();
        } else {
            str2 = v3Var.mo23938F().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (v3Var.mo23937C() == 0) {
            list = null;
        } else {
            List<String> G = v3Var.mo23939G();
            if (!H) {
                ArrayList arrayList = new ArrayList(G.size());
                for (String upperCase : G) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                G = Collections.unmodifiableList(arrayList);
            }
            list = G;
        }
        return m41914d(str, L, H, str3, list, L == 2 ? str3 : null, f3Var);
    }

    /* renamed from: g */
    static Boolean m41917g(double d, C7101o3 o3Var) {
        try {
            return m41915e(new BigDecimal(d), o3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m41918h(long j, C7101o3 o3Var) {
        try {
            return m41915e(new BigDecimal(j), o3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m41919i(String str, C7101o3 o3Var) {
        if (!C7325c9.m41390N(str)) {
            return null;
        }
        try {
            return m41915e(new BigDecimal(str), o3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m41920j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo24656a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo24657b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo24658c();
}
