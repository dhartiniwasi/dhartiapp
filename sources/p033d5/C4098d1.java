package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: d5.d1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4098d1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 3) {
                z2 = C4241b.m28590m(parcel, r);
            } else if (l == 4) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                i3 = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4147t(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4147t[i];
    }
}
