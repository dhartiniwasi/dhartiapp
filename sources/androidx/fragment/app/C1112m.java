package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1114n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.m */
/* compiled from: FragmentLifecycleCallbacksDispatcher */
class C1112m {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C1113a> f3041a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final C1114n f3042b;

    /* renamed from: androidx.fragment.app.m$a */
    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class C1113a {

        /* renamed from: a */
        final C1114n.C1126l f3043a;

        /* renamed from: b */
        final boolean f3044b;

        C1113a(C1114n.C1126l lVar, boolean z) {
            this.f3043a = lVar;
            this.f3044b = z;
        }
    }

    C1112m(C1114n nVar) {
        this.f3042b = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4074a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4074a(fragment, bundle, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4188a(this.f3042b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4075b(Fragment fragment, boolean z) {
        Context f = this.f3042b.mo4166t0().mo4066f();
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4075b(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4189b(this.f3042b, fragment, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4076c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4076c(fragment, bundle, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4190c(this.f3042b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4077d(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4077d(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4191d(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4078e(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4078e(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4192e(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4079f(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4079f(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4193f(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4080g(Fragment fragment, boolean z) {
        Context f = this.f3042b.mo4166t0().mo4066f();
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4080g(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4194g(this.f3042b, fragment, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4081h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4081h(fragment, bundle, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4195h(this.f3042b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4082i(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4082i(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4196i(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4083j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4083j(fragment, bundle, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4197j(this.f3042b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4084k(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4084k(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4198k(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4085l(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4085l(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4199l(this.f3042b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4086m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4086m(fragment, view, bundle, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4200m(this.f3042b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4087n(Fragment fragment, boolean z) {
        Fragment w0 = this.f3042b.mo4171w0();
        if (w0 != null) {
            w0.mo3742C().mo4170v0().mo4087n(fragment, true);
        }
        Iterator<C1113a> it = this.f3041a.iterator();
        while (it.hasNext()) {
            C1113a next = it.next();
            if (!z || next.f3044b) {
                next.f3043a.mo4201n(this.f3042b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo4088o(C1114n.C1126l lVar, boolean z) {
        this.f3041a.add(new C1113a(lVar, z));
    }

    /* renamed from: p */
    public void mo4089p(C1114n.C1126l lVar) {
        synchronized (this.f3041a) {
            int i = 0;
            int size = this.f3041a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3041a.get(i).f3043a == lVar) {
                    this.f3041a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
