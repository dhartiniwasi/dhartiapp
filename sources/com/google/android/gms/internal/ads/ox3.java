package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ox3 implements x74, y74 {

    /* renamed from: a */
    private final int f15408a;

    /* renamed from: b */
    private final c74 f15409b = new c74();

    /* renamed from: c */
    private z74 f15410c;

    /* renamed from: d */
    private int f15411d;

    /* renamed from: e */
    private bb4 f15412e;

    /* renamed from: f */
    private int f15413f;

    /* renamed from: g */
    private ci4 f15414g;

    /* renamed from: h */
    private C2388g4[] f15415h;

    /* renamed from: i */
    private long f15416i;

    /* renamed from: r */
    private long f15417r = Long.MIN_VALUE;

    /* renamed from: s */
    private boolean f15418s;

    /* renamed from: t */
    private boolean f15419t;

    public ox3(int i) {
        this.f15408a = i;
    }

    /* renamed from: s */
    private final void m18159s(long j, boolean z) throws u44 {
        this.f15418s = false;
        this.f15417r = j;
        mo9133E(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final bb4 mo13064A() {
        bb4 bb4 = this.f15412e;
        Objects.requireNonNull(bb4);
        return bb4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo9131B();

    /* renamed from: C */
    public final void mo13065C() {
        this.f15418s = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo9132D(boolean z, boolean z2) throws u44 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo9133E(long j, boolean z) throws u44;

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo9134F() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo9135G() throws u44 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo9136H() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo12629I(C2388g4[] g4VarArr, long j, long j2) throws u44;

    /* renamed from: T */
    public final long mo13066T() {
        return this.f15417r;
    }

    /* renamed from: V */
    public e74 mo9146V() {
        return null;
    }

    /* renamed from: W */
    public final y74 mo13067W() {
        return this;
    }

    /* renamed from: a */
    public int mo13068a() throws u44 {
        return 0;
    }

    /* renamed from: a0 */
    public final void mo13069a0() {
        boolean z = true;
        if (this.f15413f != 1) {
            z = false;
        }
        v91.m22052f(z);
        c74 c74 = this.f15409b;
        c74.f7639b = null;
        c74.f7638a = null;
        this.f15413f = 0;
        this.f15414g = null;
        this.f15415h = null;
        this.f15418s = false;
        mo9131B();
    }

    /* renamed from: b */
    public final void mo13070b(long j) throws u44 {
        m18159s(j, false);
    }

    /* renamed from: c0 */
    public final ci4 mo13071c0() {
        return this.f15414g;
    }

    /* renamed from: d */
    public final int mo13072d() {
        return this.f15408a;
    }

    /* renamed from: e0 */
    public final void mo13073e0() throws IOException {
        ci4 ci4 = this.f15414g;
        Objects.requireNonNull(ci4);
        ci4.mo9178b();
    }

    /* renamed from: f */
    public /* synthetic */ void mo12378f(float f, float f2) {
    }

    /* renamed from: g */
    public final void mo13074g(C2388g4[] g4VarArr, ci4 ci4, long j, long j2) throws u44 {
        v91.m22052f(!this.f15418s);
        this.f15414g = ci4;
        if (this.f15417r == Long.MIN_VALUE) {
            this.f15417r = j;
        }
        this.f15415h = g4VarArr;
        this.f15416i = j2;
        mo12629I(g4VarArr, j, j2);
    }

    /* renamed from: h */
    public final void mo13075h(int i, bb4 bb4) {
        this.f15411d = i;
        this.f15412e = bb4;
    }

    /* renamed from: h0 */
    public final void mo13076h0() {
        v91.m22052f(this.f15413f == 0);
        c74 c74 = this.f15409b;
        c74.f7639b = null;
        c74.f7638a = null;
        mo9134F();
    }

    /* renamed from: i */
    public final void mo13077i(z74 z74, C2388g4[] g4VarArr, ci4 ci4, long j, boolean z, boolean z2, long j2, long j3) throws u44 {
        boolean z3 = z;
        v91.m22052f(this.f15413f == 0);
        this.f15410c = z74;
        this.f15413f = 1;
        mo9132D(z, z2);
        mo13074g(g4VarArr, ci4, j2, j3);
        long j4 = j;
        m18159s(j, z);
    }

    /* renamed from: i0 */
    public final void mo13078i0() {
        v91.m22052f(this.f15413f == 2);
        this.f15413f = 1;
        mo9136H();
    }

    /* renamed from: k */
    public void mo9150k(int i, Object obj) throws u44 {
    }

    /* renamed from: k0 */
    public final void mo13079k0() throws u44 {
        boolean z = true;
        if (this.f15413f != 1) {
            z = false;
        }
        v91.m22052f(z);
        this.f15413f = 2;
        mo9135G();
    }

    /* renamed from: n */
    public final int mo13080n() {
        return this.f15413f;
    }

    /* renamed from: o */
    public final boolean mo13081o() {
        return this.f15417r == Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo13082p() {
        if (mo13081o()) {
            return this.f15418s;
        }
        ci4 ci4 = this.f15414g;
        Objects.requireNonNull(ci4);
        return ci4.mo9177a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C2388g4[] mo13083q() {
        C2388g4[] g4VarArr = this.f15415h;
        Objects.requireNonNull(g4VarArr);
        return g4VarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo13084t(c74 c74, fo3 fo3, int i) {
        ci4 ci4 = this.f15414g;
        Objects.requireNonNull(ci4);
        int d = ci4.mo9180d(c74, fo3, i);
        if (d == -4) {
            if (fo3.mo15598g()) {
                this.f15417r = Long.MIN_VALUE;
                return this.f15418s ? -4 : -3;
            }
            long j = fo3.f9375e + this.f15416i;
            fo3.f9375e = j;
            this.f15417r = Math.max(this.f15417r, j);
        } else if (d == -5) {
            C2388g4 g4Var = c74.f7638a;
            Objects.requireNonNull(g4Var);
            long j2 = g4Var.f9677p;
            if (j2 != Long.MAX_VALUE) {
                C2311e2 b = g4Var.mo10384b();
                b.mo9780w(j2 + this.f15416i);
                c74.f7638a = b.mo9782y();
                return -5;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final u44 mo13085u(Throwable th, C2388g4 g4Var, boolean z, int i) {
        int i2;
        if (g4Var != null && !this.f15419t) {
            this.f15419t = true;
            try {
                int j = mo12631j(g4Var) & 7;
                this.f15419t = false;
                i2 = j;
            } catch (u44 unused) {
                this.f15419t = false;
            } catch (Throwable th2) {
                this.f15419t = false;
                throw th2;
            }
            return u44.m21409b(th, mo9158r(), this.f15411d, g4Var, i2, z, i);
        }
        i2 = 4;
        return u44.m21409b(th, mo9158r(), this.f15411d, g4Var, i2, z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo13086v(long j) {
        ci4 ci4 = this.f15414g;
        Objects.requireNonNull(ci4);
        return ci4.mo9179c(j - this.f15416i);
    }

    /* renamed from: w */
    public final boolean mo13087w() {
        return this.f15418s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final c74 mo13088x() {
        c74 c74 = this.f15409b;
        c74.f7639b = null;
        c74.f7638a = null;
        return c74;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final z74 mo13089z() {
        z74 z74 = this.f15410c;
        Objects.requireNonNull(z74);
        return z74;
    }
}
