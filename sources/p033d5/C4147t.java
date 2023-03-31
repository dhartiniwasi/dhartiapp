package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: d5.t */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4147t extends C4240a {
    public static final Parcelable.Creator<C4147t> CREATOR = new C4098d1();

    /* renamed from: a */
    private final int f23400a;

    /* renamed from: b */
    private final boolean f23401b;

    /* renamed from: c */
    private final boolean f23402c;

    /* renamed from: d */
    private final int f23403d;

    /* renamed from: e */
    private final int f23404e;

    public C4147t(int i, boolean z, boolean z2, int i2, int i3) {
        this.f23400a = i;
        this.f23401b = z;
        this.f23402c = z2;
        this.f23403d = i2;
        this.f23404e = i3;
    }

    /* renamed from: I1 */
    public int mo17463I1() {
        return this.f23403d;
    }

    /* renamed from: J1 */
    public int mo17464J1() {
        return this.f23404e;
    }

    /* renamed from: K1 */
    public boolean mo17465K1() {
        return this.f23401b;
    }

    /* renamed from: L1 */
    public boolean mo17466L1() {
        return this.f23402c;
    }

    /* renamed from: M1 */
    public int mo17467M1() {
        return this.f23400a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, mo17467M1());
        C4243c.m28606c(parcel, 2, mo17465K1());
        C4243c.m28606c(parcel, 3, mo17466L1());
        C4243c.m28614k(parcel, 4, mo17463I1());
        C4243c.m28614k(parcel, 5, mo17464J1());
        C4243c.m28605b(parcel, a);
    }
}
