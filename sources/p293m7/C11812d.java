package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: m7.d */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11812d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                j = C4241b.m28598u(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                j2 = C4241b.m28598u(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C11847o1(j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11847o1[i];
    }
}
