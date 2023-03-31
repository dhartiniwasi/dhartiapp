package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C0862c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1350o implements RecyclerView.C1367z.C1369b {

    /* renamed from: A */
    boolean f3839A = false;

    /* renamed from: B */
    private BitSet f3840B;

    /* renamed from: C */
    int f3841C = -1;

    /* renamed from: D */
    int f3842D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    C1373d f3843E = new C1373d();

    /* renamed from: F */
    private int f3844F = 2;

    /* renamed from: G */
    private boolean f3845G;

    /* renamed from: H */
    private boolean f3846H;

    /* renamed from: I */
    private C1376e f3847I;

    /* renamed from: J */
    private int f3848J;

    /* renamed from: K */
    private final Rect f3849K = new Rect();

    /* renamed from: L */
    private final C1371b f3850L = new C1371b();

    /* renamed from: M */
    private boolean f3851M = false;

    /* renamed from: N */
    private boolean f3852N = true;

    /* renamed from: O */
    private int[] f3853O;

    /* renamed from: P */
    private final Runnable f3854P = new C1370a();

    /* renamed from: s */
    private int f3855s = -1;

    /* renamed from: t */
    C1378f[] f3856t;

    /* renamed from: u */
    C1410j f3857u;

    /* renamed from: v */
    C1410j f3858v;

    /* renamed from: w */
    private int f3859w;

    /* renamed from: x */
    private int f3860x;

    /* renamed from: y */
    private final C1405f f3861y;

    /* renamed from: z */
    boolean f3862z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1370a implements Runnable {
        C1370a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5310S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1371b {

        /* renamed from: a */
        int f3864a;

        /* renamed from: b */
        int f3865b;

        /* renamed from: c */
        boolean f3866c;

        /* renamed from: d */
        boolean f3867d;

        /* renamed from: e */
        boolean f3868e;

        /* renamed from: f */
        int[] f3869f;

        C1371b() {
            mo5323c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5321a() {
            int i;
            if (this.f3866c) {
                i = StaggeredGridLayoutManager.this.f3857u.mo5493i();
            } else {
                i = StaggeredGridLayoutManager.this.f3857u.mo5497m();
            }
            this.f3865b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5322b(int i) {
            if (this.f3866c) {
                this.f3865b = StaggeredGridLayoutManager.this.f3857u.mo5493i() - i;
            } else {
                this.f3865b = StaggeredGridLayoutManager.this.f3857u.mo5497m() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5323c() {
            this.f3864a = -1;
            this.f3865b = RecyclerView.UNDEFINED_DURATION;
            this.f3866c = false;
            this.f3867d = false;
            this.f3868e = false;
            int[] iArr = this.f3869f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5324d(C1378f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3869f;
            if (iArr == null || iArr.length < length) {
                this.f3869f = new int[StaggeredGridLayoutManager.this.f3856t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3869f[i] = fVarArr[i].mo5370p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1372c extends RecyclerView.C1355p {

        /* renamed from: e */
        C1378f f3871e;

        /* renamed from: f */
        boolean f3872f;

        public C1372c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int mo5325e() {
            C1378f fVar = this.f3871e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3893e;
        }

        /* renamed from: f */
        public boolean mo5326f() {
            return this.f3872f;
        }

        public C1372c(int i, int i2) {
            super(i, i2);
        }

        public C1372c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1372c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C1376e implements Parcelable {
        public static final Parcelable.Creator<C1376e> CREATOR = new C1377a();

        /* renamed from: a */
        int f3879a;

        /* renamed from: b */
        int f3880b;

        /* renamed from: c */
        int f3881c;

        /* renamed from: d */
        int[] f3882d;

        /* renamed from: e */
        int f3883e;

        /* renamed from: f */
        int[] f3884f;

        /* renamed from: g */
        List<C1373d.C1374a> f3885g;

        /* renamed from: h */
        boolean f3886h;

        /* renamed from: i */
        boolean f3887i;

        /* renamed from: r */
        boolean f3888r;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C1377a implements Parcelable.Creator<C1376e> {
            C1377a() {
            }

            /* renamed from: a */
            public C1376e createFromParcel(Parcel parcel) {
                return new C1376e(parcel);
            }

            /* renamed from: b */
            public C1376e[] newArray(int i) {
                return new C1376e[i];
            }
        }

        public C1376e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5347a() {
            this.f3882d = null;
            this.f3881c = 0;
            this.f3879a = -1;
            this.f3880b = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5348b() {
            this.f3882d = null;
            this.f3881c = 0;
            this.f3883e = 0;
            this.f3884f = null;
            this.f3885g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3879a);
            parcel.writeInt(this.f3880b);
            parcel.writeInt(this.f3881c);
            if (this.f3881c > 0) {
                parcel.writeIntArray(this.f3882d);
            }
            parcel.writeInt(this.f3883e);
            if (this.f3883e > 0) {
                parcel.writeIntArray(this.f3884f);
            }
            parcel.writeInt(this.f3886h ? 1 : 0);
            parcel.writeInt(this.f3887i ? 1 : 0);
            parcel.writeInt(this.f3888r ? 1 : 0);
            parcel.writeList(this.f3885g);
        }

        C1376e(Parcel parcel) {
            this.f3879a = parcel.readInt();
            this.f3880b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3881c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3882d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3883e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3884f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3886h = parcel.readInt() == 1;
            this.f3887i = parcel.readInt() == 1;
            this.f3888r = parcel.readInt() == 1 ? true : z;
            this.f3885g = parcel.readArrayList(C1373d.C1374a.class.getClassLoader());
        }

        public C1376e(C1376e eVar) {
            this.f3881c = eVar.f3881c;
            this.f3879a = eVar.f3879a;
            this.f3880b = eVar.f3880b;
            this.f3882d = eVar.f3882d;
            this.f3883e = eVar.f3883e;
            this.f3884f = eVar.f3884f;
            this.f3886h = eVar.f3886h;
            this.f3887i = eVar.f3887i;
            this.f3888r = eVar.f3888r;
            this.f3885g = eVar.f3885g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C1378f {

        /* renamed from: a */
        ArrayList<View> f3889a = new ArrayList<>();

        /* renamed from: b */
        int f3890b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f3891c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        int f3892d = 0;

        /* renamed from: e */
        final int f3893e;

        C1378f(int i) {
            this.f3893e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5355a(View view) {
            C1372c n = mo5368n(view);
            n.f3871e = this;
            this.f3889a.add(view);
            this.f3891c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3889a.size() == 1) {
                this.f3890b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo5215c() || n.mo5214b()) {
                this.f3892d += StaggeredGridLayoutManager.this.f3857u.mo5489e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5356b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5366l(RecyclerView.UNDEFINED_DURATION);
            } else {
                i2 = mo5370p(RecyclerView.UNDEFINED_DURATION);
            }
            mo5359e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f3857u.mo5493i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f3857u.mo5497m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f3891c = i2;
                    this.f3890b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5357c() {
            C1373d.C1374a f;
            ArrayList<View> arrayList = this.f3889a;
            View view = arrayList.get(arrayList.size() - 1);
            C1372c n = mo5368n(view);
            this.f3891c = StaggeredGridLayoutManager.this.f3857u.mo5488d(view);
            if (n.f3872f && (f = StaggeredGridLayoutManager.this.f3843E.mo5332f(n.mo5213a())) != null && f.f3876b == 1) {
                this.f3891c += f.mo5339a(this.f3893e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5358d() {
            C1373d.C1374a f;
            View view = this.f3889a.get(0);
            C1372c n = mo5368n(view);
            this.f3890b = StaggeredGridLayoutManager.this.f3857u.mo5491g(view);
            if (n.f3872f && (f = StaggeredGridLayoutManager.this.f3843E.mo5332f(n.mo5213a())) != null && f.f3876b == -1) {
                this.f3890b -= f.mo5339a(this.f3893e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5359e() {
            this.f3889a.clear();
            mo5371q();
            this.f3892d = 0;
        }

        /* renamed from: f */
        public int mo5360f() {
            if (StaggeredGridLayoutManager.this.f3862z) {
                return mo5363i(this.f3889a.size() - 1, -1, true);
            }
            return mo5363i(0, this.f3889a.size(), true);
        }

        /* renamed from: g */
        public int mo5361g() {
            if (StaggeredGridLayoutManager.this.f3862z) {
                return mo5363i(0, this.f3889a.size(), true);
            }
            return mo5363i(this.f3889a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5362h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3857u.mo5497m();
            int i3 = StaggeredGridLayoutManager.this.f3857u.mo5493i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3889a.get(i);
                int g = StaggeredGridLayoutManager.this.f3857u.mo5491g(view);
                int d = StaggeredGridLayoutManager.this.f3857u.mo5488d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo5173h0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.mo5173h0(view);
                        }
                    } else if (g >= m && d <= i3) {
                        return StaggeredGridLayoutManager.this.mo5173h0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo5363i(int i, int i2, boolean z) {
            return mo5362h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo5364j() {
            return this.f3892d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5365k() {
            int i = this.f3891c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5357c();
            return this.f3891c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo5366l(int i) {
            int i2 = this.f3891c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3889a.size() == 0) {
                return i;
            }
            mo5357c();
            return this.f3891c;
        }

        /* renamed from: m */
        public View mo5367m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3889a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3889a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3862z && staggeredGridLayoutManager.mo5173h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3862z && staggeredGridLayoutManager2.mo5173h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3889a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3889a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3862z && staggeredGridLayoutManager3.mo5173h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3862z && staggeredGridLayoutManager4.mo5173h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1372c mo5368n(View view) {
            return (C1372c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5369o() {
            int i = this.f3890b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5358d();
            return this.f3890b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo5370p(int i) {
            int i2 = this.f3890b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3889a.size() == 0) {
                return i;
            }
            mo5358d();
            return this.f3890b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5371q() {
            this.f3890b = RecyclerView.UNDEFINED_DURATION;
            this.f3891c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5372r(int i) {
            int i2 = this.f3890b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3890b = i2 + i;
            }
            int i3 = this.f3891c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3891c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5373s() {
            int size = this.f3889a.size();
            View remove = this.f3889a.remove(size - 1);
            C1372c n = mo5368n(remove);
            n.f3871e = null;
            if (n.mo5215c() || n.mo5214b()) {
                this.f3892d -= StaggeredGridLayoutManager.this.f3857u.mo5489e(remove);
            }
            if (size == 1) {
                this.f3890b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3891c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5374t() {
            View remove = this.f3889a.remove(0);
            C1372c n = mo5368n(remove);
            n.f3871e = null;
            if (this.f3889a.size() == 0) {
                this.f3891c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo5215c() || n.mo5214b()) {
                this.f3892d -= StaggeredGridLayoutManager.this.f3857u.mo5489e(remove);
            }
            this.f3890b = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5375u(View view) {
            C1372c n = mo5368n(view);
            n.f3871e = this;
            this.f3889a.add(0, view);
            this.f3890b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3889a.size() == 1) {
                this.f3891c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo5215c() || n.mo5214b()) {
                this.f3892d += StaggeredGridLayoutManager.this.f3857u.mo5489e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5376v(int i) {
            this.f3890b = i;
            this.f3891c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1350o.C1354d i0 = RecyclerView.C1350o.m6033i0(context, attributeSet, i, i2);
        mo5302H2(i0.f3800a);
        mo5304J2(i0.f3801b);
        mo5303I2(i0.f3802c);
        this.f3861y = new C1405f();
        m6297a2();
    }

    /* renamed from: A2 */
    private void m6275A2(RecyclerView.C1362v vVar, C1405f fVar) {
        int i;
        int i2;
        if (fVar.f4014a && !fVar.f4022i) {
            if (fVar.f4015b == 0) {
                if (fVar.f4018e == -1) {
                    m6276B2(vVar, fVar.f4020g);
                } else {
                    m6277C2(vVar, fVar.f4019f);
                }
            } else if (fVar.f4018e == -1) {
                int i3 = fVar.f4019f;
                int m2 = i3 - m6304m2(i3);
                if (m2 < 0) {
                    i2 = fVar.f4020g;
                } else {
                    i2 = fVar.f4020g - Math.min(m2, fVar.f4015b);
                }
                m6276B2(vVar, i2);
            } else {
                int n2 = m6305n2(fVar.f4020g) - fVar.f4020g;
                if (n2 < 0) {
                    i = fVar.f4019f;
                } else {
                    i = Math.min(n2, fVar.f4015b) + fVar.f4019f;
                }
                m6277C2(vVar, i);
            }
        }
    }

    /* renamed from: B2 */
    private void m6276B2(RecyclerView.C1362v vVar, int i) {
        int J = mo5133J() - 1;
        while (J >= 0) {
            View I = mo5132I(J);
            if (this.f3857u.mo5491g(I) >= i && this.f3857u.mo5501q(I) >= i) {
                C1372c cVar = (C1372c) I.getLayoutParams();
                if (cVar.f3872f) {
                    int i2 = 0;
                    while (i2 < this.f3855s) {
                        if (this.f3856t[i2].f3889a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3855s; i3++) {
                        this.f3856t[i3].mo5373s();
                    }
                } else if (cVar.f3871e.f3889a.size() != 1) {
                    cVar.f3871e.mo5373s();
                } else {
                    return;
                }
                mo5184m1(I, vVar);
                J--;
            } else {
                return;
            }
        }
    }

    /* renamed from: C2 */
    private void m6277C2(RecyclerView.C1362v vVar, int i) {
        while (mo5133J() > 0) {
            View I = mo5132I(0);
            if (this.f3857u.mo5488d(I) <= i && this.f3857u.mo5500p(I) <= i) {
                C1372c cVar = (C1372c) I.getLayoutParams();
                if (cVar.f3872f) {
                    int i2 = 0;
                    while (i2 < this.f3855s) {
                        if (this.f3856t[i2].f3889a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3855s; i3++) {
                        this.f3856t[i3].mo5374t();
                    }
                } else if (cVar.f3871e.f3889a.size() != 1) {
                    cVar.f3871e.mo5374t();
                } else {
                    return;
                }
                mo5184m1(I, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: D2 */
    private void m6278D2() {
        if (this.f3858v.mo5495k() != 1073741824) {
            float f = 0.0f;
            int J = mo5133J();
            for (int i = 0; i < J; i++) {
                View I = mo5132I(i);
                float e = (float) this.f3858v.mo5489e(I);
                if (e >= f) {
                    if (((C1372c) I.getLayoutParams()).mo5326f()) {
                        e = (e * 1.0f) / ((float) this.f3855s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3860x;
            int round = Math.round(f * ((float) this.f3855s));
            if (this.f3858v.mo5495k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3858v.mo5498n());
            }
            mo5309P2(round);
            if (this.f3860x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo5132I(i3);
                    C1372c cVar = (C1372c) I2.getLayoutParams();
                    if (!cVar.f3872f) {
                        if (!mo5318t2() || this.f3859w != 1) {
                            int i4 = cVar.f3871e.f3893e;
                            int i5 = this.f3860x * i4;
                            int i6 = i4 * i2;
                            if (this.f3859w == 1) {
                                I2.offsetLeftAndRight(i5 - i6);
                            } else {
                                I2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f3855s;
                            int i8 = cVar.f3871e.f3893e;
                            I2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3860x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m6279E2() {
        if (this.f3859w == 1 || !mo5318t2()) {
            this.f3839A = this.f3862z;
        } else {
            this.f3839A = !this.f3862z;
        }
    }

    /* renamed from: G2 */
    private void m6280G2(int i) {
        C1405f fVar = this.f3861y;
        fVar.f4018e = i;
        int i2 = 1;
        if (this.f3839A != (i == -1)) {
            i2 = -1;
        }
        fVar.f4017d = i2;
    }

    /* renamed from: K2 */
    private void m6281K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3855s; i3++) {
            if (!this.f3856t[i3].f3889a.isEmpty()) {
                m6287Q2(this.f3856t[i3], i, i2);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m6282L2(RecyclerView.C1330a0 a0Var, C1371b bVar) {
        int i;
        if (this.f3845G) {
            i = m6300g2(a0Var.mo4982b());
        } else {
            i = m6299c2(a0Var.mo4982b());
        }
        bVar.f3864a = i;
        bVar.f3865b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: M1 */
    private void m6283M1(View view) {
        for (int i = this.f3855s - 1; i >= 0; i--) {
            this.f3856t[i].mo5355a(view);
        }
    }

    /* renamed from: N1 */
    private void m6284N1(C1371b bVar) {
        int i;
        C1376e eVar = this.f3847I;
        int i2 = eVar.f3881c;
        if (i2 > 0) {
            if (i2 == this.f3855s) {
                for (int i3 = 0; i3 < this.f3855s; i3++) {
                    this.f3856t[i3].mo5359e();
                    C1376e eVar2 = this.f3847I;
                    int i4 = eVar2.f3882d[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (eVar2.f3887i) {
                            i = this.f3857u.mo5493i();
                        } else {
                            i = this.f3857u.mo5497m();
                        }
                        i4 += i;
                    }
                    this.f3856t[i3].mo5376v(i4);
                }
            } else {
                eVar.mo5348b();
                C1376e eVar3 = this.f3847I;
                eVar3.f3879a = eVar3.f3880b;
            }
        }
        C1376e eVar4 = this.f3847I;
        this.f3846H = eVar4.f3888r;
        mo5303I2(eVar4.f3886h);
        m6279E2();
        C1376e eVar5 = this.f3847I;
        int i5 = eVar5.f3879a;
        if (i5 != -1) {
            this.f3841C = i5;
            bVar.f3866c = eVar5.f3887i;
        } else {
            bVar.f3866c = this.f3839A;
        }
        if (eVar5.f3883e > 1) {
            C1373d dVar = this.f3843E;
            dVar.f3873a = eVar5.f3884f;
            dVar.f3874b = eVar5.f3885g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6285O2(int r5, androidx.recyclerview.widget.RecyclerView.C1330a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3861y
            r1 = 0
            r0.f4015b = r1
            r0.f4016c = r5
            boolean r0 = r4.mo5202x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4983c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3839A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.j r5 = r4.f3857u
            int r5 = r5.mo5498n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.j r5 = r4.f3857u
            int r5 = r5.mo5498n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5137M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.f3861y
            androidx.recyclerview.widget.j r3 = r4.f3857u
            int r3 = r3.mo5497m()
            int r3 = r3 - r6
            r0.f4019f = r3
            androidx.recyclerview.widget.f r6 = r4.f3861y
            androidx.recyclerview.widget.j r0 = r4.f3857u
            int r0 = r0.mo5493i()
            int r0 = r0 + r5
            r6.f4020g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.f3861y
            androidx.recyclerview.widget.j r3 = r4.f3857u
            int r3 = r3.mo5492h()
            int r3 = r3 + r5
            r0.f4020g = r3
            androidx.recyclerview.widget.f r5 = r4.f3861y
            int r6 = -r6
            r5.f4019f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.f3861y
            r5.f4021h = r1
            r5.f4014a = r2
            androidx.recyclerview.widget.j r6 = r4.f3857u
            int r6 = r6.mo5495k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.j r6 = r4.f3857u
            int r6 = r6.mo5492h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4022i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6285O2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Q1 */
    private void m6286Q1(View view, C1372c cVar, C1405f fVar) {
        if (fVar.f4018e == 1) {
            if (cVar.f3872f) {
                m6283M1(view);
            } else {
                cVar.f3871e.mo5355a(view);
            }
        } else if (cVar.f3872f) {
            m6313z2(view);
        } else {
            cVar.f3871e.mo5375u(view);
        }
    }

    /* renamed from: Q2 */
    private void m6287Q2(C1378f fVar, int i, int i2) {
        int j = fVar.mo5364j();
        if (i == -1) {
            if (fVar.mo5369o() + j <= i2) {
                this.f3840B.set(fVar.f3893e, false);
            }
        } else if (fVar.mo5365k() - j >= i2) {
            this.f3840B.set(fVar.f3893e, false);
        }
    }

    /* renamed from: R1 */
    private int m6288R1(int i) {
        if (mo5133J() != 0) {
            if ((i < mo5314j2()) != this.f3839A) {
                return -1;
            }
            return 1;
        } else if (this.f3839A) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: R2 */
    private int m6289R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: T1 */
    private boolean m6290T1(C1378f fVar) {
        if (this.f3839A) {
            if (fVar.mo5365k() < this.f3857u.mo5493i()) {
                ArrayList<View> arrayList = fVar.f3889a;
                return !fVar.mo5368n(arrayList.get(arrayList.size() - 1)).f3872f;
            }
        } else if (fVar.mo5369o() > this.f3857u.mo5497m()) {
            return !fVar.mo5368n(fVar.f3889a.get(0)).f3872f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m6291U1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        return C1415l.m6650a(a0Var, this.f3857u, mo5312e2(!this.f3852N), mo5311d2(!this.f3852N), this, this.f3852N);
    }

    /* renamed from: V1 */
    private int m6292V1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        return C1415l.m6651b(a0Var, this.f3857u, mo5312e2(!this.f3852N), mo5311d2(!this.f3852N), this, this.f3852N, this.f3839A);
    }

    /* renamed from: W1 */
    private int m6293W1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        return C1415l.m6652c(a0Var, this.f3857u, mo5312e2(!this.f3852N), mo5311d2(!this.f3852N), this, this.f3852N);
    }

    /* renamed from: X1 */
    private int m6294X1(int i) {
        if (i == 1) {
            return (this.f3859w != 1 && mo5318t2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3859w != 1 && mo5318t2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f3859w == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f3859w == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3859w == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f3859w == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: Y1 */
    private C1373d.C1374a m6295Y1(int i) {
        C1373d.C1374a aVar = new C1373d.C1374a();
        aVar.f3877c = new int[this.f3855s];
        for (int i2 = 0; i2 < this.f3855s; i2++) {
            aVar.f3877c[i2] = i - this.f3856t[i2].mo5366l(i);
        }
        return aVar;
    }

    /* renamed from: Z1 */
    private C1373d.C1374a m6296Z1(int i) {
        C1373d.C1374a aVar = new C1373d.C1374a();
        aVar.f3877c = new int[this.f3855s];
        for (int i2 = 0; i2 < this.f3855s; i2++) {
            aVar.f3877c[i2] = this.f3856t[i2].mo5370p(i) - i;
        }
        return aVar;
    }

    /* renamed from: a2 */
    private void m6297a2() {
        this.f3857u = C1410j.m6588b(this, this.f3859w);
        this.f3858v = C1410j.m6588b(this, 1 - this.f3859w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: b2 */
    private int m6298b2(RecyclerView.C1362v vVar, C1405f fVar, RecyclerView.C1330a0 a0Var) {
        int i;
        int i2;
        int i3;
        C1378f fVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        RecyclerView.C1362v vVar2 = vVar;
        C1405f fVar3 = fVar;
        ? r9 = 0;
        this.f3840B.set(0, this.f3855s, true);
        if (this.f3861y.f4022i) {
            i = fVar3.f4018e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            if (fVar3.f4018e == 1) {
                i12 = fVar3.f4020g + fVar3.f4015b;
            } else {
                i12 = fVar3.f4019f - fVar3.f4015b;
            }
            i = i12;
        }
        m6281K2(fVar3.f4018e, i);
        if (this.f3839A) {
            i2 = this.f3857u.mo5493i();
        } else {
            i2 = this.f3857u.mo5497m();
        }
        int i13 = i2;
        boolean z2 = false;
        while (fVar.mo5470a(a0Var) && (this.f3861y.f4022i || !this.f3840B.isEmpty())) {
            View b = fVar3.mo5471b(vVar2);
            C1372c cVar = (C1372c) b.getLayoutParams();
            int a = cVar.mo5213a();
            int g = this.f3843E.mo5333g(a);
            boolean z3 = g == -1;
            if (z3) {
                fVar2 = cVar.f3872f ? this.f3856t[r9] : m6307p2(fVar3);
                this.f3843E.mo5337n(a, fVar2);
            } else {
                fVar2 = this.f3856t[g];
            }
            C1378f fVar4 = fVar2;
            cVar.f3871e = fVar4;
            if (fVar3.f4018e == 1) {
                mo5163d(b);
            } else {
                mo5165e(b, r9);
            }
            m6310v2(b, cVar, r9);
            if (fVar3.f4018e == 1) {
                if (cVar.f3872f) {
                    i11 = m6303l2(i13);
                } else {
                    i11 = fVar4.mo5366l(i13);
                }
                int e = this.f3857u.mo5489e(b) + i11;
                if (z3 && cVar.f3872f) {
                    C1373d.C1374a Y1 = m6295Y1(i11);
                    Y1.f3876b = -1;
                    Y1.f3875a = a;
                    this.f3843E.mo5327a(Y1);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (cVar.f3872f) {
                    i10 = m6306o2(i13);
                } else {
                    i10 = fVar4.mo5370p(i13);
                }
                i5 = i10 - this.f3857u.mo5489e(b);
                if (z3 && cVar.f3872f) {
                    C1373d.C1374a Z1 = m6296Z1(i10);
                    Z1.f3876b = 1;
                    Z1.f3875a = a;
                    this.f3843E.mo5327a(Z1);
                }
                i4 = i10;
            }
            if (cVar.f3872f && fVar3.f4017d == -1) {
                if (z3) {
                    this.f3851M = true;
                } else {
                    if (fVar3.f4018e == 1) {
                        z = mo5307O1();
                    } else {
                        z = mo5308P1();
                    }
                    if (!z) {
                        C1373d.C1374a f = this.f3843E.mo5332f(a);
                        if (f != null) {
                            f.f3878d = true;
                        }
                        this.f3851M = true;
                    }
                }
            }
            m6286Q1(b, cVar, fVar3);
            if (!mo5318t2() || this.f3859w != 1) {
                if (cVar.f3872f) {
                    i8 = this.f3858v.mo5497m();
                } else {
                    i8 = (fVar4.f3893e * this.f3860x) + this.f3858v.mo5497m();
                }
                i7 = i8;
                i6 = this.f3858v.mo5489e(b) + i8;
            } else {
                if (cVar.f3872f) {
                    i9 = this.f3858v.mo5493i();
                } else {
                    i9 = this.f3858v.mo5493i() - (((this.f3855s - 1) - fVar4.f3893e) * this.f3860x);
                }
                i6 = i9;
                i7 = i9 - this.f3858v.mo5489e(b);
            }
            if (this.f3859w == 1) {
                mo5205z0(b, i7, i5, i6, i4);
            } else {
                mo5205z0(b, i5, i7, i4, i6);
            }
            if (cVar.f3872f) {
                m6281K2(this.f3861y.f4018e, i);
            } else {
                m6287Q2(fVar4, this.f3861y.f4018e, i);
            }
            m6275A2(vVar2, this.f3861y);
            if (this.f3861y.f4021h && b.hasFocusable()) {
                if (cVar.f3872f) {
                    this.f3840B.clear();
                } else {
                    this.f3840B.set(fVar4.f3893e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m6275A2(vVar2, this.f3861y);
        }
        if (this.f3861y.f4018e == -1) {
            i3 = this.f3857u.mo5497m() - m6306o2(this.f3857u.mo5497m());
        } else {
            i3 = m6303l2(this.f3857u.mo5493i()) - this.f3857u.mo5493i();
        }
        if (i3 > 0) {
            return Math.min(fVar3.f4015b, i3);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m6299c2(int i) {
        int J = mo5133J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = mo5173h0(mo5132I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m6300g2(int i) {
        for (int J = mo5133J() - 1; J >= 0; J--) {
            int h0 = mo5173h0(mo5132I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m6301h2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, boolean z) {
        int i;
        int l2 = m6303l2(RecyclerView.UNDEFINED_DURATION);
        if (l2 != Integer.MIN_VALUE && (i = this.f3857u.mo5493i() - l2) > 0) {
            int i2 = i - (-mo5301F2(-i, vVar, a0Var));
            if (z && i2 > 0) {
                this.f3857u.mo5502r(i2);
            }
        }
    }

    /* renamed from: i2 */
    private void m6302i2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, boolean z) {
        int m;
        int o2 = m6306o2(Integer.MAX_VALUE);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.f3857u.mo5497m()) > 0) {
            int F2 = m - mo5301F2(m, vVar, a0Var);
            if (z && F2 > 0) {
                this.f3857u.mo5502r(-F2);
            }
        }
    }

    /* renamed from: l2 */
    private int m6303l2(int i) {
        int l = this.f3856t[0].mo5366l(i);
        for (int i2 = 1; i2 < this.f3855s; i2++) {
            int l2 = this.f3856t[i2].mo5366l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: m2 */
    private int m6304m2(int i) {
        int p = this.f3856t[0].mo5370p(i);
        for (int i2 = 1; i2 < this.f3855s; i2++) {
            int p2 = this.f3856t[i2].mo5370p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: n2 */
    private int m6305n2(int i) {
        int l = this.f3856t[0].mo5366l(i);
        for (int i2 = 1; i2 < this.f3855s; i2++) {
            int l2 = this.f3856t[i2].mo5366l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: o2 */
    private int m6306o2(int i) {
        int p = this.f3856t[0].mo5370p(i);
        for (int i2 = 1; i2 < this.f3855s; i2++) {
            int p2 = this.f3856t[i2].mo5370p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: p2 */
    private C1378f m6307p2(C1405f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m6312x2(fVar.f4018e)) {
            i2 = this.f3855s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3855s;
            i = 1;
        }
        C1378f fVar2 = null;
        if (fVar.f4018e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f3857u.mo5497m();
            while (i2 != i3) {
                C1378f fVar3 = this.f3856t[i2];
                int l = fVar3.mo5366l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int i6 = this.f3857u.mo5493i();
        while (i2 != i3) {
            C1378f fVar4 = this.f3856t[i2];
            int p = fVar4.mo5370p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6308q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3839A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5315k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5314j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3843E
            r4.mo5334h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3843E
            r9.mo5336k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3843E
            r7.mo5335j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3843E
            r9.mo5336k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3843E
            r9.mo5335j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3839A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5314j2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5315k2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo5196t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6308q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m6309u2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5177j(view, this.f3849K);
        C1372c cVar = (C1372c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f3849K;
        int R2 = m6289R2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f3849K;
        int R22 = m6289R2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo5131H1(view, R2, R22, cVar);
        } else {
            z2 = mo5126F1(view, R2, R22, cVar);
        }
        if (z2) {
            view.measure(R2, R22);
        }
    }

    /* renamed from: v2 */
    private void m6310v2(View view, C1372c cVar, boolean z) {
        if (cVar.f3872f) {
            if (this.f3859w == 1) {
                m6309u2(view, this.f3848J, RecyclerView.C1350o.m6030K(mo5151W(), mo5152X(), mo5170g0() + mo5164d0(), cVar.height, true), z);
            } else {
                m6309u2(view, RecyclerView.C1350o.m6030K(mo5187o0(), mo5189p0(), mo5166e0() + mo5168f0(), cVar.width, true), this.f3848J, z);
            }
        } else if (this.f3859w == 1) {
            m6309u2(view, RecyclerView.C1350o.m6030K(this.f3860x, mo5189p0(), 0, cVar.width, false), RecyclerView.C1350o.m6030K(mo5151W(), mo5152X(), mo5170g0() + mo5164d0(), cVar.height, true), z);
        } else {
            m6309u2(view, RecyclerView.C1350o.m6030K(mo5187o0(), mo5189p0(), mo5166e0() + mo5168f0(), cVar.width, true), RecyclerView.C1350o.m6030K(this.f3860x, mo5152X(), 0, cVar.height, false), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo5310S1() != false) goto L_0x015b;
     */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6311w2(androidx.recyclerview.widget.RecyclerView.C1362v r9, androidx.recyclerview.widget.RecyclerView.C1330a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3850L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3847I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3841C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4982b()
            if (r1 != 0) goto L_0x0018
            r8.mo5180k1(r9)
            r0.mo5323c()
            return
        L_0x0018:
            boolean r1 = r0.f3868e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3841C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3847I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5323c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3847I
            if (r5 == 0) goto L_0x0037
            r8.m6284N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m6279E2()
            boolean r5 = r8.f3839A
            r0.f3866c = r5
        L_0x003e:
            r8.mo5306N2(r10, r0)
            r0.f3868e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3847I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3841C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3866c
            boolean r6 = r8.f3845G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5318t2()
            boolean r6 = r8.f3846H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f3843E
            r5.mo5328b()
            r0.f3867d = r4
        L_0x0060:
            int r5 = r8.mo5133J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3847I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3881c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3867d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3855s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3856t
            r5 = r5[r1]
            r5.mo5359e()
            int r5 = r0.f3865b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3856t
            r6 = r6[r1]
            r6.mo5376v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3850L
            int[] r1 = r1.f3869f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3855s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3856t
            r5 = r5[r1]
            r5.mo5359e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3850L
            int[] r6 = r6.f3869f
            r6 = r6[r1]
            r5.mo5376v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3855s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3856t
            r5 = r5[r1]
            boolean r6 = r8.f3839A
            int r7 = r0.f3865b
            r5.mo5356b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3850L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3856t
            r1.mo5324d(r5)
        L_0x00c9:
            r8.mo5200w(r9)
            androidx.recyclerview.widget.f r1 = r8.f3861y
            r1.f4014a = r3
            r8.f3851M = r3
            androidx.recyclerview.widget.j r1 = r8.f3858v
            int r1 = r1.mo5498n()
            r8.mo5309P2(r1)
            int r1 = r0.f3864a
            r8.m6285O2(r1, r10)
            boolean r1 = r0.f3866c
            if (r1 == 0) goto L_0x00fc
            r8.m6280G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f3861y
            r8.m6298b2(r9, r1, r10)
            r8.m6280G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f3861y
            int r2 = r0.f3864a
            int r5 = r1.f4017d
            int r2 = r2 + r5
            r1.f4016c = r2
            r8.m6298b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m6280G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f3861y
            r8.m6298b2(r9, r1, r10)
            r8.m6280G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f3861y
            int r2 = r0.f3864a
            int r5 = r1.f4017d
            int r2 = r2 + r5
            r1.f4016c = r2
            r8.m6298b2(r9, r1, r10)
        L_0x0113:
            r8.m6278D2()
            int r1 = r8.mo5133J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f3839A
            if (r1 == 0) goto L_0x0127
            r8.m6301h2(r9, r10, r4)
            r8.m6302i2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m6302i2(r9, r10, r4)
            r8.m6301h2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo4985e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f3844F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo5133J()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f3851M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo5316r2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f3854P
            r8.mo5188o1(r11)
            boolean r11 = r8.mo5310S1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo4985e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3850L
            r11.mo5323c()
        L_0x0166:
            boolean r11 = r0.f3866c
            r8.f3845G = r11
            boolean r11 = r8.mo5318t2()
            r8.f3846H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3850L
            r11.mo5323c()
            r8.m6311w2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6311w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m6312x2(int i) {
        if (this.f3859w == 0) {
            if ((i == -1) != this.f3839A) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f3839A) == mo5318t2()) {
            return true;
        }
        return false;
    }

    /* renamed from: z2 */
    private void m6313z2(View view) {
        for (int i = this.f3855s - 1; i >= 0; i--) {
            this.f3856t[i].mo5375u(view);
        }
    }

    /* renamed from: C0 */
    public void mo5120C0(int i) {
        super.mo5120C0(i);
        for (int i2 = 0; i2 < this.f3855s; i2++) {
            this.f3856t[i2].mo5372r(i);
        }
    }

    /* renamed from: C1 */
    public void mo4695C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = mo5166e0() + mo5168f0();
        int g0 = mo5170g0() + mo5164d0();
        if (this.f3859w == 1) {
            i4 = RecyclerView.C1350o.m6034n(i2, rect.height() + g0, mo5159b0());
            i3 = RecyclerView.C1350o.m6034n(i, (this.f3860x * this.f3855s) + e0, mo5162c0());
        } else {
            i3 = RecyclerView.C1350o.m6034n(i, rect.width() + e0, mo5162c0());
            i4 = RecyclerView.C1350o.m6034n(i2, (this.f3860x * this.f3855s) + g0, mo5159b0());
        }
        mo5119B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C1355p mo4696D() {
        if (this.f3859w == 0) {
            return new C1372c(-2, -1);
        }
        return new C1372c(-1, -2);
    }

    /* renamed from: D0 */
    public void mo5121D0(int i) {
        super.mo5121D0(i);
        for (int i2 = 0; i2 < this.f3855s; i2++) {
            this.f3856t[i2].mo5372r(i);
        }
    }

    /* renamed from: E */
    public RecyclerView.C1355p mo4697E(Context context, AttributeSet attributeSet) {
        return new C1372c(context, attributeSet);
    }

    /* renamed from: F */
    public RecyclerView.C1355p mo4699F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1372c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1372c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public int mo5301F2(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0 || i == 0) {
            return 0;
        }
        mo5319y2(i, a0Var);
        int b2 = m6298b2(vVar, this.f3861y, a0Var);
        if (this.f3861y.f4015b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.f3857u.mo5502r(-i);
        this.f3845G = this.f3839A;
        C1405f fVar = this.f3861y;
        fVar.f4015b = 0;
        m6275A2(vVar, fVar);
        return i;
    }

    /* renamed from: H2 */
    public void mo5302H2(int i) {
        if (i == 0 || i == 1) {
            mo4757g((String) null);
            if (i != this.f3859w) {
                this.f3859w = i;
                C1410j jVar = this.f3857u;
                this.f3857u = this.f3858v;
                this.f3858v = jVar;
                mo5196t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: I0 */
    public void mo4740I0(RecyclerView recyclerView, RecyclerView.C1362v vVar) {
        super.mo4740I0(recyclerView, vVar);
        mo5188o1(this.f3854P);
        for (int i = 0; i < this.f3855s; i++) {
            this.f3856t[i].mo5359e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: I1 */
    public void mo4741I1(RecyclerView recyclerView, RecyclerView.C1330a0 a0Var, int i) {
        C1406g gVar = new C1406g(recyclerView.getContext());
        gVar.mo5294p(i);
        mo5134J1(gVar);
    }

    /* renamed from: I2 */
    public void mo5303I2(boolean z) {
        mo4757g((String) null);
        C1376e eVar = this.f3847I;
        if (!(eVar == null || eVar.f3886h == z)) {
            eVar.f3886h = z;
        }
        this.f3862z = z;
        mo5196t1();
    }

    /* renamed from: J0 */
    public View mo4700J0(View view, int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        View B;
        int i2;
        int i3;
        int i4;
        int i5;
        View m;
        if (mo5133J() == 0 || (B = mo5117B(view)) == null) {
            return null;
        }
        m6279E2();
        int X1 = m6294X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        C1372c cVar = (C1372c) B.getLayoutParams();
        boolean z = cVar.f3872f;
        C1378f fVar = cVar.f3871e;
        if (X1 == 1) {
            i2 = mo5315k2();
        } else {
            i2 = mo5314j2();
        }
        m6285O2(i2, a0Var);
        m6280G2(X1);
        C1405f fVar2 = this.f3861y;
        fVar2.f4016c = fVar2.f4017d + i2;
        fVar2.f4015b = (int) (((float) this.f3857u.mo5498n()) * 0.33333334f);
        C1405f fVar3 = this.f3861y;
        fVar3.f4021h = true;
        fVar3.f4014a = false;
        m6298b2(vVar, fVar3, a0Var);
        this.f3845G = this.f3839A;
        if (!z && (m = fVar.mo5367m(i2, X1)) != null && m != B) {
            return m;
        }
        if (m6312x2(X1)) {
            for (int i6 = this.f3855s - 1; i6 >= 0; i6--) {
                View m2 = this.f3856t[i6].mo5367m(i2, X1);
                if (m2 != null && m2 != B) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f3855s; i7++) {
                View m3 = this.f3856t[i7].mo5367m(i2, X1);
                if (m3 != null && m3 != B) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f3862z ^ true) == (X1 == -1);
        if (!z) {
            if (z2) {
                i5 = fVar.mo5360f();
            } else {
                i5 = fVar.mo5361g();
            }
            View C = mo4736C(i5);
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m6312x2(X1)) {
            for (int i8 = this.f3855s - 1; i8 >= 0; i8--) {
                if (i8 != fVar.f3893e) {
                    if (z2) {
                        i4 = this.f3856t[i8].mo5360f();
                    } else {
                        i4 = this.f3856t[i8].mo5361g();
                    }
                    View C2 = mo4736C(i4);
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f3855s; i9++) {
                if (z2) {
                    i3 = this.f3856t[i9].mo5360f();
                } else {
                    i3 = this.f3856t[i9].mo5361g();
                }
                View C3 = mo4736C(i3);
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* renamed from: J2 */
    public void mo5304J2(int i) {
        mo4757g((String) null);
        if (i != this.f3855s) {
            mo5317s2();
            this.f3855s = i;
            this.f3840B = new BitSet(this.f3855s);
            this.f3856t = new C1378f[this.f3855s];
            for (int i2 = 0; i2 < this.f3855s; i2++) {
                this.f3856t[i2] = new C1378f(i2);
            }
            mo5196t1();
        }
    }

    /* renamed from: K0 */
    public void mo4742K0(AccessibilityEvent accessibilityEvent) {
        super.mo4742K0(accessibilityEvent);
        if (mo5133J() > 0) {
            View e2 = mo5312e2(false);
            View d2 = mo5311d2(false);
            if (e2 != null && d2 != null) {
                int h0 = mo5173h0(e2);
                int h02 = mo5173h0(d2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    /* renamed from: L1 */
    public boolean mo4701L1() {
        return this.f3847I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo5305M2(RecyclerView.C1330a0 a0Var, C1371b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo4985e() && (i = this.f3841C) != -1) {
            if (i < 0 || i >= a0Var.mo4982b()) {
                this.f3841C = -1;
                this.f3842D = RecyclerView.UNDEFINED_DURATION;
            } else {
                C1376e eVar = this.f3847I;
                if (eVar == null || eVar.f3879a == -1 || eVar.f3881c < 1) {
                    View C = mo4736C(this.f3841C);
                    if (C != null) {
                        if (this.f3839A) {
                            i2 = mo5315k2();
                        } else {
                            i2 = mo5314j2();
                        }
                        bVar.f3864a = i2;
                        if (this.f3842D != Integer.MIN_VALUE) {
                            if (bVar.f3866c) {
                                bVar.f3865b = (this.f3857u.mo5493i() - this.f3842D) - this.f3857u.mo5488d(C);
                            } else {
                                bVar.f3865b = (this.f3857u.mo5497m() + this.f3842D) - this.f3857u.mo5491g(C);
                            }
                            return true;
                        } else if (this.f3857u.mo5489e(C) > this.f3857u.mo5498n()) {
                            if (bVar.f3866c) {
                                i3 = this.f3857u.mo5493i();
                            } else {
                                i3 = this.f3857u.mo5497m();
                            }
                            bVar.f3865b = i3;
                            return true;
                        } else {
                            int g = this.f3857u.mo5491g(C) - this.f3857u.mo5497m();
                            if (g < 0) {
                                bVar.f3865b = -g;
                                return true;
                            }
                            int i4 = this.f3857u.mo5493i() - this.f3857u.mo5488d(C);
                            if (i4 < 0) {
                                bVar.f3865b = i4;
                                return true;
                            }
                            bVar.f3865b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i5 = this.f3841C;
                        bVar.f3864a = i5;
                        int i6 = this.f3842D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m6288R1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3866c = z;
                            bVar.mo5321a();
                        } else {
                            bVar.mo5322b(i6);
                        }
                        bVar.f3867d = true;
                    }
                } else {
                    bVar.f3865b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f3864a = this.f3841C;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public int mo4702N(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3859w == 1) {
            return this.f3855s;
        }
        return super.mo4702N(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public void mo5306N2(RecyclerView.C1330a0 a0Var, C1371b bVar) {
        if (!mo5305M2(a0Var, bVar) && !m6282L2(a0Var, bVar)) {
            bVar.mo5321a();
            bVar.f3864a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo5307O1() {
        int l = this.f3856t[0].mo5366l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3855s; i++) {
            if (this.f3856t[i].mo5366l(RecyclerView.UNDEFINED_DURATION) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public void mo4704P0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, View view, C0862c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1372c)) {
            super.mo5141O0(view, cVar);
            return;
        }
        C1372c cVar2 = (C1372c) layoutParams;
        if (this.f3859w == 0) {
            cVar.mo3297a0(C0862c.C0865c.m4000a(cVar2.mo5325e(), cVar2.f3872f ? this.f3855s : 1, -1, -1, false, false));
        } else {
            cVar.mo3297a0(C0862c.C0865c.m4000a(-1, -1, cVar2.mo5325e(), cVar2.f3872f ? this.f3855s : 1, false, false));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo5308P1() {
        int p = this.f3856t[0].mo5370p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3855s; i++) {
            if (this.f3856t[i].mo5370p(RecyclerView.UNDEFINED_DURATION) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public void mo5309P2(int i) {
        this.f3860x = i / this.f3855s;
        this.f3848J = View.MeasureSpec.makeMeasureSpec(i, this.f3858v.mo5495k());
    }

    /* renamed from: R0 */
    public void mo4705R0(RecyclerView recyclerView, int i, int i2) {
        m6308q2(i, i2, 1);
    }

    /* renamed from: S0 */
    public void mo4706S0(RecyclerView recyclerView) {
        this.f3843E.mo5328b();
        mo5196t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public boolean mo5310S1() {
        int i;
        int i2;
        if (mo5133J() == 0 || this.f3844F == 0 || !mo5193r0()) {
            return false;
        }
        if (this.f3839A) {
            i2 = mo5315k2();
            i = mo5314j2();
        } else {
            i2 = mo5314j2();
            i = mo5315k2();
        }
        if (i2 == 0 && mo5316r2() != null) {
            this.f3843E.mo5328b();
            mo5198u1();
            mo5196t1();
            return true;
        } else if (!this.f3851M) {
            return false;
        } else {
            int i3 = this.f3839A ? -1 : 1;
            int i4 = i + 1;
            C1373d.C1374a e = this.f3843E.mo5331e(i2, i4, i3, true);
            if (e == null) {
                this.f3851M = false;
                this.f3843E.mo5330d(i4);
                return false;
            }
            C1373d.C1374a e2 = this.f3843E.mo5331e(i2, e.f3875a, i3 * -1, true);
            if (e2 == null) {
                this.f3843E.mo5330d(e.f3875a);
            } else {
                this.f3843E.mo5330d(e2.f3875a + 1);
            }
            mo5198u1();
            mo5196t1();
            return true;
        }
    }

    /* renamed from: T0 */
    public void mo4707T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m6308q2(i, i2, 8);
    }

    /* renamed from: U0 */
    public void mo4708U0(RecyclerView recyclerView, int i, int i2) {
        m6308q2(i, i2, 2);
    }

    /* renamed from: W0 */
    public void mo4709W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m6308q2(i, i2, 4);
    }

    /* renamed from: X0 */
    public void mo4711X0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        m6311w2(vVar, a0Var, true);
    }

    /* renamed from: Y0 */
    public void mo4713Y0(RecyclerView.C1330a0 a0Var) {
        super.mo4713Y0(a0Var);
        this.f3841C = -1;
        this.f3842D = RecyclerView.UNDEFINED_DURATION;
        this.f3847I = null;
        this.f3850L.mo5323c();
    }

    /* renamed from: a */
    public PointF mo4751a(int i) {
        int R1 = m6288R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f3859w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    /* renamed from: c1 */
    public void mo4752c1(Parcelable parcelable) {
        if (parcelable instanceof C1376e) {
            this.f3847I = (C1376e) parcelable;
            mo5196t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo4754d1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f3847I != null) {
            return new C1376e(this.f3847I);
        }
        C1376e eVar = new C1376e();
        eVar.f3886h = this.f3862z;
        eVar.f3887i = this.f3845G;
        eVar.f3888r = this.f3846H;
        C1373d dVar = this.f3843E;
        if (dVar == null || (iArr = dVar.f3873a) == null) {
            eVar.f3883e = 0;
        } else {
            eVar.f3884f = iArr;
            eVar.f3883e = iArr.length;
            eVar.f3885g = dVar.f3874b;
        }
        if (mo5133J() > 0) {
            if (this.f3845G) {
                i = mo5315k2();
            } else {
                i = mo5314j2();
            }
            eVar.f3879a = i;
            eVar.f3880b = mo5313f2();
            int i4 = this.f3855s;
            eVar.f3881c = i4;
            eVar.f3882d = new int[i4];
            for (int i5 = 0; i5 < this.f3855s; i5++) {
                if (this.f3845G) {
                    i2 = this.f3856t[i5].mo5366l(RecyclerView.UNDEFINED_DURATION);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f3857u.mo5493i();
                    } else {
                        eVar.f3882d[i5] = i2;
                    }
                } else {
                    i2 = this.f3856t[i5].mo5370p(RecyclerView.UNDEFINED_DURATION);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f3857u.mo5497m();
                    } else {
                        eVar.f3882d[i5] = i2;
                    }
                }
                i2 -= i3;
                eVar.f3882d[i5] = i2;
            }
        } else {
            eVar.f3879a = -1;
            eVar.f3880b = -1;
            eVar.f3881c = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo5311d2(boolean z) {
        int m = this.f3857u.mo5497m();
        int i = this.f3857u.mo5493i();
        View view = null;
        for (int J = mo5133J() - 1; J >= 0; J--) {
            View I = mo5132I(J);
            int g = this.f3857u.mo5491g(I);
            int d = this.f3857u.mo5488d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: e1 */
    public void mo5167e1(int i) {
        if (i == 0) {
            mo5310S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo5312e2(boolean z) {
        int m = this.f3857u.mo5497m();
        int i = this.f3857u.mo5493i();
        int J = mo5133J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo5132I(i2);
            int g = this.f3857u.mo5491g(I);
            if (this.f3857u.mo5488d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo5313f2() {
        View view;
        if (this.f3839A) {
            view = mo5311d2(true);
        } else {
            view = mo5312e2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo5173h0(view);
    }

    /* renamed from: g */
    public void mo4757g(String str) {
        if (this.f3847I == null) {
            super.mo4757g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public int mo5314j2() {
        if (mo5133J() == 0) {
            return 0;
        }
        return mo5173h0(mo5132I(0));
    }

    /* renamed from: k */
    public boolean mo4758k() {
        return this.f3859w == 0;
    }

    /* renamed from: k0 */
    public int mo4716k0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3859w == 0) {
            return this.f3855s;
        }
        return super.mo4716k0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public int mo5315k2() {
        int J = mo5133J();
        if (J == 0) {
            return 0;
        }
        return mo5173h0(mo5132I(J - 1));
    }

    /* renamed from: l */
    public boolean mo4759l() {
        return this.f3859w == 1;
    }

    /* renamed from: m */
    public boolean mo4717m(RecyclerView.C1355p pVar) {
        return pVar instanceof C1372c;
    }

    /* renamed from: o */
    public void mo4760o(int i, int i2, RecyclerView.C1330a0 a0Var, RecyclerView.C1350o.C1353c cVar) {
        int i3;
        int i4;
        if (this.f3859w != 0) {
            i = i2;
        }
        if (mo5133J() != 0 && i != 0) {
            mo5319y2(i, a0Var);
            int[] iArr = this.f3853O;
            if (iArr == null || iArr.length < this.f3855s) {
                this.f3853O = new int[this.f3855s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3855s; i6++) {
                C1405f fVar = this.f3861y;
                if (fVar.f4017d == -1) {
                    i4 = fVar.f4019f;
                    i3 = this.f3856t[i6].mo5370p(i4);
                } else {
                    i4 = this.f3856t[i6].mo5366l(fVar.f4020g);
                    i3 = this.f3861y.f4020g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3853O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3853O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3861y.mo5470a(a0Var); i8++) {
                cVar.mo5212a(this.f3861y.f4016c, this.f3853O[i8]);
                C1405f fVar2 = this.f3861y;
                fVar2.f4016c += fVar2.f4017d;
            }
        }
    }

    /* renamed from: q */
    public int mo4764q(RecyclerView.C1330a0 a0Var) {
        return m6291U1(a0Var);
    }

    /* renamed from: r */
    public int mo4718r(RecyclerView.C1330a0 a0Var) {
        return m6292V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5316r2() {
        /*
            r12 = this;
            int r0 = r12.mo5133J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3855s
            r2.<init>(r3)
            int r3 = r12.f3855s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3859w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5318t2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3839A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo5132I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1372c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3871e
            int r9 = r9.f3893e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3871e
            boolean r9 = r12.m6290T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3871e
            int r9 = r9.f3893e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3872f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo5132I(r9)
            boolean r10 = r12.f3839A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.j r10 = r12.f3857u
            int r10 = r10.mo5488d(r7)
            androidx.recyclerview.widget.j r11 = r12.f3857u
            int r11 = r11.mo5488d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.j r10 = r12.f3857u
            int r10 = r10.mo5491g(r7)
            androidx.recyclerview.widget.j r11 = r12.f3857u
            int r11 = r11.mo5491g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1372c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3871e
            int r8 = r8.f3893e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3871e
            int r9 = r9.f3893e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5316r2():android.view.View");
    }

    /* renamed from: s */
    public int mo4719s(RecyclerView.C1330a0 a0Var) {
        return m6293W1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4767s0() {
        return this.f3844F != 0;
    }

    /* renamed from: s2 */
    public void mo5317s2() {
        this.f3843E.mo5328b();
        mo5196t1();
    }

    /* renamed from: t */
    public int mo4768t(RecyclerView.C1330a0 a0Var) {
        return m6291U1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public boolean mo5318t2() {
        return mo5154Z() == 1;
    }

    /* renamed from: u */
    public int mo4721u(RecyclerView.C1330a0 a0Var) {
        return m6292V1(a0Var);
    }

    /* renamed from: v */
    public int mo4723v(RecyclerView.C1330a0 a0Var) {
        return m6293W1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4724w1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        return mo5301F2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4769x1(int i) {
        C1376e eVar = this.f3847I;
        if (!(eVar == null || eVar.f3879a == i)) {
            eVar.mo5347a();
        }
        this.f3841C = i;
        this.f3842D = RecyclerView.UNDEFINED_DURATION;
        mo5196t1();
    }

    /* renamed from: y1 */
    public int mo4725y1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        return mo5301F2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo5319y2(int i, RecyclerView.C1330a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5315k2();
            i2 = 1;
        } else {
            i3 = mo5314j2();
            i2 = -1;
        }
        this.f3861y.f4014a = true;
        m6285O2(i3, a0Var);
        m6280G2(i2);
        C1405f fVar = this.f3861y;
        fVar.f4016c = i3 + fVar.f4017d;
        fVar.f4015b = Math.abs(i);
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C1373d {

        /* renamed from: a */
        int[] f3873a;

        /* renamed from: b */
        List<C1374a> f3874b;

        C1373d() {
        }

        /* renamed from: i */
        private int m6379i(int i) {
            if (this.f3874b == null) {
                return -1;
            }
            C1374a f = mo5332f(i);
            if (f != null) {
                this.f3874b.remove(f);
            }
            int size = this.f3874b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3874b.get(i2).f3875a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3874b.remove(i2);
            return this.f3874b.get(i2).f3875a;
        }

        /* renamed from: l */
        private void m6380l(int i, int i2) {
            List<C1374a> list = this.f3874b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1374a aVar = this.f3874b.get(size);
                    int i3 = aVar.f3875a;
                    if (i3 >= i) {
                        aVar.f3875a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m6381m(int i, int i2) {
            List<C1374a> list = this.f3874b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1374a aVar = this.f3874b.get(size);
                    int i4 = aVar.f3875a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3874b.remove(size);
                        } else {
                            aVar.f3875a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5327a(C1374a aVar) {
            if (this.f3874b == null) {
                this.f3874b = new ArrayList();
            }
            int size = this.f3874b.size();
            for (int i = 0; i < size; i++) {
                C1374a aVar2 = this.f3874b.get(i);
                if (aVar2.f3875a == aVar.f3875a) {
                    this.f3874b.remove(i);
                }
                if (aVar2.f3875a >= aVar.f3875a) {
                    this.f3874b.add(i, aVar);
                    return;
                }
            }
            this.f3874b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5328b() {
            int[] iArr = this.f3873a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3874b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5329c(int i) {
            int[] iArr = this.f3873a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3873a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo5338o(i)];
                this.f3873a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3873a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5330d(int i) {
            List<C1374a> list = this.f3874b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3874b.get(size).f3875a >= i) {
                        this.f3874b.remove(size);
                    }
                }
            }
            return mo5334h(i);
        }

        /* renamed from: e */
        public C1374a mo5331e(int i, int i2, int i3, boolean z) {
            List<C1374a> list = this.f3874b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1374a aVar = this.f3874b.get(i4);
                int i5 = aVar.f3875a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3876b == i3 || (z && aVar.f3878d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1374a mo5332f(int i) {
            List<C1374a> list = this.f3874b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1374a aVar = this.f3874b.get(size);
                if (aVar.f3875a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo5333g(int i) {
            int[] iArr = this.f3873a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5334h(int i) {
            int[] iArr = this.f3873a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m6379i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3873a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3873a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f3873a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5335j(int i, int i2) {
            int[] iArr = this.f3873a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5329c(i3);
                int[] iArr2 = this.f3873a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3873a, i, i3, -1);
                m6380l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5336k(int i, int i2) {
            int[] iArr = this.f3873a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5329c(i3);
                int[] iArr2 = this.f3873a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3873a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m6381m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5337n(int i, C1378f fVar) {
            mo5329c(i);
            this.f3873a[i] = fVar.f3893e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5338o(int i) {
            int length = this.f3873a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C1374a implements Parcelable {
            public static final Parcelable.Creator<C1374a> CREATOR = new C1375a();

            /* renamed from: a */
            int f3875a;

            /* renamed from: b */
            int f3876b;

            /* renamed from: c */
            int[] f3877c;

            /* renamed from: d */
            boolean f3878d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C1375a implements Parcelable.Creator<C1374a> {
                C1375a() {
                }

                /* renamed from: a */
                public C1374a createFromParcel(Parcel parcel) {
                    return new C1374a(parcel);
                }

                /* renamed from: b */
                public C1374a[] newArray(int i) {
                    return new C1374a[i];
                }
            }

            C1374a(Parcel parcel) {
                this.f3875a = parcel.readInt();
                this.f3876b = parcel.readInt();
                this.f3878d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3877c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo5339a(int i) {
                int[] iArr = this.f3877c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3875a + ", mGapDir=" + this.f3876b + ", mHasUnwantedGapAfter=" + this.f3878d + ", mGapPerSpan=" + Arrays.toString(this.f3877c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3875a);
                parcel.writeInt(this.f3876b);
                parcel.writeInt(this.f3878d ? 1 : 0);
                int[] iArr = this.f3877c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3877c);
            }

            C1374a() {
            }
        }
    }
}
