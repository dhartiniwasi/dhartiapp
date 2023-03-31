package p023c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.g40;
import com.google.android.gms.internal.ads.h40;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: c4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C1859a extends C4240a {
    public static final Parcelable.Creator<C1859a> CREATOR = new C1872j();

    /* renamed from: a */
    private final boolean f5478a;

    /* renamed from: b */
    private final IBinder f5479b;

    C1859a(boolean z, IBinder iBinder) {
        this.f5478a = z;
        this.f5479b = iBinder;
    }

    /* renamed from: I1 */
    public boolean mo7080I1() {
        return this.f5478a;
    }

    /* renamed from: J1 */
    public final h40 mo7081J1() {
        IBinder iBinder = this.f5479b;
        if (iBinder == null) {
            return null;
        }
        return g40.m13032I6(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 1, mo7080I1());
        C4243c.m28613j(parcel, 2, this.f5479b, false);
        C4243c.m28605b(parcel, a);
    }
}
