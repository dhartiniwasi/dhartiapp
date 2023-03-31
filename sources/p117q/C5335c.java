package p117q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: q.c */
/* compiled from: CardViewApi21Impl */
class C5335c implements C5339f {
    C5335c() {
    }

    /* renamed from: o */
    private C5340g m32677o(C5338e eVar) {
        return (C5340g) eVar.mo19327g();
    }

    /* renamed from: a */
    public void mo19331a(C5338e eVar) {
        mo19343n(eVar, mo19337g(eVar));
    }

    /* renamed from: b */
    public float mo19332b(C5338e eVar) {
        return mo19334d(eVar) * 2.0f;
    }

    /* renamed from: c */
    public void mo19333c(C5338e eVar, float f) {
        m32677o(eVar).mo19354h(f);
    }

    /* renamed from: d */
    public float mo19334d(C5338e eVar) {
        return m32677o(eVar).mo19348d();
    }

    /* renamed from: e */
    public void mo19335e(C5338e eVar) {
        mo19343n(eVar, mo19337g(eVar));
    }

    /* renamed from: f */
    public float mo19336f(C5338e eVar) {
        return eVar.mo19328h().getElevation();
    }

    /* renamed from: g */
    public float mo19337g(C5338e eVar) {
        return m32677o(eVar).mo19347c();
    }

    /* renamed from: h */
    public float mo19338h(C5338e eVar) {
        return mo19334d(eVar) * 2.0f;
    }

    /* renamed from: i */
    public ColorStateList mo19339i(C5338e eVar) {
        return m32677o(eVar).mo19346b();
    }

    /* renamed from: j */
    public void mo19340j(C5338e eVar, float f) {
        eVar.mo19328h().setElevation(f);
    }

    /* renamed from: k */
    public void mo19329k() {
    }

    /* renamed from: l */
    public void mo19341l(C5338e eVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        eVar.mo19324d(new C5340g(colorStateList, f));
        View h = eVar.mo19328h();
        h.setClipToOutline(true);
        h.setElevation(f2);
        mo19343n(eVar, f3);
    }

    /* renamed from: m */
    public void mo19342m(C5338e eVar, ColorStateList colorStateList) {
        m32677o(eVar).mo19350f(colorStateList);
    }

    /* renamed from: n */
    public void mo19343n(C5338e eVar, float f) {
        m32677o(eVar).mo19351g(f, eVar.mo19326f(), eVar.mo19325e());
        mo19344p(eVar);
    }

    /* renamed from: p */
    public void mo19344p(C5338e eVar) {
        if (!eVar.mo19326f()) {
            eVar.mo19322b(0, 0, 0, 0);
            return;
        }
        float g = mo19337g(eVar);
        float d = mo19334d(eVar);
        int ceil = (int) Math.ceil((double) C5341h.m32743c(g, d, eVar.mo19325e()));
        int ceil2 = (int) Math.ceil((double) C5341h.m32744d(g, d, eVar.mo19325e()));
        eVar.mo19322b(ceil, ceil2, ceil, ceil2);
    }
}
