package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p048g.C4297j;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1454a;

    /* renamed from: b */
    private int f1455b;

    /* renamed from: c */
    private WeakReference<View> f1456c;

    /* renamed from: d */
    private LayoutInflater f1457d;

    /* renamed from: e */
    private C0434a f1458e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0434a {
        /* renamed from: a */
        void mo1967a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1955a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1454a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1457d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1454a, viewGroup, false);
            int i = this.f1455b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1456c = new WeakReference<>(inflate);
            C0434a aVar = this.f1458e;
            if (aVar != null) {
                aVar.mo1967a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1455b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1457d;
    }

    public int getLayoutResource() {
        return this.f1454a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1455b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1457d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1454a = i;
    }

    public void setOnInflateListener(C0434a aVar) {
        this.f1458e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1456c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1955a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1454a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f23949C3, i, 0);
        this.f1455b = obtainStyledAttributes.getResourceId(C4297j.f23964F3, -1);
        this.f1454a = obtainStyledAttributes.getResourceId(C4297j.f23959E3, 0);
        setId(obtainStyledAttributes.getResourceId(C4297j.f23954D3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
