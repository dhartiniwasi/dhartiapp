package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.b4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4481b4 extends C4240a {
    public static final Parcelable.Creator<C4481b4> CREATOR = new C4487c4();

    /* renamed from: a */
    public final String f24821a;

    C4481b4(String str) {
        this.f24821a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 15, this.f24821a, false);
        C4243c.m28605b(parcel, a);
    }
}
