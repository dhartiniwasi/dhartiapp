package p264io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import p297mb.C11881b;
import p417zb.C13543p;

/* renamed from: io.flutter.plugin.editing.c */
/* compiled from: ListenableEditingState */
class C10705c extends SpannableStringBuilder {

    /* renamed from: a */
    private int f41952a = 0;

    /* renamed from: b */
    private int f41953b = 0;

    /* renamed from: c */
    private ArrayList<C10707b> f41954c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<C10707b> f41955d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<C10709e> f41956e = new ArrayList<>();

    /* renamed from: f */
    private String f41957f;

    /* renamed from: g */
    private String f41958g;

    /* renamed from: h */
    private int f41959h;

    /* renamed from: i */
    private int f41960i;

    /* renamed from: r */
    private int f41961r;

    /* renamed from: s */
    private int f41962s;

    /* renamed from: t */
    private BaseInputConnection f41963t;

    /* renamed from: io.flutter.plugin.editing.c$a */
    /* compiled from: ListenableEditingState */
    class C10706a extends BaseInputConnection {

        /* renamed from: a */
        final /* synthetic */ Editable f41964a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10706a(View view, boolean z, Editable editable) {
            super(view, z);
            this.f41964a = editable;
        }

        public Editable getEditable() {
            return this.f41964a;
        }
    }

    /* renamed from: io.flutter.plugin.editing.c$b */
    /* compiled from: ListenableEditingState */
    interface C10707b {
        /* renamed from: a */
        void mo34157a(boolean z, boolean z2, boolean z3);
    }

    public C10705c(C13543p.C13549e eVar, View view) {
        this.f41963t = new C10706a(view, true, this);
        if (eVar != null) {
            mo34189n(eVar);
        }
    }

    /* renamed from: j */
    private void m53567j(C10707b bVar, boolean z, boolean z2, boolean z3) {
        this.f41953b++;
        bVar.mo34157a(z, z2, z3);
        this.f41953b--;
    }

    /* renamed from: k */
    private void m53568k(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<C10707b> it = this.f41954c.iterator();
            while (it.hasNext()) {
                m53567j(it.next(), z, z2, z3);
            }
        }
    }

    /* renamed from: a */
    public void mo34178a(C10707b bVar) {
        if (this.f41953b > 0) {
            C11881b.m57384b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f41952a > 0) {
            C11881b.m57389g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f41955d.add(bVar);
            return;
        }
        this.f41954c.add(bVar);
    }

    /* renamed from: b */
    public void mo34179b() {
        this.f41952a++;
        if (this.f41953b > 0) {
            C11881b.m57384b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f41952a == 1 && !this.f41954c.isEmpty()) {
            this.f41958g = toString();
            this.f41959h = mo34186i();
            this.f41960i = mo34185h();
            this.f41961r = mo34184g();
            this.f41962s = mo34183f();
        }
    }

    /* renamed from: c */
    public void mo34180c() {
        this.f41956e.clear();
    }

    /* renamed from: d */
    public void mo34181d() {
        int i = this.f41952a;
        if (i == 0) {
            C11881b.m57384b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<C10707b> it = this.f41955d.iterator();
            while (it.hasNext()) {
                m53567j(it.next(), true, true, true);
            }
            if (!this.f41954c.isEmpty()) {
                C11881b.m57388f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f41954c.size()) + " listener(s)");
                boolean equals = toString().equals(this.f41958g) ^ true;
                boolean z = false;
                boolean z2 = (this.f41959h == mo34186i() && this.f41960i == mo34185h()) ? false : true;
                if (!(this.f41961r == mo34184g() && this.f41962s == mo34183f())) {
                    z = true;
                }
                m53568k(equals, z2, z);
            }
        }
        this.f41954c.addAll(this.f41955d);
        this.f41955d.clear();
        this.f41952a--;
    }

    /* renamed from: e */
    public ArrayList<C10709e> mo34182e() {
        ArrayList<C10709e> arrayList = new ArrayList<>(this.f41956e);
        this.f41956e.clear();
        return arrayList;
    }

    /* renamed from: f */
    public final int mo34183f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: g */
    public final int mo34184g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    /* renamed from: h */
    public final int mo34185h() {
        return Selection.getSelectionEnd(this);
    }

    /* renamed from: i */
    public final int mo34186i() {
        return Selection.getSelectionStart(this);
    }

    /* renamed from: l */
    public void mo34187l(C10707b bVar) {
        if (this.f41953b > 0) {
            C11881b.m57384b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f41954c.remove(bVar);
        if (this.f41952a > 0) {
            this.f41955d.remove(bVar);
        }
    }

    /* renamed from: m */
    public void mo34188m(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f41963t.setComposingRegion(i, i2);
        }
    }

    /* renamed from: n */
    public void mo34189n(C13543p.C13549e eVar) {
        mo34179b();
        replace(0, length(), eVar.f48052a);
        if (eVar.mo38672c()) {
            Selection.setSelection(this, eVar.f48053b, eVar.f48054c);
        } else {
            Selection.removeSelection(this);
        }
        mo34188m(eVar.f48055d, eVar.f48056e);
        mo34180c();
        mo34181d();
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        this.f41956e.add(new C10709e(toString(), mo34186i(), mo34185h(), mo34184g(), mo34183f()));
    }

    public String toString() {
        String str = this.f41957f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f41957f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        boolean z2;
        if (this.f41953b > 0) {
            C11881b.m57384b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i5 = i2 - i;
        boolean z3 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z3; i6++) {
            z3 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        CharSequence charSequence2 = charSequence;
        if (z3) {
            this.f41957f = null;
        }
        int i7 = mo34186i();
        int h = mo34185h();
        int g = mo34184g();
        int f = mo34183f();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        C10709e eVar = r1;
        boolean z4 = z3;
        int i8 = f;
        C10709e eVar2 = new C10709e(cVar, i, i2, charSequence, mo34186i(), mo34185h(), mo34184g(), mo34183f());
        this.f41956e.add(eVar);
        if (this.f41952a > 0) {
            return replace;
        }
        boolean z5 = (mo34186i() == i7 && mo34185h() == h) ? false : true;
        if (mo34184g() == g && mo34183f() == i8) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        m53568k(z, z5, z2);
        return replace;
    }
}
