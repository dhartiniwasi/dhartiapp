package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z5.g */
public final class C13452g implements Parcelable.Creator<C13451f> {
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
        return new C13451f(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C13451f[i];
    }
}
