package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ge2 implements tj2 {

    /* renamed from: a */
    private final tj2 f9865a;

    /* renamed from: b */
    private final et2 f9866b;

    /* renamed from: c */
    private final Context f9867c;

    /* renamed from: d */
    private final xl0 f9868d;

    public ge2(zf2 zf2, et2 et2, Context context, xl0 xl0) {
        this.f9865a = zf2;
        this.f9866b = et2;
        this.f9867c = context;
        this.f9868d = xl0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ he2 mo10494a(yj2 yj2) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        C4571q4 q4Var = this.f9866b.f8934e;
        C4571q4[] q4VarArr = q4Var.f24978g;
        if (q4VarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (C4571q4 q4Var2 : q4VarArr) {
                boolean z4 = q4Var2.f24980i;
                if (!z4 && !z2) {
                    str = q4Var2.f24972a;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = q4Var.f24972a;
            z = q4Var.f24980i;
        }
        Resources resources = this.f9867c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f9868d.mo15117h().mo18496c0();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        C4571q4[] q4VarArr2 = q4Var.f24978g;
        if (q4VarArr2 != null) {
            boolean z5 = false;
            for (C4571q4 q4Var3 : q4VarArr2) {
                if (q4Var3.f24980i) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = q4Var3.f24976e;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (((float) q4Var3.f24977f) / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = q4Var3.f24973b;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (((float) q4Var3.f24974c) / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new he2(q4Var, str, z, sb.toString(), f, i2, i, str2, this.f9866b.f8945p);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10915m(this.f9865a.mo8340d(), new fe2(this), dn0.f8330f);
    }

    public final int zza() {
        return 7;
    }
}
