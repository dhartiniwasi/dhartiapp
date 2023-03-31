package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: d5.m1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4126m1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C4147t tVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    tVar = (C4147t) C4241b.m28582e(parcel, r, C4147t.CREATOR);
                    break;
                case 2:
                    z = C4241b.m28590m(parcel, r);
                    break;
                case 3:
                    z2 = C4241b.m28590m(parcel, r);
                    break;
                case 4:
                    iArr = C4241b.m28580c(parcel, r);
                    break;
                case 5:
                    i = C4241b.m28597t(parcel, r);
                    break;
                case 6:
                    iArr2 = C4241b.m28580c(parcel, r);
                    break;
                default:
                    C4241b.m28601x(parcel, r);
                    break;
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4099e(tVar, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4099e[i];
    }
}
