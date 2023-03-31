package p062i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0732a;

/* renamed from: i.b */
/* compiled from: DrawableContainer */
class C4635b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private C4639d f25086a;

    /* renamed from: b */
    private Rect f25087b;

    /* renamed from: c */
    private Drawable f25088c;

    /* renamed from: d */
    private Drawable f25089d;

    /* renamed from: e */
    private int f25090e = 255;

    /* renamed from: f */
    private boolean f25091f;

    /* renamed from: g */
    private int f25092g = -1;

    /* renamed from: h */
    private boolean f25093h;

    /* renamed from: i */
    private Runnable f25094i;

    /* renamed from: r */
    private long f25095r;

    /* renamed from: s */
    private long f25096s;

    /* renamed from: t */
    private C4638c f25097t;

    /* renamed from: i.b$a */
    /* compiled from: DrawableContainer */
    class C4636a implements Runnable {
        C4636a() {
        }

        public void run() {
            C4635b.this.mo18246a(true);
            C4635b.this.invalidateSelf();
        }
    }

    /* renamed from: i.b$b */
    /* compiled from: DrawableContainer */
    private static class C4637b {
        /* renamed from: a */
        public static boolean m30195a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m30196b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m30197c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: i.b$c */
    /* compiled from: DrawableContainer */
    static class C4638c implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f25099a;

        C4638c() {
        }

        /* renamed from: a */
        public Drawable.Callback mo18254a() {
            Drawable.Callback callback = this.f25099a;
            this.f25099a = null;
            return callback;
        }

        /* renamed from: b */
        public C4638c mo18255b(Drawable.Callback callback) {
            this.f25099a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f25099a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f25099a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: i.b$d */
    /* compiled from: DrawableContainer */
    static abstract class C4639d extends Drawable.ConstantState {

        /* renamed from: A */
        int f25100A = 0;

        /* renamed from: B */
        int f25101B = 0;

        /* renamed from: C */
        boolean f25102C;

        /* renamed from: D */
        ColorFilter f25103D;

        /* renamed from: E */
        boolean f25104E;

        /* renamed from: F */
        ColorStateList f25105F;

        /* renamed from: G */
        PorterDuff.Mode f25106G;

        /* renamed from: H */
        boolean f25107H;

        /* renamed from: I */
        boolean f25108I;

        /* renamed from: a */
        final C4635b f25109a;

        /* renamed from: b */
        Resources f25110b;

        /* renamed from: c */
        int f25111c;

        /* renamed from: d */
        int f25112d;

        /* renamed from: e */
        int f25113e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f25114f;

        /* renamed from: g */
        Drawable[] f25115g;

        /* renamed from: h */
        int f25116h;

        /* renamed from: i */
        boolean f25117i = false;

        /* renamed from: j */
        boolean f25118j;

        /* renamed from: k */
        Rect f25119k;

        /* renamed from: l */
        boolean f25120l = false;

        /* renamed from: m */
        boolean f25121m;

        /* renamed from: n */
        int f25122n;

        /* renamed from: o */
        int f25123o;

        /* renamed from: p */
        int f25124p;

        /* renamed from: q */
        int f25125q;

        /* renamed from: r */
        boolean f25126r;

        /* renamed from: s */
        int f25127s;

        /* renamed from: t */
        boolean f25128t;

        /* renamed from: u */
        boolean f25129u;

        /* renamed from: v */
        boolean f25130v;

        /* renamed from: w */
        boolean f25131w;

        /* renamed from: x */
        boolean f25132x = true;

        /* renamed from: y */
        boolean f25133y;

        /* renamed from: z */
        int f25134z;

        C4639d(C4639d dVar, C4635b bVar, Resources resources) {
            Resources resources2;
            this.f25109a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f25110b : null;
            }
            this.f25110b = resources2;
            int f = C4635b.m30188f(resources, dVar != null ? dVar.f25111c : 0);
            this.f25111c = f;
            if (dVar != null) {
                this.f25112d = dVar.f25112d;
                this.f25113e = dVar.f25113e;
                this.f25130v = true;
                this.f25131w = true;
                this.f25117i = dVar.f25117i;
                this.f25120l = dVar.f25120l;
                this.f25132x = dVar.f25132x;
                this.f25133y = dVar.f25133y;
                this.f25134z = dVar.f25134z;
                this.f25100A = dVar.f25100A;
                this.f25101B = dVar.f25101B;
                this.f25102C = dVar.f25102C;
                this.f25103D = dVar.f25103D;
                this.f25104E = dVar.f25104E;
                this.f25105F = dVar.f25105F;
                this.f25106G = dVar.f25106G;
                this.f25107H = dVar.f25107H;
                this.f25108I = dVar.f25108I;
                if (dVar.f25111c == f) {
                    if (dVar.f25118j) {
                        this.f25119k = dVar.f25119k != null ? new Rect(dVar.f25119k) : rect;
                        this.f25118j = true;
                    }
                    if (dVar.f25121m) {
                        this.f25122n = dVar.f25122n;
                        this.f25123o = dVar.f25123o;
                        this.f25124p = dVar.f25124p;
                        this.f25125q = dVar.f25125q;
                        this.f25121m = true;
                    }
                }
                if (dVar.f25126r) {
                    this.f25127s = dVar.f25127s;
                    this.f25126r = true;
                }
                if (dVar.f25128t) {
                    this.f25129u = dVar.f25129u;
                    this.f25128t = true;
                }
                Drawable[] drawableArr = dVar.f25115g;
                this.f25115g = new Drawable[drawableArr.length];
                this.f25116h = dVar.f25116h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f25114f;
                if (sparseArray != null) {
                    this.f25114f = sparseArray.clone();
                } else {
                    this.f25114f = new SparseArray<>(this.f25116h);
                }
                int i = this.f25116h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f25114f.put(i2, constantState);
                        } else {
                            this.f25115g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f25115g = new Drawable[10];
            this.f25116h = 0;
        }

        /* renamed from: e */
        private void m30200e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f25114f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f25115g[this.f25114f.keyAt(i)] = m30201s(this.f25114f.valueAt(i).newDrawable(this.f25110b));
                }
                this.f25114f = null;
            }
        }

        /* renamed from: s */
        private Drawable m30201s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0732a.m3375m(drawable, this.f25134z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f25109a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo18259a(Drawable drawable) {
            int i = this.f25116h;
            if (i >= this.f25115g.length) {
                mo18274o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f25109a);
            this.f25115g[i] = drawable;
            this.f25116h++;
            this.f25113e = drawable.getChangingConfigurations() | this.f25113e;
            mo18275p();
            this.f25119k = null;
            this.f25118j = false;
            this.f25121m = false;
            this.f25130v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo18260b(Resources.Theme theme) {
            if (theme != null) {
                m30200e();
                int i = this.f25116h;
                Drawable[] drawableArr = this.f25115g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C0732a.m3364b(drawableArr[i2])) {
                        C0732a.m3363a(drawableArr[i2], theme);
                        this.f25113e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo18282y(C4637b.m30197c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo18261c() {
            if (this.f25130v) {
                return this.f25131w;
            }
            m30200e();
            this.f25130v = true;
            int i = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f25131w = false;
                    return false;
                }
            }
            this.f25131w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f25114f.get(i2);
                    if (constantState != null && C4637b.m30195a(constantState)) {
                        return true;
                    }
                } else if (C0732a.m3364b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo18263d() {
            this.f25121m = true;
            m30200e();
            int i = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            this.f25123o = -1;
            this.f25122n = -1;
            this.f25125q = 0;
            this.f25124p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f25122n) {
                    this.f25122n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f25123o) {
                    this.f25123o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f25124p) {
                    this.f25124p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f25125q) {
                    this.f25125q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo18264f() {
            return this.f25115g.length;
        }

        /* renamed from: g */
        public final Drawable mo18265g(int i) {
            int indexOfKey;
            Drawable drawable = this.f25115g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f25114f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m30201s(this.f25114f.valueAt(indexOfKey).newDrawable(this.f25110b));
            this.f25115g[i] = s;
            this.f25114f.removeAt(indexOfKey);
            if (this.f25114f.size() == 0) {
                this.f25114f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f25112d | this.f25113e;
        }

        /* renamed from: h */
        public final int mo18267h() {
            return this.f25116h;
        }

        /* renamed from: i */
        public final int mo18268i() {
            if (!this.f25121m) {
                mo18263d();
            }
            return this.f25123o;
        }

        /* renamed from: j */
        public final int mo18269j() {
            if (!this.f25121m) {
                mo18263d();
            }
            return this.f25125q;
        }

        /* renamed from: k */
        public final int mo18270k() {
            if (!this.f25121m) {
                mo18263d();
            }
            return this.f25124p;
        }

        /* renamed from: l */
        public final Rect mo18271l() {
            Rect rect = null;
            if (this.f25117i) {
                return null;
            }
            Rect rect2 = this.f25119k;
            if (rect2 != null || this.f25118j) {
                return rect2;
            }
            m30200e();
            Rect rect3 = new Rect();
            int i = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f25118j = true;
            this.f25119k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo18272m() {
            if (!this.f25121m) {
                mo18263d();
            }
            return this.f25122n;
        }

        /* renamed from: n */
        public final int mo18273n() {
            if (this.f25126r) {
                return this.f25127s;
            }
            m30200e();
            int i = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f25127s = opacity;
            this.f25126r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo18274o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f25115g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f25115g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo18275p() {
            this.f25126r = false;
            this.f25128t = false;
        }

        /* renamed from: q */
        public final boolean mo18276q() {
            return this.f25120l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo18240r();

        /* renamed from: t */
        public final void mo18277t(boolean z) {
            this.f25120l = z;
        }

        /* renamed from: u */
        public final void mo18278u(int i) {
            this.f25100A = i;
        }

        /* renamed from: v */
        public final void mo18279v(int i) {
            this.f25101B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo18280w(int i, int i2) {
            int i3 = this.f25116h;
            Drawable[] drawableArr = this.f25115g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = Build.VERSION.SDK_INT >= 23 ? C0732a.m3375m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f25134z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo18281x(boolean z) {
            this.f25117i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo18282y(Resources resources) {
            if (resources != null) {
                this.f25110b = resources;
                int f = C4635b.m30188f(resources, this.f25111c);
                int i = this.f25111c;
                this.f25111c = f;
                if (i != f) {
                    this.f25121m = false;
                    this.f25118j = false;
                }
            }
        }
    }

    C4635b() {
    }

    /* renamed from: d */
    private void m30186d(Drawable drawable) {
        if (this.f25097t == null) {
            this.f25097t = new C4638c();
        }
        drawable.setCallback(this.f25097t.mo18255b(drawable.getCallback()));
        try {
            if (this.f25086a.f25100A <= 0 && this.f25091f) {
                drawable.setAlpha(this.f25090e);
            }
            C4639d dVar = this.f25086a;
            if (dVar.f25104E) {
                drawable.setColorFilter(dVar.f25103D);
            } else {
                if (dVar.f25107H) {
                    C0732a.m3377o(drawable, dVar.f25105F);
                }
                C4639d dVar2 = this.f25086a;
                if (dVar2.f25108I) {
                    C0732a.m3378p(drawable, dVar2.f25106G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f25086a.f25132x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                C0732a.m3375m(drawable, C0732a.m3368f(this));
            }
            if (i >= 19) {
                C0732a.m3372j(drawable, this.f25086a.f25102C);
            }
            Rect rect = this.f25087b;
            if (i >= 21 && rect != null) {
                C0732a.m3374l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f25097t.mo18254a());
        }
    }

    /* renamed from: e */
    private boolean m30187e() {
        if (!isAutoMirrored() || C0732a.m3368f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m30188f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18246a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f25091f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f25088c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f25095r
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f25090e
            r3.setAlpha(r9)
            r13.f25095r = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            i.b$d r9 = r13.f25086a
            int r9 = r9.f25100A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f25090e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f25095r = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f25089d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f25096s
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f25089d = r0
            r13.f25096s = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$d r4 = r13.f25086a
            int r4 = r4.f25101B
            int r3 = r3 / r4
            int r4 = r13.f25090e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f25096s = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f25094i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p062i.C4635b.mo18246a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f25086a.mo18260b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4639d mo18195b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo18247c() {
        return this.f25092g;
    }

    public boolean canApplyTheme() {
        return this.f25086a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f25089d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18248g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f25092g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$d r0 = r9.f25086a
            int r0 = r0.f25101B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f25089d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f25088c
            if (r0 == 0) goto L_0x0029
            r9.f25089d = r0
            i.b$d r0 = r9.f25086a
            int r0 = r0.f25101B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f25096s = r0
            goto L_0x0035
        L_0x0029:
            r9.f25089d = r4
            r9.f25096s = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f25088c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            i.b$d r0 = r9.f25086a
            int r1 = r0.f25116h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo18265g(r10)
            r9.f25088c = r0
            r9.f25092g = r10
            if (r0 == 0) goto L_0x005a
            i.b$d r10 = r9.f25086a
            int r10 = r10.f25100A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f25095r = r2
        L_0x0051:
            r9.m30186d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f25088c = r4
            r10 = -1
            r9.f25092g = r10
        L_0x005a:
            long r0 = r9.f25095r
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f25096s
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f25094i
            if (r0 != 0) goto L_0x0073
            i.b$a r0 = new i.b$a
            r0.<init>()
            r9.f25094i = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo18246a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p062i.C4635b.mo18248g(int):boolean");
    }

    public int getAlpha() {
        return this.f25090e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f25086a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f25086a.mo18261c()) {
            return null;
        }
        this.f25086a.f25112d = getChangingConfigurations();
        return this.f25086a;
    }

    public Drawable getCurrent() {
        return this.f25088c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f25087b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f25086a.mo18276q()) {
            return this.f25086a.mo18268i();
        }
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f25086a.mo18276q()) {
            return this.f25086a.mo18272m();
        }
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f25086a.mo18276q()) {
            return this.f25086a.mo18269j();
        }
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f25086a.mo18276q()) {
            return this.f25086a.mo18270k();
        }
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f25088c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f25086a.mo18273n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            C4637b.m30196b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f25086a.mo18271l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f25088c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m30187e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18209h(C4639d dVar) {
        this.f25086a = dVar;
        int i = this.f25092g;
        if (i >= 0) {
            Drawable g = dVar.mo18265g(i);
            this.f25088c = g;
            if (g != null) {
                m30186d(g);
            }
        }
        this.f25089d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo18250i(Resources resources) {
        this.f25086a.mo18282y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C4639d dVar = this.f25086a;
        if (dVar != null) {
            dVar.mo18275p();
        }
        if (drawable == this.f25088c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f25086a.f25102C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f25089d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f25089d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f25088c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f25091f) {
                this.f25088c.setAlpha(this.f25090e);
            }
        }
        if (this.f25096s != 0) {
            this.f25096s = 0;
            z = true;
        }
        if (this.f25095r != 0) {
            this.f25095r = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f25093h && super.mutate() == this) {
            C4639d b = mo18195b();
            b.mo18240r();
            mo18209h(b);
            this.f25093h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25089d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f25088c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f25086a.mo18280w(i, mo18247c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f25089d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f25088c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25089d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f25088c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f25088c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f25091f || this.f25090e != i) {
            this.f25091f = true;
            this.f25090e = i;
            Drawable drawable = this.f25088c;
            if (drawable == null) {
                return;
            }
            if (this.f25095r == 0) {
                drawable.setAlpha(i);
            } else {
                mo18246a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C4639d dVar = this.f25086a;
        if (dVar.f25102C != z) {
            dVar.f25102C = z;
            Drawable drawable = this.f25088c;
            if (drawable != null) {
                C0732a.m3372j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C4639d dVar = this.f25086a;
        dVar.f25104E = true;
        if (dVar.f25103D != colorFilter) {
            dVar.f25103D = colorFilter;
            Drawable drawable = this.f25088c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C4639d dVar = this.f25086a;
        if (dVar.f25132x != z) {
            dVar.f25132x = z;
            Drawable drawable = this.f25088c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            C0732a.m3373k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f25087b;
        if (rect == null) {
            this.f25087b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f25088c;
        if (drawable != null) {
            C0732a.m3374l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C4639d dVar = this.f25086a;
        dVar.f25107H = true;
        if (dVar.f25105F != colorStateList) {
            dVar.f25105F = colorStateList;
            C0732a.m3377o(this.f25088c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C4639d dVar = this.f25086a;
        dVar.f25108I = true;
        if (dVar.f25106G != mode) {
            dVar.f25106G = mode;
            C0732a.m3378p(this.f25088c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f25089d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f25088c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f25088c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
