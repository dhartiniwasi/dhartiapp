package p008a8;

import android.content.Context;
import com.google.firebase.firestore.C7964z;
import p025c8.C6778c1;
import p025c8.C6785d4;
import p025c8.C6795i0;
import p025c8.C6802k;
import p238g8.C10248k;
import p238g8.C10256n;
import p238g8.C10261o0;
import p247h8.C10432b;
import p247h8.C10442g;
import p404y7.C13073j;

/* renamed from: a8.j */
/* compiled from: ComponentProvider */
public abstract class C6474j {

    /* renamed from: a */
    private C6778c1 f30768a;

    /* renamed from: b */
    private C6795i0 f30769b;

    /* renamed from: c */
    private C6465f1 f30770c;

    /* renamed from: d */
    private C10261o0 f30771d;

    /* renamed from: e */
    private C6484p f30772e;

    /* renamed from: f */
    private C10248k f30773f;

    /* renamed from: g */
    private C6802k f30774g;

    /* renamed from: h */
    private C6785d4 f30775h;

    /* renamed from: a8.j$a */
    /* compiled from: ComponentProvider */
    public static class C6475a {

        /* renamed from: a */
        private final Context f30776a;

        /* renamed from: b */
        private final C10442g f30777b;

        /* renamed from: c */
        private final C6479m f30778c;

        /* renamed from: d */
        private final C10256n f30779d;

        /* renamed from: e */
        private final C13073j f30780e;

        /* renamed from: f */
        private final int f30781f;

        /* renamed from: g */
        private final C7964z f30782g;

        public C6475a(Context context, C10442g gVar, C6479m mVar, C10256n nVar, C13073j jVar, int i, C7964z zVar) {
            this.f30776a = context;
            this.f30777b = gVar;
            this.f30778c = mVar;
            this.f30779d = nVar;
            this.f30780e = jVar;
            this.f30781f = i;
            this.f30782g = zVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10442g mo21976a() {
            return this.f30777b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Context mo21977b() {
            return this.f30776a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6479m mo21978c() {
            return this.f30778c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C10256n mo21979d() {
            return this.f30779d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C13073j mo21980e() {
            return this.f30780e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo21981f() {
            return this.f30781f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C7964z mo21982g() {
            return this.f30782g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10248k mo21962a(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C6484p mo21963b(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C6785d4 mo21911c(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C6802k mo21912d(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C6795i0 mo21964e(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C6778c1 mo21913f(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C10261o0 mo21965g(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C6465f1 mo21966h(C6475a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10248k mo21967i() {
        return (C10248k) C10432b.m52649e(this.f30773f, "connectivityMonitor not initialized yet", new Object[0]);
    }

    /* renamed from: j */
    public C6484p mo21968j() {
        return (C6484p) C10432b.m52649e(this.f30772e, "eventManager not initialized yet", new Object[0]);
    }

    /* renamed from: k */
    public C6785d4 mo21969k() {
        return this.f30775h;
    }

    /* renamed from: l */
    public C6802k mo21970l() {
        return this.f30774g;
    }

    /* renamed from: m */
    public C6795i0 mo21971m() {
        return (C6795i0) C10432b.m52649e(this.f30769b, "localStore not initialized yet", new Object[0]);
    }

    /* renamed from: n */
    public C6778c1 mo21972n() {
        return (C6778c1) C10432b.m52649e(this.f30768a, "persistence not initialized yet", new Object[0]);
    }

    /* renamed from: o */
    public C10261o0 mo21973o() {
        return (C10261o0) C10432b.m52649e(this.f30771d, "remoteStore not initialized yet", new Object[0]);
    }

    /* renamed from: p */
    public C6465f1 mo21974p() {
        return (C6465f1) C10432b.m52649e(this.f30770c, "syncEngine not initialized yet", new Object[0]);
    }

    /* renamed from: q */
    public void mo21975q(C6475a aVar) {
        C6778c1 f = mo21913f(aVar);
        this.f30768a = f;
        f.mo22752m();
        this.f30769b = mo21964e(aVar);
        this.f30773f = mo21962a(aVar);
        this.f30771d = mo21965g(aVar);
        this.f30770c = mo21966h(aVar);
        this.f30772e = mo21963b(aVar);
        this.f30769b.mo22839m0();
        this.f30771d.mo33016P();
        this.f30775h = mo21911c(aVar);
        this.f30774g = mo21912d(aVar);
    }
}
