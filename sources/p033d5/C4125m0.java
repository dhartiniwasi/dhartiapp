package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: d5.m0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4125m0 implements Parcelable.Creator<C4130o> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 3:
                    i3 = C4241b.m28597t(parcel2, r);
                    break;
                case 4:
                    j = C4241b.m28598u(parcel2, r);
                    break;
                case 5:
                    j2 = C4241b.m28598u(parcel2, r);
                    break;
                case 6:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 7:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    i4 = C4241b.m28597t(parcel2, r);
                    break;
                case 9:
                    i5 = C4241b.m28597t(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C4130o(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4130o[i];
    }
}
