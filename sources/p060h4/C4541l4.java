package p060h4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.qm0;
import java.util.ArrayList;
import java.util.List;
import p033d5.C4133p;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.l4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4541l4 extends C4240a {
    public static final Parcelable.Creator<C4541l4> CREATOR = new C4553n4();

    /* renamed from: A */
    public final C4615y0 f24883A;

    /* renamed from: B */
    public final int f24884B;

    /* renamed from: C */
    public final String f24885C;

    /* renamed from: D */
    public final List f24886D;

    /* renamed from: E */
    public final int f24887E;

    /* renamed from: F */
    public final String f24888F;

    /* renamed from: a */
    public final int f24889a;
    @Deprecated

    /* renamed from: b */
    public final long f24890b;

    /* renamed from: c */
    public final Bundle f24891c;
    @Deprecated

    /* renamed from: d */
    public final int f24892d;

    /* renamed from: e */
    public final List f24893e;

    /* renamed from: f */
    public final boolean f24894f;

    /* renamed from: g */
    public final int f24895g;

    /* renamed from: h */
    public final boolean f24896h;

    /* renamed from: i */
    public final String f24897i;

    /* renamed from: r */
    public final C4481b4 f24898r;

    /* renamed from: s */
    public final Location f24899s;

    /* renamed from: t */
    public final String f24900t;

    /* renamed from: u */
    public final Bundle f24901u;

    /* renamed from: v */
    public final Bundle f24902v;

    /* renamed from: w */
    public final List f24903w;

    /* renamed from: x */
    public final String f24904x;

    /* renamed from: y */
    public final String f24905y;
    @Deprecated

    /* renamed from: z */
    public final boolean f24906z;

    public C4541l4(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, C4481b4 b4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, C4615y0 y0Var, int i4, String str5, List list3, int i5, String str6) {
        this.f24889a = i;
        this.f24890b = j;
        this.f24891c = bundle == null ? new Bundle() : bundle;
        this.f24892d = i2;
        this.f24893e = list;
        this.f24894f = z;
        this.f24895g = i3;
        this.f24896h = z2;
        this.f24897i = str;
        this.f24898r = b4Var;
        this.f24899s = location;
        this.f24900t = str2;
        this.f24901u = bundle2 == null ? new Bundle() : bundle2;
        this.f24902v = bundle3;
        this.f24903w = list2;
        this.f24904x = str3;
        this.f24905y = str4;
        this.f24906z = z3;
        this.f24883A = y0Var;
        this.f24884B = i4;
        this.f24885C = str5;
        this.f24886D = list3 == null ? new ArrayList() : list3;
        this.f24887E = i5;
        this.f24888F = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4541l4)) {
            return false;
        }
        C4541l4 l4Var = (C4541l4) obj;
        if (this.f24889a != l4Var.f24889a || this.f24890b != l4Var.f24890b || !qm0.m19290a(this.f24891c, l4Var.f24891c) || this.f24892d != l4Var.f24892d || !C4133p.m28193a(this.f24893e, l4Var.f24893e) || this.f24894f != l4Var.f24894f || this.f24895g != l4Var.f24895g || this.f24896h != l4Var.f24896h || !C4133p.m28193a(this.f24897i, l4Var.f24897i) || !C4133p.m28193a(this.f24898r, l4Var.f24898r) || !C4133p.m28193a(this.f24899s, l4Var.f24899s) || !C4133p.m28193a(this.f24900t, l4Var.f24900t) || !qm0.m19290a(this.f24901u, l4Var.f24901u) || !qm0.m19290a(this.f24902v, l4Var.f24902v) || !C4133p.m28193a(this.f24903w, l4Var.f24903w) || !C4133p.m28193a(this.f24904x, l4Var.f24904x) || !C4133p.m28193a(this.f24905y, l4Var.f24905y) || this.f24906z != l4Var.f24906z || this.f24884B != l4Var.f24884B || !C4133p.m28193a(this.f24885C, l4Var.f24885C) || !C4133p.m28193a(this.f24886D, l4Var.f24886D) || this.f24887E != l4Var.f24887E || !C4133p.m28193a(this.f24888F, l4Var.f24888F)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4133p.m28194b(Integer.valueOf(this.f24889a), Long.valueOf(this.f24890b), this.f24891c, Integer.valueOf(this.f24892d), this.f24893e, Boolean.valueOf(this.f24894f), Integer.valueOf(this.f24895g), Boolean.valueOf(this.f24896h), this.f24897i, this.f24898r, this.f24899s, this.f24900t, this.f24901u, this.f24902v, this.f24903w, this.f24904x, this.f24905y, Boolean.valueOf(this.f24906z), Integer.valueOf(this.f24884B), this.f24885C, this.f24886D, Integer.valueOf(this.f24887E), this.f24888F);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f24889a);
        C4243c.m28617n(parcel, 2, this.f24890b);
        C4243c.m28608e(parcel, 3, this.f24891c, false);
        C4243c.m28614k(parcel, 4, this.f24892d);
        C4243c.m28622s(parcel, 5, this.f24893e, false);
        C4243c.m28606c(parcel, 6, this.f24894f);
        C4243c.m28614k(parcel, 7, this.f24895g);
        C4243c.m28606c(parcel, 8, this.f24896h);
        C4243c.m28620q(parcel, 9, this.f24897i, false);
        C4243c.m28619p(parcel, 10, this.f24898r, i, false);
        C4243c.m28619p(parcel, 11, this.f24899s, i, false);
        C4243c.m28620q(parcel, 12, this.f24900t, false);
        C4243c.m28608e(parcel, 13, this.f24901u, false);
        C4243c.m28608e(parcel, 14, this.f24902v, false);
        C4243c.m28622s(parcel, 15, this.f24903w, false);
        C4243c.m28620q(parcel, 16, this.f24904x, false);
        C4243c.m28620q(parcel, 17, this.f24905y, false);
        C4243c.m28606c(parcel, 18, this.f24906z);
        C4243c.m28619p(parcel, 19, this.f24883A, i, false);
        C4243c.m28614k(parcel, 20, this.f24884B);
        C4243c.m28620q(parcel, 21, this.f24885C, false);
        C4243c.m28622s(parcel, 22, this.f24886D, false);
        C4243c.m28614k(parcel, 23, this.f24887E);
        C4243c.m28620q(parcel, 24, this.f24888F, false);
        C4243c.m28605b(parcel, a);
    }
}
