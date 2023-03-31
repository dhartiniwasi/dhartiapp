package p180z4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z4.h0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6375h0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                iBinder = C4241b.m28596s(parcel, r);
            } else if (l == 3) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                z2 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6373g0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6373g0[i];
    }
}
