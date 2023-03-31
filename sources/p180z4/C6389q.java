package p180z4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z4.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6389q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                j = C4241b.m28598u(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6366d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6366d[i];
    }
}
