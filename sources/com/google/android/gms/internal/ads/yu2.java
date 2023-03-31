package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yu2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel, r);
                    break;
                case 2:
                    i2 = C4241b.m28597t(parcel, r);
                    break;
                case 3:
                    i3 = C4241b.m28597t(parcel, r);
                    break;
                case 4:
                    i4 = C4241b.m28597t(parcel, r);
                    break;
                case 5:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 6:
                    i5 = C4241b.m28597t(parcel, r);
                    break;
                case 7:
                    i6 = C4241b.m28597t(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new xu2(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new xu2[i];
    }
}
