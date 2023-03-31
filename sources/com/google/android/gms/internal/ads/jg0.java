package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4541l4;
import p060h4.C4551n2;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jg0 extends C4240a {
    public static final Parcelable.Creator<jg0> CREATOR = new kg0();

    /* renamed from: A */
    public final float f11536A;

    /* renamed from: B */
    public final String f11537B;

    /* renamed from: C */
    public final long f11538C;

    /* renamed from: D */
    public final String f11539D;

    /* renamed from: E */
    public final List f11540E;

    /* renamed from: F */
    public final String f11541F;

    /* renamed from: G */
    public final f20 f11542G;

    /* renamed from: H */
    public final List f11543H;

    /* renamed from: I */
    public final long f11544I;

    /* renamed from: J */
    public final String f11545J;

    /* renamed from: K */
    public final float f11546K;

    /* renamed from: L */
    public final int f11547L;

    /* renamed from: M */
    public final int f11548M;

    /* renamed from: N */
    public final boolean f11549N;

    /* renamed from: O */
    public final String f11550O;

    /* renamed from: P */
    public final boolean f11551P;

    /* renamed from: Q */
    public final String f11552Q;

    /* renamed from: R */
    public final boolean f11553R;

    /* renamed from: S */
    public final int f11554S;

    /* renamed from: a */
    public final int f11555a;

    /* renamed from: a0 */
    public final Bundle f11556a0;

    /* renamed from: b */
    public final Bundle f11557b;

    /* renamed from: b0 */
    public final String f11558b0;

    /* renamed from: c */
    public final C4541l4 f11559c;

    /* renamed from: c0 */
    public final C4551n2 f11560c0;

    /* renamed from: d */
    public final C4571q4 f11561d;

    /* renamed from: d0 */
    public final boolean f11562d0;

    /* renamed from: e */
    public final String f11563e;

    /* renamed from: e0 */
    public final Bundle f11564e0;

    /* renamed from: f */
    public final ApplicationInfo f11565f;

    /* renamed from: f0 */
    public final String f11566f0;

    /* renamed from: g */
    public final PackageInfo f11567g;

    /* renamed from: g0 */
    public final String f11568g0;

    /* renamed from: h */
    public final String f11569h;

    /* renamed from: h0 */
    public final String f11570h0;

    /* renamed from: i */
    public final String f11571i;

    /* renamed from: i0 */
    public final boolean f11572i0;

    /* renamed from: j0 */
    public final List f11573j0;

    /* renamed from: k0 */
    public final String f11574k0;

    /* renamed from: l0 */
    public final List f11575l0;

    /* renamed from: m0 */
    public final int f11576m0;

    /* renamed from: n0 */
    public final boolean f11577n0;

    /* renamed from: o0 */
    public final boolean f11578o0;

    /* renamed from: p0 */
    public final boolean f11579p0;

    /* renamed from: q0 */
    public final ArrayList f11580q0;

    /* renamed from: r */
    public final String f11581r;

    /* renamed from: r0 */
    public final String f11582r0;

    /* renamed from: s */
    public final vm0 f11583s;

    /* renamed from: s0 */
    public final f80 f11584s0;

    /* renamed from: t */
    public final Bundle f11585t;

    /* renamed from: t0 */
    public final String f11586t0;

    /* renamed from: u */
    public final int f11587u;

    /* renamed from: u0 */
    public final Bundle f11588u0;

    /* renamed from: v */
    public final List f11589v;

    /* renamed from: w */
    public final Bundle f11590w;

    /* renamed from: x */
    public final boolean f11591x;

    /* renamed from: y */
    public final int f11592y;

    /* renamed from: z */
    public final int f11593z;

    jg0(int i, Bundle bundle, C4541l4 l4Var, C4571q4 q4Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, vm0 vm0, Bundle bundle2, int i2, List list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List list2, String str7, f20 f20, List list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, C4551n2 n2Var, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List list4, String str15, List list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList arrayList, String str16, f80 f80, String str17, Bundle bundle6) {
        List list6;
        List list7;
        this.f11555a = i;
        this.f11557b = bundle;
        this.f11559c = l4Var;
        this.f11561d = q4Var;
        this.f11563e = str;
        this.f11565f = applicationInfo;
        this.f11567g = packageInfo;
        this.f11569h = str2;
        this.f11571i = str3;
        this.f11581r = str4;
        this.f11583s = vm0;
        this.f11585t = bundle2;
        this.f11587u = i2;
        this.f11589v = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f11543H = list6;
        this.f11590w = bundle3;
        this.f11591x = z;
        this.f11592y = i3;
        this.f11593z = i4;
        this.f11536A = f;
        this.f11537B = str5;
        this.f11538C = j;
        this.f11539D = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f11540E = list7;
        this.f11541F = str7;
        this.f11542G = f20;
        this.f11544I = j2;
        this.f11545J = str8;
        this.f11546K = f2;
        this.f11551P = z2;
        this.f11547L = i5;
        this.f11548M = i6;
        this.f11549N = z3;
        this.f11550O = str9;
        this.f11552Q = str10;
        this.f11553R = z4;
        this.f11554S = i7;
        this.f11556a0 = bundle4;
        this.f11558b0 = str11;
        this.f11560c0 = n2Var;
        this.f11562d0 = z5;
        this.f11564e0 = bundle5;
        this.f11566f0 = str12;
        this.f11568g0 = str13;
        this.f11570h0 = str14;
        this.f11572i0 = z6;
        this.f11573j0 = list4;
        this.f11574k0 = str15;
        this.f11575l0 = list5;
        this.f11576m0 = i8;
        this.f11577n0 = z7;
        this.f11578o0 = z8;
        this.f11579p0 = z9;
        this.f11580q0 = arrayList;
        this.f11582r0 = str16;
        this.f11584s0 = f80;
        this.f11586t0 = str17;
        this.f11588u0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f11555a);
        C4243c.m28608e(parcel, 2, this.f11557b, false);
        C4243c.m28619p(parcel, 3, this.f11559c, i, false);
        C4243c.m28619p(parcel, 4, this.f11561d, i, false);
        C4243c.m28620q(parcel, 5, this.f11563e, false);
        C4243c.m28619p(parcel, 6, this.f11565f, i, false);
        C4243c.m28619p(parcel, 7, this.f11567g, i, false);
        C4243c.m28620q(parcel, 8, this.f11569h, false);
        C4243c.m28620q(parcel, 9, this.f11571i, false);
        C4243c.m28620q(parcel, 10, this.f11581r, false);
        C4243c.m28619p(parcel, 11, this.f11583s, i, false);
        C4243c.m28608e(parcel, 12, this.f11585t, false);
        C4243c.m28614k(parcel, 13, this.f11587u);
        C4243c.m28622s(parcel, 14, this.f11589v, false);
        C4243c.m28608e(parcel, 15, this.f11590w, false);
        C4243c.m28606c(parcel, 16, this.f11591x);
        C4243c.m28614k(parcel, 18, this.f11592y);
        C4243c.m28614k(parcel, 19, this.f11593z);
        C4243c.m28611h(parcel, 20, this.f11536A);
        C4243c.m28620q(parcel, 21, this.f11537B, false);
        C4243c.m28617n(parcel, 25, this.f11538C);
        C4243c.m28620q(parcel, 26, this.f11539D, false);
        C4243c.m28622s(parcel, 27, this.f11540E, false);
        C4243c.m28620q(parcel, 28, this.f11541F, false);
        C4243c.m28619p(parcel, 29, this.f11542G, i, false);
        C4243c.m28622s(parcel, 30, this.f11543H, false);
        C4243c.m28617n(parcel, 31, this.f11544I);
        C4243c.m28620q(parcel, 33, this.f11545J, false);
        C4243c.m28611h(parcel, 34, this.f11546K);
        C4243c.m28614k(parcel, 35, this.f11547L);
        C4243c.m28614k(parcel, 36, this.f11548M);
        C4243c.m28606c(parcel, 37, this.f11549N);
        C4243c.m28620q(parcel, 39, this.f11550O, false);
        C4243c.m28606c(parcel, 40, this.f11551P);
        C4243c.m28620q(parcel, 41, this.f11552Q, false);
        C4243c.m28606c(parcel, 42, this.f11553R);
        C4243c.m28614k(parcel, 43, this.f11554S);
        C4243c.m28608e(parcel, 44, this.f11556a0, false);
        C4243c.m28620q(parcel, 45, this.f11558b0, false);
        C4243c.m28619p(parcel, 46, this.f11560c0, i, false);
        C4243c.m28606c(parcel, 47, this.f11562d0);
        C4243c.m28608e(parcel, 48, this.f11564e0, false);
        C4243c.m28620q(parcel, 49, this.f11566f0, false);
        C4243c.m28620q(parcel, 50, this.f11568g0, false);
        C4243c.m28620q(parcel, 51, this.f11570h0, false);
        C4243c.m28606c(parcel, 52, this.f11572i0);
        C4243c.m28616m(parcel, 53, this.f11573j0, false);
        C4243c.m28620q(parcel, 54, this.f11574k0, false);
        C4243c.m28622s(parcel, 55, this.f11575l0, false);
        C4243c.m28614k(parcel, 56, this.f11576m0);
        C4243c.m28606c(parcel, 57, this.f11577n0);
        C4243c.m28606c(parcel, 58, this.f11578o0);
        C4243c.m28606c(parcel, 59, this.f11579p0);
        C4243c.m28622s(parcel, 60, this.f11580q0, false);
        C4243c.m28620q(parcel, 61, this.f11582r0, false);
        C4243c.m28619p(parcel, 63, this.f11584s0, i, false);
        C4243c.m28620q(parcel, 64, this.f11586t0, false);
        C4243c.m28608e(parcel, 65, this.f11588u0, false);
        C4243c.m28605b(parcel, a);
    }
}
