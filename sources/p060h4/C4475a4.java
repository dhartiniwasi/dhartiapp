package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.a4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4475a4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                i2 = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4618y3(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4618y3[i];
    }
}
