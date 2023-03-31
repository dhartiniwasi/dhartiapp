package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.common.api.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C2066d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                str = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
