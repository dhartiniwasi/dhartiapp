package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7279z5 {
    /* renamed from: a */
    public static double m41175a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m41176b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m41177c(C7262y4 y4Var) {
        int b = m41176b(y4Var.mo24009d("runtime.counter").mo23368U().doubleValue() + 1.0d);
        if (b <= 1000000) {
            y4Var.mo24012g("runtime.counter", new C7001i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m41178d(double d) {
        return ((long) m41176b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static C7082n0 m41179e(String str) {
        C7082n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = C7082n0.m40425a(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m41180f(C7129q qVar) {
        if (C7129q.f31956n.equals(qVar)) {
            return null;
        }
        if (C7129q.f31955m.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C7081n) {
            return m41181g((C7081n) qVar);
        }
        if (qVar instanceof C6951f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C6951f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m41180f((C7129q) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.mo23368U().isNaN()) {
            return qVar.mo23368U();
        } else {
            return qVar.mo23369V();
        }
    }

    /* renamed from: g */
    public static Map m41181g(C7081n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo23681a()) {
            Object f = m41180f(nVar.mo23387v(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m41182h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m41183i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m41184j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m41185k(C7129q qVar) {
        if (qVar == null) {
            return false;
        }
        Double U = qVar.mo23368U();
        if (U.isNaN() || U.doubleValue() < 0.0d || !U.equals(Double.valueOf(Math.floor(U.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m41186l(C7129q qVar, C7129q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C7209v) || (qVar instanceof C7097o)) {
            return true;
        }
        if (qVar instanceof C7001i) {
            if (Double.isNaN(qVar.mo23368U().doubleValue()) || Double.isNaN(qVar2.mo23368U().doubleValue())) {
                return false;
            }
            return qVar.mo23368U().equals(qVar2.mo23368U());
        } else if (qVar instanceof C7193u) {
            return qVar.mo23369V().equals(qVar2.mo23369V());
        } else {
            if (qVar instanceof C6968g) {
                return qVar.mo23372c().equals(qVar2.mo23372c());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
