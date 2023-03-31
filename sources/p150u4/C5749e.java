package p150u4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: u4.e */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5749e implements Parcelable.Creator<C5748d> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                str2 = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C5748d(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C5748d[i];
    }
}
