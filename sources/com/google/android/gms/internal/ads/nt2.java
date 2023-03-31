package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nt2 {

    /* renamed from: a */
    private final is2 f14190a;

    /* renamed from: b */
    private final ls2 f14191b;

    /* renamed from: c */
    private final o42 f14192c;

    /* renamed from: d */
    private final rz2 f14193d;

    /* renamed from: e */
    private final yy2 f14194e;

    public nt2(o42 o42, rz2 rz2, is2 is2, ls2 ls2, yy2 yy2) {
        this.f14190a = is2;
        this.f14191b = ls2;
        this.f14192c = o42;
        this.f14193d = rz2;
        this.f14194e = yy2;
    }

    /* renamed from: a */
    public final void mo12707a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo12708b((String) it.next(), 2);
        }
    }

    /* renamed from: b */
    public final void mo12708b(String str, int i) {
        if (!this.f14190a.f10989k0) {
            this.f14193d.mo13909c(str, this.f14194e);
            return;
        }
        this.f14192c.mo12822g(new q42(C4409t.m29310b().mo18370a(), this.f14191b.f12930b, str, i));
    }

    /* renamed from: c */
    public final void mo12709c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo12708b((String) it.next(), i);
        }
    }
}
