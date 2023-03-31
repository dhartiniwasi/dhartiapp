package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3946z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                arrayList = C4241b.m28585h(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3914y(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3914y[i];
    }
}
