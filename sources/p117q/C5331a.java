package p117q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p110p.C5243a;
import p110p.C5244b;
import p110p.C5246d;
import p110p.C5247e;

/* renamed from: q.a */
/* compiled from: CardView */
public class C5331a extends FrameLayout {

    /* renamed from: h */
    private static final int[] f27352h = {16842801};

    /* renamed from: i */
    private static final C5339f f27353i;

    /* renamed from: a */
    private boolean f27354a;

    /* renamed from: b */
    private boolean f27355b;

    /* renamed from: c */
    int f27356c;

    /* renamed from: d */
    int f27357d;

    /* renamed from: e */
    final Rect f27358e;

    /* renamed from: f */
    final Rect f27359f;

    /* renamed from: g */
    private final C5338e f27360g;

    /* renamed from: q.a$a */
    /* compiled from: CardView */
    class C5332a implements C5338e {

        /* renamed from: a */
        private Drawable f27361a;

        C5332a() {
        }

        /* renamed from: b */
        public void mo19322b(int i, int i2, int i3, int i4) {
            C5331a.this.f27359f.set(i, i2, i3, i4);
            C5331a aVar = C5331a.this;
            Rect rect = aVar.f27358e;
            C5331a.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: c */
        public void mo19323c(int i, int i2) {
            C5331a aVar = C5331a.this;
            if (i > aVar.f27356c) {
                C5331a.super.setMinimumWidth(i);
            }
            C5331a aVar2 = C5331a.this;
            if (i2 > aVar2.f27357d) {
                C5331a.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: d */
        public void mo19324d(Drawable drawable) {
            this.f27361a = drawable;
            C5331a.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: e */
        public boolean mo19325e() {
            return C5331a.this.getPreventCornerOverlap();
        }

        /* renamed from: f */
        public boolean mo19326f() {
            return C5331a.this.getUseCompatPadding();
        }

        /* renamed from: g */
        public Drawable mo19327g() {
            return this.f27361a;
        }

        /* renamed from: h */
        public View mo19328h() {
            return C5331a.this;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f27353i = new C5335c();
        } else if (i >= 17) {
            f27353i = new C5333b();
        } else {
            f27353i = new C5336d();
        }
        f27353i.mo19329k();
    }

    public C5331a(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f27353i.mo19339i(this.f27360g);
    }

    public float getCardElevation() {
        return f27353i.mo19336f(this.f27360g);
    }

    public int getContentPaddingBottom() {
        return this.f27358e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f27358e.left;
    }

    public int getContentPaddingRight() {
        return this.f27358e.right;
    }

    public int getContentPaddingTop() {
        return this.f27358e.top;
    }

    public float getMaxCardElevation() {
        return f27353i.mo19337g(this.f27360g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f27355b;
    }

    public float getRadius() {
        return f27353i.mo19334d(this.f27360g);
    }

    public boolean getUseCompatPadding() {
        return this.f27354a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C5339f fVar = f27353i;
        if (!(fVar instanceof C5335c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo19332b(this.f27360g)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo19338h(this.f27360g)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f27353i.mo19342m(this.f27360g, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f27353i.mo19340j(this.f27360g, f);
    }

    public void setMaxCardElevation(float f) {
        f27353i.mo19343n(this.f27360g, f);
    }

    public void setMinimumHeight(int i) {
        this.f27357d = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f27356c = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f27355b) {
            this.f27355b = z;
            f27353i.mo19335e(this.f27360g);
        }
    }

    public void setRadius(float f) {
        f27353i.mo19333c(this.f27360g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f27354a != z) {
            this.f27354a = z;
            f27353i.mo19331a(this.f27360g);
        }
    }

    public C5331a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5243a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f27353i.mo19342m(this.f27360g, colorStateList);
    }

    public C5331a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f27358e = rect;
        this.f27359f = new Rect();
        C5332a aVar = new C5332a();
        this.f27360g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247e.f27101a, i, C5246d.CardView);
        int i3 = C5247e.f27104d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f27352h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C5244b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C5244b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C5247e.f27105e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C5247e.f27106f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C5247e.f27107g, 0.0f);
        this.f27354a = obtainStyledAttributes.getBoolean(C5247e.f27109i, false);
        this.f27355b = obtainStyledAttributes.getBoolean(C5247e.f27108h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27110j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27112l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27114n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27113m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27111k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f27356c = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27102b, 0);
        this.f27357d = obtainStyledAttributes.getDimensionPixelSize(C5247e.f27103c, 0);
        obtainStyledAttributes.recycle();
        f27353i.mo19341l(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
