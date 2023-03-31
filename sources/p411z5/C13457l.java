package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z5.l */
public final class C13457l implements Parcelable.Creator<C13456k> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                str = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C13456k(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C13456k[i];
    }
}
