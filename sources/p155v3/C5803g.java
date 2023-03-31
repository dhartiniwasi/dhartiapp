package p155v3;

import java.util.ArrayList;
import java.util.Map;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.g */
/* compiled from: BaseDataSource */
public abstract class C5803g implements C5828l {

    /* renamed from: a */
    private final boolean f28801a;

    /* renamed from: b */
    private final ArrayList<C5840p0> f28802b = new ArrayList<>(1);

    /* renamed from: c */
    private int f28803c;

    /* renamed from: d */
    private C5837p f28804d;

    protected C5803g(boolean z) {
        this.f28801a = z;
    }

    /* renamed from: i */
    public /* synthetic */ Map mo6816i() {
        return C5825k.m34605a(this);
    }

    /* renamed from: n */
    public final void mo6818n(C5840p0 p0Var) {
        C5917a.m34872e(p0Var);
        if (!this.f28802b.contains(p0Var)) {
            this.f28802b.add(p0Var);
            this.f28803c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo20325q(int i) {
        C5837p pVar = (C5837p) C5953m0.m35138j(this.f28804d);
        for (int i2 = 0; i2 < this.f28803c; i2++) {
            this.f28802b.get(i2).mo20385i(this, pVar, this.f28801a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo20326r() {
        C5837p pVar = (C5837p) C5953m0.m35138j(this.f28804d);
        for (int i = 0; i < this.f28803c; i++) {
            this.f28802b.get(i).mo20382a(this, pVar, this.f28801a);
        }
        this.f28804d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo20327s(C5837p pVar) {
        for (int i = 0; i < this.f28803c; i++) {
            this.f28802b.get(i).mo20384h(this, pVar, this.f28801a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo20328t(C5837p pVar) {
        this.f28804d = pVar;
        for (int i = 0; i < this.f28803c; i++) {
            this.f28802b.get(i).mo20383d(this, pVar, this.f28801a);
        }
    }
}
