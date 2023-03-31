package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z5.h */
public final class C13453h implements Parcelable.Creator<C13444a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                bArr = C4241b.m28579b(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                i = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C13444a(str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C13444a[i];
    }
}
