package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0835a0;
import androidx.core.view.C0909g0;
import androidx.core.view.C0915h0;
import androidx.recyclerview.widget.RecyclerView;
import p048g.C4288a;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0435a extends ViewGroup {

    /* renamed from: a */
    protected final C0436a f1459a;

    /* renamed from: b */
    protected final Context f1460b;

    /* renamed from: c */
    protected ActionMenuView f1461c;

    /* renamed from: d */
    protected C0458c f1462d;

    /* renamed from: e */
    protected int f1463e;

    /* renamed from: f */
    protected C0909g0 f1464f;

    /* renamed from: g */
    private boolean f1465g;

    /* renamed from: h */
    private boolean f1466h;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0436a implements C0915h0 {

        /* renamed from: a */
        private boolean f1467a = false;

        /* renamed from: b */
        int f1468b;

        protected C0436a() {
        }

        /* renamed from: a */
        public void mo1971a(View view) {
            this.f1467a = true;
        }

        /* renamed from: b */
        public void mo992b(View view) {
            if (!this.f1467a) {
                C0435a aVar = C0435a.this;
                aVar.f1464f = null;
                C0435a.super.setVisibility(this.f1468b);
            }
        }

        /* renamed from: c */
        public void mo993c(View view) {
            C0435a.super.setVisibility(0);
            this.f1467a = false;
        }

        /* renamed from: d */
        public C0436a mo1972d(C0909g0 g0Var, int i) {
            C0435a.this.f1464f = g0Var;
            this.f1468b = i;
            return this;
        }
    }

    C0435a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m2155d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1968c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1969e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0909g0 mo1621f(int i, long j) {
        C0909g0 g0Var = this.f1464f;
        if (g0Var != null) {
            g0Var.mo3386c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0909g0 b = C0835a0.m3720d(this).mo3385b(1.0f);
            b.mo3388f(j);
            b.mo3390h(this.f1459a.mo1972d(b, i));
            return b;
        }
        C0909g0 b2 = C0835a0.m3720d(this).mo3385b(0.0f);
        b2.mo3388f(j);
        b2.mo3390h(this.f1459a.mo1972d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.f1464f != null) {
            return this.f1459a.f1468b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1463e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C4297j.f24045a, C4288a.f23763c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C4297j.f24090j, 0));
        obtainStyledAttributes.recycle();
        C0458c cVar = this.f1462d;
        if (cVar != null) {
            cVar.mo2075F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1466h = false;
        }
        if (!this.f1466h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1466h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1466h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1465g = false;
        }
        if (!this.f1465g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1465g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1465g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1463e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0909g0 g0Var = this.f1464f;
            if (g0Var != null) {
                g0Var.mo3386c();
            }
            super.setVisibility(i);
        }
    }

    C0435a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1459a = new C0436a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C4288a.f23761a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1460b = context;
        } else {
            this.f1460b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
