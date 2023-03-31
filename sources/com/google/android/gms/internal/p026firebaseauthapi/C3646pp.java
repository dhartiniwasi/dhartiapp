package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C7840p1;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3646pp implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3976zt f22514a;

    /* renamed from: b */
    final /* synthetic */ String f22515b;

    /* renamed from: c */
    final /* synthetic */ String f22516c;

    /* renamed from: d */
    final /* synthetic */ Boolean f22517d;

    /* renamed from: e */
    final /* synthetic */ C7840p1 f22518e;

    /* renamed from: f */
    final /* synthetic */ C3781ts f22519f;

    /* renamed from: g */
    final /* synthetic */ C3784tv f22520g;

    C3646pp(C3186br brVar, C3976zt ztVar, String str, String str2, Boolean bool, C7840p1 p1Var, C3781ts tsVar, C3784tv tvVar) {
        this.f22514a = ztVar;
        this.f22515b = str;
        this.f22516c = str2;
        this.f22517d = bool;
        this.f22518e = p1Var;
        this.f22519f = tsVar;
        this.f22520g = tvVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        List I1 = ((C3487kv) obj).mo16271I1();
        if (I1 == null || I1.isEmpty()) {
            this.f22514a.mo15755f("No users.");
            return;
        }
        int i = 0;
        C3553mv mvVar = (C3553mv) I1.get(0);
        C3389i S1 = mvVar.mo16415S1();
        List K1 = S1 != null ? S1.mo16115K1() : null;
        if (K1 != null && !K1.isEmpty()) {
            if (!TextUtils.isEmpty(this.f22515b)) {
                while (true) {
                    if (i >= K1.size()) {
                        break;
                    } else if (((C3323g) K1.get(i)).mo16045N1().equals(this.f22515b)) {
                        ((C3323g) K1.get(i)).mo16047P1(this.f22516c);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                ((C3323g) K1.get(0)).mo16047P1(this.f22516c);
            }
        }
        mvVar.mo16411O1(this.f22517d.booleanValue());
        mvVar.mo16408L1(this.f22518e);
        this.f22519f.mo16828i(this.f22520g, mvVar);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22514a.mo15755f(str);
    }
}
