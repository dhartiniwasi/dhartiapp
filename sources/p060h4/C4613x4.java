package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.x4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4613x4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4607w4(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4607w4[i];
    }
}
