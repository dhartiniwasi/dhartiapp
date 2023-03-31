package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.C0835a0;
import p175z.C6178c;

/* renamed from: com.onesignal.o */
/* compiled from: DraggableRelativeLayout */
class C8517o extends RelativeLayout {

    /* renamed from: e */
    private static final int f35775e = C8313b3.m46320b(28);

    /* renamed from: f */
    private static final int f35776f = C8313b3.m46320b(64);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8519b f35777a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6178c f35778b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f35779c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8520c f35780d;

    /* renamed from: com.onesignal.o$a */
    /* compiled from: DraggableRelativeLayout */
    class C8518a extends C6178c.C6181c {

        /* renamed from: a */
        private int f35781a;

        C8518a() {
        }

        /* renamed from: a */
        public int mo21089a(View view, int i, int i2) {
            return C8517o.this.f35780d.f35786d;
        }

        /* renamed from: b */
        public int mo21090b(View view, int i, int i2) {
            if (C8517o.this.f35780d.f35790h) {
                return C8517o.this.f35780d.f35784b;
            }
            this.f35781a = i;
            if (C8517o.this.f35780d.f35789g == 1) {
                if (i >= C8517o.this.f35780d.f35785c && C8517o.this.f35777a != null) {
                    C8517o.this.f35777a.mo28002a();
                }
                if (i < C8517o.this.f35780d.f35784b) {
                    return C8517o.this.f35780d.f35784b;
                }
            } else {
                if (i <= C8517o.this.f35780d.f35785c && C8517o.this.f35777a != null) {
                    C8517o.this.f35777a.mo28002a();
                }
                if (i > C8517o.this.f35780d.f35784b) {
                    return C8517o.this.f35780d.f35784b;
                }
            }
            return i;
        }

        /* renamed from: l */
        public void mo21100l(View view, float f, float f2) {
            int i = C8517o.this.f35780d.f35784b;
            if (!C8517o.this.f35779c) {
                if (C8517o.this.f35780d.f35789g == 1) {
                    if (this.f35781a > C8517o.this.f35780d.f35793k || f2 > ((float) C8517o.this.f35780d.f35791i)) {
                        i = C8517o.this.f35780d.f35792j;
                        boolean unused = C8517o.this.f35779c = true;
                        if (C8517o.this.f35777a != null) {
                            C8517o.this.f35777a.onDismiss();
                        }
                    }
                } else if (this.f35781a < C8517o.this.f35780d.f35793k || f2 < ((float) C8517o.this.f35780d.f35791i)) {
                    i = C8517o.this.f35780d.f35792j;
                    boolean unused2 = C8517o.this.f35779c = true;
                    if (C8517o.this.f35777a != null) {
                        C8517o.this.f35777a.onDismiss();
                    }
                }
            }
            if (C8517o.this.f35778b.mo21074F(C8517o.this.f35780d.f35786d, i)) {
                C0835a0.m3723e0(C8517o.this);
            }
        }

        /* renamed from: m */
        public boolean mo21101m(View view, int i) {
            return true;
        }
    }

    /* renamed from: com.onesignal.o$b */
    /* compiled from: DraggableRelativeLayout */
    interface C8519b {
        /* renamed from: a */
        void mo28002a();

        /* renamed from: b */
        void mo28003b();

        void onDismiss();
    }

    /* renamed from: com.onesignal.o$c */
    /* compiled from: DraggableRelativeLayout */
    static class C8520c {

        /* renamed from: a */
        int f35783a;

        /* renamed from: b */
        int f35784b;

        /* renamed from: c */
        int f35785c;

        /* renamed from: d */
        int f35786d;

        /* renamed from: e */
        int f35787e;

        /* renamed from: f */
        int f35788f;

        /* renamed from: g */
        int f35789g;

        /* renamed from: h */
        boolean f35790h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f35791i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f35792j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f35793k;

        C8520c() {
        }
    }

    public C8517o(Context context) {
        super(context);
        setClipChildren(false);
        m47183f();
    }

    /* renamed from: f */
    private void m47183f() {
        this.f35778b = C6178c.m35942l(this, 1.0f, new C8518a());
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f35778b.mo21080k(true)) {
            C0835a0.m3723e0(this);
        }
    }

    /* renamed from: g */
    public void mo27998g() {
        this.f35779c = true;
        this.f35778b.mo21076H(this, getLeft(), this.f35780d.f35792j);
        C0835a0.m3723e0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27999h(C8519b bVar) {
        this.f35777a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo28000i(C8520c cVar) {
        this.f35780d = cVar;
        int unused = cVar.f35792j = cVar.f35788f + cVar.f35783a + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.f35788f) - cVar.f35783a) + f35776f;
        int unused2 = cVar.f35791i = C8313b3.m46320b(3000);
        if (cVar.f35789g == 0) {
            int unused3 = cVar.f35792j = (-cVar.f35788f) - f35775e;
            int unused4 = cVar.f35791i = -cVar.f35791i;
            int unused5 = cVar.f35793k = cVar.f35792j / 3;
            return;
        }
        int unused6 = cVar.f35793k = (cVar.f35788f / 3) + (cVar.f35784b * 2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C8519b bVar;
        if (this.f35779c) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.f35777a) != null) {
            bVar.mo28003b();
        }
        this.f35778b.mo21086z(motionEvent);
        return false;
    }
}
