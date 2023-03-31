package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p023c4.C1859a;
import p023c4.C1868g;
import p033d5.C4141r;
import p060h4.C4484c1;
import p060h4.C4499e4;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4607w4;
import p060h4.C4609x0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ct2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4541l4 f7925a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4571q4 f7926b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f7927c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4499e4 f7928d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f7929e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList f7930f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList f7931g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public f20 f7932h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4607w4 f7933i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1859a f7934j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1868g f7935k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4609x0 f7936l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f7937m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public f80 f7938n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final os2 f7939o = new os2();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7940p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public nc2 f7941q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f7942r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4484c1 f7943s;

    /* renamed from: F */
    public final os2 mo9324F() {
        return this.f7939o;
    }

    /* renamed from: G */
    public final ct2 mo9325G(et2 et2) {
        this.f7939o.mo13033a(et2.f8944o.f16514a);
        this.f7925a = et2.f8933d;
        this.f7926b = et2.f8934e;
        this.f7943s = et2.f8947r;
        this.f7927c = et2.f8935f;
        this.f7928d = et2.f8930a;
        this.f7930f = et2.f8936g;
        this.f7931g = et2.f8937h;
        this.f7932h = et2.f8938i;
        this.f7933i = et2.f8939j;
        mo9326H(et2.f8941l);
        mo9339d(et2.f8942m);
        this.f7940p = et2.f8945p;
        this.f7941q = et2.f8932c;
        this.f7942r = et2.f8946q;
        return this;
    }

    /* renamed from: H */
    public final ct2 mo9326H(C1859a aVar) {
        this.f7934j = aVar;
        if (aVar != null) {
            this.f7929e = aVar.mo7080I1();
        }
        return this;
    }

    /* renamed from: I */
    public final ct2 mo9327I(C4571q4 q4Var) {
        this.f7926b = q4Var;
        return this;
    }

    /* renamed from: J */
    public final ct2 mo9328J(String str) {
        this.f7927c = str;
        return this;
    }

    /* renamed from: K */
    public final ct2 mo9329K(C4607w4 w4Var) {
        this.f7933i = w4Var;
        return this;
    }

    /* renamed from: L */
    public final ct2 mo9330L(nc2 nc2) {
        this.f7941q = nc2;
        return this;
    }

    /* renamed from: M */
    public final ct2 mo9331M(f80 f80) {
        this.f7938n = f80;
        this.f7928d = new C4499e4(false, true, false);
        return this;
    }

    /* renamed from: N */
    public final ct2 mo9332N(boolean z) {
        this.f7940p = z;
        return this;
    }

    /* renamed from: O */
    public final ct2 mo9333O(boolean z) {
        this.f7942r = true;
        return this;
    }

    /* renamed from: P */
    public final ct2 mo9334P(boolean z) {
        this.f7929e = z;
        return this;
    }

    /* renamed from: Q */
    public final ct2 mo9335Q(int i) {
        this.f7937m = i;
        return this;
    }

    /* renamed from: a */
    public final ct2 mo9336a(f20 f20) {
        this.f7932h = f20;
        return this;
    }

    /* renamed from: b */
    public final ct2 mo9337b(ArrayList arrayList) {
        this.f7930f = arrayList;
        return this;
    }

    /* renamed from: c */
    public final ct2 mo9338c(ArrayList arrayList) {
        this.f7931g = arrayList;
        return this;
    }

    /* renamed from: d */
    public final ct2 mo9339d(C1868g gVar) {
        this.f7935k = gVar;
        if (gVar != null) {
            this.f7929e = gVar.mo7110e();
            this.f7936l = gVar.mo7108I1();
        }
        return this;
    }

    /* renamed from: e */
    public final ct2 mo9340e(C4541l4 l4Var) {
        this.f7925a = l4Var;
        return this;
    }

    /* renamed from: f */
    public final ct2 mo9341f(C4499e4 e4Var) {
        this.f7928d = e4Var;
        return this;
    }

    /* renamed from: g */
    public final et2 mo9342g() {
        C4141r.m28222l(this.f7927c, "ad unit must not be null");
        C4141r.m28222l(this.f7926b, "ad size must not be null");
        C4141r.m28222l(this.f7925a, "ad request must not be null");
        return new et2(this, (dt2) null);
    }

    /* renamed from: i */
    public final String mo9343i() {
        return this.f7927c;
    }

    /* renamed from: o */
    public final boolean mo9344o() {
        return this.f7940p;
    }

    /* renamed from: q */
    public final ct2 mo9345q(C4484c1 c1Var) {
        this.f7943s = c1Var;
        return this;
    }

    /* renamed from: v */
    public final C4541l4 mo9346v() {
        return this.f7925a;
    }

    /* renamed from: x */
    public final C4571q4 mo9347x() {
        return this.f7926b;
    }
}
