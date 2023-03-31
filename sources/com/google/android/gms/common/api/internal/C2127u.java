package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C2051a;
import java.util.ArrayList;
import java.util.Map;
import p017b5.C1811n;
import p033d5.C4087c;
import p033d5.C4122l0;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2127u extends C2137z {

    /* renamed from: b */
    private final Map<C2051a.C2060f, C2121r> f6290b;

    /* renamed from: c */
    final /* synthetic */ C2071a0 f6291c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2127u(C2071a0 a0Var, Map<C2051a.C2060f, C2121r> map) {
        super(a0Var, (C1811n) null);
        this.f6291c = a0Var;
        this.f6290b = map;
    }

    /* renamed from: a */
    public final void mo8122a() {
        C4122l0 l0Var = new C4122l0(this.f6291c.f6092d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2051a.C2060f next : this.f6290b.keySet()) {
            if (!next.mo6941l() || this.f6290b.get(next).f6271c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = l0Var.mo17422b(this.f6291c.f6091c, (C2051a.C2060f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = l0Var.mo17422b(this.f6291c.f6091c, (C2051a.C2060f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            C6362b bVar = new C6362b(i, (PendingIntent) null);
            C2071a0 a0Var = this.f6291c;
            a0Var.f6089a.mo8078m(new C2123s(this, a0Var, bVar));
            return;
        }
        C2071a0 a0Var2 = this.f6291c;
        if (a0Var2.f6101m && a0Var2.f6099k != null) {
            a0Var2.f6099k.mo22243t();
        }
        for (C2051a.C2060f next2 : this.f6290b.keySet()) {
            C4087c.C4090c cVar = this.f6290b.get(next2);
            if (!next2.mo6941l() || l0Var.mo17422b(this.f6291c.f6091c, next2) == 0) {
                next2.mo6938h(cVar);
            } else {
                C2071a0 a0Var3 = this.f6291c;
                a0Var3.f6089a.mo8078m(new C2125t(this, a0Var3, cVar));
            }
        }
    }
}
