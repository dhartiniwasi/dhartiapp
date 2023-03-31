package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z5.f */
public final class C13451f extends C4240a {
    public static final Parcelable.Creator<C13451f> CREATOR = new C13452g();

    /* renamed from: a */
    private final String f47802a;

    public C13451f(String str) {
        this.f47802a = str;
    }

    /* renamed from: m1 */
    public final String mo38541m1() {
        return this.f47802a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f47802a, false);
        C4243c.m28605b(parcel, a);
    }
}
