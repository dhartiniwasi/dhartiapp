package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ip */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3415ip implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        ArrayList<C3257e> arrayList = null;
        C7840p1 p1Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                arrayList = C4241b.m28587j(parcel, r, C3257e.CREATOR);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                p1Var = (C7840p1) C4241b.m28582e(parcel, r, C7840p1.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C3382hp(str, arrayList, p1Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3382hp[i];
    }
}
