package p146u0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0835a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p124r.C5413a;

/* renamed from: u0.o */
/* compiled from: TransitionManager */
public class C5675o {

    /* renamed from: a */
    private static C5666m f28409a = new C5622b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C5413a<ViewGroup, ArrayList<C5666m>>>> f28410b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f28411c = new ArrayList<>();

    /* renamed from: u0.o$a */
    /* compiled from: TransitionManager */
    private static class C5676a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        C5666m f28412a;

        /* renamed from: b */
        ViewGroup f28413b;

        /* renamed from: u0.o$a$a */
        /* compiled from: TransitionManager */
        class C5677a extends C5674n {

            /* renamed from: a */
            final /* synthetic */ C5413a f28414a;

            C5677a(C5413a aVar) {
                this.f28414a = aVar;
            }

            /* renamed from: d */
            public void mo19955d(C5666m mVar) {
                ((ArrayList) this.f28414a.get(C5676a.this.f28413b)).remove(mVar);
                mVar.mo20009S(this);
            }
        }

        C5676a(C5666m mVar, ViewGroup viewGroup) {
            this.f28412a = mVar;
            this.f28413b = viewGroup;
        }

        /* renamed from: a */
        private void m33905a() {
            this.f28413b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f28413b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m33905a();
            if (!C5675o.f28411c.remove(this.f28413b)) {
                return true;
            }
            C5413a<ViewGroup, ArrayList<C5666m>> b = C5675o.m33902b();
            ArrayList arrayList = b.get(this.f28413b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f28413b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f28412a);
            this.f28412a.mo20015a(new C5677a(b));
            this.f28412a.mo20027k(this.f28413b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C5666m) it.next()).mo20011U(this.f28413b);
                }
            }
            this.f28412a.mo20008R(this.f28413b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m33905a();
            C5675o.f28411c.remove(this.f28413b);
            ArrayList arrayList = C5675o.m33902b().get(this.f28413b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5666m) it.next()).mo20011U(this.f28413b);
                }
            }
            this.f28412a.mo20028l(true);
        }
    }

    /* renamed from: a */
    public static void m33901a(ViewGroup viewGroup, C5666m mVar) {
        if (!f28411c.contains(viewGroup) && C0835a0.m3705R(viewGroup)) {
            f28411c.add(viewGroup);
            if (mVar == null) {
                mVar = f28409a;
            }
            C5666m m = mVar.clone();
            m33904d(viewGroup, m);
            C5664l.m33835c(viewGroup, (C5664l) null);
            m33903c(viewGroup, m);
        }
    }

    /* renamed from: b */
    static C5413a<ViewGroup, ArrayList<C5666m>> m33902b() {
        C5413a<ViewGroup, ArrayList<C5666m>> aVar;
        WeakReference weakReference = f28410b.get();
        if (weakReference != null && (aVar = (C5413a) weakReference.get()) != null) {
            return aVar;
        }
        C5413a<ViewGroup, ArrayList<C5666m>> aVar2 = new C5413a<>();
        f28410b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m33903c(ViewGroup viewGroup, C5666m mVar) {
        if (mVar != null && viewGroup != null) {
            C5676a aVar = new C5676a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m33904d(ViewGroup viewGroup, C5666m mVar) {
        ArrayList arrayList = m33902b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C5666m) it.next()).mo20007Q(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo20027k(viewGroup, true);
        }
        C5664l b = C5664l.m33834b(viewGroup);
        if (b != null) {
            b.mo19997a();
        }
    }
}
