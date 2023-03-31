package p150u4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: u4.f */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5750f extends C4240a {
    public static final Parcelable.Creator<C5750f> CREATOR = new C5751g();

    /* renamed from: a */
    private final String f28719a;

    /* renamed from: b */
    private final int f28720b;

    public C5750f(String str, int i) {
        this.f28719a = str;
        this.f28720b = i;
    }

    /* renamed from: I1 */
    public final int mo20235I1() {
        return this.f28720b;
    }

    /* renamed from: J1 */
    public final String mo20236J1() {
        return this.f28719a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f28719a, false);
        C4243c.m28614k(parcel, 2, this.f28720b);
        C4243c.m28605b(parcel, a);
    }
}
