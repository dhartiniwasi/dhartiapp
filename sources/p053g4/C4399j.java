package p053g4;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: g4.j */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4399j extends C4240a {
    public static final Parcelable.Creator<C4399j> CREATOR = new C4400k();

    /* renamed from: a */
    public final boolean f24517a;

    /* renamed from: b */
    public final boolean f24518b;

    /* renamed from: c */
    public final String f24519c;

    /* renamed from: d */
    public final boolean f24520d;

    /* renamed from: e */
    public final float f24521e;

    /* renamed from: f */
    public final int f24522f;

    /* renamed from: g */
    public final boolean f24523g;

    /* renamed from: h */
    public final boolean f24524h;

    /* renamed from: i */
    public final boolean f24525i;

    C4399j(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f24517a = z;
        this.f24518b = z2;
        this.f24519c = str;
        this.f24520d = z3;
        this.f24521e = f;
        this.f24522f = i;
        this.f24523g = z4;
        this.f24524h = z5;
        this.f24525i = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 2, this.f24517a);
        C4243c.m28606c(parcel, 3, this.f24518b);
        C4243c.m28620q(parcel, 4, this.f24519c, false);
        C4243c.m28606c(parcel, 5, this.f24520d);
        C4243c.m28611h(parcel, 6, this.f24521e);
        C4243c.m28614k(parcel, 7, this.f24522f);
        C4243c.m28606c(parcel, 8, this.f24523g);
        C4243c.m28606c(parcel, 9, this.f24524h);
        C4243c.m28606c(parcel, 10, this.f24525i);
        C4243c.m28605b(parcel, a);
    }

    public C4399j(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, -1, z4, z5, z6);
    }
}
