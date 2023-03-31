package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p040e5.C4241b;

/* renamed from: com.google.firebase.auth.q1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7843q1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C3126a0 a0Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 2:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 3:
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 4:
                    a0Var = (C3126a0) C4241b.m28582e(parcel, r, C3126a0.CREATOR);
                    break;
                case 5:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 6:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    str6 = C4241b.m28583f(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C7840p1(str, str2, str3, a0Var, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7840p1[i];
    }
}
