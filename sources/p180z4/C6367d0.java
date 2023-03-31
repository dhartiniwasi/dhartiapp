package p180z4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: z4.d0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6367d0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                z = C4241b.m28590m(parcel, r);
            } else if (l == 3) {
                z2 = C4241b.m28590m(parcel, r);
            } else if (l == 4) {
                iBinder = C4241b.m28596s(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                z3 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6365c0(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6365c0[i];
    }
}
