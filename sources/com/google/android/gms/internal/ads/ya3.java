package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ya3 extends na3 {

    /* renamed from: d */
    Object[] f20545d;

    /* renamed from: e */
    private int f20546e;

    ya3(int i) {
        super(i);
        this.f20545d = new Object[za3.m24503o(i)];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ oa3 mo12886a(Object obj) {
        mo15356f(obj);
        return this;
    }

    /* renamed from: f */
    public final ya3 mo15356f(Object obj) {
        int length;
        Objects.requireNonNull(obj);
        if (this.f20545d == null || za3.m24503o(this.f13930b) > (length = this.f20545d.length)) {
            this.f20545d = null;
            super.mo12560c(obj);
            return this;
        }
        int i = length - 1;
        int hashCode = obj.hashCode();
        int a = ma3.m16460a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.f20545d;
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (obj2.equals(obj)) {
                    break;
                }
                a = i2 + 1;
            } else {
                objArr[i2] = obj;
                this.f20546e += hashCode;
                super.mo12560c(obj);
                break;
            }
        }
        return this;
    }

    /* renamed from: g */
    public final ya3 mo15357g(Iterable iterable) {
        if (this.f20545d != null) {
            for (Object f : iterable) {
                mo15356f(f);
            }
        } else {
            super.mo12561d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.kc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.za3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.kc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.ads.kc3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.za3 mo15358h() {
        /*
            r9 = this;
            int r0 = r9.f13930b
            if (r0 == 0) goto L_0x0056
            r1 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.Object[] r2 = r9.f20545d
            if (r2 == 0) goto L_0x0034
            int r0 = com.google.android.gms.internal.ads.za3.m24503o(r0)
            java.lang.Object[] r2 = r9.f20545d
            int r2 = r2.length
            if (r0 != r2) goto L_0x0034
            int r0 = r9.f13930b
            java.lang.Object[] r2 = r9.f13929a
            int r3 = r2.length
            boolean r3 = com.google.android.gms.internal.ads.za3.m24510y(r0, r3)
            if (r3 == 0) goto L_0x0023
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L_0x0023:
            r4 = r2
            com.google.android.gms.internal.ads.kc3 r0 = new com.google.android.gms.internal.ads.kc3
            int r5 = r9.f20546e
            java.lang.Object[] r6 = r9.f20545d
            int r2 = r6.length
            int r7 = r2 + -1
            int r8 = r9.f13930b
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0042
        L_0x0034:
            int r0 = r9.f13930b
            java.lang.Object[] r2 = r9.f13929a
            com.google.android.gms.internal.ads.za3 r0 = com.google.android.gms.internal.ads.za3.m24509x(r0, r2)
            int r2 = r0.size()
            r9.f13930b = r2
        L_0x0042:
            r9.f13931c = r1
            r1 = 0
            r9.f20545d = r1
            return r0
        L_0x0048:
            java.lang.Object[] r0 = r9.f13929a
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.rc3 r1 = new com.google.android.gms.internal.ads.rc3
            r1.<init>(r0)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.kc3 r0 = com.google.android.gms.internal.ads.kc3.f12017i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ya3.mo15358h():com.google.android.gms.internal.ads.za3");
    }
}
