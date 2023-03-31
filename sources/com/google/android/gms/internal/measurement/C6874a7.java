package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6874a7 {
    /* renamed from: a */
    public static C7129q m39469a(C7247x5 x5Var) {
        if (x5Var == null) {
            return C7129q.f31955m;
        }
        int L = x5Var.mo23987L() - 1;
        if (L != 1) {
            if (L != 2) {
                if (L != 3) {
                    if (L == 4) {
                        List<C7247x5> G = x5Var.mo23982G();
                        ArrayList arrayList = new ArrayList();
                        for (C7247x5 a : G) {
                            arrayList.add(m39469a(a));
                        }
                        return new C7145r(x5Var.mo23980E(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (x5Var.mo23984I()) {
                    return new C6968g(Boolean.valueOf(x5Var.mo23983H()));
                } else {
                    return new C6968g((Boolean) null);
                }
            } else if (x5Var.mo23985J()) {
                return new C7001i(Double.valueOf(x5Var.mo23979C()));
            } else {
                return new C7001i((Double) null);
            }
        } else if (x5Var.mo23986K()) {
            return new C7193u(x5Var.mo23981F());
        } else {
            return C7129q.f31954V;
        }
    }

    /* renamed from: b */
    public static C7129q m39470b(Object obj) {
        if (obj == null) {
            return C7129q.f31956n;
        }
        if (obj instanceof String) {
            return new C7193u((String) obj);
        }
        if (obj instanceof Double) {
            return new C7001i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C7001i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C7001i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C6968g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C7081n nVar = new C7081n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C7129q b = m39470b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo23376i((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C6951f fVar = new C6951f();
            for (Object b2 : (List) obj) {
                fVar.mo23389x(fVar.mo23379l(), m39470b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
