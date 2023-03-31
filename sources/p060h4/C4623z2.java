package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p179z3.C6321a;
import p179z3.C6344n;
import p179z3.C6353v;

/* renamed from: h4.z2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4623z2 extends C4240a {
    public static final Parcelable.Creator<C4623z2> CREATOR = new C4624z3();

    /* renamed from: a */
    public final int f25062a;

    /* renamed from: b */
    public final String f25063b;

    /* renamed from: c */
    public final String f25064c;

    /* renamed from: d */
    public C4623z2 f25065d;

    /* renamed from: e */
    public IBinder f25066e;

    public C4623z2(int i, String str, String str2, C4623z2 z2Var, IBinder iBinder) {
        this.f25062a = i;
        this.f25063b = str;
        this.f25064c = str2;
        this.f25065d = z2Var;
        this.f25066e = iBinder;
    }

    /* renamed from: I1 */
    public final C6321a mo18186I1() {
        C4623z2 z2Var = this.f25065d;
        return new C6321a(this.f25062a, this.f25063b, this.f25064c, z2Var == null ? null : new C6321a(z2Var.f25062a, z2Var.f25063b, z2Var.f25064c));
    }

    /* renamed from: J1 */
    public final C6344n mo18187J1() {
        C6321a aVar;
        C4623z2 z2Var = this.f25065d;
        C4509g2 g2Var = null;
        if (z2Var == null) {
            aVar = null;
        } else {
            aVar = new C6321a(z2Var.f25062a, z2Var.f25063b, z2Var.f25064c);
        }
        int i = this.f25062a;
        String str = this.f25063b;
        String str2 = this.f25064c;
        IBinder iBinder = this.f25066e;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            g2Var = queryLocalInterface instanceof C4509g2 ? (C4509g2) queryLocalInterface : new C4497e2(iBinder);
        }
        return new C6344n(i, str, str2, aVar, C6353v.m37370f(g2Var));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f25062a);
        C4243c.m28620q(parcel, 2, this.f25063b, false);
        C4243c.m28620q(parcel, 3, this.f25064c, false);
        C4243c.m28619p(parcel, 4, this.f25065d, i, false);
        C4243c.m28613j(parcel, 5, this.f25066e, false);
        C4243c.m28605b(parcel, a);
    }
}
