package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.measurement.internal.e */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7337e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C7336d9 d9Var = null;
        String str3 = null;
        C7524v vVar = null;
        C7524v vVar2 = null;
        C7524v vVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 4:
                    d9Var = (C7336d9) C4241b.m28582e(parcel2, r, C7336d9.CREATOR);
                    break;
                case 5:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 6:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 7:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    vVar = (C7524v) C4241b.m28582e(parcel2, r, C7524v.CREATOR);
                    break;
                case 9:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 10:
                    vVar2 = (C7524v) C4241b.m28582e(parcel2, r, C7524v.CREATOR);
                    break;
                case 11:
                    j3 = C4241b.m28598u(parcel2, r);
                    break;
                case 12:
                    vVar3 = (C7524v) C4241b.m28582e(parcel2, r, C7524v.CREATOR);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C7326d(str, str2, d9Var, j, z, str3, vVar, j2, vVar2, j3, vVar3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7326d[i];
    }
}
