package com.google.android.gms.internal.ads;

import p033d5.C4141r;
import p073j4.C4757d0;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z90 extends pn0 {

    /* renamed from: c */
    private final Object f21025c = new Object();

    /* renamed from: d */
    private final C4757d0 f21026d;

    /* renamed from: e */
    private boolean f21027e;

    /* renamed from: f */
    private int f21028f;

    public z90(C4757d0 d0Var) {
        this.f21026d = d0Var;
        this.f21027e = false;
        this.f21028f = 0;
    }

    /* renamed from: f */
    public final u90 mo15569f() {
        u90 u90 = new u90(this);
        synchronized (this.f21025c) {
            mo13311e(new v90(this, u90), new w90(this, u90));
            C4141r.m28224n(this.f21028f >= 0);
            this.f21028f++;
        }
        return u90;
    }

    /* renamed from: g */
    public final void mo15570g() {
        synchronized (this.f21025c) {
            C4141r.m28224n(this.f21028f >= 0);
            C4794n1.m30693k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f21027e = true;
            mo15571h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo15571h() {
        synchronized (this.f21025c) {
            C4141r.m28224n(this.f21028f >= 0);
            if (!this.f21027e || this.f21028f != 0) {
                C4794n1.m30693k("There are still references to the engine. Not destroying.");
            } else {
                C4794n1.m30693k("No reference is left (including root). Cleaning up engine.");
                mo13311e(new y90(this), new ln0());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15572i() {
        synchronized (this.f21025c) {
            C4141r.m28224n(this.f21028f > 0);
            C4794n1.m30693k("Releasing 1 reference for JS Engine");
            this.f21028f--;
            mo15571h();
        }
    }
}
