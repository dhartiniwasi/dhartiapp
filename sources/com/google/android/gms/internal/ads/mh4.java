package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mh4 {

    /* renamed from: a */
    public final int f13339a;

    /* renamed from: b */
    public final boolean f13340b;

    public mh4(int i, boolean z) {
        this.f13339a = i;
        this.f13340b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mh4.class == obj.getClass()) {
            mh4 mh4 = (mh4) obj;
            return this.f13339a == mh4.f13339a && this.f13340b == mh4.f13340b;
        }
    }

    public final int hashCode() {
        return (this.f13339a * 31) + (this.f13340b ? 1 : 0);
    }
}
