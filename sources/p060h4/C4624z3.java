package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.z3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4624z3 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        C4623z2 z2Var = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l == 4) {
                z2Var = (C4623z2) C4241b.m28582e(parcel, r, C4623z2.CREATOR);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                iBinder = C4241b.m28596s(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4623z2(i, str, str2, z2Var, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4623z2[i];
    }
}
