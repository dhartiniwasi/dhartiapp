package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7837p0;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.o1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7835o1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            C4241b.m28589l(r);
            C4241b.m28601x(parcel, r);
        }
        C4241b.m28588k(parcel, y);
        return new C7837p0.C7838a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7837p0.C7838a[i];
    }
}
