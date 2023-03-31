package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class f83 implements Serializable, c83 {

    /* renamed from: a */
    private final List f9192a;

    /* synthetic */ f83(List list, d83 d83) {
        this.f9192a = list;
    }

    /* renamed from: b */
    public final boolean mo8567b(Object obj) {
        for (int i = 0; i < this.f9192a.size(); i++) {
            if (!((c83) this.f9192a.get(i)).mo8567b(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f83) {
            return this.f9192a.equals(((f83) obj).f9192a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9192a.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f9192a;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
