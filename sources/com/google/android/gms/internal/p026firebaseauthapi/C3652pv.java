package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3652pv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ArrayList<C3553mv> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                arrayList = C4241b.m28587j(parcel, r, C3553mv.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3619ov(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3619ov[i];
    }
}
