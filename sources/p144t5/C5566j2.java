package p144t5;

/* renamed from: t5.j2 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5566j2 {

    /* renamed from: a */
    private final C5570k2 f28134a;

    /* renamed from: b */
    private final C5611y0 f28135b;

    /* renamed from: c */
    private int f28136c = 0;

    C5566j2(C5570k2 k2Var, C5611y0 y0Var) {
        this.f28134a = k2Var;
        this.f28135b = y0Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p144t5.C5531b mo19869a() throws p144t5.C5600u1 {
        /*
            r11 = this;
            t5.y0 r0 = r11.f28135b
            int r1 = r0.f28247f
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00c4
            r1 = 2
            r4 = 3
            r5 = 1
            switch(r2) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0059;
                case 4: goto L_0x0056;
                case 5: goto L_0x0053;
                case 6: goto L_0x0035;
                case 7: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            t5.u1 r0 = new t5.u1
            java.lang.String r1 = "Invalid response from server."
            r0.<init>(r5, r1)
            throw r0
        L_0x0017:
            t5.u1 r1 = new t5.u1
            java.lang.String r0 = r0.f28244c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x002c
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0031
        L_0x002c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0031:
            r1.<init>(r4, r0)
            throw r1
        L_0x0035:
            t5.u1 r1 = new t5.u1
            java.lang.String r0 = r0.f28244c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = r2.concat(r0)
            goto L_0x004f
        L_0x004a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x004f:
            r1.<init>(r5, r0)
            throw r1
        L_0x0053:
            r11.f28136c = r5
            goto L_0x005b
        L_0x0056:
            r11.f28136c = r1
            goto L_0x005b
        L_0x0059:
            r11.f28136c = r4
        L_0x005b:
            java.lang.String r2 = r0.f28242a
            if (r2 != 0) goto L_0x0061
            r4 = r3
            goto L_0x0068
        L_0x0061:
            t5.e0 r4 = new t5.e0
            java.lang.String r0 = r0.f28243b
            r4.<init>(r0, r2)
        L_0x0068:
            t5.k2 r0 = r11.f28134a
            t5.n r0 = r0.f28153c
            java.util.HashSet r2 = new java.util.HashSet
            t5.y0 r6 = r11.f28135b
            java.util.List<java.lang.String> r6 = r6.f28245d
            r2.<init>(r6)
            r0.mo19885g(r2)
            t5.y0 r0 = r11.f28135b
            java.util.List<t5.x0> r0 = r0.f28246e
            java.util.Iterator r0 = r0.iterator()
        L_0x0082:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r0.next()
            t5.x0 r2 = (p144t5.C5608x0) r2
            int r6 = r2.f28239b
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x00bb
            if (r7 == 0) goto L_0x00a1
            if (r7 == r5) goto L_0x009e
            if (r7 == r1) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            java.lang.String r6 = "clear"
            goto L_0x00a2
        L_0x009e:
            java.lang.String r6 = "write"
            goto L_0x00a2
        L_0x00a1:
            r6 = r3
        L_0x00a2:
            if (r6 == 0) goto L_0x0082
            t5.k2 r7 = r11.f28134a
            t5.s1 r7 = r7.f28151a
            java.lang.String r2 = r2.f28238a
            t5.r1[] r8 = new p144t5.C5591r1[r5]
            r9 = 0
            t5.k2 r10 = r11.f28134a
            t5.l r10 = r10.f28152b
            r8[r9] = r10
            r7.mo19894b(r6, r2, r8)
            goto L_0x0082
        L_0x00bb:
            throw r3
        L_0x00bc:
            t5.b r0 = new t5.b
            int r1 = r11.f28136c
            r0.<init>(r1, r4, r3)
            return r0
        L_0x00c4:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p144t5.C5566j2.mo19869a():t5.b");
    }
}
