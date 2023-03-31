package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0385n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0356b implements C0383m {

    /* renamed from: a */
    protected Context f1052a;

    /* renamed from: b */
    protected Context f1053b;

    /* renamed from: c */
    protected C0367g f1054c;

    /* renamed from: d */
    protected LayoutInflater f1055d;

    /* renamed from: e */
    protected LayoutInflater f1056e;

    /* renamed from: f */
    private C0383m.C0384a f1057f;

    /* renamed from: g */
    private int f1058g;

    /* renamed from: h */
    private int f1059h;

    /* renamed from: i */
    protected C0385n f1060i;

    /* renamed from: r */
    private int f1061r;

    public C0356b(Context context, int i, int i2) {
        this.f1052a = context;
        this.f1055d = LayoutInflater.from(context);
        this.f1058g = i;
        this.f1059h = i2;
    }

    /* renamed from: a */
    public void mo1271a(C0367g gVar, boolean z) {
        C0383m.C0384a aVar = this.f1057f;
        if (aVar != null) {
            aVar.mo996a(gVar, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1272b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1060i).addView(view, i);
    }

    /* renamed from: c */
    public void mo1273c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1060i;
        if (viewGroup != null) {
            C0367g gVar = this.f1054c;
            int i = 0;
            if (gVar != null) {
                gVar.mo1391r();
                ArrayList<C0371i> E = this.f1054c.mo1337E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0371i iVar = E.get(i3);
                    if (mo1286q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0371i itemData = childAt instanceof C0385n.C0386a ? ((C0385n.C0386a) childAt).getItemData() : null;
                        View n = mo1283n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            mo1272b(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1281l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo1274e(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1275f(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: g */
    public void mo1276g(C0383m.C0384a aVar) {
        this.f1057f = aVar;
    }

    /* renamed from: h */
    public void mo1277h(Context context, C0367g gVar) {
        this.f1053b = context;
        this.f1056e = LayoutInflater.from(context);
        this.f1054c = gVar;
    }

    /* renamed from: i */
    public abstract void mo1278i(C0371i iVar, C0385n.C0386a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1279j(androidx.appcompat.view.menu.C0392r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f1057f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f1054c
        L_0x0009:
            boolean r2 = r0.mo997b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0356b.mo1279j(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: k */
    public C0385n.C0386a mo1280k(ViewGroup viewGroup) {
        return (C0385n.C0386a) this.f1055d.inflate(this.f1059h, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1281l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public C0383m.C0384a mo1282m() {
        return this.f1057f;
    }

    /* renamed from: n */
    public View mo1283n(C0371i iVar, View view, ViewGroup viewGroup) {
        C0385n.C0386a aVar;
        if (view instanceof C0385n.C0386a) {
            aVar = (C0385n.C0386a) view;
        } else {
            aVar = mo1280k(viewGroup);
        }
        mo1278i(iVar, aVar);
        return (View) aVar;
    }

    /* renamed from: o */
    public C0385n mo1284o(ViewGroup viewGroup) {
        if (this.f1060i == null) {
            C0385n nVar = (C0385n) this.f1055d.inflate(this.f1058g, viewGroup, false);
            this.f1060i = nVar;
            nVar.mo1198b(this.f1054c);
            mo1273c(true);
        }
        return this.f1060i;
    }

    /* renamed from: p */
    public void mo1285p(int i) {
        this.f1061r = i;
    }

    /* renamed from: q */
    public abstract boolean mo1286q(int i, C0371i iVar);
}
