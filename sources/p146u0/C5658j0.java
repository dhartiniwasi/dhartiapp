package p146u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p146u0.C5619a;
import p146u0.C5666m;

/* renamed from: u0.j0 */
/* compiled from: Visibility */
public abstract class C5658j0 extends C5666m {

    /* renamed from: a0 */
    private static final String[] f28342a0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: S */
    private int f28343S = 3;

    /* renamed from: u0.j0$a */
    /* compiled from: Visibility */
    class C5659a extends C5674n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f28344a;

        /* renamed from: b */
        final /* synthetic */ View f28345b;

        /* renamed from: c */
        final /* synthetic */ View f28346c;

        C5659a(ViewGroup viewGroup, View view, View view2) {
            this.f28344a = viewGroup;
            this.f28345b = view;
            this.f28346c = view2;
        }

        /* renamed from: a */
        public void mo19953a(C5666m mVar) {
            if (this.f28345b.getParent() == null) {
                C5688x.m33954a(this.f28344a).mo20060c(this.f28345b);
            } else {
                C5658j0.this.mo20024f();
            }
        }

        /* renamed from: c */
        public void mo19954c(C5666m mVar) {
            C5688x.m33954a(this.f28344a).mo20061d(this.f28345b);
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            this.f28346c.setTag(C5657j.save_overlay_view, (Object) null);
            C5688x.m33954a(this.f28344a).mo20061d(this.f28345b);
            mVar.mo20009S(this);
        }
    }

    /* renamed from: u0.j0$b */
    /* compiled from: Visibility */
    private static class C5660b extends AnimatorListenerAdapter implements C5666m.C5672f, C5619a.C5620a {

        /* renamed from: a */
        private final View f28348a;

        /* renamed from: b */
        private final int f28349b;

        /* renamed from: c */
        private final ViewGroup f28350c;

        /* renamed from: d */
        private final boolean f28351d;

        /* renamed from: e */
        private boolean f28352e;

        /* renamed from: f */
        boolean f28353f = false;

        C5660b(View view, int i, boolean z) {
            this.f28348a = view;
            this.f28349b = i;
            this.f28350c = (ViewGroup) view.getParent();
            this.f28351d = z;
            m33827g(true);
        }

        /* renamed from: f */
        private void m33826f() {
            if (!this.f28353f) {
                C5636c0.m33746h(this.f28348a, this.f28349b);
                ViewGroup viewGroup = this.f28350c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m33827g(false);
        }

        /* renamed from: g */
        private void m33827g(boolean z) {
            ViewGroup viewGroup;
            if (this.f28351d && this.f28352e != z && (viewGroup = this.f28350c) != null) {
                this.f28352e = z;
                C5688x.m33956c(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo19953a(C5666m mVar) {
            m33827g(true);
        }

        /* renamed from: b */
        public void mo19975b(C5666m mVar) {
        }

        /* renamed from: c */
        public void mo19954c(C5666m mVar) {
            m33827g(false);
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            m33826f();
            mVar.mo20009S(this);
        }

        /* renamed from: e */
        public void mo19956e(C5666m mVar) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f28353f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m33826f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f28353f) {
                C5636c0.m33746h(this.f28348a, this.f28349b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f28353f) {
                C5636c0.m33746h(this.f28348a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: u0.j0$c */
    /* compiled from: Visibility */
    private static class C5661c {

        /* renamed from: a */
        boolean f28354a;

        /* renamed from: b */
        boolean f28355b;

        /* renamed from: c */
        int f28356c;

        /* renamed from: d */
        int f28357d;

        /* renamed from: e */
        ViewGroup f28358e;

        /* renamed from: f */
        ViewGroup f28359f;

        C5661c() {
        }
    }

    /* renamed from: g0 */
    private void m33811g0(C5683s sVar) {
        sVar.f28427a.put("android:visibility:visibility", Integer.valueOf(sVar.f28428b.getVisibility()));
        sVar.f28427a.put("android:visibility:parent", sVar.f28428b.getParent());
        int[] iArr = new int[2];
        sVar.f28428b.getLocationOnScreen(iArr);
        sVar.f28427a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: h0 */
    private C5661c m33812h0(C5683s sVar, C5683s sVar2) {
        C5661c cVar = new C5661c();
        cVar.f28354a = false;
        cVar.f28355b = false;
        if (sVar == null || !sVar.f28427a.containsKey("android:visibility:visibility")) {
            cVar.f28356c = -1;
            cVar.f28358e = null;
        } else {
            cVar.f28356c = ((Integer) sVar.f28427a.get("android:visibility:visibility")).intValue();
            cVar.f28358e = (ViewGroup) sVar.f28427a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f28427a.containsKey("android:visibility:visibility")) {
            cVar.f28357d = -1;
            cVar.f28359f = null;
        } else {
            cVar.f28357d = ((Integer) sVar2.f28427a.get("android:visibility:visibility")).intValue();
            cVar.f28359f = (ViewGroup) sVar2.f28427a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i = cVar.f28356c;
            int i2 = cVar.f28357d;
            if (i == i2 && cVar.f28358e == cVar.f28359f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f28355b = false;
                    cVar.f28354a = true;
                } else if (i2 == 0) {
                    cVar.f28355b = true;
                    cVar.f28354a = true;
                }
            } else if (cVar.f28359f == null) {
                cVar.f28355b = false;
                cVar.f28354a = true;
            } else if (cVar.f28358e == null) {
                cVar.f28355b = true;
                cVar.f28354a = true;
            }
        } else if (sVar == null && cVar.f28357d == 0) {
            cVar.f28355b = true;
            cVar.f28354a = true;
        } else if (sVar2 == null && cVar.f28356c == 0) {
            cVar.f28355b = false;
            cVar.f28354a = true;
        }
        return cVar;
    }

    /* renamed from: G */
    public String[] mo19922G() {
        return f28342a0;
    }

    /* renamed from: I */
    public boolean mo19985I(C5683s sVar, C5683s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f28427a.containsKey("android:visibility:visibility") != sVar.f28427a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C5661c h0 = m33812h0(sVar, sVar2);
        if (!h0.f28354a) {
            return false;
        }
        if (h0.f28356c == 0 || h0.f28357d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo19923g(C5683s sVar) {
        m33811g0(sVar);
    }

    /* renamed from: i0 */
    public abstract Animator mo19967i0(ViewGroup viewGroup, View view, C5683s sVar, C5683s sVar2);

    /* renamed from: j */
    public void mo19924j(C5683s sVar) {
        m33811g0(sVar);
    }

    /* renamed from: j0 */
    public Animator mo19986j0(ViewGroup viewGroup, C5683s sVar, int i, C5683s sVar2, int i2) {
        if ((this.f28343S & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f28428b.getParent();
            if (m33812h0(mo20036v(view, false), mo20005H(view, false)).f28354a) {
                return null;
            }
        }
        return mo19967i0(viewGroup, sVar2.f28428b, sVar, sVar2);
    }

    /* renamed from: k0 */
    public abstract Animator mo19968k0(ViewGroup viewGroup, View view, C5683s sVar, C5683s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f28372E != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo19987l0(android.view.ViewGroup r18, p146u0.C5683s r19, int r20, p146u0.C5683s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f28343S
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f28428b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f28428b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p146u0.C5657j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            u0.s r14 = r0.mo20005H(r13, r12)
            u0.s r15 = r0.mo20036v(r13, r12)
            u0.j0$c r14 = r0.m33812h0(r14, r15)
            boolean r14 = r14.f28354a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p146u0.C5682r.m33942a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f28372E
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f28427a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            u0.w r4 = p146u0.C5688x.m33954a(r18)
            r4.mo20060c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo19968k0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            u0.w r1 = p146u0.C5688x.m33954a(r18)
            r1.mo20061d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            u0.j0$a r3 = new u0.j0$a
            r3.<init>(r1, r10, r5)
            r0.mo20015a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p146u0.C5636c0.m33746h(r8, r11)
            android.animation.Animator r1 = r0.mo19968k0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            u0.j0$b r2 = new u0.j0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p146u0.C5619a.m33706a(r1, r2)
            r0.mo20015a(r2)
            goto L_0x0106
        L_0x0103:
            p146u0.C5636c0.m33746h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p146u0.C5658j0.mo19987l0(android.view.ViewGroup, u0.s, int, u0.s, int):android.animation.Animator");
    }

    /* renamed from: m0 */
    public void mo19988m0(int i) {
        if ((i & -4) == 0) {
            this.f28343S = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: n */
    public Animator mo19925n(ViewGroup viewGroup, C5683s sVar, C5683s sVar2) {
        C5661c h0 = m33812h0(sVar, sVar2);
        if (!h0.f28354a) {
            return null;
        }
        if (h0.f28358e == null && h0.f28359f == null) {
            return null;
        }
        if (h0.f28355b) {
            return mo19986j0(viewGroup, sVar, h0.f28356c, sVar2, h0.f28357d);
        }
        return mo19987l0(viewGroup, sVar, h0.f28356c, sVar2, h0.f28357d);
    }
}
