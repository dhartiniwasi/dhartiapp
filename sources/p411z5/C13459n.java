package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z5.n */
public final class C13459n implements Parcelable.Creator<C13458m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                z = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C13458m(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C13458m[i];
    }
}
