package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p179z3.C6357y;

/* renamed from: h4.e4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4499e4 extends C4240a {
    public static final Parcelable.Creator<C4499e4> CREATOR = new C4505f4();

    /* renamed from: a */
    public final boolean f24837a;

    /* renamed from: b */
    public final boolean f24838b;

    /* renamed from: c */
    public final boolean f24839c;

    public C4499e4(C6357y yVar) {
        this(yVar.mo21742c(), yVar.mo21741b(), yVar.mo21740a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 2, this.f24837a);
        C4243c.m28606c(parcel, 3, this.f24838b);
        C4243c.m28606c(parcel, 4, this.f24839c);
        C4243c.m28605b(parcel, a);
    }

    public C4499e4(boolean z, boolean z2, boolean z3) {
        this.f24837a = z;
        this.f24838b = z2;
        this.f24839c = z3;
    }
}
