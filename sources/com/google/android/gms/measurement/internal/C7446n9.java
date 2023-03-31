package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7446n9 extends C4240a {
    public static final Parcelable.Creator<C7446n9> CREATOR = new C7457o9();

    /* renamed from: A */
    public final long f32781A;

    /* renamed from: B */
    public final List f32782B;

    /* renamed from: C */
    public final String f32783C;

    /* renamed from: D */
    public final String f32784D;

    /* renamed from: E */
    public final String f32785E;

    /* renamed from: F */
    public final String f32786F;

    /* renamed from: a */
    public final String f32787a;

    /* renamed from: b */
    public final String f32788b;

    /* renamed from: c */
    public final String f32789c;

    /* renamed from: d */
    public final String f32790d;

    /* renamed from: e */
    public final long f32791e;

    /* renamed from: f */
    public final long f32792f;

    /* renamed from: g */
    public final String f32793g;

    /* renamed from: h */
    public final boolean f32794h;

    /* renamed from: i */
    public final boolean f32795i;

    /* renamed from: r */
    public final long f32796r;

    /* renamed from: s */
    public final String f32797s;
    @Deprecated

    /* renamed from: t */
    public final long f32798t;

    /* renamed from: u */
    public final long f32799u;

    /* renamed from: v */
    public final int f32800v;

    /* renamed from: w */
    public final boolean f32801w;

    /* renamed from: x */
    public final boolean f32802x;

    /* renamed from: y */
    public final String f32803y;

    /* renamed from: z */
    public final Boolean f32804z;

    C7446n9(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        C4141r.m28217g(str);
        this.f32787a = str;
        this.f32788b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f32789c = str3;
        this.f32796r = j;
        this.f32790d = str4;
        this.f32791e = j2;
        this.f32792f = j3;
        this.f32793g = str5;
        this.f32794h = z;
        this.f32795i = z2;
        this.f32797s = str6;
        this.f32798t = 0;
        this.f32799u = j5;
        this.f32800v = i;
        this.f32801w = z3;
        this.f32802x = z4;
        this.f32803y = str7;
        this.f32804z = bool;
        this.f32781A = j6;
        this.f32782B = list;
        this.f32783C = null;
        this.f32784D = str9;
        this.f32785E = str10;
        this.f32786F = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f32787a, false);
        C4243c.m28620q(parcel, 3, this.f32788b, false);
        C4243c.m28620q(parcel, 4, this.f32789c, false);
        C4243c.m28620q(parcel, 5, this.f32790d, false);
        C4243c.m28617n(parcel, 6, this.f32791e);
        C4243c.m28617n(parcel, 7, this.f32792f);
        C4243c.m28620q(parcel, 8, this.f32793g, false);
        C4243c.m28606c(parcel, 9, this.f32794h);
        C4243c.m28606c(parcel, 10, this.f32795i);
        C4243c.m28617n(parcel, 11, this.f32796r);
        C4243c.m28620q(parcel, 12, this.f32797s, false);
        C4243c.m28617n(parcel, 13, this.f32798t);
        C4243c.m28617n(parcel, 14, this.f32799u);
        C4243c.m28614k(parcel, 15, this.f32800v);
        C4243c.m28606c(parcel, 16, this.f32801w);
        C4243c.m28606c(parcel, 18, this.f32802x);
        C4243c.m28620q(parcel, 19, this.f32803y, false);
        C4243c.m28607d(parcel, 21, this.f32804z, false);
        C4243c.m28617n(parcel, 22, this.f32781A);
        C4243c.m28622s(parcel, 23, this.f32782B, false);
        C4243c.m28620q(parcel, 24, this.f32783C, false);
        C4243c.m28620q(parcel, 25, this.f32784D, false);
        C4243c.m28620q(parcel, 26, this.f32785E, false);
        C4243c.m28620q(parcel, 27, this.f32786F, false);
        C4243c.m28605b(parcel, a);
    }

    C7446n9(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.f32787a = str;
        this.f32788b = str2;
        this.f32789c = str3;
        this.f32796r = j3;
        this.f32790d = str4;
        this.f32791e = j;
        this.f32792f = j2;
        this.f32793g = str5;
        this.f32794h = z;
        this.f32795i = z2;
        this.f32797s = str6;
        this.f32798t = j4;
        this.f32799u = j5;
        this.f32800v = i;
        this.f32801w = z3;
        this.f32802x = z4;
        this.f32803y = str7;
        this.f32804z = bool;
        this.f32781A = j6;
        this.f32782B = list;
        this.f32783C = str8;
        this.f32784D = str9;
        this.f32785E = str10;
        this.f32786F = str11;
    }
}
