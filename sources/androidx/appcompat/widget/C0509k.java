package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0541q0;
import androidx.core.graphics.C0723b;
import p048g.C4288a;
import p048g.C4290c;
import p048g.C4291d;
import p048g.C4292e;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.k */
/* compiled from: AppCompatDrawableManager */
public final class C0509k {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1681b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0509k f1682c;

    /* renamed from: a */
    private C0541q0 f1683a;

    /* renamed from: androidx.appcompat.widget.k$a */
    /* compiled from: AppCompatDrawableManager */
    class C0510a implements C0541q0.C0547f {

        /* renamed from: a */
        private final int[] f1684a = {C4292e.f23828R, C4292e.f23826P, C4292e.f23830a};

        /* renamed from: b */
        private final int[] f1685b = {C4292e.f23844o, C4292e.f23812B, C4292e.f23849t, C4292e.f23845p, C4292e.f23846q, C4292e.f23848s, C4292e.f23847r};

        /* renamed from: c */
        private final int[] f1686c = {C4292e.f23825O, C4292e.f23827Q, C4292e.f23840k, C4292e.f23821K, C4292e.f23822L, C4292e.f23823M, C4292e.f23824N};

        /* renamed from: d */
        private final int[] f1687d = {C4292e.f23852w, C4292e.f23838i, C4292e.f23851v};

        /* renamed from: e */
        private final int[] f1688e = {C4292e.f23820J, C4292e.f23829S};

        /* renamed from: f */
        private final int[] f1689f = {C4292e.f23832c, C4292e.f23836g, C4292e.f23833d, C4292e.f23837h};

        C0510a() {
        }

        /* renamed from: f */
        private boolean m2507f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m2508g(Context context) {
            return m2509h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m2509h(Context context, int i) {
            int c = C0564v0.m2715c(context, C4288a.f23783w);
            int b = C0564v0.m2714b(context, C4288a.f23781u);
            return new ColorStateList(new int[][]{C0564v0.f1856b, C0564v0.f1859e, C0564v0.f1857c, C0564v0.f1863i}, new int[]{b, C0723b.m3312c(c, i), C0723b.m3312c(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m2510i(Context context) {
            return m2509h(context, C0564v0.m2715c(context, C4288a.f23780t));
        }

        /* renamed from: j */
        private ColorStateList m2511j(Context context) {
            return m2509h(context, C0564v0.m2715c(context, C4288a.f23781u));
        }

        /* renamed from: k */
        private ColorStateList m2512k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C4288a.f23785y;
            ColorStateList e = C0564v0.m2717e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0564v0.f1856b;
                iArr2[0] = C0564v0.m2714b(context, i);
                iArr[1] = C0564v0.f1860f;
                iArr2[1] = C0564v0.m2715c(context, C4288a.f23782v);
                iArr[2] = C0564v0.f1863i;
                iArr2[2] = C0564v0.m2715c(context, i);
            } else {
                iArr[0] = C0564v0.f1856b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0564v0.f1860f;
                iArr2[1] = C0564v0.m2715c(context, C4288a.f23782v);
                iArr[2] = C0564v0.f1863i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m2513l(C0541q0 q0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = q0Var.mo2548j(context, C4292e.f23816F);
            Drawable j2 = q0Var.mo2548j(context, C4292e.f23817G);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m2514m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0500i0.m2464a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0509k.f1681b;
            }
            drawable.setColorFilter(C0509k.m2500e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2403a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0509k.f1681b
                int[] r1 = r6.f1684a
                boolean r1 = r6.m2507f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p048g.C4288a.f23784x
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1686c
                boolean r1 = r6.m2507f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p048g.C4288a.f23782v
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1687d
                boolean r1 = r6.m2507f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p048g.C4292e.f23850u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p048g.C4292e.f23841l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0500i0.m2464a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0564v0.m2715c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0509k.m2500e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0509k.C0510a.mo2403a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo2404b(int i) {
            if (i == C4292e.f23818H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo2405c(C0541q0 q0Var, Context context, int i) {
            if (i == C4292e.f23839j) {
                return new LayerDrawable(new Drawable[]{q0Var.mo2548j(context, C4292e.f23838i), q0Var.mo2548j(context, C4292e.f23840k)});
            } else if (i == C4292e.f23854y) {
                return m2513l(q0Var, context, C4291d.f23804i);
            } else {
                if (i == C4292e.f23853x) {
                    return m2513l(q0Var, context, C4291d.f23805j);
                }
                if (i == C4292e.f23855z) {
                    return m2513l(q0Var, context, C4291d.f23806k);
                }
                return null;
            }
        }

        /* renamed from: d */
        public ColorStateList mo2406d(Context context, int i) {
            if (i == C4292e.f23842m) {
                return C4411a.m29345a(context, C4290c.f23792e);
            }
            if (i == C4292e.f23819I) {
                return C4411a.m29345a(context, C4290c.f23795h);
            }
            if (i == C4292e.f23818H) {
                return m2512k(context);
            }
            if (i == C4292e.f23835f) {
                return m2511j(context);
            }
            if (i == C4292e.f23831b) {
                return m2508g(context);
            }
            if (i == C4292e.f23834e) {
                return m2510i(context);
            }
            if (i == C4292e.f23814D || i == C4292e.f23815E) {
                return C4411a.m29345a(context, C4290c.f23794g);
            }
            if (m2507f(this.f1685b, i)) {
                return C0564v0.m2717e(context, C4288a.f23784x);
            }
            if (m2507f(this.f1688e, i)) {
                return C4411a.m29345a(context, C4290c.f23791d);
            }
            if (m2507f(this.f1689f, i)) {
                return C4411a.m29345a(context, C4290c.f23790c);
            }
            if (i == C4292e.f23811A) {
                return C4411a.m29345a(context, C4290c.f23793f);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2407e(Context context, int i, Drawable drawable) {
            if (i == C4292e.f23813C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C4288a.f23784x;
                m2514m(findDrawableByLayerId, C0564v0.m2715c(context, i2), C0509k.f1681b);
                m2514m(layerDrawable.findDrawableByLayerId(16908303), C0564v0.m2715c(context, i2), C0509k.f1681b);
                m2514m(layerDrawable.findDrawableByLayerId(16908301), C0564v0.m2715c(context, C4288a.f23782v), C0509k.f1681b);
                return true;
            } else if (i != C4292e.f23854y && i != C4292e.f23853x && i != C4292e.f23855z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m2514m(layerDrawable2.findDrawableByLayerId(16908288), C0564v0.m2714b(context, C4288a.f23784x), C0509k.f1681b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C4288a.f23782v;
                m2514m(findDrawableByLayerId2, C0564v0.m2715c(context, i3), C0509k.f1681b);
                m2514m(layerDrawable2.findDrawableByLayerId(16908301), C0564v0.m2715c(context, i3), C0509k.f1681b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0509k m2499b() {
        C0509k kVar;
        synchronized (C0509k.class) {
            if (f1682c == null) {
                m2501h();
            }
            kVar = f1682c;
        }
        return kVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m2500e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0509k.class) {
            l = C0541q0.m2636l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m2501h() {
        synchronized (C0509k.class) {
            if (f1682c == null) {
                C0509k kVar = new C0509k();
                f1682c = kVar;
                kVar.f1683a = C0541q0.m2634h();
                f1682c.f1683a.mo2554u(new C0510a());
            }
        }
    }

    /* renamed from: i */
    static void m2502i(Drawable drawable, C0571y0 y0Var, int[] iArr) {
        C0541q0.m2642w(drawable, y0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo2399c(Context context, int i) {
        return this.f1683a.mo2548j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo2400d(Context context, int i, boolean z) {
        return this.f1683a.mo2549k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo2401f(Context context, int i) {
        return this.f1683a.mo2550m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo2402g(Context context) {
        this.f1683a.mo2552s(context);
    }
}
