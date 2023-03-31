package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7099o1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 2:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 3:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 4:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 8:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C7083n1(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7083n1[i];
    }
}
