package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7848s0;
import java.util.ArrayList;
import p040e5.C4241b;

/* renamed from: m7.g0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11822g0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        ArrayList<C7848s0> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            if (C4241b.m28589l(r) != 1) {
                C4241b.m28601x(parcel, r);
            } else {
                arrayList = C4241b.m28587j(parcel, r, C7848s0.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C11819f0(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11819f0[i];
    }
}
