package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0681a;
import androidx.core.graphics.drawable.C0732a;
import androidx.vectordrawable.graphics.drawable.C1485b;
import androidx.vectordrawable.graphics.drawable.C1495h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p062i.C4627a;
import p068j.C4710c;
import p068j.C4711d;
import p124r.C5418d;
import p124r.C5419e;
import p124r.C5426g;
import p124r.C5427h;

/* renamed from: androidx.appcompat.widget.q0 */
/* compiled from: ResourceManagerInternal */
public final class C0541q0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f1781h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0541q0 f1782i;

    /* renamed from: j */
    private static final C0544c f1783j = new C0544c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C5427h<ColorStateList>> f1784a;

    /* renamed from: b */
    private C5426g<String, C0546e> f1785b;

    /* renamed from: c */
    private C5427h<String> f1786c;

    /* renamed from: d */
    private final WeakHashMap<Context, C5418d<WeakReference<Drawable.ConstantState>>> f1787d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1788e;

    /* renamed from: f */
    private boolean f1789f;

    /* renamed from: g */
    private C0547f f1790g;

    /* renamed from: androidx.appcompat.widget.q0$a */
    /* compiled from: ResourceManagerInternal */
    static class C0542a implements C0546e {
        C0542a() {
        }

        /* renamed from: a */
        public Drawable mo2556a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4627a.m30151m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0543b implements C0546e {
        C0543b() {
        }

        /* renamed from: a */
        public Drawable mo2556a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1485b.m6887a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0544c extends C5419e<Integer, PorterDuffColorFilter> {
        public C0544c(int i) {
            super(i);
        }

        /* renamed from: j */
        private static int m2653j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public PorterDuffColorFilter mo2557k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo19586c(Integer.valueOf(m2653j(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public PorterDuffColorFilter mo2558l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo19587d(Integer.valueOf(m2653j(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$d */
    /* compiled from: ResourceManagerInternal */
    static class C0545d implements C0546e {
        C0545d() {
        }

        /* renamed from: a */
        public Drawable mo2556a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0545d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        C4710c.m30438c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$e */
    /* compiled from: ResourceManagerInternal */
    private interface C0546e {
        /* renamed from: a */
        Drawable mo2556a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.q0$f */
    /* compiled from: ResourceManagerInternal */
    public interface C0547f {
        /* renamed from: a */
        boolean mo2403a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo2404b(int i);

        /* renamed from: c */
        Drawable mo2405c(C0541q0 q0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo2406d(Context context, int i);

        /* renamed from: e */
        boolean mo2407e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.q0$g */
    /* compiled from: ResourceManagerInternal */
    private static class C0548g implements C0546e {
        C0548g() {
        }

        /* renamed from: a */
        public Drawable mo2556a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1495h.m6920c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m2627a(String str, C0546e eVar) {
        if (this.f1785b == null) {
            this.f1785b = new C5426g<>();
        }
        this.f1785b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m2628b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C5418d dVar = this.f1787d.get(context);
        if (dVar == null) {
            dVar = new C5418d();
            this.f1787d.put(context, dVar);
        }
        dVar.mo19578i(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    private void m2629c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1784a == null) {
            this.f1784a = new WeakHashMap<>();
        }
        C5427h hVar = this.f1784a.get(context);
        if (hVar == null) {
            hVar = new C5427h();
            this.f1784a.put(context, hVar);
        }
        hVar.mo19681a(i, colorStateList);
    }

    /* renamed from: d */
    private void m2630d(Context context) {
        if (!this.f1789f) {
            this.f1789f = true;
            Drawable j = mo2548j(context, C4711d.f25273a);
            if (j == null || !m2639q(j)) {
                this.f1789f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m2631e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m2632f(Context context, int i) {
        Drawable drawable;
        if (this.f1788e == null) {
            this.f1788e = new TypedValue();
        }
        TypedValue typedValue = this.f1788e;
        context.getResources().getValue(i, typedValue, true);
        long e = m2631e(typedValue);
        Drawable i2 = m2635i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0547f fVar = this.f1790g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo2405c(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m2628b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m2633g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2636l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0541q0 m2634h() {
        C0541q0 q0Var;
        synchronized (C0541q0.class) {
            if (f1782i == null) {
                C0541q0 q0Var2 = new C0541q0();
                f1782i = q0Var2;
                m2638p(q0Var2);
            }
            q0Var = f1782i;
        }
        return q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m2635i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, r.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1787d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            r.d r0 = (p124r.C5418d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo19574e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo19579j(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0541q0.m2635i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m2636l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (C0541q0.class) {
            C0544c cVar = f1783j;
            k = cVar.mo2557k(i, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i, mode);
                cVar.mo2558l(i, mode, k);
            }
        }
        return k;
    }

    /* renamed from: n */
    private ColorStateList m2637n(Context context, int i) {
        C5427h hVar;
        WeakHashMap<Context, C5427h<ColorStateList>> weakHashMap = this.f1784a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo19685e(i);
    }

    /* renamed from: p */
    private static void m2638p(C0541q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.m2627a("vector", new C0548g());
            q0Var.m2627a("animated-vector", new C0543b());
            q0Var.m2627a("animated-selector", new C0542a());
            q0Var.m2627a("drawable", new C0545d());
        }
    }

    /* renamed from: q */
    private static boolean m2639q(Drawable drawable) {
        return (drawable instanceof C1495h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2640r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            r.g<java.lang.String, androidx.appcompat.widget.q0$e> r0 = r10.f1785b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            r.h<java.lang.String> r0 = r10.f1786c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo19685e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            r.g<java.lang.String, androidx.appcompat.widget.q0$e> r3 = r10.f1785b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            r.h r0 = new r.h
            r0.<init>()
            r10.f1786c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1788e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1788e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1788e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m2631e(r0)
            android.graphics.drawable.Drawable r6 = r10.m2635i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            r.h<java.lang.String> r8 = r10.f1786c     // Catch:{ Exception -> 0x00a2 }
            r8.mo19681a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            r.g<java.lang.String, androidx.appcompat.widget.q0$e> r8 = r10.f1785b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.q0$e r3 = (androidx.appcompat.widget.C0541q0.C0546e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2556a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m2628b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            r.h<java.lang.String> r11 = r10.f1786c
            r11.mo19681a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0541q0.m2640r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m2641v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2550m(context, i);
        if (m != null) {
            if (C0500i0.m2464a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0732a.m3380r(drawable);
            C0732a.m3377o(r, m);
            PorterDuff.Mode o = mo2551o(i);
            if (o == null) {
                return r;
            }
            C0732a.m3378p(r, o);
            return r;
        }
        C0547f fVar = this.f1790g;
        if ((fVar == null || !fVar.mo2407e(context, i, drawable)) && !mo2555x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m2642w(Drawable drawable, C0571y0 y0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (C0500i0.m2464a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = y0Var.f1874d;
        if (z || y0Var.f1873c) {
            drawable.setColorFilter(m2633g(z ? y0Var.f1871a : null, y0Var.f1873c ? y0Var.f1872b : f1781h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable mo2548j(Context context, int i) {
        return mo2549k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2549k(Context context, int i, boolean z) {
        Drawable r;
        m2630d(context);
        r = m2640r(context, i);
        if (r == null) {
            r = m2632f(context, i);
        }
        if (r == null) {
            r = C0681a.m3150f(context, i);
        }
        if (r != null) {
            r = m2641v(context, i, z, r);
        }
        if (r != null) {
            C0500i0.m2465b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2550m(Context context, int i) {
        ColorStateList n;
        n = m2637n(context, i);
        if (n == null) {
            C0547f fVar = this.f1790g;
            n = fVar == null ? null : fVar.mo2406d(context, i);
            if (n != null) {
                m2629c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2551o(int i) {
        C0547f fVar = this.f1790g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo2404b(i);
    }

    /* renamed from: s */
    public synchronized void mo2552s(Context context) {
        C5418d dVar = this.f1787d.get(context);
        if (dVar != null) {
            dVar.mo19571b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2553t(Context context, C0501i1 i1Var, int i) {
        Drawable r = m2640r(context, i);
        if (r == null) {
            r = i1Var.mo2568a(i);
        }
        if (r == null) {
            return null;
        }
        return m2641v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2554u(C0547f fVar) {
        this.f1790g = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2555x(Context context, int i, Drawable drawable) {
        C0547f fVar = this.f1790g;
        return fVar != null && fVar.mo2403a(context, i, drawable);
    }
}
