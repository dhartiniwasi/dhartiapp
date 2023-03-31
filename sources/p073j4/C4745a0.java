package p073j4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.eu2;
import com.google.android.gms.internal.ads.r83;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4623z2;

/* renamed from: j4.a0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4745a0 extends C4240a {
    public static final Parcelable.Creator<C4745a0> CREATOR = new C4753c0();

    /* renamed from: a */
    public final String f25393a;

    /* renamed from: b */
    public final int f25394b;

    C4745a0(String str, int i) {
        this.f25393a = str == null ? "" : str;
        this.f25394b = i;
    }

    /* renamed from: I1 */
    public static C4745a0 m30571I1(Throwable th) {
        String str;
        C4623z2 a = eu2.m12268a(th);
        if (r83.m19615d(th.getMessage())) {
            str = a.f25063b;
        } else {
            str = th.getMessage();
        }
        return new C4745a0(str, a.f25062a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f25393a, false);
        C4243c.m28614k(parcel, 2, this.f25394b);
        C4243c.m28605b(parcel, a);
    }
}
