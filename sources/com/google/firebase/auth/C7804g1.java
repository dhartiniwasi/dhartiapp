package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.g1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7804g1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 2:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 3:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 4:
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 5:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 6:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7830n0(str, str2, z, str3, z2, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7830n0[i];
    }
}
