package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xg0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C4241b.m28582e(parcel, r, ParcelFileDescriptor.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new wg0(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new wg0[i];
    }
}
