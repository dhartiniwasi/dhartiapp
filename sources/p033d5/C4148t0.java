package p033d5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4114j;
import p040e5.C4240a;
import p040e5.C4243c;
import p180z4.C6362b;

/* renamed from: d5.t0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4148t0 extends C4240a {
    public static final Parcelable.Creator<C4148t0> CREATOR = new C4151u0();

    /* renamed from: a */
    final int f23405a;

    /* renamed from: b */
    final IBinder f23406b;

    /* renamed from: c */
    private final C6362b f23407c;

    /* renamed from: d */
    private final boolean f23408d;

    /* renamed from: e */
    private final boolean f23409e;

    C4148t0(int i, IBinder iBinder, C6362b bVar, boolean z, boolean z2) {
        this.f23405a = i;
        this.f23406b = iBinder;
        this.f23407c = bVar;
        this.f23408d = z;
        this.f23409e = z2;
    }

    /* renamed from: I1 */
    public final C6362b mo17469I1() {
        return this.f23407c;
    }

    /* renamed from: J1 */
    public final C4114j mo17470J1() {
        IBinder iBinder = this.f23406b;
        if (iBinder == null) {
            return null;
        }
        return C4114j.C4115a.m28166B0(iBinder);
    }

    /* renamed from: K1 */
    public final boolean mo17471K1() {
        return this.f23408d;
    }

    /* renamed from: L1 */
    public final boolean mo17472L1() {
        return this.f23409e;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4148t0)) {
            return false;
        }
        C4148t0 t0Var = (C4148t0) obj;
        return this.f23407c.equals(t0Var.f23407c) && C4133p.m28193a(mo17470J1(), t0Var.mo17470J1());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f23405a);
        C4243c.m28613j(parcel, 2, this.f23406b, false);
        C4243c.m28619p(parcel, 3, this.f23407c, i, false);
        C4243c.m28606c(parcel, 4, this.f23408d);
        C4243c.m28606c(parcel, 5, this.f23409e);
        C4243c.m28605b(parcel, a);
    }
}
