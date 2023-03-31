package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xo */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C3039xo {

    /* renamed from: a */
    protected final C2854so f20275a;

    /* renamed from: b */
    protected final int[] f20276b;

    /* renamed from: c */
    private final C2774qi[] f20277c = new C2774qi[1];

    /* renamed from: d */
    private int f20278d;

    public C3039xo(C2854so soVar, int... iArr) {
        Objects.requireNonNull(soVar);
        this.f20275a = soVar;
        for (int i = 0; i <= 0; i++) {
            this.f20277c[i] = soVar.mo14108b(iArr[i]);
        }
        Arrays.sort(this.f20277c, new C3002wo((C2965vo) null));
        this.f20276b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f20276b[i2] = soVar.mo14107a(this.f20277c[i2]);
        }
    }

    /* renamed from: a */
    public final int mo15196a(int i) {
        return this.f20276b[0];
    }

    /* renamed from: b */
    public final int mo15197b() {
        int length = this.f20276b.length;
        return 1;
    }

    /* renamed from: c */
    public final C2774qi mo15198c(int i) {
        return this.f20277c[i];
    }

    /* renamed from: d */
    public final C2854so mo15199d() {
        return this.f20275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3039xo xoVar = (C3039xo) obj;
            return this.f20275a == xoVar.f20275a && Arrays.equals(this.f20276b, xoVar.f20276b);
        }
    }

    public final int hashCode() {
        int i = this.f20278d;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f20275a) * 31) + Arrays.hashCode(this.f20276b);
        this.f20278d = identityHashCode;
        return identityHashCode;
    }
}
