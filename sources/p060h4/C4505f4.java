package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.f4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4505f4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 3) {
                z2 = C4241b.m28590m(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                z3 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4499e4(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4499e4[i];
    }
}
