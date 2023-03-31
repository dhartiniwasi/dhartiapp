package p238g8;

import java.util.Locale;
import p008a8.C6516z0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10468v;
import p343rc.C12335j1;

/* renamed from: g8.i0 */
/* compiled from: OnlineStateTracker */
class C10240i0 {

    /* renamed from: a */
    private C6516z0 f40725a = C6516z0.UNKNOWN;

    /* renamed from: b */
    private int f40726b;

    /* renamed from: c */
    private C10442g.C10444b f40727c;

    /* renamed from: d */
    private boolean f40728d = true;

    /* renamed from: e */
    private final C10442g f40729e;

    /* renamed from: f */
    private final C10241a f40730f;

    /* renamed from: g8.i0$a */
    /* compiled from: OnlineStateTracker */
    interface C10241a {
        /* renamed from: a */
        void mo32947a(C6516z0 z0Var);
    }

    C10240i0(C10442g gVar, C10241a aVar) {
        this.f40729e = gVar;
        this.f40730f = aVar;
    }

    /* renamed from: b */
    private void m51806b() {
        C10442g.C10444b bVar = this.f40727c;
        if (bVar != null) {
            bVar.mo33528c();
            this.f40727c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m51807f() {
        this.f40727c = null;
        C10432b.m52648d(this.f40725a == C6516z0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        m51808g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", new Object[]{10}));
        m51809h(C6516z0.OFFLINE);
    }

    /* renamed from: g */
    private void m51808g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", new Object[]{str});
        if (this.f40728d) {
            C10468v.m52770d("OnlineStateTracker", "%s", format);
            this.f40728d = false;
            return;
        }
        C10468v.m52767a("OnlineStateTracker", "%s", format);
    }

    /* renamed from: h */
    private void m51809h(C6516z0 z0Var) {
        if (z0Var != this.f40725a) {
            this.f40725a = z0Var;
            this.f40730f.mo32947a(z0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6516z0 mo32943c() {
        return this.f40725a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32944d(C12335j1 j1Var) {
        boolean z = true;
        if (this.f40725a == C6516z0.ONLINE) {
            m51809h(C6516z0.UNKNOWN);
            C10432b.m52648d(this.f40726b == 0, "watchStreamFailures must be 0", new Object[0]);
            if (this.f40727c != null) {
                z = false;
            }
            C10432b.m52648d(z, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i = this.f40726b + 1;
        this.f40726b = i;
        if (i >= 1) {
            m51806b();
            m51808g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", new Object[]{1, j1Var}));
            m51809h(C6516z0.OFFLINE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo32945e() {
        if (this.f40726b == 0) {
            m51809h(C6516z0.UNKNOWN);
            C10432b.m52648d(this.f40727c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f40727c = this.f40729e.mo33520k(C10442g.C10448d.ONLINE_STATE_TIMEOUT, 10000, new C10238h0(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo32946i(C6516z0 z0Var) {
        m51806b();
        this.f40726b = 0;
        if (z0Var == C6516z0.ONLINE) {
            this.f40728d = false;
        }
        m51809h(z0Var);
    }
}
