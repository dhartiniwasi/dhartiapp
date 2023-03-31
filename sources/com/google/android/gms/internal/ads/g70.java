package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g70 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                strArr = C4241b.m28584g(parcel, r);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                strArr2 = C4241b.m28584g(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new f70(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new f70[i];
    }
}
