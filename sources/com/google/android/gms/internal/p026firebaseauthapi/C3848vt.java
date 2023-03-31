package com.google.android.gms.internal.p026firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7837p0;
import com.google.firebase.auth.C7869z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p033d5.C4141r;
import p246h7.C10412f;
import p293m7.C11852r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3848vt implements C3912xt {

    /* renamed from: a */
    protected final int f22821a;

    /* renamed from: b */
    final C3716rt f22822b = new C3716rt(this);

    /* renamed from: c */
    protected C10412f f22823c;

    /* renamed from: d */
    protected C7869z f22824d;

    /* renamed from: e */
    protected Object f22825e;

    /* renamed from: f */
    protected C11852r f22826f;

    /* renamed from: g */
    protected final List f22827g = new ArrayList();

    /* renamed from: h */
    protected Executor f22828h;

    /* renamed from: i */
    protected C3784tv f22829i;

    /* renamed from: j */
    protected C3553mv f22830j;

    /* renamed from: k */
    protected C3945yu f22831k;

    /* renamed from: l */
    protected C3488l f22832l;

    /* renamed from: m */
    protected String f22833m;

    /* renamed from: n */
    protected String f22834n;

    /* renamed from: o */
    protected C7806h f22835o;

    /* renamed from: p */
    protected String f22836p;

    /* renamed from: q */
    protected String f22837q;

    /* renamed from: r */
    protected C3382hp f22838r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f22839s;

    /* renamed from: t */
    Object f22840t;

    /* renamed from: u */
    Status f22841u;

    /* renamed from: v */
    protected C3815ut f22842v;

    public C3848vt(int i) {
        this.f22821a = i;
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m27252i(C3848vt vtVar) {
        vtVar.mo15757b();
        C4141r.m28225o(vtVar.f22839s, "no success or failure set on method implementation");
    }

    /* renamed from: j */
    static /* bridge */ /* synthetic */ void m27253j(C3848vt vtVar, Status status) {
        C11852r rVar = vtVar.f22826f;
        if (rVar != null) {
            rVar.mo26091b(status);
        }
    }

    /* renamed from: b */
    public abstract void mo15757b();

    /* renamed from: c */
    public final C3848vt mo16964c(Object obj) {
        this.f22825e = C4141r.m28222l(obj, "external callback cannot be null");
        return this;
    }

    /* renamed from: d */
    public final C3848vt mo16965d(C11852r rVar) {
        this.f22826f = (C11852r) C4141r.m28222l(rVar, "external failure callback cannot be null");
        return this;
    }

    /* renamed from: e */
    public final C3848vt mo16966e(C10412f fVar) {
        this.f22823c = (C10412f) C4141r.m28222l(fVar, "firebaseApp cannot be null");
        return this;
    }

    /* renamed from: f */
    public final C3848vt mo16967f(C7869z zVar) {
        this.f22824d = (C7869z) C4141r.m28222l(zVar, "firebaseUser cannot be null");
        return this;
    }

    /* renamed from: g */
    public final C3848vt mo16968g(C7837p0.C7839b bVar, Activity activity, Executor executor, String str) {
        C7837p0.C7839b a = C3453ju.m25949a(str, bVar, this);
        synchronized (this.f22827g) {
            this.f22827g.add((C7837p0.C7839b) C4141r.m28221k(a));
        }
        if (activity != null) {
            C3518lt.m26133l(activity, this.f22827g);
        }
        this.f22828h = (Executor) C4141r.m28221k(executor);
        return this;
    }

    /* renamed from: k */
    public final void mo16969k(Status status) {
        this.f22839s = true;
        this.f22841u = status;
        this.f22842v.mo16918a((Object) null, status);
    }

    /* renamed from: l */
    public final void mo16970l(Object obj) {
        this.f22839s = true;
        this.f22840t = obj;
        this.f22842v.mo16918a(obj, (Status) null);
    }
}
