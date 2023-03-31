package p065i2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p037e2.C4214k;
import p161w3.C5918a0;

/* renamed from: i2.d */
/* compiled from: ScriptTagPayloadReader */
final class C4652d extends C4653e {

    /* renamed from: b */
    private long f25178b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f25179c = new long[0];

    /* renamed from: d */
    private long[] f25180d = new long[0];

    public C4652d() {
        super(new C4214k());
    }

    /* renamed from: g */
    private static Boolean m30263g(C5918a0 a0Var) {
        boolean z = true;
        if (a0Var.mo20534C() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    private static Object m30264h(C5918a0 a0Var, int i) {
        if (i == 0) {
            return m30266j(a0Var);
        }
        if (i == 1) {
            return m30263g(a0Var);
        }
        if (i == 2) {
            return m30270n(a0Var);
        }
        if (i == 3) {
            return m30268l(a0Var);
        }
        if (i == 8) {
            return m30267k(a0Var);
        }
        if (i == 10) {
            return m30269m(a0Var);
        }
        if (i != 11) {
            return null;
        }
        return m30265i(a0Var);
    }

    /* renamed from: i */
    private static Date m30265i(C5918a0 a0Var) {
        Date date = new Date((long) m30266j(a0Var).doubleValue());
        a0Var.mo20547P(2);
        return date;
    }

    /* renamed from: j */
    private static Double m30266j(C5918a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.mo20569v()));
    }

    /* renamed from: k */
    private static HashMap<String, Object> m30267k(C5918a0 a0Var) {
        int G = a0Var.mo20538G();
        HashMap<String, Object> hashMap = new HashMap<>(G);
        for (int i = 0; i < G; i++) {
            String n = m30270n(a0Var);
            Object h = m30264h(a0Var, m30271o(a0Var));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private static HashMap<String, Object> m30268l(C5918a0 a0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = m30270n(a0Var);
            int o = m30271o(a0Var);
            if (o == 9) {
                return hashMap;
            }
            Object h = m30264h(a0Var, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    /* renamed from: m */
    private static ArrayList<Object> m30269m(C5918a0 a0Var) {
        int G = a0Var.mo20538G();
        ArrayList<Object> arrayList = new ArrayList<>(G);
        for (int i = 0; i < G; i++) {
            Object h = m30264h(a0Var, m30271o(a0Var));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static String m30270n(C5918a0 a0Var) {
        int I = a0Var.mo20540I();
        int e = a0Var.mo20552e();
        a0Var.mo20547P(I);
        return new String(a0Var.mo20551d(), e, I);
    }

    /* renamed from: o */
    private static int m30271o(C5918a0 a0Var) {
        return a0Var.mo20534C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18326b(C5918a0 a0Var) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo18327c(C5918a0 a0Var, long j) {
        if (m30271o(a0Var) != 2 || !"onMetaData".equals(m30270n(a0Var)) || a0Var.mo20548a() == 0 || m30271o(a0Var) != 8) {
            return false;
        }
        HashMap<String, Object> k = m30267k(a0Var);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f25178b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f25179c = new long[size];
                this.f25180d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f25179c = new long[0];
                        this.f25180d = new long[0];
                    } else {
                        this.f25179c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f25180d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f25179c = new long[0];
                this.f25180d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public long mo18328d() {
        return this.f25178b;
    }

    /* renamed from: e */
    public long[] mo18329e() {
        return this.f25180d;
    }

    /* renamed from: f */
    public long[] mo18330f() {
        return this.f25179c;
    }
}
