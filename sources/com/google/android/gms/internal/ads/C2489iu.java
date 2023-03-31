package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.ads.iu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2489iu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 4:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 8:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 9:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 10:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 11:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C2451hu(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2451hu[i];
    }
}
