package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0478d0;
import androidx.appcompat.widget.C0500i0;
import androidx.appcompat.widget.C0509k;
import androidx.core.content.C0681a;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.widget.C0986j;
import com.google.android.material.internal.C7698a;
import com.google.android.material.internal.C7700b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p055h.C4411a;
import p169y.C6079a;
import p227f6.C10126b;
import p227f6.C10127c;
import p227f6.C10130f;
import p227f6.C10133i;
import p227f6.C10134j;
import p236g6.C10208a;
import p283l6.C11758a;
import p375v6.C12822g;
import p375v6.C12829k;

public class TextInputLayout extends LinearLayout {

    /* renamed from: D0 */
    private static final int f33881D0 = C10134j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private C12829k f33882A;

    /* renamed from: A0 */
    private ValueAnimator f33883A0;

    /* renamed from: B */
    private final int f33884B;

    /* renamed from: B0 */
    private boolean f33885B0;

    /* renamed from: C */
    private int f33886C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public boolean f33887C0;

    /* renamed from: D */
    private final int f33888D;

    /* renamed from: E */
    private int f33889E;

    /* renamed from: F */
    private final int f33890F;

    /* renamed from: G */
    private final int f33891G;

    /* renamed from: H */
    private int f33892H;

    /* renamed from: I */
    private int f33893I;

    /* renamed from: J */
    private final Rect f33894J;

    /* renamed from: K */
    private final Rect f33895K;

    /* renamed from: L */
    private final RectF f33896L;

    /* renamed from: M */
    private Typeface f33897M;

    /* renamed from: N */
    private final CheckableImageButton f33898N;

    /* renamed from: O */
    private ColorStateList f33899O;

    /* renamed from: P */
    private boolean f33900P;

    /* renamed from: Q */
    private PorterDuff.Mode f33901Q;

    /* renamed from: R */
    private boolean f33902R;

    /* renamed from: S */
    private Drawable f33903S;

    /* renamed from: a */
    private final FrameLayout f33904a;

    /* renamed from: a0 */
    private View.OnLongClickListener f33905a0;

    /* renamed from: b */
    private final FrameLayout f33906b;

    /* renamed from: b0 */
    private final LinkedHashSet<C7726f> f33907b0;

    /* renamed from: c */
    EditText f33908c;

    /* renamed from: c0 */
    private int f33909c0;

    /* renamed from: d */
    private CharSequence f33910d;

    /* renamed from: d0 */
    private final SparseArray<C7751e> f33911d0;

    /* renamed from: e */
    private final C7752f f33912e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final CheckableImageButton f33913e0;

    /* renamed from: f */
    boolean f33914f;

    /* renamed from: f0 */
    private final LinkedHashSet<C7727g> f33915f0;

    /* renamed from: g */
    private int f33916g;

    /* renamed from: g0 */
    private ColorStateList f33917g0;

    /* renamed from: h */
    private boolean f33918h;

    /* renamed from: h0 */
    private boolean f33919h0;

    /* renamed from: i */
    private TextView f33920i;

    /* renamed from: i0 */
    private PorterDuff.Mode f33921i0;

    /* renamed from: j0 */
    private boolean f33922j0;

    /* renamed from: k0 */
    private Drawable f33923k0;

    /* renamed from: l0 */
    private Drawable f33924l0;

    /* renamed from: m0 */
    private final CheckableImageButton f33925m0;

    /* renamed from: n0 */
    private View.OnLongClickListener f33926n0;

    /* renamed from: o0 */
    private ColorStateList f33927o0;

    /* renamed from: p0 */
    private ColorStateList f33928p0;

    /* renamed from: q0 */
    private final int f33929q0;

    /* renamed from: r */
    private int f33930r;

    /* renamed from: r0 */
    private final int f33931r0;

    /* renamed from: s */
    private int f33932s;

    /* renamed from: s0 */
    private int f33933s0;

    /* renamed from: t */
    private ColorStateList f33934t;

    /* renamed from: t0 */
    private int f33935t0;

    /* renamed from: u */
    private ColorStateList f33936u;

    /* renamed from: u0 */
    private final int f33937u0;

    /* renamed from: v */
    private boolean f33938v;

    /* renamed from: v0 */
    private final int f33939v0;

    /* renamed from: w */
    private CharSequence f33940w;

    /* renamed from: w0 */
    private final int f33941w0;

    /* renamed from: x */
    private boolean f33942x;

    /* renamed from: x0 */
    private boolean f33943x0;

    /* renamed from: y */
    private C12822g f33944y;

    /* renamed from: y0 */
    final C7698a f33945y0;

    /* renamed from: z */
    private C12822g f33946z;

    /* renamed from: z0 */
    private boolean f33947z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C7721a implements TextWatcher {
        C7721a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo25785c0(!textInputLayout.f33887C0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f33914f) {
                textInputLayout2.mo25781V(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C7722b implements Runnable {
        C7722b() {
        }

        public void run() {
            TextInputLayout.this.f33913e0.performClick();
            TextInputLayout.this.f33913e0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C7723c implements Runnable {
        C7723c() {
        }

        public void run() {
            TextInputLayout.this.f33908c.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C7724d implements ValueAnimator.AnimatorUpdateListener {
        C7724d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f33945y0.mo25699O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C7725e extends C0832a {

        /* renamed from: d */
        private final TextInputLayout f33952d;

        public C7725e(TextInputLayout textInputLayout) {
            this.f33952d = textInputLayout;
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            EditText editText = this.f33952d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f33952d.getHint();
            CharSequence error = this.f33952d.getError();
            CharSequence counterOverflowDescription = this.f33952d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.mo3328s0(text);
            } else if (z2) {
                cVar.mo3328s0(hint);
            }
            if (z2) {
                cVar.mo3311i0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.mo3323p0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.mo3304e0(error);
                cVar.mo3301c0(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C7726f {
        /* renamed from: a */
        void mo25897a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C7727g {
        /* renamed from: a */
        void mo25898a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C7728h extends C6079a {
        public static final Parcelable.Creator<C7728h> CREATOR = new C7729a();

        /* renamed from: c */
        CharSequence f33953c;

        /* renamed from: d */
        boolean f33954d;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C7729a implements Parcelable.ClassLoaderCreator<C7728h> {
            C7729a() {
            }

            /* renamed from: a */
            public C7728h createFromParcel(Parcel parcel) {
                return new C7728h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C7728h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7728h(parcel, classLoader);
            }

            /* renamed from: c */
            public C7728h[] newArray(int i) {
                return new C7728h[i];
            }
        }

        C7728h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f33953c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f33953c, parcel, i);
            parcel.writeInt(this.f33954d ? 1 : 0);
        }

        C7728h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f33953c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f33954d = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.textInputStyle);
    }

    /* renamed from: A */
    private void m42984A(Canvas canvas) {
        if (this.f33938v) {
            this.f33945y0.mo25706i(canvas);
        }
    }

    /* renamed from: B */
    private void m42985B(boolean z) {
        ValueAnimator valueAnimator = this.f33883A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33883A0.cancel();
        }
        if (!z || !this.f33947z0) {
            this.f33945y0.mo25699O(0.0f);
        } else {
            mo25791e(0.0f);
        }
        if (m43025w() && ((C7739c) this.f33944y).mo25915f0()) {
            m43023u();
        }
        this.f33943x0 = true;
    }

    /* renamed from: C */
    private boolean m42986C() {
        return this.f33909c0 != 0;
    }

    /* renamed from: D */
    private boolean m42987D() {
        return getStartIconDrawable() != null;
    }

    /* renamed from: H */
    private boolean m42988H() {
        if (this.f33886C != 1 || (Build.VERSION.SDK_INT >= 16 && this.f33908c.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private void m42989J() {
        m43014l();
        m42992M();
        mo25792e0();
        if (this.f33886C != 0) {
            m43006b0();
        }
    }

    /* renamed from: K */
    private void m42990K() {
        if (m43025w()) {
            RectF rectF = this.f33896L;
            this.f33945y0.mo25707k(rectF);
            m43010h(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C7739c) this.f33944y).mo25918l0(rectF);
        }
    }

    /* renamed from: L */
    private static void m42991L(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m42991L((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: M */
    private void m42992M() {
        if (m42996R()) {
            C0835a0.m3749r0(this.f33908c, this.f33944y);
        }
    }

    /* renamed from: N */
    private static void m42993N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean M = C0835a0.m3700M(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (M || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(M);
        checkableImageButton.setPressable(M);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C0835a0.m3761x0(checkableImageButton, i);
    }

    /* renamed from: O */
    private static void m42994O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m42993N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: P */
    private static void m42995P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m42993N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: R */
    private boolean m42996R() {
        EditText editText = this.f33908c;
        return (editText == null || this.f33944y == null || editText.getBackground() != null || this.f33886C == 0) ? false : true;
    }

    /* renamed from: S */
    private void m42997S(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m43011i();
            return;
        }
        Drawable mutate = C0732a.m3380r(getEndIconDrawable()).mutate();
        C0732a.m3376n(mutate, this.f33912e.mo25944n());
        this.f33913e0.setImageDrawable(mutate);
    }

    /* renamed from: T */
    private void m42998T(Rect rect) {
        C12822g gVar = this.f33946z;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f33891G, rect.right, i);
        }
    }

    /* renamed from: U */
    private void m42999U() {
        if (this.f33920i != null) {
            EditText editText = this.f33908c;
            mo25781V(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: W */
    private static void m43000W(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C10133i.character_counter_overflowed_content_description : C10133i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: X */
    private void m43001X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f33920i;
        if (textView != null) {
            mo25780Q(textView, this.f33918h ? this.f33930r : this.f33932s);
            if (!this.f33918h && (colorStateList2 = this.f33934t) != null) {
                this.f33920i.setTextColor(colorStateList2);
            }
            if (this.f33918h && (colorStateList = this.f33936u) != null) {
                this.f33920i.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: Z */
    private boolean m43002Z() {
        int max;
        if (this.f33908c == null || this.f33908c.getMeasuredHeight() >= (max = Math.max(this.f33913e0.getMeasuredHeight(), this.f33898N.getMeasuredHeight()))) {
            return false;
        }
        this.f33908c.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m43004a0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f33908c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m42987D()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r10.mo25779I()
            if (r0 == 0) goto L_0x0060
            com.google.android.material.internal.CheckableImageButton r0 = r10.f33898N
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r10.f33903S
            if (r0 != 0) goto L_0x0048
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.f33903S = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.f33898N
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f33908c
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.f33898N
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C0913h.m4128a(r6)
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.f33903S
            r6.setBounds(r1, r1, r0, r5)
        L_0x0048:
            android.widget.EditText r0 = r10.f33908c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0986j.m4452a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f33903S
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f33908c
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0986j.m4460i(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.f33903S
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f33908c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0986j.m4452a(r0)
            android.widget.EditText r6 = r10.f33908c
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0986j.m4460i(r6, r2, r7, r8, r0)
            r10.f33903S = r2
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00ca
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00ca
            android.graphics.drawable.Drawable r2 = r10.f33923k0
            if (r2 != 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.f33923k0 = r2
            int r2 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f33908c
            int r7 = r7.getPaddingRight()
            int r2 = r2 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C0913h.m4129b(r6)
            int r2 = r2 + r6
            android.graphics.drawable.Drawable r6 = r10.f33923k0
            r6.setBounds(r1, r1, r2, r5)
        L_0x00ac:
            android.widget.EditText r2 = r10.f33908c
            android.graphics.drawable.Drawable[] r2 = androidx.core.widget.C0986j.m4452a(r2)
            r6 = r2[r4]
            android.graphics.drawable.Drawable r7 = r10.f33923k0
            if (r6 == r7) goto L_0x00c8
            r0 = r2[r4]
            r10.f33924l0 = r0
            android.widget.EditText r0 = r10.f33908c
            r1 = r2[r1]
            r4 = r2[r5]
            r2 = r2[r3]
            androidx.core.widget.C0986j.m4460i(r0, r1, r4, r7, r2)
            goto L_0x00eb
        L_0x00c8:
            r5 = r0
            goto L_0x00eb
        L_0x00ca:
            android.graphics.drawable.Drawable r6 = r10.f33923k0
            if (r6 == 0) goto L_0x00ec
            android.widget.EditText r6 = r10.f33908c
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0986j.m4452a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f33923k0
            if (r4 != r7) goto L_0x00e8
            android.widget.EditText r0 = r10.f33908c
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f33924l0
            r3 = r6[r3]
            androidx.core.widget.C0986j.m4460i(r0, r1, r4, r7, r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = r0
        L_0x00e9:
            r10.f33923k0 = r2
        L_0x00eb:
            r0 = r5
        L_0x00ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m43004a0():boolean");
    }

    /* renamed from: b0 */
    private void m43006b0() {
        if (this.f33886C != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33904a.getLayoutParams();
            int r = m43020r();
            if (r != layoutParams.topMargin) {
                layoutParams.topMargin = r;
                this.f33904a.requestLayout();
            }
        }
    }

    /* renamed from: d0 */
    private void m43007d0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f33908c;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f33908c;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean k = this.f33912e.mo25942k();
        ColorStateList colorStateList2 = this.f33927o0;
        if (colorStateList2 != null) {
            this.f33945y0.mo25691E(colorStateList2);
            this.f33945y0.mo25696K(this.f33927o0);
        }
        if (!isEnabled) {
            this.f33945y0.mo25691E(ColorStateList.valueOf(this.f33941w0));
            this.f33945y0.mo25696K(ColorStateList.valueOf(this.f33941w0));
        } else if (k) {
            this.f33945y0.mo25691E(this.f33912e.mo25945o());
        } else if (this.f33918h && (textView = this.f33920i) != null) {
            this.f33945y0.mo25691E(textView.getTextColors());
        } else if (z3 && (colorStateList = this.f33928p0) != null) {
            this.f33945y0.mo25691E(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || k))) {
            if (z2 || this.f33943x0) {
                m43024v(z);
            }
        } else if (z2 || !this.f33943x0) {
            m42985B(z);
        }
    }

    /* renamed from: f */
    private void m43008f() {
        C12822g gVar = this.f33944y;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f33882A);
            if (m43021s()) {
                this.f33944y.mo37750Y((float) this.f33889E, this.f33892H);
            }
            int m = m43015m();
            this.f33893I = m;
            this.f33944y.mo37745T(ColorStateList.valueOf(m));
            if (this.f33909c0 == 3) {
                this.f33908c.getBackground().invalidateSelf();
            }
            m43009g();
            invalidate();
        }
    }

    /* renamed from: g */
    private void m43009g() {
        if (this.f33946z != null) {
            if (m43022t()) {
                this.f33946z.mo37745T(ColorStateList.valueOf(this.f33892H));
            }
            invalidate();
        }
    }

    private C7751e getEndIconDelegate() {
        C7751e eVar = this.f33911d0.get(this.f33909c0);
        return eVar != null ? eVar : this.f33911d0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f33925m0.getVisibility() == 0) {
            return this.f33925m0;
        }
        if (!m42986C() || !mo25776E()) {
            return null;
        }
        return this.f33913e0;
    }

    /* renamed from: h */
    private void m43010h(RectF rectF) {
        float f = rectF.left;
        int i = this.f33884B;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: i */
    private void m43011i() {
        m43012j(this.f33913e0, this.f33919h0, this.f33917g0, this.f33922j0, this.f33921i0);
    }

    /* renamed from: j */
    private void m43012j(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0732a.m3380r(drawable).mutate();
            if (z) {
                C0732a.m3377o(drawable, colorStateList);
            }
            if (z2) {
                C0732a.m3378p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: k */
    private void m43013k() {
        m43012j(this.f33898N, this.f33900P, this.f33899O, this.f33902R, this.f33901Q);
    }

    /* renamed from: l */
    private void m43014l() {
        int i = this.f33886C;
        if (i == 0) {
            this.f33944y = null;
            this.f33946z = null;
        } else if (i == 1) {
            this.f33944y = new C12822g(this.f33882A);
            this.f33946z = new C12822g();
        } else if (i == 2) {
            if (!this.f33938v || (this.f33944y instanceof C7739c)) {
                this.f33944y = new C12822g(this.f33882A);
            } else {
                this.f33944y = new C7739c(this.f33882A);
            }
            this.f33946z = null;
        } else {
            throw new IllegalArgumentException(this.f33886C + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: m */
    private int m43015m() {
        return this.f33886C == 1 ? C11758a.m57064e(C11758a.m57063d(this, C10126b.colorSurface, 0), this.f33893I) : this.f33893I;
    }

    /* renamed from: n */
    private Rect m43016n(Rect rect) {
        EditText editText = this.f33908c;
        if (editText != null) {
            Rect rect2 = this.f33895K;
            rect2.bottom = rect.bottom;
            int i = this.f33886C;
            if (i == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = rect.top + this.f33888D;
                rect2.right = rect.right - this.f33908c.getCompoundPaddingRight();
                return rect2;
            } else if (i != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.f33908c.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m43020r();
                rect2.right = rect.right - this.f33908c.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    private int m43017o(Rect rect, Rect rect2, float f) {
        if (this.f33886C == 1) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f33908c.getCompoundPaddingBottom();
    }

    /* renamed from: p */
    private int m43018p(Rect rect, float f) {
        if (m42988H()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f33908c.getCompoundPaddingTop();
    }

    /* renamed from: q */
    private Rect m43019q(Rect rect) {
        if (this.f33908c != null) {
            Rect rect2 = this.f33895K;
            float q = this.f33945y0.mo25711q();
            rect2.left = rect.left + this.f33908c.getCompoundPaddingLeft();
            rect2.top = m43018p(rect, q);
            rect2.right = rect.right - this.f33908c.getCompoundPaddingRight();
            rect2.bottom = m43017o(rect, rect2, q);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m43020r() {
        float m;
        if (!this.f33938v) {
            return 0;
        }
        int i = this.f33886C;
        if (i == 0 || i == 1) {
            m = this.f33945y0.mo25709m();
        } else if (i != 2) {
            return 0;
        } else {
            m = this.f33945y0.mo25709m() / 2.0f;
        }
        return (int) m;
    }

    /* renamed from: s */
    private boolean m43021s() {
        return this.f33886C == 2 && m43022t();
    }

    private void setEditText(EditText editText) {
        if (this.f33908c == null) {
            if (this.f33909c0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f33908c = editText;
            m42989J();
            setTextInputAccessibilityDelegate(new C7725e(this));
            this.f33945y0.mo25704U(this.f33908c.getTypeface());
            this.f33945y0.mo25698M(this.f33908c.getTextSize());
            int gravity = this.f33908c.getGravity();
            this.f33945y0.mo25692F((gravity & -113) | 48);
            this.f33945y0.mo25697L(gravity);
            this.f33908c.addTextChangedListener(new C7721a());
            if (this.f33927o0 == null) {
                this.f33927o0 = this.f33908c.getHintTextColors();
            }
            if (this.f33938v) {
                if (TextUtils.isEmpty(this.f33940w)) {
                    CharSequence hint = this.f33908c.getHint();
                    this.f33910d = hint;
                    setHint(hint);
                    this.f33908c.setHint((CharSequence) null);
                }
                this.f33942x = true;
            }
            if (this.f33920i != null) {
                mo25781V(this.f33908c.getText().length());
            }
            mo25782Y();
            this.f33912e.mo25940e();
            this.f33898N.bringToFront();
            this.f33906b.bringToFront();
            this.f33925m0.bringToFront();
            m43026x();
            m43007d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f33925m0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f33906b;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!m42986C()) {
            m43004a0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f33940w)) {
            this.f33940w = charSequence;
            this.f33945y0.mo25702S(charSequence);
            if (!this.f33943x0) {
                m42990K();
            }
        }
    }

    /* renamed from: t */
    private boolean m43022t() {
        return this.f33889E > -1 && this.f33892H != 0;
    }

    /* renamed from: u */
    private void m43023u() {
        if (m43025w()) {
            ((C7739c) this.f33944y).mo25916i0();
        }
    }

    /* renamed from: v */
    private void m43024v(boolean z) {
        ValueAnimator valueAnimator = this.f33883A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33883A0.cancel();
        }
        if (!z || !this.f33947z0) {
            this.f33945y0.mo25699O(1.0f);
        } else {
            mo25791e(1.0f);
        }
        this.f33943x0 = false;
        if (m43025w()) {
            m42990K();
        }
    }

    /* renamed from: w */
    private boolean m43025w() {
        return this.f33938v && !TextUtils.isEmpty(this.f33940w) && (this.f33944y instanceof C7739c);
    }

    /* renamed from: x */
    private void m43026x() {
        Iterator it = this.f33907b0.iterator();
        while (it.hasNext()) {
            ((C7726f) it.next()).mo25897a(this);
        }
    }

    /* renamed from: y */
    private void m43027y(int i) {
        Iterator it = this.f33915f0.iterator();
        while (it.hasNext()) {
            ((C7727g) it.next()).mo25898a(this, i);
        }
    }

    /* renamed from: z */
    private void m43028z(Canvas canvas) {
        C12822g gVar = this.f33946z;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f33889E;
            this.f33946z.draw(canvas);
        }
    }

    /* renamed from: E */
    public boolean mo25776E() {
        return this.f33906b.getVisibility() == 0 && this.f33913e0.getVisibility() == 0;
    }

    /* renamed from: F */
    public boolean mo25777F() {
        return this.f33912e.mo25952w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo25778G() {
        return this.f33942x;
    }

    /* renamed from: I */
    public boolean mo25779I() {
        return this.f33898N.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo25780Q(TextView textView, int i) {
        boolean z = true;
        try {
            C0986j.m4465n(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0986j.m4465n(textView, C10134j.f40237a);
            textView.setTextColor(C0681a.m3148d(getContext(), C10127c.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo25781V(int i) {
        boolean z = this.f33918h;
        if (this.f33916g == -1) {
            this.f33920i.setText(String.valueOf(i));
            this.f33920i.setContentDescription((CharSequence) null);
            this.f33918h = false;
        } else {
            if (C0835a0.m3742o(this.f33920i) == 1) {
                C0835a0.m3745p0(this.f33920i, 0);
            }
            this.f33918h = i > this.f33916g;
            m43000W(getContext(), this.f33920i, i, this.f33916g, this.f33918h);
            if (z != this.f33918h) {
                m43001X();
                if (this.f33918h) {
                    C0835a0.m3745p0(this.f33920i, 1);
                }
            }
            this.f33920i.setText(getContext().getString(C10133i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f33916g)}));
        }
        if (this.f33908c != null && z != this.f33918h) {
            mo25785c0(false);
            mo25792e0();
            mo25782Y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo25782Y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f33908c;
        if (editText != null && this.f33886C == 0 && (background = editText.getBackground()) != null) {
            if (C0500i0.m2464a(background)) {
                background = background.mutate();
            }
            if (this.f33912e.mo25942k()) {
                background.setColorFilter(C0509k.m2500e(this.f33912e.mo25944n(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f33918h || (textView = this.f33920i) == null) {
                C0732a.m3365c(background);
                this.f33908c.refreshDrawableState();
            } else {
                background.setColorFilter(C0509k.m2500e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f33904a.addView(view, layoutParams2);
            this.f33904a.setLayoutParams(layoutParams);
            m43006b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public void mo25784c(C7726f fVar) {
        this.f33907b0.add(fVar);
        if (this.f33908c != null) {
            fVar.mo25897a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo25785c0(boolean z) {
        m43007d0(z, false);
    }

    /* renamed from: d */
    public void mo25786d(C7727g gVar) {
        this.f33915f0.add(gVar);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f33910d == null || (editText = this.f33908c) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f33942x;
        this.f33942x = false;
        CharSequence hint = editText.getHint();
        this.f33908c.setHint(this.f33910d);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f33908c.setHint(hint);
            this.f33942x = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f33887C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f33887C0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m42984A(canvas);
        m43028z(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f33885B0) {
            boolean z = true;
            this.f33885B0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C7698a aVar = this.f33945y0;
            boolean R = aVar != null ? aVar.mo25701R(drawableState) | false : false;
            if (!C0835a0.m3705R(this) || !isEnabled()) {
                z = false;
            }
            mo25785c0(z);
            mo25782Y();
            mo25792e0();
            if (R) {
                invalidate();
            }
            this.f33885B0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo25791e(float f) {
        if (this.f33945y0.mo25712r() != f) {
            if (this.f33883A0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f33883A0 = valueAnimator;
                valueAnimator.setInterpolator(C10208a.f40651b);
                this.f33883A0.setDuration(167);
                this.f33883A0.addUpdateListener(new C7724d());
            }
            this.f33883A0.setFloatValues(new float[]{this.f33945y0.mo25712r(), f});
            this.f33883A0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f33908c;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25792e0() {
        /*
            r5 = this;
            v6.g r0 = r5.f33944y
            if (r0 == 0) goto L_0x00d3
            int r0 = r5.f33886C
            if (r0 != 0) goto L_0x000a
            goto L_0x00d3
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f33908c
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f33908c
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.f33941w0
            r5.f33892H = r4
            goto L_0x0071
        L_0x003f:
            com.google.android.material.textfield.f r4 = r5.f33912e
            boolean r4 = r4.mo25942k()
            if (r4 == 0) goto L_0x0050
            com.google.android.material.textfield.f r4 = r5.f33912e
            int r4 = r4.mo25944n()
            r5.f33892H = r4
            goto L_0x0071
        L_0x0050:
            boolean r4 = r5.f33918h
            if (r4 == 0) goto L_0x005f
            android.widget.TextView r4 = r5.f33920i
            if (r4 == 0) goto L_0x005f
            int r4 = r4.getCurrentTextColor()
            r5.f33892H = r4
            goto L_0x0071
        L_0x005f:
            if (r0 == 0) goto L_0x0066
            int r4 = r5.f33933s0
            r5.f33892H = r4
            goto L_0x0071
        L_0x0066:
            if (r3 == 0) goto L_0x006d
            int r4 = r5.f33931r0
            r5.f33892H = r4
            goto L_0x0071
        L_0x006d:
            int r4 = r5.f33929q0
            r5.f33892H = r4
        L_0x0071:
            com.google.android.material.textfield.f r4 = r5.f33912e
            boolean r4 = r4.mo25942k()
            if (r4 == 0) goto L_0x0085
            com.google.android.material.textfield.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.mo25920c()
            if (r4 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            r5.m42997S(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f33912e
            boolean r4 = r4.mo25951v()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f33912e
            boolean r4 = r4.mo25942k()
            if (r4 == 0) goto L_0x00a0
            r1 = 1
        L_0x00a0:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00b2
        L_0x00a7:
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x00b2
            int r0 = r5.f33891G
            r5.f33889E = r0
            goto L_0x00b6
        L_0x00b2:
            int r0 = r5.f33890F
            r5.f33889E = r0
        L_0x00b6:
            int r0 = r5.f33886C
            if (r0 != r2) goto L_0x00d0
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x00c5
            int r0 = r5.f33937u0
            r5.f33893I = r0
            goto L_0x00d0
        L_0x00c5:
            if (r3 == 0) goto L_0x00cc
            int r0 = r5.f33939v0
            r5.f33893I = r0
            goto L_0x00d0
        L_0x00cc:
            int r0 = r5.f33935t0
            r5.f33893I = r0
        L_0x00d0:
            r5.m43008f()
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo25792e0():void");
    }

    public int getBaseline() {
        EditText editText = this.f33908c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m43020r();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C12822g getBoxBackground() {
        int i = this.f33886C;
        if (i == 1 || i == 2) {
            return this.f33944y;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f33893I;
    }

    public int getBoxBackgroundMode() {
        return this.f33886C;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f33944y.mo37762r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f33944y.mo37763s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f33944y.mo37738F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f33944y.mo37737E();
    }

    public int getBoxStrokeColor() {
        return this.f33933s0;
    }

    public int getCounterMaxLength() {
        return this.f33916g;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f33914f || !this.f33918h || (textView = this.f33920i) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f33934t;
    }

    public ColorStateList getCounterTextColor() {
        return this.f33934t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f33927o0;
    }

    public EditText getEditText() {
        return this.f33908c;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f33913e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f33913e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f33909c0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f33913e0;
    }

    public CharSequence getError() {
        if (this.f33912e.mo25951v()) {
            return this.f33912e.mo25943m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f33912e.mo25944n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f33925m0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f33912e.mo25944n();
    }

    public CharSequence getHelperText() {
        if (this.f33912e.mo25952w()) {
            return this.f33912e.mo25946p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f33912e.mo25947q();
    }

    public CharSequence getHint() {
        if (this.f33938v) {
            return this.f33940w;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f33945y0.mo25709m();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f33945y0.mo25710n();
    }

    public ColorStateList getHintTextColor() {
        return this.f33928p0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f33913e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f33913e0.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f33898N.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f33898N.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f33897M;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f33908c;
        if (editText != null) {
            Rect rect = this.f33894J;
            C7700b.m42928a(this, editText, rect);
            m42998T(rect);
            if (this.f33938v) {
                this.f33945y0.mo25689C(m43016n(rect));
                this.f33945y0.mo25695J(m43019q(rect));
                this.f33945y0.mo25715z();
                if (m43025w() && !this.f33943x0) {
                    m42990K();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean Z = m43002Z();
        boolean a0 = m43004a0();
        if (Z || a0) {
            this.f33908c.post(new C7723c());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7728h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7728h hVar = (C7728h) parcelable;
        super.onRestoreInstanceState(hVar.mo20873a());
        setError(hVar.f33953c);
        if (hVar.f33954d) {
            this.f33913e0.post(new C7722b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C7728h hVar = new C7728h(super.onSaveInstanceState());
        if (this.f33912e.mo25942k()) {
            hVar.f33953c = getError();
        }
        hVar.f33954d = m42986C() && this.f33913e0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f33893I != i) {
            this.f33893I = i;
            this.f33935t0 = i;
            m43008f();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0681a.m3148d(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f33886C) {
            this.f33886C = i;
            if (this.f33908c != null) {
                m42989J();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f33933s0 != i) {
            this.f33933s0 = i;
            mo25792e0();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f33914f != z) {
            if (z) {
                C0478d0 d0Var = new C0478d0(getContext());
                this.f33920i = d0Var;
                d0Var.setId(C10130f.textinput_counter);
                Typeface typeface = this.f33897M;
                if (typeface != null) {
                    this.f33920i.setTypeface(typeface);
                }
                this.f33920i.setMaxLines(1);
                this.f33912e.mo25939d(this.f33920i, 2);
                m43001X();
                m42999U();
            } else {
                this.f33912e.mo25953x(this.f33920i, 2);
                this.f33920i = null;
            }
            this.f33914f = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f33916g != i) {
            if (i > 0) {
                this.f33916g = i;
            } else {
                this.f33916g = -1;
            }
            if (this.f33914f) {
                m42999U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f33930r != i) {
            this.f33930r = i;
            m43001X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f33936u != colorStateList) {
            this.f33936u = colorStateList;
            m43001X();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f33932s != i) {
            this.f33932s = i;
            m43001X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f33934t != colorStateList) {
            this.f33934t = colorStateList;
            m43001X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f33927o0 = colorStateList;
        this.f33928p0 = colorStateList;
        if (this.f33908c != null) {
            mo25785c0(false);
        }
    }

    public void setEnabled(boolean z) {
        m42991L(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f33913e0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f33913e0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f33909c0;
        this.f33909c0 = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo25919b(this.f33886C)) {
            getEndIconDelegate().mo25906a();
            m43011i();
            m43027y(i2);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f33886C + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m42994O(this.f33913e0, onClickListener, this.f33926n0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f33926n0 = onLongClickListener;
        m42995P(this.f33913e0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f33917g0 != colorStateList) {
            this.f33917g0 = colorStateList;
            this.f33919h0 = true;
            m43011i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f33921i0 != mode) {
            this.f33921i0 = mode;
            this.f33922j0 = true;
            m43011i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo25776E() != z) {
            this.f33913e0.setVisibility(z ? 0 : 4);
            m43004a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f33912e.mo25951v()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f33912e.mo25937J(charSequence);
        } else {
            this.f33912e.mo25948r();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f33912e.mo25954z(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f33925m0.getDrawable();
        if (drawable != null) {
            drawable = C0732a.m3380r(drawable).mutate();
            C0732a.m3377o(drawable, colorStateList);
        }
        if (this.f33925m0.getDrawable() != drawable) {
            this.f33925m0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f33925m0.getDrawable();
        if (drawable != null) {
            drawable = C0732a.m3380r(drawable).mutate();
            C0732a.m3378p(drawable, mode);
        }
        if (this.f33925m0.getDrawable() != drawable) {
            this.f33925m0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f33912e.mo25931A(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f33912e.mo25932B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo25777F()) {
                setHelperTextEnabled(true);
            }
            this.f33912e.mo25938K(charSequence);
        } else if (mo25777F()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f33912e.mo25935E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f33912e.mo25934D(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f33912e.mo25933C(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f33938v) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f33947z0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f33938v) {
            this.f33938v = z;
            if (!z) {
                this.f33942x = false;
                if (!TextUtils.isEmpty(this.f33940w) && TextUtils.isEmpty(this.f33908c.getHint())) {
                    this.f33908c.setHint(this.f33940w);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f33908c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f33940w)) {
                        setHint(hint);
                    }
                    this.f33908c.setHint((CharSequence) null);
                }
                this.f33942x = true;
            }
            if (this.f33908c != null) {
                m43006b0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f33945y0.mo25690D(i);
        this.f33928p0 = this.f33945y0.mo25708l();
        if (this.f33908c != null) {
            mo25785c0(false);
            m43006b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f33928p0 != colorStateList) {
            if (this.f33927o0 == null) {
                this.f33945y0.mo25691E(colorStateList);
            }
            this.f33928p0 = colorStateList;
            if (this.f33908c != null) {
                mo25785c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f33909c0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f33917g0 = colorStateList;
        this.f33919h0 = true;
        m43011i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f33921i0 = mode;
        this.f33922j0 = true;
        m43011i();
    }

    public void setStartIconCheckable(boolean z) {
        this.f33898N.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m42994O(this.f33898N, onClickListener, this.f33905a0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f33905a0 = onLongClickListener;
        m42995P(this.f33898N, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f33899O != colorStateList) {
            this.f33899O = colorStateList;
            this.f33900P = true;
            m43013k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f33901Q != mode) {
            this.f33901Q = mode;
            this.f33902R = true;
            m43013k();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo25779I() != z) {
            this.f33898N.setVisibility(z ? 0 : 8);
            m43004a0();
        }
    }

    public void setTextInputAccessibilityDelegate(C7725e eVar) {
        EditText editText = this.f33908c;
        if (editText != null) {
            C0835a0.m3741n0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f33897M) {
            this.f33897M = typeface;
            this.f33945y0.mo25704U(typeface);
            this.f33912e.mo25936G(typeface);
            TextView textView = this.f33920i;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r21
            r8 = r22
            int r9 = f33881D0
            r1 = r20
            android.content.Context r1 = com.google.android.material.internal.C7709g.m42957f(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f33912e = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f33894J = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f33895K = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f33896L = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f33907b0 = r1
            r10 = 0
            r0.f33909c0 = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.f33911d0 = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f33915f0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f33945y0 = r1
            android.content.Context r12 = r19.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f33904a = r14
            r14.setAddStatesFromChildren(r13)
            r0.addView(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r12)
            r0.f33906b = r15
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r3, r3, r4)
            r15.setLayoutParams(r2)
            r14.addView(r15)
            android.animation.TimeInterpolator r2 = p236g6.C10208a.f40650a
            r1.mo25703T(r2)
            r1.mo25700Q(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo25692F(r2)
            int[] r3 = p227f6.C10135k.f40450n3
            r1 = 5
            int[] r6 = new int[r1]
            int r5 = p227f6.C10135k.f40262E3
            r6[r10] = r5
            int r4 = p227f6.C10135k.f40252C3
            r6[r13] = r4
            int r2 = p227f6.C10135k.f40322Q3
            r1 = 2
            r6[r1] = r2
            int r10 = p227f6.C10135k.f40342U3
            r13 = 3
            r6[r13] = r10
            int r13 = p227f6.C10135k.f40362Y3
            r16 = 4
            r6[r16] = r13
            r16 = r11
            r11 = 2
            r1 = r12
            r11 = r2
            r2 = r21
            r17 = r15
            r15 = r4
            r4 = r22
            r18 = r15
            r15 = r5
            r5 = r9
            androidx.appcompat.widget.a1 r1 = com.google.android.material.internal.C7709g.m42963l(r1, r2, r3, r4, r5, r6)
            int r2 = p227f6.C10135k.f40357X3
            r3 = 1
            boolean r2 = r1.mo2042a(r2, r3)
            r0.f33938v = r2
            int r2 = p227f6.C10135k.f40462p3
            java.lang.CharSequence r2 = r1.mo2057p(r2)
            r0.setHint(r2)
            int r2 = p227f6.C10135k.f40352W3
            boolean r2 = r1.mo2042a(r2, r3)
            r0.f33947z0 = r2
            v6.k$b r2 = p375v6.C12829k.m60633e(r12, r7, r8, r9)
            v6.k r2 = r2.mo37798m()
            r0.f33882A = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = p227f6.C10128d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f33884B = r2
            int r2 = p227f6.C10135k.f40480s3
            r3 = 0
            int r2 = r1.mo2046e(r2, r3)
            r0.f33888D = r2
            int r2 = p227f6.C10135k.f40511y3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = p227f6.C10128d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo2047f(r2, r3)
            r0.f33890F = r2
            int r3 = p227f6.C10135k.f40516z3
            android.content.res.Resources r4 = r12.getResources()
            int r5 = p227f6.C10128d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo2047f(r3, r4)
            r0.f33891G = r3
            r0.f33889E = r2
            int r2 = p227f6.C10135k.f40501w3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo2045d(r2, r3)
            int r4 = p227f6.C10135k.f40496v3
            float r4 = r1.mo2045d(r4, r3)
            int r5 = p227f6.C10135k.f40486t3
            float r5 = r1.mo2045d(r5, r3)
            int r6 = p227f6.C10135k.f40491u3
            float r3 = r1.mo2045d(r6, r3)
            v6.k r6 = r0.f33882A
            v6.k$b r6 = r6.mo37790v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0143
            r6.mo37810z(r2)
        L_0x0143:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x014a
            r6.mo37796D(r4)
        L_0x014a:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0151
            r6.mo37806v(r5)
        L_0x0151:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0158
            r6.mo37802r(r3)
        L_0x0158:
            v6.k r2 = r6.mo37798m()
            r0.f33882A = r2
            int r2 = p227f6.C10135k.f40468q3
            android.content.res.ColorStateList r2 = p346s6.C12456c.m59421b(r12, r1, r2)
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5 = -1
            if (r2 == 0) goto L_0x01af
            int r6 = r2.getDefaultColor()
            r0.f33935t0 = r6
            r0.f33893I = r6
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0192
            r6 = 1
            int[] r7 = new int[r6]
            r8 = 0
            r7[r8] = r4
            int r7 = r2.getColorForState(r7, r5)
            r0.f33937u0 = r7
            int[] r7 = new int[r6]
            r7[r8] = r3
            int r2 = r2.getColorForState(r7, r5)
            r0.f33939v0 = r2
            goto L_0x01b8
        L_0x0192:
            r6 = 1
            r8 = 0
            int r2 = p227f6.C10127c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p055h.C4411a.m29345a(r12, r2)
            int[] r7 = new int[r6]
            r7[r8] = r4
            int r7 = r2.getColorForState(r7, r5)
            r0.f33937u0 = r7
            int[] r7 = new int[r6]
            r7[r8] = r3
            int r2 = r2.getColorForState(r7, r5)
            r0.f33939v0 = r2
            goto L_0x01b8
        L_0x01af:
            r8 = 0
            r0.f33893I = r8
            r0.f33935t0 = r8
            r0.f33937u0 = r8
            r0.f33939v0 = r8
        L_0x01b8:
            int r2 = p227f6.C10135k.f40456o3
            boolean r6 = r1.mo2060s(r2)
            if (r6 == 0) goto L_0x01c8
            android.content.res.ColorStateList r2 = r1.mo2044c(r2)
            r0.f33928p0 = r2
            r0.f33927o0 = r2
        L_0x01c8:
            int r2 = p227f6.C10135k.f40506x3
            android.content.res.ColorStateList r6 = p346s6.C12456c.m59421b(r12, r1, r2)
            if (r6 == 0) goto L_0x0200
            boolean r7 = r6.isStateful()
            if (r7 == 0) goto L_0x0200
            int r2 = r6.getDefaultColor()
            r0.f33929q0 = r2
            r2 = 1
            int[] r7 = new int[r2]
            r8 = 0
            r7[r8] = r4
            int r4 = r6.getColorForState(r7, r5)
            r0.f33941w0 = r4
            int[] r4 = new int[r2]
            r4[r8] = r3
            int r3 = r6.getColorForState(r4, r5)
            r0.f33931r0 = r3
            int[] r3 = new int[r2]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r8] = r2
            int r2 = r6.getColorForState(r3, r5)
            r0.f33933s0 = r2
            goto L_0x021f
        L_0x0200:
            r8 = 0
            int r2 = r1.mo2043b(r2, r8)
            r0.f33933s0 = r2
            int r2 = p227f6.C10127c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.C0681a.m3148d(r12, r2)
            r0.f33929q0 = r2
            int r2 = p227f6.C10127c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.C0681a.m3148d(r12, r2)
            r0.f33941w0 = r2
            int r2 = p227f6.C10127c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.C0681a.m3148d(r12, r2)
            r0.f33931r0 = r2
        L_0x021f:
            int r2 = r1.mo2055n(r13, r5)
            if (r2 == r5) goto L_0x022e
            r2 = 0
            int r3 = r1.mo2055n(r13, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            int r3 = r1.mo2055n(r11, r2)
            int r4 = p227f6.C10135k.f40302M3
            boolean r4 = r1.mo2042a(r4, r2)
            android.content.Context r6 = r19.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = p227f6.C10132h.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r14, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f33925m0 = r6
            r14.addView(r6)
            r2 = 8
            r6.setVisibility(r2)
            int r8 = p227f6.C10135k.f40307N3
            boolean r9 = r1.mo2060s(r8)
            if (r9 == 0) goto L_0x0262
            android.graphics.drawable.Drawable r8 = r1.mo2048g(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x0262:
            int r8 = p227f6.C10135k.f40312O3
            boolean r9 = r1.mo2060s(r8)
            if (r9 == 0) goto L_0x0271
            android.content.res.ColorStateList r8 = p346s6.C12456c.m59421b(r12, r1, r8)
            r0.setErrorIconTintList(r8)
        L_0x0271:
            int r8 = p227f6.C10135k.f40317P3
            boolean r9 = r1.mo2060s(r8)
            r11 = 0
            if (r9 == 0) goto L_0x0285
            int r8 = r1.mo2052k(r8, r5)
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.C7710h.m42966c(r8, r11)
            r0.setErrorIconTintMode(r8)
        L_0x0285:
            android.content.res.Resources r8 = r19.getResources()
            int r9 = p227f6.C10133i.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r9)
            r6.setContentDescription(r8)
            r8 = 2
            androidx.core.view.C0835a0.m3761x0(r6, r8)
            r8 = 0
            r6.setClickable(r8)
            r6.setPressable(r8)
            r6.setFocusable(r8)
            int r6 = r1.mo2055n(r10, r8)
            int r9 = p227f6.C10135k.f40337T3
            boolean r9 = r1.mo2042a(r9, r8)
            int r10 = p227f6.C10135k.f40332S3
            java.lang.CharSequence r10 = r1.mo2057p(r10)
            int r13 = p227f6.C10135k.f40242A3
            boolean r13 = r1.mo2042a(r13, r8)
            int r11 = p227f6.C10135k.f40247B3
            int r11 = r1.mo2052k(r11, r5)
            r0.setCounterMaxLength(r11)
            int r11 = r1.mo2055n(r15, r8)
            r0.f33932s = r11
            r11 = r18
            int r11 = r1.mo2055n(r11, r8)
            r0.f33930r = r11
            android.content.Context r11 = r19.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            int r15 = p227f6.C10132h.design_text_input_start_icon
            android.view.View r11 = r11.inflate(r15, r14, r8)
            com.google.android.material.internal.CheckableImageButton r11 = (com.google.android.material.internal.CheckableImageButton) r11
            r0.f33898N = r11
            r14.addView(r11)
            r11.setVisibility(r2)
            r8 = 0
            r0.setStartIconOnClickListener(r8)
            r0.setStartIconOnLongClickListener(r8)
            int r8 = p227f6.C10135k.f40415h4
            boolean r11 = r1.mo2060s(r8)
            if (r11 == 0) goto L_0x0314
            android.graphics.drawable.Drawable r8 = r1.mo2048g(r8)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r8)
            int r8 = p227f6.C10135k.f40409g4
            boolean r11 = r1.mo2060s(r8)
            if (r11 == 0) goto L_0x030a
            java.lang.CharSequence r8 = r1.mo2057p(r8)
            r0.setStartIconContentDescription((java.lang.CharSequence) r8)
        L_0x030a:
            int r8 = p227f6.C10135k.f40403f4
            r11 = 1
            boolean r8 = r1.mo2042a(r8, r11)
            r0.setStartIconCheckable(r8)
        L_0x0314:
            int r8 = p227f6.C10135k.f40421i4
            boolean r11 = r1.mo2060s(r8)
            if (r11 == 0) goto L_0x0323
            android.content.res.ColorStateList r8 = p346s6.C12456c.m59421b(r12, r1, r8)
            r0.setStartIconTintList(r8)
        L_0x0323:
            int r8 = p227f6.C10135k.f40427j4
            boolean r11 = r1.mo2060s(r8)
            if (r11 == 0) goto L_0x0337
            int r8 = r1.mo2052k(r8, r5)
            r11 = 0
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.C7710h.m42966c(r8, r11)
            r0.setStartIconTintMode(r8)
        L_0x0337:
            r0.setHelperTextEnabled(r9)
            r0.setHelperText(r10)
            r0.setHelperTextTextAppearance(r6)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f33932s
            r0.setCounterTextAppearance(r3)
            int r3 = r0.f33930r
            r0.setCounterOverflowTextAppearance(r3)
            int r3 = p227f6.C10135k.f40327R3
            boolean r4 = r1.mo2060s(r3)
            if (r4 == 0) goto L_0x035f
            android.content.res.ColorStateList r3 = r1.mo2044c(r3)
            r0.setErrorTextColor(r3)
        L_0x035f:
            int r3 = p227f6.C10135k.f40347V3
            boolean r4 = r1.mo2060s(r3)
            if (r4 == 0) goto L_0x036e
            android.content.res.ColorStateList r3 = r1.mo2044c(r3)
            r0.setHelperTextColor(r3)
        L_0x036e:
            int r3 = p227f6.C10135k.f40367Z3
            boolean r4 = r1.mo2060s(r3)
            if (r4 == 0) goto L_0x037d
            android.content.res.ColorStateList r3 = r1.mo2044c(r3)
            r0.setHintTextColor(r3)
        L_0x037d:
            int r3 = p227f6.C10135k.f40267F3
            boolean r4 = r1.mo2060s(r3)
            if (r4 == 0) goto L_0x038c
            android.content.res.ColorStateList r3 = r1.mo2044c(r3)
            r0.setCounterTextColor(r3)
        L_0x038c:
            int r3 = p227f6.C10135k.f40257D3
            boolean r4 = r1.mo2060s(r3)
            if (r4 == 0) goto L_0x039b
            android.content.res.ColorStateList r3 = r1.mo2044c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x039b:
            r0.setCounterEnabled(r13)
            int r3 = p227f6.C10135k.f40474r3
            r4 = 0
            int r3 = r1.mo2052k(r3, r4)
            r0.setBoxBackgroundMode(r3)
            android.content.Context r3 = r19.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r6 = r17
            android.view.View r3 = r3.inflate(r7, r6, r4)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f33913e0 = r3
            r6.addView(r3)
            r3.setVisibility(r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r3 = r16
            r3.append(r5, r2)
            com.google.android.material.textfield.g r2 = new com.google.android.material.textfield.g
            r2.<init>(r0)
            r3.append(r4, r2)
            com.google.android.material.textfield.h r2 = new com.google.android.material.textfield.h
            r2.<init>(r0)
            r4 = 1
            r3.append(r4, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r4 = 2
            r3.append(r4, r2)
            com.google.android.material.textfield.d r2 = new com.google.android.material.textfield.d
            r2.<init>(r0)
            r4 = 3
            r3.append(r4, r2)
            int r2 = p227f6.C10135k.f40287J3
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x0426
            r3 = 0
            int r2 = r1.mo2052k(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = p227f6.C10135k.f40282I3
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x040c
            android.graphics.drawable.Drawable r2 = r1.mo2048g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x040c:
            int r2 = p227f6.C10135k.f40277H3
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x041b
            java.lang.CharSequence r2 = r1.mo2057p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x041b:
            int r2 = p227f6.C10135k.f40272G3
            r3 = 1
            boolean r2 = r1.mo2042a(r2, r3)
            r0.setEndIconCheckable(r2)
            goto L_0x046b
        L_0x0426:
            int r2 = p227f6.C10135k.f40385c4
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x046b
            r3 = 0
            boolean r2 = r1.mo2042a(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = p227f6.C10135k.f40379b4
            android.graphics.drawable.Drawable r2 = r1.mo2048g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p227f6.C10135k.f40373a4
            java.lang.CharSequence r2 = r1.mo2057p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p227f6.C10135k.f40391d4
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x0457
            android.content.res.ColorStateList r2 = p346s6.C12456c.m59421b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x0457:
            int r2 = p227f6.C10135k.f40397e4
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x046b
            int r2 = r1.mo2052k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C7710h.m42966c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x046b:
            int r2 = p227f6.C10135k.f40385c4
            boolean r2 = r1.mo2060s(r2)
            if (r2 != 0) goto L_0x0496
            int r2 = p227f6.C10135k.f40292K3
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x0482
            android.content.res.ColorStateList r2 = p346s6.C12456c.m59421b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x0482:
            int r2 = p227f6.C10135k.f40297L3
            boolean r3 = r1.mo2060s(r2)
            if (r3 == 0) goto L_0x0496
            int r2 = r1.mo2052k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C7710h.m42966c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x0496:
            r1.mo2061w()
            r1 = 2
            androidx.core.view.C0835a0.m3761x0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f33913e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f33913e0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f33925m0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f33912e.mo25951v());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f33898N.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f33898N.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m43013k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f33913e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f33913e0.setImageDrawable(drawable);
    }
}
