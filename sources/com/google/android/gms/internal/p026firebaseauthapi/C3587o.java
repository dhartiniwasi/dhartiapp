package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3587o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 2:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 3:
                    z = C4241b.m28590m(parcel2, r);
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
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 8:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C3554n(str, j, z, str2, str3, str4, z2, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3554n[i];
    }
}
