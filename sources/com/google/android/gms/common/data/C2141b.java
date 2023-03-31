package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.common.data.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2141b implements Parcelable.Creator<DataHolder> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                strArr = C4241b.m28584g(parcel, r);
            } else if (l == 2) {
                cursorWindowArr = (CursorWindow[]) C4241b.m28586i(parcel, r, CursorWindow.CREATOR);
            } else if (l == 3) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l == 4) {
                bundle = C4241b.m28578a(parcel, r);
            } else if (l != 1000) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo8129L1();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
