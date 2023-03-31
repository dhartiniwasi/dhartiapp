package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.n1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7831n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
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
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 4:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 5:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 6:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 8:
                    str6 = C4241b.m28583f(parcel, r);
                    break;
                case 9:
                    i = C4241b.m28597t(parcel, r);
                    break;
                case 10:
                    str7 = C4241b.m28583f(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7793e(str, str2, str3, str4, z, str5, z2, str6, i, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7793e[i];
    }
}
