package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class t70 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 3) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                str2 = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new s70(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s70[i];
    }
}