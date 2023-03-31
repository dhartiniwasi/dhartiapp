package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import p040e5.C4241b;

/* renamed from: m7.h1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11826h1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C11841m1 m1Var = null;
        C11817e1 e1Var = null;
        C7840p1 p1Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                m1Var = (C11841m1) C4241b.m28582e(parcel, r, C11841m1.CREATOR);
            } else if (l == 2) {
                e1Var = (C11817e1) C4241b.m28582e(parcel, r, C11817e1.CREATOR);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                p1Var = (C7840p1) C4241b.m28582e(parcel, r, C7840p1.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C11823g1(m1Var, e1Var, p1Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11823g1[i];
    }
}
