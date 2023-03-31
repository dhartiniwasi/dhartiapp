package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0697d;
import androidx.core.content.res.C0719k;
import androidx.core.graphics.C0741e;
import androidx.core.graphics.drawable.C0732a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p124r.C5413a;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
/* compiled from: VectorDrawableCompat */
public class C1495h extends C1494g {

    /* renamed from: s */
    static final PorterDuff.Mode f4275s = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C1503h f4276b;

    /* renamed from: c */
    private PorterDuffColorFilter f4277c;

    /* renamed from: d */
    private ColorFilter f4278d;

    /* renamed from: e */
    private boolean f4279e;

    /* renamed from: f */
    private boolean f4280f;

    /* renamed from: g */
    private Drawable.ConstantState f4281g;

    /* renamed from: h */
    private final float[] f4282h;

    /* renamed from: i */
    private final Matrix f4283i;

    /* renamed from: r */
    private final Rect f4284r;

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    /* compiled from: VectorDrawableCompat */
    private static class C1497b extends C1501f {
        C1497b() {
        }

        /* renamed from: f */
        private void m6928f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4311b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4310a = C0741e.m3411d(string2);
            }
            this.f4312c = C0719k.m3291g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo5858c() {
            return true;
        }

        /* renamed from: e */
        public void mo5859e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0719k.m3294j(xmlPullParser, "pathData")) {
                TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C1484a.f4248d);
                m6928f(k, xmlPullParser);
                k.recycle();
            }
        }

        C1497b(C1497b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1500e {
        private C1500e() {
        }

        /* renamed from: a */
        public boolean mo5860a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5861b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    /* compiled from: VectorDrawableCompat */
    private static class C1503h extends Drawable.ConstantState {

        /* renamed from: a */
        int f4331a;

        /* renamed from: b */
        C1502g f4332b;

        /* renamed from: c */
        ColorStateList f4333c;

        /* renamed from: d */
        PorterDuff.Mode f4334d;

        /* renamed from: e */
        boolean f4335e;

        /* renamed from: f */
        Bitmap f4336f;

        /* renamed from: g */
        ColorStateList f4337g;

        /* renamed from: h */
        PorterDuff.Mode f4338h;

        /* renamed from: i */
        int f4339i;

        /* renamed from: j */
        boolean f4340j;

        /* renamed from: k */
        boolean f4341k;

        /* renamed from: l */
        Paint f4342l;

        public C1503h(C1503h hVar) {
            this.f4333c = null;
            this.f4334d = C1495h.f4275s;
            if (hVar != null) {
                this.f4331a = hVar.f4331a;
                C1502g gVar = new C1502g(hVar.f4332b);
                this.f4332b = gVar;
                if (hVar.f4332b.f4319e != null) {
                    gVar.f4319e = new Paint(hVar.f4332b.f4319e);
                }
                if (hVar.f4332b.f4318d != null) {
                    this.f4332b.f4318d = new Paint(hVar.f4332b.f4318d);
                }
                this.f4333c = hVar.f4333c;
                this.f4334d = hVar.f4334d;
                this.f4335e = hVar.f4335e;
            }
        }

        /* renamed from: a */
        public boolean mo5907a(int i, int i2) {
            return i == this.f4336f.getWidth() && i2 == this.f4336f.getHeight();
        }

        /* renamed from: b */
        public boolean mo5908b() {
            return !this.f4341k && this.f4337g == this.f4333c && this.f4338h == this.f4334d && this.f4340j == this.f4335e && this.f4339i == this.f4332b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo5909c(int i, int i2) {
            if (this.f4336f == null || !mo5907a(i, i2)) {
                this.f4336f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f4341k = true;
            }
        }

        /* renamed from: d */
        public void mo5910d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4336f, (Rect) null, rect, mo5911e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo5911e(ColorFilter colorFilter) {
            if (!mo5912f() && colorFilter == null) {
                return null;
            }
            if (this.f4342l == null) {
                Paint paint = new Paint();
                this.f4342l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4342l.setAlpha(this.f4332b.getRootAlpha());
            this.f4342l.setColorFilter(colorFilter);
            return this.f4342l;
        }

        /* renamed from: f */
        public boolean mo5912f() {
            return this.f4332b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo5913g() {
            return this.f4332b.mo5901f();
        }

        public int getChangingConfigurations() {
            return this.f4331a;
        }

        /* renamed from: h */
        public boolean mo5915h(int[] iArr) {
            boolean g = this.f4332b.mo5902g(iArr);
            this.f4341k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo5916i() {
            this.f4337g = this.f4333c;
            this.f4338h = this.f4334d;
            this.f4339i = this.f4332b.getRootAlpha();
            this.f4340j = this.f4335e;
            this.f4341k = false;
        }

        /* renamed from: j */
        public void mo5917j(int i, int i2) {
            this.f4336f.eraseColor(0);
            this.f4332b.mo5900b(new Canvas(this.f4336f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C1495h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1495h(this);
        }

        public C1503h() {
            this.f4333c = null;
            this.f4334d = C1495h.f4275s;
            this.f4332b = new C1502g();
        }
    }

    C1495h() {
        this.f4280f = true;
        this.f4282h = new float[9];
        this.f4283i = new Matrix();
        this.f4284r = new Rect();
        this.f4276b = new C1503h();
    }

    /* renamed from: a */
    static int m6918a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1495h m6919b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0707h.m3258d(r6, r7, r8)
            r0.f4274a = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f4274a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f4281g = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.h r6 = m6920c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1495h.m6919b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    /* renamed from: c */
    public static C1495h m6920c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1495h hVar = new C1495h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* renamed from: e */
    private void m6921e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1503h hVar = this.f4276b;
        C1502g gVar = hVar.f4332b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4322h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1499d dVar = (C1499d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1498c cVar = new C1498c();
                    cVar.mo5862g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4298b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4330p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f4331a = cVar.f4313d | hVar.f4331a;
                } else if ("clip-path".equals(name)) {
                    C1497b bVar = new C1497b();
                    bVar.mo5859e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4298b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4330p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4331a = bVar.f4313d | hVar.f4331a;
                } else if ("group".equals(name)) {
                    C1499d dVar2 = new C1499d();
                    dVar2.mo5879c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4298b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4330p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4331a = dVar2.f4307k | hVar.f4331a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m6922f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0732a.m3368f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m6923g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m6924i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C1503h hVar = this.f4276b;
        C1502g gVar = hVar.f4332b;
        hVar.f4334d = m6923g(C0719k.m3291g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C0719k.m3287c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f4333c = c;
        }
        hVar.f4335e = C0719k.m3285a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4335e);
        gVar.f4325k = C0719k.m3290f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4325k);
        float f = C0719k.m3290f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4326l);
        gVar.f4326l = f;
        if (gVar.f4325k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f4323i = typedArray.getDimension(3, gVar.f4323i);
            float dimension = typedArray.getDimension(2, gVar.f4324j);
            gVar.f4324j = dimension;
            if (gVar.f4323i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0719k.m3290f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4328n = string;
                    gVar.f4330p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4274a;
        if (drawable == null) {
            return false;
        }
        C0732a.m3364b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo5833d(String str) {
        return this.f4276b.f4332b.f4330p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4284r);
        if (this.f4284r.width() > 0 && this.f4284r.height() > 0) {
            ColorFilter colorFilter = this.f4278d;
            if (colorFilter == null) {
                colorFilter = this.f4277c;
            }
            canvas.getMatrix(this.f4283i);
            this.f4283i.getValues(this.f4282h);
            float abs = Math.abs(this.f4282h[0]);
            float abs2 = Math.abs(this.f4282h[4]);
            float abs3 = Math.abs(this.f4282h[1]);
            float abs4 = Math.abs(this.f4282h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4284r.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4284r.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f4284r;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m6922f()) {
                    canvas.translate((float) this.f4284r.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4284r.offsetTo(0, 0);
                this.f4276b.mo5909c(min, min2);
                if (!this.f4280f) {
                    this.f4276b.mo5917j(min, min2);
                } else if (!this.f4276b.mo5908b()) {
                    this.f4276b.mo5917j(min, min2);
                    this.f4276b.mo5916i();
                }
                this.f4276b.mo5910d(canvas, colorFilter, this.f4284r);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3366d(drawable);
        }
        return this.f4276b.f4332b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4276b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3367e(drawable);
        }
        return this.f4278d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4274a != null && Build.VERSION.SDK_INT >= 24) {
            return new C1504i(this.f4274a.getConstantState());
        }
        this.f4276b.f4331a = getChangingConfigurations();
        return this.f4276b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4276b.f4332b.f4324j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4276b.f4332b.f4323i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5842h(boolean z) {
        this.f4280f = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3370h(drawable);
        }
        return this.f4276b.f4335e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4276b.f4333c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4276b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4274a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4276b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo5913g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4276b
            android.content.res.ColorStateList r0 = r0.f4333c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1495h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo5848j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4279e && super.mutate() == this) {
            this.f4276b = new C1503h(this.f4276b);
            this.f4279e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1503h hVar = this.f4276b;
        ColorStateList colorStateList = hVar.f4333c;
        if (!(colorStateList == null || (mode = hVar.f4334d) == null)) {
            this.f4277c = mo5848j(this.f4277c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo5913g() || !hVar.mo5915h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4276b.f4332b.getRootAlpha() != i) {
            this.f4276b.f4332b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3372j(drawable, z);
        } else {
            this.f4276b.f4335e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3376n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3377o(drawable, colorStateList);
            return;
        }
        C1503h hVar = this.f4276b;
        if (hVar.f4333c != colorStateList) {
            hVar.f4333c = colorStateList;
            this.f4277c = mo5848j(this.f4277c, colorStateList, hVar.f4334d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3378p(drawable, mode);
            return;
        }
        C1503h hVar = this.f4276b;
        if (hVar.f4334d != mode) {
            hVar.f4334d = mode;
            this.f4277c = mo5848j(this.f4277c, hVar.f4333c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    /* compiled from: VectorDrawableCompat */
    private static class C1504i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4343a;

        public C1504i(Drawable.ConstantState constantState) {
            this.f4343a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4343a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4343a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1495h hVar = new C1495h();
            hVar.f4274a = (VectorDrawable) this.f4343a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1495h hVar = new C1495h();
            hVar.f4274a = (VectorDrawable) this.f4343a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1495h hVar = new C1495h();
            hVar.f4274a = (VectorDrawable) this.f4343a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4278d = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1501f extends C1500e {

        /* renamed from: a */
        protected C0741e.C0743b[] f4310a = null;

        /* renamed from: b */
        String f4311b;

        /* renamed from: c */
        int f4312c = 0;

        /* renamed from: d */
        int f4313d;

        public C1501f() {
            super();
        }

        /* renamed from: c */
        public boolean mo5858c() {
            return false;
        }

        /* renamed from: d */
        public void mo5896d(Path path) {
            path.reset();
            C0741e.C0743b[] bVarArr = this.f4310a;
            if (bVarArr != null) {
                C0741e.C0743b.m3421e(bVarArr, path);
            }
        }

        public C0741e.C0743b[] getPathData() {
            return this.f4310a;
        }

        public String getPathName() {
            return this.f4311b;
        }

        public void setPathData(C0741e.C0743b[] bVarArr) {
            if (!C0741e.m3409b(this.f4310a, bVarArr)) {
                this.f4310a = C0741e.m3413f(bVarArr);
            } else {
                C0741e.m3417j(this.f4310a, bVarArr);
            }
        }

        public C1501f(C1501f fVar) {
            super();
            this.f4311b = fVar.f4311b;
            this.f4313d = fVar.f4313d;
            this.f4310a = C0741e.m3413f(fVar.f4310a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3369g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1503h hVar = this.f4276b;
        hVar.f4332b = new C1502g();
        TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C1484a.f4245a);
        m6924i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f4331a = getChangingConfigurations();
        hVar.f4341k = true;
        m6921e(resources, xmlPullParser, attributeSet, theme);
        this.f4277c = mo5848j(this.f4277c, hVar.f4333c, hVar.f4334d);
    }

    C1495h(C1503h hVar) {
        this.f4280f = true;
        this.f4282h = new float[9];
        this.f4283i = new Matrix();
        this.f4284r = new Rect();
        this.f4276b = hVar;
        this.f4277c = mo5848j(this.f4277c, hVar.f4333c, hVar.f4334d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    /* compiled from: VectorDrawableCompat */
    private static class C1498c extends C1501f {

        /* renamed from: e */
        private int[] f4285e;

        /* renamed from: f */
        C0697d f4286f;

        /* renamed from: g */
        float f4287g = 0.0f;

        /* renamed from: h */
        C0697d f4288h;

        /* renamed from: i */
        float f4289i = 1.0f;

        /* renamed from: j */
        float f4290j = 1.0f;

        /* renamed from: k */
        float f4291k = 0.0f;

        /* renamed from: l */
        float f4292l = 1.0f;

        /* renamed from: m */
        float f4293m = 0.0f;

        /* renamed from: n */
        Paint.Cap f4294n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f4295o = Paint.Join.MITER;

        /* renamed from: p */
        float f4296p = 4.0f;

        C1498c() {
        }

        /* renamed from: e */
        private Paint.Cap m6931e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* renamed from: f */
        private Paint.Join m6932f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: h */
        private void m6933h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4285e = null;
            if (C0719k.m3294j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4311b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4310a = C0741e.m3411d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f4288h = C0719k.m3289e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f4290j = C0719k.m3290f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4290j);
                this.f4294n = m6931e(C0719k.m3291g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4294n);
                this.f4295o = m6932f(C0719k.m3291g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4295o);
                this.f4296p = C0719k.m3290f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4296p);
                this.f4286f = C0719k.m3289e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f4289i = C0719k.m3290f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4289i);
                this.f4287g = C0719k.m3290f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4287g);
                this.f4292l = C0719k.m3290f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4292l);
                this.f4293m = C0719k.m3290f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4293m);
                this.f4291k = C0719k.m3290f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4291k);
                this.f4312c = C0719k.m3291g(typedArray, xmlPullParser, "fillType", 13, this.f4312c);
            }
        }

        /* renamed from: a */
        public boolean mo5860a() {
            return this.f4288h.mo3022i() || this.f4286f.mo3022i();
        }

        /* renamed from: b */
        public boolean mo5861b(int[] iArr) {
            return this.f4286f.mo3023j(iArr) | this.f4288h.mo3023j(iArr);
        }

        /* renamed from: g */
        public void mo5862g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C1484a.f4247c);
            m6933h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f4290j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f4288h.mo3019e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f4289i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f4286f.mo3019e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f4287g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f4292l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f4293m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f4291k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f4290j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f4288h.mo3024k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f4289i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f4286f.mo3024k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f4287g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f4292l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f4293m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f4291k = f;
        }

        C1498c(C1498c cVar) {
            super(cVar);
            this.f4285e = cVar.f4285e;
            this.f4286f = cVar.f4286f;
            this.f4287g = cVar.f4287g;
            this.f4289i = cVar.f4289i;
            this.f4288h = cVar.f4288h;
            this.f4312c = cVar.f4312c;
            this.f4290j = cVar.f4290j;
            this.f4291k = cVar.f4291k;
            this.f4292l = cVar.f4292l;
            this.f4293m = cVar.f4293m;
            this.f4294n = cVar.f4294n;
            this.f4295o = cVar.f4295o;
            this.f4296p = cVar.f4296p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    /* compiled from: VectorDrawableCompat */
    private static class C1502g {

        /* renamed from: q */
        private static final Matrix f4314q = new Matrix();

        /* renamed from: a */
        private final Path f4315a;

        /* renamed from: b */
        private final Path f4316b;

        /* renamed from: c */
        private final Matrix f4317c;

        /* renamed from: d */
        Paint f4318d;

        /* renamed from: e */
        Paint f4319e;

        /* renamed from: f */
        private PathMeasure f4320f;

        /* renamed from: g */
        private int f4321g;

        /* renamed from: h */
        final C1499d f4322h;

        /* renamed from: i */
        float f4323i;

        /* renamed from: j */
        float f4324j;

        /* renamed from: k */
        float f4325k;

        /* renamed from: l */
        float f4326l;

        /* renamed from: m */
        int f4327m;

        /* renamed from: n */
        String f4328n;

        /* renamed from: o */
        Boolean f4329o;

        /* renamed from: p */
        final C5413a<String, Object> f4330p;

        public C1502g() {
            this.f4317c = new Matrix();
            this.f4323i = 0.0f;
            this.f4324j = 0.0f;
            this.f4325k = 0.0f;
            this.f4326l = 0.0f;
            this.f4327m = 255;
            this.f4328n = null;
            this.f4329o = null;
            this.f4330p = new C5413a<>();
            this.f4322h = new C1499d();
            this.f4315a = new Path();
            this.f4316b = new Path();
        }

        /* renamed from: a */
        private static float m6946a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m6947c(C1499d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f4297a.set(matrix);
            dVar.f4297a.preConcat(dVar.f4306j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f4298b.size(); i3++) {
                C1500e eVar = dVar.f4298b.get(i3);
                if (eVar instanceof C1499d) {
                    m6947c((C1499d) eVar, dVar.f4297a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1501f) {
                    m6948d(dVar, (C1501f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6948d(C1499d dVar, C1501f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f4325k;
            float f2 = ((float) i2) / this.f4326l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f4297a;
            this.f4317c.set(matrix);
            this.f4317c.postScale(f, f2);
            float e = m6949e(matrix);
            if (e != 0.0f) {
                fVar.mo5896d(this.f4315a);
                Path path = this.f4315a;
                this.f4316b.reset();
                if (fVar.mo5858c()) {
                    this.f4316b.setFillType(fVar.f4312c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4316b.addPath(path, this.f4317c);
                    canvas.clipPath(this.f4316b);
                    return;
                }
                C1498c cVar = (C1498c) fVar;
                float f3 = cVar.f4291k;
                if (!(f3 == 0.0f && cVar.f4292l == 1.0f)) {
                    float f4 = cVar.f4293m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f4292l + f4) % 1.0f;
                    if (this.f4320f == null) {
                        this.f4320f = new PathMeasure();
                    }
                    this.f4320f.setPath(this.f4315a, false);
                    float length = this.f4320f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f4320f.getSegment(f7, length, path, true);
                        this.f4320f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f4320f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4316b.addPath(path, this.f4317c);
                if (cVar.f4288h.mo3025l()) {
                    C0697d dVar2 = cVar.f4288h;
                    if (this.f4319e == null) {
                        Paint paint = new Paint(1);
                        this.f4319e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4319e;
                    if (dVar2.mo3021h()) {
                        Shader f9 = dVar2.mo3020f();
                        f9.setLocalMatrix(this.f4317c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f4290j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1495h.m6918a(dVar2.mo3019e(), cVar.f4290j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4316b.setFillType(cVar.f4312c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4316b, paint2);
                }
                if (cVar.f4286f.mo3025l()) {
                    C0697d dVar3 = cVar.f4286f;
                    if (this.f4318d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4318d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4318d;
                    Paint.Join join = cVar.f4295o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f4294n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f4296p);
                    if (dVar3.mo3021h()) {
                        Shader f10 = dVar3.mo3020f();
                        f10.setLocalMatrix(this.f4317c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f4289i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1495h.m6918a(dVar3.mo3019e(), cVar.f4289i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f4287g * min * e);
                    canvas.drawPath(this.f4316b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m6949e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m6946a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo5900b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m6947c(this.f4322h, f4314q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo5901f() {
            if (this.f4329o == null) {
                this.f4329o = Boolean.valueOf(this.f4322h.mo5860a());
            }
            return this.f4329o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo5902g(int[] iArr) {
            return this.f4322h.mo5861b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4327m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4327m = i;
        }

        public C1502g(C1502g gVar) {
            this.f4317c = new Matrix();
            this.f4323i = 0.0f;
            this.f4324j = 0.0f;
            this.f4325k = 0.0f;
            this.f4326l = 0.0f;
            this.f4327m = 255;
            this.f4328n = null;
            this.f4329o = null;
            C5413a<String, Object> aVar = new C5413a<>();
            this.f4330p = aVar;
            this.f4322h = new C1499d(gVar.f4322h, aVar);
            this.f4315a = new Path(gVar.f4315a);
            this.f4316b = new Path(gVar.f4316b);
            this.f4323i = gVar.f4323i;
            this.f4324j = gVar.f4324j;
            this.f4325k = gVar.f4325k;
            this.f4326l = gVar.f4326l;
            this.f4321g = gVar.f4321g;
            this.f4327m = gVar.f4327m;
            this.f4328n = gVar.f4328n;
            String str = gVar.f4328n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4329o = gVar.f4329o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    /* compiled from: VectorDrawableCompat */
    private static class C1499d extends C1500e {

        /* renamed from: a */
        final Matrix f4297a;

        /* renamed from: b */
        final ArrayList<C1500e> f4298b;

        /* renamed from: c */
        float f4299c;

        /* renamed from: d */
        private float f4300d;

        /* renamed from: e */
        private float f4301e;

        /* renamed from: f */
        private float f4302f;

        /* renamed from: g */
        private float f4303g;

        /* renamed from: h */
        private float f4304h;

        /* renamed from: i */
        private float f4305i;

        /* renamed from: j */
        final Matrix f4306j;

        /* renamed from: k */
        int f4307k;

        /* renamed from: l */
        private int[] f4308l;

        /* renamed from: m */
        private String f4309m;

        public C1499d(C1499d dVar, C5413a<String, Object> aVar) {
            super();
            C1501f fVar;
            this.f4297a = new Matrix();
            this.f4298b = new ArrayList<>();
            this.f4299c = 0.0f;
            this.f4300d = 0.0f;
            this.f4301e = 0.0f;
            this.f4302f = 1.0f;
            this.f4303g = 1.0f;
            this.f4304h = 0.0f;
            this.f4305i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4306j = matrix;
            this.f4309m = null;
            this.f4299c = dVar.f4299c;
            this.f4300d = dVar.f4300d;
            this.f4301e = dVar.f4301e;
            this.f4302f = dVar.f4302f;
            this.f4303g = dVar.f4303g;
            this.f4304h = dVar.f4304h;
            this.f4305i = dVar.f4305i;
            this.f4308l = dVar.f4308l;
            String str = dVar.f4309m;
            this.f4309m = str;
            this.f4307k = dVar.f4307k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4306j);
            ArrayList<C1500e> arrayList = dVar.f4298b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1500e eVar = arrayList.get(i);
                if (eVar instanceof C1499d) {
                    this.f4298b.add(new C1499d((C1499d) eVar, aVar));
                } else {
                    if (eVar instanceof C1498c) {
                        fVar = new C1498c((C1498c) eVar);
                    } else if (eVar instanceof C1497b) {
                        fVar = new C1497b((C1497b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4298b.add(fVar);
                    String str2 = fVar.f4311b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6937d() {
            this.f4306j.reset();
            this.f4306j.postTranslate(-this.f4300d, -this.f4301e);
            this.f4306j.postScale(this.f4302f, this.f4303g);
            this.f4306j.postRotate(this.f4299c, 0.0f, 0.0f);
            this.f4306j.postTranslate(this.f4304h + this.f4300d, this.f4305i + this.f4301e);
        }

        /* renamed from: e */
        private void m6938e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4308l = null;
            this.f4299c = C0719k.m3290f(typedArray, xmlPullParser, "rotation", 5, this.f4299c);
            this.f4300d = typedArray.getFloat(1, this.f4300d);
            this.f4301e = typedArray.getFloat(2, this.f4301e);
            this.f4302f = C0719k.m3290f(typedArray, xmlPullParser, "scaleX", 3, this.f4302f);
            this.f4303g = C0719k.m3290f(typedArray, xmlPullParser, "scaleY", 4, this.f4303g);
            this.f4304h = C0719k.m3290f(typedArray, xmlPullParser, "translateX", 6, this.f4304h);
            this.f4305i = C0719k.m3290f(typedArray, xmlPullParser, "translateY", 7, this.f4305i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4309m = string;
            }
            m6937d();
        }

        /* renamed from: a */
        public boolean mo5860a() {
            for (int i = 0; i < this.f4298b.size(); i++) {
                if (this.f4298b.get(i).mo5860a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo5861b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4298b.size(); i++) {
                z |= this.f4298b.get(i).mo5861b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo5879c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C1484a.f4246b);
            m6938e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f4309m;
        }

        public Matrix getLocalMatrix() {
            return this.f4306j;
        }

        public float getPivotX() {
            return this.f4300d;
        }

        public float getPivotY() {
            return this.f4301e;
        }

        public float getRotation() {
            return this.f4299c;
        }

        public float getScaleX() {
            return this.f4302f;
        }

        public float getScaleY() {
            return this.f4303g;
        }

        public float getTranslateX() {
            return this.f4304h;
        }

        public float getTranslateY() {
            return this.f4305i;
        }

        public void setPivotX(float f) {
            if (f != this.f4300d) {
                this.f4300d = f;
                m6937d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4301e) {
                this.f4301e = f;
                m6937d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4299c) {
                this.f4299c = f;
                m6937d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4302f) {
                this.f4302f = f;
                m6937d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4303g) {
                this.f4303g = f;
                m6937d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4304h) {
                this.f4304h = f;
                m6937d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4305i) {
                this.f4305i = f;
                m6937d();
            }
        }

        public C1499d() {
            super();
            this.f4297a = new Matrix();
            this.f4298b = new ArrayList<>();
            this.f4299c = 0.0f;
            this.f4300d = 0.0f;
            this.f4301e = 0.0f;
            this.f4302f = 1.0f;
            this.f4303g = 1.0f;
            this.f4304h = 0.0f;
            this.f4305i = 0.0f;
            this.f4306j = new Matrix();
            this.f4309m = null;
        }
    }
}
