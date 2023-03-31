package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2047a implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 4:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 6:
                    uri = (Uri) C4241b.m28582e(parcel2, r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 9:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    arrayList = C4241b.m28587j(parcel2, r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C4241b.m28583f(parcel2, r);
                    break;
                case 12:
                    str8 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
