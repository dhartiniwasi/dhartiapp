package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;

/* renamed from: h4.r4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4577r4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        String str = null;
        C4571q4[] q4VarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 2:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 3:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 4:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 5:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 6:
                    i3 = C4241b.m28597t(parcel2, r);
                    break;
                case 7:
                    i4 = C4241b.m28597t(parcel2, r);
                    break;
                case 8:
                    q4VarArr = (C4571q4[]) C4241b.m28586i(parcel2, r, C4571q4.CREATOR);
                    break;
                case 9:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 10:
                    z3 = C4241b.m28590m(parcel2, r);
                    break;
                case 11:
                    z4 = C4241b.m28590m(parcel2, r);
                    break;
                case 12:
                    z5 = C4241b.m28590m(parcel2, r);
                    break;
                case 13:
                    z6 = C4241b.m28590m(parcel2, r);
                    break;
                case 14:
                    z7 = C4241b.m28590m(parcel2, r);
                    break;
                case 15:
                    z8 = C4241b.m28590m(parcel2, r);
                    break;
                case 16:
                    z9 = C4241b.m28590m(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C4571q4(str, i, i2, z, i3, i4, q4VarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4571q4[i];
    }
}
