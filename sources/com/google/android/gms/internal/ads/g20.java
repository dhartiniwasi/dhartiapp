package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p060h4.C4499e4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class g20 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C4499e4 e4Var = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel, r);
                    break;
                case 2:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 3:
                    i2 = C4241b.m28597t(parcel, r);
                    break;
                case 4:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 5:
                    i3 = C4241b.m28597t(parcel, r);
                    break;
                case 6:
                    e4Var = (C4499e4) C4241b.m28582e(parcel, r, C4499e4.CREATOR);
                    break;
                case 7:
                    z3 = C4241b.m28590m(parcel, r);
                    break;
                case 8:
                    i4 = C4241b.m28597t(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new f20(i, z, i2, z2, i3, e4Var, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new f20[i];
    }
}
