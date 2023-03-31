package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kp1 {

    /* renamed from: a */
    public final Object f12207a;

    /* renamed from: b */
    private gm4 f12208b = new gm4();

    /* renamed from: c */
    private boolean f12209c;

    /* renamed from: d */
    private boolean f12210d;

    public kp1(Object obj) {
        this.f12207a = obj;
    }

    /* renamed from: a */
    public final void mo11751a(int i, in1 in1) {
        if (!this.f12210d) {
            if (i != -1) {
                this.f12208b.mo10579a(i);
            }
            this.f12209c = true;
            in1.mo8224b(this.f12207a);
        }
    }

    /* renamed from: b */
    public final void mo11752b(jo1 jo1) {
        if (!this.f12210d && this.f12209c) {
            C2197b b = this.f12208b.mo10580b();
            this.f12208b = new gm4();
            this.f12209c = false;
            jo1.mo11345a(this.f12207a, b);
        }
    }

    /* renamed from: c */
    public final void mo11753c(jo1 jo1) {
        this.f12210d = true;
        if (this.f12209c) {
            jo1.mo11345a(this.f12207a, this.f12208b.mo10580b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kp1.class != obj.getClass()) {
            return false;
        }
        return this.f12207a.equals(((kp1) obj).f12207a);
    }

    public final int hashCode() {
        return this.f12207a.hashCode();
    }
}
