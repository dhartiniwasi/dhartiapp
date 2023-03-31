package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0388p;

/* renamed from: androidx.appcompat.widget.l0 */
/* compiled from: ForwardingListener */
public abstract class C0515l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1695a;

    /* renamed from: b */
    private final int f1696b;

    /* renamed from: c */
    private final int f1697c;

    /* renamed from: d */
    final View f1698d;

    /* renamed from: e */
    private Runnable f1699e;

    /* renamed from: f */
    private Runnable f1700f;

    /* renamed from: g */
    private boolean f1701g;

    /* renamed from: h */
    private int f1702h;

    /* renamed from: i */
    private final int[] f1703i = new int[2];

    /* renamed from: androidx.appcompat.widget.l0$a */
    /* compiled from: ForwardingListener */
    private class C0516a implements Runnable {
        C0516a() {
        }

        public void run() {
            ViewParent parent = C0515l0.this.f1698d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    /* compiled from: ForwardingListener */
    private class C0517b implements Runnable {
        C0517b() {
        }

        public void run() {
            C0515l0.this.mo2429e();
        }
    }

    public C0515l0(View view) {
        this.f1698d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1695a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1696b = tapTimeout;
        this.f1697c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m2524a() {
        Runnable runnable = this.f1700f;
        if (runnable != null) {
            this.f1698d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1699e;
        if (runnable2 != null) {
            this.f1698d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m2525f(MotionEvent motionEvent) {
        C0503j0 j0Var;
        View view = this.f1698d;
        C0388p b = mo1194b();
        if (b == null || !b.mo1292b() || (j0Var = (C0503j0) b.mo1295i()) == null || !j0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2528i(view, obtainNoHistory);
        m2529j(j0Var, obtainNoHistory);
        boolean e = j0Var.mo2380e(obtainNoHistory, this.f1702h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2526g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1698d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1702h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1695a
            boolean r6 = m2527h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2524a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2524a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1702h = r6
            java.lang.Runnable r6 = r5.f1699e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.l0$a r6 = new androidx.appcompat.widget.l0$a
            r6.<init>()
            r5.f1699e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1699e
            int r1 = r5.f1696b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1700f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.l0$b r6 = new androidx.appcompat.widget.l0$b
            r6.<init>()
            r5.f1700f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1700f
            int r1 = r5.f1697c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0515l0.m2526g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m2527h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m2528i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1703i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m2529j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1703i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0388p mo1194b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo1195c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo2085d() {
        C0388p b = mo1194b();
        if (b == null || !b.mo1292b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2429e() {
        m2524a();
        View view = this.f1698d;
        if (view.isEnabled() && !view.isLongClickable() && mo1195c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1701g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1701g;
        if (z2) {
            z = m2525f(motionEvent) || !mo2085d();
        } else {
            z = m2526g(motionEvent) && mo1195c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1698d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1701g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1701g = false;
        this.f1702h = -1;
        Runnable runnable = this.f1699e;
        if (runnable != null) {
            this.f1698d.removeCallbacks(runnable);
        }
    }
}
