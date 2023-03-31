package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6951f implements Iterable, C7129q, C7065m {

    /* renamed from: a */
    final SortedMap f31671a;

    /* renamed from: b */
    final Map f31672b;

    public C6951f() {
        this.f31671a = new TreeMap();
        this.f31672b = new TreeMap();
    }

    /* renamed from: U */
    public final Double mo23368U() {
        if (this.f31671a.size() == 1) {
            return mo23380o(0).mo23368U();
        }
        if (this.f31671a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: V */
    public final String mo23369V() {
        return mo23381q(",");
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return new C6917d(this, this.f31671a.keySet().iterator(), this.f31672b.keySet().iterator());
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        C6951f fVar = new C6951f();
        for (Map.Entry entry : this.f31671a.entrySet()) {
            if (entry.getValue() instanceof C7065m) {
                fVar.f31671a.put((Integer) entry.getKey(), (C7129q) entry.getValue());
            } else {
                fVar.f31671a.put((Integer) entry.getKey(), ((C7129q) entry.getValue()).mo23371b());
            }
        }
        return fVar;
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6951f)) {
            return false;
        }
        C6951f fVar = (C6951f) obj;
        if (mo23379l() != fVar.mo23379l()) {
            return false;
        }
        if (this.f31671a.isEmpty()) {
            return fVar.f31671a.isEmpty();
        }
        for (int intValue = ((Integer) this.f31671a.firstKey()).intValue(); intValue <= ((Integer) this.f31671a.lastKey()).intValue(); intValue++) {
            if (!mo23380o(intValue).equals(fVar.mo23380o(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo23374f(String str) {
        return "length".equals(str) || this.f31672b.containsKey(str);
    }

    public final int hashCode() {
        return this.f31671a.hashCode() * 31;
    }

    /* renamed from: i */
    public final void mo23376i(String str, C7129q qVar) {
        if (qVar == null) {
            this.f31672b.remove(str);
        } else {
            this.f31672b.put(str, qVar);
        }
    }

    public final Iterator iterator() {
        return new C6934e(this);
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C6918d0.m39895a(str, this, y4Var, list);
        }
        return C7033k.m40306a(this, new C7193u(str), y4Var, list);
    }

    /* renamed from: k */
    public final int mo23378k() {
        return this.f31671a.size();
    }

    /* renamed from: l */
    public final int mo23379l() {
        if (this.f31671a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f31671a.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.C7129q) r1.f31671a.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7129q mo23380o(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo23379l()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo23390y(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f31671a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C7129q) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C7129q.f31955m
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6951f.mo23380o(int):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: q */
    public final String mo23381q(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f31671a.isEmpty()) {
            for (int i = 0; i < mo23379l(); i++) {
                C7129q o = mo23380o(i);
                sb.append(str);
                if (!(o instanceof C7209v) && !(o instanceof C7097o)) {
                    sb.append(o.mo23369V());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: r */
    public final Iterator mo23382r() {
        return this.f31671a.keySet().iterator();
    }

    /* renamed from: s */
    public final List mo23383s() {
        ArrayList arrayList = new ArrayList(mo23379l());
        for (int i = 0; i < mo23379l(); i++) {
            arrayList.add(mo23380o(i));
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void mo23384t() {
        this.f31671a.clear();
    }

    public final String toString() {
        return mo23381q(",");
    }

    /* renamed from: u */
    public final void mo23386u(int i, C7129q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo23379l()) {
            mo23389x(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f31671a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f31671a;
                Integer valueOf = Integer.valueOf(intValue);
                C7129q qVar2 = (C7129q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo23389x(intValue + 1, qVar2);
                    this.f31671a.remove(valueOf);
                }
            }
            mo23389x(i, qVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.C7129q) r2.f31672b.get(r3);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7129q mo23387v(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.i r3 = new com.google.android.gms.internal.measurement.i
            int r0 = r2.mo23379l()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo23374f(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f31672b
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C7129q) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.q r3 = com.google.android.gms.internal.measurement.C7129q.f31955m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6951f.mo23387v(java.lang.String):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: w */
    public final void mo23388w(int i) {
        int intValue = ((Integer) this.f31671a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f31671a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f31671a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f31671a.put(valueOf, C7129q.f31955m);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f31671a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f31671a;
                    Integer valueOf2 = Integer.valueOf(i);
                    C7129q qVar = (C7129q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f31671a.put(Integer.valueOf(i - 1), qVar);
                        this.f31671a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo23389x(int i, C7129q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f31671a.remove(Integer.valueOf(i));
        } else {
            this.f31671a.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: y */
    public final boolean mo23390y(int i) {
        if (i >= 0 && i <= ((Integer) this.f31671a.lastKey()).intValue()) {
            return this.f31671a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public C6951f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo23389x(i, (C7129q) list.get(i));
            }
        }
    }
}
