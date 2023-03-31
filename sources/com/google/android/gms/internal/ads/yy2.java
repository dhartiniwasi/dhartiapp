package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p060h4.C4623z2;
import p179z3.C6323b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yy2 implements Runnable {

    /* renamed from: a */
    private final List f20844a = new ArrayList();

    /* renamed from: b */
    private final az2 f20845b;

    /* renamed from: c */
    private String f20846c;

    /* renamed from: d */
    private String f20847d;

    /* renamed from: e */
    private ts2 f20848e;

    /* renamed from: f */
    private C4623z2 f20849f;

    /* renamed from: g */
    private Future f20850g;

    /* renamed from: h */
    private int f20851h = 2;

    yy2(az2 az2) {
        this.f20845b = az2;
    }

    /* renamed from: a */
    public final synchronized yy2 mo15515a(ny2 ny2) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            List list = this.f20844a;
            ny2.mo11833c();
            list.add(ny2);
            Future future = this.f20850g;
            if (future != null) {
                future.cancel(false);
            }
            this.f20850g = dn0.f8328d.schedule(this, (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14755z7)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    /* renamed from: b */
    public final synchronized yy2 mo15516b(String str) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue() && xy2.m23613e(str)) {
            this.f20846c = str;
        }
        return this;
    }

    /* renamed from: c */
    public final synchronized yy2 mo15517c(C4623z2 z2Var) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            this.f20849f = z2Var;
        }
        return this;
    }

    /* renamed from: d */
    public final synchronized yy2 mo15518d(ArrayList arrayList) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(C6323b.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(C6323b.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(C6323b.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(C6323b.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.f20851h = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(C6323b.REWARDED_INTERSTITIAL.name())) {
                                                this.f20851h = 6;
                                            }
                                        }
                                    }
                                    this.f20851h = 5;
                                }
                            }
                            this.f20851h = 8;
                        }
                    }
                    this.f20851h = 4;
                }
            }
            this.f20851h = 3;
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized yy2 mo15519e(String str) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            this.f20847d = str;
        }
        return this;
    }

    /* renamed from: f */
    public final synchronized yy2 mo15520f(ts2 ts2) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            this.f20848e = ts2;
        }
        return this;
    }

    /* renamed from: g */
    public final synchronized void mo15521g() {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            Future future = this.f20850g;
            if (future != null) {
                future.cancel(false);
            }
            for (ny2 ny2 : this.f20844a) {
                int i = this.f20851h;
                if (i != 2) {
                    ny2.mo11827H(i);
                }
                if (!TextUtils.isEmpty(this.f20846c)) {
                    ny2.mo11836z(this.f20846c);
                }
                if (!TextUtils.isEmpty(this.f20847d) && !ny2.mo11830V()) {
                    ny2.mo11835x(this.f20847d);
                }
                ts2 ts2 = this.f20848e;
                if (ts2 != null) {
                    ny2.mo11832a(ts2);
                } else {
                    C4623z2 z2Var = this.f20849f;
                    if (z2Var != null) {
                        ny2.mo11834g(z2Var);
                    }
                }
                this.f20845b.mo8629b(ny2.mo11831W());
            }
            this.f20844a.clear();
        }
    }

    /* renamed from: h */
    public final synchronized yy2 mo15522h(int i) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            this.f20851h = i;
        }
        return this;
    }

    public final synchronized void run() {
        mo15521g();
    }
}
