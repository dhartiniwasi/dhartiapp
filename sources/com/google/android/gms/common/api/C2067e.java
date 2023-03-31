package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C2067e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C6362b bVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) C4241b.m28582e(parcel, r, PendingIntent.CREATOR);
            } else if (l == 4) {
                bVar = (C6362b) C4241b.m28582e(parcel, r, C6362b.CREATOR);
            } else if (l != 1000) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new Status(i, i2, str, pendingIntent, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
