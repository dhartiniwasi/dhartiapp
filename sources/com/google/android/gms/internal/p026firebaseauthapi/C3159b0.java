package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3159b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    str7 = C4241b.m28583f(parcel2, r);
                    break;
                case 9:
                    str8 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 11:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 12:
                    str9 = C4241b.m28583f(parcel2, r);
                    break;
                case 13:
                    str10 = C4241b.m28583f(parcel2, r);
                    break;
                case 14:
                    str11 = C4241b.m28583f(parcel2, r);
                    break;
                case 15:
                    str12 = C4241b.m28583f(parcel2, r);
                    break;
                case 16:
                    z3 = C4241b.m28590m(parcel2, r);
                    break;
                case 17:
                    str13 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C3126a0(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3126a0[i];
    }
}
