package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rm3 {

    /* renamed from: a */
    private final Class f17021a;

    /* renamed from: b */
    private final Class f17022b;

    /* synthetic */ rm3(Class cls, Class cls2, qm3 qm3) {
        this.f17021a = cls;
        this.f17022b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rm3)) {
            return false;
        }
        rm3 rm3 = (rm3) obj;
        if (!rm3.f17021a.equals(this.f17021a) || !rm3.f17022b.equals(this.f17022b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17021a, this.f17022b});
    }

    public final String toString() {
        String simpleName = this.f17021a.getSimpleName();
        String simpleName2 = this.f17022b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
