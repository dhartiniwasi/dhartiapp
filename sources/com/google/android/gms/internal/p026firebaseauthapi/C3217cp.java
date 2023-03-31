package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7866y0;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3217cp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C7866y0 y0Var = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                y0Var = (C7866y0) C4241b.m28582e(parcel, r, C7866y0.CREATOR);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                str = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3184bp(y0Var, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3184bp[i];
    }
}
