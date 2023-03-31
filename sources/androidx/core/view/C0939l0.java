package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;
import p124r.C5426g;

/* renamed from: androidx.core.view.l0 */
/* compiled from: WindowInsetsControllerCompat */
public final class C0939l0 {

    /* renamed from: a */
    private final C0944e f2612a;

    /* renamed from: androidx.core.view.l0$a */
    /* compiled from: WindowInsetsControllerCompat */
    private static class C0940a extends C0944e {

        /* renamed from: a */
        protected final Window f2613a;

        /* renamed from: b */
        private final View f2614b;

        C0940a(Window window, View view) {
            this.f2613a = window;
            this.f2614b = view;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3462c(int i) {
            View decorView = this.f2613a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3463d(int i) {
            this.f2613a.addFlags(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3464e(int i) {
            View decorView = this.f2613a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo3465f(int i) {
            this.f2613a.clearFlags(i);
        }
    }

    /* renamed from: androidx.core.view.l0$b */
    /* compiled from: WindowInsetsControllerCompat */
    private static class C0941b extends C0940a {
        C0941b(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public void mo3466b(boolean z) {
            if (z) {
                mo3465f(67108864);
                mo3463d(RecyclerView.UNDEFINED_DURATION);
                mo3462c(8192);
                return;
            }
            mo3464e(8192);
        }
    }

    /* renamed from: androidx.core.view.l0$c */
    /* compiled from: WindowInsetsControllerCompat */
    private static class C0942c extends C0941b {
        C0942c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: a */
        public void mo3467a(boolean z) {
            if (z) {
                mo3465f(134217728);
                mo3463d(RecyclerView.UNDEFINED_DURATION);
                mo3462c(16);
                return;
            }
            mo3464e(16);
        }
    }

    /* renamed from: androidx.core.view.l0$e */
    /* compiled from: WindowInsetsControllerCompat */
    private static class C0944e {
        C0944e() {
        }

        /* renamed from: a */
        public void mo3467a(boolean z) {
        }

        /* renamed from: b */
        public void mo3466b(boolean z) {
        }
    }

    public C0939l0(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f2612a = new C0943d(window, this);
        } else if (i >= 26) {
            this.f2612a = new C0942c(window, view);
        } else if (i >= 23) {
            this.f2612a = new C0941b(window, view);
        } else if (i >= 20) {
            this.f2612a = new C0940a(window, view);
        } else {
            this.f2612a = new C0944e();
        }
    }

    /* renamed from: a */
    public void mo3460a(boolean z) {
        this.f2612a.mo3467a(z);
    }

    /* renamed from: b */
    public void mo3461b(boolean z) {
        this.f2612a.mo3466b(z);
    }

    /* renamed from: androidx.core.view.l0$d */
    /* compiled from: WindowInsetsControllerCompat */
    private static class C0943d extends C0944e {

        /* renamed from: a */
        final C0939l0 f2615a;

        /* renamed from: b */
        final WindowInsetsController f2616b;

        /* renamed from: c */
        private final C5426g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2617c;

        /* renamed from: d */
        protected Window f2618d;

        C0943d(Window window, C0939l0 l0Var) {
            this(window.getInsetsController(), l0Var);
            this.f2618d = window;
        }

        /* renamed from: a */
        public void mo3467a(boolean z) {
            if (z) {
                if (this.f2618d != null) {
                    mo3468c(16);
                }
                this.f2616b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2618d != null) {
                mo3469d(16);
            }
            this.f2616b.setSystemBarsAppearance(0, 16);
        }

        /* renamed from: b */
        public void mo3466b(boolean z) {
            if (z) {
                if (this.f2618d != null) {
                    mo3468c(8192);
                }
                this.f2616b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2618d != null) {
                mo3469d(8192);
            }
            this.f2616b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3468c(int i) {
            View decorView = this.f2618d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3469d(int i) {
            View decorView = this.f2618d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        C0943d(WindowInsetsController windowInsetsController, C0939l0 l0Var) {
            this.f2617c = new C5426g<>();
            this.f2616b = windowInsetsController;
            this.f2615a = l0Var;
        }
    }
}
