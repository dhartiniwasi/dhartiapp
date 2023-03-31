package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4142r0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: c6.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6761j extends C4240a {
    public static final Parcelable.Creator<C6761j> CREATOR = new C6762k();

    /* renamed from: a */
    final int f31273a;

    /* renamed from: b */
    final C4142r0 f31274b;

    C6761j(int i, C4142r0 r0Var) {
        this.f31273a = i;
        this.f31274b = r0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f31273a);
        C4243c.m28619p(parcel, 2, this.f31274b, i, false);
        C4243c.m28605b(parcel, a);
    }
}
