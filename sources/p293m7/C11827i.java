package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7848s0;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: m7.i */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11827i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ArrayList<C7848s0> arrayList = null;
        C11830j jVar = null;
        String str = null;
        C7840p1 p1Var = null;
        C11841m1 m1Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                arrayList = C4241b.m28587j(parcel, r, C7848s0.CREATOR);
            } else if (l == 2) {
                jVar = (C11830j) C4241b.m28582e(parcel, r, C11830j.CREATOR);
            } else if (l == 3) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 4) {
                p1Var = (C7840p1) C4241b.m28582e(parcel, r, C7840p1.CREATOR);
            } else if (l != 5) {
                C4241b.m28601x(parcel, r);
            } else {
                m1Var = (C11841m1) C4241b.m28582e(parcel, r, C11841m1.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C11824h(arrayList, jVar, str, p1Var, m1Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11824h[i];
    }
}
