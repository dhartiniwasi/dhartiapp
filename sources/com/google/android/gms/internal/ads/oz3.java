package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oz3 {

    /* renamed from: a */
    public final String f15637a;

    /* renamed from: b */
    public final C2388g4 f15638b;

    /* renamed from: c */
    public final C2388g4 f15639c;

    /* renamed from: d */
    public final int f15640d;

    /* renamed from: e */
    public final int f15641e;

    public oz3(String str, C2388g4 g4Var, C2388g4 g4Var2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            v91.m22050d(z);
            v91.m22049c(str);
            this.f15637a = str;
            Objects.requireNonNull(g4Var);
            this.f15638b = g4Var;
            Objects.requireNonNull(g4Var2);
            this.f15639c = g4Var2;
            this.f15640d = i;
            this.f15641e = i2;
        }
        z = true;
        v91.m22050d(z);
        v91.m22049c(str);
        this.f15637a = str;
        Objects.requireNonNull(g4Var);
        this.f15638b = g4Var;
        Objects.requireNonNull(g4Var2);
        this.f15639c = g4Var2;
        this.f15640d = i;
        this.f15641e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oz3.class == obj.getClass()) {
            oz3 oz3 = (oz3) obj;
            return this.f15640d == oz3.f15640d && this.f15641e == oz3.f15641e && this.f15637a.equals(oz3.f15637a) && this.f15638b.equals(oz3.f15638b) && this.f15639c.equals(oz3.f15639c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f15640d + 527) * 31) + this.f15641e) * 31) + this.f15637a.hashCode()) * 31) + this.f15638b.hashCode()) * 31) + this.f15639c.hashCode();
    }
}
