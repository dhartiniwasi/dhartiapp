package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p033d5.C4141r;
import p067i5.C4689c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.op */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3613op implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3653q f22470a;

    /* renamed from: b */
    final /* synthetic */ C3553mv f22471b;

    /* renamed from: c */
    final /* synthetic */ C3781ts f22472c;

    /* renamed from: d */
    final /* synthetic */ C3784tv f22473d;

    /* renamed from: e */
    final /* synthetic */ C3976zt f22474e;

    /* renamed from: f */
    final /* synthetic */ C3186br f22475f;

    C3613op(C3186br brVar, C3653q qVar, C3553mv mvVar, C3781ts tsVar, C3784tv tvVar, C3976zt ztVar) {
        this.f22475f = brVar;
        this.f22470a = qVar;
        this.f22471b = mvVar;
        this.f22472c = tsVar;
        this.f22473d = tvVar;
        this.f22474e = ztVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3686r rVar = (C3686r) obj;
        if (this.f22470a.mo16585m("EMAIL")) {
            this.f22471b.mo16410N1((String) null);
        } else {
            C3653q qVar = this.f22470a;
            if (qVar.mo16582j() != null) {
                this.f22471b.mo16410N1(qVar.mo16582j());
            }
        }
        if (this.f22470a.mo16585m("DISPLAY_NAME")) {
            this.f22471b.mo16409M1((String) null);
        } else {
            C3653q qVar2 = this.f22470a;
            if (qVar2.mo16581i() != null) {
                this.f22471b.mo16409M1(qVar2.mo16581i());
            }
        }
        if (this.f22470a.mo16585m("PHOTO_URL")) {
            this.f22471b.mo16413Q1((String) null);
        } else {
            C3653q qVar3 = this.f22470a;
            if (qVar3.mo16584l() != null) {
                this.f22471b.mo16413Q1(qVar3.mo16584l());
            }
        }
        if (!TextUtils.isEmpty(this.f22470a.mo16583k())) {
            this.f22471b.mo16412P1(C4689c.m30371c("redacted".getBytes()));
        }
        List e = rVar.mo16662e();
        if (e == null) {
            e = new ArrayList();
        }
        this.f22471b.mo16414R1(e);
        C3781ts tsVar = this.f22472c;
        C3784tv tvVar = this.f22473d;
        C4141r.m28221k(tvVar);
        C4141r.m28221k(rVar);
        String c = rVar.mo16660c();
        String d = rVar.mo16661d();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d)) {
            tvVar = new C3784tv(d, c, Long.valueOf(rVar.mo16658a()), tvVar.mo16836L1());
        }
        tsVar.mo16828i(tvVar, this.f22471b);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22474e.mo15755f(str);
    }
}
