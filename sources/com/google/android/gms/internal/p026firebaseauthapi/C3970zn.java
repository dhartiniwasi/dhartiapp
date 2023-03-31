package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7793e;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3970zn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        C7793e eVar = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                eVar = (C7793e) C4241b.m28582e(parcel, r, C7793e.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3938yn(str, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3938yn[i];
    }
}
