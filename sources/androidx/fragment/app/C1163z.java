package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p010os.C0763e;
import androidx.core.view.C0835a0;
import androidx.core.view.C0899d0;
import androidx.core.view.C0956x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.z */
/* compiled from: FragmentTransitionImpl */
public abstract class C1163z {

    /* renamed from: androidx.fragment.app.z$a */
    /* compiled from: FragmentTransitionImpl */
    class C1164a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f3236a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3237b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f3238c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3239d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3240e;

        C1164a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3236a = i;
            this.f3237b = arrayList;
            this.f3238c = arrayList2;
            this.f3239d = arrayList3;
            this.f3240e = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3236a; i++) {
                C0835a0.m3687D0((View) this.f3237b.get(i), (String) this.f3238c.get(i));
                C0835a0.m3687D0((View) this.f3239d.get(i), (String) this.f3240e.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.z$b */
    /* compiled from: FragmentTransitionImpl */
    class C1165b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3242a;

        /* renamed from: b */
        final /* synthetic */ Map f3243b;

        C1165b(ArrayList arrayList, Map map) {
            this.f3242a = arrayList;
            this.f3243b = map;
        }

        public void run() {
            int size = this.f3242a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3242a.get(i);
                String J = C0835a0.m3697J(view);
                if (J != null) {
                    C0835a0.m3687D0(view, C1163z.m5290i(this.f3243b, J));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.z$c */
    /* compiled from: FragmentTransitionImpl */
    class C1166c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3245a;

        /* renamed from: b */
        final /* synthetic */ Map f3246b;

        C1166c(ArrayList arrayList, Map map) {
            this.f3245a = arrayList;
            this.f3246b = map;
        }

        public void run() {
            int size = this.f3245a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3245a.get(i);
                C0835a0.m3687D0(view, (String) this.f3246b.get(C0835a0.m3697J(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m5288d(List<View> list, View view) {
        int size = list.size();
        if (!m5289h(list, view, size)) {
            if (C0835a0.m3697J(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m5289h(list, childAt, size) && C0835a0.m3697J(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m5289h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m5290i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m5291l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo4302A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo4303B(Object obj);

    /* renamed from: a */
    public abstract void mo4304a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo4305b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo4306c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo4307e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4336f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0899d0.m4079a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo4336f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo4308g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4337j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String J = C0835a0.m3697J(view);
            if (J != null) {
                map.put(J, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo4337j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4338k(View view, Rect rect) {
        if (C0835a0.m3704Q(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo4309m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo4310n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo4339o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0835a0.m3697J(view));
            C0835a0.m3687D0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo4311p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo4312q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo4313r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4340s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0956x.m4317a(viewGroup, new C1166c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo4314t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo4315u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo4316v(Object obj, View view);

    /* renamed from: w */
    public void mo4317w(Fragment fragment, Object obj, C0763e eVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4341x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0956x.m4317a(view, new C1165b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4342y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String J = C0835a0.m3697J(view2);
            arrayList4.add(J);
            if (J != null) {
                C0835a0.m3687D0(view2, (String) null);
                String str = map.get(J);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0835a0.m3687D0(arrayList2.get(i2), J);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0956x.m4317a(view, new C1164a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo4318z(Object obj, View view, ArrayList<View> arrayList);
}
