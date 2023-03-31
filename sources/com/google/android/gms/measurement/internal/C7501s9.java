package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6989h3;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7501s9 extends C7512t9 {

    /* renamed from: g */
    private final C6989h3 f32976g;

    /* renamed from: h */
    final /* synthetic */ C7304b f32977h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7501s9(C7304b bVar, String str, int i, C6989h3 h3Var) {
        super(str, i);
        this.f32977h = bVar;
        this.f32976g = h3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo24656a() {
        return this.f32976g.mo23462D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo24657b() {
        return this.f32976g.mo23470P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo24658c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24659k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C7150r4 r18, long r19, com.google.android.gms.measurement.internal.C7480r r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C6914cd.m39885b()
            com.google.android.gms.measurement.internal.b r1 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.h r1 = r1.mo24443z()
            java.lang.String r2 = r0.f33004a
            com.google.android.gms.measurement.internal.t2 r3 = com.google.android.gms.measurement.internal.C7516u2.f33036Y
            boolean r1 = r1.mo24279B(r2, r3)
            com.google.android.gms.internal.measurement.h3 r2 = r0.f32976g
            boolean r2 = r2.mo23469O()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f32915e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.b r4 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r4 = r4.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            java.lang.String r4 = r4.mo24253C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.b r4 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r4 = r4.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24260v()
            int r6 = r0.f33005b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.h3 r7 = r0.f32976g
            boolean r7 = r7.mo23471Q()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.h3 r7 = r0.f32976g
            int r7 = r7.mo23462D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.b r8 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r8 = r8.f32389a
            com.google.android.gms.measurement.internal.a3 r8 = r8.mo24414D()
            com.google.android.gms.internal.measurement.h3 r9 = r0.f32976g
            java.lang.String r9 = r9.mo23465I()
            java.lang.String r8 = r8.mo24095d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo24211d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.b r4 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r4 = r4.f32389a
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24260v()
            com.google.android.gms.measurement.internal.b r6 = r0.f32977h
            com.google.android.gms.measurement.internal.a9 r6 = r6.f32873b
            com.google.android.gms.measurement.internal.c9 r6 = r6.mo24127g0()
            com.google.android.gms.internal.measurement.h3 r7 = r0.f32976g
            java.lang.String r6 = r6.mo24196E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo24209b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.h3 r4 = r0.f32976g
            boolean r4 = r4.mo23471Q()
            r6 = 0
            if (r4 == 0) goto L_0x043f
            com.google.android.gms.internal.measurement.h3 r4 = r0.f32976g
            int r4 = r4.mo23462D()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x043f
        L_0x00a8:
            com.google.android.gms.internal.measurement.h3 r4 = r0.f32976g
            boolean r4 = r4.mo23467M()
            com.google.android.gms.internal.measurement.h3 r7 = r0.f32976g
            boolean r7 = r7.mo23468N()
            com.google.android.gms.internal.measurement.h3 r8 = r0.f32976g
            boolean r8 = r8.mo23469O()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.b r1 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24260v()
            int r2 = r0.f33005b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.h3 r3 = r0.f32976g
            boolean r3 = r3.mo23471Q()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.h3 r3 = r0.f32976g
            int r3 = r3.mo23462D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo24210c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.h3 r7 = r0.f32976g
            java.lang.String r8 = r18.mo23812J()
            boolean r10 = r7.mo23470P()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.o3 r10 = r7.mo23464H()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41918h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo23466J()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.j3 r10 = (com.google.android.gms.internal.measurement.C7021j3) r10
            java.lang.String r11 = r10.mo23547G()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo24209b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo23547G()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            r.a r3 = new r.a
            r3.<init>()
            java.util.List r10 = r18.mo23813K()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.v4 r11 = (com.google.android.gms.internal.measurement.C7214v4) r11
            java.lang.String r12 = r11.mo23949I()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo23954X()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo23949I()
            boolean r13 = r11.mo23954X()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo23948F()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo23952V()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo23949I()
            boolean r13 = r11.mo23952V()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo23945C()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo23956Z()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo23949I()
            java.lang.String r11 = r11.mo23950J()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r11.mo23949I()
            java.lang.String r7 = r7.mo24096e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo23466J()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.j3 r7 = (com.google.android.gms.internal.measurement.C7021j3) r7
            boolean r10 = r7.mo23549J()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo23548I()
            if (r10 == 0) goto L_0x0221
            r10 = 1
            goto L_0x0222
        L_0x0221:
            r10 = 0
        L_0x0222:
            java.lang.String r11 = r7.mo23547G()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo24209b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo23550K()
            if (r13 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r7 = r7.mo24096e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.o3 r7 = r7.mo23545E()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C7512t9.m41918h(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo23550K()
            if (r13 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r7 = r7.mo24096e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.o3 r7 = r7.mo23545E()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C7512t9.m41917g(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo23552M()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.v3 r7 = r7.mo23546F()
            com.google.android.gms.measurement.internal.b r11 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r11 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r11 = r11.mo24135l()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C7512t9.m41916f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo23550K()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C7325c9.m41390N(r12)
            if (r13 == 0) goto L_0x0332
            com.google.android.gms.internal.measurement.o3 r7 = r7.mo23545E()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C7512t9.m41919i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r7 = r7.mo24096e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r7 = r7.mo24096e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24260v()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r5 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a
            com.google.android.gms.measurement.internal.a3 r5 = r5.mo24414D()
            java.lang.String r5 = r5.mo24096e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo24210c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24261w()
            com.google.android.gms.measurement.internal.b r3 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r3 = r3.f32389a
            com.google.android.gms.measurement.internal.a3 r3 = r3.mo24414D()
            java.lang.String r3 = r3.mo24095d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r7 = r7.mo24096e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo24210c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            com.google.android.gms.measurement.internal.b r2 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r2 = r2.f32389a
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24260v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo24209b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f33006c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f33007d = r2
            if (r4 == 0) goto L_0x043e
            boolean r2 = r18.mo23816V()
            if (r2 == 0) goto L_0x043e
            long r2 = r18.mo23810F()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.h3 r3 = r0.f32976g
            boolean r3 = r3.mo23468N()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.h3 r1 = r0.f32976g
            boolean r1 = r1.mo23470P()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f33009f = r2
            goto L_0x043e
        L_0x0430:
            if (r1 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.h3 r1 = r0.f32976g
            boolean r1 = r1.mo23470P()
            if (r1 == 0) goto L_0x043c
            r2 = r17
        L_0x043c:
            r0.f33008e = r2
        L_0x043e:
            return r9
        L_0x043f:
            com.google.android.gms.measurement.internal.b r1 = r0.f32977h
            com.google.android.gms.measurement.internal.j4 r1 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r1 = r1.mo24135l()
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo24261w()
            java.lang.String r2 = r0.f33004a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r2)
            com.google.android.gms.internal.measurement.h3 r3 = r0.f32976g
            boolean r3 = r3.mo23471Q()
            if (r3 == 0) goto L_0x0463
            com.google.android.gms.internal.measurement.h3 r3 = r0.f32976g
            int r3 = r3.mo23462D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0463:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo24210c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7501s9.mo24659k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.r4, long, com.google.android.gms.measurement.internal.r, boolean):boolean");
    }
}
