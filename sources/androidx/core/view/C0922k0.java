package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0724c;
import androidx.core.util.C0825c;
import androidx.core.util.C0831h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.k0 */
/* compiled from: WindowInsetsCompat */
public class C0922k0 {

    /* renamed from: b */
    public static final C0922k0 f2579b;

    /* renamed from: a */
    private final C0934l f2580a;

    /* renamed from: androidx.core.view.k0$a */
    /* compiled from: WindowInsetsCompat */
    static class C0923a {

        /* renamed from: a */
        private static Field f2581a;

        /* renamed from: b */
        private static Field f2582b;

        /* renamed from: c */
        private static Field f2583c;

        /* renamed from: d */
        private static boolean f2584d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2581a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2582b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2583c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C0922k0 m4181a(View view) {
            if (f2584d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2581a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2582b.get(obj);
                        Rect rect2 = (Rect) f2583c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C0922k0 a = new C0924b().mo3429b(C0724c.m3318c(rect)).mo3430c(C0724c.m3318c(rect2)).mo3428a();
                            a.mo3425r(a);
                            a.mo3410d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.k0$e */
    /* compiled from: WindowInsetsCompat */
    private static class C0927e extends C0926d {
        C0927e() {
        }

        C0927e(C0922k0 k0Var) {
            super(k0Var);
        }
    }

    /* renamed from: androidx.core.view.k0$f */
    /* compiled from: WindowInsetsCompat */
    private static class C0928f {

        /* renamed from: a */
        private final C0922k0 f2593a;

        /* renamed from: b */
        C0724c[] f2594b;

        C0928f() {
            this(new C0922k0((C0922k0) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo3437a() {
            C0724c[] cVarArr = this.f2594b;
            if (cVarArr != null) {
                C0724c cVar = cVarArr[C0935m.m4249a(1)];
                C0724c cVar2 = this.f2594b[C0935m.m4249a(2)];
                if (cVar2 == null) {
                    cVar2 = this.f2593a.mo3413f(2);
                }
                if (cVar == null) {
                    cVar = this.f2593a.mo3413f(1);
                }
                mo3433f(C0724c.m3316a(cVar, cVar2));
                C0724c cVar3 = this.f2594b[C0935m.m4249a(16)];
                if (cVar3 != null) {
                    mo3435e(cVar3);
                }
                C0724c cVar4 = this.f2594b[C0935m.m4249a(32)];
                if (cVar4 != null) {
                    mo3434c(cVar4);
                }
                C0724c cVar5 = this.f2594b[C0935m.m4249a(64)];
                if (cVar5 != null) {
                    mo3436g(cVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0922k0 mo3431b() {
            mo3437a();
            return this.f2593a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3434c(C0724c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3432d(C0724c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3435e(C0724c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3433f(C0724c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3436g(C0724c cVar) {
        }

        C0928f(C0922k0 k0Var) {
            this.f2593a = k0Var;
        }
    }

    /* renamed from: androidx.core.view.k0$i */
    /* compiled from: WindowInsetsCompat */
    private static class C0931i extends C0930h {
        C0931i(C0922k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0922k0 mo3454a() {
            return C0922k0.m4160u(this.f2600c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0931i)) {
                return false;
            }
            C0931i iVar = (C0931i) obj;
            if (!Objects.equals(this.f2600c, iVar.f2600c) || !Objects.equals(this.f2604g, iVar.f2604g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0897d mo3455f() {
            return C0897d.m4068e(this.f2600c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2600c.hashCode();
        }

        C0931i(C0922k0 k0Var, C0931i iVar) {
            super(k0Var, (C0930h) iVar);
        }
    }

    /* renamed from: androidx.core.view.k0$k */
    /* compiled from: WindowInsetsCompat */
    private static class C0933k extends C0932j {

        /* renamed from: q */
        static final C0922k0 f2609q = C0922k0.m4160u(WindowInsets.CONSUMED);

        C0933k(C0922k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo3438d(View view) {
        }

        /* renamed from: g */
        public C0724c mo3441g(int i) {
            return C0724c.m3319d(this.f2600c.getInsets(C0936n.m4250a(i)));
        }

        C0933k(C0922k0 k0Var, C0933k kVar) {
            super(k0Var, (C0932j) kVar);
        }
    }

    /* renamed from: androidx.core.view.k0$l */
    /* compiled from: WindowInsetsCompat */
    private static class C0934l {

        /* renamed from: b */
        static final C0922k0 f2610b = new C0924b().mo3428a().mo3407a().mo3408b().mo3409c();

        /* renamed from: a */
        final C0922k0 f2611a;

        C0934l(C0922k0 k0Var) {
            this.f2611a = k0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0922k0 mo3454a() {
            return this.f2611a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0922k0 mo3449b() {
            return this.f2611a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0922k0 mo3450c() {
            return this.f2611a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3438d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3439e(C0922k0 k0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0934l)) {
                return false;
            }
            C0934l lVar = (C0934l) obj;
            if (mo3444o() != lVar.mo3444o() || mo3452n() != lVar.mo3452n() || !C0825c.m3642a(mo3442k(), lVar.mo3442k()) || !C0825c.m3642a(mo3451i(), lVar.mo3451i()) || !C0825c.m3642a(mo3455f(), lVar.mo3455f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0897d mo3455f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0724c mo3441g(int i) {
            return C0724c.f2265e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0724c mo3457h() {
            return mo3442k();
        }

        public int hashCode() {
            return C0825c.m3643b(Boolean.valueOf(mo3444o()), Boolean.valueOf(mo3452n()), mo3442k(), mo3451i(), mo3455f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0724c mo3451i() {
            return C0724c.f2265e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0724c mo3458j() {
            return mo3442k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0724c mo3442k() {
            return C0724c.f2265e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0724c mo3459l() {
            return mo3442k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0922k0 mo3443m(int i, int i2, int i3, int i4) {
            return f2610b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo3452n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo3444o() {
            return false;
        }

        /* renamed from: p */
        public void mo3445p(C0724c[] cVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3446q(C0724c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3447r(C0922k0 k0Var) {
        }

        /* renamed from: s */
        public void mo3453s(C0724c cVar) {
        }
    }

    /* renamed from: androidx.core.view.k0$m */
    /* compiled from: WindowInsetsCompat */
    public static final class C0935m {
        /* renamed from: a */
        static int m4249a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    /* renamed from: androidx.core.view.k0$n */
    /* compiled from: WindowInsetsCompat */
    private static final class C0936n {
        /* renamed from: a */
        static int m4250a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2579b = C0933k.f2609q;
        } else {
            f2579b = C0934l.f2610b;
        }
    }

    private C0922k0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f2580a = new C0933k(this, windowInsets);
        } else if (i >= 29) {
            this.f2580a = new C0932j(this, windowInsets);
        } else if (i >= 28) {
            this.f2580a = new C0931i(this, windowInsets);
        } else if (i >= 21) {
            this.f2580a = new C0930h(this, windowInsets);
        } else if (i >= 20) {
            this.f2580a = new C0929g(this, windowInsets);
        } else {
            this.f2580a = new C0934l(this);
        }
    }

    /* renamed from: m */
    static C0724c m4159m(C0724c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f2266a - i);
        int max2 = Math.max(0, cVar.f2267b - i2);
        int max3 = Math.max(0, cVar.f2268c - i3);
        int max4 = Math.max(0, cVar.f2269d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return cVar;
        }
        return C0724c.m3317b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C0922k0 m4160u(WindowInsets windowInsets) {
        return m4161v(windowInsets, (View) null);
    }

    /* renamed from: v */
    public static C0922k0 m4161v(WindowInsets windowInsets, View view) {
        C0922k0 k0Var = new C0922k0((WindowInsets) C0831h.m3662f(windowInsets));
        if (view != null && C0835a0.m3704Q(view)) {
            k0Var.mo3425r(C0835a0.m3694H(view));
            k0Var.mo3410d(view.getRootView());
        }
        return k0Var;
    }

    @Deprecated
    /* renamed from: a */
    public C0922k0 mo3407a() {
        return this.f2580a.mo3454a();
    }

    @Deprecated
    /* renamed from: b */
    public C0922k0 mo3408b() {
        return this.f2580a.mo3449b();
    }

    @Deprecated
    /* renamed from: c */
    public C0922k0 mo3409c() {
        return this.f2580a.mo3450c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3410d(View view) {
        this.f2580a.mo3438d(view);
    }

    /* renamed from: e */
    public C0897d mo3411e() {
        return this.f2580a.mo3455f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0922k0)) {
            return false;
        }
        return C0825c.m3642a(this.f2580a, ((C0922k0) obj).f2580a);
    }

    /* renamed from: f */
    public C0724c mo3413f(int i) {
        return this.f2580a.mo3441g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C0724c mo3414g() {
        return this.f2580a.mo3451i();
    }

    @Deprecated
    /* renamed from: h */
    public int mo3415h() {
        return this.f2580a.mo3442k().f2269d;
    }

    public int hashCode() {
        C0934l lVar = this.f2580a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo3417i() {
        return this.f2580a.mo3442k().f2266a;
    }

    @Deprecated
    /* renamed from: j */
    public int mo3418j() {
        return this.f2580a.mo3442k().f2268c;
    }

    @Deprecated
    /* renamed from: k */
    public int mo3419k() {
        return this.f2580a.mo3442k().f2267b;
    }

    /* renamed from: l */
    public C0922k0 mo3420l(int i, int i2, int i3, int i4) {
        return this.f2580a.mo3443m(i, i2, i3, i4);
    }

    /* renamed from: n */
    public boolean mo3421n() {
        return this.f2580a.mo3452n();
    }

    @Deprecated
    /* renamed from: o */
    public C0922k0 mo3422o(int i, int i2, int i3, int i4) {
        return new C0924b(this).mo3430c(C0724c.m3317b(i, i2, i3, i4)).mo3428a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3423p(C0724c[] cVarArr) {
        this.f2580a.mo3445p(cVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3424q(C0724c cVar) {
        this.f2580a.mo3446q(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3425r(C0922k0 k0Var) {
        this.f2580a.mo3447r(k0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3426s(C0724c cVar) {
        this.f2580a.mo3453s(cVar);
    }

    /* renamed from: t */
    public WindowInsets mo3427t() {
        C0934l lVar = this.f2580a;
        if (lVar instanceof C0929g) {
            return ((C0929g) lVar).f2600c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.k0$c */
    /* compiled from: WindowInsetsCompat */
    private static class C0925c extends C0928f {

        /* renamed from: e */
        private static Field f2586e = null;

        /* renamed from: f */
        private static boolean f2587f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f2588g = null;

        /* renamed from: h */
        private static boolean f2589h = false;

        /* renamed from: c */
        private WindowInsets f2590c;

        /* renamed from: d */
        private C0724c f2591d;

        C0925c() {
            this.f2590c = m4185h();
        }

        /* renamed from: h */
        private static WindowInsets m4185h() {
            if (!f2587f) {
                try {
                    f2586e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2587f = true;
            }
            Field field = f2586e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2589h) {
                try {
                    f2588g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2589h = true;
            }
            Constructor<WindowInsets> constructor = f2588g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0922k0 mo3431b() {
            mo3437a();
            C0922k0 u = C0922k0.m4160u(this.f2590c);
            u.mo3423p(this.f2594b);
            u.mo3426s(this.f2591d);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3432d(C0724c cVar) {
            this.f2591d = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3433f(C0724c cVar) {
            WindowInsets windowInsets = this.f2590c;
            if (windowInsets != null) {
                this.f2590c = windowInsets.replaceSystemWindowInsets(cVar.f2266a, cVar.f2267b, cVar.f2268c, cVar.f2269d);
            }
        }

        C0925c(C0922k0 k0Var) {
            super(k0Var);
            this.f2590c = k0Var.mo3427t();
        }
    }

    /* renamed from: androidx.core.view.k0$d */
    /* compiled from: WindowInsetsCompat */
    private static class C0926d extends C0928f {

        /* renamed from: c */
        final WindowInsets.Builder f2592c;

        C0926d() {
            this.f2592c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0922k0 mo3431b() {
            mo3437a();
            C0922k0 u = C0922k0.m4160u(this.f2592c.build());
            u.mo3423p(this.f2594b);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3434c(C0724c cVar) {
            this.f2592c.setMandatorySystemGestureInsets(cVar.mo3053e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3432d(C0724c cVar) {
            this.f2592c.setStableInsets(cVar.mo3053e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3435e(C0724c cVar) {
            this.f2592c.setSystemGestureInsets(cVar.mo3053e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3433f(C0724c cVar) {
            this.f2592c.setSystemWindowInsets(cVar.mo3053e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3436g(C0724c cVar) {
            this.f2592c.setTappableElementInsets(cVar.mo3053e());
        }

        C0926d(C0922k0 k0Var) {
            super(k0Var);
            WindowInsets.Builder builder;
            WindowInsets t = k0Var.mo3427t();
            if (t != null) {
                builder = new WindowInsets.Builder(t);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2592c = builder;
        }
    }

    /* renamed from: androidx.core.view.k0$h */
    /* compiled from: WindowInsetsCompat */
    private static class C0930h extends C0929g {

        /* renamed from: m */
        private C0724c f2605m = null;

        C0930h(C0922k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0922k0 mo3449b() {
            return C0922k0.m4160u(this.f2600c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0922k0 mo3450c() {
            return C0922k0.m4160u(this.f2600c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C0724c mo3451i() {
            if (this.f2605m == null) {
                this.f2605m = C0724c.m3317b(this.f2600c.getStableInsetLeft(), this.f2600c.getStableInsetTop(), this.f2600c.getStableInsetRight(), this.f2600c.getStableInsetBottom());
            }
            return this.f2605m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo3452n() {
            return this.f2600c.isConsumed();
        }

        /* renamed from: s */
        public void mo3453s(C0724c cVar) {
            this.f2605m = cVar;
        }

        C0930h(C0922k0 k0Var, C0930h hVar) {
            super(k0Var, (C0929g) hVar);
            this.f2605m = hVar.f2605m;
        }
    }

    /* renamed from: androidx.core.view.k0$g */
    /* compiled from: WindowInsetsCompat */
    private static class C0929g extends C0934l {

        /* renamed from: h */
        private static boolean f2595h = false;

        /* renamed from: i */
        private static Method f2596i;

        /* renamed from: j */
        private static Class<?> f2597j;

        /* renamed from: k */
        private static Field f2598k;

        /* renamed from: l */
        private static Field f2599l;

        /* renamed from: c */
        final WindowInsets f2600c;

        /* renamed from: d */
        private C0724c[] f2601d;

        /* renamed from: e */
        private C0724c f2602e;

        /* renamed from: f */
        private C0922k0 f2603f;

        /* renamed from: g */
        C0724c f2604g;

        C0929g(C0922k0 k0Var, WindowInsets windowInsets) {
            super(k0Var);
            this.f2602e = null;
            this.f2600c = windowInsets;
        }

        /* renamed from: t */
        private C0724c m4202t(int i, boolean z) {
            C0724c cVar = C0724c.f2265e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    cVar = C0724c.m3316a(cVar, mo3448u(i2, z));
                }
            }
            return cVar;
        }

        /* renamed from: v */
        private C0724c m4203v() {
            C0922k0 k0Var = this.f2603f;
            if (k0Var != null) {
                return k0Var.mo3414g();
            }
            return C0724c.f2265e;
        }

        /* renamed from: w */
        private C0724c m4204w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2595h) {
                    m4205x();
                }
                Method method = f2596i;
                if (!(method == null || f2597j == null || f2598k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2598k.get(f2599l.get(invoke));
                        if (rect != null) {
                            return C0724c.m3318c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: x */
        private static void m4205x() {
            try {
                f2596i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2597j = cls;
                f2598k = cls.getDeclaredField("mVisibleInsets");
                f2599l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2598k.setAccessible(true);
                f2599l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f2595h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3438d(View view) {
            C0724c w = m4204w(view);
            if (w == null) {
                w = C0724c.f2265e;
            }
            mo3446q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3439e(C0922k0 k0Var) {
            k0Var.mo3425r(this.f2603f);
            k0Var.mo3424q(this.f2604g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2604g, ((C0929g) obj).f2604g);
        }

        /* renamed from: g */
        public C0724c mo3441g(int i) {
            return m4202t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C0724c mo3442k() {
            if (this.f2602e == null) {
                this.f2602e = C0724c.m3317b(this.f2600c.getSystemWindowInsetLeft(), this.f2600c.getSystemWindowInsetTop(), this.f2600c.getSystemWindowInsetRight(), this.f2600c.getSystemWindowInsetBottom());
            }
            return this.f2602e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0922k0 mo3443m(int i, int i2, int i3, int i4) {
            C0924b bVar = new C0924b(C0922k0.m4160u(this.f2600c));
            bVar.mo3430c(C0922k0.m4159m(mo3442k(), i, i2, i3, i4));
            bVar.mo3429b(C0922k0.m4159m(mo3451i(), i, i2, i3, i4));
            return bVar.mo3428a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo3444o() {
            return this.f2600c.isRound();
        }

        /* renamed from: p */
        public void mo3445p(C0724c[] cVarArr) {
            this.f2601d = cVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3446q(C0724c cVar) {
            this.f2604g = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3447r(C0922k0 k0Var) {
            this.f2603f = k0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C0724c mo3448u(int i, boolean z) {
            int i2;
            C0897d dVar;
            if (i != 1) {
                C0724c cVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C0724c[] cVarArr = this.f2601d;
                        if (cVarArr != null) {
                            cVar = cVarArr[C0935m.m4249a(8)];
                        }
                        if (cVar != null) {
                            return cVar;
                        }
                        C0724c k = mo3442k();
                        C0724c v = m4203v();
                        int i3 = k.f2269d;
                        if (i3 > v.f2269d) {
                            return C0724c.m3317b(0, 0, 0, i3);
                        }
                        C0724c cVar2 = this.f2604g;
                        if (cVar2 == null || cVar2.equals(C0724c.f2265e) || (i2 = this.f2604g.f2269d) <= v.f2269d) {
                            return C0724c.f2265e;
                        }
                        return C0724c.m3317b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo3458j();
                    } else {
                        if (i == 32) {
                            return mo3457h();
                        }
                        if (i == 64) {
                            return mo3459l();
                        }
                        if (i != 128) {
                            return C0724c.f2265e;
                        }
                        C0922k0 k0Var = this.f2603f;
                        if (k0Var != null) {
                            dVar = k0Var.mo3411e();
                        } else {
                            dVar = mo3455f();
                        }
                        if (dVar != null) {
                            return C0724c.m3317b(dVar.mo3378b(), dVar.mo3380d(), dVar.mo3379c(), dVar.mo3377a());
                        }
                        return C0724c.f2265e;
                    }
                } else if (z) {
                    C0724c v2 = m4203v();
                    C0724c i4 = mo3451i();
                    return C0724c.m3317b(Math.max(v2.f2266a, i4.f2266a), 0, Math.max(v2.f2268c, i4.f2268c), Math.max(v2.f2269d, i4.f2269d));
                } else {
                    C0724c k2 = mo3442k();
                    C0922k0 k0Var2 = this.f2603f;
                    if (k0Var2 != null) {
                        cVar = k0Var2.mo3414g();
                    }
                    int i5 = k2.f2269d;
                    if (cVar != null) {
                        i5 = Math.min(i5, cVar.f2269d);
                    }
                    return C0724c.m3317b(k2.f2266a, 0, k2.f2268c, i5);
                }
            } else if (z) {
                return C0724c.m3317b(0, Math.max(m4203v().f2267b, mo3442k().f2267b), 0, 0);
            } else {
                return C0724c.m3317b(0, mo3442k().f2267b, 0, 0);
            }
        }

        C0929g(C0922k0 k0Var, C0929g gVar) {
            this(k0Var, new WindowInsets(gVar.f2600c));
        }
    }

    /* renamed from: androidx.core.view.k0$j */
    /* compiled from: WindowInsetsCompat */
    private static class C0932j extends C0931i {

        /* renamed from: n */
        private C0724c f2606n = null;

        /* renamed from: o */
        private C0724c f2607o = null;

        /* renamed from: p */
        private C0724c f2608p = null;

        C0932j(C0922k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0724c mo3457h() {
            if (this.f2607o == null) {
                this.f2607o = C0724c.m3319d(this.f2600c.getMandatorySystemGestureInsets());
            }
            return this.f2607o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0724c mo3458j() {
            if (this.f2606n == null) {
                this.f2606n = C0724c.m3319d(this.f2600c.getSystemGestureInsets());
            }
            return this.f2606n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0724c mo3459l() {
            if (this.f2608p == null) {
                this.f2608p = C0724c.m3319d(this.f2600c.getTappableElementInsets());
            }
            return this.f2608p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0922k0 mo3443m(int i, int i2, int i3, int i4) {
            return C0922k0.m4160u(this.f2600c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo3453s(C0724c cVar) {
        }

        C0932j(C0922k0 k0Var, C0932j jVar) {
            super(k0Var, (C0931i) jVar);
        }
    }

    /* renamed from: androidx.core.view.k0$b */
    /* compiled from: WindowInsetsCompat */
    public static final class C0924b {

        /* renamed from: a */
        private final C0928f f2585a;

        public C0924b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f2585a = new C0927e();
            } else if (i >= 29) {
                this.f2585a = new C0926d();
            } else if (i >= 20) {
                this.f2585a = new C0925c();
            } else {
                this.f2585a = new C0928f();
            }
        }

        /* renamed from: a */
        public C0922k0 mo3428a() {
            return this.f2585a.mo3431b();
        }

        @Deprecated
        /* renamed from: b */
        public C0924b mo3429b(C0724c cVar) {
            this.f2585a.mo3432d(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0924b mo3430c(C0724c cVar) {
            this.f2585a.mo3433f(cVar);
            return this;
        }

        public C0924b(C0922k0 k0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f2585a = new C0927e(k0Var);
            } else if (i >= 29) {
                this.f2585a = new C0926d(k0Var);
            } else if (i >= 20) {
                this.f2585a = new C0925c(k0Var);
            } else {
                this.f2585a = new C0928f(k0Var);
            }
        }
    }

    public C0922k0(C0922k0 k0Var) {
        if (k0Var != null) {
            C0934l lVar = k0Var.f2580a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C0933k)) {
                this.f2580a = new C0933k(this, (C0933k) lVar);
            } else if (i >= 29 && (lVar instanceof C0932j)) {
                this.f2580a = new C0932j(this, (C0932j) lVar);
            } else if (i >= 28 && (lVar instanceof C0931i)) {
                this.f2580a = new C0931i(this, (C0931i) lVar);
            } else if (i >= 21 && (lVar instanceof C0930h)) {
                this.f2580a = new C0930h(this, (C0930h) lVar);
            } else if (i < 20 || !(lVar instanceof C0929g)) {
                this.f2580a = new C0934l(this);
            } else {
                this.f2580a = new C0929g(this, (C0929g) lVar);
            }
            lVar.mo3439e(this);
            return;
        }
        this.f2580a = new C0934l(this);
    }
}
