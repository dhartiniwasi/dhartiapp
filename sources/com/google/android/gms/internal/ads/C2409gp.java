package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2409gp {

    /* renamed from: a */
    private int f10022a;

    /* renamed from: b */
    private final C3039xo[] f10023b;

    public C2409gp(C3039xo[] xoVarArr, byte... bArr) {
        this.f10023b = xoVarArr;
    }

    /* renamed from: a */
    public final C3039xo mo10596a(int i) {
        return this.f10023b[i];
    }

    /* renamed from: b */
    public final C3039xo[] mo10597b() {
        return (C3039xo[]) this.f10023b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2409gp.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10023b, ((C2409gp) obj).f10023b);
    }

    public final int hashCode() {
        int i = this.f10022a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f10023b) + 527;
        this.f10022a = hashCode;
        return hashCode;
    }
}
