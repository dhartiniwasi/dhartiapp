package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class wf0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                iBinder = C4241b.m28596s(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                iBinder2 = C4241b.m28596s(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new vf0(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new vf0[i];
    }
}
