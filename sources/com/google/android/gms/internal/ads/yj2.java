package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yj2 implements sj2 {

    /* renamed from: a */
    public final boolean f20634a;

    /* renamed from: b */
    public final boolean f20635b;

    /* renamed from: c */
    public final String f20636c;

    /* renamed from: d */
    public final boolean f20637d;

    /* renamed from: e */
    public final boolean f20638e;

    /* renamed from: f */
    public final boolean f20639f;

    /* renamed from: g */
    public final String f20640g;

    /* renamed from: h */
    public final ArrayList f20641h;

    /* renamed from: i */
    public final String f20642i;

    /* renamed from: j */
    public final String f20643j;

    /* renamed from: k */
    public final String f20644k;

    /* renamed from: l */
    public final boolean f20645l;

    /* renamed from: m */
    public final String f20646m;

    /* renamed from: n */
    public final long f20647n;

    /* renamed from: o */
    public final boolean f20648o;

    public yj2(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7) {
        this.f20634a = z;
        this.f20635b = z2;
        this.f20636c = str;
        this.f20637d = z3;
        this.f20638e = z4;
        this.f20639f = z5;
        this.f20640g = str2;
        this.f20641h = arrayList;
        this.f20642i = str3;
        this.f20643j = str4;
        this.f20644k = str5;
        this.f20645l = z6;
        this.f20646m = str6;
        this.f20647n = j;
        this.f20648o = z7;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f20634a);
        bundle.putBoolean("coh", this.f20635b);
        bundle.putString("gl", this.f20636c);
        bundle.putBoolean("simulator", this.f20637d);
        bundle.putBoolean("is_latchsky", this.f20638e);
        bundle.putBoolean("is_sidewinder", this.f20639f);
        bundle.putString("hl", this.f20640g);
        if (!this.f20641h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f20641h);
        }
        bundle.putString("mv", this.f20642i);
        bundle.putString("submodel", this.f20646m);
        Bundle a = pt2.m18893a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f20644k);
        a.putLong("remaining_data_partition_space", this.f20647n);
        Bundle a2 = pt2.m18893a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f20645l);
        if (!TextUtils.isEmpty(this.f20643j)) {
            Bundle a3 = pt2.m18893a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f20643j);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14421R8)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f20648o);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14401P8)).booleanValue()) {
            bundle.putBoolean("gotmt_l", ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue());
            bundle.putBoolean("gotmt_i", ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14361L8)).booleanValue());
        }
    }
}
