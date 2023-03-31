package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0789f;
import androidx.core.provider.C0795g;

/* renamed from: androidx.core.provider.a */
/* compiled from: CallbackWithHandler */
class C0781a {

    /* renamed from: a */
    private final C0795g.C0798c f2345a;

    /* renamed from: b */
    private final Handler f2346b;

    /* renamed from: androidx.core.provider.a$a */
    /* compiled from: CallbackWithHandler */
    class C0782a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0795g.C0798c f2347a;

        /* renamed from: b */
        final /* synthetic */ Typeface f2348b;

        C0782a(C0795g.C0798c cVar, Typeface typeface) {
            this.f2347a = cVar;
            this.f2348b = typeface;
        }

        public void run() {
            this.f2347a.mo3118b(this.f2348b);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* compiled from: CallbackWithHandler */
    class C0783b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0795g.C0798c f2350a;

        /* renamed from: b */
        final /* synthetic */ int f2351b;

        C0783b(C0795g.C0798c cVar, int i) {
            this.f2350a = cVar;
            this.f2351b = i;
        }

        public void run() {
            this.f2350a.mo3117a(this.f2351b);
        }
    }

    C0781a(C0795g.C0798c cVar, Handler handler) {
        this.f2345a = cVar;
        this.f2346b = handler;
    }

    /* renamed from: a */
    private void m3541a(int i) {
        this.f2346b.post(new C0783b(this.f2345a, i));
    }

    /* renamed from: c */
    private void m3542c(Typeface typeface) {
        this.f2346b.post(new C0782a(this.f2345a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3156b(C0789f.C0794e eVar) {
        if (eVar.mo3174a()) {
            m3542c(eVar.f2375a);
        } else {
            m3541a(eVar.f2376b);
        }
    }
}
