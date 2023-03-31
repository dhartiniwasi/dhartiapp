package com.startapp;

import java.util.Arrays;

/* renamed from: com.startapp.x0 */
/* compiled from: Sta */
public abstract class C9629x0 {

    /* renamed from: a */
    public final int f39351a;

    /* renamed from: b */
    public final int f39352b;

    /* renamed from: c */
    public final int f39353c;

    /* renamed from: d */
    public final int f39354d;

    /* renamed from: com.startapp.x0$a */
    /* compiled from: Sta */
    public static class C9630a {

        /* renamed from: a */
        public int f39355a;

        /* renamed from: b */
        public byte[] f39356b;

        /* renamed from: c */
        public int f39357c;

        /* renamed from: d */
        public int f39358d;

        /* renamed from: e */
        public boolean f39359e;

        /* renamed from: f */
        public int f39360f;

        /* renamed from: g */
        public int f39361g;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{C9630a.class.getSimpleName(), Arrays.toString(this.f39356b), Integer.valueOf(this.f39360f), Boolean.valueOf(this.f39359e), Integer.valueOf(this.f39355a), 0L, Integer.valueOf(this.f39361g), Integer.valueOf(this.f39357c), Integer.valueOf(this.f39358d)});
        }
    }

    public C9629x0(int i, int i2, int i3, int i4) {
        this.f39351a = i;
        this.f39352b = i2;
        this.f39353c = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f39354d = i4;
    }

    /* renamed from: a */
    public byte[] mo31355a(int i, C9630a aVar) {
        byte[] bArr = aVar.f39356b;
        if (bArr != null && bArr.length >= aVar.f39357c + i) {
            return bArr;
        }
        if (bArr == null) {
            aVar.f39356b = new byte[8192];
            aVar.f39357c = 0;
            aVar.f39358d = 0;
        } else {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f39356b = bArr2;
        }
        return aVar.f39356b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:1:0x0003->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31354a(byte[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0003:
            if (r2 >= r0) goto L_0x0022
            byte r3 = r8[r2]
            r4 = 61
            r5 = 1
            if (r4 == r3) goto L_0x0021
            if (r3 < 0) goto L_0x001a
            byte[] r4 = com.startapp.C9546t0.f39172k
            int r6 = r4.length
            if (r3 >= r6) goto L_0x001a
            byte r3 = r4[r3]
            r4 = -1
            if (r3 == r4) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0021:
            return r5
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9629x0.mo31354a(byte[]):boolean");
    }
}
