package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C6883b;
import com.google.android.gms.internal.measurement.C6902c1;
import com.google.android.gms.internal.measurement.C6903c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p033d5.C4141r;
import p067i5.C4704r;
import p180z4.C6378j;
import p180z4.C6380k;
import p402y5.C13026e;
import p402y5.C13039q;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7310b5 extends C13026e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7303a9 f32369a;

    /* renamed from: b */
    private Boolean f32370b;

    /* renamed from: c */
    private String f32371c = null;

    public C7310b5(C7303a9 a9Var, String str) {
        C4141r.m28221k(a9Var);
        this.f32369a = a9Var;
    }

    /* renamed from: B0 */
    private final void m41341B0(C7524v vVar, C7446n9 n9Var) {
        this.f32369a.mo24119c();
        this.f32369a.mo24128h(vVar, n9Var);
    }

    /* renamed from: H6 */
    private final void m41342H6(C7446n9 n9Var, boolean z) {
        C4141r.m28221k(n9Var);
        C4141r.m28217g(n9Var.f32787a);
        m41343I6(n9Var.f32787a, false);
        this.f32369a.mo24129h0().mo24375L(n9Var.f32788b, n9Var.f32803y);
    }

    /* renamed from: I6 */
    private final void m41343I6(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f32370b == null) {
                        if (!"com.google.android.gms".equals(this.f32371c) && !C4704r.m30427a(this.f32369a.mo24121d(), Binder.getCallingUid())) {
                            if (!C6380k.m37466a(this.f32369a.mo24121d()).mo21809c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f32370b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f32370b = Boolean.valueOf(z2);
                    }
                    if (this.f32370b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f32369a.mo24135l().mo24256q().mo24209b("Measurement Service called with invalid calling package. appId", C7352f3.m41475z(str));
                    throw e;
                }
            }
            if (this.f32371c == null && C6378j.m37463l(this.f32369a.mo24121d(), Binder.getCallingUid(), str)) {
                this.f32371c = str;
            }
            if (!str.equals(this.f32371c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f32369a.mo24135l().mo24256q().mo24208a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: B1 */
    public final void mo24153B1(C7326d dVar) {
        C4141r.m28221k(dVar);
        C4141r.m28221k(dVar.f32398c);
        C4141r.m28217g(dVar.f32396a);
        m41343I6(dVar.f32396a, true);
        mo24172r6(new C7430m4(this, new C7326d(dVar)));
    }

    /* renamed from: B3 */
    public final void mo24154B3(C7446n9 n9Var) {
        m41342H6(n9Var, false);
        mo24172r6(new C7569z4(this, n9Var));
    }

    /* renamed from: C3 */
    public final List mo24155C3(String str, String str2, C7446n9 n9Var) {
        m41342H6(n9Var, false);
        String str3 = n9Var.f32787a;
        C4141r.m28221k(str3);
        try {
            return (List) this.f32369a.mo24143s().mo24306r(new C7463p4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24209b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: C5 */
    public final void mo24156C5(C7326d dVar, C7446n9 n9Var) {
        C4141r.m28221k(dVar);
        C4141r.m28221k(dVar.f32398c);
        m41342H6(n9Var, false);
        C7326d dVar2 = new C7326d(dVar);
        dVar2.f32396a = n9Var.f32787a;
        mo24172r6(new C7419l4(this, dVar2, n9Var));
    }

    /* renamed from: F4 */
    public final void mo24157F4(C7446n9 n9Var) {
        C4141r.m28217g(n9Var.f32787a);
        C4141r.m28221k(n9Var.f32784D);
        C7507t4 t4Var = new C7507t4(this, n9Var);
        C4141r.m28221k(t4Var);
        if (this.f32369a.mo24143s().mo24304C()) {
            t4Var.run();
        } else {
            this.f32369a.mo24143s().mo24303A(t4Var);
        }
    }

    /* renamed from: I1 */
    public final List mo24158I1(C7446n9 n9Var, boolean z) {
        m41342H6(n9Var, false);
        String str = n9Var.f32787a;
        C4141r.m28221k(str);
        try {
            List<C7358f9> list = (List) this.f32369a.mo24143s().mo24306r(new C7559y4(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7358f9 f9Var : list) {
                if (z || !C7391i9.m41591W(f9Var.f32491c)) {
                    arrayList.add(new C7336d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24210c("Failed to get user properties. appId", C7352f3.m41475z(n9Var.f32787a), e);
            return null;
        }
    }

    /* renamed from: L1 */
    public final byte[] mo24159L1(C7524v vVar, String str) {
        C4141r.m28217g(str);
        C4141r.m28221k(vVar);
        m41343I6(str, true);
        this.f32369a.mo24135l().mo24255p().mo24209b("Log and bundle. event", this.f32369a.mo24113X().mo24095d(vVar.f33101a));
        long c = this.f32369a.mo24116a().mo18372c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f32369a.mo24143s().mo24307t(new C7539w4(this, vVar, str)).get();
            if (bArr == null) {
                this.f32369a.mo24135l().mo24256q().mo24209b("Log and bundle returned null. appId", C7352f3.m41475z(str));
                bArr = new byte[0];
            }
            this.f32369a.mo24135l().mo24255p().mo24211d("Log and bundle processed. event, size, time_ms", this.f32369a.mo24113X().mo24095d(vVar.f33101a), Integer.valueOf(bArr.length), Long.valueOf((this.f32369a.mo24116a().mo18372c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24211d("Failed to log and bundle. appId, event, error", C7352f3.m41475z(str), this.f32369a.mo24113X().mo24095d(vVar.f33101a), e);
            return null;
        }
    }

    /* renamed from: M4 */
    public final List mo24160M4(String str, String str2, boolean z, C7446n9 n9Var) {
        m41342H6(n9Var, false);
        String str3 = n9Var.f32787a;
        C4141r.m28221k(str3);
        try {
            List<C7358f9> list = (List) this.f32369a.mo24143s().mo24306r(new C7441n4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7358f9 f9Var : list) {
                if (z || !C7391i9.m41591W(f9Var.f32491c)) {
                    arrayList.add(new C7336d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24210c("Failed to query user properties. appId", C7352f3.m41475z(n9Var.f32787a), e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public final C7524v mo24161P0(C7524v vVar, C7446n9 n9Var) {
        C7502t tVar;
        if (!(!"_cmp".equals(vVar.f33101a) || (tVar = vVar.f33102b) == null || tVar.mo24660I1() == 0)) {
            String O1 = vVar.f33102b.mo24665O1("_cis");
            if ("referrer broadcast".equals(O1) || "referrer API".equals(O1)) {
                this.f32369a.mo24135l().mo24259u().mo24209b("Event has been filtered ", vVar.toString());
                return new C7524v("_cmpx", vVar.f33102b, vVar.f33103c, vVar.f33104d);
            }
        }
        return vVar;
    }

    /* renamed from: T3 */
    public final void mo24162T3(long j, String str, String str2, String str3) {
        mo24172r6(new C7299a5(this, str2, str3, str, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T5 */
    public final /* synthetic */ void mo24163T5(String str, Bundle bundle) {
        C7414l W = this.f32369a.mo24112W();
        W.mo24189f();
        W.mo24623g();
        byte[] h = W.f32873b.mo24127g0().mo24194B(new C7469q(W.f32389a, "", str, "dep", 0, 0, bundle)).mo23736h();
        W.f32389a.mo24135l().mo24260v().mo24210c("Saving default event parameters, appId, data size", W.f32389a.mo24414D().mo24095d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h);
        try {
            if (W.mo24472P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f32389a.mo24135l().mo24256q().mo24209b("Failed to insert default event parameters (got -1). appId", C7352f3.m41475z(str));
            }
        } catch (SQLiteException e) {
            W.f32389a.mo24135l().mo24256q().mo24210c("Error storing default event parameters. appId", C7352f3.m41475z(str), e);
        }
    }

    /* renamed from: W1 */
    public final String mo24164W1(C7446n9 n9Var) {
        m41342H6(n9Var, false);
        return this.f32369a.mo24133j0(n9Var);
    }

    /* renamed from: Z3 */
    public final void mo24165Z3(C7524v vVar, String str, String str2) {
        C4141r.m28221k(vVar);
        C4141r.m28217g(str);
        m41343I6(str, true);
        mo24172r6(new C7529v4(this, vVar, str));
    }

    /* renamed from: e4 */
    public final void mo24166e4(C7336d9 d9Var, C7446n9 n9Var) {
        C4141r.m28221k(d9Var);
        m41342H6(n9Var, false);
        mo24172r6(new C7549x4(this, d9Var, n9Var));
    }

    /* renamed from: g1 */
    public final void mo24167g1(C7446n9 n9Var) {
        m41342H6(n9Var, false);
        mo24172r6(new C7496s4(this, n9Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i5 */
    public final void mo24168i5(C7524v vVar, C7446n9 n9Var) {
        C6902c1 c1Var;
        if (!this.f32369a.mo24117a0().mo24214C(n9Var.f32787a)) {
            m41341B0(vVar, n9Var);
            return;
        }
        this.f32369a.mo24135l().mo24260v().mo24209b("EES config found for", n9Var.f32787a);
        C7331d4 a0 = this.f32369a.mo24117a0();
        String str = n9Var.f32787a;
        if (TextUtils.isEmpty(str)) {
            c1Var = null;
        } else {
            c1Var = (C6902c1) a0.f32420j.mo19586c(str);
        }
        if (c1Var != null) {
            try {
                Map I = this.f32369a.mo24127g0().mo24199I(vVar.f33102b.mo24661K1(), true);
                String a = C13039q.m61354a(vVar.f33101a);
                if (a == null) {
                    a = vVar.f33101a;
                }
                if (c1Var.mo23144e(new C6883b(a, vVar.f33104d, I))) {
                    if (c1Var.mo23146g()) {
                        this.f32369a.mo24135l().mo24260v().mo24209b("EES edited event", vVar.f33101a);
                        m41341B0(this.f32369a.mo24127g0().mo24193A(c1Var.mo23140a().mo23133b()), n9Var);
                    } else {
                        m41341B0(vVar, n9Var);
                    }
                    if (c1Var.mo23145f()) {
                        for (C6883b bVar : c1Var.mo23140a().mo23134c()) {
                            this.f32369a.mo24135l().mo24260v().mo24209b("EES logging created event", bVar.mo23028d());
                            m41341B0(this.f32369a.mo24127g0().mo24193A(bVar), n9Var);
                        }
                        return;
                    }
                    return;
                }
            } catch (C6903c2 unused) {
                this.f32369a.mo24135l().mo24256q().mo24210c("EES error. appId, eventName", n9Var.f32788b, vVar.f33101a);
            }
            this.f32369a.mo24135l().mo24260v().mo24209b("EES was not applied to event", vVar.f33101a);
            m41341B0(vVar, n9Var);
            return;
        }
        this.f32369a.mo24135l().mo24260v().mo24209b("EES not loaded for", n9Var.f32787a);
        m41341B0(vVar, n9Var);
    }

    /* renamed from: j5 */
    public final void mo24169j5(C7446n9 n9Var) {
        C4141r.m28217g(n9Var.f32787a);
        m41343I6(n9Var.f32787a, false);
        mo24172r6(new C7485r4(this, n9Var));
    }

    /* renamed from: m2 */
    public final List mo24170m2(String str, String str2, String str3) {
        m41343I6(str, true);
        try {
            return (List) this.f32369a.mo24143s().mo24306r(new C7474q4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24209b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: q3 */
    public final void mo24171q3(C7524v vVar, C7446n9 n9Var) {
        C4141r.m28221k(vVar);
        m41342H6(n9Var, false);
        mo24172r6(new C7518u4(this, vVar, n9Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r6 */
    public final void mo24172r6(Runnable runnable) {
        C4141r.m28221k(runnable);
        if (this.f32369a.mo24143s().mo24304C()) {
            runnable.run();
        } else {
            this.f32369a.mo24143s().mo24309z(runnable);
        }
    }

    /* renamed from: s1 */
    public final void mo24173s1(Bundle bundle, C7446n9 n9Var) {
        m41342H6(n9Var, false);
        String str = n9Var.f32787a;
        C4141r.m28221k(str);
        mo24172r6(new C7408k4(this, str, bundle));
    }

    /* renamed from: x1 */
    public final List mo24174x1(String str, String str2, String str3, boolean z) {
        m41343I6(str, true);
        try {
            List<C7358f9> list = (List) this.f32369a.mo24143s().mo24306r(new C7452o4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7358f9 f9Var : list) {
                if (z || !C7391i9.m41591W(f9Var.f32491c)) {
                    arrayList.add(new C7336d9(f9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f32369a.mo24135l().mo24256q().mo24210c("Failed to get user properties as. appId", C7352f3.m41475z(str), e);
            return Collections.emptyList();
        }
    }
}
