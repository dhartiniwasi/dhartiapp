package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jl4 {

    /* renamed from: a */
    private il4 f11694a = new il4();

    /* renamed from: b */
    private il4 f11695b = new il4();

    /* renamed from: c */
    private boolean f11696c;

    /* renamed from: d */
    private long f11697d = -9223372036854775807L;

    /* renamed from: e */
    private int f11698e;

    /* renamed from: a */
    public final float mo11431a() {
        if (this.f11694a.mo11156f()) {
            return (float) (1.0E9d / ((double) this.f11694a.mo11151a()));
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int mo11432b() {
        return this.f11698e;
    }

    /* renamed from: c */
    public final long mo11433c() {
        if (this.f11694a.mo11156f()) {
            return this.f11694a.mo11151a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long mo11434d() {
        if (this.f11694a.mo11156f()) {
            return this.f11694a.mo11152b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void mo11435e(long j) {
        this.f11694a.mo11153c(j);
        int i = 0;
        if (this.f11694a.mo11156f()) {
            this.f11696c = false;
        } else if (this.f11697d != -9223372036854775807L) {
            if (!this.f11696c || this.f11695b.mo11155e()) {
                this.f11695b.mo11154d();
                this.f11695b.mo11153c(this.f11697d);
            }
            this.f11696c = true;
            this.f11695b.mo11153c(j);
        }
        if (this.f11696c && this.f11695b.mo11156f()) {
            il4 il4 = this.f11694a;
            this.f11694a = this.f11695b;
            this.f11695b = il4;
            this.f11696c = false;
        }
        this.f11697d = j;
        if (!this.f11694a.mo11156f()) {
            i = this.f11698e + 1;
        }
        this.f11698e = i;
    }

    /* renamed from: f */
    public final void mo11436f() {
        this.f11694a.mo11154d();
        this.f11695b.mo11154d();
        this.f11696c = false;
        this.f11697d = -9223372036854775807L;
        this.f11698e = 0;
    }

    /* renamed from: g */
    public final boolean mo11437g() {
        return this.f11694a.mo11156f();
    }
}
