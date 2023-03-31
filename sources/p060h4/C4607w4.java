package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.w4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4607w4 extends C4240a {
    public static final Parcelable.Creator<C4607w4> CREATOR = new C4613x4();

    /* renamed from: a */
    public final int f25053a;

    public C4607w4(int i) {
        this.f25053a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 2, this.f25053a);
        C4243c.m28605b(parcel, a);
    }
}
