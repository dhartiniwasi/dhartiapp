package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7830n0;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.un */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3809un implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        C7830n0 n0Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                n0Var = (C7830n0) C4241b.m28582e(parcel, r, C7830n0.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3776tn(str, n0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3776tn[i];
    }
}
