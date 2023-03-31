package com.google.android.gms.internal.ads;

import p053g4.C4409t;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u22 implements vg1 {

    /* renamed from: a */
    private boolean f18330a = false;

    /* renamed from: b */
    private boolean f18331b = false;

    /* renamed from: c */
    private final String f18332c;

    /* renamed from: d */
    private final ux2 f18333d;

    /* renamed from: e */
    private final C4800p1 f18334e;

    public u22(String str, ux2 ux2) {
        this.f18332c = str;
        this.f18333d = ux2;
        this.f18334e = C4409t.m29325q().mo15117h();
    }

    /* renamed from: b */
    private final tx2 m21378b(String str) {
        String str2;
        if (this.f18334e.mo18501f0()) {
            str2 = "";
        } else {
            str2 = this.f18332c;
        }
        tx2 b = tx2.m21328b(str);
        b.mo14409a("tms", Long.toString(C4409t.m29310b().mo18371b(), 10));
        b.mo14409a("tid", str2);
        return b;
    }

    /* renamed from: T */
    public final synchronized void mo14297T() {
        if (!this.f18330a) {
            this.f18333d.mo8622a(m21378b("init_started"));
            this.f18330a = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo14298a() {
        if (!this.f18331b) {
            this.f18333d.mo8622a(m21378b("init_finished"));
            this.f18331b = true;
        }
    }

    /* renamed from: f */
    public final void mo14299f(String str) {
        ux2 ux2 = this.f18333d;
        tx2 b = m21378b("aaia");
        b.mo14409a("aair", "MalformedJson");
        ux2.mo8622a(b);
    }

    /* renamed from: k */
    public final void mo14300k(String str, String str2) {
        ux2 ux2 = this.f18333d;
        tx2 b = m21378b("adapter_init_finished");
        b.mo14409a("ancn", str);
        b.mo14409a("rqe", str2);
        ux2.mo8622a(b);
    }

    /* renamed from: x */
    public final void mo14301x(String str) {
        ux2 ux2 = this.f18333d;
        tx2 b = m21378b("adapter_init_started");
        b.mo14409a("ancn", str);
        ux2.mo8622a(b);
    }

    /* renamed from: z */
    public final void mo14302z(String str) {
        ux2 ux2 = this.f18333d;
        tx2 b = m21378b("adapter_init_finished");
        b.mo14409a("ancn", str);
        ux2.mo8622a(b);
    }
}
