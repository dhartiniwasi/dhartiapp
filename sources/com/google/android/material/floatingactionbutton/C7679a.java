package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.util.C0831h;
import androidx.core.view.C0835a0;
import com.google.android.material.internal.C7703e;
import java.util.ArrayList;
import java.util.Iterator;
import p227f6.C10125a;
import p236g6.C10208a;
import p236g6.C10209b;
import p236g6.C10213f;
import p236g6.C10214g;
import p236g6.C10215h;
import p355t6.C12538b;
import p365u6.C12697b;
import p375v6.C12822g;
import p375v6.C12826h;
import p375v6.C12829k;
import p375v6.C12844n;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: FloatingActionButtonImpl */
class C7679a {

    /* renamed from: E */
    static final TimeInterpolator f33705E = C10208a.f40652c;

    /* renamed from: F */
    static final int[] f33706F = {16842919, 16842910};

    /* renamed from: G */
    static final int[] f33707G = {16843623, 16842908, 16842910};

    /* renamed from: H */
    static final int[] f33708H = {16842908, 16842910};

    /* renamed from: I */
    static final int[] f33709I = {16843623, 16842910};

    /* renamed from: J */
    static final int[] f33710J = {16842910};

    /* renamed from: K */
    static final int[] f33711K = new int[0];

    /* renamed from: A */
    private final RectF f33712A = new RectF();

    /* renamed from: B */
    private final RectF f33713B = new RectF();

    /* renamed from: C */
    private final Matrix f33714C = new Matrix();

    /* renamed from: D */
    private ViewTreeObserver.OnPreDrawListener f33715D;

    /* renamed from: a */
    C12829k f33716a;

    /* renamed from: b */
    C12822g f33717b;

    /* renamed from: c */
    Drawable f33718c;

    /* renamed from: d */
    Drawable f33719d;

    /* renamed from: e */
    boolean f33720e;

    /* renamed from: f */
    boolean f33721f = true;

    /* renamed from: g */
    float f33722g;

    /* renamed from: h */
    float f33723h;

    /* renamed from: i */
    float f33724i;

    /* renamed from: j */
    int f33725j;

    /* renamed from: k */
    private final C7703e f33726k;

    /* renamed from: l */
    private C10215h f33727l;

    /* renamed from: m */
    private C10215h f33728m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Animator f33729n;

    /* renamed from: o */
    private C10215h f33730o;

    /* renamed from: p */
    private C10215h f33731p;

    /* renamed from: q */
    private float f33732q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f33733r = 1.0f;

    /* renamed from: s */
    private int f33734s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f33735t = 0;

    /* renamed from: u */
    private ArrayList<Animator.AnimatorListener> f33736u;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f33737v;

    /* renamed from: w */
    private ArrayList<C7688i> f33738w;

    /* renamed from: x */
    final FloatingActionButton f33739x;

    /* renamed from: y */
    final C12697b f33740y;

    /* renamed from: z */
    private final Rect f33741z = new Rect();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* compiled from: FloatingActionButtonImpl */
    class C7680a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f33742a;

        /* renamed from: b */
        final /* synthetic */ boolean f33743b;

        /* renamed from: c */
        final /* synthetic */ C7689j f33744c;

        C7680a(boolean z, C7689j jVar) {
            this.f33743b = z;
            this.f33744c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f33742a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C7679a.this.f33735t = 0;
            Animator unused2 = C7679a.this.f33729n = null;
            if (!this.f33742a) {
                FloatingActionButton floatingActionButton = C7679a.this.f33739x;
                boolean z = this.f33743b;
                floatingActionButton.mo25745b(z ? 8 : 4, z);
                C7689j jVar = this.f33744c;
                if (jVar != null) {
                    jVar.mo25579b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C7679a.this.f33739x.mo25745b(0, this.f33743b);
            int unused = C7679a.this.f33735t = 1;
            Animator unused2 = C7679a.this.f33729n = animator;
            this.f33742a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* compiled from: FloatingActionButtonImpl */
    class C7681b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f33746a;

        /* renamed from: b */
        final /* synthetic */ C7689j f33747b;

        C7681b(boolean z, C7689j jVar) {
            this.f33746a = z;
            this.f33747b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C7679a.this.f33735t = 0;
            Animator unused2 = C7679a.this.f33729n = null;
            C7689j jVar = this.f33747b;
            if (jVar != null) {
                jVar.mo25578a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C7679a.this.f33739x.mo25745b(0, this.f33746a);
            int unused = C7679a.this.f33735t = 2;
            Animator unused2 = C7679a.this.f33729n = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* compiled from: FloatingActionButtonImpl */
    class C7682c extends C10214g {
        C7682c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C7679a.this.f33733r = f;
            return super.mo25637a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* compiled from: FloatingActionButtonImpl */
    class C7683d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f33750a = new FloatEvaluator();

        C7683d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f33750a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* compiled from: FloatingActionButtonImpl */
    class C7684e implements ViewTreeObserver.OnPreDrawListener {
        C7684e() {
        }

        public boolean onPreDraw() {
            C7679a.this.mo25592F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C7685f extends C7691l {
        C7685f() {
            super(C7679a.this, (C7680a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo25642a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C7686g extends C7691l {
        C7686g() {
            super(C7679a.this, (C7680a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo25642a() {
            C7679a aVar = C7679a.this;
            return aVar.f33722g + aVar.f33723h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C7687h extends C7691l {
        C7687h() {
            super(C7679a.this, (C7680a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo25642a() {
            C7679a aVar = C7679a.this;
            return aVar.f33722g + aVar.f33724i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C7688i {
        /* renamed from: a */
        void mo25583a();

        /* renamed from: b */
        void mo25584b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C7689j {
        /* renamed from: a */
        void mo25578a();

        /* renamed from: b */
        void mo25579b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C7690k extends C7691l {
        C7690k() {
            super(C7679a.this, (C7680a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo25642a() {
            return C7679a.this.f33722g;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C7691l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f33757a;

        /* renamed from: b */
        private float f33758b;

        /* renamed from: c */
        private float f33759c;

        private C7691l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo25642a();

        public void onAnimationEnd(Animator animator) {
            C7679a.this.mo25614c0((float) ((int) this.f33759c));
            this.f33757a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f33757a) {
                C12822g gVar = C7679a.this.f33717b;
                this.f33758b = gVar == null ? 0.0f : gVar.mo37765v();
                this.f33759c = mo25642a();
                this.f33757a = true;
            }
            C7679a aVar = C7679a.this;
            float f = this.f33758b;
            aVar.mo25614c0((float) ((int) (f + ((this.f33759c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C7691l(C7679a aVar, C7680a aVar2) {
            this();
        }
    }

    C7679a(FloatingActionButton floatingActionButton, C12697b bVar) {
        this.f33739x = floatingActionButton;
        this.f33740y = bVar;
        C7703e eVar = new C7703e();
        this.f33726k = eVar;
        eVar.mo25733a(f33706F, m42786i(new C7687h()));
        eVar.mo25733a(f33707G, m42786i(new C7686g()));
        eVar.mo25733a(f33708H, m42786i(new C7686g()));
        eVar.mo25733a(f33709I, m42786i(new C7686g()));
        eVar.mo25733a(f33710J, m42786i(new C7690k()));
        eVar.mo25733a(f33711K, m42786i(new C7685f()));
        this.f33732q = floatingActionButton.getRotation();
    }

    /* renamed from: W */
    private boolean m42779W() {
        return C0835a0.m3705R(this.f33739x) && !this.f33739x.isInEditMode();
    }

    /* renamed from: d0 */
    private void m42783d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C7683d());
        }
    }

    /* renamed from: g */
    private void m42784g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f33739x.getDrawable();
        if (drawable != null && this.f33734s != 0) {
            RectF rectF = this.f33712A;
            RectF rectF2 = this.f33713B;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f33734s;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f33734s;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m42785h(C10215h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f33739x, View.ALPHA, new float[]{f});
        hVar.mo32892e("opacity").mo32900a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f33739x, View.SCALE_X, new float[]{f2});
        hVar.mo32892e("scale").mo32900a(ofFloat2);
        m42783d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f33739x, View.SCALE_Y, new float[]{f2});
        hVar.mo32892e("scale").mo32900a(ofFloat3);
        m42783d0(ofFloat3);
        arrayList.add(ofFloat3);
        m42784g(f3, this.f33714C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f33739x, new C10213f(), new C7682c(), new Matrix[]{new Matrix(this.f33714C)});
        hVar.mo32892e("iconScale").mo32900a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C10209b.m51713a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m42786i(C7691l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f33705E);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k */
    private C10215h m42787k() {
        if (this.f33728m == null) {
            this.f33728m = C10215h.m51725c(this.f33739x.getContext(), C10125a.design_fab_hide_motion_spec);
        }
        return (C10215h) C0831h.m3662f(this.f33728m);
    }

    /* renamed from: l */
    private C10215h m42788l() {
        if (this.f33727l == null) {
            this.f33727l = C10215h.m51725c(this.f33739x.getContext(), C10125a.design_fab_show_motion_spec);
        }
        return (C10215h) C0831h.m3662f(this.f33727l);
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m42789q() {
        if (this.f33715D == null) {
            this.f33715D = new C7684e();
        }
        return this.f33715D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo25587A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo25588B() {
        ViewTreeObserver viewTreeObserver = this.f33739x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f33715D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f33715D = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo25589C(int[] iArr) {
        this.f33726k.mo25735d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo25590D(float f, float f2, float f3) {
        mo25613b0();
        mo25614c0(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo25591E(Rect rect) {
        C0831h.m3663g(this.f33719d, "Didn't initialize content background");
        if (mo25608V()) {
            this.f33740y.mo25580a(new InsetDrawable(this.f33719d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f33740y.mo25580a(this.f33719d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo25592F() {
        float rotation = this.f33739x.getRotation();
        if (this.f33732q != rotation) {
            this.f33732q = rotation;
            mo25611Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo25593G() {
        ArrayList<C7688i> arrayList = this.f33738w;
        if (arrayList != null) {
            Iterator<C7688i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo25584b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo25594H() {
        ArrayList<C7688i> arrayList = this.f33738w;
        if (arrayList != null) {
            Iterator<C7688i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo25583a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo25595I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo25596J(ColorStateList colorStateList) {
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo25597K(PorterDuff.Mode mode) {
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo25598L(float f) {
        if (this.f33722g != f) {
            this.f33722g = f;
            mo25590D(f, this.f33723h, this.f33724i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo25599M(boolean z) {
        this.f33720e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo25600N(C10215h hVar) {
        this.f33731p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo25601O(float f) {
        if (this.f33723h != f) {
            this.f33723h = f;
            mo25590D(this.f33722g, f, this.f33724i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo25602P(float f) {
        this.f33733r = f;
        Matrix matrix = this.f33714C;
        m42784g(f, matrix);
        this.f33739x.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo25603Q(float f) {
        if (this.f33724i != f) {
            this.f33724i = f;
            mo25590D(this.f33722g, this.f33723h, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo25604R(ColorStateList colorStateList) {
        Drawable drawable = this.f33718c;
        if (drawable != null) {
            C0732a.m3377o(drawable, C12538b.m59728a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo25605S(boolean z) {
        this.f33721f = z;
        mo25613b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo25606T(C12829k kVar) {
        this.f33716a = kVar;
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f33718c;
        if (drawable instanceof C12844n) {
            ((C12844n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo25607U(C10215h hVar) {
        this.f33730o = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo25608V() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo25609X() {
        return !this.f33720e || this.f33739x.getSizeDimension() >= this.f33725j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo25610Y(C7689j jVar, boolean z) {
        if (!mo25629x()) {
            Animator animator = this.f33729n;
            if (animator != null) {
                animator.cancel();
            }
            if (m42779W()) {
                if (this.f33739x.getVisibility() != 0) {
                    this.f33739x.setAlpha(0.0f);
                    this.f33739x.setScaleY(0.0f);
                    this.f33739x.setScaleX(0.0f);
                    mo25602P(0.0f);
                }
                C10215h hVar = this.f33730o;
                if (hVar == null) {
                    hVar = m42788l();
                }
                AnimatorSet h = m42785h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C7681b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f33736u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f33739x.mo25745b(0, z);
            this.f33739x.setAlpha(1.0f);
            this.f33739x.setScaleY(1.0f);
            this.f33739x.setScaleX(1.0f);
            mo25602P(1.0f);
            if (jVar != null) {
                jVar.mo25578a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo25611Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f33732q % 90.0f != 0.0f) {
                if (this.f33739x.getLayerType() != 1) {
                    this.f33739x.setLayerType(1, (Paint) null);
                }
            } else if (this.f33739x.getLayerType() != 0) {
                this.f33739x.setLayerType(0, (Paint) null);
            }
        }
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            gVar.mo37749X((int) this.f33732q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final void mo25612a0() {
        mo25602P(this.f33733r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo25613b0() {
        Rect rect = this.f33741z;
        mo25623r(rect);
        mo25591E(rect);
        this.f33740y.mo25581b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo25614c0(float f) {
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            gVar.mo37744S(f);
        }
    }

    /* renamed from: d */
    public void mo25615d(Animator.AnimatorListener animatorListener) {
        if (this.f33737v == null) {
            this.f33737v = new ArrayList<>();
        }
        this.f33737v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo25616e(Animator.AnimatorListener animatorListener) {
        if (this.f33736u == null) {
            this.f33736u = new ArrayList<>();
        }
        this.f33736u.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo25617f(C7688i iVar) {
        if (this.f33738w == null) {
            this.f33738w = new ArrayList<>();
        }
        this.f33738w.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Drawable mo25618j() {
        return this.f33719d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo25619m() {
        return this.f33722g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo25620n() {
        return this.f33720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C10215h mo25621o() {
        return this.f33731p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public float mo25622p() {
        return this.f33723h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo25623r(Rect rect) {
        int sizeDimension = this.f33720e ? (this.f33725j - this.f33739x.getSizeDimension()) / 2 : 0;
        float m = this.f33721f ? mo25619m() + this.f33724i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo25624s() {
        return this.f33724i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C12829k mo25625t() {
        return this.f33716a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C10215h mo25626u() {
        return this.f33730o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo25627v(C7689j jVar, boolean z) {
        if (!mo25628w()) {
            Animator animator = this.f33729n;
            if (animator != null) {
                animator.cancel();
            }
            if (m42779W()) {
                C10215h hVar = this.f33731p;
                if (hVar == null) {
                    hVar = m42787k();
                }
                AnimatorSet h = m42785h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C7680a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f33737v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f33739x.mo25745b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo25579b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo25628w() {
        if (this.f33739x.getVisibility() == 0) {
            if (this.f33735t == 1) {
                return true;
            }
            return false;
        } else if (this.f33735t != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo25629x() {
        if (this.f33739x.getVisibility() != 0) {
            if (this.f33735t == 2) {
                return true;
            }
            return false;
        } else if (this.f33735t != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo25630y() {
        this.f33726k.mo25734c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo25631z() {
        C12822g gVar = this.f33717b;
        if (gVar != null) {
            C12826h.m60626f(this.f33739x, gVar);
        }
        if (mo25595I()) {
            this.f33739x.getViewTreeObserver().addOnPreDrawListener(m42789q());
        }
    }
}
