package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7513u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                bundle = C4241b.m28578a(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7502t(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7502t[i];
    }
}
