package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3521m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C3257e eVar = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l == 4) {
                str3 = C4241b.m28583f(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                eVar = (C3257e) C4241b.m28582e(parcel, r, C3257e.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3488l(str, str2, str3, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3488l[i];
    }
}
