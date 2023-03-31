package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p040e5.C4240a;
import p040e5.C4243c;
import p087l4.C4951w;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class wd0 extends C4240a {
    public static final Parcelable.Creator<wd0> CREATOR = new xd0();

    /* renamed from: a */
    public final int f19584a;

    /* renamed from: b */
    public final int f19585b;

    /* renamed from: c */
    public final int f19586c;

    wd0(int i, int i2, int i3) {
        this.f19584a = i;
        this.f19585b = i2;
        this.f19586c = i3;
    }

    /* renamed from: I1 */
    public static wd0 m22704I1(C4951w wVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof wd0)) {
            wd0 wd0 = (wd0) obj;
            if (wd0.f19586c == this.f19586c && wd0.f19585b == this.f19585b && wd0.f19584a == this.f19584a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f19584a, this.f19585b, this.f19586c});
    }

    public final String toString() {
        int i = this.f19584a;
        int i2 = this.f19585b;
        int i3 = this.f19586c;
        return i + "." + i2 + "." + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f19584a);
        C4243c.m28614k(parcel, 2, this.f19585b);
        C4243c.m28614k(parcel, 3, this.f19586c);
        C4243c.m28605b(parcel, a);
    }
}
