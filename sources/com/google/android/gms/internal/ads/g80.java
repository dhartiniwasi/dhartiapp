package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class g80 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                i3 = C4241b.m28597t(parcel, r);
            } else if (l != 1000) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new f80(i, i2, str, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new f80[i];
    }
}
