package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4141r;
import p040e5.C4240a;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7336d9 extends C4240a {
    public static final Parcelable.Creator<C7336d9> CREATOR = new C7347e9();

    /* renamed from: a */
    public final int f32438a;

    /* renamed from: b */
    public final String f32439b;

    /* renamed from: c */
    public final long f32440c;

    /* renamed from: d */
    public final Long f32441d;

    /* renamed from: e */
    public final String f32442e;

    /* renamed from: f */
    public final String f32443f;

    /* renamed from: g */
    public final Double f32444g;

    C7336d9(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f32438a = i;
        this.f32439b = str;
        this.f32440c = j;
        this.f32441d = l;
        if (i == 1) {
            this.f32444g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f32444g = d;
        }
        this.f32442e = str2;
        this.f32443f = str3;
    }

    /* renamed from: I1 */
    public final Object mo24243I1() {
        Long l = this.f32441d;
        if (l != null) {
            return l;
        }
        Double d = this.f32444g;
        if (d != null) {
            return d;
        }
        String str = this.f32442e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7347e9.m41466a(this, parcel, i);
    }

    C7336d9(C7358f9 f9Var) {
        this(f9Var.f32491c, f9Var.f32492d, f9Var.f32493e, f9Var.f32490b);
    }

    C7336d9(String str, long j, Object obj, String str2) {
        C4141r.m28217g(str);
        this.f32438a = 2;
        this.f32439b = str;
        this.f32440c = j;
        this.f32443f = str2;
        if (obj == null) {
            this.f32441d = null;
            this.f32444g = null;
            this.f32442e = null;
        } else if (obj instanceof Long) {
            this.f32441d = (Long) obj;
            this.f32444g = null;
            this.f32442e = null;
        } else if (obj instanceof String) {
            this.f32441d = null;
            this.f32444g = null;
            this.f32442e = (String) obj;
        } else if (obj instanceof Double) {
            this.f32441d = null;
            this.f32444g = (Double) obj;
            this.f32442e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
