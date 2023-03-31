package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ij2 implements sj2 {

    /* renamed from: a */
    public final boolean f10815a;

    /* renamed from: b */
    public final boolean f10816b;

    /* renamed from: c */
    public final String f10817c;

    /* renamed from: d */
    public final boolean f10818d;

    /* renamed from: e */
    public final int f10819e;

    /* renamed from: f */
    public final int f10820f;

    /* renamed from: g */
    public final int f10821g;

    public ij2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f10815a = z;
        this.f10816b = z2;
        this.f10817c = str;
        this.f10818d = z3;
        this.f10819e = i;
        this.f10820f = i2;
        this.f10821g = i3;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f10817c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) C4596v.m30088c().mo12227b(C2679nz.f14395P2));
        bundle.putInt("target_api", this.f10819e);
        bundle.putInt("dv", this.f10820f);
        bundle.putInt("lv", this.f10821g);
        Bundle a = pt2.m18893a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) e10.f8557a.mo13438e()).booleanValue());
        a.putBoolean("instant_app", this.f10815a);
        a.putBoolean("lite", this.f10816b);
        a.putBoolean("is_privileged_process", this.f10818d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = pt2.m18893a(a, "build_meta");
        a2.putString("cl", "474357726");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
