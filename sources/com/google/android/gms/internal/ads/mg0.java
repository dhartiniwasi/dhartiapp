package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mg0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                arrayList = C4241b.m28585h(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new lg0(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new lg0[i];
    }
}
