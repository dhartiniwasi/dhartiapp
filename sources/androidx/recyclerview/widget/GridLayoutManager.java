package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C0862c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3663I = false;

    /* renamed from: J */
    int f3664J = -1;

    /* renamed from: K */
    int[] f3665K;

    /* renamed from: L */
    View[] f3666L;

    /* renamed from: M */
    final SparseIntArray f3667M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3668N = new SparseIntArray();

    /* renamed from: O */
    C1323c f3669O = new C1321a();

    /* renamed from: P */
    final Rect f3670P = new Rect();

    /* renamed from: Q */
    private boolean f3671Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1321a extends C1323c {
        /* renamed from: e */
        public int mo4726e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo4727f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1323c {

        /* renamed from: a */
        final SparseIntArray f3674a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3675b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3676c = false;

        /* renamed from: d */
        private boolean f3677d = false;

        /* renamed from: a */
        static int m5792a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4730b(int i, int i2) {
            if (!this.f3677d) {
                return mo4732d(i, i2);
            }
            int i3 = this.f3675b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo4732d(i, i2);
            this.f3675b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4731c(int i, int i2) {
            if (!this.f3676c) {
                return mo4726e(i, i2);
            }
            int i3 = this.f3674a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo4726e(i, i2);
            this.f3674a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4732d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3677d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f3675b
                int r0 = m5792a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f3675b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo4731c(r0, r8)
                int r0 = r6.mo4727f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo4727f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo4727f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1323c.mo4732d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo4726e(int i, int i2);

        /* renamed from: f */
        public abstract int mo4727f(int i);

        /* renamed from: g */
        public void mo4733g() {
            this.f3675b.clear();
        }

        /* renamed from: h */
        public void mo4734h() {
            this.f3674a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4714e3(RecyclerView.C1350o.m6033i0(context, attributeSet, i, i2).f3801b);
    }

    /* renamed from: N2 */
    private void m5741N2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3666L[i3];
            C1322b bVar = (C1322b) view.getLayoutParams();
            int a3 = m5752a3(vVar, a0Var, mo5173h0(view));
            bVar.f3673f = a3;
            bVar.f3672e = i4;
            i4 += a3;
            i3 += i2;
        }
    }

    /* renamed from: O2 */
    private void m5742O2() {
        int J = mo5133J();
        for (int i = 0; i < J; i++) {
            C1322b bVar = (C1322b) mo5132I(i).getLayoutParams();
            int a = bVar.mo5213a();
            this.f3667M.put(a, bVar.mo4729f());
            this.f3668N.put(a, bVar.mo4728e());
        }
    }

    /* renamed from: P2 */
    private void m5743P2(int i) {
        this.f3665K = m5744Q2(this.f3665K, this.f3664J, i);
    }

    /* renamed from: Q2 */
    static int[] m5744Q2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: R2 */
    private void m5745R2() {
        this.f3667M.clear();
        this.f3668N.clear();
    }

    /* renamed from: S2 */
    private int m5746S2(RecyclerView.C1330a0 a0Var) {
        int i;
        if (!(mo5133J() == 0 || a0Var.mo4982b() == 0)) {
            mo4746T1();
            boolean r2 = mo4766r2();
            View Y1 = mo4749Y1(!r2, true);
            View X1 = mo4748X1(!r2, true);
            if (!(Y1 == null || X1 == null)) {
                int b = this.f3669O.mo4730b(mo5173h0(Y1), this.f3664J);
                int b2 = this.f3669O.mo4730b(mo5173h0(X1), this.f3664J);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f3669O.mo4730b(a0Var.mo4982b() - 1, this.f3664J) + 1;
                if (this.f3691x) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!r2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f3688u.mo5488d(X1) - this.f3688u.mo5491g(Y1))) / ((float) ((this.f3669O.mo4730b(mo5173h0(X1), this.f3664J) - this.f3669O.mo4730b(mo5173h0(Y1), this.f3664J)) + 1)))) + ((float) (this.f3688u.mo5497m() - this.f3688u.mo5491g(Y1))));
            }
        }
        return 0;
    }

    /* renamed from: T2 */
    private int m5747T2(RecyclerView.C1330a0 a0Var) {
        if (!(mo5133J() == 0 || a0Var.mo4982b() == 0)) {
            mo4746T1();
            View Y1 = mo4749Y1(!mo4766r2(), true);
            View X1 = mo4748X1(!mo4766r2(), true);
            if (!(Y1 == null || X1 == null)) {
                if (!mo4766r2()) {
                    return this.f3669O.mo4730b(a0Var.mo4982b() - 1, this.f3664J) + 1;
                }
                int d = this.f3688u.mo5488d(X1) - this.f3688u.mo5491g(Y1);
                int b = this.f3669O.mo4730b(mo5173h0(Y1), this.f3664J);
                return (int) ((((float) d) / ((float) ((this.f3669O.mo4730b(mo5173h0(X1), this.f3664J) - b) + 1))) * ((float) (this.f3669O.mo4730b(a0Var.mo4982b() - 1, this.f3664J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: U2 */
    private void m5748U2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, LinearLayoutManager.C1324a aVar, int i) {
        boolean z = i == 1;
        int Z2 = m5751Z2(vVar, a0Var, aVar.f3695b);
        if (z) {
            while (Z2 > 0) {
                int i2 = aVar.f3695b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3695b = i3;
                    Z2 = m5751Z2(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = a0Var.mo4982b() - 1;
        int i4 = aVar.f3695b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int Z22 = m5751Z2(vVar, a0Var, i5);
            if (Z22 <= Z2) {
                break;
            }
            i4 = i5;
            Z2 = Z22;
        }
        aVar.f3695b = i4;
    }

    /* renamed from: V2 */
    private void m5749V2() {
        View[] viewArr = this.f3666L;
        if (viewArr == null || viewArr.length != this.f3664J) {
            this.f3666L = new View[this.f3664J];
        }
    }

    /* renamed from: Y2 */
    private int m5750Y2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i) {
        if (!a0Var.mo4985e()) {
            return this.f3669O.mo4730b(i, this.f3664J);
        }
        int f = vVar.mo5252f(i);
        if (f != -1) {
            return this.f3669O.mo4730b(f, this.f3664J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: Z2 */
    private int m5751Z2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i) {
        if (!a0Var.mo4985e()) {
            return this.f3669O.mo4731c(i, this.f3664J);
        }
        int i2 = this.f3668N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5252f(i);
        if (f != -1) {
            return this.f3669O.mo4731c(f, this.f3664J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: a3 */
    private int m5752a3(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i) {
        if (!a0Var.mo4985e()) {
            return this.f3669O.mo4727f(i);
        }
        int i2 = this.f3667M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5252f(i);
        if (f != -1) {
            return this.f3669O.mo4727f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: b3 */
    private void m5753b3(float f, int i) {
        m5743P2(Math.max(Math.round(f * ((float) this.f3664J)), i));
    }

    /* renamed from: c3 */
    private void m5754c3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1322b bVar = (C1322b) view.getLayoutParams();
        Rect rect = bVar.f3805b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int W2 = mo4710W2(bVar.f3672e, bVar.f3673f);
        if (this.f3686s == 1) {
            i2 = RecyclerView.C1350o.m6030K(W2, i, i5, bVar.width, false);
            i3 = RecyclerView.C1350o.m6030K(this.f3688u.mo5498n(), mo5152X(), i4, bVar.height, true);
        } else {
            int K = RecyclerView.C1350o.m6030K(W2, i, i4, bVar.height, false);
            int K2 = RecyclerView.C1350o.m6030K(this.f3688u.mo5498n(), mo5189p0(), i5, bVar.width, true);
            i3 = K;
            i2 = K2;
        }
        m5755d3(view, i2, i3, z);
    }

    /* renamed from: d3 */
    private void m5755d3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
        if (z) {
            z2 = mo5131H1(view, i, i2, pVar);
        } else {
            z2 = mo5126F1(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: f3 */
    private void m5756f3() {
        int i;
        int i2;
        if (mo4763p2() == 1) {
            i2 = mo5187o0() - mo5168f0();
            i = mo5166e0();
        } else {
            i2 = mo5151W() - mo5164d0();
            i = mo5170g0();
        }
        m5743P2(i2 - i);
    }

    /* renamed from: C1 */
    public void mo4695C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3665K == null) {
            super.mo4695C1(rect, i, i2);
        }
        int e0 = mo5166e0() + mo5168f0();
        int g0 = mo5170g0() + mo5164d0();
        if (this.f3686s == 1) {
            i4 = RecyclerView.C1350o.m6034n(i2, rect.height() + g0, mo5159b0());
            int[] iArr = this.f3665K;
            i3 = RecyclerView.C1350o.m6034n(i, iArr[iArr.length - 1] + e0, mo5162c0());
        } else {
            i3 = RecyclerView.C1350o.m6034n(i, rect.width() + e0, mo5162c0());
            int[] iArr2 = this.f3665K;
            i4 = RecyclerView.C1350o.m6034n(i2, iArr2[iArr2.length - 1] + g0, mo5159b0());
        }
        mo5119B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C1355p mo4696D() {
        if (this.f3686s == 0) {
            return new C1322b(-2, -1);
        }
        return new C1322b(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.C1355p mo4697E(Context context, AttributeSet attributeSet) {
        return new C1322b(context, attributeSet);
    }

    /* renamed from: E2 */
    public void mo4698E2(boolean z) {
        if (!z) {
            super.mo4698E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: F */
    public RecyclerView.C1355p mo4699F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1322b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1322b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4700J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1362v r26, androidx.recyclerview.widget.RecyclerView.C1330a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo5117B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1322b) r5
            int r6 = r5.f3672e
            int r5 = r5.f3673f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4700J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo4744R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3691x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo5133J()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo5133J()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3686s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4765q2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m5750Y2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m5750Y2(r1, r2, r10)
            android.view.View r1 = r0.mo5132I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1322b) r9
            int r2 = r9.f3672e
            r18 = r3
            int r3 = r9.f3673f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo5203y0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3672e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3672e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4700J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: L1 */
    public boolean mo4701L1() {
        return this.f3681D == null && !this.f3663I;
    }

    /* renamed from: N */
    public int mo4702N(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3686s == 1) {
            return this.f3664J;
        }
        if (a0Var.mo4982b() < 1) {
            return 0;
        }
        return m5750Y2(vVar, a0Var, a0Var.mo4982b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4703N1(RecyclerView.C1330a0 a0Var, LinearLayoutManager.C1326c cVar, RecyclerView.C1350o.C1353c cVar2) {
        int i = this.f3664J;
        for (int i2 = 0; i2 < this.f3664J && cVar.mo4780c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f3706d;
            cVar2.mo5212a(i3, Math.max(0, cVar.f3709g));
            i -= this.f3669O.mo4727f(i3);
            cVar.f3706d += cVar.f3707e;
        }
    }

    /* renamed from: P0 */
    public void mo4704P0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, View view, C0862c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1322b)) {
            super.mo5141O0(view, cVar);
            return;
        }
        C1322b bVar = (C1322b) layoutParams;
        int Y2 = m5750Y2(vVar, a0Var, bVar.mo5213a());
        if (this.f3686s == 0) {
            cVar.mo3297a0(C0862c.C0865c.m4000a(bVar.mo4728e(), bVar.mo4729f(), Y2, 1, false, false));
            return;
        }
        cVar.mo3297a0(C0862c.C0865c.m4000a(Y2, 1, bVar.mo4728e(), bVar.mo4729f(), false, false));
    }

    /* renamed from: R0 */
    public void mo4705R0(RecyclerView recyclerView, int i, int i2) {
        this.f3669O.mo4734h();
        this.f3669O.mo4733g();
    }

    /* renamed from: S0 */
    public void mo4706S0(RecyclerView recyclerView) {
        this.f3669O.mo4734h();
        this.f3669O.mo4733g();
    }

    /* renamed from: T0 */
    public void mo4707T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3669O.mo4734h();
        this.f3669O.mo4733g();
    }

    /* renamed from: U0 */
    public void mo4708U0(RecyclerView recyclerView, int i, int i2) {
        this.f3669O.mo4734h();
        this.f3669O.mo4733g();
    }

    /* renamed from: W0 */
    public void mo4709W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3669O.mo4734h();
        this.f3669O.mo4733g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W2 */
    public int mo4710W2(int i, int i2) {
        if (this.f3686s != 1 || !mo4765q2()) {
            int[] iArr = this.f3665K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3665K;
        int i3 = this.f3664J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: X0 */
    public void mo4711X0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (a0Var.mo4985e()) {
            m5742O2();
        }
        super.mo4711X0(vVar, a0Var);
        m5745R2();
    }

    /* renamed from: X2 */
    public int mo4712X2() {
        return this.f3664J;
    }

    /* renamed from: Y0 */
    public void mo4713Y0(RecyclerView.C1330a0 a0Var) {
        super.mo4713Y0(a0Var);
        this.f3663I = false;
    }

    /* renamed from: e3 */
    public void mo4714e3(int i) {
        if (i != this.f3664J) {
            this.f3663I = true;
            if (i >= 1) {
                this.f3664J = i;
                this.f3669O.mo4734h();
                mo5196t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4715h2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i, int i2, int i3) {
        mo4746T1();
        int m = this.f3688u.mo5497m();
        int i4 = this.f3688u.mo5493i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo5132I(i);
            int h0 = mo5173h0(I);
            if (h0 >= 0 && h0 < i3 && m5751Z2(vVar, a0Var, h0) == 0) {
                if (((RecyclerView.C1355p) I.getLayoutParams()).mo5215c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f3688u.mo5491g(I) < i4 && this.f3688u.mo5488d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* renamed from: k0 */
    public int mo4716k0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3686s == 0) {
            return this.f3664J;
        }
        if (a0Var.mo4982b() < 1) {
            return 0;
        }
        return m5750Y2(vVar, a0Var, a0Var.mo4982b() - 1) + 1;
    }

    /* renamed from: m */
    public boolean mo4717m(RecyclerView.C1355p pVar) {
        return pVar instanceof C1322b;
    }

    /* renamed from: r */
    public int mo4718r(RecyclerView.C1330a0 a0Var) {
        if (this.f3671Q) {
            return m5746S2(a0Var);
        }
        return super.mo4718r(a0Var);
    }

    /* renamed from: s */
    public int mo4719s(RecyclerView.C1330a0 a0Var) {
        if (this.f3671Q) {
            return m5747T2(a0Var);
        }
        return super.mo4719s(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4720s2(androidx.recyclerview.widget.RecyclerView.C1362v r18, androidx.recyclerview.widget.RecyclerView.C1330a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C1326c r20, androidx.recyclerview.widget.LinearLayoutManager.C1325b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.j r3 = r6.f3688u
            int r3 = r3.mo5496l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.mo5133J()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f3665K
            int r11 = r6.f3664J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.m5756f3()
        L_0x002c:
            int r11 = r2.f3707e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.f3664J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f3706d
            int r12 = r6.m5751Z2(r0, r1, r12)
            int r13 = r2.f3706d
            int r13 = r6.m5752a3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.f3664J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.mo4780c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f3706d
            int r15 = r6.m5752a3(r0, r1, r14)
            int r4 = r6.f3664J
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.mo4781d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f3666L
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f3664J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f3700b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.m5741N2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.f3666L
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r14 = r2.f3714l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.mo5163d(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.mo5165e(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.mo5158b(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.mo5161c(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.f3670P
            r6.mo5177j(r12, r14)
            r6.m5754c3(r12, r3, r5)
            androidx.recyclerview.widget.j r14 = r6.f3688u
            int r14 = r14.mo5489e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.C1322b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.j r5 = r6.f3688u
            int r5 = r5.mo5490f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f3673f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.m5753b3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.f3666L
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.m5754c3(r3, r4, r8)
            androidx.recyclerview.widget.j r4 = r6.f3688u
            int r3 = r4.mo5489e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.f3666L
            r3 = r3[r0]
            androidx.recyclerview.widget.j r4 = r6.f3688u
            int r4 = r4.mo5489e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.C1322b) r4
            android.graphics.Rect r5 = r4.f3805b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f3672e
            int r11 = r4.f3673f
            int r5 = r6.mo4710W2(r5, r11)
            int r11 = r6.f3686s
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.C1350o.m6030K(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.C1350o.m6030K(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.m5755d3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.f3699a = r1
            int r0 = r6.f3686s
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f3708f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.f3704b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.f3704b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f3708f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.f3704b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.f3704b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.f3666L
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C1322b) r10
            int r4 = r6.f3686s
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.mo4765q2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.mo5166e0()
            int[] r3 = r6.f3665K
            int r4 = r6.f3664J
            int r5 = r10.f3672e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f3688u
            int r3 = r3.mo5490f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.mo5166e0()
            int[] r3 = r6.f3665K
            int r4 = r10.f3672e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f3688u
            int r3 = r3.mo5490f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.mo5170g0()
            int[] r2 = r6.f3665K
            int r4 = r10.f3672e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.j r2 = r6.f3688u
            int r2 = r2.mo5490f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.mo5205z0(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo5215c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.mo5214b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.f3701c = r8
        L_0x021b:
            boolean r0 = r7.f3702d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f3702d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.f3666L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4720s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: u */
    public int mo4721u(RecyclerView.C1330a0 a0Var) {
        if (this.f3671Q) {
            return m5746S2(a0Var);
        }
        return super.mo4721u(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4722u2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, LinearLayoutManager.C1324a aVar, int i) {
        super.mo4722u2(vVar, a0Var, aVar, i);
        m5756f3();
        if (a0Var.mo4982b() > 0 && !a0Var.mo4985e()) {
            m5748U2(vVar, a0Var, aVar, i);
        }
        m5749V2();
    }

    /* renamed from: v */
    public int mo4723v(RecyclerView.C1330a0 a0Var) {
        if (this.f3671Q) {
            return m5747T2(a0Var);
        }
        return super.mo4723v(a0Var);
    }

    /* renamed from: w1 */
    public int mo4724w1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        m5756f3();
        m5749V2();
        return super.mo4724w1(i, vVar, a0Var);
    }

    /* renamed from: y1 */
    public int mo4725y1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        m5756f3();
        m5749V2();
        return super.mo4725y1(i, vVar, a0Var);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1322b extends RecyclerView.C1355p {

        /* renamed from: e */
        int f3672e = -1;

        /* renamed from: f */
        int f3673f = 0;

        public C1322b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo4728e() {
            return this.f3672e;
        }

        /* renamed from: f */
        public int mo4729f() {
            return this.f3673f;
        }

        public C1322b(int i, int i2) {
            super(i, i2);
        }

        public C1322b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1322b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4714e3(i);
    }
}
