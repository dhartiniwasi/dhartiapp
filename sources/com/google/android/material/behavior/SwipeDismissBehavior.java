package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import p175z.C6178c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0603c<V> {

    /* renamed from: a */
    C6178c f33298a;

    /* renamed from: b */
    C7588b f33299b;

    /* renamed from: c */
    private boolean f33300c;

    /* renamed from: d */
    private float f33301d = 0.0f;

    /* renamed from: e */
    private boolean f33302e;

    /* renamed from: f */
    int f33303f = 2;

    /* renamed from: g */
    float f33304g = 0.5f;

    /* renamed from: h */
    float f33305h = 0.0f;

    /* renamed from: i */
    float f33306i = 0.5f;

    /* renamed from: j */
    private final C6178c.C6181c f33307j = new C7587a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C7587a extends C6178c.C6181c {

        /* renamed from: a */
        private int f33308a;

        /* renamed from: b */
        private int f33309b = -1;

        C7587a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m42191n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = androidx.core.view.C0835a0.m3682B(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f33303f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f33308a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f33304g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C7587a.m42191n(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo21089a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C0835a0.m3682B(view) == 1;
            int i5 = SwipeDismissBehavior.this.f33303f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f33308a - view.getWidth();
                    i4 = view.getWidth() + this.f33308a;
                } else if (z) {
                    i3 = this.f33308a;
                    width = view.getWidth();
                } else {
                    i3 = this.f33308a - view.getWidth();
                    i4 = this.f33308a;
                }
                return SwipeDismissBehavior.m42182G(i3, i, i4);
            } else if (z) {
                i3 = this.f33308a - view.getWidth();
                i4 = this.f33308a;
                return SwipeDismissBehavior.m42182G(i3, i, i4);
            } else {
                i3 = this.f33308a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m42182G(i3, i, i4);
        }

        /* renamed from: b */
        public int mo21090b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo21092d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo21097i(View view, int i) {
            this.f33309b = i;
            this.f33308a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo21098j(int i) {
            C7588b bVar = SwipeDismissBehavior.this.f33299b;
            if (bVar != null) {
                bVar.mo24888b(i);
            }
        }

        /* renamed from: k */
        public void mo21099k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f33308a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f33305h);
            float width2 = ((float) this.f33308a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f33306i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m42181F(0.0f, 1.0f - SwipeDismissBehavior.m42184I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo21100l(View view, float f, float f2) {
            boolean z;
            int i;
            C7588b bVar;
            this.f33309b = -1;
            int width = view.getWidth();
            if (m42191n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f33308a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f33308a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f33298a.mo21074F(i, view.getTop())) {
                C0835a0.m3725f0(view, new C7589c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f33299b) != null) {
                bVar.mo24887a(view);
            }
        }

        /* renamed from: m */
        public boolean mo21101m(View view, int i) {
            int i2 = this.f33309b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo24883E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C7588b {
        /* renamed from: a */
        void mo24887a(View view);

        /* renamed from: b */
        void mo24888b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class C7589c implements Runnable {

        /* renamed from: a */
        private final View f33311a;

        /* renamed from: b */
        private final boolean f33312b;

        C7589c(View view, boolean z) {
            this.f33311a = view;
            this.f33312b = z;
        }

        public void run() {
            C7588b bVar;
            C6178c cVar = SwipeDismissBehavior.this.f33298a;
            if (cVar != null && cVar.mo21080k(true)) {
                C0835a0.m3725f0(this.f33311a, this);
            } else if (this.f33312b && (bVar = SwipeDismissBehavior.this.f33299b) != null) {
                bVar.mo24887a(this.f33311a);
            }
        }
    }

    /* renamed from: F */
    static float m42181F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m42182G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m42183H(ViewGroup viewGroup) {
        C6178c cVar;
        if (this.f33298a == null) {
            if (this.f33302e) {
                cVar = C6178c.m35942l(viewGroup, this.f33301d, this.f33307j);
            } else {
                cVar = C6178c.m35943m(viewGroup, this.f33307j);
            }
            this.f33298a = cVar;
        }
    }

    /* renamed from: I */
    static float m42184I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: D */
    public boolean mo2781D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C6178c cVar = this.f33298a;
        if (cVar == null) {
            return false;
        }
        cVar.mo21086z(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo24883E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo24884J(float f) {
        this.f33306i = m42181F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo24885K(float f) {
        this.f33305h = m42181F(0.0f, f, 1.0f);
    }

    /* renamed from: L */
    public void mo24886L(int i) {
        this.f33303f = i;
    }

    /* renamed from: k */
    public boolean mo2792k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f33300c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2775v(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f33300c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f33300c = false;
        }
        if (!z) {
            return false;
        }
        m42183H(coordinatorLayout);
        return this.f33298a.mo21075G(motionEvent);
    }
}
