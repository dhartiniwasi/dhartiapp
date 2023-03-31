package p221e9;

import p212d9.C9920l;

/* renamed from: e9.b */
/* compiled from: AztecReader */
public final class C10022b implements C9920l {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p212d9.C9922n mo32466a(p212d9.C9911c r11, java.util.Map<p212d9.C9913e, ?> r12) throws p212d9.C9918j, p212d9.C9914f {
        /*
            r10 = this;
            g9.a r0 = new g9.a
            h9.b r11 = r11.mo32451a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            e9.a r2 = r0.mo33095a(r11)     // Catch:{ j -> 0x002b, f -> 0x0025 }
            d9.p[] r3 = r2.mo33605b()     // Catch:{ j -> 0x002b, f -> 0x0025 }
            f9.a r4 = new f9.a     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4.<init>()     // Catch:{ j -> 0x0023, f -> 0x0021 }
            h9.e r2 = r4.mo32837c(r2)     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            e9.a r0 = r0.mo33095a(r1)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            d9.p[] r4 = r0.mo33605b()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            f9.a r1 = new f9.a     // Catch:{ j -> 0x0046, f -> 0x0044 }
            r1.<init>()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            h9.e r1 = r1.mo32837c(r0)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            d9.e r0 = p212d9.C9913e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            d9.q r12 = (p212d9.C9925q) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.mo32485a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            d9.n r11 = new d9.n
            java.lang.String r3 = r1.mo33596h()
            byte[] r4 = r1.mo33593e()
            int r5 = r1.mo33591c()
            d9.a r7 = p212d9.C9909a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.mo33589a()
            if (r12 == 0) goto L_0x0089
            d9.o r0 = p212d9.C9923o.BYTE_SEGMENTS
            r11.mo32478h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.mo33590b()
            if (r12 == 0) goto L_0x0094
            d9.o r0 = p212d9.C9923o.ERROR_CORRECTION_LEVEL
            r11.mo32478h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p221e9.C10022b.mo32466a(d9.c, java.util.Map):d9.n");
    }

    public void reset() {
    }
}
