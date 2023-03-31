package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3586nv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C3389i iVar = null;
        String str5 = null;
        String str6 = null;
        C7840p1 p1Var = null;
        ArrayList<C3257e> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 4:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 5:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    iVar = (C3389i) C4241b.m28582e(parcel2, r, C3389i.CREATOR);
                    break;
                case 8:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 9:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 11:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 12:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 13:
                    p1Var = (C7840p1) C4241b.m28582e(parcel2, r, C7840p1.CREATOR);
                    break;
                case 14:
                    arrayList = C4241b.m28587j(parcel2, r, C3257e.CREATOR);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C3553mv(str, str2, z, str3, str4, iVar, str5, str6, j, j2, z2, p1Var, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3553mv[i];
    }
}
