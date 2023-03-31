package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p055h.C4411a;
import p227f6.C10129e;
import p227f6.C10133i;
import p236g6.C10208a;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
class C7730a extends C7751e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f33955d = new C7731a();

    /* renamed from: e */
    private final TextInputLayout.C7726f f33956e = new C7732b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f33957f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ValueAnimator f33958g;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C7731a implements TextWatcher {
        C7731a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!C7730a.m43053j(editable)) {
                C7730a.this.f33957f.cancel();
                C7730a.this.f33958g.start();
            } else if (!C7730a.this.f33993a.mo25776E()) {
                C7730a.this.f33958g.cancel();
                C7730a.this.f33957f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C7732b implements TextInputLayout.C7726f {
        C7732b() {
        }

        /* renamed from: a */
        public void mo25897a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C7730a.m43053j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C7730a.this.f33955d);
            editText.addTextChangedListener(C7730a.this.f33955d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C7733c implements View.OnClickListener {
        C7733c() {
        }

        public void onClick(View view) {
            C7730a.this.f33993a.getEditText().setText((CharSequence) null);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C7734d extends AnimatorListenerAdapter {
        C7734d() {
        }

        public void onAnimationStart(Animator animator) {
            C7730a.this.f33993a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C7735e extends AnimatorListenerAdapter {
        C7735e() {
        }

        public void onAnimationEnd(Animator animator) {
            C7730a.this.f33993a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C7736f implements ValueAnimator.AnimatorUpdateListener {
        C7736f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7730a.this.f33995c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C7737g implements ValueAnimator.AnimatorUpdateListener {
        C7737g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7730a.this.f33995c.setScaleX(floatValue);
            C7730a.this.f33995c.setScaleY(floatValue);
        }
    }

    C7730a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: h */
    private ValueAnimator m43051h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10208a.f40650a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C7736f());
        return ofFloat;
    }

    /* renamed from: i */
    private ValueAnimator m43052i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C10208a.f40653d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C7737g());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m43053j(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: k */
    private void m43054k() {
        ValueAnimator i = m43052i();
        ValueAnimator h = m43051h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33957f = animatorSet;
        animatorSet.playTogether(new Animator[]{i, h});
        this.f33957f.addListener(new C7734d());
        ValueAnimator h2 = m43051h(1.0f, 0.0f);
        this.f33958g = h2;
        h2.addListener(new C7735e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25906a() {
        this.f33993a.setEndIconDrawable(C4411a.m29346b(this.f33994b, C10129e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f33993a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10133i.clear_text_end_icon_content_description));
        this.f33993a.setEndIconOnClickListener(new C7733c());
        this.f33993a.mo25784c(this.f33956e);
        m43054k();
    }
}
