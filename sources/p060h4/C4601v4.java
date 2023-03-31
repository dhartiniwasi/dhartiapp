package p060h4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.v4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4601v4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        C4623z2 z2Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    str = C4241b.m28583f(parcel, r);
                    break;
                case 2:
                    j = C4241b.m28598u(parcel, r);
                    break;
                case 3:
                    z2Var = (C4623z2) C4241b.m28582e(parcel, r, C4623z2.CREATOR);
                    break;
                case 4:
                    bundle = C4241b.m28578a(parcel, r);
                    break;
                case 5:
                    str2 = C4241b.m28583f(parcel, r);
                    break;
                case 6:
                    str3 = C4241b.m28583f(parcel, r);
                    break;
                case 7:
                    str4 = C4241b.m28583f(parcel, r);
                    break;
                case 8:
                    str5 = C4241b.m28583f(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4595u4(str, j, z2Var, bundle, str2, str3, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4595u4[i];
    }
}
