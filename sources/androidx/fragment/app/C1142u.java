package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0835a0;
import androidx.fragment.app.C1077c0;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1217l0;
import p019c0.C1834b;

/* renamed from: androidx.fragment.app.u */
/* compiled from: FragmentStateManager */
class C1142u {

    /* renamed from: a */
    private final C1112m f3139a;

    /* renamed from: b */
    private final C1145v f3140b;

    /* renamed from: c */
    private final Fragment f3141c;

    /* renamed from: d */
    private boolean f3142d = false;

    /* renamed from: e */
    private int f3143e = -1;

    /* renamed from: androidx.fragment.app.u$a */
    /* compiled from: FragmentStateManager */
    class C1143a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f3144a;

        C1143a(View view) {
            this.f3144a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3144a.removeOnAttachStateChangeListener(this);
            C0835a0.m3735k0(this.f3144a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    /* compiled from: FragmentStateManager */
    static /* synthetic */ class C1144b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3146a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.j$c[] r0 = androidx.lifecycle.C1208j.C1211c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3146a = r0
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C1208j.C1211c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3146a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C1208j.C1211c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3146a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C1208j.C1211c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3146a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C1208j.C1211c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1142u.C1144b.<clinit>():void");
        }
    }

    C1142u(C1112m mVar, C1145v vVar, Fragment fragment) {
        this.f3139a = mVar;
        this.f3140b = vVar;
        this.f3141c = fragment;
    }

    /* renamed from: l */
    private boolean m5180l(View view) {
        if (view == this.f3141c.f2818P) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3141c.f2818P) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m5181q() {
        Bundle bundle = new Bundle();
        this.f3141c.mo3811h1(bundle);
        this.f3139a.mo4083j(this.f3141c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3141c.f2818P != null) {
            mo4258s();
        }
        if (this.f3141c.f2826c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3141c.f2826c);
        }
        if (this.f3141c.f2828d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3141c.f2828d);
        }
        if (!this.f3141c.f2820R) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3141c.f2820R);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4242a() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3141c);
        }
        Fragment fragment = this.f3141c;
        fragment.mo3768N0(fragment.f2824b);
        C1112m mVar = this.f3139a;
        Fragment fragment2 = this.f3141c;
        mVar.mo4074a(fragment2, fragment2.f2824b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4243b() {
        int j = this.f3140b.mo4273j(this.f3141c);
        Fragment fragment = this.f3141c;
        fragment.f2817O.addView(fragment.f2818P, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4244c() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3141c);
        }
        Fragment fragment = this.f3141c;
        Fragment fragment2 = fragment.f2836h;
        C1142u uVar = null;
        if (fragment2 != null) {
            C1142u m = this.f3140b.mo4276m(fragment2.f2832f);
            if (m != null) {
                Fragment fragment3 = this.f3141c;
                fragment3.f2838i = fragment3.f2836h.f2832f;
                fragment3.f2836h = null;
                uVar = m;
            } else {
                throw new IllegalStateException("Fragment " + this.f3141c + " declared target fragment " + this.f3141c.f2836h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f2838i;
            if (str != null && (uVar = this.f3140b.mo4276m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3141c + " declared target fragment " + this.f3141c.f2838i + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (C1114n.f3046P || uVar.mo4252k().f2822a < 1)) {
            uVar.mo4253m();
        }
        Fragment fragment4 = this.f3141c;
        fragment4.f2804B = fragment4.f2803A.mo4166t0();
        Fragment fragment5 = this.f3141c;
        fragment5.f2806D = fragment5.f2803A.mo4171w0();
        this.f3139a.mo4080g(this.f3141c, false);
        this.f3141c.mo3770O0();
        this.f3139a.mo4075b(this.f3141c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4245d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3141c;
        if (fragment2.f2803A == null) {
            return fragment2.f2822a;
        }
        int i = this.f3143e;
        int i2 = C1144b.f3146a[fragment2.f2835g0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment3 = this.f3141c;
        if (fragment3.f2850v) {
            if (fragment3.f2851w) {
                i = Math.max(this.f3143e, 2);
                View view = this.f3141c.f2818P;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3143e < 4 ? Math.min(i, fragment3.f2822a) : Math.min(i, 1);
            }
        }
        if (!this.f3141c.f2848t) {
            i = Math.min(i, 1);
        }
        C1077c0.C1082e.C1084b bVar = null;
        if (C1114n.f3046P && (viewGroup = fragment.f2817O) != null) {
            bVar = C1077c0.m4861n(viewGroup, (fragment = this.f3141c).mo3742C()).mo3948l(this);
        }
        if (bVar == C1077c0.C1082e.C1084b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C1077c0.C1082e.C1084b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3141c;
            if (fragment4.f2849u) {
                if (fragment4.mo3787Y()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f3141c;
        if (fragment5.f2819Q && fragment5.f2822a < 5) {
            i = Math.min(i, 4);
        }
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f3141c);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4246e() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3141c);
        }
        Fragment fragment = this.f3141c;
        if (!fragment.f2833f0) {
            this.f3139a.mo4081h(fragment, fragment.f2824b, false);
            Fragment fragment2 = this.f3141c;
            fragment2.mo3776R0(fragment2.f2824b);
            C1112m mVar = this.f3139a;
            Fragment fragment3 = this.f3141c;
            mVar.mo4076c(fragment3, fragment3.f2824b, false);
            return;
        }
        fragment.mo3833o1(fragment.f2824b);
        this.f3141c.f2822a = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4247f() {
        String str;
        if (!this.f3141c.f2850v) {
            if (C1114n.m4999F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3141c);
            }
            Fragment fragment = this.f3141c;
            LayoutInflater X0 = fragment.mo3786X0(fragment.f2824b);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3141c;
            ViewGroup viewGroup2 = fragment2.f2817O;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f2808F;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f2803A.mo4159o0().mo3873c(this.f3141c.f2808F);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3141c;
                            if (!fragment3.f2852x) {
                                try {
                                    str = fragment3.mo3757I().getResourceName(this.f3141c.f2808F);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3141c.f2808F) + " (" + str + ") for fragment " + this.f3141c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3141c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3141c;
            fragment4.f2817O = viewGroup;
            fragment4.mo3779T0(X0, viewGroup, fragment4.f2824b);
            View view = this.f3141c.f2818P;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3141c;
                fragment5.f2818P.setTag(C1834b.f5381a, fragment5);
                if (viewGroup != null) {
                    mo4243b();
                }
                Fragment fragment6 = this.f3141c;
                if (fragment6.f2810H) {
                    fragment6.f2818P.setVisibility(8);
                }
                if (C0835a0.m3704Q(this.f3141c.f2818P)) {
                    C0835a0.m3735k0(this.f3141c.f2818P);
                } else {
                    View view2 = this.f3141c.f2818P;
                    view2.addOnAttachStateChangeListener(new C1143a(view2));
                }
                this.f3141c.mo3821k1();
                C1112m mVar = this.f3139a;
                Fragment fragment7 = this.f3141c;
                mVar.mo4086m(fragment7, fragment7.f2818P, fragment7.f2824b, false);
                int visibility = this.f3141c.f2818P.getVisibility();
                float alpha = this.f3141c.f2818P.getAlpha();
                if (C1114n.f3046P) {
                    this.f3141c.mo3738A1(alpha);
                    Fragment fragment8 = this.f3141c;
                    if (fragment8.f2817O != null && visibility == 0) {
                        View findFocus = fragment8.f2818P.findFocus();
                        if (findFocus != null) {
                            this.f3141c.mo3858v1(findFocus);
                            if (C1114n.m4999F0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3141c);
                            }
                        }
                        this.f3141c.f2818P.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f3141c;
                    if (visibility == 0 && fragment9.f2817O != null) {
                        z = true;
                    }
                    fragment9.f2825b0 = z;
                }
            }
            this.f3141c.f2822a = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4248g() {
        Fragment f;
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3141c);
        }
        Fragment fragment = this.f3141c;
        boolean z = true;
        boolean z2 = fragment.f2849u && !fragment.mo3787Y();
        if (z2 || this.f3140b.mo4278o().mo4230p(this.f3141c)) {
            C1109k<?> kVar = this.f3141c.f2804B;
            if (kVar instanceof C1217l0) {
                z = this.f3140b.mo4278o().mo4227m();
            } else if (kVar.mo4066f() instanceof Activity) {
                z = true ^ ((Activity) kVar.mo4066f()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f3140b.mo4278o().mo4221g(this.f3141c);
            }
            this.f3141c.mo3780U0();
            this.f3139a.mo4077d(this.f3141c, false);
            for (C1142u next : this.f3140b.mo4274k()) {
                if (next != null) {
                    Fragment k = next.mo4252k();
                    if (this.f3141c.f2832f.equals(k.f2838i)) {
                        k.f2836h = this.f3141c;
                        k.f2838i = null;
                    }
                }
            }
            Fragment fragment2 = this.f3141c;
            String str = fragment2.f2838i;
            if (str != null) {
                fragment2.f2836h = this.f3140b.mo4269f(str);
            }
            this.f3140b.mo4280q(this);
            return;
        }
        String str2 = this.f3141c.f2838i;
        if (!(str2 == null || (f = this.f3140b.mo4269f(str2)) == null || !f.f2812J)) {
            this.f3141c.f2836h = f;
        }
        this.f3141c.f2822a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4249h() {
        View view;
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3141c);
        }
        Fragment fragment = this.f3141c;
        ViewGroup viewGroup = fragment.f2817O;
        if (!(viewGroup == null || (view = fragment.f2818P) == null)) {
            viewGroup.removeView(view);
        }
        this.f3141c.mo3782V0();
        this.f3139a.mo4087n(this.f3141c, false);
        Fragment fragment2 = this.f3141c;
        fragment2.f2817O = null;
        fragment2.f2818P = null;
        fragment2.f2839i0 = null;
        fragment2.f2840j0.mo4354j(null);
        this.f3141c.f2851w = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4250i() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3141c);
        }
        this.f3141c.mo3784W0();
        boolean z = false;
        this.f3139a.mo4078e(this.f3141c, false);
        Fragment fragment = this.f3141c;
        fragment.f2822a = -1;
        fragment.f2804B = null;
        fragment.f2806D = null;
        fragment.f2803A = null;
        if (fragment.f2849u && !fragment.mo3787Y()) {
            z = true;
        }
        if (z || this.f3140b.mo4278o().mo4230p(this.f3141c)) {
            if (C1114n.m4999F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3141c);
            }
            this.f3141c.mo3778T();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4251j() {
        Fragment fragment = this.f3141c;
        if (fragment.f2850v && fragment.f2851w && !fragment.f2853y) {
            if (C1114n.m4999F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3141c);
            }
            Fragment fragment2 = this.f3141c;
            fragment2.mo3779T0(fragment2.mo3786X0(fragment2.f2824b), (ViewGroup) null, this.f3141c.f2824b);
            View view = this.f3141c.f2818P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3141c;
                fragment3.f2818P.setTag(C1834b.f5381a, fragment3);
                Fragment fragment4 = this.f3141c;
                if (fragment4.f2810H) {
                    fragment4.f2818P.setVisibility(8);
                }
                this.f3141c.mo3821k1();
                C1112m mVar = this.f3139a;
                Fragment fragment5 = this.f3141c;
                mVar.mo4086m(fragment5, fragment5.f2818P, fragment5.f2824b, false);
                this.f3141c.f2822a = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo4252k() {
        return this.f3141c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4253m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3142d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d = mo4245d();
                    Fragment fragment = this.f3141c;
                    int i = fragment.f2822a;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo4250i();
                                    break;
                                case 0:
                                    mo4248g();
                                    break;
                                case 1:
                                    mo4249h();
                                    this.f3141c.f2822a = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.f2851w = z;
                                    fragment.f2822a = 2;
                                    break;
                                case 3:
                                    if (C1114n.m4999F0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3141c);
                                    }
                                    Fragment fragment2 = this.f3141c;
                                    if (fragment2.f2818P != null && fragment2.f2826c == null) {
                                        mo4258s();
                                    }
                                    Fragment fragment3 = this.f3141c;
                                    if (!(fragment3.f2818P == null || (viewGroup2 = fragment3.f2817O) == null)) {
                                        C1077c0.m4861n(viewGroup2, fragment3.mo3742C()).mo3943d(this);
                                    }
                                    this.f3141c.f2822a = 3;
                                    break;
                                case 4:
                                    mo4261v();
                                    break;
                                case 5:
                                    fragment.f2822a = 5;
                                    break;
                                case 6:
                                    mo4254n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo4244c();
                                    break;
                                case 1:
                                    mo4246e();
                                    break;
                                case 2:
                                    mo4251j();
                                    mo4247f();
                                    break;
                                case 3:
                                    mo4242a();
                                    break;
                                case 4:
                                    if (!(fragment.f2818P == null || (viewGroup3 = fragment.f2817O) == null)) {
                                        C1077c0.m4861n(viewGroup3, fragment.mo3742C()).mo3941b(C1077c0.C1082e.C1085c.m4891b(this.f3141c.f2818P.getVisibility()), this);
                                    }
                                    this.f3141c.f2822a = 4;
                                    break;
                                case 5:
                                    mo4260u();
                                    break;
                                case 6:
                                    fragment.f2822a = 6;
                                    break;
                                case 7:
                                    mo4256p();
                                    break;
                            }
                        }
                    } else {
                        if (C1114n.f3046P && fragment.f2827c0) {
                            if (!(fragment.f2818P == null || (viewGroup = fragment.f2817O) == null)) {
                                C1077c0 n = C1077c0.m4861n(viewGroup, fragment.mo3742C());
                                if (this.f3141c.f2810H) {
                                    n.mo3942c(this);
                                } else {
                                    n.mo3944e(this);
                                }
                            }
                            Fragment fragment4 = this.f3141c;
                            C1114n nVar = fragment4.f2803A;
                            if (nVar != null) {
                                nVar.mo4097D0(fragment4);
                            }
                            Fragment fragment5 = this.f3141c;
                            fragment5.f2827c0 = z;
                            fragment5.mo3860w0(fragment5.f2810H);
                        }
                        this.f3142d = z;
                        return;
                    }
                }
            } finally {
                this.f3142d = z;
            }
        } else if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo4252k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4254n() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3141c);
        }
        this.f3141c.mo3796c1();
        this.f3139a.mo4079f(this.f3141c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4255o(ClassLoader classLoader) {
        Bundle bundle = this.f3141c.f2824b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3141c;
            fragment.f2826c = fragment.f2824b.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3141c;
            fragment2.f2828d = fragment2.f2824b.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3141c;
            fragment3.f2838i = fragment3.f2824b.getString("android:target_state");
            Fragment fragment4 = this.f3141c;
            if (fragment4.f2838i != null) {
                fragment4.f2846r = fragment4.f2824b.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3141c;
            Boolean bool = fragment5.f2830e;
            if (bool != null) {
                fragment5.f2820R = bool.booleanValue();
                this.f3141c.f2830e = null;
            } else {
                fragment5.f2820R = fragment5.f2824b.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3141c;
            if (!fragment6.f2820R) {
                fragment6.f2819Q = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4256p() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3141c);
        }
        View w = this.f3141c.mo3859w();
        if (w != null && m5180l(w)) {
            boolean requestFocus = w.requestFocus();
            if (C1114n.m4999F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(w);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3141c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3141c.f2818P.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3141c.mo3858v1((View) null);
        this.f3141c.mo3808g1();
        this.f3139a.mo4082i(this.f3141c, false);
        Fragment fragment = this.f3141c;
        fragment.f2824b = null;
        fragment.f2826c = null;
        fragment.f2828d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1140t mo4257r() {
        C1140t tVar = new C1140t(this.f3141c);
        Fragment fragment = this.f3141c;
        if (fragment.f2822a <= -1 || tVar.f3138u != null) {
            tVar.f3138u = fragment.f2824b;
        } else {
            Bundle q = m5181q();
            tVar.f3138u = q;
            if (this.f3141c.f2838i != null) {
                if (q == null) {
                    tVar.f3138u = new Bundle();
                }
                tVar.f3138u.putString("android:target_state", this.f3141c.f2838i);
                int i = this.f3141c.f2846r;
                if (i != 0) {
                    tVar.f3138u.putInt("android:target_req_state", i);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4258s() {
        if (this.f3141c.f2818P != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3141c.f2818P.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3141c.f2826c = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3141c.f2839i0.mo3904e(bundle);
            if (!bundle.isEmpty()) {
                this.f3141c.f2828d = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4259t(int i) {
        this.f3143e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4260u() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3141c);
        }
        this.f3141c.mo3815i1();
        this.f3139a.mo4084k(this.f3141c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4261v() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3141c);
        }
        this.f3141c.mo3818j1();
        this.f3139a.mo4085l(this.f3141c, false);
    }

    C1142u(C1112m mVar, C1145v vVar, ClassLoader classLoader, C1108j jVar, C1140t tVar) {
        this.f3139a = mVar;
        this.f3140b = vVar;
        Fragment a = jVar.mo4064a(classLoader, tVar.f3126a);
        this.f3141c = a;
        Bundle bundle = tVar.f3135r;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3855u1(tVar.f3135r);
        a.f2832f = tVar.f3127b;
        a.f2850v = tVar.f3128c;
        a.f2852x = true;
        a.f2807E = tVar.f3129d;
        a.f2808F = tVar.f3130e;
        a.f2809G = tVar.f3131f;
        a.f2812J = tVar.f3132g;
        a.f2849u = tVar.f3133h;
        a.f2811I = tVar.f3134i;
        a.f2810H = tVar.f3136s;
        a.f2835g0 = C1208j.C1211c.values()[tVar.f3137t];
        Bundle bundle2 = tVar.f3138u;
        if (bundle2 != null) {
            a.f2824b = bundle2;
        } else {
            a.f2824b = new Bundle();
        }
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    C1142u(C1112m mVar, C1145v vVar, Fragment fragment, C1140t tVar) {
        this.f3139a = mVar;
        this.f3140b = vVar;
        this.f3141c = fragment;
        fragment.f2826c = null;
        fragment.f2828d = null;
        fragment.f2854z = 0;
        fragment.f2851w = false;
        fragment.f2848t = false;
        Fragment fragment2 = fragment.f2836h;
        fragment.f2838i = fragment2 != null ? fragment2.f2832f : null;
        fragment.f2836h = null;
        Bundle bundle = tVar.f3138u;
        if (bundle != null) {
            fragment.f2824b = bundle;
        } else {
            fragment.f2824b = new Bundle();
        }
    }
}
