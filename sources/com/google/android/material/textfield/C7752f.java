package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.C0478d0;
import androidx.core.view.C0835a0;
import androidx.core.widget.C0986j;
import java.util.ArrayList;
import java.util.List;
import p227f6.C10128d;
import p227f6.C10130f;
import p236g6.C10208a;
import p236g6.C10209b;

/* renamed from: com.google.android.material.textfield.f */
/* compiled from: IndicatorViewController */
final class C7752f {

    /* renamed from: a */
    private final Context f33996a;

    /* renamed from: b */
    private final TextInputLayout f33997b;

    /* renamed from: c */
    private LinearLayout f33998c;

    /* renamed from: d */
    private int f33999d;

    /* renamed from: e */
    private FrameLayout f34000e;

    /* renamed from: f */
    private int f34001f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f34002g;

    /* renamed from: h */
    private final float f34003h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f34004i;

    /* renamed from: j */
    private int f34005j;

    /* renamed from: k */
    private CharSequence f34006k;

    /* renamed from: l */
    private boolean f34007l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f34008m;

    /* renamed from: n */
    private int f34009n;

    /* renamed from: o */
    private ColorStateList f34010o;

    /* renamed from: p */
    private CharSequence f34011p;

    /* renamed from: q */
    private boolean f34012q;

    /* renamed from: r */
    private TextView f34013r;

    /* renamed from: s */
    private int f34014s;

    /* renamed from: t */
    private ColorStateList f34015t;

    /* renamed from: u */
    private Typeface f34016u;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C7753a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f34017a;

        /* renamed from: b */
        final /* synthetic */ TextView f34018b;

        /* renamed from: c */
        final /* synthetic */ int f34019c;

        /* renamed from: d */
        final /* synthetic */ TextView f34020d;

        C7753a(int i, TextView textView, int i2, TextView textView2) {
            this.f34017a = i;
            this.f34018b = textView;
            this.f34019c = i2;
            this.f34020d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C7752f.this.f34004i = this.f34017a;
            Animator unused2 = C7752f.this.f34002g = null;
            TextView textView = this.f34018b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f34019c == 1 && C7752f.this.f34008m != null) {
                    C7752f.this.f34008m.setText((CharSequence) null);
                }
                TextView textView2 = this.f34020d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f34020d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f34020d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C7752f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f33996a = context;
        this.f33997b = textInputLayout;
        this.f34003h = (float) context.getResources().getDimensionPixelSize(C10128d.design_textinput_caption_translate_y);
    }

    /* renamed from: F */
    private void m43102F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: H */
    private void m43103H(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: I */
    private boolean m43104I(TextView textView, CharSequence charSequence) {
        return C0835a0.m3705R(this.f33997b) && this.f33997b.isEnabled() && (this.f34005j != this.f34004i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: L */
    private void m43105L(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f34002g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m43110h(arrayList2, this.f34012q, this.f34013r, 2, i3, i4);
            m43110h(arrayList2, this.f34007l, this.f34008m, 1, i3, i4);
            C10209b.m51713a(animatorSet, arrayList);
            animatorSet.addListener(new C7753a(i2, m43113l(i), i, m43113l(i2)));
            animatorSet.start();
        } else {
            m43115y(i, i2);
        }
        this.f33997b.mo25782Y();
        this.f33997b.mo25785c0(z);
        this.f33997b.mo25792e0();
    }

    /* renamed from: f */
    private boolean m43109f() {
        return (this.f33998c == null || this.f33997b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m43110h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m43111i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m43112j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m43111i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C10208a.f40650a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m43112j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f34003h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C10208a.f40653d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m43113l(int i) {
        if (i == 1) {
            return this.f34008m;
        }
        if (i != 2) {
            return null;
        }
        return this.f34013r;
    }

    /* renamed from: t */
    private boolean m43114t(int i) {
        if (i != 1 || this.f34008m == null || TextUtils.isEmpty(this.f34006k)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m43115y(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m43113l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m43113l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f34004i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo25931A(int i) {
        this.f34009n = i;
        TextView textView = this.f34008m;
        if (textView != null) {
            this.f33997b.mo25780Q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo25932B(ColorStateList colorStateList) {
        this.f34010o = colorStateList;
        TextView textView = this.f34008m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo25933C(int i) {
        this.f34014s = i;
        TextView textView = this.f34013r;
        if (textView != null) {
            C0986j.m4465n(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo25934D(boolean z) {
        if (this.f34012q != z) {
            mo25941g();
            if (z) {
                C0478d0 d0Var = new C0478d0(this.f33996a);
                this.f34013r = d0Var;
                d0Var.setId(C10130f.textinput_helper_text);
                Typeface typeface = this.f34016u;
                if (typeface != null) {
                    this.f34013r.setTypeface(typeface);
                }
                this.f34013r.setVisibility(4);
                C0835a0.m3745p0(this.f34013r, 1);
                mo25933C(this.f34014s);
                mo25935E(this.f34015t);
                mo25939d(this.f34013r, 1);
            } else {
                mo25949s();
                mo25953x(this.f34013r, 1);
                this.f34013r = null;
                this.f33997b.mo25782Y();
                this.f33997b.mo25792e0();
            }
            this.f34012q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo25935E(ColorStateList colorStateList) {
        this.f34015t = colorStateList;
        TextView textView = this.f34013r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo25936G(Typeface typeface) {
        if (typeface != this.f34016u) {
            this.f34016u = typeface;
            m43102F(this.f34008m, typeface);
            m43102F(this.f34013r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo25937J(CharSequence charSequence) {
        mo25941g();
        this.f34006k = charSequence;
        this.f34008m.setText(charSequence);
        int i = this.f34004i;
        if (i != 1) {
            this.f34005j = 1;
        }
        m43105L(i, this.f34005j, m43104I(this.f34008m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo25938K(CharSequence charSequence) {
        mo25941g();
        this.f34011p = charSequence;
        this.f34013r.setText(charSequence);
        int i = this.f34004i;
        if (i != 2) {
            this.f34005j = 2;
        }
        m43105L(i, this.f34005j, m43104I(this.f34013r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo25939d(TextView textView, int i) {
        if (this.f33998c == null && this.f34000e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f33996a);
            this.f33998c = linearLayout;
            linearLayout.setOrientation(0);
            this.f33997b.addView(this.f33998c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f33996a);
            this.f34000e = frameLayout;
            this.f33998c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f33998c.addView(new Space(this.f33996a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f33997b.getEditText() != null) {
                mo25940e();
            }
        }
        if (mo25950u(i)) {
            this.f34000e.setVisibility(0);
            this.f34000e.addView(textView);
            this.f34001f++;
        } else {
            this.f33998c.addView(textView, i);
        }
        this.f33998c.setVisibility(0);
        this.f33999d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo25940e() {
        if (m43109f()) {
            C0835a0.m3681A0(this.f33998c, C0835a0.m3692G(this.f33997b.getEditText()), 0, C0835a0.m3690F(this.f33997b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo25941g() {
        Animator animator = this.f34002g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo25942k() {
        return m43114t(this.f34005j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo25943m() {
        return this.f34006k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo25944n() {
        TextView textView = this.f34008m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ColorStateList mo25945o() {
        TextView textView = this.f34008m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public CharSequence mo25946p() {
        return this.f34011p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo25947q() {
        TextView textView = this.f34013r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo25948r() {
        this.f34006k = null;
        mo25941g();
        if (this.f34004i == 1) {
            if (!this.f34012q || TextUtils.isEmpty(this.f34011p)) {
                this.f34005j = 0;
            } else {
                this.f34005j = 2;
            }
        }
        m43105L(this.f34004i, this.f34005j, m43104I(this.f34008m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo25949s() {
        mo25941g();
        int i = this.f34004i;
        if (i == 2) {
            this.f34005j = 0;
        }
        m43105L(i, this.f34005j, m43104I(this.f34013r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo25950u(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo25951v() {
        return this.f34007l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo25952w() {
        return this.f34012q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo25953x(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f33998c != null) {
            if (!mo25950u(i) || (frameLayout = this.f34000e) == null) {
                this.f33998c.removeView(textView);
            } else {
                int i2 = this.f34001f - 1;
                this.f34001f = i2;
                m43103H(frameLayout, i2);
                this.f34000e.removeView(textView);
            }
            int i3 = this.f33999d - 1;
            this.f33999d = i3;
            m43103H(this.f33998c, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo25954z(boolean z) {
        if (this.f34007l != z) {
            mo25941g();
            if (z) {
                C0478d0 d0Var = new C0478d0(this.f33996a);
                this.f34008m = d0Var;
                d0Var.setId(C10130f.textinput_error);
                Typeface typeface = this.f34016u;
                if (typeface != null) {
                    this.f34008m.setTypeface(typeface);
                }
                mo25931A(this.f34009n);
                mo25932B(this.f34010o);
                this.f34008m.setVisibility(4);
                C0835a0.m3745p0(this.f34008m, 1);
                mo25939d(this.f34008m, 0);
            } else {
                mo25948r();
                mo25953x(this.f34008m, 0);
                this.f34008m = null;
                this.f33997b.mo25782Y();
                this.f33997b.mo25792e0();
            }
            this.f34007l = z;
        }
    }
}
