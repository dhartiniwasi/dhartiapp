package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.ads.eu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2339eu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C4241b.m28582e(parcel, r, ParcelFileDescriptor.CREATOR);
            } else if (l == 3) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 4) {
                z2 = C4241b.m28590m(parcel, r);
            } else if (l == 5) {
                j = C4241b.m28598u(parcel, r);
            } else if (l != 6) {
                C4241b.m28601x(parcel, r);
            } else {
                z3 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C2302du(parcelFileDescriptor, z, z2, j, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2302du[i];
    }
}
