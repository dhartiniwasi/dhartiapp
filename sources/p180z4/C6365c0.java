package p180z4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: z4.c0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6365c0 extends C4240a {
    public static final Parcelable.Creator<C6365c0> CREATOR = new C6367d0();

    /* renamed from: a */
    private final String f30592a;

    /* renamed from: b */
    private final boolean f30593b;

    /* renamed from: c */
    private final boolean f30594c;

    /* renamed from: d */
    private final Context f30595d;

    /* renamed from: e */
    private final boolean f30596e;

    C6365c0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f30592a = str;
        this.f30593b = z;
        this.f30594c = z2;
        this.f30595d = (Context) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder));
        this.f30596e = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [l5.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f30592a, false);
        C4243c.m28606c(parcel, 2, this.f30593b);
        C4243c.m28606c(parcel, 3, this.f30594c);
        C4243c.m28613j(parcel, 4, C4956b.m31385o3(this.f30595d), false);
        C4243c.m28606c(parcel, 5, this.f30596e);
        C4243c.m28605b(parcel, a);
    }
}
