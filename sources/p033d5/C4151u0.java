package p033d5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p180z4.C6362b;

/* renamed from: d5.u0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4151u0 implements Parcelable.Creator<C4148t0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        IBinder iBinder = null;
        C6362b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                iBinder = C4241b.m28596s(parcel, r);
            } else if (l == 3) {
                bVar = (C6362b) C4241b.m28582e(parcel, r, C6362b.CREATOR);
            } else if (l == 4) {
                z = C4241b.m28590m(parcel, r);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                z2 = C4241b.m28590m(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4148t0(i, iBinder, bVar, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4148t0[i];
    }
}
