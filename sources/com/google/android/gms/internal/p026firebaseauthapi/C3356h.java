package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3356h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 5:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 6:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    str6 = C4241b.m28583f(parcel, r);
                    break;
                case 8:
                    str7 = C4241b.m28583f(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3323g(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3323g[i];
    }
}
