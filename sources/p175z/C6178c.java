package p175z;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0835a0;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: z.c */
/* compiled from: ViewDragHelper */
public class C6178c {

    /* renamed from: w */
    private static final Interpolator f29649w = new C6179a();

    /* renamed from: a */
    private int f29650a;

    /* renamed from: b */
    private int f29651b;

    /* renamed from: c */
    private int f29652c = -1;

    /* renamed from: d */
    private float[] f29653d;

    /* renamed from: e */
    private float[] f29654e;

    /* renamed from: f */
    private float[] f29655f;

    /* renamed from: g */
    private float[] f29656g;

    /* renamed from: h */
    private int[] f29657h;

    /* renamed from: i */
    private int[] f29658i;

    /* renamed from: j */
    private int[] f29659j;

    /* renamed from: k */
    private int f29660k;

    /* renamed from: l */
    private VelocityTracker f29661l;

    /* renamed from: m */
    private float f29662m;

    /* renamed from: n */
    private float f29663n;

    /* renamed from: o */
    private int f29664o;

    /* renamed from: p */
    private int f29665p;

    /* renamed from: q */
    private OverScroller f29666q;

    /* renamed from: r */
    private final C6181c f29667r;

    /* renamed from: s */
    private View f29668s;

    /* renamed from: t */
    private boolean f29669t;

    /* renamed from: u */
    private final ViewGroup f29670u;

    /* renamed from: v */
    private final Runnable f29671v = new C6180b();

    /* renamed from: z.c$a */
    /* compiled from: ViewDragHelper */
    static class C6179a implements Interpolator {
        C6179a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: z.c$b */
    /* compiled from: ViewDragHelper */
    class C6180b implements Runnable {
        C6180b() {
        }

        public void run() {
            C6178c.this.mo21073E(0);
        }
    }

    /* renamed from: z.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C6181c {
        /* renamed from: a */
        public abstract int mo21089a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo21090b(View view, int i, int i2);

        /* renamed from: c */
        public int mo21091c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo21092d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo21093e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo21094f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo21095g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo21096h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo21097i(View view, int i) {
        }

        /* renamed from: j */
        public void mo21098j(int i) {
        }

        /* renamed from: k */
        public void mo21099k(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: l */
        public abstract void mo21100l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo21101m(View view, int i);
    }

    private C6178c(Context context, ViewGroup viewGroup, C6181c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f29670u = viewGroup;
            this.f29667r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f29664o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f29651b = viewConfiguration.getScaledTouchSlop();
            this.f29662m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f29663n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f29666q = new OverScroller(context, f29649w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: A */
    private void m35930A() {
        this.f29661l.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f29662m);
        m35944n(m35936e(this.f29661l.getXVelocity(this.f29652c), this.f29663n, this.f29662m), m35936e(this.f29661l.getYVelocity(this.f29652c), this.f29663n, this.f29662m));
    }

    /* renamed from: B */
    private void m35931B(float f, float f2, int i) {
        boolean c = m35934c(f, f2, i, 1);
        if (m35934c(f2, f, i, 4)) {
            c |= true;
        }
        if (m35934c(f, f2, i, 2)) {
            c |= true;
        }
        if (m35934c(f2, f, i, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f29658i;
            iArr[i] = iArr[i] | c;
            this.f29667r.mo21094f(c ? 1 : 0, i);
        }
    }

    /* renamed from: C */
    private void m35932C(float f, float f2, int i) {
        m35947q(i);
        float[] fArr = this.f29653d;
        this.f29655f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f29654e;
        this.f29656g[i] = f2;
        fArr2[i] = f2;
        this.f29657h[i] = m35949t((int) f, (int) f2);
        this.f29660k |= 1 << i;
    }

    /* renamed from: D */
    private void m35933D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m35950x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f29655f[pointerId] = x;
                this.f29656g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m35934c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f29657h[i] & i2) != i2 || (this.f29665p & i2) == 0 || (this.f29659j[i] & i2) == i2 || (this.f29658i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f29651b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f29667r.mo21095g(i2)) {
            int[] iArr = this.f29659j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f29658i[i] & i2) != 0 || abs <= ((float) this.f29651b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private boolean m35935d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f29667r.mo21092d(view) > 0;
        boolean z2 = this.f29667r.mo21093e(view) > 0;
        if (z && z2) {
            int i = this.f29651b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f29651b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f29651b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private float m35936e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: f */
    private int m35937f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: g */
    private void m35938g() {
        float[] fArr = this.f29653d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f29654e, 0.0f);
            Arrays.fill(this.f29655f, 0.0f);
            Arrays.fill(this.f29656g, 0.0f);
            Arrays.fill(this.f29657h, 0);
            Arrays.fill(this.f29658i, 0);
            Arrays.fill(this.f29659j, 0);
            this.f29660k = 0;
        }
    }

    /* renamed from: h */
    private void m35939h(int i) {
        if (this.f29653d != null && mo21084w(i)) {
            this.f29653d[i] = 0.0f;
            this.f29654e[i] = 0.0f;
            this.f29655f[i] = 0.0f;
            this.f29656g[i] = 0.0f;
            this.f29657h[i] = 0;
            this.f29658i[i] = 0;
            this.f29659j[i] = 0;
            this.f29660k = (~(1 << i)) & this.f29660k;
        }
    }

    /* renamed from: i */
    private int m35940i(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f29670u.getWidth();
        float f = (float) (width / 2);
        float o = f + (m35945o(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(o / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: j */
    private int m35941j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int f5 = m35937f(i3, (int) this.f29663n, (int) this.f29662m);
        int f6 = m35937f(i4, (int) this.f29663n, (int) this.f29662m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (f5 != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f7 = f2 / f;
        if (f6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f8 = f4 / f3;
        return (int) ((((float) m35940i(i, f5, this.f29667r.mo21092d(view))) * f7) + (((float) m35940i(i2, f6, this.f29667r.mo21093e(view))) * f8));
    }

    /* renamed from: l */
    public static C6178c m35942l(ViewGroup viewGroup, float f, C6181c cVar) {
        C6178c m = m35943m(viewGroup, cVar);
        m.f29651b = (int) (((float) m.f29651b) * (1.0f / f));
        return m;
    }

    /* renamed from: m */
    public static C6178c m35943m(ViewGroup viewGroup, C6181c cVar) {
        return new C6178c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: n */
    private void m35944n(float f, float f2) {
        this.f29669t = true;
        this.f29667r.mo21100l(this.f29668s, f, f2);
        this.f29669t = false;
        if (this.f29650a == 1) {
            mo21073E(0);
        }
    }

    /* renamed from: o */
    private float m35945o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: p */
    private void m35946p(int i, int i2, int i3, int i4) {
        int left = this.f29668s.getLeft();
        int top = this.f29668s.getTop();
        if (i3 != 0) {
            i = this.f29667r.mo21089a(this.f29668s, i, i3);
            C0835a0.m3711X(this.f29668s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f29667r.mo21090b(this.f29668s, i2, i4);
            C0835a0.m3712Y(this.f29668s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f29667r.mo21099k(this.f29668s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: q */
    private void m35947q(int i) {
        float[] fArr = this.f29653d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f29654e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f29655f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f29656g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29657h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f29658i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f29659j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f29653d = fArr2;
            this.f29654e = fArr3;
            this.f29655f = fArr4;
            this.f29656g = fArr5;
            this.f29657h = iArr;
            this.f29658i = iArr2;
            this.f29659j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m35948s(int i, int i2, int i3, int i4) {
        int left = this.f29668s.getLeft();
        int top = this.f29668s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f29666q.abortAnimation();
            mo21073E(0);
            return false;
        }
        this.f29666q.startScroll(left, top, i5, i6, m35941j(this.f29668s, i5, i6, i3, i4));
        mo21073E(2);
        return true;
    }

    /* renamed from: t */
    private int m35949t(int i, int i2) {
        int i3 = i < this.f29670u.getLeft() + this.f29664o ? 1 : 0;
        if (i2 < this.f29670u.getTop() + this.f29664o) {
            i3 |= 4;
        }
        if (i > this.f29670u.getRight() - this.f29664o) {
            i3 |= 2;
        }
        return i2 > this.f29670u.getBottom() - this.f29664o ? i3 | 8 : i3;
    }

    /* renamed from: x */
    private boolean m35950x(int i) {
        if (mo21084w(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo21073E(int i) {
        this.f29670u.removeCallbacks(this.f29671v);
        if (this.f29650a != i) {
            this.f29650a = i;
            this.f29667r.mo21098j(i);
            if (this.f29650a == 0) {
                this.f29668s = null;
            }
        }
    }

    /* renamed from: F */
    public boolean mo21074F(int i, int i2) {
        if (this.f29669t) {
            return m35948s(i, i2, (int) this.f29661l.getXVelocity(this.f29652c), (int) this.f29661l.getYVelocity(this.f29652c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21075G(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo21078a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f29661l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f29661l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f29661l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m35939h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m35932C(r7, r1, r2)
            int r3 = r0.f29650a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f29657h
            r1 = r1[r2]
            int r3 = r0.f29665p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            z.c$c r4 = r0.f29667r
            r1 = r1 & r3
            r4.mo21096h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo21081r(r3, r1)
            android.view.View r3 = r0.f29668s
            if (r1 != r3) goto L_0x0031
            r0.mo21077I(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f29653d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f29654e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m35950x(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f29653d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f29654e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo21081r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m35935d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            z.c$c r14 = r0.f29667r
            int r12 = r14.mo21089a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            z.c$c r5 = r0.f29667r
            int r5 = r5.mo21090b(r7, r15, r14)
            z.c$c r14 = r0.f29667r
            int r14 = r14.mo21092d(r7)
            z.c$c r15 = r0.f29667r
            int r15 = r15.mo21093e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m35931B(r9, r10, r4)
            int r5 = r0.f29650a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo21077I(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m35933D(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo21078a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m35932C(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo21081r(r2, r3)
            android.view.View r3 = r0.f29668s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f29650a
            if (r3 != r4) goto L_0x0125
            r0.mo21077I(r2, r1)
        L_0x0125:
            int[] r2 = r0.f29657h
            r2 = r2[r1]
            int r3 = r0.f29665p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            z.c$c r4 = r0.f29667r
            r2 = r2 & r3
            r4.mo21096h(r2, r1)
        L_0x0135:
            int r1 = r0.f29650a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p175z.C6178c.mo21075G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean mo21076H(View view, int i, int i2) {
        this.f29668s = view;
        this.f29652c = -1;
        boolean s = m35948s(i, i2, 0, 0);
        if (!s && this.f29650a == 0 && this.f29668s != null) {
            this.f29668s = null;
        }
        return s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo21077I(View view, int i) {
        if (view == this.f29668s && this.f29652c == i) {
            return true;
        }
        if (view == null || !this.f29667r.mo21101m(view, i)) {
            return false;
        }
        this.f29652c = i;
        mo21079b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo21078a() {
        this.f29652c = -1;
        m35938g();
        VelocityTracker velocityTracker = this.f29661l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29661l = null;
        }
    }

    /* renamed from: b */
    public void mo21079b(View view, int i) {
        if (view.getParent() == this.f29670u) {
            this.f29668s = view;
            this.f29652c = i;
            this.f29667r.mo21097i(view, i);
            mo21073E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f29670u + ")");
    }

    /* renamed from: k */
    public boolean mo21080k(boolean z) {
        if (this.f29650a == 2) {
            boolean computeScrollOffset = this.f29666q.computeScrollOffset();
            int currX = this.f29666q.getCurrX();
            int currY = this.f29666q.getCurrY();
            int left = currX - this.f29668s.getLeft();
            int top = currY - this.f29668s.getTop();
            if (left != 0) {
                C0835a0.m3711X(this.f29668s, left);
            }
            if (top != 0) {
                C0835a0.m3712Y(this.f29668s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f29667r.mo21099k(this.f29668s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f29666q.getFinalX() && currY == this.f29666q.getFinalY()) {
                this.f29666q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f29670u.post(this.f29671v);
                } else {
                    mo21073E(0);
                }
            }
        }
        if (this.f29650a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public View mo21081r(int i, int i2) {
        for (int childCount = this.f29670u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f29670u.getChildAt(this.f29667r.mo21091c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int mo21082u() {
        return this.f29651b;
    }

    /* renamed from: v */
    public boolean mo21083v(int i, int i2) {
        return mo21085y(this.f29668s, i, i2);
    }

    /* renamed from: w */
    public boolean mo21084w(int i) {
        return ((1 << i) & this.f29660k) != 0;
    }

    /* renamed from: y */
    public boolean mo21085y(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public void mo21086z(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo21078a();
        }
        if (this.f29661l == null) {
            this.f29661l = VelocityTracker.obtain();
        }
        this.f29661l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r = mo21081r((int) x, (int) y);
            m35932C(x, y, pointerId);
            mo21077I(r, pointerId);
            int i3 = this.f29657h[pointerId];
            int i4 = this.f29665p;
            if ((i3 & i4) != 0) {
                this.f29667r.mo21096h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f29650a == 1) {
                m35930A();
            }
            mo21078a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f29650a == 1) {
                    m35944n(0.0f, 0.0f);
                }
                mo21078a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m35932C(x2, y2, pointerId2);
                if (this.f29650a == 0) {
                    mo21077I(mo21081r((int) x2, (int) y2), pointerId2);
                    int i5 = this.f29657h[pointerId2];
                    int i6 = this.f29665p;
                    if ((i5 & i6) != 0) {
                        this.f29667r.mo21096h(i5 & i6, pointerId2);
                    }
                } else if (mo21083v((int) x2, (int) y2)) {
                    mo21077I(this.f29668s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f29650a == 1 && pointerId3 == this.f29652c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f29652c) {
                            View r2 = mo21081r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f29668s;
                            if (r2 == view && mo21077I(view, pointerId4)) {
                                i = this.f29652c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m35930A();
                    }
                }
                m35939h(pointerId3);
            }
        } else if (this.f29650a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m35950x(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f29653d[pointerId5];
                    float f2 = y3 - this.f29654e[pointerId5];
                    m35931B(f, f2, pointerId5);
                    if (this.f29650a != 1) {
                        View r3 = mo21081r((int) x3, (int) y3);
                        if (m35935d(r3, f, f2) && mo21077I(r3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m35933D(motionEvent);
        } else if (m35950x(this.f29652c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f29652c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f29655f;
            int i7 = this.f29652c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f29656g[i7]);
            m35946p(this.f29668s.getLeft() + i8, this.f29668s.getTop() + i9, i8, i9);
            m35933D(motionEvent);
        }
    }
}
