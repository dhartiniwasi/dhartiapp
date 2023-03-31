package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0866d;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C1413k extends C0832a {

    /* renamed from: d */
    final RecyclerView f4037d;

    /* renamed from: e */
    private final C1414a f4038e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C1414a extends C0832a {

        /* renamed from: d */
        final C1413k f4039d;

        /* renamed from: e */
        private Map<View, C0832a> f4040e = new WeakHashMap();

        public C1414a(C1413k kVar) {
            this.f4039d = kVar;
        }

        /* renamed from: a */
        public boolean mo3227a(View view, AccessibilityEvent accessibilityEvent) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                return aVar.mo3227a(view, accessibilityEvent);
            }
            return super.mo3227a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C0866d mo3228b(View view) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                return aVar.mo3228b(view);
            }
            return super.mo3228b(view);
        }

        /* renamed from: f */
        public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                aVar.mo3230f(view, accessibilityEvent);
            } else {
                super.mo3230f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            if (this.f4039d.mo5505o() || this.f4039d.f4037d.getLayoutManager() == null) {
                super.mo3231g(view, cVar);
                return;
            }
            this.f4039d.f4037d.getLayoutManager().mo5141O0(view, cVar);
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                aVar.mo3231g(view, cVar);
            } else {
                super.mo3231g(view, cVar);
            }
        }

        /* renamed from: h */
        public void mo3232h(View view, AccessibilityEvent accessibilityEvent) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                aVar.mo3232h(view, accessibilityEvent);
            } else {
                super.mo3232h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo3233i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0832a aVar = this.f4040e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo3233i(viewGroup, view, accessibilityEvent);
            }
            return super.mo3233i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo3234j(View view, int i, Bundle bundle) {
            if (this.f4039d.mo5505o() || this.f4039d.f4037d.getLayoutManager() == null) {
                return super.mo3234j(view, i, bundle);
            }
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                if (aVar.mo3234j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo3234j(view, i, bundle)) {
                return true;
            }
            return this.f4039d.f4037d.getLayoutManager().mo5176i1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo3235l(View view, int i) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                aVar.mo3235l(view, i);
            } else {
                super.mo3235l(view, i);
            }
        }

        /* renamed from: m */
        public void mo3236m(View view, AccessibilityEvent accessibilityEvent) {
            C0832a aVar = this.f4040e.get(view);
            if (aVar != null) {
                aVar.mo3236m(view, accessibilityEvent);
            } else {
                super.mo3236m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0832a mo5506n(View view) {
            return this.f4040e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5507o(View view) {
            C0832a l = C0835a0.m3736l(view);
            if (l != null && l != this) {
                this.f4040e.put(view, l);
            }
        }
    }

    public C1413k(RecyclerView recyclerView) {
        this.f4037d = recyclerView;
        C0832a n = mo5504n();
        if (n == null || !(n instanceof C1414a)) {
            this.f4038e = new C1414a(this);
        } else {
            this.f4038e = (C1414a) n;
        }
    }

    /* renamed from: f */
    public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3230f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5505o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4742K0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo3231g(View view, C0862c cVar) {
        super.mo3231g(view, cVar);
        if (!mo5505o() && this.f4037d.getLayoutManager() != null) {
            this.f4037d.getLayoutManager().mo5138M0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo3234j(View view, int i, Bundle bundle) {
        if (super.mo3234j(view, i, bundle)) {
            return true;
        }
        if (mo5505o() || this.f4037d.getLayoutManager() == null) {
            return false;
        }
        return this.f4037d.getLayoutManager().mo5171g1(i, bundle);
    }

    /* renamed from: n */
    public C0832a mo5504n() {
        return this.f4038e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5505o() {
        return this.f4037d.hasPendingAdapterUpdates();
    }
}
