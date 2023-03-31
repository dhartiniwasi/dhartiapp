package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: d5.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4099e extends C4240a {
    public static final Parcelable.Creator<C4099e> CREATOR = new C4126m1();

    /* renamed from: a */
    private final C4147t f23287a;

    /* renamed from: b */
    private final boolean f23288b;

    /* renamed from: c */
    private final boolean f23289c;

    /* renamed from: d */
    private final int[] f23290d;

    /* renamed from: e */
    private final int f23291e;

    /* renamed from: f */
    private final int[] f23292f;

    public C4099e(C4147t tVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f23287a = tVar;
        this.f23288b = z;
        this.f23289c = z2;
        this.f23290d = iArr;
        this.f23291e = i;
        this.f23292f = iArr2;
    }

    /* renamed from: I1 */
    public int mo17376I1() {
        return this.f23291e;
    }

    /* renamed from: J1 */
    public int[] mo17377J1() {
        return this.f23290d;
    }

    /* renamed from: K1 */
    public int[] mo17378K1() {
        return this.f23292f;
    }

    /* renamed from: L1 */
    public boolean mo17379L1() {
        return this.f23288b;
    }

    /* renamed from: M1 */
    public boolean mo17380M1() {
        return this.f23289c;
    }

    /* renamed from: N1 */
    public final C4147t mo17381N1() {
        return this.f23287a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f23287a, i, false);
        C4243c.m28606c(parcel, 2, mo17379L1());
        C4243c.m28606c(parcel, 3, mo17380M1());
        C4243c.m28615l(parcel, 4, mo17377J1(), false);
        C4243c.m28614k(parcel, 5, mo17376I1());
        C4243c.m28615l(parcel, 6, mo17378K1(), false);
        C4243c.m28605b(parcel, a);
    }
}
