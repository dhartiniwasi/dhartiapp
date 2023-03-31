package p060h4;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2487is;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.pm0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.C0100e;
import p088l5.C4954a;
import p088l5.C4956b;
import p179z3.C6322a0;
import p179z3.C6327d;
import p179z3.C6337h;
import p179z3.C6348r;
import p179z3.C6353v;
import p179z3.C6355x;
import p179z3.C6357y;

/* renamed from: h4.t2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4587t2 {

    /* renamed from: a */
    private final nb0 f25013a;

    /* renamed from: b */
    private final C4565p4 f25014b;

    /* renamed from: c */
    private final AtomicBoolean f25015c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6355x f25016d;

    /* renamed from: e */
    final C4590u f25017e;

    /* renamed from: f */
    private C4470a f25018f;

    /* renamed from: g */
    private C6327d f25019g;

    /* renamed from: h */
    private C6337h[] f25020h;

    /* renamed from: i */
    private C0100e f25021i;

    /* renamed from: j */
    private C4567q0 f25022j;

    /* renamed from: k */
    private C6357y f25023k;

    /* renamed from: l */
    private String f25024l;

    /* renamed from: m */
    private final ViewGroup f25025m;

    /* renamed from: n */
    private int f25026n;

    /* renamed from: o */
    private boolean f25027o;

    /* renamed from: p */
    private C6348r f25028p;

    public C4587t2(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, C4565p4.f24948a, (C4567q0) null, i);
    }

    /* renamed from: b */
    private static C4571q4 m30041b(Context context, C6337h[] hVarArr, int i) {
        for (C6337h equals : hVarArr) {
            if (equals.equals(C6337h.f30526q)) {
                return C4571q4.m29985M1();
            }
        }
        C4571q4 q4Var = new C4571q4(context, hVarArr);
        q4Var.f24981r = m30042c(i);
        return q4Var;
    }

    /* renamed from: c */
    private static boolean m30042c(int i) {
        return i == 1;
    }

    /* renamed from: A */
    public final void mo18144A(C6357y yVar) {
        C4499e4 e4Var;
        this.f25023k = yVar;
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                if (yVar == null) {
                    e4Var = null;
                } else {
                    e4Var = new C4499e4(yVar);
                }
                q0Var.mo10877p4(e4Var);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final C6337h[] mo18145a() {
        return this.f25020h;
    }

    /* renamed from: d */
    public final C6327d mo18146d() {
        return this.f25019g;
    }

    /* renamed from: e */
    public final C6337h mo18147e() {
        C4571q4 c;
        try {
            C4567q0 q0Var = this.f25022j;
            if (!(q0Var == null || (c = q0Var.mo10863c()) == null)) {
                return C6322a0.m37262c(c.f24976e, c.f24973b, c.f24972a);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        C6337h[] hVarArr = this.f25020h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    /* renamed from: f */
    public final C6348r mo18148f() {
        return this.f25028p;
    }

    /* renamed from: g */
    public final C6353v mo18149g() {
        C4509g2 g2Var = null;
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                g2Var = q0Var.mo10856X();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        return C6353v.m37370f(g2Var);
    }

    /* renamed from: i */
    public final C6355x mo18150i() {
        return this.f25016d;
    }

    /* renamed from: j */
    public final C6357y mo18151j() {
        return this.f25023k;
    }

    /* renamed from: k */
    public final C0100e mo18152k() {
        return this.f25021i;
    }

    /* renamed from: l */
    public final C4527j2 mo18153l() {
        C4567q0 q0Var = this.f25022j;
        if (q0Var != null) {
            try {
                return q0Var.mo10859Z();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String mo18154m() {
        C4567q0 q0Var;
        if (this.f25024l == null && (q0Var = this.f25022j) != null) {
            try {
                this.f25024l = q0Var.mo10868e0();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
        return this.f25024l;
    }

    /* renamed from: n */
    public final void mo18155n() {
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10878q();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo18156o(C4954a aVar) {
        this.f25025m.addView((View) C4956b.m31384P0(aVar));
    }

    /* renamed from: p */
    public final void mo18157p(C4569q2 q2Var) {
        C4567q0 q0Var;
        try {
            if (this.f25022j == null) {
                if (this.f25020h == null || this.f25024l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f25025m.getContext();
                C4571q4 b = m30041b(context, this.f25020h, this.f25026n);
                if ("search_v2".equals(b.f24972a)) {
                    q0Var = (C4567q0) new C4518i(C4584t.m30035a(), context, b, this.f25024l).mo18139d(context, false);
                } else {
                    q0Var = (C4567q0) new C4506g(C4584t.m30035a(), context, b, this.f25024l, this.f25013a).mo18139d(context, false);
                }
                this.f25022j = q0Var;
                q0Var.mo10854V1(new C4511g4(this.f25017e));
                C4470a aVar = this.f25018f;
                if (aVar != null) {
                    this.f25022j.mo10874n4(new C4608x(aVar));
                }
                C0100e eVar = this.f25021i;
                if (eVar != null) {
                    this.f25022j.mo10858Y5(new C2487is(eVar));
                }
                if (this.f25023k != null) {
                    this.f25022j.mo10877p4(new C4499e4(this.f25023k));
                }
                this.f25022j.mo10881x4(new C4612x3(this.f25028p));
                this.f25022j.mo10884y6(this.f25027o);
                C4567q0 q0Var2 = this.f25022j;
                if (q0Var2 != null) {
                    try {
                        C4954a a0 = q0Var2.mo10861a0();
                        if (a0 != null) {
                            if (((Boolean) c10.f7560f.mo13438e()).booleanValue()) {
                                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                                    im0.f10857b.post(new C4575r2(this, a0));
                                }
                            }
                            this.f25025m.addView((View) C4956b.m31384P0(a0));
                        }
                    } catch (RemoteException e) {
                        pm0.m18669i("#007 Could not call remote method.", e);
                    }
                }
            }
            C4567q0 q0Var3 = this.f25022j;
            Objects.requireNonNull(q0Var3);
            q0Var3.mo10860Z2(this.f25014b.mo18106a(this.f25025m.getContext(), q2Var));
        } catch (RemoteException e2) {
            pm0.m18669i("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: q */
    public final void mo18158q() {
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10872j0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo18159r() {
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10873l0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo18160s(C4470a aVar) {
        try {
            this.f25018f = aVar;
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10874n4(aVar != null ? new C4608x(aVar) : null);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final void mo18161t(C6327d dVar) {
        this.f25019g = dVar;
        this.f25017e.mo18170p(dVar);
    }

    /* renamed from: u */
    public final void mo18162u(C6337h... hVarArr) {
        if (this.f25020h == null) {
            mo18163v(hVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: v */
    public final void mo18163v(C6337h... hVarArr) {
        this.f25020h = hVarArr;
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10847M5(m30041b(this.f25025m.getContext(), this.f25020h, this.f25026n));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        this.f25025m.requestLayout();
    }

    /* renamed from: w */
    public final void mo18164w(String str) {
        if (this.f25024l == null) {
            this.f25024l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: x */
    public final void mo18165x(C0100e eVar) {
        try {
            this.f25021i = eVar;
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10858Y5(eVar != null ? new C2487is(eVar) : null);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: y */
    public final void mo18166y(boolean z) {
        this.f25027o = z;
        try {
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10884y6(z);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: z */
    public final void mo18167z(C6348r rVar) {
        try {
            this.f25028p = rVar;
            C4567q0 q0Var = this.f25022j;
            if (q0Var != null) {
                q0Var.mo10881x4(new C4612x3(rVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    C4587t2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C4565p4 p4Var, C4567q0 q0Var, int i) {
        C4571q4 q4Var;
        this.f25013a = new nb0();
        this.f25016d = new C6355x();
        this.f25017e = new C4581s2(this);
        this.f25025m = viewGroup;
        this.f25014b = p4Var;
        this.f25022j = null;
        this.f25015c = new AtomicBoolean(false);
        this.f25026n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C4619y4 y4Var = new C4619y4(context, attributeSet);
                this.f25020h = y4Var.mo18185b(z);
                this.f25024l = y4Var.mo18184a();
                if (viewGroup.isInEditMode()) {
                    im0 b = C4584t.m30036b();
                    C6337h hVar = this.f25020h[0];
                    int i2 = this.f25026n;
                    if (hVar.equals(C6337h.f30526q)) {
                        q4Var = C4571q4.m29985M1();
                    } else {
                        C4571q4 q4Var2 = new C4571q4(context, hVar);
                        q4Var2.f24981r = m30042c(i2);
                        q4Var = q4Var2;
                    }
                    b.mo11163n(viewGroup, q4Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C4584t.m30036b().mo11162m(viewGroup, new C4571q4(context, C6337h.f30518i), e.getMessage(), e.getMessage());
            }
        }
    }
}
