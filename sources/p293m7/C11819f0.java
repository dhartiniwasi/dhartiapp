package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7848s0;
import java.util.ArrayList;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: m7.f0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11819f0 extends C4240a {
    public static final Parcelable.Creator<C11819f0> CREATOR = new C11822g0();

    /* renamed from: a */
    private final List f44495a;

    C11819f0(List list) {
        this.f44495a = list == null ? new ArrayList() : list;
    }

    /* renamed from: I1 */
    public final List mo36038I1() {
        ArrayList arrayList = new ArrayList();
        for (C7848s0 add : this.f44495a) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28624u(parcel, 1, this.f44495a, false);
        C4243c.m28605b(parcel, a);
    }
}
