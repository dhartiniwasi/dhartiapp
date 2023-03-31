package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p033d5.C4141r;
import p402y5.C13037o;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7431m5 {

    /* renamed from: A */
    private long f32719A;

    /* renamed from: B */
    private String f32720B;

    /* renamed from: C */
    private boolean f32721C;

    /* renamed from: D */
    private long f32722D;

    /* renamed from: E */
    private long f32723E;

    /* renamed from: a */
    private final C7397j4 f32724a;

    /* renamed from: b */
    private final String f32725b;

    /* renamed from: c */
    private String f32726c;

    /* renamed from: d */
    private String f32727d;

    /* renamed from: e */
    private String f32728e;

    /* renamed from: f */
    private String f32729f;

    /* renamed from: g */
    private long f32730g;

    /* renamed from: h */
    private long f32731h;

    /* renamed from: i */
    private long f32732i;

    /* renamed from: j */
    private String f32733j;

    /* renamed from: k */
    private long f32734k;

    /* renamed from: l */
    private String f32735l;

    /* renamed from: m */
    private long f32736m;

    /* renamed from: n */
    private long f32737n;

    /* renamed from: o */
    private boolean f32738o;

    /* renamed from: p */
    private boolean f32739p;

    /* renamed from: q */
    private String f32740q;

    /* renamed from: r */
    private Boolean f32741r;

    /* renamed from: s */
    private long f32742s;

    /* renamed from: t */
    private List f32743t;

    /* renamed from: u */
    private String f32744u;

    /* renamed from: v */
    private long f32745v;

    /* renamed from: w */
    private long f32746w;

    /* renamed from: x */
    private long f32747x;

    /* renamed from: y */
    private long f32748y;

    /* renamed from: z */
    private long f32749z;

    C7431m5(C7397j4 j4Var, String str) {
        C4141r.m28221k(j4Var);
        C4141r.m28217g(str);
        this.f32724a = j4Var;
        this.f32725b = str;
        j4Var.mo24143s().mo24189f();
    }

    /* renamed from: A */
    public final long mo24513A() {
        this.f32724a.mo24143s().mo24189f();
        return 0;
    }

    /* renamed from: B */
    public final void mo24514B(long j) {
        boolean z = true;
        C4141r.m28211a(j >= 0);
        this.f32724a.mo24143s().mo24189f();
        boolean z2 = this.f32721C;
        if (this.f32730g == j) {
            z = false;
        }
        this.f32721C = z | z2;
        this.f32730g = j;
    }

    /* renamed from: C */
    public final void mo24515C(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32731h != j;
        this.f32731h = j;
    }

    /* renamed from: D */
    public final void mo24516D(boolean z) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32738o != z;
        this.f32738o = z;
    }

    /* renamed from: E */
    public final void mo24517E(Boolean bool) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32741r, bool);
        this.f32741r = bool;
    }

    /* renamed from: F */
    public final void mo24518F(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32728e, str);
        this.f32728e = str;
    }

    /* renamed from: G */
    public final void mo24519G(List list) {
        this.f32724a.mo24143s().mo24189f();
        if (!C13037o.m61351a(this.f32743t, list)) {
            this.f32721C = true;
            this.f32743t = list != null ? new ArrayList(list) : null;
        }
    }

    /* renamed from: H */
    public final void mo24520H(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32744u, str);
        this.f32744u = str;
    }

    /* renamed from: I */
    public final boolean mo24521I() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32739p;
    }

    /* renamed from: J */
    public final boolean mo24522J() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32738o;
    }

    /* renamed from: K */
    public final boolean mo24523K() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32721C;
    }

    /* renamed from: L */
    public final long mo24524L() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32734k;
    }

    /* renamed from: M */
    public final long mo24525M() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32722D;
    }

    /* renamed from: N */
    public final long mo24526N() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32748y;
    }

    /* renamed from: O */
    public final long mo24527O() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32749z;
    }

    /* renamed from: P */
    public final long mo24528P() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32747x;
    }

    /* renamed from: Q */
    public final long mo24529Q() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32746w;
    }

    /* renamed from: R */
    public final long mo24530R() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32719A;
    }

    /* renamed from: S */
    public final long mo24531S() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32745v;
    }

    /* renamed from: T */
    public final long mo24532T() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32737n;
    }

    /* renamed from: U */
    public final long mo24533U() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32742s;
    }

    /* renamed from: V */
    public final long mo24534V() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32723E;
    }

    /* renamed from: W */
    public final long mo24535W() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32736m;
    }

    /* renamed from: X */
    public final long mo24536X() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32732i;
    }

    /* renamed from: Y */
    public final long mo24537Y() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32730g;
    }

    /* renamed from: Z */
    public final long mo24538Z() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32731h;
    }

    /* renamed from: a */
    public final String mo24539a() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32728e;
    }

    /* renamed from: a0 */
    public final Boolean mo24540a0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32741r;
    }

    /* renamed from: b */
    public final String mo24541b() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32744u;
    }

    /* renamed from: b0 */
    public final String mo24542b0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32740q;
    }

    /* renamed from: c */
    public final List mo24543c() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32743t;
    }

    /* renamed from: c0 */
    public final String mo24544c0() {
        this.f32724a.mo24143s().mo24189f();
        String str = this.f32720B;
        mo24573y((String) null);
        return str;
    }

    /* renamed from: d */
    public final void mo24545d() {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C = false;
    }

    /* renamed from: d0 */
    public final String mo24546d0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32725b;
    }

    /* renamed from: e */
    public final void mo24547e() {
        this.f32724a.mo24143s().mo24189f();
        long j = this.f32730g + 1;
        if (j > 2147483647L) {
            this.f32724a.mo24135l().mo24261w().mo24209b("Bundle index overflow. appId", C7352f3.m41475z(this.f32725b));
            j = 0;
        }
        this.f32721C = true;
        this.f32730g = j;
    }

    /* renamed from: e0 */
    public final String mo24548e0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32726c;
    }

    /* renamed from: f */
    public final void mo24549f(String str) {
        this.f32724a.mo24143s().mo24189f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f32721C |= true ^ C13037o.m61351a(this.f32740q, str);
        this.f32740q = str;
    }

    /* renamed from: f0 */
    public final String mo24550f0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32735l;
    }

    /* renamed from: g */
    public final void mo24551g(boolean z) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32739p != z;
        this.f32739p = z;
    }

    /* renamed from: g0 */
    public final String mo24552g0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32733j;
    }

    /* renamed from: h */
    public final void mo24553h(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32726c, str);
        this.f32726c = str;
    }

    /* renamed from: h0 */
    public final String mo24554h0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32729f;
    }

    /* renamed from: i */
    public final void mo24555i(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32735l, str);
        this.f32735l = str;
    }

    /* renamed from: i0 */
    public final String mo24556i0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32727d;
    }

    /* renamed from: j */
    public final void mo24557j(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32733j, str);
        this.f32733j = str;
    }

    /* renamed from: j0 */
    public final String mo24558j0() {
        this.f32724a.mo24143s().mo24189f();
        return this.f32720B;
    }

    /* renamed from: k */
    public final void mo24559k(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32734k != j;
        this.f32734k = j;
    }

    /* renamed from: l */
    public final void mo24560l(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32722D != j;
        this.f32722D = j;
    }

    /* renamed from: m */
    public final void mo24561m(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32748y != j;
        this.f32748y = j;
    }

    /* renamed from: n */
    public final void mo24562n(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32749z != j;
        this.f32749z = j;
    }

    /* renamed from: o */
    public final void mo24563o(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32747x != j;
        this.f32747x = j;
    }

    /* renamed from: p */
    public final void mo24564p(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32746w != j;
        this.f32746w = j;
    }

    /* renamed from: q */
    public final void mo24565q(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32719A != j;
        this.f32719A = j;
    }

    /* renamed from: r */
    public final void mo24566r(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32745v != j;
        this.f32745v = j;
    }

    /* renamed from: s */
    public final void mo24567s(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32737n != j;
        this.f32737n = j;
    }

    /* renamed from: t */
    public final void mo24568t(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32742s != j;
        this.f32742s = j;
    }

    /* renamed from: u */
    public final void mo24569u(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32723E != j;
        this.f32723E = j;
    }

    /* renamed from: v */
    public final void mo24570v(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32729f, str);
        this.f32729f = str;
    }

    /* renamed from: w */
    public final void mo24571w(String str) {
        this.f32724a.mo24143s().mo24189f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f32721C |= true ^ C13037o.m61351a(this.f32727d, str);
        this.f32727d = str;
    }

    /* renamed from: x */
    public final void mo24572x(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32736m != j;
        this.f32736m = j;
    }

    /* renamed from: y */
    public final void mo24573y(String str) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= !C13037o.m61351a(this.f32720B, str);
        this.f32720B = str;
    }

    /* renamed from: z */
    public final void mo24574z(long j) {
        this.f32724a.mo24143s().mo24189f();
        this.f32721C |= this.f32732i != j;
        this.f32732i = j;
    }
}
