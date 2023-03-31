package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4691e;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h21 implements C2894tr {

    /* renamed from: a */
    private vs0 f10153a;

    /* renamed from: b */
    private final Executor f10154b;

    /* renamed from: c */
    private final t11 f10155c;

    /* renamed from: d */
    private final C4691e f10156d;

    /* renamed from: e */
    private boolean f10157e = false;

    /* renamed from: f */
    private boolean f10158f = false;

    /* renamed from: g */
    private final w11 f10159g = new w11();

    public h21(Executor executor, t11 t11, C4691e eVar) {
        this.f10154b = executor;
        this.f10155c = t11;
        this.f10156d = eVar;
    }

    /* renamed from: f */
    private final void m13672f() {
        try {
            JSONObject a = this.f10155c.mo10378c(this.f10159g);
            if (this.f10153a != null) {
                this.f10154b.execute(new g21(this, a));
            }
        } catch (JSONException e) {
            C4794n1.m30694l("Failed to call video active view js", e);
        }
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        boolean z;
        w11 w11 = this.f10159g;
        if (this.f10158f) {
            z = false;
        } else {
            z = srVar.f17627j;
        }
        w11.f19420a = z;
        w11.f19423d = this.f10156d.mo18371b();
        this.f10159g.f19425f = srVar;
        if (this.f10157e) {
            m13672f();
        }
    }

    /* renamed from: a */
    public final void mo10716a() {
        this.f10157e = false;
    }

    /* renamed from: b */
    public final void mo10717b() {
        this.f10157e = true;
        m13672f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo10718c(JSONObject jSONObject) {
        this.f10153a.mo9090t0("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: d */
    public final void mo10719d(boolean z) {
        this.f10158f = z;
    }

    /* renamed from: e */
    public final void mo10720e(vs0 vs0) {
        this.f10153a = vs0;
    }
}
