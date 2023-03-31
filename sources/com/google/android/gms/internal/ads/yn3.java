package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yn3 {

    /* renamed from: a */
    private final rn3 f20720a;

    /* renamed from: b */
    private final List f20721b;

    /* renamed from: c */
    private final Integer f20722c;

    /* synthetic */ yn3(rn3 rn3, List list, Integer num, xn3 xn3) {
        this.f20720a = rn3;
        this.f20721b = list;
        this.f20722c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yn3)) {
            return false;
        }
        yn3 yn3 = (yn3) obj;
        if (this.f20720a.equals(yn3.f20720a) && this.f20721b.equals(yn3.f20721b)) {
            Integer num = this.f20722c;
            Integer num2 = yn3.f20722c;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20720a, this.f20721b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f20720a, this.f20721b, this.f20722c});
    }
}
