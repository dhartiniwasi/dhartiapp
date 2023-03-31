package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C1114n;
import androidx.fragment.app.C1146w;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C1057a extends C1146w implements C1114n.C1130o {

    /* renamed from: t */
    final C1114n f2890t;

    /* renamed from: u */
    boolean f2891u;

    /* renamed from: v */
    int f2892v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1057a(C1114n nVar) {
        super(nVar.mo4162q0(), nVar.mo4166t0() != null ? nVar.mo4166t0().mo4066f().getClassLoader() : null);
        this.f2892v = -1;
        this.f2890t = nVar;
    }

    /* renamed from: z */
    private static boolean m4806z(C1146w.C1147a aVar) {
        Fragment fragment = aVar.f3170b;
        return fragment != null && fragment.f2848t && fragment.f2818P != null && !fragment.f2811I && !fragment.f2810H && fragment.mo3791a0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo3878A() {
        for (int i = 0; i < this.f3152c.size(); i++) {
            if (m4806z(this.f3152c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public void mo3879B() {
        if (this.f3168s != null) {
            for (int i = 0; i < this.f3168s.size(); i++) {
                this.f3168s.get(i).run();
            }
            this.f3168s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo3880C(Fragment.C1056h hVar) {
        for (int i = 0; i < this.f3152c.size(); i++) {
            C1146w.C1147a aVar = this.f3152c.get(i);
            if (m4806z(aVar)) {
                aVar.f3170b.mo3867y1(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public Fragment mo3881D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3152c.size() - 1; size >= 0; size--) {
            C1146w.C1147a aVar = this.f3152c.get(size);
            int i = aVar.f3169a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3170b;
                            break;
                        case 10:
                            aVar.f3176h = aVar.f3175g;
                            break;
                    }
                }
                arrayList.add(aVar.f3170b);
            }
            arrayList.remove(aVar.f3170b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3882a(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3158i) {
            return true;
        }
        this.f2890t.mo4137e(this);
        return true;
    }

    /* renamed from: f */
    public int mo3883f() {
        return mo3890q(false);
    }

    /* renamed from: g */
    public int mo3884g() {
        return mo3890q(true);
    }

    /* renamed from: h */
    public void mo3885h() {
        mo4292j();
        this.f2890t.mo4134b0(this, false);
    }

    /* renamed from: i */
    public void mo3886i() {
        mo4292j();
        this.f2890t.mo4134b0(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3887k(int i, Fragment fragment, String str, int i2) {
        super.mo3887k(i, fragment, str, i2);
        fragment.f2803A = this.f2890t;
    }

    /* renamed from: l */
    public C1146w mo3888l(Fragment fragment) {
        C1114n nVar = fragment.f2803A;
        if (nVar == null || nVar == this.f2890t) {
            return super.mo3888l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3889p(int i) {
        if (this.f3158i) {
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3152c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1146w.C1147a aVar = this.f3152c.get(i2);
                Fragment fragment = aVar.f3170b;
                if (fragment != null) {
                    fragment.f2854z += i;
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3170b + " to " + aVar.f3170b.f2854z);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo3890q(boolean z) {
        if (!this.f2891u) {
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1061b0("FragmentManager"));
                mo3891r("  ", printWriter);
                printWriter.close();
            }
            this.f2891u = true;
            if (this.f3158i) {
                this.f2892v = this.f2890t.mo4146i();
            } else {
                this.f2892v = -1;
            }
            this.f2890t.mo4130Y(this, z);
            return this.f2892v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: r */
    public void mo3891r(String str, PrintWriter printWriter) {
        mo3892s(str, printWriter, true);
    }

    /* renamed from: s */
    public void mo3892s(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3160k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2892v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2891u);
            if (this.f3157h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3157h));
            }
            if (!(this.f3153d == 0 && this.f3154e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3153d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3154e));
            }
            if (!(this.f3155f == 0 && this.f3156g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3155f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3156g));
            }
            if (!(this.f3161l == 0 && this.f3162m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3161l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3162m);
            }
            if (!(this.f3163n == 0 && this.f3164o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3163n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3164o);
            }
        }
        if (!this.f3152c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3152c.size();
            for (int i = 0; i < size; i++) {
                C1146w.C1147a aVar = this.f3152c.get(i);
                switch (aVar.f3169a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3169a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3170b);
                if (z) {
                    if (!(aVar.f3171c == 0 && aVar.f3172d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3171c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3172d));
                    }
                    if (aVar.f3173e != 0 || aVar.f3174f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3173e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3174f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3893t() {
        int size = this.f3152c.size();
        for (int i = 0; i < size; i++) {
            C1146w.C1147a aVar = this.f3152c.get(i);
            Fragment fragment = aVar.f3170b;
            if (fragment != null) {
                fragment.mo3869z1(false);
                fragment.mo3864x1(this.f3157h);
                fragment.mo3741B1(this.f3165p, this.f3166q);
            }
            switch (aVar.f3169a) {
                case 1:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, false);
                    this.f2890t.mo4141g(fragment);
                    break;
                case 3:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4136c1(fragment);
                    break;
                case 4:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4095C0(fragment);
                    break;
                case 5:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, false);
                    this.f2890t.mo4158n1(fragment);
                    break;
                case 6:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4172x(fragment);
                    break;
                case 7:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, false);
                    this.f2890t.mo4152k(fragment);
                    break;
                case 8:
                    this.f2890t.mo4155l1(fragment);
                    break;
                case 9:
                    this.f2890t.mo4155l1((Fragment) null);
                    break;
                case 10:
                    this.f2890t.mo4153k1(fragment, aVar.f3176h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3169a);
            }
            if (!this.f3167r && aVar.f3169a != 1 && fragment != null && !C1114n.f3046P) {
                this.f2890t.mo4115O0(fragment);
            }
        }
        if (!this.f3167r && !C1114n.f3046P) {
            C1114n nVar = this.f2890t;
            nVar.mo4117P0(nVar.f3077q, true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2892v >= 0) {
            sb.append(" #");
            sb.append(this.f2892v);
        }
        if (this.f3160k != null) {
            sb.append(" ");
            sb.append(this.f3160k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3895u(boolean z) {
        for (int size = this.f3152c.size() - 1; size >= 0; size--) {
            C1146w.C1147a aVar = this.f3152c.get(size);
            Fragment fragment = aVar.f3170b;
            if (fragment != null) {
                fragment.mo3869z1(true);
                fragment.mo3864x1(C1114n.m5018g1(this.f3157h));
                fragment.mo3741B1(this.f3166q, this.f3165p);
            }
            switch (aVar.f3169a) {
                case 1:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, true);
                    this.f2890t.mo4136c1(fragment);
                    break;
                case 3:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4141g(fragment);
                    break;
                case 4:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4158n1(fragment);
                    break;
                case 5:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, true);
                    this.f2890t.mo4095C0(fragment);
                    break;
                case 6:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4152k(fragment);
                    break;
                case 7:
                    fragment.mo3847s1(aVar.f3171c, aVar.f3172d, aVar.f3173e, aVar.f3174f);
                    this.f2890t.mo4151j1(fragment, true);
                    this.f2890t.mo4172x(fragment);
                    break;
                case 8:
                    this.f2890t.mo4155l1((Fragment) null);
                    break;
                case 9:
                    this.f2890t.mo4155l1(fragment);
                    break;
                case 10:
                    this.f2890t.mo4153k1(fragment, aVar.f3175g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3169a);
            }
            if (!this.f3167r && aVar.f3169a != 3 && fragment != null && !C1114n.f3046P) {
                this.f2890t.mo4115O0(fragment);
            }
        }
        if (!this.f3167r && z && !C1114n.f3046P) {
            C1114n nVar = this.f2890t;
            nVar.mo4117P0(nVar.f3077q, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Fragment mo3896v(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3152c.size()) {
            C1146w.C1147a aVar = this.f3152c.get(i);
            int i2 = aVar.f3169a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3170b;
                    int i3 = fragment3.f2808F;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2808F == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3152c.add(i, new C1146w.C1147a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C1146w.C1147a aVar2 = new C1146w.C1147a(3, fragment4);
                                aVar2.f3171c = aVar.f3171c;
                                aVar2.f3173e = aVar.f3173e;
                                aVar2.f3172d = aVar.f3172d;
                                aVar2.f3174f = aVar.f3174f;
                                this.f3152c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3152c.remove(i);
                        i--;
                    } else {
                        aVar.f3169a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3170b);
                    Fragment fragment5 = aVar.f3170b;
                    if (fragment5 == fragment2) {
                        this.f3152c.add(i, new C1146w.C1147a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3152c.add(i, new C1146w.C1147a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3170b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3170b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: w */
    public String mo3897w() {
        return this.f3160k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo3898x(int i) {
        int size = this.f3152c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3152c.get(i2).f3170b;
            int i3 = fragment != null ? fragment.f2808F : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo3899y(ArrayList<C1057a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3152c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3152c.get(i4).f3170b;
            int i5 = fragment != null ? fragment.f2808F : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1057a aVar = arrayList.get(i6);
                    int size2 = aVar.f3152c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3152c.get(i7).f3170b;
                        if ((fragment2 != null ? fragment2.f2808F : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }
}
