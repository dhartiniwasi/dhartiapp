package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7814j;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.no */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3579no implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C7814j jVar = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 1) {
                C4241b.m28601x(parcel, r);
            } else {
                jVar = (C7814j) C4241b.m28582e(parcel, r, C7814j.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3546mo(jVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3546mo[i];
    }
}
