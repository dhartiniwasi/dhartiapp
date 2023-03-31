package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.p */
/* compiled from: NestedScrollingChildHelper */
public class C0948p {

    /* renamed from: a */
    private ViewParent f2619a;

    /* renamed from: b */
    private ViewParent f2620b;

    /* renamed from: c */
    private final View f2621c;

    /* renamed from: d */
    private boolean f2622d;

    /* renamed from: e */
    private int[] f2623e;

    public C0948p(View view) {
        this.f2621c = view;
    }

    /* renamed from: h */
    private boolean m4290h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo3485m() || (i6 = m4291i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f2621c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = m4292j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        C0903e0.m4091d(i6, this.f2621c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f2621c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m4291i(int i) {
        if (i == 0) {
            return this.f2619a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2620b;
    }

    /* renamed from: j */
    private int[] m4292j() {
        if (this.f2623e == null) {
            this.f2623e = new int[2];
        }
        return this.f2623e;
    }

    /* renamed from: o */
    private void m4293o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2619a = viewParent;
        } else if (i == 1) {
            this.f2620b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo3476a(float f, float f2, boolean z) {
        ViewParent i;
        if (!mo3485m() || (i = m4291i(0)) == null) {
            return false;
        }
        return C0903e0.m4088a(i, this.f2621c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo3477b(float f, float f2) {
        ViewParent i;
        if (!mo3485m() || (i = m4291i(0)) == null) {
            return false;
        }
        return C0903e0.m4089b(i, this.f2621c, f, f2);
    }

    /* renamed from: c */
    public boolean mo3478c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3479d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo3479d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!mo3485m() || (i4 = m4291i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f2621c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = m4292j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0903e0.m4090c(i4, this.f2621c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f2621c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo3480e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m4290h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo3481f(int i, int i2, int i3, int i4, int[] iArr) {
        return m4290h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo3482g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m4290h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: k */
    public boolean mo3483k() {
        return mo3484l(0);
    }

    /* renamed from: l */
    public boolean mo3484l(int i) {
        return m4291i(i) != null;
    }

    /* renamed from: m */
    public boolean mo3485m() {
        return this.f2622d;
    }

    /* renamed from: n */
    public void mo3486n(boolean z) {
        if (this.f2622d) {
            C0835a0.m3693G0(this.f2621c);
        }
        this.f2622d = z;
    }

    /* renamed from: p */
    public boolean mo3487p(int i) {
        return mo3488q(i, 0);
    }

    /* renamed from: q */
    public boolean mo3488q(int i, int i2) {
        if (mo3484l(i2)) {
            return true;
        }
        if (!mo3485m()) {
            return false;
        }
        View view = this.f2621c;
        for (ViewParent parent = this.f2621c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0903e0.m4093f(parent, view, this.f2621c, i, i2)) {
                m4293o(i2, parent);
                C0903e0.m4092e(parent, view, this.f2621c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo3489r() {
        mo3490s(0);
    }

    /* renamed from: s */
    public void mo3490s(int i) {
        ViewParent i2 = m4291i(i);
        if (i2 != null) {
            C0903e0.m4094g(i2, this.f2621c, i);
            m4293o(i, (ViewParent) null);
        }
    }
}
