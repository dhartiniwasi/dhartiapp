package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zl */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3110zl implements C2962vl {

    /* renamed from: a */
    private final C2633mq f21139a;

    /* renamed from: b */
    private final int f21140b;

    /* renamed from: c */
    private final int f21141c;

    /* renamed from: d */
    private int f21142d;

    /* renamed from: e */
    private int f21143e;

    public C3110zl(C2851sl slVar) {
        C2633mq mqVar = slVar.f17521P0;
        this.f21139a = mqVar;
        mqVar.mo12411v(12);
        this.f21141c = mqVar.mo12398i() & 255;
        this.f21140b = mqVar.mo12398i();
    }

    /* renamed from: d */
    public final int mo14782d() {
        int i = this.f21141c;
        if (i == 8) {
            return this.f21139a.mo12396g();
        }
        if (i == 16) {
            return this.f21139a.mo12399j();
        }
        int i2 = this.f21142d;
        this.f21142d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f21143e & 15;
        }
        int g = this.f21139a.mo12396g();
        this.f21143e = g;
        return (g & 240) >> 4;
    }

    /* renamed from: e */
    public final boolean mo14783e() {
        return false;
    }

    public final int zza() {
        return this.f21140b;
    }
}
