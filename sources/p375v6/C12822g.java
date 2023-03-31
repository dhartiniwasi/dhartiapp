package p375v6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0736b;
import androidx.core.util.C0825c;
import p227f6.C10126b;
import p283l6.C11758a;
import p310o6.C12015a;
import p365u6.C12696a;
import p375v6.C12829k;
import p375v6.C12833l;
import p375v6.C12836m;

/* renamed from: v6.g */
/* compiled from: MaterialShapeDrawable */
public class C12822g extends Drawable implements C0736b, C12844n {

    /* renamed from: D */
    private static final Paint f46825D = new Paint(1);

    /* renamed from: A */
    private PorterDuffColorFilter f46826A;

    /* renamed from: B */
    private Rect f46827B;

    /* renamed from: C */
    private final RectF f46828C;

    /* renamed from: a */
    private C12825c f46829a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12836m.C12843g[] f46830b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12836m.C12843g[] f46831c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f46832d;

    /* renamed from: e */
    private final Matrix f46833e;

    /* renamed from: f */
    private final Path f46834f;

    /* renamed from: g */
    private final Path f46835g;

    /* renamed from: h */
    private final RectF f46836h;

    /* renamed from: i */
    private final RectF f46837i;

    /* renamed from: r */
    private final Region f46838r;

    /* renamed from: s */
    private final Region f46839s;

    /* renamed from: t */
    private C12829k f46840t;

    /* renamed from: u */
    private final Paint f46841u;

    /* renamed from: v */
    private final Paint f46842v;

    /* renamed from: w */
    private final C12696a f46843w;

    /* renamed from: x */
    private final C12833l.C12834a f46844x;

    /* renamed from: y */
    private final C12833l f46845y;

    /* renamed from: z */
    private PorterDuffColorFilter f46846z;

    /* renamed from: v6.g$a */
    /* compiled from: MaterialShapeDrawable */
    class C12823a implements C12833l.C12834a {
        C12823a() {
        }

        /* renamed from: a */
        public void mo37770a(C12836m mVar, Matrix matrix, int i) {
            C12822g.this.f46831c[i] = mVar.mo37815e(matrix);
        }

        /* renamed from: b */
        public void mo37771b(C12836m mVar, Matrix matrix, int i) {
            C12822g.this.f46830b[i] = mVar.mo37815e(matrix);
        }
    }

    /* renamed from: v6.g$b */
    /* compiled from: MaterialShapeDrawable */
    class C12824b implements C12829k.C12832c {

        /* renamed from: a */
        final /* synthetic */ float f46848a;

        C12824b(float f) {
            this.f46848a = f;
        }

        /* renamed from: a */
        public C12818c mo37772a(C12818c cVar) {
            return cVar instanceof C12827i ? cVar : new C12817b(this.f46848a, cVar);
        }
    }

    /* synthetic */ C12822g(C12825c cVar, C12823a aVar) {
        this(cVar);
    }

    /* renamed from: C */
    private float m60562C() {
        if (m60565K()) {
            return this.f46842v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: I */
    private boolean m60563I() {
        C12825c cVar = this.f46829a;
        int i = cVar.f46866q;
        if (i == 1 || cVar.f46867r <= 0 || (i != 2 && !m60569R())) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private boolean m60564J() {
        Paint.Style style = this.f46829a.f46871v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: K */
    private boolean m60565K() {
        Paint.Style style = this.f46829a.f46871v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f46842v.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    private void m60566M() {
        super.invalidateSelf();
    }

    /* renamed from: P */
    private static int m60567P(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: Q */
    private void m60568Q(Canvas canvas) {
        int y = mo37768y();
        int z = mo37769z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f46829a.f46867r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(y, z);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) y, (float) z);
    }

    /* renamed from: R */
    private boolean m60569R() {
        return Build.VERSION.SDK_INT < 21 || (!mo37743O() && !this.f46834f.isConvex());
    }

    /* renamed from: c0 */
    private boolean m60572c0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f46829a.f46853d == null || (color2 = this.f46841u.getColor()) == (colorForState2 = this.f46829a.f46853d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f46841u.setColor(colorForState2);
            z = true;
        }
        if (this.f46829a.f46854e == null || (color = this.f46842v.getColor()) == (colorForState = this.f46829a.f46854e.getColorForState(iArr, color))) {
            return z;
        }
        this.f46842v.setColor(colorForState);
        return true;
    }

    /* renamed from: d0 */
    private boolean m60574d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f46846z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f46826A;
        C12825c cVar = this.f46829a;
        this.f46846z = m60580j(cVar.f46856g, cVar.f46857h, this.f46841u, true);
        C12825c cVar2 = this.f46829a;
        this.f46826A = m60580j(cVar2.f46855f, cVar2.f46857h, this.f46842v, false);
        C12825c cVar3 = this.f46829a;
        if (cVar3.f46870u) {
            this.f46843w.mo37571d(cVar3.f46856g.getColorForState(getState(), 0));
        }
        if (!C0825c.m3642a(porterDuffColorFilter, this.f46846z) || !C0825c.m3642a(porterDuffColorFilter2, this.f46826A)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m60575e(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.m60581k(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p375v6.C12822g.m60575e(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: e0 */
    private void m60576e0() {
        float H = mo37740H();
        this.f46829a.f46867r = (int) Math.ceil((double) (0.75f * H));
        this.f46829a.f46868s = (int) Math.ceil((double) (H * 0.25f));
        m60574d0();
        m60566M();
    }

    /* renamed from: f */
    private void m60577f(RectF rectF, Path path) {
        mo37754g(rectF, path);
        if (this.f46829a.f46859j != 1.0f) {
            this.f46833e.reset();
            Matrix matrix = this.f46833e;
            float f = this.f46829a.f46859j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f46833e);
        }
        path.computeBounds(this.f46828C, true);
    }

    /* renamed from: h */
    private void m60578h() {
        C12829k x = mo37735B().mo37792x(new C12824b(-m60562C()));
        this.f46840t = x;
        this.f46845y.mo37811d(x, this.f46829a.f46860k, m60587u(), this.f46835g);
    }

    /* renamed from: i */
    private PorterDuffColorFilter m60579i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m60581k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m60580j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m60575e(paint, z);
        }
        return m60579i(colorStateList, mode, z);
    }

    /* renamed from: k */
    private int m60581k(int i) {
        float H = mo37740H() + mo37767x();
        C12015a aVar = this.f46829a.f46851b;
        return aVar != null ? aVar.mo36379c(i, H) : i;
    }

    /* renamed from: l */
    public static C12822g m60582l(Context context, float f) {
        int b = C11758a.m57061b(context, C10126b.colorSurface, C12822g.class.getSimpleName());
        C12822g gVar = new C12822g();
        gVar.mo37741L(context);
        gVar.mo37745T(ColorStateList.valueOf(b));
        gVar.mo37744S(f);
        return gVar;
    }

    /* renamed from: m */
    private void m60583m(Canvas canvas) {
        if (this.f46829a.f46868s != 0) {
            canvas.drawPath(this.f46834f, this.f46843w.mo37570c());
        }
        for (int i = 0; i < 4; i++) {
            this.f46830b[i].mo37826b(this.f46843w, this.f46829a.f46867r, canvas);
            this.f46831c[i].mo37826b(this.f46843w, this.f46829a.f46867r, canvas);
        }
        int y = mo37768y();
        int z = mo37769z();
        canvas.translate((float) (-y), (float) (-z));
        canvas.drawPath(this.f46834f, f46825D);
        canvas.translate((float) y, (float) z);
    }

    /* renamed from: n */
    private void m60584n(Canvas canvas) {
        m60585p(canvas, this.f46841u, this.f46834f, this.f46829a.f46850a, mo37764t());
    }

    /* renamed from: p */
    private void m60585p(Canvas canvas, Paint paint, Path path, C12829k kVar, RectF rectF) {
        if (kVar.mo37789u(rectF)) {
            float a = kVar.mo37788t().mo37727a(rectF);
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: q */
    private void m60586q(Canvas canvas) {
        m60585p(canvas, this.f46842v, this.f46835g, this.f46840t, m60587u());
    }

    /* renamed from: u */
    private RectF m60587u() {
        RectF t = mo37764t();
        float C = m60562C();
        this.f46837i.set(t.left + C, t.top + C, t.right - C, t.bottom - C);
        return this.f46837i;
    }

    /* renamed from: A */
    public int mo37734A() {
        return this.f46829a.f46867r;
    }

    /* renamed from: B */
    public C12829k mo37735B() {
        return this.f46829a.f46850a;
    }

    /* renamed from: D */
    public ColorStateList mo37736D() {
        return this.f46829a.f46856g;
    }

    /* renamed from: E */
    public float mo37737E() {
        return this.f46829a.f46850a.mo37786r().mo37727a(mo37764t());
    }

    /* renamed from: F */
    public float mo37738F() {
        return this.f46829a.f46850a.mo37788t().mo37727a(mo37764t());
    }

    /* renamed from: G */
    public float mo37739G() {
        return this.f46829a.f46865p;
    }

    /* renamed from: H */
    public float mo37740H() {
        return mo37765v() + mo37739G();
    }

    /* renamed from: L */
    public void mo37741L(Context context) {
        this.f46829a.f46851b = new C12015a(context);
        m60576e0();
    }

    /* renamed from: N */
    public boolean mo37742N() {
        C12015a aVar = this.f46829a.f46851b;
        return aVar != null && aVar.mo36380d();
    }

    /* renamed from: O */
    public boolean mo37743O() {
        return this.f46829a.f46850a.mo37789u(mo37764t());
    }

    /* renamed from: S */
    public void mo37744S(float f) {
        C12825c cVar = this.f46829a;
        if (cVar.f46864o != f) {
            cVar.f46864o = f;
            m60576e0();
        }
    }

    /* renamed from: T */
    public void mo37745T(ColorStateList colorStateList) {
        C12825c cVar = this.f46829a;
        if (cVar.f46853d != colorStateList) {
            cVar.f46853d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: U */
    public void mo37746U(float f) {
        C12825c cVar = this.f46829a;
        if (cVar.f46860k != f) {
            cVar.f46860k = f;
            this.f46832d = true;
            invalidateSelf();
        }
    }

    /* renamed from: V */
    public void mo37747V(int i, int i2, int i3, int i4) {
        C12825c cVar = this.f46829a;
        if (cVar.f46858i == null) {
            cVar.f46858i = new Rect();
        }
        this.f46829a.f46858i.set(i, i2, i3, i4);
        this.f46827B = this.f46829a.f46858i;
        invalidateSelf();
    }

    /* renamed from: W */
    public void mo37748W(float f) {
        C12825c cVar = this.f46829a;
        if (cVar.f46863n != f) {
            cVar.f46863n = f;
            m60576e0();
        }
    }

    /* renamed from: X */
    public void mo37749X(int i) {
        C12825c cVar = this.f46829a;
        if (cVar.f46869t != i) {
            cVar.f46869t = i;
            m60566M();
        }
    }

    /* renamed from: Y */
    public void mo37750Y(float f, int i) {
        mo37753b0(f);
        mo37752a0(ColorStateList.valueOf(i));
    }

    /* renamed from: Z */
    public void mo37751Z(float f, ColorStateList colorStateList) {
        mo37753b0(f);
        mo37752a0(colorStateList);
    }

    /* renamed from: a0 */
    public void mo37752a0(ColorStateList colorStateList) {
        C12825c cVar = this.f46829a;
        if (cVar.f46854e != colorStateList) {
            cVar.f46854e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo37753b0(float f) {
        this.f46829a.f46861l = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f46841u.setColorFilter(this.f46846z);
        int alpha = this.f46841u.getAlpha();
        this.f46841u.setAlpha(m60567P(alpha, this.f46829a.f46862m));
        this.f46842v.setColorFilter(this.f46826A);
        this.f46842v.setStrokeWidth(this.f46829a.f46861l);
        int alpha2 = this.f46842v.getAlpha();
        this.f46842v.setAlpha(m60567P(alpha2, this.f46829a.f46862m));
        if (this.f46832d) {
            m60578h();
            m60577f(mo37764t(), this.f46834f);
            this.f46832d = false;
        }
        if (m60563I()) {
            canvas.save();
            m60568Q(canvas);
            int width = (int) (this.f46828C.width() - ((float) getBounds().width()));
            int height = (int) (this.f46828C.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f46828C.width()) + (this.f46829a.f46867r * 2) + width, ((int) this.f46828C.height()) + (this.f46829a.f46867r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f46829a.f46867r) - width);
            float f2 = (float) ((getBounds().top - this.f46829a.f46867r) - height);
            canvas2.translate(-f, -f2);
            m60583m(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (m60564J()) {
            m60584n(canvas);
        }
        if (m60565K()) {
            m60586q(canvas);
        }
        this.f46841u.setAlpha(alpha);
        this.f46842v.setAlpha(alpha2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo37754g(RectF rectF, Path path) {
        C12833l lVar = this.f46845y;
        C12825c cVar = this.f46829a;
        C12829k kVar = cVar.f46850a;
        float f = cVar.f46860k;
        lVar.mo37812e(kVar, f, rectF, this.f46844x, path);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f46829a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f46829a.f46866q != 2) {
            if (mo37743O()) {
                outline.setRoundRect(getBounds(), mo37737E());
                return;
            }
            m60577f(mo37764t(), this.f46834f);
            if (this.f46834f.isConvex()) {
                outline.setConvexPath(this.f46834f);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f46827B;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f46838r.set(getBounds());
        m60577f(mo37764t(), this.f46834f);
        this.f46839s.setPath(this.f46834f, this.f46838r);
        this.f46838r.op(this.f46839s, Region.Op.DIFFERENCE);
        return this.f46838r;
    }

    public void invalidateSelf() {
        this.f46832d = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f46829a.f46854e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f46829a.f46853d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f46829a.f46856g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f46829a.f46855f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            v6.g$c r0 = r1.f46829a
            android.content.res.ColorStateList r0 = r0.f46856g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            v6.g$c r0 = r1.f46829a
            android.content.res.ColorStateList r0 = r0.f46855f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            v6.g$c r0 = r1.f46829a
            android.content.res.ColorStateList r0 = r0.f46854e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            v6.g$c r0 = r1.f46829a
            android.content.res.ColorStateList r0 = r0.f46853d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p375v6.C12822g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.f46829a = new C12825c(this.f46829a);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo37760o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m60585p(canvas, paint, path, this.f46829a.f46850a, rectF);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f46832d = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m60572c0(iArr) || m60574d0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: r */
    public float mo37762r() {
        return this.f46829a.f46850a.mo37779j().mo37727a(mo37764t());
    }

    /* renamed from: s */
    public float mo37763s() {
        return this.f46829a.f46850a.mo37781l().mo37727a(mo37764t());
    }

    public void setAlpha(int i) {
        C12825c cVar = this.f46829a;
        if (cVar.f46862m != i) {
            cVar.f46862m = i;
            m60566M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f46829a.f46852c = colorFilter;
        m60566M();
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        this.f46829a.f46850a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f46829a.f46856g = colorStateList;
        m60574d0();
        m60566M();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C12825c cVar = this.f46829a;
        if (cVar.f46857h != mode) {
            cVar.f46857h = mode;
            m60574d0();
            m60566M();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public RectF mo37764t() {
        Rect bounds = getBounds();
        this.f46836h.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f46836h;
    }

    /* renamed from: v */
    public float mo37765v() {
        return this.f46829a.f46864o;
    }

    /* renamed from: w */
    public ColorStateList mo37766w() {
        return this.f46829a.f46853d;
    }

    /* renamed from: x */
    public float mo37767x() {
        return this.f46829a.f46863n;
    }

    /* renamed from: y */
    public int mo37768y() {
        C12825c cVar = this.f46829a;
        return (int) (((double) cVar.f46868s) * Math.sin(Math.toRadians((double) cVar.f46869t)));
    }

    /* renamed from: z */
    public int mo37769z() {
        C12825c cVar = this.f46829a;
        return (int) (((double) cVar.f46868s) * Math.cos(Math.toRadians((double) cVar.f46869t)));
    }

    public C12822g() {
        this(new C12829k());
    }

    public C12822g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C12829k.m60633e(context, attributeSet, i, i2).mo37798m());
    }

    public C12822g(C12829k kVar) {
        this(new C12825c(kVar, (C12015a) null));
    }

    private C12822g(C12825c cVar) {
        this.f46830b = new C12836m.C12843g[4];
        this.f46831c = new C12836m.C12843g[4];
        this.f46833e = new Matrix();
        this.f46834f = new Path();
        this.f46835g = new Path();
        this.f46836h = new RectF();
        this.f46837i = new RectF();
        this.f46838r = new Region();
        this.f46839s = new Region();
        Paint paint = new Paint(1);
        this.f46841u = paint;
        Paint paint2 = new Paint(1);
        this.f46842v = paint2;
        this.f46843w = new C12696a();
        this.f46845y = new C12833l();
        this.f46828C = new RectF();
        this.f46829a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f46825D;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m60574d0();
        m60572c0(getState());
        this.f46844x = new C12823a();
    }

    /* renamed from: v6.g$c */
    /* compiled from: MaterialShapeDrawable */
    static final class C12825c extends Drawable.ConstantState {

        /* renamed from: a */
        public C12829k f46850a;

        /* renamed from: b */
        public C12015a f46851b;

        /* renamed from: c */
        public ColorFilter f46852c;

        /* renamed from: d */
        public ColorStateList f46853d = null;

        /* renamed from: e */
        public ColorStateList f46854e = null;

        /* renamed from: f */
        public ColorStateList f46855f = null;

        /* renamed from: g */
        public ColorStateList f46856g = null;

        /* renamed from: h */
        public PorterDuff.Mode f46857h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f46858i = null;

        /* renamed from: j */
        public float f46859j = 1.0f;

        /* renamed from: k */
        public float f46860k = 1.0f;

        /* renamed from: l */
        public float f46861l;

        /* renamed from: m */
        public int f46862m = 255;

        /* renamed from: n */
        public float f46863n = 0.0f;

        /* renamed from: o */
        public float f46864o = 0.0f;

        /* renamed from: p */
        public float f46865p = 0.0f;

        /* renamed from: q */
        public int f46866q = 0;

        /* renamed from: r */
        public int f46867r = 0;

        /* renamed from: s */
        public int f46868s = 0;

        /* renamed from: t */
        public int f46869t = 0;

        /* renamed from: u */
        public boolean f46870u = false;

        /* renamed from: v */
        public Paint.Style f46871v = Paint.Style.FILL_AND_STROKE;

        public C12825c(C12829k kVar, C12015a aVar) {
            this.f46850a = kVar;
            this.f46851b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C12822g gVar = new C12822g(this, (C12823a) null);
            boolean unused = gVar.f46832d = true;
            return gVar;
        }

        public C12825c(C12825c cVar) {
            this.f46850a = cVar.f46850a;
            this.f46851b = cVar.f46851b;
            this.f46861l = cVar.f46861l;
            this.f46852c = cVar.f46852c;
            this.f46853d = cVar.f46853d;
            this.f46854e = cVar.f46854e;
            this.f46857h = cVar.f46857h;
            this.f46856g = cVar.f46856g;
            this.f46862m = cVar.f46862m;
            this.f46859j = cVar.f46859j;
            this.f46868s = cVar.f46868s;
            this.f46866q = cVar.f46866q;
            this.f46870u = cVar.f46870u;
            this.f46860k = cVar.f46860k;
            this.f46863n = cVar.f46863n;
            this.f46864o = cVar.f46864o;
            this.f46865p = cVar.f46865p;
            this.f46867r = cVar.f46867r;
            this.f46869t = cVar.f46869t;
            this.f46855f = cVar.f46855f;
            this.f46871v = cVar.f46871v;
            if (cVar.f46858i != null) {
                this.f46858i = new Rect(cVar.f46858i);
            }
        }
    }
}
