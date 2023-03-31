package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p060h4.C4541l4;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ql0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4691e f16452a;

    /* renamed from: b */
    private final cm0 f16453b;

    /* renamed from: c */
    private final LinkedList f16454c;

    /* renamed from: d */
    private final Object f16455d = new Object();

    /* renamed from: e */
    private final String f16456e;

    /* renamed from: f */
    private final String f16457f;

    /* renamed from: g */
    private long f16458g = -1;

    /* renamed from: h */
    private long f16459h = -1;

    /* renamed from: i */
    private long f16460i = 0;

    /* renamed from: j */
    private long f16461j = -1;

    /* renamed from: k */
    private long f16462k = -1;

    ql0(C4691e eVar, cm0 cm0, String str, String str2) {
        this.f16452a = eVar;
        this.f16453b = cm0;
        this.f16456e = str;
        this.f16457f = str2;
        this.f16454c = new LinkedList();
    }

    /* renamed from: a */
    public final Bundle mo13559a() {
        Bundle bundle;
        synchronized (this.f16455d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f16456e);
            bundle.putString("slotid", this.f16457f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f16461j);
            bundle.putLong("tresponse", this.f16462k);
            bundle.putLong("timp", this.f16458g);
            bundle.putLong("tload", this.f16459h);
            bundle.putLong("pcc", this.f16460i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16454c.iterator();
            while (it.hasNext()) {
                arrayList.add(((pl0) it.next()).mo13297b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo13560c() {
        return this.f16456e;
    }

    /* renamed from: d */
    public final void mo13561d() {
        synchronized (this.f16455d) {
            if (this.f16462k != -1) {
                pl0 pl0 = new pl0(this);
                pl0.mo13299d();
                this.f16454c.add(pl0);
                this.f16460i++;
                this.f16453b.mo9215d();
                this.f16453b.mo9214c(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo13562e() {
        synchronized (this.f16455d) {
            if (this.f16462k != -1 && !this.f16454c.isEmpty()) {
                pl0 pl0 = (pl0) this.f16454c.getLast();
                if (pl0.mo13296a() == -1) {
                    pl0.mo13298c();
                    this.f16453b.mo9214c(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo13563f() {
        synchronized (this.f16455d) {
            if (this.f16462k != -1 && this.f16458g == -1) {
                this.f16458g = this.f16452a.mo18371b();
                this.f16453b.mo9214c(this);
            }
            this.f16453b.mo9216e();
        }
    }

    /* renamed from: g */
    public final void mo13564g() {
        synchronized (this.f16455d) {
            this.f16453b.mo9217f();
        }
    }

    /* renamed from: h */
    public final void mo13565h(boolean z) {
        synchronized (this.f16455d) {
            if (this.f16462k != -1) {
                this.f16459h = this.f16452a.mo18371b();
            }
        }
    }

    /* renamed from: i */
    public final void mo13566i() {
        synchronized (this.f16455d) {
            this.f16453b.mo9218g();
        }
    }

    /* renamed from: j */
    public final void mo13567j(C4541l4 l4Var) {
        synchronized (this.f16455d) {
            long b = this.f16452a.mo18371b();
            this.f16461j = b;
            this.f16453b.mo9219h(l4Var, b);
        }
    }

    /* renamed from: k */
    public final void mo13568k(long j) {
        synchronized (this.f16455d) {
            this.f16462k = j;
            if (j != -1) {
                this.f16453b.mo9214c(this);
            }
        }
    }
}
