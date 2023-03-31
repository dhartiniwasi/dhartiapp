package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import com.google.android.material.textfield.TextInputLayout;
import p055h.C4411a;
import p227f6.C10126b;
import p227f6.C10128d;
import p227f6.C10129e;
import p227f6.C10133i;
import p236g6.C10208a;
import p283l6.C11758a;
import p375v6.C12822g;
import p375v6.C12829k;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: DropdownMenuEndIconDelegate */
class C7740d extends C7751e {

    /* renamed from: o */
    private static final boolean f33969o = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f33970d = new C7741a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextInputLayout.C7725e f33971e = new C7743b(this.f33993a);

    /* renamed from: f */
    private final TextInputLayout.C7726f f33972f = new C7744c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f33973g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f33974h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f33975i = Long.MAX_VALUE;

    /* renamed from: j */
    private StateListDrawable f33976j;

    /* renamed from: k */
    private C12822g f33977k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AccessibilityManager f33978l;

    /* renamed from: m */
    private ValueAnimator f33979m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ValueAnimator f33980n;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7741a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C7742a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AutoCompleteTextView f33982a;

            C7742a(AutoCompleteTextView autoCompleteTextView) {
                this.f33982a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f33982a.isPopupShowing();
                C7740d.this.m43092z(isPopupShowing);
                boolean unused = C7740d.this.f33973g = isPopupShowing;
            }
        }

        C7741a() {
        }

        public void afterTextChanged(Editable editable) {
            C7740d dVar = C7740d.this;
            AutoCompleteTextView d = dVar.m43087u(dVar.f33993a.getEditText());
            d.post(new C7742a(d));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7743b extends TextInputLayout.C7725e {
        C7743b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            cVar.mo3293X(Spinner.class.getName());
            if (cVar.mo3285K()) {
                cVar.mo3311i0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo3232h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3232h(view, accessibilityEvent);
            C7740d dVar = C7740d.this;
            AutoCompleteTextView d = dVar.m43087u(dVar.f33993a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C7740d.this.f33978l.isTouchExplorationEnabled()) {
                C7740d.this.m43069C(d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7744c implements TextInputLayout.C7726f {
        C7744c() {
        }

        /* renamed from: a */
        public void mo25897a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d = C7740d.this.m43087u(textInputLayout.getEditText());
            C7740d.this.m43067A(d);
            C7740d.this.m43084r(d);
            C7740d.this.m43068B(d);
            d.setThreshold(0);
            d.removeTextChangedListener(C7740d.this.f33970d);
            d.addTextChangedListener(C7740d.this.f33970d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C7740d.this.f33971e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7745d implements View.OnClickListener {
        C7745d() {
        }

        public void onClick(View view) {
            C7740d.this.m43069C((AutoCompleteTextView) C7740d.this.f33993a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7746e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AutoCompleteTextView f33987a;

        C7746e(AutoCompleteTextView autoCompleteTextView) {
            this.f33987a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C7740d.this.m43091y()) {
                    boolean unused = C7740d.this.f33973g = false;
                }
                C7740d.this.m43069C(this.f33987a);
                view.performClick();
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7747f implements View.OnFocusChangeListener {
        C7747f() {
        }

        public void onFocusChange(View view, boolean z) {
            C7740d.this.f33993a.setEndIconActivated(z);
            if (!z) {
                C7740d.this.m43092z(false);
                boolean unused = C7740d.this.f33973g = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7748g implements AutoCompleteTextView.OnDismissListener {
        C7748g() {
        }

        public void onDismiss() {
            boolean unused = C7740d.this.f33973g = true;
            long unused2 = C7740d.this.f33975i = System.currentTimeMillis();
            C7740d.this.m43092z(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7749h extends AnimatorListenerAdapter {
        C7749h() {
        }

        public void onAnimationEnd(Animator animator) {
            C7740d dVar = C7740d.this;
            dVar.f33995c.setChecked(dVar.f33974h);
            C7740d.this.f33980n.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C7750i implements ValueAnimator.AnimatorUpdateListener {
        C7750i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7740d.this.f33995c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    C7740d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m43067A(AutoCompleteTextView autoCompleteTextView) {
        if (f33969o) {
            int boxBackgroundMode = this.f33993a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f33977k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f33976j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m43068B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C7746e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new C7747f());
        if (f33969o) {
            autoCompleteTextView.setOnDismissListener(new C7748g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m43069C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m43091y()) {
                this.f33973g = false;
            }
            if (!this.f33973g) {
                if (f33969o) {
                    m43092z(!this.f33974h);
                } else {
                    this.f33974h = !this.f33974h;
                    this.f33995c.toggle();
                }
                if (this.f33974h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f33973g = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m43084r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f33993a.getBoxBackgroundMode();
            C12822g boxBackground = this.f33993a.getBoxBackground();
            int c = C11758a.m57062c(autoCompleteTextView, C10126b.f40232f);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m43086t(autoCompleteTextView, c, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m43085s(autoCompleteTextView, c, iArr, boxBackground);
            }
        }
    }

    /* renamed from: s */
    private void m43085s(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C12822g gVar) {
        int boxBackgroundColor = this.f33993a.getBoxBackgroundColor();
        int[] iArr2 = {C11758a.m57065f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f33969o) {
            C0835a0.m3749r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C12822g gVar2 = new C12822g(gVar.mo37735B());
        gVar2.mo37745T(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int G = C0835a0.m3692G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = C0835a0.m3690F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0835a0.m3749r0(autoCompleteTextView, layerDrawable);
        C0835a0.m3681A0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: t */
    private void m43086t(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C12822g gVar) {
        LayerDrawable layerDrawable;
        int c = C11758a.m57062c(autoCompleteTextView, C10126b.colorSurface);
        C12822g gVar2 = new C12822g(gVar.mo37735B());
        int f = C11758a.m57065f(i, c, 0.1f);
        gVar2.mo37745T(new ColorStateList(iArr, new int[]{f, 0}));
        if (f33969o) {
            gVar2.setTint(c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, c});
            C12822g gVar3 = new C12822g(gVar.mo37735B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C0835a0.m3749r0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public AutoCompleteTextView m43087u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: v */
    private ValueAnimator m43088v(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10208a.f40650a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C7750i());
        return ofFloat;
    }

    /* renamed from: w */
    private C12822g m43089w(float f, float f2, float f3, int i) {
        C12829k m = C12829k.m60629a().mo37810z(f).mo37796D(f).mo37802r(f2).mo37806v(f2).mo37798m();
        C12822g l = C12822g.m60582l(this.f33994b, f3);
        l.setShapeAppearanceModel(m);
        l.mo37747V(0, i, 0, i);
        return l;
    }

    /* renamed from: x */
    private void m43090x() {
        this.f33980n = m43088v(67, 0.0f, 1.0f);
        ValueAnimator v = m43088v(50, 1.0f, 0.0f);
        this.f33979m = v;
        v.addListener(new C7749h());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m43091y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f33975i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m43092z(boolean z) {
        if (this.f33974h != z) {
            this.f33974h = z;
            this.f33980n.cancel();
            this.f33979m.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25906a() {
        float dimensionPixelOffset = (float) this.f33994b.getResources().getDimensionPixelOffset(C10128d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f33994b.getResources().getDimensionPixelOffset(C10128d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f33994b.getResources().getDimensionPixelOffset(C10128d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C12822g w = m43089w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C12822g w2 = m43089w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f33977k = w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f33976j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, w);
        this.f33976j.addState(new int[0], w2);
        this.f33993a.setEndIconDrawable(C4411a.m29346b(this.f33994b, f33969o ? C10129e.mtrl_dropdown_arrow : C10129e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f33993a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10133i.exposed_dropdown_menu_content_description));
        this.f33993a.setEndIconOnClickListener(new C7745d());
        this.f33993a.mo25784c(this.f33972f);
        m43090x();
        C0835a0.m3761x0(this.f33995c, 2);
        this.f33978l = (AccessibilityManager) this.f33994b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo25919b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo25920c() {
        return true;
    }
}
