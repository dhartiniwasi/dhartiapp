package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4142r0;
import p040e5.C4241b;

/* renamed from: c6.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6762k implements Parcelable.Creator<C6761j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        C4142r0 r0Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                r0Var = (C4142r0) C4241b.m28582e(parcel, r, C4142r0.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C6761j(i, r0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6761j[i];
    }
}
