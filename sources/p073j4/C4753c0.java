package p073j4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: j4.c0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4753c0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4745a0(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4745a0[i];
    }
}
