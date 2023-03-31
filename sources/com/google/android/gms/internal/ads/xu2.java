package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xu2 extends C4240a {
    public static final Parcelable.Creator<xu2> CREATOR = new yu2();

    /* renamed from: a */
    private final uu2[] f20347a;

    /* renamed from: b */
    public final Context f20348b;

    /* renamed from: c */
    private final int f20349c;

    /* renamed from: d */
    public final uu2 f20350d;

    /* renamed from: e */
    public final int f20351e;

    /* renamed from: f */
    public final int f20352f;

    /* renamed from: g */
    public final int f20353g;

    /* renamed from: h */
    public final String f20354h;

    /* renamed from: i */
    private final int f20355i;

    /* renamed from: r */
    private final int f20356r;

    /* renamed from: s */
    private final int[] f20357s;

    /* renamed from: t */
    private final int[] f20358t;

    /* renamed from: u */
    public final int f20359u;

    public xu2(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        uu2[] values = uu2.values();
        this.f20347a = values;
        int[] a = vu2.m22448a();
        this.f20357s = a;
        int[] a2 = wu2.m22908a();
        this.f20358t = a2;
        this.f20348b = null;
        this.f20349c = i;
        this.f20350d = values[i];
        this.f20351e = i2;
        this.f20352f = i3;
        this.f20353g = i4;
        this.f20354h = str;
        this.f20355i = i5;
        this.f20359u = a[i5];
        this.f20356r = i6;
        int i7 = a2[i6];
    }

    /* renamed from: I1 */
    public static xu2 m23545I1(uu2 uu2, Context context) {
        if (uu2 == uu2.Rewarded) {
            return new xu2(context, uu2, ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14723w5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14268C5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14288E5)).intValue(), (String) C4596v.m30088c().mo12227b(C2679nz.f14308G5), (String) C4596v.m30088c().mo12227b(C2679nz.f14743y5), (String) C4596v.m30088c().mo12227b(C2679nz.f14248A5));
        } else if (uu2 == uu2.Interstitial) {
            return new xu2(context, uu2, ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14733x5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14278D5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14298F5)).intValue(), (String) C4596v.m30088c().mo12227b(C2679nz.f14318H5), (String) C4596v.m30088c().mo12227b(C2679nz.f14753z5), (String) C4596v.m30088c().mo12227b(C2679nz.f14258B5));
        } else if (uu2 != uu2.AppOpen) {
            return null;
        } else {
            return new xu2(context, uu2, ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14348K5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14368M5)).intValue(), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14378N5)).intValue(), (String) C4596v.m30088c().mo12227b(C2679nz.f14328I5), (String) C4596v.m30088c().mo12227b(C2679nz.f14338J5), (String) C4596v.m30088c().mo12227b(C2679nz.f14358L5));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f20349c);
        C4243c.m28614k(parcel, 2, this.f20351e);
        C4243c.m28614k(parcel, 3, this.f20352f);
        C4243c.m28614k(parcel, 4, this.f20353g);
        C4243c.m28620q(parcel, 5, this.f20354h, false);
        C4243c.m28614k(parcel, 6, this.f20355i);
        C4243c.m28614k(parcel, 7, this.f20356r);
        C4243c.m28605b(parcel, a);
    }

    private xu2(Context context, uu2 uu2, int i, int i2, int i3, String str, String str2, String str3) {
        this.f20347a = uu2.values();
        this.f20357s = vu2.m22448a();
        this.f20358t = wu2.m22908a();
        this.f20348b = context;
        this.f20349c = uu2.ordinal();
        this.f20350d = uu2;
        this.f20351e = i;
        this.f20352f = i2;
        this.f20353g = i3;
        this.f20354h = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f20359u = i4;
        this.f20355i = i4 - 1;
        "onAdClosed".equals(str3);
        this.f20356r = 0;
    }
}
