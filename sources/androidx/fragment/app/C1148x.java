package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p010os.C0763e;
import androidx.core.view.C0835a0;
import androidx.core.view.C0956x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p124r.C5413a;
import p146u0.C5643e;

/* renamed from: androidx.fragment.app.x */
/* compiled from: FragmentTransition */
class C1148x {

    /* renamed from: a */
    private static final int[] f3177a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final C1163z f3178b = (Build.VERSION.SDK_INT >= 21 ? new C1157y() : null);

    /* renamed from: c */
    static final C1163z f3179c = m5264w();

    /* renamed from: androidx.fragment.app.x$a */
    /* compiled from: FragmentTransition */
    class C1149a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1155g f3180a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3181b;

        /* renamed from: c */
        final /* synthetic */ C0763e f3182c;

        C1149a(C1155g gVar, Fragment fragment, C0763e eVar) {
            this.f3180a = gVar;
            this.f3181b = fragment;
            this.f3182c = eVar;
        }

        public void run() {
            this.f3180a.mo4179a(this.f3181b, this.f3182c);
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    /* compiled from: FragmentTransition */
    class C1150b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3183a;

        C1150b(ArrayList arrayList) {
            this.f3183a = arrayList;
        }

        public void run() {
            C1148x.m5240A(this.f3183a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    /* compiled from: FragmentTransition */
    class C1151c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1155g f3184a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3185b;

        /* renamed from: c */
        final /* synthetic */ C0763e f3186c;

        C1151c(C1155g gVar, Fragment fragment, C0763e eVar) {
            this.f3184a = gVar;
            this.f3185b = fragment;
            this.f3186c = eVar;
        }

        public void run() {
            this.f3184a.mo4179a(this.f3185b, this.f3186c);
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    /* compiled from: FragmentTransition */
    class C1152d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f3187a;

        /* renamed from: b */
        final /* synthetic */ C1163z f3188b;

        /* renamed from: c */
        final /* synthetic */ View f3189c;

        /* renamed from: d */
        final /* synthetic */ Fragment f3190d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3191e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3192f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3193g;

        /* renamed from: h */
        final /* synthetic */ Object f3194h;

        C1152d(Object obj, C1163z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3187a = obj;
            this.f3188b = zVar;
            this.f3189c = view;
            this.f3190d = fragment;
            this.f3191e = arrayList;
            this.f3192f = arrayList2;
            this.f3193g = arrayList3;
            this.f3194h = obj2;
        }

        public void run() {
            Object obj = this.f3187a;
            if (obj != null) {
                this.f3188b.mo4311p(obj, this.f3189c);
                this.f3192f.addAll(C1148x.m5252k(this.f3188b, this.f3187a, this.f3190d, this.f3191e, this.f3189c));
            }
            if (this.f3193g != null) {
                if (this.f3194h != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3189c);
                    this.f3188b.mo4312q(this.f3194h, this.f3193g, arrayList);
                }
                this.f3193g.clear();
                this.f3193g.add(this.f3189c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    /* compiled from: FragmentTransition */
    class C1153e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f3195a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3196b;

        /* renamed from: c */
        final /* synthetic */ boolean f3197c;

        /* renamed from: d */
        final /* synthetic */ C5413a f3198d;

        /* renamed from: e */
        final /* synthetic */ View f3199e;

        /* renamed from: f */
        final /* synthetic */ C1163z f3200f;

        /* renamed from: g */
        final /* synthetic */ Rect f3201g;

        C1153e(Fragment fragment, Fragment fragment2, boolean z, C5413a aVar, View view, C1163z zVar, Rect rect) {
            this.f3195a = fragment;
            this.f3196b = fragment2;
            this.f3197c = z;
            this.f3198d = aVar;
            this.f3199e = view;
            this.f3200f = zVar;
            this.f3201g = rect;
        }

        public void run() {
            C1148x.m5247f(this.f3195a, this.f3196b, this.f3197c, this.f3198d, false);
            View view = this.f3199e;
            if (view != null) {
                this.f3200f.mo4338k(view, this.f3201g);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$f */
    /* compiled from: FragmentTransition */
    class C1154f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1163z f3202a;

        /* renamed from: b */
        final /* synthetic */ C5413a f3203b;

        /* renamed from: c */
        final /* synthetic */ Object f3204c;

        /* renamed from: d */
        final /* synthetic */ C1156h f3205d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3206e;

        /* renamed from: f */
        final /* synthetic */ View f3207f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3208g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3209h;

        /* renamed from: i */
        final /* synthetic */ boolean f3210i;

        /* renamed from: r */
        final /* synthetic */ ArrayList f3211r;

        /* renamed from: s */
        final /* synthetic */ Object f3212s;

        /* renamed from: t */
        final /* synthetic */ Rect f3213t;

        C1154f(C1163z zVar, C5413a aVar, Object obj, C1156h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3202a = zVar;
            this.f3203b = aVar;
            this.f3204c = obj;
            this.f3205d = hVar;
            this.f3206e = arrayList;
            this.f3207f = view;
            this.f3208g = fragment;
            this.f3209h = fragment2;
            this.f3210i = z;
            this.f3211r = arrayList2;
            this.f3212s = obj2;
            this.f3213t = rect;
        }

        public void run() {
            C5413a<String, View> h = C1148x.m5249h(this.f3202a, this.f3203b, this.f3204c, this.f3205d);
            if (h != null) {
                this.f3206e.addAll(h.values());
                this.f3206e.add(this.f3207f);
            }
            C1148x.m5247f(this.f3208g, this.f3209h, this.f3210i, h, false);
            Object obj = this.f3204c;
            if (obj != null) {
                this.f3202a.mo4302A(obj, this.f3211r, this.f3206e);
                View s = C1148x.m5260s(h, this.f3205d, this.f3212s, this.f3210i);
                if (s != null) {
                    this.f3202a.mo4338k(s, this.f3213t);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$g */
    /* compiled from: FragmentTransition */
    interface C1155g {
        /* renamed from: a */
        void mo4179a(Fragment fragment, C0763e eVar);

        /* renamed from: b */
        void mo4180b(Fragment fragment, C0763e eVar);
    }

    /* renamed from: androidx.fragment.app.x$h */
    /* compiled from: FragmentTransition */
    static class C1156h {

        /* renamed from: a */
        public Fragment f3214a;

        /* renamed from: b */
        public boolean f3215b;

        /* renamed from: c */
        public C1057a f3216c;

        /* renamed from: d */
        public Fragment f3217d;

        /* renamed from: e */
        public boolean f3218e;

        /* renamed from: f */
        public C1057a f3219f;

        C1156h() {
        }
    }

    /* renamed from: A */
    static void m5240A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m5241B(Context context, C1105g gVar, ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C1155g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C1057a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m5246e(aVar, sparseArray, z);
            } else {
                m5244c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C5413a<String, String> d = m5245d(keyAt, arrayList, arrayList2, i, i2);
                C1156h hVar = (C1156h) sparseArray.valueAt(i4);
                if (gVar.mo3874d() && (viewGroup = (ViewGroup) gVar.mo3873c(keyAt)) != null) {
                    if (z) {
                        m5256o(viewGroup, hVar, view, d, gVar2);
                    } else {
                        m5255n(viewGroup, hVar, view, d, gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m5242a(ArrayList<View> arrayList, C5413a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View n = aVar.mo19672n(size);
            if (collection.contains(C0835a0.m3697J(n))) {
                arrayList.add(n);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f2848t != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.f2810H == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5243b(androidx.fragment.app.C1057a r8, androidx.fragment.app.C1146w.C1147a r9, android.util.SparseArray<androidx.fragment.app.C1148x.C1156h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3170b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2808F
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3177a
            int r9 = r9.f3169a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3169a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f2827c0
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.f2810H
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2848t
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.f2810H
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f2827c0
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2848t
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2810H
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2848t
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2810H
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.f2848t
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2818P
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2829d0
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.f2848t
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2810H
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.f2825b0
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.f2848t
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2810H
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0092:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.x$h r5 = (androidx.fragment.app.C1148x.C1156h) r5
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.x$h r5 = m5257p(r5, r10, r1)
            r5.f3214a = r0
            r5.f3215b = r11
            r5.f3216c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r3 = r5.f3217d
            if (r3 != r0) goto L_0x00b1
            r5.f3217d = r2
        L_0x00b1:
            boolean r3 = r8.f3167r
            if (r3 != 0) goto L_0x00c5
            androidx.fragment.app.n r3 = r8.f2890t
            androidx.fragment.app.u r6 = r3.mo4169v(r0)
            androidx.fragment.app.v r7 = r3.mo4163r0()
            r7.mo4279p(r6)
            r3.mo4119Q0(r0)
        L_0x00c5:
            if (r4 == 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r3 = r5.f3217d
            if (r3 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.x$h r5 = m5257p(r5, r10, r1)
            r5.f3217d = r0
            r5.f3218e = r11
            r5.f3219f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r5.f3214a
            if (r8 != r0) goto L_0x00e3
            r5.f3214a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1148x.m5243b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m5244c(C1057a aVar, SparseArray<C1156h> sparseArray, boolean z) {
        int size = aVar.f3152c.size();
        for (int i = 0; i < size; i++) {
            m5243b(aVar, aVar.f3152c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C5413a<String, String> m5245d(int i, ArrayList<C1057a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C5413a<String, String> aVar = new C5413a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1057a aVar2 = arrayList.get(i4);
            if (aVar2.mo3898x(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3165p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3165p;
                        arrayList4 = aVar2.f3166q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3165p;
                        arrayList3 = aVar2.f3166q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m5246e(C1057a aVar, SparseArray<C1156h> sparseArray, boolean z) {
        if (aVar.f2890t.mo4159o0().mo3874d()) {
            for (int size = aVar.f3152c.size() - 1; size >= 0; size--) {
                m5243b(aVar, aVar.f3152c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m5247f(Fragment fragment, Fragment fragment2, boolean z, C5413a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.mo3845s();
        } else {
            fragment.mo3845s();
        }
    }

    /* renamed from: g */
    private static boolean m5248g(C1163z zVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zVar.mo4307e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C5413a<String, View> m5249h(C1163z zVar, C5413a<String, String> aVar, Object obj, C1156h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3214a;
        View Q = fragment.mo3773Q();
        if (aVar.isEmpty() || obj == null || Q == null) {
            aVar.clear();
            return null;
        }
        C5413a<String, View> aVar2 = new C5413a<>();
        zVar.mo4337j(aVar2, Q);
        C1057a aVar3 = hVar.f3216c;
        if (hVar.f3215b) {
            fragment.mo3856v();
            arrayList = aVar3.f3165p;
        } else {
            fragment.mo3845s();
            arrayList = aVar3.f3166q;
        }
        if (arrayList != null) {
            aVar2.mo19538p(arrayList);
            aVar2.mo19538p(aVar.values());
        }
        m5265x(aVar, aVar2);
        return aVar2;
    }

    /* renamed from: i */
    private static C5413a<String, View> m5250i(C1163z zVar, C5413a<String, String> aVar, Object obj, C1156h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3217d;
        C5413a<String, View> aVar2 = new C5413a<>();
        zVar.mo4337j(aVar2, fragment.mo3830n1());
        C1057a aVar3 = hVar.f3219f;
        if (hVar.f3218e) {
            fragment.mo3845s();
            arrayList = aVar3.f3166q;
        } else {
            fragment.mo3856v();
            arrayList = aVar3.f3165p;
        }
        if (arrayList != null) {
            aVar2.mo19538p(arrayList);
        }
        aVar.mo19538p(aVar2.keySet());
        return aVar2;
    }

    /* renamed from: j */
    private static C1163z m5251j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u = fragment.mo3853u();
            if (u != null) {
                arrayList.add(u);
            }
            Object J = fragment.mo3759J();
            if (J != null) {
                arrayList.add(J);
            }
            Object L = fragment.mo3763L();
            if (L != null) {
                arrayList.add(L);
            }
        }
        if (fragment2 != null) {
            Object r = fragment2.mo3842r();
            if (r != null) {
                arrayList.add(r);
            }
            Object H = fragment2.mo3755H();
            if (H != null) {
                arrayList.add(H);
            }
            Object K = fragment2.mo3761K();
            if (K != null) {
                arrayList.add(K);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1163z zVar = f3178b;
        if (zVar != null && m5248g(zVar, arrayList)) {
            return zVar;
        }
        C1163z zVar2 = f3179c;
        if (zVar2 != null && m5248g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m5252k(C1163z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View Q = fragment.mo3773Q();
        if (Q != null) {
            zVar.mo4336f(arrayList2, Q);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.mo4305b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m5253l(C1163z zVar, ViewGroup viewGroup, View view, C5413a<String, String> aVar, C1156h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C5413a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C1163z zVar2 = zVar;
        C1156h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3214a;
        Fragment fragment2 = hVar2.f3217d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3215b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m5261t(zVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C5413a<String, View> i = m5250i(zVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m5247f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar2.mo4318z(obj4, view, arrayList3);
            m5267z(zVar, obj4, obj2, i, hVar2.f3218e, hVar2.f3219f);
            if (obj5 != null) {
                zVar2.mo4315u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C1154f fVar = r0;
        C1154f fVar2 = new C1154f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C0956x.m4317a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m5254m(C1163z zVar, ViewGroup viewGroup, View view, C5413a<String, String> aVar, C1156h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C1163z zVar2 = zVar;
        View view3 = view;
        C5413a<String, String> aVar2 = aVar;
        C1156h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3214a;
        Fragment fragment2 = hVar2.f3217d;
        if (fragment != null) {
            fragment.mo3830n1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3215b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m5261t(zVar, fragment, fragment2, z);
        }
        C5413a<String, View> i = m5250i(zVar, aVar2, obj3, hVar2);
        C5413a<String, View> h = m5249h(zVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            m5242a(arrayList3, i, aVar.keySet());
            m5242a(arrayList4, h, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m5247f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            zVar.mo4318z(obj4, view3, arrayList3);
            m5267z(zVar, obj4, obj2, i, hVar2.f3218e, hVar2.f3219f);
            Rect rect2 = new Rect();
            View s = m5260s(h, hVar2, obj5, z);
            if (s != null) {
                zVar.mo4315u(obj5, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        C0956x.m4317a(viewGroup, new C1153e(fragment, fragment2, z, h, view2, zVar, rect));
        return obj4;
    }

    /* renamed from: n */
    private static void m5255n(ViewGroup viewGroup, C1156h hVar, View view, C5413a<String, String> aVar, C1155g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        C1156h hVar2 = hVar;
        View view2 = view;
        C5413a<String, String> aVar2 = aVar;
        C1155g gVar2 = gVar;
        Fragment fragment = hVar2.f3214a;
        Fragment fragment2 = hVar2.f3217d;
        C1163z j = m5251j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3215b;
            boolean z2 = hVar2.f3218e;
            Object q = m5258q(j, fragment, z);
            Object r = m5259r(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r;
            C1163z zVar = j;
            Object l = m5253l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, q, obj2);
            Object obj3 = q;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m5252k(zVar, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            zVar.mo4304a(obj3, view2);
            Object u = m5262u(zVar, obj3, obj4, l, fragment, hVar2.f3215b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C0763e eVar = new C0763e();
                gVar2.mo4180b(fragment2, eVar);
                zVar.mo4317w(fragment2, u, eVar, new C1151c(gVar2, fragment2, eVar));
            }
            if (u != null) {
                ArrayList arrayList5 = new ArrayList();
                C1163z zVar2 = zVar;
                zVar2.mo4314t(u, obj3, arrayList5, obj4, k, l, arrayList2);
                m5266y(zVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k);
                ViewGroup viewGroup3 = viewGroup;
                C1163z zVar3 = zVar;
                ArrayList arrayList6 = arrayList2;
                zVar3.mo4341x(viewGroup3, arrayList6, aVar2);
                zVar3.mo4306c(viewGroup3, u);
                zVar3.mo4340s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    /* renamed from: o */
    private static void m5256o(ViewGroup viewGroup, C1156h hVar, View view, C5413a<String, String> aVar, C1155g gVar) {
        Object obj;
        C1156h hVar2 = hVar;
        View view2 = view;
        C1155g gVar2 = gVar;
        Fragment fragment = hVar2.f3214a;
        Fragment fragment2 = hVar2.f3217d;
        C1163z j = m5251j(fragment2, fragment);
        if (j != null) {
            boolean z = hVar2.f3215b;
            boolean z2 = hVar2.f3218e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q = m5258q(j, fragment, z);
            Object r = m5259r(j, fragment2, z2);
            ArrayList arrayList3 = arrayList2;
            Object m = m5254m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, q, r);
            Object obj2 = q;
            if (obj2 == null && m == null) {
                obj = r;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r;
            }
            ArrayList<View> k = m5252k(j, obj, fragment2, arrayList3, view2);
            ArrayList<View> k2 = m5252k(j, obj2, fragment, arrayList, view2);
            m5240A(k2, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k;
            Object u = m5262u(j, obj2, obj, m, fragment3, z);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                C0763e eVar = new C0763e();
                C1155g gVar3 = gVar;
                gVar3.mo4180b(fragment2, eVar);
                j.mo4317w(fragment2, u, eVar, new C1149a(gVar3, fragment2, eVar));
            }
            if (u != null) {
                m5263v(j, obj, fragment2, arrayList4);
                ArrayList<String> o = j.mo4339o(arrayList);
                C1163z zVar = j;
                zVar.mo4314t(u, obj2, k2, obj, arrayList4, m, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.mo4306c(viewGroup2, u);
                zVar.mo4342y(viewGroup2, arrayList3, arrayList, o, aVar);
                m5240A(k2, 0);
                j.mo4302A(m, arrayList3, arrayList);
            }
        }
    }

    /* renamed from: p */
    private static C1156h m5257p(C1156h hVar, SparseArray<C1156h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C1156h hVar2 = new C1156h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m5258q(C1163z zVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3755H();
        } else {
            obj = fragment.mo3842r();
        }
        return zVar.mo4308g(obj);
    }

    /* renamed from: r */
    private static Object m5259r(C1163z zVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3759J();
        } else {
            obj = fragment.mo3853u();
        }
        return zVar.mo4308g(obj);
    }

    /* renamed from: s */
    static View m5260s(C5413a<String, View> aVar, C1156h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C1057a aVar2 = hVar.f3216c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3165p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f3165p.get(0);
        } else {
            str = aVar2.f3166q.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: t */
    private static Object m5261t(C1163z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.mo3763L();
        } else {
            obj = fragment.mo3761K();
        }
        return zVar.mo4303B(zVar.mo4308g(obj));
    }

    /* renamed from: u */
    private static Object m5262u(C1163z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.mo3819k() : fragment.mo3816j();
        }
        if (z2) {
            return zVar.mo4310n(obj2, obj, obj3);
        }
        return zVar.mo4309m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m5263v(C1163z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2848t && fragment.f2810H && fragment.f2827c0) {
            fragment.mo3861w1(true);
            zVar.mo4313r(obj, fragment.mo3773Q(), arrayList);
            C0956x.m4317a(fragment.f2817O, new C1150b(arrayList));
        }
    }

    /* renamed from: w */
    private static C1163z m5264w() {
        try {
            return C5643e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m5265x(C5413a<String, String> aVar, C5413a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo19672n(size))) {
                aVar.mo19670l(size);
            }
        }
    }

    /* renamed from: y */
    private static void m5266y(C1163z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C0956x.m4317a(viewGroup, new C1152d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m5267z(C1163z zVar, Object obj, Object obj2, C5413a<String, View> aVar, boolean z, C1057a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3165p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f3166q.get(0);
            } else {
                str = aVar2.f3165p.get(0);
            }
            View view = aVar.get(str);
            zVar.mo4316v(obj, view);
            if (obj2 != null) {
                zVar.mo4316v(obj2, view);
            }
        }
    }
}
