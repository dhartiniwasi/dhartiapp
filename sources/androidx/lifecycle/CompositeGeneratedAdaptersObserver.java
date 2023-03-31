package androidx.lifecycle;

import androidx.lifecycle.C1208j;

class CompositeGeneratedAdaptersObserver implements C1216l {

    /* renamed from: a */
    private final C1193g[] f3248a;

    CompositeGeneratedAdaptersObserver(C1193g[] gVarArr) {
        this.f3248a = gVarArr;
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        C1227s sVar = new C1227s();
        for (C1193g a : this.f3248a) {
            a.mo4391a(nVar, bVar, false, sVar);
        }
        for (C1193g a2 : this.f3248a) {
            a2.mo4391a(nVar, bVar, true, sVar);
        }
    }
}
