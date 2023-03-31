package p060h4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: h4.n4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4553n4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        C4481b4 b4Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        C4615y0 y0Var = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 3:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 4:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 5:
                    arrayList = C4241b.m28585h(parcel2, r);
                    break;
                case 6:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 7:
                    i3 = C4241b.m28597t(parcel2, r);
                    break;
                case 8:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 9:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 10:
                    b4Var = (C4481b4) C4241b.m28582e(parcel2, r, C4481b4.CREATOR);
                    break;
                case 11:
                    location = (Location) C4241b.m28582e(parcel2, r, Location.CREATOR);
                    break;
                case 12:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 13:
                    bundle2 = C4241b.m28578a(parcel2, r);
                    break;
                case 14:
                    bundle3 = C4241b.m28578a(parcel2, r);
                    break;
                case 15:
                    arrayList2 = C4241b.m28585h(parcel2, r);
                    break;
                case 16:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 17:
                    str4 = C4241b.m28583f(parcel2, r);
                    break;
                case 18:
                    z3 = C4241b.m28590m(parcel2, r);
                    break;
                case 19:
                    y0Var = (C4615y0) C4241b.m28582e(parcel2, r, C4615y0.CREATOR);
                    break;
                case 20:
                    i4 = C4241b.m28597t(parcel2, r);
                    break;
                case 21:
                    str5 = C4241b.m28583f(parcel2, r);
                    break;
                case 22:
                    arrayList3 = C4241b.m28585h(parcel2, r);
                    break;
                case 23:
                    i5 = C4241b.m28597t(parcel2, r);
                    break;
                case 24:
                    str6 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C4541l4(i, j, bundle, i2, arrayList, z, i3, z2, str, b4Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, y0Var, i4, str5, arrayList3, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4541l4[i];
    }
}
