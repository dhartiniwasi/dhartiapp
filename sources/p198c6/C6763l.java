package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4148t0;
import p040e5.C4240a;
import p040e5.C4243c;
import p180z4.C6362b;

/* renamed from: c6.l */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6763l extends C4240a {
    public static final Parcelable.Creator<C6763l> CREATOR = new C6764m();

    /* renamed from: a */
    final int f31275a;

    /* renamed from: b */
    private final C6362b f31276b;

    /* renamed from: c */
    private final C4148t0 f31277c;

    C6763l(int i, C6362b bVar, C4148t0 t0Var) {
        this.f31275a = i;
        this.f31276b = bVar;
        this.f31277c = t0Var;
    }

    /* renamed from: I1 */
    public final C6362b mo22682I1() {
        return this.f31276b;
    }

    /* renamed from: J1 */
    public final C4148t0 mo22683J1() {
        return this.f31277c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f31275a);
        C4243c.m28619p(parcel, 2, this.f31276b, i, false);
        C4243c.m28619p(parcel, 3, this.f31277c, i, false);
        C4243c.m28605b(parcel, a);
    }
}
