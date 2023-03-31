package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pm3 {

    /* renamed from: a */
    private final Class f15919a;

    /* renamed from: b */
    private final pv3 f15920b;

    /* synthetic */ pm3(Class cls, pv3 pv3, om3 om3) {
        this.f15919a = cls;
        this.f15920b = pv3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pm3)) {
            return false;
        }
        pm3 pm3 = (pm3) obj;
        if (!pm3.f15919a.equals(this.f15919a) || !pm3.f15920b.equals(this.f15920b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15919a, this.f15920b});
    }

    public final String toString() {
        String simpleName = this.f15919a.getSimpleName();
        String valueOf = String.valueOf(this.f15920b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
