package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z5.m */
public final class C13458m extends C4240a {
    public static final Parcelable.Creator<C13458m> CREATOR = new C13459n();

    /* renamed from: a */
    private final int f47808a;

    /* renamed from: b */
    private final boolean f47809b;

    public C13458m(int i, boolean z) {
        this.f47808a = i;
        this.f47809b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 2, this.f47808a);
        C4243c.m28606c(parcel, 3, this.f47809b);
        C4243c.m28605b(parcel, a);
    }
}
