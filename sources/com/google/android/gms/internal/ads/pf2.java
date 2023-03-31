package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pf2 implements sj2 {

    /* renamed from: a */
    public final int f15839a;

    /* renamed from: b */
    public final boolean f15840b;

    /* renamed from: c */
    public final boolean f15841c;

    /* renamed from: d */
    public final int f15842d;

    /* renamed from: e */
    public final int f15843e;

    /* renamed from: f */
    public final int f15844f;

    /* renamed from: g */
    public final int f15845g;

    /* renamed from: h */
    public final int f15846h;

    /* renamed from: i */
    public final float f15847i;

    /* renamed from: j */
    public final boolean f15848j;

    public pf2(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.f15839a = i;
        this.f15840b = z;
        this.f15841c = z2;
        this.f15842d = i2;
        this.f15843e = i3;
        this.f15844f = i4;
        this.f15845g = i5;
        this.f15846h = i6;
        this.f15847i = f;
        this.f15848j = z3;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f15839a);
        bundle.putBoolean("ma", this.f15840b);
        bundle.putBoolean("sp", this.f15841c);
        bundle.putInt("muv", this.f15842d);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14281D8)).booleanValue()) {
            bundle.putInt("muv_min", this.f15843e);
            bundle.putInt("muv_max", this.f15844f);
        }
        bundle.putInt("rm", this.f15845g);
        bundle.putInt("riv", this.f15846h);
        bundle.putFloat("android_app_volume", this.f15847i);
        bundle.putBoolean("android_app_muted", this.f15848j);
    }
}
