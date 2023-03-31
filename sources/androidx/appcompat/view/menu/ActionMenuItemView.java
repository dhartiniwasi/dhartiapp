package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0478d0;
import androidx.appcompat.widget.C0479d1;
import androidx.appcompat.widget.C0515l0;
import p048g.C4297j;

public class ActionMenuItemView extends C0478d0 implements C0385n.C0386a, View.OnClickListener, ActionMenuView.C0401a {

    /* renamed from: g */
    C0371i f1000g;

    /* renamed from: h */
    private CharSequence f1001h;

    /* renamed from: i */
    private Drawable f1002i;

    /* renamed from: r */
    C0367g.C0369b f1003r;

    /* renamed from: s */
    private C0515l0 f1004s;

    /* renamed from: t */
    C0354b f1005t;

    /* renamed from: u */
    private boolean f1006u;

    /* renamed from: v */
    private boolean f1007v;

    /* renamed from: w */
    private int f1008w;

    /* renamed from: x */
    private int f1009x;

    /* renamed from: y */
    private int f1010y;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0353a extends C0515l0 {
        public C0353a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0388p mo1194b() {
            C0354b bVar = ActionMenuItemView.this.f1005t;
            if (bVar != null) {
                return bVar.mo1196a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo1195c() {
            C0388p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0367g.C0369b bVar = actionMenuItemView.f1003r;
            if (bVar == null || !bVar.mo1197a(actionMenuItemView.f1000g) || (b = mo1194b()) == null || !b.mo1292b()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0354b {
        /* renamed from: a */
        public abstract C0388p mo1196a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m1706g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m1707h() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1001h);
        if (this.f1002i != null && (!this.f1000g.mo1414B() || (!this.f1006u && !this.f1007v))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f1001h : null);
        CharSequence contentDescription = this.f1000g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f1000g.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1000g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f1000g.getTitle();
            }
            C0479d1.m2358a(this, charSequence2);
            return;
        }
        C0479d1.m2358a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo1174a() {
        return mo1178f();
    }

    /* renamed from: b */
    public boolean mo1175b() {
        return mo1178f() && this.f1000g.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo1176d() {
        return true;
    }

    /* renamed from: e */
    public void mo1177e(C0371i iVar, int i) {
        this.f1000g = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo1432i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1004s == null) {
            this.f1004s = new C0353a();
        }
    }

    /* renamed from: f */
    public boolean mo1178f() {
        return !TextUtils.isEmpty(getText());
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0371i getItemData() {
        return this.f1000g;
    }

    public void onClick(View view) {
        C0367g.C0369b bVar = this.f1003r;
        if (bVar != null) {
            bVar.mo1197a(this.f1000g);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1006u = m1706g();
        m1707h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean f = mo1178f();
        if (f && (i4 = this.f1009x) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1008w);
        } else {
            i3 = this.f1008w;
        }
        if (mode != 1073741824 && this.f1008w > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!f && this.f1002i != null) {
            super.setPadding((getMeasuredWidth() - this.f1002i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0515l0 l0Var;
        if (!this.f1000g.hasSubMenu() || (l0Var = this.f1004s) == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1007v != z) {
            this.f1007v = z;
            C0371i iVar = this.f1000g;
            if (iVar != null) {
                iVar.mo1415c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1002i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1010y;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m1707h();
    }

    public void setItemInvoker(C0367g.C0369b bVar) {
        this.f1003r = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1009x = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0354b bVar) {
        this.f1005t = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1001h = charSequence;
        m1707h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1006u = m1706g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24150v, i, 0);
        this.f1008w = obtainStyledAttributes.getDimensionPixelSize(C4297j.f24155w, 0);
        obtainStyledAttributes.recycle();
        this.f1010y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1009x = -1;
        setSaveEnabled(false);
    }
}
