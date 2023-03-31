package p150u4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: u4.d */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5748d extends C4240a {
    public static final Parcelable.Creator<C5748d> CREATOR = new C5749e();

    /* renamed from: a */
    private final String f28717a;

    /* renamed from: b */
    private final String f28718b;

    public C5748d(String str, String str2) {
        this.f28717a = str;
        this.f28718b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f28717a, false);
        C4243c.m28620q(parcel, 2, this.f28718b, false);
        C4243c.m28605b(parcel, a);
    }
}
