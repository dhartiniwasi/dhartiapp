package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import com.google.firebase.auth.C7840p1;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: m7.n1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11844n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        C3784tv tvVar = null;
        C11829i1 i1Var = null;
        String str = null;
        String str2 = null;
        ArrayList<C11829i1> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C11847o1 o1Var = null;
        C7840p1 p1Var = null;
        C11819f0 f0Var = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    tvVar = (C3784tv) C4241b.m28582e(parcel2, r, C3784tv.CREATOR);
                    break;
                case 2:
                    i1Var = (C11829i1) C4241b.m28582e(parcel2, r, C11829i1.CREATOR);
                    break;
                case 3:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 4:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    arrayList = C4241b.m28587j(parcel2, r, C11829i1.CREATOR);
                    break;
                case 6:
                    arrayList2 = C4241b.m28585h(parcel2, r);
                    break;
                case 7:
                    str3 = C4241b.m28583f(parcel2, r);
                    break;
                case 8:
                    bool = C4241b.m28591n(parcel2, r);
                    break;
                case 9:
                    o1Var = (C11847o1) C4241b.m28582e(parcel2, r, C11847o1.CREATOR);
                    break;
                case 10:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 11:
                    p1Var = (C7840p1) C4241b.m28582e(parcel2, r, C7840p1.CREATOR);
                    break;
                case 12:
                    f0Var = (C11819f0) C4241b.m28582e(parcel2, r, C11819f0.CREATOR);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C11841m1(tvVar, i1Var, str, str2, arrayList, arrayList2, str3, bool, o1Var, z, p1Var, f0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11841m1[i];
    }
}
