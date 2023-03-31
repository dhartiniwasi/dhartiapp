package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jv1 implements lx2 {

    /* renamed from: a */
    private final Map f11800a = new HashMap();

    /* renamed from: b */
    private final bv1 f11801b;

    /* renamed from: c */
    private final C4691e f11802c;

    /* renamed from: d */
    private final Map f11803d = new HashMap();

    public jv1(bv1 bv1, Set set, C4691e eVar) {
        this.f11801b = bv1;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            iv1 iv1 = (iv1) it.next();
            this.f11803d.put(iv1.f11021c, iv1);
        }
        this.f11802c = eVar;
    }

    /* renamed from: b */
    private final void m15074b(ex2 ex2, boolean z) {
        ex2 b = ((iv1) this.f11803d.get(ex2)).f11020b;
        String str = true != z ? "f." : "s.";
        if (this.f11800a.containsKey(b)) {
            this.f11801b.mo8951a().put("label.".concat(((iv1) this.f11803d.get(ex2)).f11019a), str.concat(String.valueOf(Long.toString(this.f11802c.mo18371b() - ((Long) this.f11800a.get(b)).longValue()))));
        }
    }

    /* renamed from: a */
    public final void mo8191a(ex2 ex2, String str) {
        this.f11800a.put(ex2, Long.valueOf(this.f11802c.mo18371b()));
    }

    /* renamed from: d */
    public final void mo8192d(ex2 ex2, String str) {
    }

    /* renamed from: h */
    public final void mo8193h(ex2 ex2, String str) {
        if (this.f11800a.containsKey(ex2)) {
            this.f11801b.mo8951a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.f11802c.mo18371b() - ((Long) this.f11800a.get(ex2)).longValue()))));
        }
        if (this.f11803d.containsKey(ex2)) {
            m15074b(ex2, true);
        }
    }

    /* renamed from: k */
    public final void mo8194k(ex2 ex2, String str, Throwable th) {
        if (this.f11800a.containsKey(ex2)) {
            this.f11801b.mo8951a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.f11802c.mo18371b() - ((Long) this.f11800a.get(ex2)).longValue()))));
        }
        if (this.f11803d.containsKey(ex2)) {
            m15074b(ex2, false);
        }
    }
}
