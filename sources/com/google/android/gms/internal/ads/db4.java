package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class db4 {

    /* renamed from: c */
    public static final db4 f8176c = new db4(new int[]{2}, 8);

    /* renamed from: d */
    private static final db4 f8177d = new db4(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final xa3 f8178e;

    /* renamed from: a */
    private final int[] f8179a;

    /* renamed from: b */
    private final int f8180b = 8;

    static {
        wa3 wa3 = new wa3();
        wa3.mo14881a(5, 6);
        wa3.mo14881a(17, 6);
        wa3.mo14881a(7, 6);
        wa3.mo14881a(18, 6);
        wa3.mo14881a(6, 8);
        wa3.mo14881a(8, 8);
        wa3.mo14881a(14, 8);
        f8178e = wa3.mo14883c();
    }

    public db4(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f8179a = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r7 != 5) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo9506a(com.google.android.gms.internal.ads.C2388g4 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f9673l
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r10.f9670i
            int r0 = com.google.android.gms.internal.ads.d90.m11362a(r0, r1)
            com.google.android.gms.internal.ads.xa3 r1 = f8178e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0019
            return r3
        L_0x0019:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L_0x002b
            boolean r0 = r9.mo9507c(r6)
            if (r0 != 0) goto L_0x0029
            r0 = 6
            goto L_0x0034
        L_0x0029:
            r0 = 18
        L_0x002b:
            if (r0 != r5) goto L_0x0034
            boolean r7 = r9.mo9507c(r5)
            if (r7 != 0) goto L_0x0034
            r0 = 7
        L_0x0034:
            boolean r7 = r9.mo9507c(r0)
            if (r7 != 0) goto L_0x003b
            return r3
        L_0x003b:
            int r7 = r10.f9686y
            r8 = -1
            if (r7 == r8) goto L_0x0046
            if (r0 != r6) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            if (r7 <= r5) goto L_0x006e
            return r3
        L_0x0046:
            int r10 = r10.f9687z
            if (r10 != r8) goto L_0x004d
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x004d:
            int r6 = com.google.android.gms.internal.ads.gb2.f9812a
            r7 = 29
            if (r6 < r7) goto L_0x0058
            int r7 = com.google.android.gms.internal.ads.cb4.m10821a(r0, r10)
            goto L_0x006e
        L_0x0058:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r7 = r10.intValue()
        L_0x006e:
            int r10 = com.google.android.gms.internal.ads.gb2.f9812a
            r1 = 28
            if (r10 > r1) goto L_0x0083
            if (r7 != r2) goto L_0x0079
            r4 = 8
            goto L_0x0084
        L_0x0079:
            r1 = 3
            if (r7 == r1) goto L_0x0084
            r1 = 4
            if (r7 == r1) goto L_0x0084
            r1 = 5
            if (r7 != r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r4 = r7
        L_0x0084:
            r1 = 26
            if (r10 > r1) goto L_0x0096
            java.lang.String r10 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0096
            r10 = 1
            if (r4 != r10) goto L_0x0096
            r4 = 2
        L_0x0096:
            int r10 = com.google.android.gms.internal.ads.gb2.m13150T(r4)
            if (r10 != 0) goto L_0x009d
            return r3
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db4.mo9506a(com.google.android.gms.internal.ads.g4):android.util.Pair");
    }

    /* renamed from: c */
    public final boolean mo9507c(int i) {
        return Arrays.binarySearch(this.f8179a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db4) && Arrays.equals(this.f8179a, ((db4) obj).f8179a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f8179a) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f8179a);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }
}
