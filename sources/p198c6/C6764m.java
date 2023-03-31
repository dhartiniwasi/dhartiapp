package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4148t0;
import p040e5.C4241b;
import p180z4.C6362b;

/* renamed from: c6.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6764m implements Parcelable.Creator<C6763l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C6362b bVar = null;
        C4148t0 t0Var = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                bVar = (C6362b) C4241b.m28582e(parcel, r, C6362b.CREATOR);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                t0Var = (C4148t0) C4241b.m28582e(parcel, r, C4148t0.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6763l(i, bVar, t0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6763l[i];
    }
}
