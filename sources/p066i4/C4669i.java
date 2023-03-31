package p066i4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: i4.i */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4669i extends C4240a {
    public static final Parcelable.Creator<C4669i> CREATOR = new C4668h();

    /* renamed from: a */
    public final String f25199a;

    /* renamed from: b */
    public final String f25200b;

    /* renamed from: c */
    public final String f25201c;

    /* renamed from: d */
    public final String f25202d;

    /* renamed from: e */
    public final String f25203e;

    /* renamed from: f */
    public final String f25204f;

    /* renamed from: g */
    public final String f25205g;

    /* renamed from: h */
    public final Intent f25206h;

    /* renamed from: i */
    public final C4661c0 f25207i;

    /* renamed from: r */
    public final boolean f25208r;

    public C4669i(Intent intent, C4661c0 c0Var) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, C4956b.m31385o3(c0Var).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f25199a, false);
        C4243c.m28620q(parcel, 3, this.f25200b, false);
        C4243c.m28620q(parcel, 4, this.f25201c, false);
        C4243c.m28620q(parcel, 5, this.f25202d, false);
        C4243c.m28620q(parcel, 6, this.f25203e, false);
        C4243c.m28620q(parcel, 7, this.f25204f, false);
        C4243c.m28620q(parcel, 8, this.f25205g, false);
        C4243c.m28619p(parcel, 9, this.f25206h, i, false);
        C4243c.m28613j(parcel, 10, C4956b.m31385o3(this.f25207i).asBinder(), false);
        C4243c.m28606c(parcel, 11, this.f25208r);
        C4243c.m28605b(parcel, a);
    }

    public C4669i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.f25199a = str;
        this.f25200b = str2;
        this.f25201c = str3;
        this.f25202d = str4;
        this.f25203e = str5;
        this.f25204f = str6;
        this.f25205g = str7;
        this.f25206h = intent;
        this.f25207i = (C4661c0) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder));
        this.f25208r = z;
    }

    public C4669i(String str, String str2, String str3, String str4, String str5, String str6, String str7, C4661c0 c0Var) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, C4956b.m31385o3(c0Var).asBinder(), false);
    }
}
