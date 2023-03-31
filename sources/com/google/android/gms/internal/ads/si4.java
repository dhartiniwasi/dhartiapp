package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class si4 implements xj4 {

    /* renamed from: a */
    protected final gv0 f17483a;

    /* renamed from: b */
    protected final int f17484b;

    /* renamed from: c */
    protected final int[] f17485c;

    /* renamed from: d */
    private final C2388g4[] f17486d;

    /* renamed from: e */
    private int f17487e;

    public si4(gv0 gv0, int[] iArr, int i) {
        int length = iArr.length;
        v91.m22052f(length > 0);
        Objects.requireNonNull(gv0);
        this.f17483a = gv0;
        this.f17484b = length;
        this.f17486d = new C2388g4[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f17486d[i2] = gv0.mo10649b(iArr[i2]);
        }
        Arrays.sort(this.f17486d, ri4.f16970a);
        this.f17485c = new int[this.f17484b];
        for (int i3 = 0; i3 < this.f17484b; i3++) {
            this.f17485c[i3] = gv0.mo10648a(this.f17486d[i3]);
        }
    }

    /* renamed from: a */
    public final gv0 mo8851a() {
        return this.f17483a;
    }

    /* renamed from: e */
    public final int mo8852e() {
        return this.f17485c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            si4 si4 = (si4) obj;
            return this.f17483a == si4.f17483a && Arrays.equals(this.f17485c, si4.f17485c);
        }
    }

    /* renamed from: g */
    public final int mo8853g(int i) {
        return this.f17485c[0];
    }

    /* renamed from: h */
    public final C2388g4 mo8854h(int i) {
        return this.f17486d[i];
    }

    public final int hashCode() {
        int i = this.f17487e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f17483a) * 31) + Arrays.hashCode(this.f17485c);
        this.f17487e = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: s */
    public final int mo8855s(int i) {
        for (int i2 = 0; i2 < this.f17484b; i2++) {
            if (this.f17485c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
