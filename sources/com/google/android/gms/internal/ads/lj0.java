package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lj0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 3:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 4:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 5:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 6:
                    arrayList = C4241b.m28585h(parcel, r);
                    break;
                case 7:
                    z3 = C4241b.m28590m(parcel, r);
                    break;
                case 8:
                    z4 = C4241b.m28590m(parcel, r);
                    break;
                case 9:
                    arrayList2 = C4241b.m28585h(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new kj0(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new kj0[i];
    }
}
