package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class wm0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 4) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l == 5) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 6) {
                C4241b.m28601x(parcel, r);
            } else {
                z2 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new vm0(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new vm0[i];
    }
}
