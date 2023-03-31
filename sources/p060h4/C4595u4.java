package p060h4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.u4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4595u4 extends C4240a {
    public static final Parcelable.Creator<C4595u4> CREATOR = new C4601v4();

    /* renamed from: a */
    public final String f25033a;

    /* renamed from: b */
    public long f25034b;

    /* renamed from: c */
    public C4623z2 f25035c;

    /* renamed from: d */
    public final Bundle f25036d;

    /* renamed from: e */
    public final String f25037e;

    /* renamed from: f */
    public final String f25038f;

    /* renamed from: g */
    public final String f25039g;

    /* renamed from: h */
    public final String f25040h;

    public C4595u4(String str, long j, C4623z2 z2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f25033a = str;
        this.f25034b = j;
        this.f25035c = z2Var;
        this.f25036d = bundle;
        this.f25037e = str2;
        this.f25038f = str3;
        this.f25039g = str4;
        this.f25040h = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f25033a, false);
        C4243c.m28617n(parcel, 2, this.f25034b);
        C4243c.m28619p(parcel, 3, this.f25035c, i, false);
        C4243c.m28608e(parcel, 4, this.f25036d, false);
        C4243c.m28620q(parcel, 5, this.f25037e, false);
        C4243c.m28620q(parcel, 6, this.f25038f, false);
        C4243c.m28620q(parcel, 7, this.f25039g, false);
        C4243c.m28620q(parcel, 8, this.f25040h, false);
        C4243c.m28605b(parcel, a);
    }
}
