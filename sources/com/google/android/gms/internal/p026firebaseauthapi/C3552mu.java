package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.common.api.Status;
import p007a5.C0105b;
import p054g5.C4410a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3552mu extends C3781ts {

    /* renamed from: c */
    private final String f22384c;

    /* renamed from: d */
    final /* synthetic */ C3651pu f22385d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3552mu(C3651pu puVar, C3781ts tsVar, String str) {
        super(tsVar);
        this.f22385d = puVar;
        this.f22384c = str;
    }

    /* renamed from: b */
    public final void mo16403b(String str) {
        C3651pu.f22526d.mo17928a("onCodeSent", new Object[0]);
        C3618ou ouVar = (C3618ou) this.f22385d.f22529c.get(this.f22384c);
        if (ouVar != null) {
            for (C3781ts b : ouVar.f22483b) {
                b.mo16403b(str);
            }
            ouVar.f22488g = true;
            ouVar.f22485d = str;
            if (ouVar.f22482a <= 0) {
                this.f22385d.mo16566h(this.f22384c);
            } else if (!ouVar.f22484c) {
                this.f22385d.m26514n(this.f22384c);
            } else if (!C3296f5.m25552d(ouVar.f22486e)) {
                C3651pu.m26510e(this.f22385d, this.f22384c);
            }
        }
    }

    /* renamed from: h */
    public final void mo16404h(Status status) {
        C4410a a = C3651pu.f22526d;
        String a2 = C0105b.m587a(status.mo7950J1());
        String K1 = status.mo7951K1();
        a.mo17930c("SMS verification code request failed: " + a2 + " " + K1, new Object[0]);
        C3618ou ouVar = (C3618ou) this.f22385d.f22529c.get(this.f22384c);
        if (ouVar != null) {
            for (C3781ts h : ouVar.f22483b) {
                h.mo16404h(status);
            }
            this.f22385d.mo16568j(this.f22384c);
        }
    }
}
