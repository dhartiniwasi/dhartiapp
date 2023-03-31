package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ii4 {

    /* renamed from: a */
    private int f10796a;

    /* renamed from: b */
    private final SparseArray f10797b = new SparseArray();

    /* renamed from: c */
    private final zd1 f10798c;

    public ii4(zd1 zd1) {
        this.f10798c = zd1;
        this.f10796a = -1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final java.lang.Object mo11118a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f10796a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f10796a = r0
        L_0x0009:
            int r0 = r3.f10796a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray r2 = r3.f10797b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f10796a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f10796a
            android.util.SparseArray r2 = r3.f10797b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray r0 = r3.f10797b
            int r2 = r3.f10796a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f10796a
            int r0 = r0 + 1
            r3.f10796a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray r4 = r3.f10797b
            int r0 = r3.f10796a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ii4.mo11118a(int):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo11119b() {
        SparseArray sparseArray = this.f10797b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final void mo11120c(int i, Object obj) {
        boolean z = true;
        if (this.f10796a == -1) {
            v91.m22052f(this.f10797b.size() == 0);
            this.f10796a = 0;
        }
        if (this.f10797b.size() > 0) {
            SparseArray sparseArray = this.f10797b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            v91.m22050d(z);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.f10797b;
                bi4.m10390A((zh4) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f10797b.append(i, obj);
    }

    /* renamed from: d */
    public final void mo11121d() {
        for (int i = 0; i < this.f10797b.size(); i++) {
            bi4.m10390A((zh4) this.f10797b.valueAt(i));
        }
        this.f10796a = -1;
        this.f10797b.clear();
    }

    /* renamed from: e */
    public final void mo11122e(int i) {
        int i2 = 0;
        while (i2 < this.f10797b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f10797b.keyAt(i3)) {
                bi4.m10390A((zh4) this.f10797b.valueAt(i2));
                this.f10797b.removeAt(i2);
                int i4 = this.f10796a;
                if (i4 > 0) {
                    this.f10796a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo11123f() {
        return this.f10797b.size() == 0;
    }
}
