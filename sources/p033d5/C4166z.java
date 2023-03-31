package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: d5.z */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4166z implements Parcelable.Creator<C4153v> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        int i = 0;
        ArrayList<C4130o> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l != 2) {
                C4241b.m28601x(parcel, r);
            } else {
                arrayList = C4241b.m28587j(parcel, r, C4130o.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4153v(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4153v[i];
    }
}
