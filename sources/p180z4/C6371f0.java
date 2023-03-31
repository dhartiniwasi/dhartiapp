package p180z4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z4.f0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6371f0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 2) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                i2 = C4241b.m28597t(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6369e0(z, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6369e0[i];
    }
}
