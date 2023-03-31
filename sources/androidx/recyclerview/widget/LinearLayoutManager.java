package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1350o implements RecyclerView.C1367z.C1369b {

    /* renamed from: A */
    int f3678A = -1;

    /* renamed from: B */
    int f3679B = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C */
    private boolean f3680C;

    /* renamed from: D */
    C1327d f3681D = null;

    /* renamed from: E */
    final C1324a f3682E = new C1324a();

    /* renamed from: F */
    private final C1325b f3683F = new C1325b();

    /* renamed from: G */
    private int f3684G = 2;

    /* renamed from: H */
    private int[] f3685H = new int[2];

    /* renamed from: s */
    int f3686s = 1;

    /* renamed from: t */
    private C1326c f3687t;

    /* renamed from: u */
    C1410j f3688u;

    /* renamed from: v */
    private boolean f3689v;

    /* renamed from: w */
    private boolean f3690w = false;

    /* renamed from: x */
    boolean f3691x = false;

    /* renamed from: y */
    private boolean f3692y = false;

    /* renamed from: z */
    private boolean f3693z = true;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1324a {

        /* renamed from: a */
        C1410j f3694a;

        /* renamed from: b */
        int f3695b;

        /* renamed from: c */
        int f3696c;

        /* renamed from: d */
        boolean f3697d;

        /* renamed from: e */
        boolean f3698e;

        C1324a() {
            mo4775e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4771a() {
            int i;
            if (this.f3697d) {
                i = this.f3694a.mo5493i();
            } else {
                i = this.f3694a.mo5497m();
            }
            this.f3696c = i;
        }

        /* renamed from: b */
        public void mo4772b(View view, int i) {
            if (this.f3697d) {
                this.f3696c = this.f3694a.mo5488d(view) + this.f3694a.mo5499o();
            } else {
                this.f3696c = this.f3694a.mo5491g(view);
            }
            this.f3695b = i;
        }

        /* renamed from: c */
        public void mo4773c(View view, int i) {
            int o = this.f3694a.mo5499o();
            if (o >= 0) {
                mo4772b(view, i);
                return;
            }
            this.f3695b = i;
            if (this.f3697d) {
                int i2 = (this.f3694a.mo5493i() - o) - this.f3694a.mo5488d(view);
                this.f3696c = this.f3694a.mo5493i() - i2;
                if (i2 > 0) {
                    int e = this.f3696c - this.f3694a.mo5489e(view);
                    int m = this.f3694a.mo5497m();
                    int min = e - (m + Math.min(this.f3694a.mo5491g(view) - m, 0));
                    if (min < 0) {
                        this.f3696c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3694a.mo5491g(view);
            int m2 = g - this.f3694a.mo5497m();
            this.f3696c = g;
            if (m2 > 0) {
                int i3 = (this.f3694a.mo5493i() - Math.min(0, (this.f3694a.mo5493i() - o) - this.f3694a.mo5488d(view))) - (g + this.f3694a.mo5489e(view));
                if (i3 < 0) {
                    this.f3696c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4774d(View view, RecyclerView.C1330a0 a0Var) {
            RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
            return !pVar.mo5215c() && pVar.mo5213a() >= 0 && pVar.mo5213a() < a0Var.mo4982b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4775e() {
            this.f3695b = -1;
            this.f3696c = RecyclerView.UNDEFINED_DURATION;
            this.f3697d = false;
            this.f3698e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3695b + ", mCoordinate=" + this.f3696c + ", mLayoutFromEnd=" + this.f3697d + ", mValid=" + this.f3698e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1325b {

        /* renamed from: a */
        public int f3699a;

        /* renamed from: b */
        public boolean f3700b;

        /* renamed from: c */
        public boolean f3701c;

        /* renamed from: d */
        public boolean f3702d;

        protected C1325b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4777a() {
            this.f3699a = 0;
            this.f3700b = false;
            this.f3701c = false;
            this.f3702d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1326c {

        /* renamed from: a */
        boolean f3703a = true;

        /* renamed from: b */
        int f3704b;

        /* renamed from: c */
        int f3705c;

        /* renamed from: d */
        int f3706d;

        /* renamed from: e */
        int f3707e;

        /* renamed from: f */
        int f3708f;

        /* renamed from: g */
        int f3709g;

        /* renamed from: h */
        int f3710h = 0;

        /* renamed from: i */
        int f3711i = 0;

        /* renamed from: j */
        boolean f3712j = false;

        /* renamed from: k */
        int f3713k;

        /* renamed from: l */
        List<RecyclerView.C1336d0> f3714l = null;

        /* renamed from: m */
        boolean f3715m;

        C1326c() {
        }

        /* renamed from: e */
        private View m5887e() {
            int size = this.f3714l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3714l.get(i).f3747a;
                RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
                if (!pVar.mo5215c() && this.f3706d == pVar.mo5213a()) {
                    mo4779b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4778a() {
            mo4779b((View) null);
        }

        /* renamed from: b */
        public void mo4779b(View view) {
            View f = mo4782f(view);
            if (f == null) {
                this.f3706d = -1;
            } else {
                this.f3706d = ((RecyclerView.C1355p) f.getLayoutParams()).mo5213a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4780c(RecyclerView.C1330a0 a0Var) {
            int i = this.f3706d;
            return i >= 0 && i < a0Var.mo4982b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4781d(RecyclerView.C1362v vVar) {
            if (this.f3714l != null) {
                return m5887e();
            }
            View o = vVar.mo5261o(this.f3706d);
            this.f3706d += this.f3707e;
            return o;
        }

        /* renamed from: f */
        public View mo4782f(View view) {
            int a;
            int size = this.f3714l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3714l.get(i2).f3747a;
                RecyclerView.C1355p pVar = (RecyclerView.C1355p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo5215c() && (a = (pVar.mo5213a() - this.f3706d) * this.f3707e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C1327d implements Parcelable {
        public static final Parcelable.Creator<C1327d> CREATOR = new C1328a();

        /* renamed from: a */
        int f3716a;

        /* renamed from: b */
        int f3717b;

        /* renamed from: c */
        boolean f3718c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C1328a implements Parcelable.Creator<C1327d> {
            C1328a() {
            }

            /* renamed from: a */
            public C1327d createFromParcel(Parcel parcel) {
                return new C1327d(parcel);
            }

            /* renamed from: b */
            public C1327d[] newArray(int i) {
                return new C1327d[i];
            }
        }

        public C1327d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4783a() {
            return this.f3716a >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4784b() {
            this.f3716a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3716a);
            parcel.writeInt(this.f3717b);
            parcel.writeInt(this.f3718c ? 1 : 0);
        }

        C1327d(Parcel parcel) {
            this.f3716a = parcel.readInt();
            this.f3717b = parcel.readInt();
            this.f3718c = parcel.readInt() != 1 ? false : true;
        }

        public C1327d(C1327d dVar) {
            this.f3716a = dVar.f3716a;
            this.f3717b = dVar.f3717b;
            this.f3718c = dVar.f3718c;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        mo4737C2(i);
        mo4738D2(z);
    }

    /* renamed from: A2 */
    private void m5800A2() {
        if (this.f3686s == 1 || !mo4765q2()) {
            this.f3691x = this.f3690w;
        } else {
            this.f3691x = !this.f3690w;
        }
    }

    /* renamed from: F2 */
    private boolean m5801F2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, C1324a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo5133J() == 0) {
            return false;
        }
        View V = mo5149V();
        if (V != null && aVar.mo4774d(V, a0Var)) {
            aVar.mo4773c(V, mo5173h0(V));
            return true;
        } else if (this.f3689v != this.f3692y) {
            return false;
        } else {
            if (aVar.f3697d) {
                view = m5818i2(vVar, a0Var);
            } else {
                view = m5819j2(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.mo4772b(view, mo5173h0(view));
            if (!a0Var.mo4985e() && mo4701L1()) {
                if (this.f3688u.mo5491g(view) >= this.f3688u.mo5493i() || this.f3688u.mo5488d(view) < this.f3688u.mo5497m()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f3697d) {
                        i = this.f3688u.mo5493i();
                    } else {
                        i = this.f3688u.mo5497m();
                    }
                    aVar.f3696c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: G2 */
    private boolean m5802G2(RecyclerView.C1330a0 a0Var, C1324a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (!a0Var.mo4985e() && (i = this.f3678A) != -1) {
            if (i < 0 || i >= a0Var.mo4982b()) {
                this.f3678A = -1;
                this.f3679B = RecyclerView.UNDEFINED_DURATION;
            } else {
                aVar.f3695b = this.f3678A;
                C1327d dVar = this.f3681D;
                if (dVar != null && dVar.mo4783a()) {
                    boolean z2 = this.f3681D.f3718c;
                    aVar.f3697d = z2;
                    if (z2) {
                        aVar.f3696c = this.f3688u.mo5493i() - this.f3681D.f3717b;
                    } else {
                        aVar.f3696c = this.f3688u.mo5497m() + this.f3681D.f3717b;
                    }
                    return true;
                } else if (this.f3679B == Integer.MIN_VALUE) {
                    View C = mo4736C(this.f3678A);
                    if (C == null) {
                        if (mo5133J() > 0) {
                            if ((this.f3678A < mo5173h0(mo5132I(0))) == this.f3691x) {
                                z = true;
                            }
                            aVar.f3697d = z;
                        }
                        aVar.mo4771a();
                    } else if (this.f3688u.mo5489e(C) > this.f3688u.mo5498n()) {
                        aVar.mo4771a();
                        return true;
                    } else if (this.f3688u.mo5491g(C) - this.f3688u.mo5497m() < 0) {
                        aVar.f3696c = this.f3688u.mo5497m();
                        aVar.f3697d = false;
                        return true;
                    } else if (this.f3688u.mo5493i() - this.f3688u.mo5488d(C) < 0) {
                        aVar.f3696c = this.f3688u.mo5493i();
                        aVar.f3697d = true;
                        return true;
                    } else {
                        if (aVar.f3697d) {
                            i2 = this.f3688u.mo5488d(C) + this.f3688u.mo5499o();
                        } else {
                            i2 = this.f3688u.mo5491g(C);
                        }
                        aVar.f3696c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.f3691x;
                    aVar.f3697d = z3;
                    if (z3) {
                        aVar.f3696c = this.f3688u.mo5493i() - this.f3679B;
                    } else {
                        aVar.f3696c = this.f3688u.mo5497m() + this.f3679B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H2 */
    private void m5803H2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, C1324a aVar) {
        if (!m5802G2(a0Var, aVar) && !m5801F2(vVar, a0Var, aVar)) {
            aVar.mo4771a();
            aVar.f3695b = this.f3692y ? a0Var.mo4982b() - 1 : 0;
        }
    }

    /* renamed from: I2 */
    private void m5804I2(int i, int i2, boolean z, RecyclerView.C1330a0 a0Var) {
        int i3;
        this.f3687t.f3715m = mo4770z2();
        this.f3687t.f3708f = i;
        int[] iArr = this.f3685H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo4743M1(a0Var, iArr);
        int max = Math.max(0, this.f3685H[0]);
        int max2 = Math.max(0, this.f3685H[1]);
        if (i == 1) {
            z2 = true;
        }
        C1326c cVar = this.f3687t;
        int i5 = z2 ? max2 : max;
        cVar.f3710h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3711i = max;
        if (z2) {
            cVar.f3710h = i5 + this.f3688u.mo5494j();
            View m2 = m5822m2();
            C1326c cVar2 = this.f3687t;
            if (this.f3691x) {
                i4 = -1;
            }
            cVar2.f3707e = i4;
            int h0 = mo5173h0(m2);
            C1326c cVar3 = this.f3687t;
            cVar2.f3706d = h0 + cVar3.f3707e;
            cVar3.f3704b = this.f3688u.mo5488d(m2);
            i3 = this.f3688u.mo5488d(m2) - this.f3688u.mo5493i();
        } else {
            View n2 = m5823n2();
            this.f3687t.f3710h += this.f3688u.mo5497m();
            C1326c cVar4 = this.f3687t;
            if (!this.f3691x) {
                i4 = -1;
            }
            cVar4.f3707e = i4;
            int h02 = mo5173h0(n2);
            C1326c cVar5 = this.f3687t;
            cVar4.f3706d = h02 + cVar5.f3707e;
            cVar5.f3704b = this.f3688u.mo5491g(n2);
            i3 = (-this.f3688u.mo5491g(n2)) + this.f3688u.mo5497m();
        }
        C1326c cVar6 = this.f3687t;
        cVar6.f3705c = i2;
        if (z) {
            cVar6.f3705c = i2 - i3;
        }
        cVar6.f3709g = i3;
    }

    /* renamed from: J2 */
    private void m5805J2(int i, int i2) {
        this.f3687t.f3705c = this.f3688u.mo5493i() - i2;
        C1326c cVar = this.f3687t;
        cVar.f3707e = this.f3691x ? -1 : 1;
        cVar.f3706d = i;
        cVar.f3708f = 1;
        cVar.f3704b = i2;
        cVar.f3709g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: K2 */
    private void m5806K2(C1324a aVar) {
        m5805J2(aVar.f3695b, aVar.f3696c);
    }

    /* renamed from: L2 */
    private void m5807L2(int i, int i2) {
        this.f3687t.f3705c = i2 - this.f3688u.mo5497m();
        C1326c cVar = this.f3687t;
        cVar.f3706d = i;
        cVar.f3707e = this.f3691x ? 1 : -1;
        cVar.f3708f = -1;
        cVar.f3704b = i2;
        cVar.f3709g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: M2 */
    private void m5808M2(C1324a aVar) {
        m5807L2(aVar.f3695b, aVar.f3696c);
    }

    /* renamed from: O1 */
    private int m5809O1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        mo4746T1();
        C1410j jVar = this.f3688u;
        View Y1 = mo4749Y1(!this.f3693z, true);
        return C1415l.m6650a(a0Var, jVar, Y1, mo4748X1(!this.f3693z, true), this, this.f3693z);
    }

    /* renamed from: P1 */
    private int m5810P1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        mo4746T1();
        C1410j jVar = this.f3688u;
        View Y1 = mo4749Y1(!this.f3693z, true);
        return C1415l.m6651b(a0Var, jVar, Y1, mo4748X1(!this.f3693z, true), this, this.f3693z, this.f3691x);
    }

    /* renamed from: Q1 */
    private int m5811Q1(RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0) {
            return 0;
        }
        mo4746T1();
        C1410j jVar = this.f3688u;
        View Y1 = mo4749Y1(!this.f3693z, true);
        return C1415l.m6652c(a0Var, jVar, Y1, mo4748X1(!this.f3693z, true), this, this.f3693z);
    }

    /* renamed from: V1 */
    private View m5812V1() {
        return mo4755d2(0, mo5133J());
    }

    /* renamed from: W1 */
    private View m5813W1(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        return mo4715h2(vVar, a0Var, 0, mo5133J(), a0Var.mo4982b());
    }

    /* renamed from: a2 */
    private View m5814a2() {
        return mo4755d2(mo5133J() - 1, -1);
    }

    /* renamed from: b2 */
    private View m5815b2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        return mo4715h2(vVar, a0Var, mo5133J() - 1, -1, a0Var.mo4982b());
    }

    /* renamed from: f2 */
    private View m5816f2() {
        if (this.f3691x) {
            return m5812V1();
        }
        return m5814a2();
    }

    /* renamed from: g2 */
    private View m5817g2() {
        if (this.f3691x) {
            return m5814a2();
        }
        return m5812V1();
    }

    /* renamed from: i2 */
    private View m5818i2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3691x) {
            return m5813W1(vVar, a0Var);
        }
        return m5815b2(vVar, a0Var);
    }

    /* renamed from: j2 */
    private View m5819j2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3691x) {
            return m5815b2(vVar, a0Var);
        }
        return m5813W1(vVar, a0Var);
    }

    /* renamed from: k2 */
    private int m5820k2(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, boolean z) {
        int i2;
        int i3 = this.f3688u.mo5493i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo4735B2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3688u.mo5493i() - i5) <= 0) {
            return i4;
        }
        this.f3688u.mo5502r(i2);
        return i2 + i4;
    }

    /* renamed from: l2 */
    private int m5821l2(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.f3688u.mo5497m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo4735B2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3688u.mo5497m()) <= 0) {
            return i2;
        }
        this.f3688u.mo5502r(-m);
        return i2 - m;
    }

    /* renamed from: m2 */
    private View m5822m2() {
        return mo5132I(this.f3691x ? 0 : mo5133J() - 1);
    }

    /* renamed from: n2 */
    private View m5823n2() {
        return mo5132I(this.f3691x ? mo5133J() - 1 : 0);
    }

    /* renamed from: t2 */
    private void m5824t2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, int i, int i2) {
        RecyclerView.C1362v vVar2 = vVar;
        RecyclerView.C1330a0 a0Var2 = a0Var;
        if (a0Var.mo4987g() && mo5133J() != 0 && !a0Var.mo4985e() && mo4701L1()) {
            List<RecyclerView.C1336d0> k = vVar.mo5257k();
            int size = k.size();
            int h0 = mo5173h0(mo5132I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1336d0 d0Var = k.get(i5);
                if (!d0Var.mo5033v()) {
                    char c = 1;
                    if ((d0Var.mo5023m() < h0) != this.f3691x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f3688u.mo5489e(d0Var.f3747a);
                    } else {
                        i4 += this.f3688u.mo5489e(d0Var.f3747a);
                    }
                }
            }
            this.f3687t.f3714l = k;
            if (i3 > 0) {
                m5807L2(mo5173h0(m5823n2()), i);
                C1326c cVar = this.f3687t;
                cVar.f3710h = i3;
                cVar.f3705c = 0;
                cVar.mo4778a();
                mo4747U1(vVar2, this.f3687t, a0Var2, false);
            }
            if (i4 > 0) {
                m5805J2(mo5173h0(m5822m2()), i2);
                C1326c cVar2 = this.f3687t;
                cVar2.f3710h = i4;
                cVar2.f3705c = 0;
                cVar2.mo4778a();
                mo4747U1(vVar2, this.f3687t, a0Var2, false);
            }
            this.f3687t.f3714l = null;
        }
    }

    /* renamed from: v2 */
    private void m5825v2(RecyclerView.C1362v vVar, C1326c cVar) {
        if (cVar.f3703a && !cVar.f3715m) {
            int i = cVar.f3709g;
            int i2 = cVar.f3711i;
            if (cVar.f3708f == -1) {
                m5827x2(vVar, i, i2);
            } else {
                m5828y2(vVar, i, i2);
            }
        }
    }

    /* renamed from: w2 */
    private void m5826w2(RecyclerView.C1362v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5186n1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo5186n1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: x2 */
    private void m5827x2(RecyclerView.C1362v vVar, int i, int i2) {
        int J = mo5133J();
        if (i >= 0) {
            int h = (this.f3688u.mo5492h() - i) + i2;
            if (this.f3691x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo5132I(i3);
                    if (this.f3688u.mo5491g(I) < h || this.f3688u.mo5501q(I) < h) {
                        m5826w2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = mo5132I(i5);
                if (this.f3688u.mo5491g(I2) < h || this.f3688u.mo5501q(I2) < h) {
                    m5826w2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: y2 */
    private void m5828y2(RecyclerView.C1362v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo5133J();
            if (this.f3691x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = mo5132I(i5);
                    if (this.f3688u.mo5488d(I) > i3 || this.f3688u.mo5500p(I) > i3) {
                        m5826w2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = mo5132I(i6);
                if (this.f3688u.mo5488d(I2) > i3 || this.f3688u.mo5500p(I2) > i3) {
                    m5826w2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public int mo4735B2(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (mo5133J() == 0 || i == 0) {
            return 0;
        }
        mo4746T1();
        this.f3687t.f3703a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m5804I2(i2, abs, true, a0Var);
        C1326c cVar = this.f3687t;
        int U1 = cVar.f3709g + mo4747U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.f3688u.mo5502r(-i);
        this.f3687t.f3713k = i;
        return i;
    }

    /* renamed from: C */
    public View mo4736C(int i) {
        int J = mo5133J();
        if (J == 0) {
            return null;
        }
        int h0 = i - mo5173h0(mo5132I(0));
        if (h0 >= 0 && h0 < J) {
            View I = mo5132I(h0);
            if (mo5173h0(I) == i) {
                return I;
            }
        }
        return super.mo4736C(i);
    }

    /* renamed from: C2 */
    public void mo4737C2(int i) {
        if (i == 0 || i == 1) {
            mo4757g((String) null);
            if (i != this.f3686s || this.f3688u == null) {
                C1410j b = C1410j.m6588b(this, i);
                this.f3688u = b;
                this.f3682E.f3694a = b;
                this.f3686s = i;
                mo5196t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: D */
    public RecyclerView.C1355p mo4696D() {
        return new RecyclerView.C1355p(-2, -2);
    }

    /* renamed from: D2 */
    public void mo4738D2(boolean z) {
        mo4757g((String) null);
        if (z != this.f3690w) {
            this.f3690w = z;
            mo5196t1();
        }
    }

    /* renamed from: E2 */
    public void mo4698E2(boolean z) {
        mo4757g((String) null);
        if (this.f3692y != z) {
            this.f3692y = z;
            mo5196t1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public boolean mo4739G1() {
        return (mo5152X() == 1073741824 || mo5189p0() == 1073741824 || !mo5191q0()) ? false : true;
    }

    /* renamed from: I0 */
    public void mo4740I0(RecyclerView recyclerView, RecyclerView.C1362v vVar) {
        super.mo4740I0(recyclerView, vVar);
        if (this.f3680C) {
            mo5180k1(vVar);
            vVar.mo5249c();
        }
    }

    /* renamed from: I1 */
    public void mo4741I1(RecyclerView recyclerView, RecyclerView.C1330a0 a0Var, int i) {
        C1406g gVar = new C1406g(recyclerView.getContext());
        gVar.mo5294p(i);
        mo5134J1(gVar);
    }

    /* renamed from: J0 */
    public View mo4700J0(View view, int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        int R1;
        View view2;
        View view3;
        m5800A2();
        if (mo5133J() == 0 || (R1 = mo4744R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4746T1();
        m5804I2(R1, (int) (((float) this.f3688u.mo5498n()) * 0.33333334f), false, a0Var);
        C1326c cVar = this.f3687t;
        cVar.f3709g = RecyclerView.UNDEFINED_DURATION;
        cVar.f3703a = false;
        mo4747U1(vVar, cVar, a0Var, true);
        if (R1 == -1) {
            view2 = m5817g2();
        } else {
            view2 = m5816f2();
        }
        if (R1 == -1) {
            view3 = m5823n2();
        } else {
            view3 = m5822m2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: K0 */
    public void mo4742K0(AccessibilityEvent accessibilityEvent) {
        super.mo4742K0(accessibilityEvent);
        if (mo5133J() > 0) {
            accessibilityEvent.setFromIndex(mo4750Z1());
            accessibilityEvent.setToIndex(mo4753c2());
        }
    }

    /* renamed from: L1 */
    public boolean mo4701L1() {
        return this.f3681D == null && this.f3689v == this.f3692y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo4743M1(RecyclerView.C1330a0 a0Var, int[] iArr) {
        int i;
        int o2 = mo4761o2(a0Var);
        if (this.f3687t.f3708f == -1) {
            i = 0;
        } else {
            i = o2;
            o2 = 0;
        }
        iArr[0] = o2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4703N1(RecyclerView.C1330a0 a0Var, C1326c cVar, RecyclerView.C1350o.C1353c cVar2) {
        int i = cVar.f3706d;
        if (i >= 0 && i < a0Var.mo4982b()) {
            cVar2.mo5212a(i, Math.max(0, cVar.f3709g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int mo4744R1(int i) {
        if (i == 1) {
            return (this.f3686s != 1 && mo4765q2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3686s != 1 && mo4765q2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f3686s == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f3686s == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3686s == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f3686s == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public C1326c mo4745S1() {
        return new C1326c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo4746T1() {
        if (this.f3687t == null) {
            this.f3687t = mo4745S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public int mo4747U1(RecyclerView.C1362v vVar, C1326c cVar, RecyclerView.C1330a0 a0Var, boolean z) {
        int i = cVar.f3705c;
        int i2 = cVar.f3709g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3709g = i2 + i;
            }
            m5825v2(vVar, cVar);
        }
        int i3 = cVar.f3705c + cVar.f3710h;
        C1325b bVar = this.f3683F;
        while (true) {
            if ((!cVar.f3715m && i3 <= 0) || !cVar.mo4780c(a0Var)) {
                break;
            }
            bVar.mo4777a();
            mo4720s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3700b) {
                cVar.f3704b += bVar.f3699a * cVar.f3708f;
                if (!bVar.f3701c || cVar.f3714l != null || !a0Var.mo4985e()) {
                    int i4 = cVar.f3705c;
                    int i5 = bVar.f3699a;
                    cVar.f3705c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3709g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3699a;
                    cVar.f3709g = i7;
                    int i8 = cVar.f3705c;
                    if (i8 < 0) {
                        cVar.f3709g = i7 + i8;
                    }
                    m5825v2(vVar, cVar);
                }
                if (z && bVar.f3702d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3705c;
    }

    /* renamed from: X0 */
    public void mo4711X0(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3681D == null && this.f3678A == -1) && a0Var.mo4982b() == 0) {
            mo5180k1(vVar);
            return;
        }
        C1327d dVar = this.f3681D;
        if (dVar != null && dVar.mo4783a()) {
            this.f3678A = this.f3681D.f3716a;
        }
        mo4746T1();
        this.f3687t.f3703a = false;
        m5800A2();
        View V = mo5149V();
        C1324a aVar = this.f3682E;
        if (!aVar.f3698e || this.f3678A != -1 || this.f3681D != null) {
            aVar.mo4775e();
            C1324a aVar2 = this.f3682E;
            aVar2.f3697d = this.f3691x ^ this.f3692y;
            m5803H2(vVar, a0Var, aVar2);
            this.f3682E.f3698e = true;
        } else if (V != null && (this.f3688u.mo5491g(V) >= this.f3688u.mo5493i() || this.f3688u.mo5488d(V) <= this.f3688u.mo5497m())) {
            this.f3682E.mo4773c(V, mo5173h0(V));
        }
        C1326c cVar = this.f3687t;
        cVar.f3708f = cVar.f3713k >= 0 ? 1 : -1;
        int[] iArr = this.f3685H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4743M1(a0Var, iArr);
        int max = Math.max(0, this.f3685H[0]) + this.f3688u.mo5497m();
        int max2 = Math.max(0, this.f3685H[1]) + this.f3688u.mo5494j();
        if (!(!a0Var.mo4985e() || (i6 = this.f3678A) == -1 || this.f3679B == Integer.MIN_VALUE || (C = mo4736C(i6)) == null)) {
            if (this.f3691x) {
                i7 = this.f3688u.mo5493i() - this.f3688u.mo5488d(C);
                i8 = this.f3679B;
            } else {
                i8 = this.f3688u.mo5491g(C) - this.f3688u.mo5497m();
                i7 = this.f3679B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C1324a aVar3 = this.f3682E;
        if (!aVar3.f3697d ? !this.f3691x : this.f3691x) {
            i9 = 1;
        }
        mo4722u2(vVar, a0Var, aVar3, i9);
        mo5200w(vVar);
        this.f3687t.f3715m = mo4770z2();
        this.f3687t.f3712j = a0Var.mo4985e();
        this.f3687t.f3711i = 0;
        C1324a aVar4 = this.f3682E;
        if (aVar4.f3697d) {
            m5808M2(aVar4);
            C1326c cVar2 = this.f3687t;
            cVar2.f3710h = max;
            mo4747U1(vVar, cVar2, a0Var, false);
            C1326c cVar3 = this.f3687t;
            i2 = cVar3.f3704b;
            int i11 = cVar3.f3706d;
            int i12 = cVar3.f3705c;
            if (i12 > 0) {
                max2 += i12;
            }
            m5806K2(this.f3682E);
            C1326c cVar4 = this.f3687t;
            cVar4.f3710h = max2;
            cVar4.f3706d += cVar4.f3707e;
            mo4747U1(vVar, cVar4, a0Var, false);
            C1326c cVar5 = this.f3687t;
            i = cVar5.f3704b;
            int i13 = cVar5.f3705c;
            if (i13 > 0) {
                m5807L2(i11, i2);
                C1326c cVar6 = this.f3687t;
                cVar6.f3710h = i13;
                mo4747U1(vVar, cVar6, a0Var, false);
                i2 = this.f3687t.f3704b;
            }
        } else {
            m5806K2(aVar4);
            C1326c cVar7 = this.f3687t;
            cVar7.f3710h = max2;
            mo4747U1(vVar, cVar7, a0Var, false);
            C1326c cVar8 = this.f3687t;
            i = cVar8.f3704b;
            int i14 = cVar8.f3706d;
            int i15 = cVar8.f3705c;
            if (i15 > 0) {
                max += i15;
            }
            m5808M2(this.f3682E);
            C1326c cVar9 = this.f3687t;
            cVar9.f3710h = max;
            cVar9.f3706d += cVar9.f3707e;
            mo4747U1(vVar, cVar9, a0Var, false);
            C1326c cVar10 = this.f3687t;
            i2 = cVar10.f3704b;
            int i16 = cVar10.f3705c;
            if (i16 > 0) {
                m5805J2(i14, i);
                C1326c cVar11 = this.f3687t;
                cVar11.f3710h = i16;
                mo4747U1(vVar, cVar11, a0Var, false);
                i = this.f3687t.f3704b;
            }
        }
        if (mo5133J() > 0) {
            if (this.f3691x ^ this.f3692y) {
                int k2 = m5820k2(i, vVar, a0Var, true);
                i4 = i2 + k2;
                i3 = i + k2;
                i5 = m5821l2(i4, vVar, a0Var, false);
            } else {
                int l2 = m5821l2(i2, vVar, a0Var, true);
                i4 = i2 + l2;
                i3 = i + l2;
                i5 = m5820k2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m5824t2(vVar, a0Var, i2, i);
        if (!a0Var.mo4985e()) {
            this.f3688u.mo5503s();
        } else {
            this.f3682E.mo4775e();
        }
        this.f3689v = this.f3692y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo4748X1(boolean z, boolean z2) {
        if (this.f3691x) {
            return mo4756e2(0, mo5133J(), z, z2);
        }
        return mo4756e2(mo5133J() - 1, -1, z, z2);
    }

    /* renamed from: Y0 */
    public void mo4713Y0(RecyclerView.C1330a0 a0Var) {
        super.mo4713Y0(a0Var);
        this.f3681D = null;
        this.f3678A = -1;
        this.f3679B = RecyclerView.UNDEFINED_DURATION;
        this.f3682E.mo4775e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View mo4749Y1(boolean z, boolean z2) {
        if (this.f3691x) {
            return mo4756e2(mo5133J() - 1, -1, z, z2);
        }
        return mo4756e2(0, mo5133J(), z, z2);
    }

    /* renamed from: Z1 */
    public int mo4750Z1() {
        View e2 = mo4756e2(0, mo5133J(), false, true);
        if (e2 == null) {
            return -1;
        }
        return mo5173h0(e2);
    }

    /* renamed from: a */
    public PointF mo4751a(int i) {
        if (mo5133J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo5173h0(mo5132I(0))) {
            z = true;
        }
        if (z != this.f3691x) {
            i2 = -1;
        }
        if (this.f3686s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: c1 */
    public void mo4752c1(Parcelable parcelable) {
        if (parcelable instanceof C1327d) {
            this.f3681D = (C1327d) parcelable;
            mo5196t1();
        }
    }

    /* renamed from: c2 */
    public int mo4753c2() {
        View e2 = mo4756e2(mo5133J() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return mo5173h0(e2);
    }

    /* renamed from: d1 */
    public Parcelable mo4754d1() {
        if (this.f3681D != null) {
            return new C1327d(this.f3681D);
        }
        C1327d dVar = new C1327d();
        if (mo5133J() > 0) {
            mo4746T1();
            boolean z = this.f3689v ^ this.f3691x;
            dVar.f3718c = z;
            if (z) {
                View m2 = m5822m2();
                dVar.f3717b = this.f3688u.mo5493i() - this.f3688u.mo5488d(m2);
                dVar.f3716a = mo5173h0(m2);
            } else {
                View n2 = m5823n2();
                dVar.f3716a = mo5173h0(n2);
                dVar.f3717b = this.f3688u.mo5491g(n2) - this.f3688u.mo5497m();
            }
        } else {
            dVar.mo4784b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo4755d2(int i, int i2) {
        int i3;
        int i4;
        mo4746T1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo5132I(i);
        }
        if (this.f3688u.mo5491g(mo5132I(i)) < this.f3688u.mo5497m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f3686s == 0) {
            return this.f3784e.mo5529a(i, i2, i4, i3);
        }
        return this.f3785f.mo5529a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo4756e2(int i, int i2, boolean z, boolean z2) {
        mo4746T1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f3686s == 0) {
            return this.f3784e.mo5529a(i, i2, i4, i3);
        }
        return this.f3785f.mo5529a(i, i2, i4, i3);
    }

    /* renamed from: g */
    public void mo4757g(String str) {
        if (this.f3681D == null) {
            super.mo4757g(str);
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
            if (h0 >= 0 && h0 < i3) {
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

    /* renamed from: k */
    public boolean mo4758k() {
        return this.f3686s == 0;
    }

    /* renamed from: l */
    public boolean mo4759l() {
        return this.f3686s == 1;
    }

    /* renamed from: o */
    public void mo4760o(int i, int i2, RecyclerView.C1330a0 a0Var, RecyclerView.C1350o.C1353c cVar) {
        if (this.f3686s != 0) {
            i = i2;
        }
        if (mo5133J() != 0 && i != 0) {
            mo4746T1();
            m5804I2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo4703N1(a0Var, this.f3687t, cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: o2 */
    public int mo4761o2(RecyclerView.C1330a0 a0Var) {
        if (a0Var.mo4984d()) {
            return this.f3688u.mo5498n();
        }
        return 0;
    }

    /* renamed from: p */
    public void mo4762p(int i, RecyclerView.C1350o.C1353c cVar) {
        boolean z;
        int i2;
        C1327d dVar = this.f3681D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4783a()) {
            m5800A2();
            z = this.f3691x;
            i2 = this.f3678A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C1327d dVar2 = this.f3681D;
            z = dVar2.f3718c;
            i2 = dVar2.f3716a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3684G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo5212a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: p2 */
    public int mo4763p2() {
        return this.f3686s;
    }

    /* renamed from: q */
    public int mo4764q(RecyclerView.C1330a0 a0Var) {
        return m5809O1(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean mo4765q2() {
        return mo5154Z() == 1;
    }

    /* renamed from: r */
    public int mo4718r(RecyclerView.C1330a0 a0Var) {
        return m5810P1(a0Var);
    }

    /* renamed from: r2 */
    public boolean mo4766r2() {
        return this.f3693z;
    }

    /* renamed from: s */
    public int mo4719s(RecyclerView.C1330a0 a0Var) {
        return m5811Q1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4767s0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo4720s2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, C1326c cVar, C1325b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4781d(vVar);
        if (d == null) {
            bVar.f3700b = true;
            return;
        }
        RecyclerView.C1355p pVar = (RecyclerView.C1355p) d.getLayoutParams();
        if (cVar.f3714l == null) {
            if (this.f3691x == (cVar.f3708f == -1)) {
                mo5163d(d);
            } else {
                mo5165e(d, 0);
            }
        } else {
            if (this.f3691x == (cVar.f3708f == -1)) {
                mo5158b(d);
            } else {
                mo5161c(d, 0);
            }
        }
        mo5115A0(d, 0, 0);
        bVar.f3699a = this.f3688u.mo5489e(d);
        if (this.f3686s == 1) {
            if (mo4765q2()) {
                i5 = mo5187o0() - mo5168f0();
                i4 = i5 - this.f3688u.mo5490f(d);
            } else {
                i4 = mo5166e0();
                i5 = this.f3688u.mo5490f(d) + i4;
            }
            if (cVar.f3708f == -1) {
                int i6 = cVar.f3704b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f3699a;
            } else {
                int i7 = cVar.f3704b;
                i3 = i7;
                i2 = i5;
                i = bVar.f3699a + i7;
            }
        } else {
            int g0 = mo5170g0();
            int f = this.f3688u.mo5490f(d) + g0;
            if (cVar.f3708f == -1) {
                int i8 = cVar.f3704b;
                i2 = i8;
                i3 = g0;
                i = f;
                i4 = i8 - bVar.f3699a;
            } else {
                int i9 = cVar.f3704b;
                i3 = g0;
                i2 = bVar.f3699a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo5205z0(d, i4, i3, i2, i);
        if (pVar.mo5215c() || pVar.mo5214b()) {
            bVar.f3701c = true;
        }
        bVar.f3702d = d.hasFocusable();
    }

    /* renamed from: t */
    public int mo4768t(RecyclerView.C1330a0 a0Var) {
        return m5809O1(a0Var);
    }

    /* renamed from: u */
    public int mo4721u(RecyclerView.C1330a0 a0Var) {
        return m5810P1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4722u2(RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var, C1324a aVar, int i) {
    }

    /* renamed from: v */
    public int mo4723v(RecyclerView.C1330a0 a0Var) {
        return m5811Q1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4724w1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3686s == 1) {
            return 0;
        }
        return mo4735B2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4769x1(int i) {
        this.f3678A = i;
        this.f3679B = RecyclerView.UNDEFINED_DURATION;
        C1327d dVar = this.f3681D;
        if (dVar != null) {
            dVar.mo4784b();
        }
        mo5196t1();
    }

    /* renamed from: y1 */
    public int mo4725y1(int i, RecyclerView.C1362v vVar, RecyclerView.C1330a0 a0Var) {
        if (this.f3686s == 0) {
            return 0;
        }
        return mo4735B2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public boolean mo4770z2() {
        return this.f3688u.mo5495k() == 0 && this.f3688u.mo5492h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1350o.C1354d i0 = RecyclerView.C1350o.m6033i0(context, attributeSet, i, i2);
        mo4737C2(i0.f3800a);
        mo4738D2(i0.f3802c);
        mo4698E2(i0.f3803d);
    }
}
