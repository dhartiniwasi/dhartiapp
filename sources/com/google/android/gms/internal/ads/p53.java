package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class p53 extends h63 {

    /* renamed from: a */
    private final int f15697a;

    /* renamed from: b */
    private final String f15698b;

    /* synthetic */ p53(int i, String str, o53 o53) {
        this.f15697a = i;
        this.f15698b = str;
    }

    /* renamed from: a */
    public final int mo10746a() {
        return this.f15697a;
    }

    /* renamed from: b */
    public final String mo10747b() {
        return this.f15698b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f15698b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.h63
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.h63 r5 = (com.google.android.gms.internal.ads.h63) r5
            int r1 = r4.f15697a
            int r3 = r5.mo10746a()
            if (r1 != r3) goto L_0x002a
            java.lang.String r1 = r4.f15698b
            if (r1 != 0) goto L_0x001e
            java.lang.String r5 = r5.mo10747b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.String r5 = r5.mo10747b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p53.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f15697a ^ 1000003) * 1000003;
        String str = this.f15698b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f15697a;
        String str = this.f15698b;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }
}
