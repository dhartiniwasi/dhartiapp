package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p179z3.C6351u;

/* renamed from: h4.y3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4618y3 extends C4240a {
    public static final Parcelable.Creator<C4618y3> CREATOR = new C4475a4();

    /* renamed from: a */
    public final int f25058a;

    /* renamed from: b */
    public final int f25059b;

    public C4618y3(int i, int i2) {
        this.f25058a = i;
        this.f25059b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f25058a);
        C4243c.m28614k(parcel, 2, this.f25059b);
        C4243c.m28605b(parcel, a);
    }

    public C4618y3(C6351u uVar) {
        this.f25058a = uVar.mo21717b();
        this.f25059b = uVar.mo21718c();
    }
}
