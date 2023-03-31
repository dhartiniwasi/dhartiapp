package p023c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.g40;
import com.google.android.gms.internal.ads.h40;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4603w0;
import p060h4.C4609x0;

@Deprecated
/* renamed from: c4.g */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C1868g extends C4240a {
    public static final Parcelable.Creator<C1868g> CREATOR = new C1875m();

    /* renamed from: a */
    private final boolean f5496a;

    /* renamed from: b */
    private final C4609x0 f5497b;

    /* renamed from: c */
    private final IBinder f5498c;

    C1868g(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f5496a = z;
        this.f5497b = iBinder != null ? C4603w0.m30112I6(iBinder) : null;
        this.f5498c = iBinder2;
    }

    /* renamed from: I1 */
    public final C4609x0 mo7108I1() {
        return this.f5497b;
    }

    /* renamed from: J1 */
    public final h40 mo7109J1() {
        IBinder iBinder = this.f5498c;
        if (iBinder == null) {
            return null;
        }
        return g40.m13032I6(iBinder);
    }

    /* renamed from: e */
    public final boolean mo7110e() {
        return this.f5496a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 1, this.f5496a);
        C4609x0 x0Var = this.f5497b;
        if (x0Var == null) {
            iBinder = null;
        } else {
            iBinder = x0Var.asBinder();
        }
        C4243c.m28613j(parcel, 2, iBinder, false);
        C4243c.m28613j(parcel, 3, this.f5498c, false);
        C4243c.m28605b(parcel, a);
    }
}
