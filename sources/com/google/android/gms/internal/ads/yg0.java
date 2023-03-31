package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yg0 extends C4240a {
    public static final Parcelable.Creator<yg0> CREATOR = new zg0();

    /* renamed from: a */
    public final Bundle f20594a;

    /* renamed from: b */
    public final vm0 f20595b;

    /* renamed from: c */
    public final ApplicationInfo f20596c;

    /* renamed from: d */
    public final String f20597d;

    /* renamed from: e */
    public final List f20598e;

    /* renamed from: f */
    public final PackageInfo f20599f;

    /* renamed from: g */
    public final String f20600g;

    /* renamed from: h */
    public final String f20601h;

    /* renamed from: i */
    public xu2 f20602i;

    /* renamed from: r */
    public String f20603r;

    /* renamed from: s */
    public final boolean f20604s;

    public yg0(Bundle bundle, vm0 vm0, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, xu2 xu2, String str4, boolean z) {
        this.f20594a = bundle;
        this.f20595b = vm0;
        this.f20597d = str;
        this.f20596c = applicationInfo;
        this.f20598e = list;
        this.f20599f = packageInfo;
        this.f20600g = str2;
        this.f20601h = str3;
        this.f20602i = xu2;
        this.f20603r = str4;
        this.f20604s = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28608e(parcel, 1, this.f20594a, false);
        C4243c.m28619p(parcel, 2, this.f20595b, i, false);
        C4243c.m28619p(parcel, 3, this.f20596c, i, false);
        C4243c.m28620q(parcel, 4, this.f20597d, false);
        C4243c.m28622s(parcel, 5, this.f20598e, false);
        C4243c.m28619p(parcel, 6, this.f20599f, i, false);
        C4243c.m28620q(parcel, 7, this.f20600g, false);
        C4243c.m28620q(parcel, 9, this.f20601h, false);
        C4243c.m28619p(parcel, 10, this.f20602i, i, false);
        C4243c.m28620q(parcel, 11, this.f20603r, false);
        C4243c.m28606c(parcel, 12, this.f20604s);
        C4243c.m28605b(parcel, a);
    }
}
