package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.k */
/* compiled from: MenuHostHelper */
public class C0920k {

    /* renamed from: a */
    private final Runnable f2574a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C0945m> f2575b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<C0945m, C0921a> f2576c = new HashMap();

    /* renamed from: androidx.core.view.k$a */
    /* compiled from: MenuHostHelper */
    private static class C0921a {

        /* renamed from: a */
        final C1208j f2577a;

        /* renamed from: b */
        private C1216l f2578b;

        C0921a(C1208j jVar, C1216l lVar) {
            this.f2577a = jVar;
            this.f2578b = lVar;
            jVar.mo4399a(lVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3406a() {
            this.f2577a.mo4401c(this.f2578b);
            this.f2578b = null;
        }
    }

    public C0920k(Runnable runnable) {
        this.f2574a = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m4148f(C0945m mVar, C1220n nVar, C1208j.C1210b bVar) {
        if (bVar == C1208j.C1210b.ON_DESTROY) {
            mo3405l(mVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m4149g(C1208j.C1211c cVar, C0945m mVar, C1220n nVar, C1208j.C1210b bVar) {
        if (bVar == C1208j.C1210b.m5426j(cVar)) {
            mo3398c(mVar);
        } else if (bVar == C1208j.C1210b.ON_DESTROY) {
            mo3405l(mVar);
        } else if (bVar == C1208j.C1210b.m5424a(cVar)) {
            this.f2575b.remove(mVar);
            this.f2574a.run();
        }
    }

    /* renamed from: c */
    public void mo3398c(C0945m mVar) {
        this.f2575b.add(mVar);
        this.f2574a.run();
    }

    /* renamed from: d */
    public void mo3399d(C0945m mVar, C1220n nVar) {
        mo3398c(mVar);
        C1208j lifecycle = nVar.getLifecycle();
        C0921a remove = this.f2576c.remove(mVar);
        if (remove != null) {
            remove.mo3406a();
        }
        this.f2576c.put(mVar, new C0921a(lifecycle, new C0916i(this, mVar)));
    }

    /* renamed from: e */
    public void mo3400e(C0945m mVar, C1220n nVar, C1208j.C1211c cVar) {
        C1208j lifecycle = nVar.getLifecycle();
        C0921a remove = this.f2576c.remove(mVar);
        if (remove != null) {
            remove.mo3406a();
        }
        this.f2576c.put(mVar, new C0921a(lifecycle, new C0918j(this, cVar, mVar)));
    }

    /* renamed from: h */
    public void mo3401h(Menu menu, MenuInflater menuInflater) {
        Iterator<C0945m> it = this.f2575b.iterator();
        while (it.hasNext()) {
            it.next().mo3472c(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void mo3402i(Menu menu) {
        Iterator<C0945m> it = this.f2575b.iterator();
        while (it.hasNext()) {
            it.next().mo3471b(menu);
        }
    }

    /* renamed from: j */
    public boolean mo3403j(MenuItem menuItem) {
        Iterator<C0945m> it = this.f2575b.iterator();
        while (it.hasNext()) {
            if (it.next().mo3470a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3404k(Menu menu) {
        Iterator<C0945m> it = this.f2575b.iterator();
        while (it.hasNext()) {
            it.next().mo3473d(menu);
        }
    }

    /* renamed from: l */
    public void mo3405l(C0945m mVar) {
        this.f2575b.remove(mVar);
        C0921a remove = this.f2576c.remove(mVar);
        if (remove != null) {
            remove.mo3406a();
        }
        this.f2574a.run();
    }
}
