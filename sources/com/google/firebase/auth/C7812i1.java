package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.i1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7812i1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                j = C4241b.m28598u(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                str3 = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7848s0(str, str2, j, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7848s0[i];
    }
}