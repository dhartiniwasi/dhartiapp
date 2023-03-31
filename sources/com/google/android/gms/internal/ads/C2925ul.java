package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ul */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2925ul {

    /* renamed from: a */
    public final int f18595a;

    /* renamed from: b */
    public int f18596b;

    /* renamed from: c */
    public int f18597c;

    /* renamed from: d */
    public long f18598d;

    /* renamed from: e */
    private final boolean f18599e;

    /* renamed from: f */
    private final C2633mq f18600f;

    /* renamed from: g */
    private final C2633mq f18601g;

    /* renamed from: h */
    private int f18602h;

    /* renamed from: i */
    private int f18603i;

    public C2925ul(C2633mq mqVar, C2633mq mqVar2, boolean z) {
        this.f18601g = mqVar;
        this.f18600f = mqVar2;
        this.f18599e = z;
        mqVar2.mo12411v(12);
        this.f18595a = mqVar2.mo12398i();
        mqVar.mo12411v(12);
        this.f18603i = mqVar.mo12398i();
        C2335eq.m12246f(mqVar.mo12394e() != 1 ? false : true, "first_chunk must be 1");
        this.f18596b = -1;
    }

    /* renamed from: a */
    public final boolean mo14530a() {
        long j;
        int i = this.f18596b + 1;
        this.f18596b = i;
        if (i == this.f18595a) {
            return false;
        }
        if (this.f18599e) {
            j = this.f18600f.mo12403n();
        } else {
            j = this.f18600f.mo12402m();
        }
        this.f18598d = j;
        if (this.f18596b == this.f18602h) {
            this.f18597c = this.f18601g.mo12398i();
            this.f18601g.mo12412w(4);
            int i2 = -1;
            int i3 = this.f18603i - 1;
            this.f18603i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f18601g.mo12398i();
            }
            this.f18602h = i2;
        }
        return true;
    }
}
