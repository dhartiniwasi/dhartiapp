package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.so */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2854so {

    /* renamed from: a */
    public final int f17600a = 1;

    /* renamed from: b */
    private final C2774qi[] f17601b;

    /* renamed from: c */
    private int f17602c;

    public C2854so(C2774qi... qiVarArr) {
        this.f17601b = qiVarArr;
    }

    /* renamed from: a */
    public final int mo14107a(C2774qi qiVar) {
        for (int i = 0; i <= 0; i++) {
            if (qiVar == this.f17601b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C2774qi mo14108b(int i) {
        return this.f17601b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2854so.class == obj.getClass() && Arrays.equals(this.f17601b, ((C2854so) obj).f17601b);
    }

    public final int hashCode() {
        int i = this.f17602c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f17601b) + 527;
        this.f17602c = hashCode;
        return hashCode;
    }
}
