package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p053g4.C4409t;
import p060h4.C4541l4;
import p060h4.C4596v;
import p067i5.C4691e;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cm0 implements C2672ns {

    /* renamed from: a */
    private final Object f7827a = new Object();

    /* renamed from: b */
    private final C4800p1 f7828b;

    /* renamed from: c */
    private final am0 f7829c;

    /* renamed from: d */
    final yl0 f7830d;

    /* renamed from: e */
    final HashSet f7831e = new HashSet();

    /* renamed from: f */
    final HashSet f7832f = new HashSet();

    /* renamed from: g */
    private boolean f7833g = false;

    public cm0(String str, C4800p1 p1Var) {
        this.f7830d = new yl0(str, p1Var);
        this.f7828b = p1Var;
        this.f7829c = new am0();
    }

    /* renamed from: a */
    public final ql0 mo9212a(C4691e eVar, String str) {
        return new ql0(eVar, this, this.f7829c.mo8433a(), str);
    }

    /* renamed from: b */
    public final void mo9213b(boolean z) {
        long a = C4409t.m29310b().mo18370a();
        if (z) {
            if (a - this.f7828b.mo18493b() > ((Long) C4596v.m30088c().mo12227b(C2679nz.f14373N0)).longValue()) {
                this.f7830d.f20672d = -1;
            } else {
                this.f7830d.f20672d = this.f7828b.mo18499e();
            }
            this.f7833g = true;
            return;
        }
        this.f7828b.mo18513r(a);
        this.f7828b.mo18515t(this.f7830d.f20672d);
    }

    /* renamed from: c */
    public final void mo9214c(ql0 ql0) {
        synchronized (this.f7827a) {
            this.f7831e.add(ql0);
        }
    }

    /* renamed from: d */
    public final void mo9215d() {
        synchronized (this.f7827a) {
            this.f7830d.mo15449b();
        }
    }

    /* renamed from: e */
    public final void mo9216e() {
        synchronized (this.f7827a) {
            this.f7830d.mo15450c();
        }
    }

    /* renamed from: f */
    public final void mo9217f() {
        synchronized (this.f7827a) {
            this.f7830d.mo15451d();
        }
    }

    /* renamed from: g */
    public final void mo9218g() {
        synchronized (this.f7827a) {
            this.f7830d.mo15452e();
        }
    }

    /* renamed from: h */
    public final void mo9219h(C4541l4 l4Var, long j) {
        synchronized (this.f7827a) {
            this.f7830d.mo15453f(l4Var, j);
        }
    }

    /* renamed from: i */
    public final void mo9220i(HashSet hashSet) {
        synchronized (this.f7827a) {
            this.f7831e.addAll(hashSet);
        }
    }

    /* renamed from: j */
    public final boolean mo9221j() {
        return this.f7833g;
    }

    /* renamed from: k */
    public final Bundle mo9222k(Context context, ku2 ku2) {
        HashSet hashSet = new HashSet();
        synchronized (this.f7827a) {
            hashSet.addAll(this.f7831e);
            this.f7831e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f7830d.mo15448a(context, this.f7829c.mo8434b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f7832f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ql0) it2.next()).mo13559a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ku2.mo11800b(hashSet);
            return bundle;
        }
        bm0 bm0 = (bm0) it.next();
        throw null;
    }
}
