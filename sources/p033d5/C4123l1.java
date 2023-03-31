package p033d5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p180z4.C6366d;

/* renamed from: d5.l1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4123l1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        Bundle bundle = null;
        C6366d[] dVarArr = null;
        C4099e eVar = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                bundle = C4241b.m28578a(parcel, r);
            } else if (l == 2) {
                dVarArr = (C6366d[]) C4241b.m28586i(parcel, r, C6366d.CREATOR);
            } else if (l == 3) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                eVar = (C4099e) C4241b.m28582e(parcel, r, C4099e.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4120k1(bundle, dVarArr, i, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4120k1[i];
    }
}
