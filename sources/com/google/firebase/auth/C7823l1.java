package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.l1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7823l1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l == 4) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                z2 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7866y0(str, str2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7866y0[i];
    }
}
