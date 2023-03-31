package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7133q3;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7523u9 extends C7512t9 {

    /* renamed from: g */
    private final C7133q3 f33099g;

    /* renamed from: h */
    final /* synthetic */ C7304b f33100h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7523u9(C7304b bVar, String str, int i, C7133q3 q3Var) {
        super(str, i);
        this.f33100h = bVar;
        this.f33099g = q3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo24656a() {
        return this.f33099g.mo23740C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo24657b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo24658c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24688k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C7055l5 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C6914cd.m39885b()
            com.google.android.gms.measurement.internal.b r0 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r0 = r0.f32389a
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()
            java.lang.String r1 = r10.f33004a
            com.google.android.gms.measurement.internal.t2 r2 = com.google.android.gms.measurement.internal.C7516u2.f33034W
            boolean r0 = r0.mo24279B(r1, r2)
            com.google.android.gms.internal.measurement.q3 r1 = r10.f33099g
            boolean r1 = r1.mo23743I()
            com.google.android.gms.internal.measurement.q3 r2 = r10.f33099g
            boolean r2 = r2.mo23744J()
            com.google.android.gms.internal.measurement.q3 r3 = r10.f33099g
            boolean r3 = r3.mo23745K()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.b r11 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r11 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r11 = r11.mo24135l()
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo24260v()
            int r12 = r10.f33005b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.q3 r13 = r10.f33099g
            boolean r13 = r13.mo23746L()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.q3 r13 = r10.f33099g
            int r13 = r13.mo23740C()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo24210c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.q3 r6 = r10.f33099g
            com.google.android.gms.internal.measurement.j3 r6 = r6.mo23741D()
            boolean r7 = r6.mo23548I()
            boolean r8 = r13.mo23630S()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo23550K()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24261w()
            com.google.android.gms.measurement.internal.b r7 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r13.mo23627H()
            java.lang.String r7 = r7.mo24097f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo24209b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo23625D()
            com.google.android.gms.internal.measurement.o3 r2 = r6.mo23545E()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41918h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41920j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo23629R()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo23550K()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24261w()
            com.google.android.gms.measurement.internal.b r7 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r13.mo23627H()
            java.lang.String r7 = r7.mo24097f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo24209b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo23624C()
            com.google.android.gms.internal.measurement.o3 r2 = r6.mo23545E()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41917g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41920j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo23632U()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo23552M()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo23550K()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24261w()
            com.google.android.gms.measurement.internal.b r7 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r13.mo23627H()
            java.lang.String r7 = r7.mo24097f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo24209b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo23628I()
            boolean r8 = com.google.android.gms.measurement.internal.C7325c9.m41390N(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo23628I()
            com.google.android.gms.internal.measurement.o3 r6 = r6.mo23545E()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41919i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41920j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24261w()
            com.google.android.gms.measurement.internal.b r7 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r13.mo23627H()
            java.lang.String r7 = r7.mo24097f(r8)
            java.lang.String r8 = r13.mo23628I()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo24210c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo23628I()
            com.google.android.gms.internal.measurement.v3 r6 = r6.mo23546F()
            com.google.android.gms.measurement.internal.b r8 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r8 = r8.f32389a
            com.google.android.gms.measurement.internal.f3 r8 = r8.mo24135l()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41916f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C7512t9.m41920j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24261w()
            com.google.android.gms.measurement.internal.b r7 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r7 = r7.f32389a
            com.google.android.gms.measurement.internal.a3 r7 = r7.mo24414D()
            java.lang.String r8 = r13.mo23627H()
            java.lang.String r7 = r7.mo24097f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo24209b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.b r6 = r10.f33100h
            com.google.android.gms.measurement.internal.j4 r6 = r6.f32389a
            com.google.android.gms.measurement.internal.f3 r6 = r6.mo24135l()
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo24260v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo24209b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f33006c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.q3 r14 = r10.f33099g
            boolean r14 = r14.mo23743I()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f33007d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo23631T()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo23626E()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.q3 r11 = r10.f33099g
            boolean r11 = r11.mo23743I()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.q3 r11 = r10.f33099g
            boolean r11 = r11.mo23744J()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.q3 r11 = r10.f33099g
            boolean r11 = r11.mo23744J()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f33009f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f33008e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7523u9.mo24688k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.l5, boolean):boolean");
    }
}
