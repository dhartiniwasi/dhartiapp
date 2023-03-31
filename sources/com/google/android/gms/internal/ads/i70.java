package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i70 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 4:
                    bArr = C4241b.m28579b(parcel2, r);
                    break;
                case 5:
                    strArr = C4241b.m28584g(parcel2, r);
                    break;
                case 6:
                    strArr2 = C4241b.m28584g(parcel2, r);
                    break;
                case 7:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 8:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new h70(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h70[i];
    }
}
