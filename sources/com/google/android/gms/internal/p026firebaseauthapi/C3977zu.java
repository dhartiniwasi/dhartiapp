package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3977zu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        C3914y yVar = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 3:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 4:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 5:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 6:
                    yVar = (C3914y) C4241b.m28582e(parcel, r, C3914y.CREATOR);
                    break;
                case 7:
                    arrayList = C4241b.m28585h(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3945yu(str, z, str2, z2, yVar, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3945yu[i];
    }
}
