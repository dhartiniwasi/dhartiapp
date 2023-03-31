package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3817uv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l3 = C4241b.m28589l(r);
            if (l3 == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l3 == 3) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l3 == 4) {
                l = C4241b.m28599v(parcel, r);
            } else if (l3 == 5) {
                str3 = C4241b.m28583f(parcel, r);
            } else if (l3 != 6) {
                C4241b.m28601x(parcel, r);
            } else {
                l2 = C4241b.m28599v(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3784tv(str, str2, l, str3, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3784tv[i];
    }
}
