package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wa3 {

    /* renamed from: a */
    Object[] f19544a;

    /* renamed from: b */
    int f19545b;

    /* renamed from: c */
    va3 f19546c;

    public wa3() {
        this(4);
    }

    /* renamed from: d */
    private final void m22643d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f19544a;
        int length = objArr.length;
        if (i2 > length) {
            this.f19544a = Arrays.copyOf(objArr, oa3.m17662b(length, i2));
        }
    }

    /* renamed from: a */
    public final wa3 mo14881a(Object obj, Object obj2) {
        m22643d(this.f19545b + 1);
        s93.m20212b(obj, obj2);
        Object[] objArr = this.f19544a;
        int i = this.f19545b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f19545b = i + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.wa3 mo14882b(java.lang.Iterable r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f19545b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m22643d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo14881a(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wa3.mo14882b(java.lang.Iterable):com.google.android.gms.internal.ads.wa3");
    }

    /* renamed from: c */
    public final xa3 mo14883c() {
        va3 va3 = this.f19546c;
        if (va3 == null) {
            jc3 j = jc3.m14819j(this.f19545b, this.f19544a, this);
            va3 va32 = this.f19546c;
            if (va32 == null) {
                return j;
            }
            throw va32.mo14705a();
        }
        throw va3.mo14705a();
    }

    wa3(int i) {
        this.f19544a = new Object[(i + i)];
        this.f19545b = 0;
    }
}
