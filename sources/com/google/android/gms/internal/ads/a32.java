package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a32 implements lx2 {

    /* renamed from: a */
    private final Map f6394a = new HashMap();

    /* renamed from: b */
    private final Map f6395b = new HashMap();

    /* renamed from: c */
    private final tx2 f6396c;

    public a32(Set set, tx2 tx2) {
        this.f6396c = tx2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            z22 z22 = (z22) it.next();
            this.f6394a.put(z22.f20920b, z22.f20919a);
            this.f6395b.put(z22.f20921c, z22.f20919a);
        }
    }

    /* renamed from: a */
    public final void mo8191a(ex2 ex2, String str) {
        this.f6396c.mo14410d("task.".concat(String.valueOf(str)));
        if (this.f6394a.containsKey(ex2)) {
            this.f6396c.mo14410d("label.".concat(String.valueOf((String) this.f6394a.get(ex2))));
        }
    }

    /* renamed from: d */
    public final void mo8192d(ex2 ex2, String str) {
    }

    /* renamed from: h */
    public final void mo8193h(ex2 ex2, String str) {
        this.f6396c.mo14411e("task.".concat(String.valueOf(str)), "s.");
        if (this.f6395b.containsKey(ex2)) {
            this.f6396c.mo14411e("label.".concat(String.valueOf((String) this.f6395b.get(ex2))), "s.");
        }
    }

    /* renamed from: k */
    public final void mo8194k(ex2 ex2, String str, Throwable th) {
        this.f6396c.mo14411e("task.".concat(String.valueOf(str)), "f.");
        if (this.f6395b.containsKey(ex2)) {
            this.f6396c.mo14411e("label.".concat(String.valueOf((String) this.f6395b.get(ex2))), "f.");
        }
    }
}
