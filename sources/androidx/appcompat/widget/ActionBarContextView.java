package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.view.menu.C0367g;
import androidx.core.view.C0835a0;
import androidx.core.view.C0909g0;
import androidx.recyclerview.widget.RecyclerView;
import p048g.C4288a;
import p048g.C4293f;
import p048g.C4294g;
import p048g.C4297j;

public class ActionBarContextView extends C0435a {

    /* renamed from: A */
    private boolean f1244A;

    /* renamed from: B */
    private int f1245B;

    /* renamed from: i */
    private CharSequence f1246i;

    /* renamed from: r */
    private CharSequence f1247r;

    /* renamed from: s */
    private View f1248s;

    /* renamed from: t */
    private View f1249t;

    /* renamed from: u */
    private View f1250u;

    /* renamed from: v */
    private LinearLayout f1251v;

    /* renamed from: w */
    private TextView f1252w;

    /* renamed from: x */
    private TextView f1253x;

    /* renamed from: y */
    private int f1254y;

    /* renamed from: z */
    private int f1255z;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0395a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0336b f1256a;

        C0395a(C0336b bVar) {
            this.f1256a = bVar;
        }

        public void onClick(View view) {
            this.f1256a.mo1087c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private void m1974i() {
        if (this.f1251v == null) {
            LayoutInflater.from(getContext()).inflate(C4294g.f23898a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1251v = linearLayout;
            this.f1252w = (TextView) linearLayout.findViewById(C4293f.f23876e);
            this.f1253x = (TextView) this.f1251v.findViewById(C4293f.f23875d);
            if (this.f1254y != 0) {
                this.f1252w.setTextAppearance(getContext(), this.f1254y);
            }
            if (this.f1255z != 0) {
                this.f1253x.setTextAppearance(getContext(), this.f1255z);
            }
        }
        this.f1252w.setText(this.f1246i);
        this.f1253x.setText(this.f1247r);
        boolean z = !TextUtils.isEmpty(this.f1246i);
        boolean z2 = !TextUtils.isEmpty(this.f1247r);
        int i = 0;
        this.f1253x.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1251v;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1251v.getParent() == null) {
            addView(this.f1251v);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0909g0 mo1621f(int i, long j) {
        return super.mo1621f(i, j);
    }

    /* renamed from: g */
    public void mo1622g() {
        if (this.f1248s == null) {
            mo1631k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1247r;
    }

    public CharSequence getTitle() {
        return this.f1246i;
    }

    /* renamed from: h */
    public void mo1629h(C0336b bVar) {
        View view = this.f1248s;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1245B, this, false);
            this.f1248s = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1248s);
        }
        View findViewById = this.f1248s.findViewById(C4293f.f23880i);
        this.f1249t = findViewById;
        findViewById.setOnClickListener(new C0395a(bVar));
        C0367g gVar = (C0367g) bVar.mo1089e();
        C0458c cVar = this.f1462d;
        if (cVar != null) {
            cVar.mo2081y();
        }
        C0458c cVar2 = new C0458c(getContext());
        this.f1462d = cVar2;
        cVar2.mo2079J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.mo1369c(this.f1462d, this.f1460b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1462d.mo1284o(this);
        this.f1461c = actionMenuView;
        C0835a0.m3749r0(actionMenuView, (Drawable) null);
        addView(this.f1461c, layoutParams);
    }

    /* renamed from: j */
    public boolean mo1630j() {
        return this.f1244A;
    }

    /* renamed from: k */
    public void mo1631k() {
        removeAllViews();
        this.f1250u = null;
        this.f1461c = null;
        this.f1462d = null;
        View view = this.f1249t;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: l */
    public boolean mo1632l() {
        C0458c cVar = this.f1462d;
        if (cVar != null) {
            return cVar.mo2080K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0458c cVar = this.f1462d;
        if (cVar != null) {
            cVar.mo2071B();
            this.f1462d.mo2072C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0508j1.m2496b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1248s;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1248s.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0435a.m2155d(paddingRight, i5, b);
            paddingRight = C0435a.m2155d(d + mo1969e(this.f1248s, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1251v;
        if (!(linearLayout == null || this.f1250u != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1969e(this.f1251v, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f1250u;
        if (view2 != null) {
            mo1969e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1461c;
        if (actionMenuView != null) {
            mo1969e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1463e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f1248s;
            if (view != null) {
                int c = mo1968c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1248s.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1461c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1968c(this.f1461c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1251v;
            if (linearLayout != null && this.f1250u == null) {
                if (this.f1244A) {
                    this.f1251v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1251v.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1251v.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1968c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1250u;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1250u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1463e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1463e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1250u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1250u = view;
        if (!(view == null || (linearLayout = this.f1251v) == null)) {
            removeView(linearLayout);
            this.f1251v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1247r = charSequence;
        m1974i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1246i = charSequence;
        m1974i();
        C0835a0.m3747q0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1244A) {
            requestLayout();
        }
        this.f1244A = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23770j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0452a1 v = C0452a1.m2210v(context, attributeSet, C4297j.f24165y, i, 0);
        C0835a0.m3749r0(this, v.mo2048g(C4297j.f24170z));
        this.f1254y = v.mo2055n(C4297j.f23950D, 0);
        this.f1255z = v.mo2055n(C4297j.f23945C, 0);
        this.f1463e = v.mo2054m(C4297j.f23940B, 0);
        this.f1245B = v.mo2055n(C4297j.f23935A, C4294g.f23901d);
        v.mo2061w();
    }
}
