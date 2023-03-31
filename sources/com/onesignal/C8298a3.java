package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8571q0;
import com.onesignal.C8687z2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.a3 */
/* compiled from: OSTriggerController */
class C8298a3 {

    /* renamed from: a */
    C8571q0 f35324a;

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f35325b = new ConcurrentHashMap<>();

    /* renamed from: com.onesignal.a3$a */
    /* compiled from: OSTriggerController */
    static /* synthetic */ class C8299a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35326a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onesignal.z2$b[] r0 = com.onesignal.C8687z2.C8689b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35326a = r0
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.NOT_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.EXISTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.CONTAINS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.NOT_EXISTS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35326a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onesignal.z2$b r1 = com.onesignal.C8687z2.C8689b.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8298a3.C8299a.<clinit>():void");
        }
    }

    C8298a3(C8571q0.C8574c cVar) {
        this.f35324a = new C8571q0(cVar);
    }

    /* renamed from: b */
    private boolean m46268b(ArrayList<C8687z2> arrayList) {
        Iterator<C8687z2> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!m46269d(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m46269d(C8687z2 z2Var) {
        C8687z2.C8688a aVar = z2Var.f36245b;
        if (aVar == C8687z2.C8688a.UNKNOWN) {
            return false;
        }
        if (aVar != C8687z2.C8688a.CUSTOM) {
            return this.f35324a.mo28086c(z2Var);
        }
        C8687z2.C8689b bVar = z2Var.f36247d;
        Object obj = this.f35325b.get(z2Var.f36246c);
        if (obj == null) {
            if (bVar == C8687z2.C8689b.NOT_EXISTS) {
                return true;
            }
            if (bVar != C8687z2.C8689b.NOT_EQUAL_TO || z2Var.f36248e == null) {
                return false;
            }
            return true;
        } else if (bVar == C8687z2.C8689b.EXISTS) {
            return true;
        } else {
            if (bVar == C8687z2.C8689b.NOT_EXISTS) {
                return false;
            }
            if (bVar != C8687z2.C8689b.CONTAINS) {
                if (obj instanceof String) {
                    Object obj2 = z2Var.f36248e;
                    if ((obj2 instanceof String) && m46273l((String) obj2, (String) obj, bVar)) {
                        return true;
                    }
                }
                Object obj3 = z2Var.f36248e;
                if ((!(obj3 instanceof Number) || !(obj instanceof Number) || !m46271j((Number) obj3, (Number) obj, bVar)) && !m46270i(z2Var.f36248e, obj, bVar)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Collection) || !((Collection) obj).contains(z2Var.f36248e)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: i */
    private boolean m46270i(Object obj, Object obj2, C8687z2.C8689b bVar) {
        if (obj == null) {
            return false;
        }
        if (bVar.mo28365a()) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj2 instanceof Number) {
                obj4 = new DecimalFormat("0.#").format(obj2);
            }
            return m46273l(obj3, obj4, bVar);
        } else if (!(obj2 instanceof String) || !(obj instanceof Number)) {
            return false;
        } else {
            return m46272k((Number) obj, (String) obj2, bVar);
        }
    }

    /* renamed from: j */
    private boolean m46271j(Number number, Number number2, C8687z2.C8689b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (C8299a.f35326a[bVar.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 2:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                return false;
            case 3:
            case 4:
            case 5:
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                C8338d3.m46594z1(r0Var, "Attempted to use an invalid operator with a numeric value: " + bVar.toString());
                return false;
            case 6:
                return doubleValue2 < doubleValue;
            case 7:
                return doubleValue2 > doubleValue;
            case 8:
                return doubleValue2 < doubleValue || doubleValue2 == doubleValue;
            case 9:
                int i = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                return i > 0 || i == 0;
            default:
                return false;
        }
    }

    /* renamed from: k */
    private boolean m46272k(Number number, String str, C8687z2.C8689b bVar) {
        try {
            return m46271j(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private boolean m46273l(String str, String str2, C8687z2.C8689b bVar) {
        int i = C8299a.f35326a[bVar.ordinal()];
        if (i == 1) {
            return str.equals(str2);
        }
        if (i == 2) {
            return !str.equals(str2);
        }
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
        C8338d3.m46594z1(r0Var, "Attempted to use an invalid operator for a string trigger comparison: " + bVar.toString());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27595a(Map<String, Object> map) {
        synchronized (this.f35325b) {
            for (String next : map.keySet()) {
                this.f35325b.put(next, map.get(next));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo27596c(C8323c1 c1Var) {
        if (c1Var.f35368c.size() == 0) {
            return true;
        }
        Iterator<ArrayList<C8687z2>> it = c1Var.f35368c.iterator();
        while (it.hasNext()) {
            if (m46268b(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Object mo27597e(String str) {
        synchronized (this.f35325b) {
            if (!this.f35325b.containsKey(str)) {
                return null;
            }
            Object obj = this.f35325b.get(str);
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001c A[LOOP:1: B:7:0x001c->B:21:0x001c, LOOP_END, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27598f(com.onesignal.C8323c1 r7, java.util.Collection<java.lang.String> r8) {
        /*
            r6 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.z2>> r0 = r7.f35368c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Iterator r8 = r8.iterator()
        L_0x000a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList<java.util.ArrayList<com.onesignal.z2>> r2 = r7.f35368c
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r2.next()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = r3.next()
            com.onesignal.z2 r4 = (com.onesignal.C8687z2) r4
            java.lang.String r5 = r4.f36246c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0048
            java.lang.String r4 = r4.f36244a
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002c
        L_0x0048:
            r7 = 1
            return r7
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8298a3.mo27598f(com.onesignal.c1, java.util.Collection):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0012 A[LOOP:0: B:5:0x0012->B:20:0x0012, LOOP_END, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27599g(com.onesignal.C8323c1 r5) {
        /*
            r4 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.z2>> r0 = r5.f35368c
            r1 = 0
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            java.util.ArrayList<java.util.ArrayList<com.onesignal.z2>> r5 = r5.f35368c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0012
            java.lang.Object r2 = r0.next()
            com.onesignal.z2 r2 = (com.onesignal.C8687z2) r2
            com.onesignal.z2$a r2 = r2.f36245b
            com.onesignal.z2$a r3 = com.onesignal.C8687z2.C8688a.CUSTOM
            if (r2 == r3) goto L_0x0038
            com.onesignal.z2$a r3 = com.onesignal.C8687z2.C8688a.UNKNOWN
            if (r2 != r3) goto L_0x0022
        L_0x0038:
            return r1
        L_0x0039:
            r5 = 1
            return r5
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8298a3.mo27599g(com.onesignal.c1):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27600h(Collection<String> collection) {
        synchronized (this.f35325b) {
            for (String remove : collection) {
                this.f35325b.remove(remove);
            }
        }
    }
}
