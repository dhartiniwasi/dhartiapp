package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0909g0;
import androidx.core.view.C0915h0;
import androidx.core.view.C0917i0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C0347h {

    /* renamed from: a */
    final ArrayList<C0909g0> f990a = new ArrayList<>();

    /* renamed from: b */
    private long f991b = -1;

    /* renamed from: c */
    private Interpolator f992c;

    /* renamed from: d */
    C0915h0 f993d;

    /* renamed from: e */
    private boolean f994e;

    /* renamed from: f */
    private final C0917i0 f995f = new C0348a();

    /* renamed from: androidx.appcompat.view.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C0348a extends C0917i0 {

        /* renamed from: a */
        private boolean f996a = false;

        /* renamed from: b */
        private int f997b = 0;

        C0348a() {
        }

        /* renamed from: b */
        public void mo992b(View view) {
            int i = this.f997b + 1;
            this.f997b = i;
            if (i == C0347h.this.f990a.size()) {
                C0915h0 h0Var = C0347h.this.f993d;
                if (h0Var != null) {
                    h0Var.mo992b((View) null);
                }
                mo1158d();
            }
        }

        /* renamed from: c */
        public void mo993c(View view) {
            if (!this.f996a) {
                this.f996a = true;
                C0915h0 h0Var = C0347h.this.f993d;
                if (h0Var != null) {
                    h0Var.mo993c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1158d() {
            this.f997b = 0;
            this.f996a = false;
            C0347h.this.mo1151b();
        }
    }

    /* renamed from: a */
    public void mo1150a() {
        if (this.f994e) {
            Iterator<C0909g0> it = this.f990a.iterator();
            while (it.hasNext()) {
                it.next().mo3386c();
            }
            this.f994e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1151b() {
        this.f994e = false;
    }

    /* renamed from: c */
    public C0347h mo1152c(C0909g0 g0Var) {
        if (!this.f994e) {
            this.f990a.add(g0Var);
        }
        return this;
    }

    /* renamed from: d */
    public C0347h mo1153d(C0909g0 g0Var, C0909g0 g0Var2) {
        this.f990a.add(g0Var);
        g0Var2.mo3391j(g0Var.mo3387d());
        this.f990a.add(g0Var2);
        return this;
    }

    /* renamed from: e */
    public C0347h mo1154e(long j) {
        if (!this.f994e) {
            this.f991b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0347h mo1155f(Interpolator interpolator) {
        if (!this.f994e) {
            this.f992c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0347h mo1156g(C0915h0 h0Var) {
        if (!this.f994e) {
            this.f993d = h0Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo1157h() {
        if (!this.f994e) {
            Iterator<C0909g0> it = this.f990a.iterator();
            while (it.hasNext()) {
                C0909g0 next = it.next();
                long j = this.f991b;
                if (j >= 0) {
                    next.mo3388f(j);
                }
                Interpolator interpolator = this.f992c;
                if (interpolator != null) {
                    next.mo3389g(interpolator);
                }
                if (this.f993d != null) {
                    next.mo3390h(this.f995f);
                }
                next.mo3393l();
            }
            this.f994e = true;
        }
    }
}
