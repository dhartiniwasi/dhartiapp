package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7273z extends C7241x {
    public C7273z() {
        this.f32175a.add(C7082n0.EQUALS);
        this.f32175a.add(C7082n0.GREATER_THAN);
        this.f32175a.add(C7082n0.GREATER_THAN_EQUALS);
        this.f32175a.add(C7082n0.IDENTITY_EQUALS);
        this.f32175a.add(C7082n0.IDENTITY_NOT_EQUALS);
        this.f32175a.add(C7082n0.LESS_THAN);
        this.f32175a.add(C7082n0.LESS_THAN_EQUALS);
        this.f32175a.add(C7082n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m41163c(C7129q qVar, C7129q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C7209v) || (qVar instanceof C7097o)) {
                return true;
            }
            if (qVar instanceof C7001i) {
                return !Double.isNaN(qVar.mo23368U().doubleValue()) && !Double.isNaN(qVar2.mo23368U().doubleValue()) && qVar.mo23368U().doubleValue() == qVar2.mo23368U().doubleValue();
            }
            if (qVar instanceof C7193u) {
                return qVar.mo23369V().equals(qVar2.mo23369V());
            }
            if (qVar instanceof C6968g) {
                return qVar.mo23372c().equals(qVar2.mo23372c());
            }
            return qVar == qVar2;
        } else if (((qVar instanceof C7209v) || (qVar instanceof C7097o)) && ((qVar2 instanceof C7209v) || (qVar2 instanceof C7097o))) {
            return true;
        } else {
            boolean z = qVar instanceof C7001i;
            if (z && (qVar2 instanceof C7193u)) {
                return m41163c(qVar, new C7001i(qVar2.mo23368U()));
            }
            boolean z2 = qVar instanceof C7193u;
            if (z2 && (qVar2 instanceof C7001i)) {
                return m41163c(new C7001i(qVar.mo23368U()), qVar2);
            }
            if (qVar instanceof C6968g) {
                return m41163c(new C7001i(qVar.mo23368U()), qVar2);
            }
            if (qVar2 instanceof C6968g) {
                return m41163c(qVar, new C7001i(qVar2.mo23368U()));
            }
            if ((z2 || z) && (qVar2 instanceof C7065m)) {
                return m41163c(qVar, new C7193u(qVar2.mo23369V()));
            }
            if (!(qVar instanceof C7065m) || (!(qVar2 instanceof C7193u) && !(qVar2 instanceof C7001i))) {
                return false;
            }
            return m41163c(new C7193u(qVar.mo23369V()), qVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m41164d(com.google.android.gms.internal.measurement.C7129q r8, com.google.android.gms.internal.measurement.C7129q r9) {
        /*
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.C7065m
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.measurement.u r0 = new com.google.android.gms.internal.measurement.u
            java.lang.String r8 = r8.mo23369V()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.C7065m
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.internal.measurement.u r0 = new com.google.android.gms.internal.measurement.u
            java.lang.String r9 = r9.mo23369V()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.C7193u
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.C7193u
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.mo23369V()
            java.lang.String r9 = r9.mo23369V()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.mo23368U()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.mo23368U()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7273z.m41164d(com.google.android.gms.internal.measurement.q, com.google.android.gms.internal.measurement.q):boolean");
    }

    /* renamed from: e */
    private static boolean m41165e(C7129q qVar, C7129q qVar2) {
        if (qVar instanceof C7065m) {
            qVar = new C7193u(qVar.mo23369V());
        }
        if (qVar2 instanceof C7065m) {
            qVar2 = new C7193u(qVar2.mo23369V());
        }
        if (((!(qVar instanceof C7193u) || !(qVar2 instanceof C7193u)) && (Double.isNaN(qVar.mo23368U().doubleValue()) || Double.isNaN(qVar2.mo23368U().doubleValue()))) || m41164d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        boolean z;
        boolean c;
        C7279z5.m41182h(C7279z5.m41179e(str).name(), 2, list);
        C7129q b = y4Var.mo24007b((C7129q) list.get(0));
        C7129q b2 = y4Var.mo24007b((C7129q) list.get(1));
        int ordinal = C7279z5.m41179e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m41163c(b, b2);
            } else if (ordinal == 42) {
                z = m41164d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m41164d(b2, b);
                        break;
                    case 38:
                        z = m41165e(b2, b);
                        break;
                    case 39:
                        z = C7279z5.m41186l(b, b2);
                        break;
                    case 40:
                        c = C7279z5.m41186l(b, b2);
                        break;
                    default:
                        return super.mo23977b(str);
                }
            } else {
                z = m41165e(b, b2);
            }
            z = !c;
        } else {
            z = m41163c(b, b2);
        }
        return z ? C7129q.f31952T : C7129q.f31953U;
    }
}
