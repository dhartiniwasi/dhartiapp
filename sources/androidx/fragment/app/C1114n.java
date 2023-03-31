package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C0245g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0254a;
import androidx.activity.result.C0256b;
import androidx.activity.result.C0257c;
import androidx.activity.result.C0259e;
import androidx.core.p010os.C0763e;
import androidx.fragment.app.C1098f;
import androidx.fragment.app.C1146w;
import androidx.fragment.app.C1148x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1215k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p019c0.C1834b;
import p041f.C4246a;
import p124r.C5415b;

/* renamed from: androidx.fragment.app.n */
/* compiled from: FragmentManager */
public abstract class C1114n {

    /* renamed from: O */
    private static boolean f3045O = false;

    /* renamed from: P */
    static boolean f3046P = true;

    /* renamed from: A */
    private C0257c<C0259e> f3047A;

    /* renamed from: B */
    private C0257c<String[]> f3048B;

    /* renamed from: C */
    ArrayDeque<C1127m> f3049C = new ArrayDeque<>();

    /* renamed from: D */
    private boolean f3050D;

    /* renamed from: E */
    private boolean f3051E;

    /* renamed from: F */
    private boolean f3052F;

    /* renamed from: G */
    private boolean f3053G;

    /* renamed from: H */
    private boolean f3054H;

    /* renamed from: I */
    private ArrayList<C1057a> f3055I;

    /* renamed from: J */
    private ArrayList<Boolean> f3056J;

    /* renamed from: K */
    private ArrayList<Fragment> f3057K;

    /* renamed from: L */
    private ArrayList<C1132q> f3058L;

    /* renamed from: M */
    private C1136q f3059M;

    /* renamed from: N */
    private Runnable f3060N = new C1121g();

    /* renamed from: a */
    private final ArrayList<C1130o> f3061a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3062b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1145v f3063c = new C1145v();

    /* renamed from: d */
    ArrayList<C1057a> f3064d;

    /* renamed from: e */
    private ArrayList<Fragment> f3065e;

    /* renamed from: f */
    private final C1110l f3066f = new C1110l(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f3067g;

    /* renamed from: h */
    private final C0245g f3068h = new C1117c(false);

    /* renamed from: i */
    private final AtomicInteger f3069i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<String, Bundle> f3070j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<String, Object> f3071k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private ArrayList<C1129n> f3072l;

    /* renamed from: m */
    private Map<Fragment, HashSet<C0763e>> f3073m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1148x.C1155g f3074n = new C1118d();

    /* renamed from: o */
    private final C1112m f3075o = new C1112m(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<C1138r> f3076p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f3077q = -1;

    /* renamed from: r */
    private C1109k<?> f3078r;

    /* renamed from: s */
    private C1105g f3079s;

    /* renamed from: t */
    private Fragment f3080t;

    /* renamed from: u */
    Fragment f3081u;

    /* renamed from: v */
    private C1108j f3082v = null;

    /* renamed from: w */
    private C1108j f3083w = new C1119e();

    /* renamed from: x */
    private C1092d0 f3084x = null;

    /* renamed from: y */
    private C1092d0 f3085y = new C1120f();

    /* renamed from: z */
    private C0257c<Intent> f3086z;

    /* renamed from: androidx.fragment.app.n$a */
    /* compiled from: FragmentManager */
    class C1115a implements C0256b<C0254a> {
        C1115a() {
        }

        /* renamed from: b */
        public void mo795a(C0254a aVar) {
            C1127m pollFirst = C1114n.this.f3049C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3101a;
            int i = pollFirst.f3102b;
            Fragment i2 = C1114n.this.f3063c.mo4272i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3810h0(i, aVar.mo787b(), aVar.mo786a());
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    /* compiled from: FragmentManager */
    class C1116b implements C0256b<Map<String, Boolean>> {
        C1116b() {
        }

        /* renamed from: b */
        public void mo795a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C1127m pollFirst = C1114n.this.f3049C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3101a;
            int i2 = pollFirst.f3102b;
            Fragment i3 = C1114n.this.f3063c.mo4272i(str);
            if (i3 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i3.mo3754G0(i2, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    /* compiled from: FragmentManager */
    class C1117c extends C0245g {
        C1117c(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo770b() {
            C1114n.this.mo4093B0();
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    /* compiled from: FragmentManager */
    class C1118d implements C1148x.C1155g {
        C1118d() {
        }

        /* renamed from: a */
        public void mo4179a(Fragment fragment, C0763e eVar) {
            if (!eVar.mo3140b()) {
                C1114n.this.mo4135b1(fragment, eVar);
            }
        }

        /* renamed from: b */
        public void mo4180b(Fragment fragment, C0763e eVar) {
            C1114n.this.mo4139f(fragment, eVar);
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    /* compiled from: FragmentManager */
    class C1119e extends C1108j {
        C1119e() {
        }

        /* renamed from: a */
        public Fragment mo4064a(ClassLoader classLoader, String str) {
            return C1114n.this.mo4166t0().mo4022b(C1114n.this.mo4166t0().mo4066f(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.n$f */
    /* compiled from: FragmentManager */
    class C1120f implements C1092d0 {
        C1120f() {
        }

        /* renamed from: a */
        public C1077c0 mo3985a(ViewGroup viewGroup) {
            return new C1062c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.n$g */
    /* compiled from: FragmentManager */
    class C1121g implements Runnable {
        C1121g() {
        }

        public void run() {
            C1114n.this.mo4132a0(true);
        }
    }

    /* renamed from: androidx.fragment.app.n$h */
    /* compiled from: FragmentManager */
    class C1122h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3094a;

        /* renamed from: b */
        final /* synthetic */ View f3095b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3096c;

        C1122h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3094a = viewGroup;
            this.f3095b = view;
            this.f3096c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3094a.endViewTransition(this.f3095b);
            animator.removeListener(this);
            Fragment fragment = this.f3096c;
            View view = fragment.f2818P;
            if (view != null && fragment.f2810H) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$i */
    /* compiled from: FragmentManager */
    class C1123i implements C1138r {

        /* renamed from: a */
        final /* synthetic */ Fragment f3098a;

        C1123i(Fragment fragment) {
            this.f3098a = fragment;
        }

        /* renamed from: a */
        public void mo4008a(C1114n nVar, Fragment fragment) {
            this.f3098a.mo3820k0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.n$j */
    /* compiled from: FragmentManager */
    class C1124j implements C0256b<C0254a> {
        C1124j() {
        }

        /* renamed from: b */
        public void mo795a(C0254a aVar) {
            C1127m pollFirst = C1114n.this.f3049C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3101a;
            int i = pollFirst.f3102b;
            Fragment i2 = C1114n.this.f3063c.mo4272i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3810h0(i, aVar.mo787b(), aVar.mo786a());
        }
    }

    /* renamed from: androidx.fragment.app.n$k */
    /* compiled from: FragmentManager */
    static class C1125k extends C4246a<C0259e, C0254a> {
        C1125k() {
        }

        /* renamed from: d */
        public Intent mo4184a(Context context, C0259e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = eVar.mo797a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new C0259e.C0261b(eVar.mo800d()).mo808b((Intent) null).mo809c(eVar.mo799c(), eVar.mo798b()).mo807a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public C0254a mo4185c(int i, Intent intent) {
            return new C0254a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.n$l */
    /* compiled from: FragmentManager */
    public static abstract class C1126l {
        @Deprecated
        /* renamed from: a */
        public void mo4188a(C1114n nVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo4189b(C1114n nVar, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void mo4190c(C1114n nVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo4191d(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo4192e(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo4193f(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo4194g(C1114n nVar, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void mo4195h(C1114n nVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo4196i(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: j */
        public void mo4197j(C1114n nVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo4198k(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: l */
        public void mo4199l(C1114n nVar, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo4200m(C1114n nVar, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void mo4201n(C1114n nVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.n$n */
    /* compiled from: FragmentManager */
    public interface C1129n {
        /* renamed from: a */
        void mo4208a();
    }

    /* renamed from: androidx.fragment.app.n$o */
    /* compiled from: FragmentManager */
    interface C1130o {
        /* renamed from: a */
        boolean mo3882a(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.n$p */
    /* compiled from: FragmentManager */
    private class C1131p implements C1130o {

        /* renamed from: a */
        final String f3103a;

        /* renamed from: b */
        final int f3104b;

        /* renamed from: c */
        final int f3105c;

        C1131p(String str, int i, int i2) {
            this.f3103a = str;
            this.f3104b = i;
            this.f3105c = i2;
        }

        /* renamed from: a */
        public boolean mo3882a(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C1114n.this.f3081u;
            if (fragment != null && this.f3104b < 0 && this.f3103a == null && fragment.mo3831o().mo4129W0()) {
                return false;
            }
            return C1114n.this.mo4131Y0(arrayList, arrayList2, this.f3103a, this.f3104b, this.f3105c);
        }
    }

    /* renamed from: androidx.fragment.app.n$q */
    /* compiled from: FragmentManager */
    static class C1132q implements Fragment.C1056h {

        /* renamed from: a */
        final boolean f3107a;

        /* renamed from: b */
        final C1057a f3108b;

        /* renamed from: c */
        private int f3109c;

        C1132q(C1057a aVar, boolean z) {
            this.f3107a = z;
            this.f3108b = aVar;
        }

        /* renamed from: a */
        public void mo3876a() {
            this.f3109c++;
        }

        /* renamed from: b */
        public void mo3877b() {
            int i = this.f3109c - 1;
            this.f3109c = i;
            if (i == 0) {
                this.f3108b.f2890t.mo4148i1();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4209c() {
            C1057a aVar = this.f3108b;
            aVar.f2890t.mo4165t(aVar, this.f3107a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4210d() {
            boolean z = this.f3109c > 0;
            for (Fragment next : this.f3108b.f2890t.mo4164s0()) {
                next.mo3867y1((Fragment.C1056h) null);
                if (z && next.mo3791a0()) {
                    next.mo3750E1();
                }
            }
            C1057a aVar = this.f3108b;
            aVar.f2890t.mo4165t(aVar, this.f3107a, !z, true);
        }

        /* renamed from: e */
        public boolean mo4211e() {
            return this.f3109c == 0;
        }
    }

    /* renamed from: F0 */
    static boolean m4999F0(int i) {
        return f3045O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: G0 */
    private boolean m5000G0(Fragment fragment) {
        return (fragment.f2814L && fragment.f2815M) || fragment.f2805C.mo4157n();
    }

    /* renamed from: L */
    private void m5001L(Fragment fragment) {
        if (fragment != null && fragment.equals(mo4142g0(fragment.f2832f))) {
            fragment.mo3806f1();
        }
    }

    /* renamed from: N0 */
    private void m5002N0(C5415b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment o = bVar.mo19562o(i);
            if (!o.f2848t) {
                View n1 = o.mo3830n1();
                o.f2829d0 = n1.getAlpha();
                n1.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: S */
    private void m5003S(int i) {
        try {
            this.f3062b = true;
            this.f3063c.mo4267d(i);
            mo4117P0(i, false);
            if (f3046P) {
                for (C1077c0 j : m5029r()) {
                    j.mo3946j();
                }
            }
            this.f3062b = false;
            mo4132a0(true);
        } catch (Throwable th) {
            this.f3062b = false;
            throw th;
        }
    }

    /* renamed from: V */
    private void m5004V() {
        if (this.f3054H) {
            this.f3054H = false;
            m5025o1();
        }
    }

    /* renamed from: X */
    private void m5005X() {
        if (f3046P) {
            for (C1077c0 j : m5029r()) {
                j.mo3946j();
            }
        } else if (!this.f3073m.isEmpty()) {
            for (Fragment next : this.f3073m.keySet()) {
                m5021m(next);
                mo4119Q0(next);
            }
        }
    }

    /* renamed from: X0 */
    private boolean m5006X0(String str, int i, int i2) {
        mo4132a0(false);
        m5007Z(true);
        Fragment fragment = this.f3081u;
        if (fragment != null && i < 0 && str == null && fragment.mo3831o().mo4129W0()) {
            return true;
        }
        boolean Y0 = mo4131Y0(this.f3055I, this.f3056J, str, i, i2);
        if (Y0) {
            this.f3062b = true;
            try {
                m5015d1(this.f3055I, this.f3056J);
            } finally {
                m5026p();
            }
        }
        m5028q1();
        m5004V();
        this.f3063c.mo4265b();
        return Y0;
    }

    /* renamed from: Z */
    private void m5007Z(boolean z) {
        if (this.f3062b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3078r == null) {
            if (this.f3053G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3078r.mo4067g().getLooper()) {
            if (!z) {
                m5024o();
            }
            if (this.f3055I == null) {
                this.f3055I = new ArrayList<>();
                this.f3056J = new ArrayList<>();
            }
            this.f3062b = true;
            try {
                m5017f0((ArrayList<C1057a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3062b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: Z0 */
    private int m5008Z0(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C5415b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1057a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3878A() && !aVar.mo3899y(arrayList, i4 + 1, i2)) {
                if (this.f3058L == null) {
                    this.f3058L = new ArrayList<>();
                }
                C1132q qVar = new C1132q(aVar, booleanValue);
                this.f3058L.add(qVar);
                aVar.mo3880C(qVar);
                if (booleanValue) {
                    aVar.mo3893t();
                } else {
                    aVar.mo3895u(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m5013d(bVar);
            }
        }
        return i3;
    }

    /* renamed from: c0 */
    private static void m5012c0(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1057a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3889p(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3895u(z);
            } else {
                aVar.mo3889p(1);
                aVar.mo3893t();
            }
            i++;
        }
    }

    /* renamed from: d */
    private void m5013d(C5415b<Fragment> bVar) {
        int i = this.f3077q;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment next : this.f3063c.mo4277n()) {
                if (next.f2822a < min) {
                    mo4121R0(next, min);
                    if (next.f2818P != null && !next.f2810H && next.f2825b0) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5014d0(java.util.ArrayList<androidx.fragment.app.C1057a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C1057a) r0
            boolean r2 = r0.f3167r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3057K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f3057K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3057K
            androidx.fragment.app.v r1 = r6.f3063c
            java.util.List r1 = r1.mo4277n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.mo4173x0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C1057a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3057K
            androidx.fragment.app.Fragment r0 = r8.mo3896v(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.f3057K
            androidx.fragment.app.Fragment r0 = r8.mo3881D(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f3158i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.f3057K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f3077q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = f3046P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.C1057a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.f3152c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.C1146w.C1147a) r7
            androidx.fragment.app.Fragment r7 = r7.f3170b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.f2803A
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.mo4169v(r7)
            androidx.fragment.app.v r8 = r6.f3063c
            r8.mo4279p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f3078r
            android.content.Context r7 = r0.mo4066f()
            androidx.fragment.app.g r8 = r6.f3079s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f3074n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.C1148x.m5241B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            m5012c0(r18, r19, r20, r21)
            boolean r0 = f3046P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C1057a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.f3152c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.f3152c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.C1146w.C1147a) r9
            androidx.fragment.app.Fragment r9 = r9.f3170b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.mo4169v(r9)
            r9.mo4253m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.f3152c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.C1146w.C1147a) r8
            androidx.fragment.app.Fragment r8 = r8.f3170b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.mo4169v(r8)
            r8.mo4253m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f3077q
            r6.mo4117P0(r2, r1)
            java.util.Set r1 = r6.m5030s(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.C1077c0) r2
            r2.mo3951r(r0)
            r2.mo3950p()
            r2.mo3945g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            r.b r7 = new r.b
            r7.<init>()
            r6.m5013d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.m5008Z0(r1, r2, r3, r4, r5)
            r6.m5002N0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f3077q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f3078r
            android.content.Context r7 = r1.mo4066f()
            androidx.fragment.app.g r8 = r6.f3079s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f3074n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.C1148x.m5241B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f3077q
            r6.mo4117P0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C1057a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f2892v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f2892v = r4
        L_0x01b6:
            r2.mo3879B()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.m5016e1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1114n.m5014d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: d1 */
    private void m5015d1(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m5017f0(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3167r) {
                        if (i2 != i) {
                            m5014d0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3167r) {
                                i2++;
                            }
                        }
                        m5014d0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m5014d0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: e1 */
    private void m5016e1() {
        if (this.f3072l != null) {
            for (int i = 0; i < this.f3072l.size(); i++) {
                this.f3072l.get(i).mo4208a();
            }
        }
    }

    /* renamed from: f0 */
    private void m5017f0(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1132q> arrayList3 = this.f3058L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1132q qVar = this.f3058L.get(i);
            if (arrayList != null && !qVar.f3107a && (indexOf2 = arrayList.indexOf(qVar.f3108b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3058L.remove(i);
                i--;
                size--;
                qVar.mo4209c();
            } else if (qVar.mo4211e() || (arrayList != null && qVar.f3108b.mo3899y(arrayList, 0, arrayList.size()))) {
                this.f3058L.remove(i);
                i--;
                size--;
                if (arrayList == null || qVar.f3107a || (indexOf = arrayList.indexOf(qVar.f3108b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    qVar.mo4210d();
                } else {
                    qVar.mo4209c();
                }
            }
            i++;
        }
    }

    /* renamed from: g1 */
    static int m5018g1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: k0 */
    private void m5019k0() {
        if (f3046P) {
            for (C1077c0 k : m5029r()) {
                k.mo3947k();
            }
        } else if (this.f3058L != null) {
            while (!this.f3058L.isEmpty()) {
                this.f3058L.remove(0).mo4210d();
            }
        }
    }

    /* renamed from: l0 */
    private boolean m5020l0(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3061a) {
            if (this.f3061a.isEmpty()) {
                return false;
            }
            int size = this.f3061a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3061a.get(i).mo3882a(arrayList, arrayList2);
            }
            this.f3061a.clear();
            this.f3078r.mo4067g().removeCallbacks(this.f3060N);
            return z;
        }
    }

    /* renamed from: m */
    private void m5021m(Fragment fragment) {
        HashSet hashSet = this.f3073m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C0763e) it.next()).mo3139a();
            }
            hashSet.clear();
            m5032w(fragment);
            this.f3073m.remove(fragment);
        }
    }

    /* renamed from: m1 */
    private void m5022m1(Fragment fragment) {
        ViewGroup p0 = m5027p0(fragment);
        if (p0 != null && fragment.mo3839q() + fragment.mo3849t() + fragment.mo3748E() + fragment.mo3751F() > 0) {
            int i = C1834b.f5383c;
            if (p0.getTag(i) == null) {
                p0.setTag(i, fragment);
            }
            ((Fragment) p0.getTag(i)).mo3869z1(fragment.mo3745D());
        }
    }

    /* renamed from: n0 */
    private C1136q m5023n0(Fragment fragment) {
        return this.f3059M.mo4224i(fragment);
    }

    /* renamed from: o */
    private void m5024o() {
        if (mo4109K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: o1 */
    private void m5025o1() {
        for (C1142u U0 : this.f3063c.mo4274k()) {
            mo4126U0(U0);
        }
    }

    /* renamed from: p */
    private void m5026p() {
        this.f3062b = false;
        this.f3056J.clear();
        this.f3055I.clear();
    }

    /* renamed from: p0 */
    private ViewGroup m5027p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2817O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2808F > 0 && this.f3079s.mo3874d()) {
            View c = this.f3079s.mo3873c(fragment.f2808F);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo4156m0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo4105I0(r3.f3080t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo774f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3068h;
     */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5028q1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$o> r0 = r3.f3061a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$o> r1 = r3.f3061a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.g r1 = r3.f3068h     // Catch:{ all -> 0x002a }
            r1.mo774f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.g r0 = r3.f3068h
            int r1 = r3.mo4156m0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3080t
            boolean r1 = r3.mo4105I0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo774f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1114n.m5028q1():void");
    }

    /* renamed from: r */
    private Set<C1077c0> m5029r() {
        HashSet hashSet = new HashSet();
        for (C1142u k : this.f3063c.mo4274k()) {
            ViewGroup viewGroup = k.mo4252k().f2817O;
            if (viewGroup != null) {
                hashSet.add(C1077c0.m4862o(viewGroup, mo4175y0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s */
    private Set<C1077c0> m5030s(ArrayList<C1057a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C1146w.C1147a> it = arrayList.get(i).f3152c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3170b;
                if (!(fragment == null || (viewGroup = fragment.f2817O) == null)) {
                    hashSet.add(C1077c0.m4861n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: u */
    private void m5031u(Fragment fragment) {
        Animator animator;
        if (fragment.f2818P != null) {
            C1098f.C1103d c = C1098f.m4937c(this.f3078r.mo4066f(), fragment, !fragment.f2810H, fragment.mo3745D());
            if (c == null || (animator = c.f3021b) == null) {
                if (c != null) {
                    fragment.f2818P.startAnimation(c.f3020a);
                    c.f3020a.start();
                }
                fragment.f2818P.setVisibility((!fragment.f2810H || fragment.mo3785X()) ? 0 : 8);
                if (fragment.mo3785X()) {
                    fragment.mo3861w1(false);
                }
            } else {
                animator.setTarget(fragment.f2818P);
                if (!fragment.f2810H) {
                    fragment.f2818P.setVisibility(0);
                } else if (fragment.mo3785X()) {
                    fragment.mo3861w1(false);
                } else {
                    ViewGroup viewGroup = fragment.f2817O;
                    View view = fragment.f2818P;
                    viewGroup.startViewTransition(view);
                    c.f3021b.addListener(new C1122h(viewGroup, view, fragment));
                }
                c.f3021b.start();
            }
        }
        mo4097D0(fragment);
        fragment.f2827c0 = false;
        fragment.mo3860w0(fragment.f2810H);
    }

    /* renamed from: w */
    private void m5032w(Fragment fragment) {
        fragment.mo3782V0();
        this.f3075o.mo4087n(fragment, false);
        fragment.f2817O = null;
        fragment.f2818P = null;
        fragment.f2839i0 = null;
        fragment.f2840j0.mo4354j(null);
        fragment.f2851w = false;
    }

    /* renamed from: z0 */
    static Fragment m5033z0(View view) {
        Object tag = view.getTag(C1834b.f5381a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4090A(Configuration configuration) {
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null) {
                next.mo3772P0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public C1215k0 mo4091A0(Fragment fragment) {
        return this.f3059M.mo4226l(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo4092B(MenuItem menuItem) {
        if (this.f3077q < 1) {
            return false;
        }
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null && next.mo3774Q0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo4093B0() {
        mo4132a0(true);
        if (this.f3068h.mo771c()) {
            mo4129W0();
        } else {
            this.f3067g.mo759c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo4094C() {
        this.f3051E = false;
        this.f3052F = false;
        this.f3059M.mo4229o(false);
        m5003S(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4095C0(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2810H) {
            fragment.f2810H = true;
            fragment.f2827c0 = true ^ fragment.f2827c0;
            m5022m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo4096D(Menu menu, MenuInflater menuInflater) {
        if (this.f3077q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null && mo4103H0(next) && next.mo3777S0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3065e != null) {
            for (int i = 0; i < this.f3065e.size(); i++) {
                Fragment fragment = this.f3065e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3846s0();
                }
            }
        }
        this.f3065e = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo4097D0(Fragment fragment) {
        if (fragment.f2848t && m5000G0(fragment)) {
            this.f3050D = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo4098E() {
        this.f3053G = true;
        mo4132a0(true);
        m5005X();
        m5003S(-1);
        this.f3078r = null;
        this.f3079s = null;
        this.f3080t = null;
        if (this.f3067g != null) {
            this.f3068h.mo772d();
            this.f3067g = null;
        }
        C0257c<Intent> cVar = this.f3086z;
        if (cVar != null) {
            cVar.mo783c();
            this.f3047A.mo783c();
            this.f3048B.mo783c();
        }
    }

    /* renamed from: E0 */
    public boolean mo4099E0() {
        return this.f3053G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo4100F() {
        m5003S(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4101G() {
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null) {
                next.mo3788Y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4102H(boolean z) {
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null) {
                next.mo3790Z0(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean mo4103H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo3789Z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4104I(Fragment fragment) {
        Iterator<C1138r> it = this.f3076p.iterator();
        while (it.hasNext()) {
            it.next().mo4008a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo4105I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C1114n nVar = fragment.f2803A;
        if (!fragment.equals(nVar.mo4173x0()) || !mo4105I0(nVar.f3080t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo4106J(MenuItem menuItem) {
        if (this.f3077q < 1) {
            return false;
        }
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null && next.mo3792a1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean mo4107J0(int i) {
        return this.f3077q >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4108K(Menu menu) {
        if (this.f3077q >= 1) {
            for (Fragment next : this.f3063c.mo4277n()) {
                if (next != null) {
                    next.mo3794b1(menu);
                }
            }
        }
    }

    /* renamed from: K0 */
    public boolean mo4109K0() {
        return this.f3051E || this.f3052F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo4110L0(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.f3086z != null) {
            this.f3049C.addLast(new C1127m(fragment.f2832f, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3086z.mo796a(intent);
            return;
        }
        this.f3078r.mo4068k(fragment, intent, i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4111M() {
        m5003S(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo4112M0(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f3047A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m4999F0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            C0259e a = new C0259e.C0261b(intentSender).mo808b(intent2).mo809c(i3, i2).mo807a();
            int i5 = i;
            this.f3049C.addLast(new C1127m(fragment2.f2832f, i));
            if (m4999F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f3047A.mo796a(a);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        this.f3078r.mo4069l(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4113N(boolean z) {
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null) {
                next.mo3799d1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo4114O(Menu menu) {
        boolean z = false;
        if (this.f3077q < 1) {
            return false;
        }
        for (Fragment next : this.f3063c.mo4277n()) {
            if (next != null && mo4103H0(next) && next.mo3802e1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo4115O0(Fragment fragment) {
        if (this.f3063c.mo4266c(fragment.f2832f)) {
            mo4119Q0(fragment);
            View view = fragment.f2818P;
            if (!(view == null || !fragment.f2825b0 || fragment.f2817O == null)) {
                float f = fragment.f2829d0;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                fragment.f2829d0 = 0.0f;
                fragment.f2825b0 = false;
                C1098f.C1103d c = C1098f.m4937c(this.f3078r.mo4066f(), fragment, true, fragment.mo3745D());
                if (c != null) {
                    Animation animation = c.f3020a;
                    if (animation != null) {
                        fragment.f2818P.startAnimation(animation);
                    } else {
                        c.f3021b.setTarget(fragment.f2818P);
                        c.f3021b.start();
                    }
                }
            }
            if (fragment.f2827c0) {
                m5031u(fragment);
            }
        } else if (m4999F0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3077q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4116P() {
        m5028q1();
        m5001L(this.f3081u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo4117P0(int i, boolean z) {
        C1109k<?> kVar;
        if (this.f3078r == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3077q) {
            this.f3077q = i;
            if (f3046P) {
                this.f3063c.mo4281r();
            } else {
                for (Fragment O0 : this.f3063c.mo4277n()) {
                    mo4115O0(O0);
                }
                for (C1142u next : this.f3063c.mo4274k()) {
                    Fragment k = next.mo4252k();
                    if (!k.f2825b0) {
                        mo4115O0(k);
                    }
                    if (k.f2849u && !k.mo3787Y()) {
                        this.f3063c.mo4280q(next);
                    }
                }
            }
            m5025o1();
            if (this.f3050D && (kVar = this.f3078r) != null && this.f3077q == 7) {
                kVar.mo4012m();
                this.f3050D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo4118Q() {
        this.f3051E = false;
        this.f3052F = false;
        this.f3059M.mo4229o(false);
        m5003S(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo4119Q0(Fragment fragment) {
        mo4121R0(fragment, this.f3077q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4120R() {
        this.f3051E = false;
        this.f3052F = false;
        this.f3059M.mo4229o(false);
        m5003S(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4121R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.v r0 = r10.f3063c
            java.lang.String r1 = r11.f2832f
            androidx.fragment.app.u r0 = r0.mo4276m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f3075o
            androidx.fragment.app.v r3 = r10.f3063c
            r0.<init>(r2, r3, r11)
            r0.mo4259t(r1)
        L_0x0017:
            boolean r2 = r11.f2850v
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.f2851w
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f2822a
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.mo4245d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f2822a
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3073m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m5021m(r11)
        L_0x0047:
            int r2 = r11.f2822a
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.mo4244c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.mo4246e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.mo4251j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.mo4247f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.mo4242a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.mo4260u()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.mo4256p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.mo4254n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.mo4261v()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = m4999F0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.f2818P
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f3078r
            boolean r2 = r2.mo4011j(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f2826c
            if (r2 != 0) goto L_0x00c6
            r0.mo4258s()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.f2818P
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.f2817O
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.f2818P
            r7.clearAnimation()
            boolean r7 = r11.mo3795c0()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f3077q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.f3053G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.f2818P
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.f2829d0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f3078r
            android.content.Context r2 = r2.mo4066f()
            r6 = 0
            boolean r7 = r11.mo3745D()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.C1098f.m4937c(r2, r11, r6, r7)
        L_0x0105:
            r11.f2829d0 = r8
            android.view.ViewGroup r6 = r11.f2817O
            android.view.View r7 = r11.f2818P
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.x$g r8 = r10.f3074n
            androidx.fragment.app.C1098f.m4935a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = m4999F0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.f2817O
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3073m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.mo4249h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f3073m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.mo4248g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.mo4250i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.f2822a
            if (r0 == r12) goto L_0x0196
            boolean r0 = m4999F0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f2822a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.f2822a = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1114n.mo4121R0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo4122S0() {
        if (this.f3078r != null) {
            this.f3051E = false;
            this.f3052F = false;
            this.f3059M.mo4229o(false);
            for (Fragment next : this.f3063c.mo4277n()) {
                if (next != null) {
                    next.mo3805f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo4123T() {
        this.f3052F = true;
        this.f3059M.mo4229o(true);
        m5003S(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo4124T0(C1106h hVar) {
        View view;
        for (C1142u next : this.f3063c.mo4274k()) {
            Fragment k = next.mo4252k();
            if (k.f2808F == hVar.getId() && (view = k.f2818P) != null && view.getParent() == null) {
                k.f2817O = hVar;
                next.mo4243b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4125U() {
        m5003S(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo4126U0(C1142u uVar) {
        Fragment k = uVar.mo4252k();
        if (!k.f2819Q) {
            return;
        }
        if (this.f3062b) {
            this.f3054H = true;
            return;
        }
        k.f2819Q = false;
        if (f3046P) {
            uVar.mo4253m();
        } else {
            mo4119Q0(k);
        }
    }

    /* renamed from: V0 */
    public void mo4127V0(int i, int i2) {
        if (i >= 0) {
            mo4130Y(new C1131p((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: W */
    public void mo4128W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3063c.mo4268e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3065e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3065e.get(i).toString());
            }
        }
        ArrayList<C1057a> arrayList2 = this.f3064d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1057a aVar = this.f3064d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3891r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3069i.get());
        synchronized (this.f3061a) {
            int size3 = this.f3061a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3061a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3078r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3079s);
        if (this.f3080t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3080t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3077q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3051E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3052F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3053G);
        if (this.f3050D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3050D);
        }
    }

    /* renamed from: W0 */
    public boolean mo4129W0() {
        return m5006X0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo4130Y(C1130o oVar, boolean z) {
        if (!z) {
            if (this.f3078r != null) {
                m5024o();
            } else if (this.f3053G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3061a) {
            if (this.f3078r != null) {
                this.f3061a.add(oVar);
                mo4148i1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public boolean mo4131Y0(ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1057a> arrayList3 = this.f3064d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3064d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1057a aVar = this.f3064d.get(size2);
                    if ((str != null && str.equals(aVar.mo3897w())) || (i >= 0 && i == aVar.f2892v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1057a aVar2 = this.f3064d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3897w())) && (i < 0 || i != aVar2.f2892v)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3064d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3064d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3064d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo4132a0(boolean z) {
        m5007Z(z);
        boolean z2 = false;
        while (m5020l0(this.f3055I, this.f3056J)) {
            this.f3062b = true;
            try {
                m5015d1(this.f3055I, this.f3056J);
                m5026p();
                z2 = true;
            } catch (Throwable th) {
                m5026p();
                throw th;
            }
        }
        m5028q1();
        m5004V();
        this.f3063c.mo4265b();
        return z2;
    }

    /* renamed from: a1 */
    public void mo4133a1(C1126l lVar, boolean z) {
        this.f3075o.mo4088o(lVar, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo4134b0(C1130o oVar, boolean z) {
        if (!z || (this.f3078r != null && !this.f3053G)) {
            m5007Z(z);
            if (oVar.mo3882a(this.f3055I, this.f3056J)) {
                this.f3062b = true;
                try {
                    m5015d1(this.f3055I, this.f3056J);
                } finally {
                    m5026p();
                }
            }
            m5028q1();
            m5004V();
            this.f3063c.mo4265b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo4135b1(Fragment fragment, C0763e eVar) {
        HashSet hashSet = this.f3073m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f3073m.remove(fragment);
            if (fragment.f2822a < 5) {
                m5032w(fragment);
                mo4119Q0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo4136c1(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2854z);
        }
        boolean z = !fragment.mo3787Y();
        if (!fragment.f2811I || z) {
            this.f3063c.mo4282s(fragment);
            if (m5000G0(fragment)) {
                this.f3050D = true;
            }
            fragment.f2849u = true;
            m5022m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4137e(C1057a aVar) {
        if (this.f3064d == null) {
            this.f3064d = new ArrayList<>();
        }
        this.f3064d.add(aVar);
    }

    /* renamed from: e0 */
    public boolean mo4138e0() {
        boolean a0 = mo4132a0(true);
        m5019k0();
        return a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4139f(Fragment fragment, C0763e eVar) {
        if (this.f3073m.get(fragment) == null) {
            this.f3073m.put(fragment, new HashSet());
        }
        this.f3073m.get(fragment).add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo4140f1(Parcelable parcelable) {
        C1142u uVar;
        if (parcelable != null) {
            C1134p pVar = (C1134p) parcelable;
            if (pVar.f3110a != null) {
                this.f3063c.mo4283t();
                Iterator<C1140t> it = pVar.f3110a.iterator();
                while (it.hasNext()) {
                    C1140t next = it.next();
                    if (next != null) {
                        Fragment h = this.f3059M.mo4222h(next.f3127b);
                        if (h != null) {
                            if (m4999F0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h);
                            }
                            uVar = new C1142u(this.f3075o, this.f3063c, h, next);
                        } else {
                            uVar = new C1142u(this.f3075o, this.f3063c, this.f3078r.mo4066f().getClassLoader(), mo4162q0(), next);
                        }
                        Fragment k = uVar.mo4252k();
                        k.f2803A = this;
                        if (m4999F0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.f2832f + "): " + k);
                        }
                        uVar.mo4255o(this.f3078r.mo4066f().getClassLoader());
                        this.f3063c.mo4279p(uVar);
                        uVar.mo4259t(this.f3077q);
                    }
                }
                for (Fragment next2 : this.f3059M.mo4225k()) {
                    if (!this.f3063c.mo4266c(next2.f2832f)) {
                        if (m4999F0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + pVar.f3110a);
                        }
                        this.f3059M.mo4228n(next2);
                        next2.f2803A = this;
                        C1142u uVar2 = new C1142u(this.f3075o, this.f3063c, next2);
                        uVar2.mo4259t(1);
                        uVar2.mo4253m();
                        next2.f2849u = true;
                        uVar2.mo4253m();
                    }
                }
                this.f3063c.mo4284u(pVar.f3111b);
                if (pVar.f3112c != null) {
                    this.f3064d = new ArrayList<>(pVar.f3112c.length);
                    int i = 0;
                    while (true) {
                        C1059b[] bVarArr = pVar.f3112c;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C1057a a = bVarArr[i].mo3906a(this);
                        if (m4999F0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a.f2892v + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C1061b0("FragmentManager"));
                            a.mo3892s("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3064d.add(a);
                        i++;
                    }
                } else {
                    this.f3064d = null;
                }
                this.f3069i.set(pVar.f3113d);
                String str = pVar.f3114e;
                if (str != null) {
                    Fragment g0 = mo4142g0(str);
                    this.f3081u = g0;
                    m5001L(g0);
                }
                ArrayList<String> arrayList = pVar.f3115f;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Bundle bundle = pVar.f3116g.get(i2);
                        bundle.setClassLoader(this.f3078r.mo4066f().getClassLoader());
                        this.f3070j.put(arrayList.get(i2), bundle);
                    }
                }
                this.f3049C = new ArrayDeque<>(pVar.f3117h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1142u mo4141g(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1142u v = mo4169v(fragment);
        fragment.f2803A = this;
        this.f3063c.mo4279p(v);
        if (!fragment.f2811I) {
            this.f3063c.mo4264a(fragment);
            fragment.f2849u = false;
            if (fragment.f2818P == null) {
                fragment.f2827c0 = false;
            }
            if (m5000G0(fragment)) {
                this.f3050D = true;
            }
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public Fragment mo4142g0(String str) {
        return this.f3063c.mo4269f(str);
    }

    /* renamed from: h */
    public void mo4143h(C1138r rVar) {
        this.f3076p.add(rVar);
    }

    /* renamed from: h0 */
    public Fragment mo4144h0(int i) {
        return this.f3063c.mo4270g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public Parcelable mo4145h1() {
        int size;
        m5019k0();
        m5005X();
        mo4132a0(true);
        this.f3051E = true;
        this.f3059M.mo4229o(true);
        ArrayList<C1140t> v = this.f3063c.mo4285v();
        C1059b[] bVarArr = null;
        if (v.isEmpty()) {
            if (m4999F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w = this.f3063c.mo4286w();
        ArrayList<C1057a> arrayList = this.f3064d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C1059b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C1059b(this.f3064d.get(i));
                if (m4999F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3064d.get(i));
                }
            }
        }
        C1134p pVar = new C1134p();
        pVar.f3110a = v;
        pVar.f3111b = w;
        pVar.f3112c = bVarArr;
        pVar.f3113d = this.f3069i.get();
        Fragment fragment = this.f3081u;
        if (fragment != null) {
            pVar.f3114e = fragment.f2832f;
        }
        pVar.f3115f.addAll(this.f3070j.keySet());
        pVar.f3116g.addAll(this.f3070j.values());
        pVar.f3117h = new ArrayList<>(this.f3049C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo4146i() {
        return this.f3069i.getAndIncrement();
    }

    /* renamed from: i0 */
    public Fragment mo4147i0(String str) {
        return this.f3063c.mo4271h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo4148i1() {
        synchronized (this.f3061a) {
            ArrayList<C1132q> arrayList = this.f3058L;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f3061a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3078r.mo4067g().removeCallbacks(this.f3060N);
                this.f3078r.mo4067g().post(this.f3060N);
                m5028q1();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4149j(androidx.fragment.app.C1109k<?> r3, androidx.fragment.app.C1105g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f3078r
            if (r0 != 0) goto L_0x0108
            r2.f3078r = r3
            r2.f3079s = r4
            r2.f3080t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
            r2.mo4143h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.C1138r
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.C1138r) r4
            r2.mo4143h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f3080t
            if (r4 == 0) goto L_0x0026
            r2.m5028q1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.C0246h
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.h r4 = (androidx.activity.C0246h) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f3067g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.g r1 = r2.f3068h
            r0.mo757a(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.n r3 = r5.f2803A
            androidx.fragment.app.q r3 = r3.m5023n0(r5)
            r2.f3059M = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.C1217l0
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.l0 r3 = (androidx.lifecycle.C1217l0) r3
            androidx.lifecycle.k0 r3 = r3.getViewModelStore()
            androidx.fragment.app.q r3 = androidx.fragment.app.C1136q.m5162j(r3)
            r2.f3059M = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            r2.f3059M = r3
        L_0x005f:
            androidx.fragment.app.q r3 = r2.f3059M
            boolean r4 = r2.mo4109K0()
            r3.mo4229o(r4)
            androidx.fragment.app.v r3 = r2.f3063c
            androidx.fragment.app.q r4 = r2.f3059M
            r3.mo4287x(r4)
            androidx.fragment.app.k<?> r3 = r2.f3078r
            boolean r4 = r3 instanceof androidx.activity.result.C0258d
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.d r3 = (androidx.activity.result.C0258d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f2832f
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            f.c r0 = new f.c
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo780j(r5, r0, r1)
            r2.f3086z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.mo780j(r5, r0, r1)
            r2.f3047A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            f.b r5 = new f.b
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.mo780j(r4, r5, r0)
            r2.f3048B = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1114n.mo4149j(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Fragment mo4150j0(String str) {
        return this.f3063c.mo4272i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo4151j1(Fragment fragment, boolean z) {
        ViewGroup p0 = m5027p0(fragment);
        if (p0 != null && (p0 instanceof C1106h)) {
            ((C1106h) p0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4152k(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2811I) {
            fragment.f2811I = false;
            if (!fragment.f2848t) {
                this.f3063c.mo4264a(fragment);
                if (m4999F0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m5000G0(fragment)) {
                    this.f3050D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo4153k1(Fragment fragment, C1208j.C1211c cVar) {
        if (!fragment.equals(mo4142g0(fragment.f2832f)) || !(fragment.f2804B == null || fragment.f2803A == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2835g0 = cVar;
    }

    /* renamed from: l */
    public C1146w mo4154l() {
        return new C1057a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo4155l1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo4142g0(fragment.f2832f)) && (fragment.f2804B == null || fragment.f2803A == this))) {
            Fragment fragment2 = this.f3081u;
            this.f3081u = fragment;
            m5001L(fragment2);
            m5001L(this.f3081u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m0 */
    public int mo4156m0() {
        ArrayList<C1057a> arrayList = this.f3064d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4157n() {
        boolean z = false;
        for (Fragment next : this.f3063c.mo4275l()) {
            if (next != null) {
                z = m5000G0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo4158n1(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2810H) {
            fragment.f2810H = false;
            fragment.f2827c0 = !fragment.f2827c0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public C1105g mo4159o0() {
        return this.f3079s;
    }

    /* renamed from: p1 */
    public void mo4160p1(C1126l lVar) {
        this.f3075o.mo4089p(lVar);
    }

    /* renamed from: q */
    public final void mo4161q(String str) {
        this.f3070j.remove(str);
    }

    /* renamed from: q0 */
    public C1108j mo4162q0() {
        C1108j jVar = this.f3082v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f3080t;
        if (fragment != null) {
            return fragment.f2803A.mo4162q0();
        }
        return this.f3083w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C1145v mo4163r0() {
        return this.f3063c;
    }

    /* renamed from: s0 */
    public List<Fragment> mo4164s0() {
        return this.f3063c.mo4277n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4165t(C1057a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3895u(z3);
        } else {
            aVar.mo3893t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f3077q >= 1) {
            C1148x.m5241B(this.f3078r.mo4066f(), this.f3079s, arrayList, arrayList2, 0, 1, true, this.f3074n);
        }
        if (z3) {
            mo4117P0(this.f3077q, true);
        }
        for (Fragment next : this.f3063c.mo4275l()) {
            if (next != null && next.f2818P != null && next.f2825b0 && aVar.mo3898x(next.f2808F)) {
                float f = next.f2829d0;
                if (f > 0.0f) {
                    next.f2818P.setAlpha(f);
                }
                if (z3) {
                    next.f2829d0 = 0.0f;
                } else {
                    next.f2829d0 = -1.0f;
                    next.f2825b0 = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C1109k<?> mo4166t0() {
        return this.f3078r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3080t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3080t)));
            sb.append("}");
        } else {
            C1109k<?> kVar = this.f3078r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3078r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public LayoutInflater.Factory2 mo4168u0() {
        return this.f3066f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C1142u mo4169v(Fragment fragment) {
        C1142u m = this.f3063c.mo4276m(fragment.f2832f);
        if (m != null) {
            return m;
        }
        C1142u uVar = new C1142u(this.f3075o, this.f3063c, fragment);
        uVar.mo4255o(this.f3078r.mo4066f().getClassLoader());
        uVar.mo4259t(this.f3077q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C1112m mo4170v0() {
        return this.f3075o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public Fragment mo4171w0() {
        return this.f3080t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4172x(Fragment fragment) {
        if (m4999F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2811I) {
            fragment.f2811I = true;
            if (fragment.f2848t) {
                if (m4999F0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3063c.mo4282s(fragment);
                if (m5000G0(fragment)) {
                    this.f3050D = true;
                }
                m5022m1(fragment);
            }
        }
    }

    /* renamed from: x0 */
    public Fragment mo4173x0() {
        return this.f3081u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4174y() {
        this.f3051E = false;
        this.f3052F = false;
        this.f3059M.mo4229o(false);
        m5003S(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public C1092d0 mo4175y0() {
        C1092d0 d0Var = this.f3084x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f3080t;
        if (fragment != null) {
            return fragment.f2803A.mo4175y0();
        }
        return this.f3085y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4176z() {
        this.f3051E = false;
        this.f3052F = false;
        this.f3059M.mo4229o(false);
        m5003S(0);
    }

    /* renamed from: androidx.fragment.app.n$m */
    /* compiled from: FragmentManager */
    static class C1127m implements Parcelable {
        public static final Parcelable.Creator<C1127m> CREATOR = new C1128a();

        /* renamed from: a */
        String f3101a;

        /* renamed from: b */
        int f3102b;

        /* renamed from: androidx.fragment.app.n$m$a */
        /* compiled from: FragmentManager */
        class C1128a implements Parcelable.Creator<C1127m> {
            C1128a() {
            }

            /* renamed from: a */
            public C1127m createFromParcel(Parcel parcel) {
                return new C1127m(parcel);
            }

            /* renamed from: b */
            public C1127m[] newArray(int i) {
                return new C1127m[i];
            }
        }

        C1127m(String str, int i) {
            this.f3101a = str;
            this.f3102b = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3101a);
            parcel.writeInt(this.f3102b);
        }

        C1127m(Parcel parcel) {
            this.f3101a = parcel.readString();
            this.f3102b = parcel.readInt();
        }
    }
}
