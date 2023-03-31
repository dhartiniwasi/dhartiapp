package p144t5;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p403y6.C13051b;
import p403y6.C13058e;
import p403y6.C13059f;

/* renamed from: t5.z */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5613z implements C13051b {

    /* renamed from: a */
    private final Application f28251a;

    /* renamed from: b */
    private final C5539d f28252b;

    /* renamed from: c */
    private final C5568k0 f28253c;

    /* renamed from: d */
    private final C5577n f28254d;

    /* renamed from: e */
    private final C5544e0 f28255e;

    /* renamed from: f */
    private final C5579n1<C5560i0> f28256f;

    /* renamed from: g */
    private Dialog f28257g;

    /* renamed from: h */
    private C5560i0 f28258h;

    /* renamed from: i */
    private final AtomicBoolean f28259i = new AtomicBoolean();

    /* renamed from: j */
    private final AtomicReference<C5610y> f28260j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicReference<C13051b.C13052a> f28261k = new AtomicReference<>();

    /* renamed from: l */
    private final AtomicReference<C5607x> f28262l = new AtomicReference<>();

    public C5613z(Application application, C5539d dVar, C5568k0 k0Var, C5577n nVar, C5544e0 e0Var, C5579n1<C5560i0> n1Var) {
        this.f28251a = application;
        this.f28252b = dVar;
        this.f28253c = k0Var;
        this.f28254d = nVar;
        this.f28255e = e0Var;
        this.f28256f = n1Var;
    }

    /* renamed from: h */
    private final void m33692h() {
        Dialog dialog = this.f28257g;
        if (dialog != null) {
            dialog.dismiss();
            this.f28257g = null;
        }
        this.f28253c.mo19872a((Activity) null);
        C5607x andSet = this.f28262l.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f28237b.f28251a.unregisterActivityLifecycleCallbacks(andSet);
        }
    }

    /* renamed from: a */
    public final void mo19911a(Activity activity, C13051b.C13052a aVar) {
        C5553g1.m33607a();
        if (!this.f28259i.compareAndSet(false, true)) {
            aVar.mo35661a(new C5600u1(3, "ConsentForm#show can only be invoked once.").mo19895a());
            return;
        }
        C5607x xVar = new C5607x(this, activity);
        this.f28251a.registerActivityLifecycleCallbacks(xVar);
        this.f28262l.set(xVar);
        this.f28253c.mo19872a(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.f28258h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.mo35661a(new C5600u1(3, "Activity with null windows is passed in.").mo19895a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f28261k.set(aVar);
        dialog.show();
        this.f28257g = dialog;
        this.f28258h.mo19866b("UMP_messagePresented", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5560i0 mo19912b() {
        return this.f28258h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo19913c(C13059f.C13061b bVar, C13059f.C13060a aVar) {
        C5560i0 a = ((C5564j0) this.f28256f).mo19832d();
        this.f28258h = a;
        a.setBackgroundColor(0);
        a.getSettings().setJavaScriptEnabled(true);
        a.setWebViewClient(new C5556h0(a, (C5552g0) null));
        this.f28260j.set(new C5610y(bVar, aVar, (C5604w) null));
        this.f28258h.loadDataWithBaseURL(this.f28255e.mo19845a(), this.f28255e.mo19846b(), "text/html", "UTF-8", (String) null);
        C5553g1.f28092a.postDelayed(new C5601v(this), 10000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo19914d(int i) {
        m33692h();
        C13051b.C13052a andSet = this.f28261k.getAndSet((Object) null);
        if (andSet != null) {
            this.f28254d.mo19884f(3);
            andSet.mo35661a((C13058e) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo19915e(C5600u1 u1Var) {
        m33692h();
        C13051b.C13052a andSet = this.f28261k.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo35661a(u1Var.mo19895a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo19916f() {
        C5610y andSet = this.f28260j.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo19908a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo19917g(C5600u1 u1Var) {
        C5610y andSet = this.f28260j.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo19909b(u1Var.mo19895a());
        }
    }
}
