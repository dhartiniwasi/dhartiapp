package p264io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p264io.flutter.embedding.android.C10623a;
import p264io.flutter.embedding.android.C10644k;
import p264io.flutter.embedding.android.C10675u;
import p264io.flutter.embedding.engine.FlutterOverlaySurface;
import p264io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p264io.flutter.plugin.editing.C10710f;
import p264io.flutter.view.C11069c;
import p264io.flutter.view.C11091f;
import p297mb.C11881b;
import p315ob.C12051a;
import p325pc.C12172h;
import p342rb.C12269a;
import p408yb.C13247a;
import p417zb.C13524k;

/* renamed from: io.flutter.plugin.platform.q */
/* compiled from: PlatformViewsController */
public class C10745q implements C10739k {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static Class[] f42064w = {SurfaceView.class};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10734i f42065a = new C10734i();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10623a f42066b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f42067c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10644k f42068d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11091f f42069e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10710f f42070f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C13524k f42071g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10722a f42072h = new C10722a();

    /* renamed from: i */
    final HashMap<Integer, C10747r> f42073i = new HashMap<>();

    /* renamed from: j */
    final HashMap<Context, View> f42074j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final SparseArray<C10731f> f42075k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final SparseArray<C12269a> f42076l = new SparseArray<>();

    /* renamed from: m */
    private final SparseArray<C10723b> f42077m = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final SparseArray<C10735j> f42078n = new SparseArray<>();

    /* renamed from: o */
    private int f42079o = 0;

    /* renamed from: p */
    private boolean f42080p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f42081q = true;

    /* renamed from: r */
    private final HashSet<Integer> f42082r = new HashSet<>();

    /* renamed from: s */
    private final HashSet<Integer> f42083s = new HashSet<>();

    /* renamed from: t */
    private final C10675u f42084t = C10675u.m53459a();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f42085u = false;

    /* renamed from: v */
    private final C13524k.C13532g f42086v = new C10746a();

    /* renamed from: io.flutter.plugin.platform.q$a */
    /* compiled from: PlatformViewsController */
    class C10746a implements C13524k.C13532g {
        C10746a() {
        }

        /* renamed from: m */
        private void m53789m(C10731f fVar, C13524k.C13528d dVar) {
            C11881b.m57387e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f47969a);
        }

        /* renamed from: n */
        private long m53790n(C10731f fVar, C13524k.C13528d dVar) {
            long j;
            C10735j jVar;
            m53793q(23);
            C11881b.m57387e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f47969a);
            int y = C10745q.this.m53743l0(dVar.f47971c);
            int y2 = C10745q.this.m53743l0(dVar.f47972d);
            if (C10745q.this.f42085u) {
                jVar = new C10735j(C10745q.this.f42067c);
                j = -1;
            } else {
                C11091f.C11094c h = C10745q.this.f42069e.mo34869h();
                C10735j jVar2 = new C10735j(C10745q.this.f42067c, h);
                long d = h.mo34886d();
                jVar = jVar2;
                j = d;
            }
            jVar.mo34271m(C10745q.this.f42066b);
            jVar.mo34266i(y, y2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y, y2);
            int y3 = C10745q.this.m53743l0(dVar.f47973e);
            int y4 = C10745q.this.m53743l0(dVar.f47974f);
            layoutParams.topMargin = y3;
            layoutParams.leftMargin = y4;
            jVar.mo34268j(layoutParams);
            View view = fVar.getView();
            view.setLayoutParams(new FrameLayout.LayoutParams(y, y2));
            view.setImportantForAccessibility(4);
            jVar.addView(view);
            jVar.mo34269k(new C10742n(this, dVar));
            C10745q.this.f42068d.addView(jVar);
            C10745q.this.f42078n.append(dVar.f47969a, jVar);
            return j;
        }

        /* renamed from: o */
        private long m53791o(C10731f fVar, C13524k.C13528d dVar) {
            m53793q(20);
            C11881b.m57387e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f47969a);
            C11091f.C11094c h = C10745q.this.f42069e.mo34869h();
            C10731f fVar2 = fVar;
            C11091f.C11094c cVar = h;
            C10747r a = C10747r.m53807a(C10745q.this.f42067c, C10745q.this.f42072h, fVar2, cVar, C10745q.this.m53743l0(dVar.f47971c), C10745q.this.m53743l0(dVar.f47972d), dVar.f47969a, (Object) null, new C10743o(this, dVar));
            if (a != null) {
                if (C10745q.this.f42068d != null) {
                    a.mo34324f(C10745q.this.f42068d);
                }
                C10745q.this.f42073i.put(Integer.valueOf(dVar.f47969a), a);
                View view = fVar.getView();
                C10745q.this.f42074j.put(view.getContext(), view);
                return h.mo34886d();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + dVar.f47970b + " with id: " + dVar.f47969a);
        }

        /* renamed from: p */
        private C10731f m53792p(C13524k.C13528d dVar, boolean z) {
            C10732g b = C10745q.this.f42065a.mo34260b(dVar.f47970b);
            if (b != null) {
                Object obj = null;
                if (dVar.f47977i != null) {
                    obj = b.getCreateArgsCodec().mo22148b(dVar.f47977i);
                }
                C10731f create = b.create(z ? new MutableContextWrapper(C10745q.this.f42067c) : C10745q.this.f42067c, dVar.f47969a, obj);
                View view = create.getView();
                if (view != null) {
                    view.setLayoutDirection(dVar.f47975g);
                    C10745q.this.f42075k.put(dVar.f47969a, create);
                    return create;
                }
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f47970b);
        }

        /* renamed from: q */
        private void m53793q(int i) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < i) {
                throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
            }
        }

        /* renamed from: r */
        private void m53794r(C13524k.C13528d dVar) {
            if (!C10745q.m53747n0(dVar.f47975g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f47975g + "(view id: " + dVar.f47969a + ")");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m53795s(C13524k.C13528d dVar, View view, boolean z) {
            if (z) {
                C10745q.this.f42071g.mo38642d(dVar.f47969a);
            } else if (C10745q.this.f42070f != null) {
                C10745q.this.f42070f.mo34206l(dVar.f47969a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m53796t(C13524k.C13528d dVar, View view, boolean z) {
            if (z) {
                C10745q.this.f42071g.mo38642d(dVar.f47969a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m53797u(C10747r rVar, float f, C13524k.C13526b bVar) {
            C10745q.this.m53745m0(rVar);
            if (C10745q.this.f42067c != null) {
                f = C10745q.this.m53723O();
            }
            bVar.mo38641a(new C13524k.C13527c(C10745q.this.m53740j0((double) rVar.mo34322d(), f), C10745q.this.m53740j0((double) rVar.mo34321c(), f)));
        }

        /* renamed from: a */
        public void mo34311a(boolean z) {
            boolean unused = C10745q.this.f42081q = z;
        }

        /* renamed from: b */
        public void mo34312b(int i, int i2) {
            View view;
            if (C10745q.m53747n0(i2)) {
                if (C10745q.this.mo34282c(i)) {
                    view = C10745q.this.f42073i.get(Integer.valueOf(i)).mo34323e();
                } else {
                    C10731f fVar = (C10731f) C10745q.this.f42075k.get(i);
                    if (fVar == null) {
                        C11881b.m57384b("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
                        return;
                    }
                    view = fVar.getView();
                }
                if (view == null) {
                    C11881b.m57384b("PlatformViewsController", "Setting direction to a null view with id: " + i);
                    return;
                }
                view.setLayoutDirection(i2);
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
        }

        /* renamed from: c */
        public long mo34313c(C13524k.C13528d dVar) {
            m53794r(dVar);
            int i = dVar.f47969a;
            if (C10745q.this.f42078n.get(i) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i);
            } else if (C10745q.this.f42069e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i);
            } else if (C10745q.this.f42068d != null) {
                boolean z = true;
                C10731f p = m53792p(dVar, true);
                View view = p.getView();
                if (view.getParent() == null) {
                    if (Build.VERSION.SDK_INT < 23 || C12172h.m58455f(view, C10745q.f42064w)) {
                        z = false;
                    }
                    if (!z) {
                        if (dVar.f47976h == C13524k.C13528d.C13529a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            m53789m(p, dVar);
                            return -2;
                        } else if (!C10745q.this.f42085u) {
                            return m53791o(p, dVar);
                        }
                    }
                    return m53790n(p, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i);
            }
        }

        /* renamed from: d */
        public void mo34314d(C13524k.C13531f fVar) {
            int i = fVar.f47985a;
            float f = C10745q.this.f42067c.getResources().getDisplayMetrics().density;
            if (C10745q.this.mo34282c(i)) {
                C10745q.this.f42073i.get(Integer.valueOf(i)).mo34320b(C10745q.this.mo34310k0(f, fVar, true));
                return;
            }
            C10731f fVar2 = (C10731f) C10745q.this.f42075k.get(i);
            if (fVar2 == null) {
                C11881b.m57384b("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
                return;
            }
            View view = fVar2.getView();
            if (view == null) {
                C11881b.m57384b("PlatformViewsController", "Sending touch to a null view with id: " + i);
                return;
            }
            view.dispatchTouchEvent(C10745q.this.mo34310k0(f, fVar, false));
        }

        /* renamed from: e */
        public void mo34315e(C13524k.C13530e eVar, C13524k.C13526b bVar) {
            int y = C10745q.this.m53743l0(eVar.f47983b);
            int y2 = C10745q.this.m53743l0(eVar.f47984c);
            int i = eVar.f47982a;
            if (C10745q.this.mo34282c(i)) {
                float z = C10745q.this.m53723O();
                C10747r rVar = C10745q.this.f42073i.get(Integer.valueOf(i));
                C10745q.this.m53727U(rVar);
                rVar.mo34327i(y, y2, new C10744p(this, rVar, z, bVar));
                return;
            }
            C10731f fVar = (C10731f) C10745q.this.f42075k.get(i);
            C10735j jVar = (C10735j) C10745q.this.f42078n.get(i);
            if (fVar == null || jVar == null) {
                C11881b.m57384b("PlatformViewsController", "Resizing unknown platform view with id: " + i);
                return;
            }
            if (y > jVar.mo34264e() || y2 > jVar.mo34262d()) {
                jVar.mo34266i(y, y2);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = y;
            layoutParams.height = y2;
            jVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = y;
                layoutParams2.height = y2;
                view.setLayoutParams(layoutParams2);
            }
            bVar.mo38641a(new C13524k.C13527c(C10745q.this.m53738i0((double) jVar.mo34264e()), C10745q.this.m53738i0((double) jVar.mo34262d())));
        }

        /* renamed from: f */
        public void mo34316f(C13524k.C13528d dVar) {
            m53793q(19);
            m53794r(dVar);
            m53789m(m53792p(dVar, false), dVar);
        }

        /* renamed from: g */
        public void mo34317g(int i, double d, double d2) {
            if (!C10745q.this.mo34282c(i)) {
                C10735j jVar = (C10735j) C10745q.this.f42078n.get(i);
                if (jVar == null) {
                    C11881b.m57384b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
                    return;
                }
                int y = C10745q.this.m53743l0(d);
                int y2 = C10745q.this.m53743l0(d2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
                layoutParams.topMargin = y;
                layoutParams.leftMargin = y2;
                jVar.mo34268j(layoutParams);
            }
        }

        /* renamed from: h */
        public void mo34318h(int i) {
            View view;
            if (C10745q.this.mo34282c(i)) {
                view = C10745q.this.f42073i.get(Integer.valueOf(i)).mo34323e();
            } else {
                C10731f fVar = (C10731f) C10745q.this.f42075k.get(i);
                if (fVar == null) {
                    C11881b.m57384b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
                    return;
                }
                view = fVar.getView();
            }
            if (view == null) {
                C11881b.m57384b("PlatformViewsController", "Clearing focus on a null view with id: " + i);
                return;
            }
            view.clearFocus();
        }

        /* renamed from: i */
        public void mo34319i(int i) {
            C10731f fVar = (C10731f) C10745q.this.f42075k.get(i);
            if (fVar == null) {
                C11881b.m57384b("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                return;
            }
            C10745q.this.f42075k.remove(i);
            try {
                fVar.dispose();
            } catch (RuntimeException e) {
                C11881b.m57385c("PlatformViewsController", "Disposing platform view threw an exception", e);
            }
            if (C10745q.this.mo34282c(i)) {
                View e2 = C10745q.this.f42073i.get(Integer.valueOf(i)).mo34323e();
                if (e2 != null) {
                    C10745q.this.f42074j.remove(e2.getContext());
                }
                C10745q.this.f42073i.remove(Integer.valueOf(i));
                return;
            }
            C10735j jVar = (C10735j) C10745q.this.f42078n.get(i);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.mo34265h();
                jVar.mo34272o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                C10745q.this.f42078n.remove(i);
                return;
            }
            C12269a aVar = (C12269a) C10745q.this.f42076l.get(i);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.mo36907b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                C10745q.this.f42076l.remove(i);
            }
        }
    }

    /* renamed from: M */
    private void m53721M() {
        while (this.f42075k.size() > 0) {
            this.f42086v.mo34319i(this.f42075k.keyAt(0));
        }
    }

    /* renamed from: N */
    private void m53722N(boolean z) {
        for (int i = 0; i < this.f42077m.size(); i++) {
            int keyAt = this.f42077m.keyAt(i);
            C10723b valueAt = this.f42077m.valueAt(i);
            if (this.f42082r.contains(Integer.valueOf(keyAt))) {
                this.f42068d.mo33954m(valueAt);
                z &= valueAt.mo33920c();
            } else {
                if (!this.f42080p) {
                    valueAt.mo33918a();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f42076l.size(); i2++) {
            int keyAt2 = this.f42076l.keyAt(i2);
            View view = this.f42076l.get(keyAt2);
            if (!this.f42083s.contains(Integer.valueOf(keyAt2)) || (!z && this.f42081q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public float m53723O() {
        return this.f42067c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: R */
    private void m53724R() {
        if (this.f42081q && !this.f42080p) {
            this.f42068d.mo33966p();
            this.f42080p = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m53725S(int i, View view, boolean z) {
        if (z) {
            this.f42071g.mo38642d(i);
            return;
        }
        C10710f fVar = this.f42070f;
        if (fVar != null) {
            fVar.mo34206l(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m53726T() {
        m53722N(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m53727U(C10747r rVar) {
        C10710f fVar = this.f42070f;
        if (fVar != null) {
            fVar.mo34212u();
            rVar.mo34325g();
        }
    }

    /* renamed from: c0 */
    private static MotionEvent.PointerCoords m53728c0(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f;
        return pointerCoords;
    }

    /* renamed from: d0 */
    private static List<MotionEvent.PointerCoords> m53729d0(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object c0 : (List) obj) {
            arrayList.add(m53728c0(c0, f));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    private static MotionEvent.PointerProperties m53731e0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: f0 */
    private static List<MotionEvent.PointerProperties> m53733f0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object e0 : (List) obj) {
            arrayList.add(m53731e0(e0));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    private void m53735g0() {
        if (this.f42068d == null) {
            C11881b.m57384b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.f42077m.size(); i++) {
            this.f42068d.removeView(this.f42077m.valueAt(i));
        }
        this.f42077m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public int m53738i0(double d) {
        return m53740j0(d, m53723O());
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public int m53740j0(double d, float f) {
        return (int) Math.round(d / ((double) f));
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public int m53743l0(double d) {
        return (int) Math.round(d * ((double) m53723O()));
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m53745m0(C10747r rVar) {
        C10710f fVar = this.f42070f;
        if (fVar != null) {
            fVar.mo34204G();
            rVar.mo34326h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static boolean m53747n0(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: B */
    public void mo34289B(Context context, C11091f fVar, C12051a aVar) {
        if (this.f42067c == null) {
            this.f42067c = context;
            this.f42069e = fVar;
            C13524k kVar = new C13524k(aVar);
            this.f42071g = kVar;
            kVar.mo38643e(this.f42086v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    /* renamed from: C */
    public void mo34290C(C10710f fVar) {
        this.f42070f = fVar;
    }

    /* renamed from: D */
    public void mo34291D(C13247a aVar) {
        this.f42066b = new C10623a(aVar, true);
    }

    /* renamed from: E */
    public void mo34292E(C10644k kVar) {
        this.f42068d = kVar;
        for (int i = 0; i < this.f42078n.size(); i++) {
            this.f42068d.addView(this.f42078n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.f42076l.size(); i2++) {
            this.f42068d.addView(this.f42076l.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.f42075k.size(); i3++) {
            this.f42075k.valueAt(i3).onFlutterViewAttached(this.f42068d);
        }
    }

    /* renamed from: F */
    public boolean mo34293F(View view) {
        if (view == null || !this.f42074j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f42074j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* renamed from: G */
    public FlutterOverlaySurface mo34294G() {
        return mo34295H(new C10723b(this.f42068d.getContext(), this.f42068d.getWidth(), this.f42068d.getHeight(), this.f42072h));
    }

    /* renamed from: H */
    public FlutterOverlaySurface mo34295H(C10723b bVar) {
        int i = this.f42079o;
        this.f42079o = i + 1;
        this.f42077m.put(i, bVar);
        return new FlutterOverlaySurface(i, bVar.getSurface());
    }

    /* renamed from: I */
    public void mo34296I() {
        for (int i = 0; i < this.f42077m.size(); i++) {
            C10723b valueAt = this.f42077m.valueAt(i);
            valueAt.mo33918a();
            valueAt.mo33921e();
        }
    }

    /* renamed from: J */
    public void mo34297J() {
        C13524k kVar = this.f42071g;
        if (kVar != null) {
            kVar.mo38643e((C13524k.C13532g) null);
        }
        mo34296I();
        this.f42071g = null;
        this.f42067c = null;
        this.f42069e = null;
    }

    /* renamed from: K */
    public void mo34298K() {
        for (int i = 0; i < this.f42078n.size(); i++) {
            this.f42068d.removeView(this.f42078n.valueAt(i));
        }
        for (int i2 = 0; i2 < this.f42076l.size(); i2++) {
            this.f42068d.removeView(this.f42076l.valueAt(i2));
        }
        mo34296I();
        m53735g0();
        this.f42068d = null;
        this.f42080p = false;
        for (int i3 = 0; i3 < this.f42075k.size(); i3++) {
            this.f42075k.valueAt(i3).onFlutterViewDetached();
        }
    }

    /* renamed from: L */
    public void mo34299L() {
        this.f42070f = null;
    }

    /* renamed from: P */
    public C10733h mo34300P() {
        return this.f42065a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo34301Q(int i) {
        C10731f fVar = this.f42075k.get(i);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f42076l.get(i) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (view.getParent() == null) {
                Context context = this.f42067c;
                C12269a aVar = new C12269a(context, context.getResources().getDisplayMetrics().density, this.f42066b);
                aVar.setOnDescendantFocusChangeListener(new C10740l(this, i));
                this.f42076l.put(i, aVar);
                view.setImportantForAccessibility(4);
                aVar.addView(view);
                this.f42068d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    /* renamed from: V */
    public void mo34302V() {
    }

    /* renamed from: W */
    public void mo34303W() {
        this.f42082r.clear();
        this.f42083s.clear();
    }

    /* renamed from: X */
    public void mo34304X() {
        m53721M();
    }

    /* renamed from: Y */
    public void mo34305Y(int i, int i2, int i3, int i4, int i5) {
        if (this.f42077m.get(i) != null) {
            m53724R();
            C10723b bVar = this.f42077m.get(i);
            if (bVar.getParent() == null) {
                this.f42068d.addView(bVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i3;
            bVar.setLayoutParams(layoutParams);
            bVar.setVisibility(0);
            bVar.bringToFront();
            this.f42082r.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
    }

    /* renamed from: Z */
    public void mo34306Z(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        m53724R();
        mo34301Q(i);
        C12269a aVar = this.f42076l.get(i);
        aVar.mo36906a(flutterMutatorsStack, i2, i3, i4, i5);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view = this.f42075k.get(i).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f42083s.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo34280a(C11069c cVar) {
        this.f42072h.mo34238c(cVar);
    }

    /* renamed from: a0 */
    public void mo34307a0() {
        boolean z = false;
        if (!this.f42080p || !this.f42083s.isEmpty()) {
            if (this.f42080p && this.f42068d.mo33951j()) {
                z = true;
            }
            m53722N(z);
            return;
        }
        this.f42080p = false;
        this.f42068d.mo33939B(new C10741m(this));
    }

    /* renamed from: b */
    public View mo34281b(int i) {
        if (mo34282c(i)) {
            return this.f42073i.get(Integer.valueOf(i)).mo34323e();
        }
        C10731f fVar = this.f42075k.get(i);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    /* renamed from: b0 */
    public void mo34308b0() {
        m53721M();
    }

    /* renamed from: c */
    public boolean mo34282c(int i) {
        return this.f42073i.containsKey(Integer.valueOf(i));
    }

    /* renamed from: d */
    public void mo34283d() {
        this.f42072h.mo34238c((C11069c) null);
    }

    /* renamed from: h0 */
    public void mo34309h0(boolean z) {
        this.f42085u = z;
    }

    /* renamed from: k0 */
    public MotionEvent mo34310k0(float f, C13524k.C13531f fVar, boolean z) {
        C13524k.C13531f fVar2 = fVar;
        MotionEvent b = this.f42084t.mo33994b(C10675u.C10676a.m53464c(fVar2.f48000p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) m53733f0(fVar2.f47990f).toArray(new MotionEvent.PointerProperties[fVar2.f47989e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m53729d0(fVar2.f47991g, f).toArray(new MotionEvent.PointerCoords[fVar2.f47989e]);
        if (!z && b != null) {
            return MotionEvent.obtain(b.getDownTime(), b.getEventTime(), fVar2.f47988d, fVar2.f47989e, pointerPropertiesArr, pointerCoordsArr, b.getMetaState(), b.getButtonState(), b.getXPrecision(), b.getYPrecision(), b.getDeviceId(), b.getEdgeFlags(), b.getSource(), b.getFlags());
        }
        return MotionEvent.obtain(fVar2.f47986b.longValue(), fVar2.f47987c.longValue(), fVar2.f47988d, fVar2.f47989e, pointerPropertiesArr, pointerCoordsArr, fVar2.f47992h, fVar2.f47993i, fVar2.f47994j, fVar2.f47995k, fVar2.f47996l, fVar2.f47997m, fVar2.f47998n, fVar2.f47999o);
    }
}
