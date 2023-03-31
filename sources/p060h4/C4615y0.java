package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.y0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4615y0 extends C4240a {
    public static final Parcelable.Creator<C4615y0> CREATOR = new C4616y1();

    /* renamed from: a */
    public final String f25056a;

    /* renamed from: b */
    public final String f25057b;

    public C4615y0(String str, String str2) {
        this.f25056a = str;
        this.f25057b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f25056a, false);
        C4243c.m28620q(parcel, 2, this.f25057b, false);
        C4243c.m28605b(parcel, a);
    }
}
