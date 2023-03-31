package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4401l;
import p053g4.C4409t;
import p060h4.C4584t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c90 implements u80, s80 {

    /* renamed from: a */
    private final vs0 f7648a;

    public c90(Context context, vm0 vm0, C2955ve veVar, C4390a aVar) throws ht0 {
        C4409t.m29308B();
        vs0 a = it0.m14546a(context, mu0.m16708a(), "", false, false, (C2955ve) null, (n00) null, vm0, (c00) null, (C4401l) null, (C4390a) null, C2971vu.m22435a(), (is2) null, (ls2) null);
        this.f7648a = a;
        ((View) a).setWillNotDraw(true);
    }

    /* renamed from: G */
    private static final void m10777G(Runnable runnable) {
        C4584t.m30036b();
        if (im0.m14415v()) {
            runnable.run();
        } else {
            C4751b2.f25403i.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo9078B(String str) {
        this.f7648a.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: M */
    public final void mo9079M(String str) {
        m10777G(new z80(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: O */
    public final void mo9080O(String str) {
        m10777G(new a90(this, str));
    }

    /* renamed from: R */
    public final /* synthetic */ void mo9081R(String str, Map map) {
        r80.m19605a(this, str, map);
    }

    /* renamed from: V */
    public final boolean mo9082V() {
        return this.f7648a.mo12132q1();
    }

    /* renamed from: W */
    public final ca0 mo9083W() {
        return new ca0(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9084a(String str, JSONObject jSONObject) {
        r80.m19606b(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9085b(String str) {
        this.f7648a.mo9087f(str);
    }

    /* renamed from: d */
    public final void mo8703d(String str, e60 e60) {
        this.f7648a.mo12127o1(str, new w80(e60));
    }

    /* renamed from: e */
    public final void mo9086e() {
        this.f7648a.destroy();
    }

    /* renamed from: f */
    public final void mo9087f(String str) {
        m10777G(new x80(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo9088h(String str) {
        this.f7648a.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: k */
    public final /* synthetic */ void mo9089k(String str, String str2) {
        r80.m19607c(this, str, str2);
    }

    /* renamed from: t0 */
    public final /* synthetic */ void mo9090t0(String str, JSONObject jSONObject) {
        r80.m19608d(this, str, jSONObject);
    }

    /* renamed from: u0 */
    public final void mo9091u0(j90 j90) {
        this.f7648a.mo12108f0().mo9290P(new v80(j90, (byte[]) null));
    }

    /* renamed from: v */
    public final void mo9092v(String str) {
        m10777G(new y80(this, str));
    }

    /* renamed from: x */
    public final void mo8704x(String str, e60 e60) {
        this.f7648a.mo12105d1(str, new b90(this, e60));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo9093z(String str) {
        this.f7648a.loadUrl(str);
    }
}
