package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import p033d5.C4141r;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class he2 implements sj2 {

    /* renamed from: a */
    public final C4571q4 f10299a;

    /* renamed from: b */
    public final String f10300b;

    /* renamed from: c */
    public final boolean f10301c;

    /* renamed from: d */
    public final String f10302d;

    /* renamed from: e */
    public final float f10303e;

    /* renamed from: f */
    public final int f10304f;

    /* renamed from: g */
    public final int f10305g;

    /* renamed from: h */
    public final String f10306h;

    /* renamed from: i */
    public final boolean f10307i;

    public he2(C4571q4 q4Var, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        C4141r.m28222l(q4Var, "the adSize must not be null");
        this.f10299a = q4Var;
        this.f10300b = str;
        this.f10301c = z;
        this.f10302d = str2;
        this.f10303e = f;
        this.f10304f = i;
        this.f10305g = i2;
        this.f10306h = str3;
        this.f10307i = z2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        pt2.m18898f(bundle, "smart_w", "full", this.f10299a.f24976e == -1);
        pt2.m18898f(bundle, "smart_h", "auto", this.f10299a.f24973b == -2);
        pt2.m18899g(bundle, "ene", true, this.f10299a.f24981r);
        pt2.m18898f(bundle, "rafmt", "102", this.f10299a.f24984u);
        pt2.m18898f(bundle, "rafmt", "103", this.f10299a.f24985v);
        pt2.m18898f(bundle, "rafmt", "105", this.f10299a.f24986w);
        pt2.m18899g(bundle, "inline_adaptive_slot", true, this.f10307i);
        pt2.m18899g(bundle, "interscroller_slot", true, this.f10299a.f24986w);
        pt2.m18895c(bundle, "format", this.f10300b);
        pt2.m18898f(bundle, "fluid", "height", this.f10301c);
        String str = this.f10302d;
        pt2.m18898f(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f10303e);
        bundle.putInt("sw", this.f10304f);
        bundle.putInt("sh", this.f10305g);
        String str2 = this.f10306h;
        pt2.m18898f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        C4571q4[] q4VarArr = this.f10299a.f24978g;
        if (q4VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f10299a.f24973b);
            bundle2.putInt("width", this.f10299a.f24976e);
            bundle2.putBoolean("is_fluid_height", this.f10299a.f24980i);
            arrayList.add(bundle2);
        } else {
            for (C4571q4 q4Var : q4VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", q4Var.f24980i);
                bundle3.putInt("height", q4Var.f24973b);
                bundle3.putInt("width", q4Var.f24976e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
