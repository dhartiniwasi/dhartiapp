package p033d5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p180z4.C6366d;

/* renamed from: d5.k1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4120k1 extends C4240a {
    public static final Parcelable.Creator<C4120k1> CREATOR = new C4123l1();

    /* renamed from: a */
    Bundle f23346a;

    /* renamed from: b */
    C6366d[] f23347b;

    /* renamed from: c */
    int f23348c;

    /* renamed from: d */
    C4099e f23349d;

    public C4120k1() {
    }

    C4120k1(Bundle bundle, C6366d[] dVarArr, int i, C4099e eVar) {
        this.f23346a = bundle;
        this.f23347b = dVarArr;
        this.f23348c = i;
        this.f23349d = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28608e(parcel, 1, this.f23346a, false);
        C4243c.m28623t(parcel, 2, this.f23347b, i, false);
        C4243c.m28614k(parcel, 3, this.f23348c);
        C4243c.m28619p(parcel, 4, this.f23349d, i, false);
        C4243c.m28605b(parcel, a);
    }
}
