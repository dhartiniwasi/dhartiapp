package p180z4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z4.e0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6369e0 extends C4240a {
    public static final Parcelable.Creator<C6369e0> CREATOR = new C6371f0();

    /* renamed from: a */
    private final boolean f30604a;

    /* renamed from: b */
    private final String f30605b;

    /* renamed from: c */
    private final int f30606c;

    /* renamed from: d */
    private final int f30607d;

    C6369e0(boolean z, String str, int i, int i2) {
        this.f30604a = z;
        this.f30605b = str;
        this.f30606c = C6385m0.m37482a(i) - 1;
        this.f30607d = C6390r.m37483a(i2) - 1;
    }

    /* renamed from: I1 */
    public final boolean mo21790I1() {
        return this.f30604a;
    }

    /* renamed from: J1 */
    public final int mo21791J1() {
        return C6390r.m37483a(this.f30607d);
    }

    /* renamed from: K1 */
    public final int mo21792K1() {
        return C6385m0.m37482a(this.f30606c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 1, this.f30604a);
        C4243c.m28620q(parcel, 2, this.f30605b, false);
        C4243c.m28614k(parcel, 3, this.f30606c);
        C4243c.m28614k(parcel, 4, this.f30607d);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f30605b;
    }
}
