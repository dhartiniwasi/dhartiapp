package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.to */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2891to {

    /* renamed from: d */
    public static final C2891to f18175d = new C2891to(new C2854so[0]);

    /* renamed from: a */
    public final int f18176a;

    /* renamed from: b */
    private final C2854so[] f18177b;

    /* renamed from: c */
    private int f18178c;

    public C2891to(C2854so... soVarArr) {
        this.f18177b = soVarArr;
        this.f18176a = soVarArr.length;
    }

    /* renamed from: a */
    public final int mo14332a(C2854so soVar) {
        for (int i = 0; i < this.f18176a; i++) {
            if (this.f18177b[i] == soVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C2854so mo14333b(int i) {
        return this.f18177b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2891to.class == obj.getClass()) {
            C2891to toVar = (C2891to) obj;
            return this.f18176a == toVar.f18176a && Arrays.equals(this.f18177b, toVar.f18177b);
        }
    }

    public final int hashCode() {
        int i = this.f18178c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f18177b);
        this.f18178c = hashCode;
        return hashCode;
    }
}
