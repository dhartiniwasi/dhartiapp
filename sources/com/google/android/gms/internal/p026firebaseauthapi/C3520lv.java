package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3520lv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C3619ov ovVar = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                ovVar = (C3619ov) C4241b.m28582e(parcel, r, C3619ov.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3487kv(ovVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3487kv[i];
    }
}
