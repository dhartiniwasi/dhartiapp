package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0275a;
import androidx.appcompat.view.C0335a;
import androidx.appcompat.widget.C0519m0;
import p048g.C4288a;

/* renamed from: androidx.appcompat.widget.t0 */
/* compiled from: ScrollingTabContainerView */
public class C0554t0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: r */
    private static final Interpolator f1809r = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1810a;

    /* renamed from: b */
    private C0557c f1811b;

    /* renamed from: c */
    C0519m0 f1812c;

    /* renamed from: d */
    private Spinner f1813d;

    /* renamed from: e */
    private boolean f1814e;

    /* renamed from: f */
    int f1815f;

    /* renamed from: g */
    int f1816g;

    /* renamed from: h */
    private int f1817h;

    /* renamed from: i */
    private int f1818i;

    /* renamed from: androidx.appcompat.widget.t0$a */
    /* compiled from: ScrollingTabContainerView */
    class C0555a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1819a;

        C0555a(View view) {
            this.f1819a = view;
        }

        public void run() {
            C0554t0.this.smoothScrollTo(this.f1819a.getLeft() - ((C0554t0.this.getWidth() - this.f1819a.getWidth()) / 2), 0);
            C0554t0.this.f1810a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0556b extends BaseAdapter {
        C0556b() {
        }

        public int getCount() {
            return C0554t0.this.f1812c.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0558d) C0554t0.this.f1812c.getChildAt(i)).mo2610b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0554t0.this.mo2593c((C0275a.C0278c) getItem(i), true);
            }
            ((C0558d) view).mo2609a((C0275a.C0278c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0557c implements View.OnClickListener {
        C0557c() {
        }

        public void onClick(View view) {
            ((C0558d) view).mo2610b().mo867e();
            int childCount = C0554t0.this.f1812c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0554t0.this.f1812c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0558d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1823a;

        /* renamed from: b */
        private C0275a.C0278c f1824b;

        /* renamed from: c */
        private TextView f1825c;

        /* renamed from: d */
        private ImageView f1826d;

        /* renamed from: e */
        private View f1827e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0558d(android.content.Context r6, androidx.appcompat.app.C0275a.C0278c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0554t0.this = r5
                int r5 = p048g.C4288a.f23764d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1823a = r1
                r4.f1824b = r7
                androidx.appcompat.widget.a1 r5 = androidx.appcompat.widget.C0452a1.m2210v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo2060s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo2048g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo2061w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2611c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0554t0.C0558d.<init>(androidx.appcompat.widget.t0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        /* renamed from: a */
        public void mo2609a(C0275a.C0278c cVar) {
            this.f1824b = cVar;
            mo2611c();
        }

        /* renamed from: b */
        public C0275a.C0278c mo2610b() {
            return this.f1824b;
        }

        /* renamed from: c */
        public void mo2611c() {
            C0275a.C0278c cVar = this.f1824b;
            View b = cVar.mo864b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1827e = b;
                TextView textView = this.f1825c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1826d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1826d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1827e;
            if (view != null) {
                removeView(view);
                this.f1827e = null;
            }
            Drawable c = cVar.mo865c();
            CharSequence d = cVar.mo866d();
            if (c != null) {
                if (this.f1826d == null) {
                    C0549r rVar = new C0549r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f1826d = rVar;
                }
                this.f1826d.setImageDrawable(c);
                this.f1826d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1826d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1826d.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1825c == null) {
                    C0478d0 d0Var = new C0478d0(getContext(), (AttributeSet) null, C4288a.f23765e);
                    d0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    d0Var.setLayoutParams(layoutParams2);
                    addView(d0Var);
                    this.f1825c = d0Var;
                }
                this.f1825c.setText(d);
                this.f1825c.setVisibility(0);
            } else {
                TextView textView2 = this.f1825c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1825c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1826d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo863a());
            }
            if (!z) {
                charSequence = cVar.mo863a();
            }
            C0479d1.m2358a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0554t0.this.f1815f > 0 && getMeasuredWidth() > (i3 = C0554t0.this.f1815f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m2675b() {
        C0437a0 a0Var = new C0437a0(getContext(), (AttributeSet) null, C4288a.f23768h);
        a0Var.setLayoutParams(new C0519m0.C0520a(-2, -1));
        a0Var.setOnItemSelectedListener(this);
        return a0Var;
    }

    /* renamed from: d */
    private boolean m2676d() {
        Spinner spinner = this.f1813d;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m2677e() {
        if (!m2676d()) {
            if (this.f1813d == null) {
                this.f1813d = m2675b();
            }
            removeView(this.f1812c);
            addView(this.f1813d, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1813d.getAdapter() == null) {
                this.f1813d.setAdapter(new C0556b());
            }
            Runnable runnable = this.f1810a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1810a = null;
            }
            this.f1813d.setSelection(this.f1818i);
        }
    }

    /* renamed from: f */
    private boolean m2678f() {
        if (!m2676d()) {
            return false;
        }
        removeView(this.f1813d);
        addView(this.f1812c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1813d.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2592a(int i) {
        View childAt = this.f1812c.getChildAt(i);
        Runnable runnable = this.f1810a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0555a aVar = new C0555a(childAt);
        this.f1810a = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0558d mo2593c(C0275a.C0278c cVar, boolean z) {
        C0558d dVar = new C0558d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1817h));
        } else {
            dVar.setFocusable(true);
            if (this.f1811b == null) {
                this.f1811b = new C0557c();
            }
            dVar.setOnClickListener(this.f1811b);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1810a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0335a b = C0335a.m1618b(getContext());
        setContentHeight(b.mo1106f());
        this.f1816g = b.mo1105e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1810a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0558d) view).mo2610b().mo867e();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1812c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1815f = -1;
        } else {
            if (childCount > 2) {
                this.f1815f = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1815f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1815f = Math.min(this.f1815f, this.f1816g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1817h, 1073741824);
        if (z2 || !this.f1814e) {
            z = false;
        }
        if (z) {
            this.f1812c.measure(0, makeMeasureSpec);
            if (this.f1812c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2677e();
            } else {
                m2678f();
            }
        } else {
            m2678f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1818i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1814e = z;
    }

    public void setContentHeight(int i) {
        this.f1817h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1818i = i;
        int childCount = this.f1812c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1812c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2592a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1813d;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
