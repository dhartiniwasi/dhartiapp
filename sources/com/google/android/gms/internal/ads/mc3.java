package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mc3 extends cc3 implements Serializable {

    /* renamed from: a */
    final cc3 f13306a;

    mc3(cc3 cc3) {
        this.f13306a = cc3;
    }

    /* renamed from: a */
    public final cc3 mo8303a() {
        return this.f13306a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f13306a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mc3) {
            return this.f13306a.equals(((mc3) obj).f13306a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13306a.hashCode();
    }

    public final String toString() {
        cc3 cc3 = this.f13306a;
        Objects.toString(cc3);
        return cc3.toString().concat(".reverse()");
    }
}
