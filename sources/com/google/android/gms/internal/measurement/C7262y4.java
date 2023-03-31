package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7262y4 {

    /* renamed from: a */
    public final C7262y4 f32198a;

    /* renamed from: b */
    final C7257y f32199b;

    /* renamed from: c */
    final Map f32200c = new HashMap();

    /* renamed from: d */
    final Map f32201d = new HashMap();

    public C7262y4(C7262y4 y4Var, C7257y yVar) {
        this.f32198a = y4Var;
        this.f32199b = yVar;
    }

    /* renamed from: a */
    public final C7262y4 mo24006a() {
        return new C7262y4(this, this.f32199b);
    }

    /* renamed from: b */
    public final C7129q mo24007b(C7129q qVar) {
        return this.f32199b.mo24004a(this, qVar);
    }

    /* renamed from: c */
    public final C7129q mo24008c(C6951f fVar) {
        C7129q qVar = C7129q.f31955m;
        Iterator r = fVar.mo23382r();
        while (r.hasNext()) {
            qVar = this.f32199b.mo24004a(this, fVar.mo23380o(((Integer) r.next()).intValue()));
            if (qVar instanceof C6985h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C7129q mo24009d(String str) {
        if (this.f32200c.containsKey(str)) {
            return (C7129q) this.f32200c.get(str);
        }
        C7262y4 y4Var = this.f32198a;
        if (y4Var != null) {
            return y4Var.mo24009d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo24010e(String str, C7129q qVar) {
        if (!this.f32201d.containsKey(str)) {
            if (qVar == null) {
                this.f32200c.remove(str);
            } else {
                this.f32200c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo24011f(String str, C7129q qVar) {
        mo24010e(str, qVar);
        this.f32201d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo24012g(String str, C7129q qVar) {
        C7262y4 y4Var;
        if (!this.f32200c.containsKey(str) && (y4Var = this.f32198a) != null && y4Var.mo24013h(str)) {
            this.f32198a.mo24012g(str, qVar);
        } else if (!this.f32201d.containsKey(str)) {
            if (qVar == null) {
                this.f32200c.remove(str);
            } else {
                this.f32200c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo24013h(String str) {
        if (this.f32200c.containsKey(str)) {
            return true;
        }
        C7262y4 y4Var = this.f32198a;
        if (y4Var != null) {
            return y4Var.mo24013h(str);
        }
        return false;
    }
}
