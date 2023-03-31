package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import androidx.recyclerview.widget.RecyclerView;
import p151v.C5753a;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: HeaderBehavior */
abstract class C7580a<V extends View> extends C7583c<V> {

    /* renamed from: d */
    private Runnable f33268d;

    /* renamed from: e */
    OverScroller f33269e;

    /* renamed from: f */
    private boolean f33270f;

    /* renamed from: g */
    private int f33271g = -1;

    /* renamed from: h */
    private int f33272h;

    /* renamed from: i */
    private int f33273i = -1;

    /* renamed from: j */
    private VelocityTracker f33274j;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* compiled from: HeaderBehavior */
    private class C7581a implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f33275a;

        /* renamed from: b */
        private final V f33276b;

        C7581a(CoordinatorLayout coordinatorLayout, V v) {
            this.f33275a = coordinatorLayout;
            this.f33276b = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f33276b != null && (overScroller = C7580a.this.f33269e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C7580a aVar = C7580a.this;
                    aVar.mo24866P(this.f33275a, this.f33276b, aVar.f33269e.getCurrY());
                    C0835a0.m3725f0(this.f33276b, this);
                    return;
                }
                C7580a.this.mo24829N(this.f33275a, this.f33276b);
            }
        }
    }

    public C7580a() {
    }

    /* renamed from: I */
    private void m42140I() {
        if (this.f33274j == null) {
            this.f33274j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2781D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f33273i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f33273i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f33271g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f33272h
            int r2 = r2 - r0
            boolean r3 = r11.f33270f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f33273i
            if (r3 <= r4) goto L_0x0049
            r11.f33270f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f33270f
            if (r2 == 0) goto L_0x00ae
            r11.f33272h = r0
            int r7 = r11.mo24826K(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo24865O(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f33274j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f33274j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f33274j
            int r4 = r11.f33271g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo24827L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo24864J(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f33270f = r2
            r11.f33271g = r3
            android.view.VelocityTracker r12 = r11.f33274j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f33274j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo2775v(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo24825H(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f33272h = r3
            int r12 = r14.getPointerId(r2)
            r11.f33271g = r12
            r11.m42140I()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f33274j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C7580a.mo2781D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo24825H(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo24864J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f33268d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f33268d = null;
        }
        if (this.f33269e == null) {
            this.f33269e = new OverScroller(v.getContext());
        }
        this.f33269e.fling(0, mo24851E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f33269e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C7581a aVar = new C7581a(coordinatorLayout, v);
            this.f33268d = aVar;
            C0835a0.m3725f0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo24829N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo24826K(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo24827L(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo24828M() {
        return mo24851E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo24829N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo24865O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo24830Q(coordinatorLayout, v, mo24828M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo24866P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo24830Q(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo24830Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int E = mo24851E();
        if (i2 == 0 || E < i2 || E > i3 || E == (b = C5753a.m34335b(i, i2, i3))) {
            return 0;
        }
        mo24852G(b);
        return E - b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2792k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f33273i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f33273i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f33270f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f33271g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f33272h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f33273i
            if (r6 <= r0) goto L_0x0083
            r4.f33270f = r2
            r4.f33272h = r5
            goto L_0x0083
        L_0x0051:
            r4.f33270f = r3
            r4.f33271g = r5
            android.view.VelocityTracker r5 = r4.f33274j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f33274j = r5
            goto L_0x0083
        L_0x0060:
            r4.f33270f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo24825H(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo2775v(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f33272h = r1
            int r5 = r7.getPointerId(r3)
            r4.f33271g = r5
            r4.m42140I()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f33274j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f33270f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C7580a.mo2792k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public C7580a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
