package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7457o9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = "";
        String str2 = str;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 4:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 7:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 8:
                    str7 = C4241b.m28583f(parcel2, r);
                    break;
                case 9:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 10:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 11:
                    j6 = C4241b.m28598u(parcel2, r);
                    break;
                case 12:
                    str8 = C4241b.m28583f(parcel2, r);
                    break;
                case 13:
                    j3 = C4241b.m28598u(parcel2, r);
                    break;
                case 14:
                    j4 = C4241b.m28598u(parcel2, r);
                    break;
                case 15:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 16:
                    z3 = C4241b.m28590m(parcel2, r);
                    break;
                case 18:
                    z4 = C4241b.m28590m(parcel2, r);
                    break;
                case 19:
                    str9 = C4241b.m28583f(parcel2, r);
                    break;
                case 21:
                    bool = C4241b.m28591n(parcel2, r);
                    break;
                case 22:
                    j5 = C4241b.m28598u(parcel2, r);
                    break;
                case 23:
                    arrayList = C4241b.m28585h(parcel2, r);
                    break;
                case 24:
                    str10 = C4241b.m28583f(parcel2, r);
                    break;
                case 25:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 26:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 27:
                    str11 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C7446n9(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7446n9[i];
    }
}
