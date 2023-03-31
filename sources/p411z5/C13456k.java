package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z5.k */
public final class C13456k extends C4240a {
    public static final Parcelable.Creator<C13456k> CREATOR = new C13457l();

    /* renamed from: a */
    private final String f47807a;

    public C13456k(String str) {
        this.f47807a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f47807a, false);
        C4243c.m28605b(parcel, a);
    }
}
