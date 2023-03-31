package com.onesignal;

import com.onesignal.C8338d3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p249ha.C10487a;
import p249ha.C10490c;
import p269ja.C11508d;
import p278ka.C11603b;
import p278ka.C11605d;
import p278ka.C11606e;

/* renamed from: com.onesignal.d2 */
/* compiled from: OSOutcomeEventsController */
class C8330d2 {

    /* renamed from: a */
    private Set<String> f35385a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11508d f35386b;

    /* renamed from: c */
    private final C8497m2 f35387c;

    /* renamed from: com.onesignal.d2$a */
    /* compiled from: OSOutcomeEventsController */
    class C8331a implements Runnable {
        C8331a() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C8330d2.this.f35386b.mo35523b().mo35528f("notification", "notification_id");
        }
    }

    /* renamed from: com.onesignal.d2$b */
    /* compiled from: OSOutcomeEventsController */
    class C8332b implements Runnable {
        C8332b() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            for (C11603b b : C8330d2.this.f35386b.mo35523b().mo35525b()) {
                C8330d2.this.m46385p(b);
            }
        }
    }

    /* renamed from: com.onesignal.d2$c */
    /* compiled from: OSOutcomeEventsController */
    class C8333c implements C8450g3 {

        /* renamed from: a */
        final /* synthetic */ C11603b f35390a;

        C8333c(C11603b bVar) {
            this.f35390a = bVar;
        }

        /* renamed from: a */
        public void mo27692a(int i, String str, Throwable th) {
        }

        /* renamed from: b */
        public void mo27693b(String str) {
            C8330d2.this.f35386b.mo35523b().mo35530h(this.f35390a);
        }
    }

    /* renamed from: com.onesignal.d2$d */
    /* compiled from: OSOutcomeEventsController */
    class C8334d implements C8450g3 {

        /* renamed from: a */
        final /* synthetic */ C11603b f35392a;

        /* renamed from: b */
        final /* synthetic */ C8338d3.C8353e1 f35393b;

        /* renamed from: c */
        final /* synthetic */ long f35394c;

        /* renamed from: d */
        final /* synthetic */ String f35395d;

        /* renamed from: com.onesignal.d2$d$a */
        /* compiled from: OSOutcomeEventsController */
        class C8335a implements Runnable {
            C8335a() {
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                C8334d dVar = C8334d.this;
                dVar.f35392a.mo35761f(dVar.f35394c);
                C8330d2.this.f35386b.mo35523b().mo35527d(C8334d.this.f35392a);
            }
        }

        C8334d(C11603b bVar, C8338d3.C8353e1 e1Var, long j, String str) {
            this.f35392a = bVar;
            this.f35393b = e1Var;
            this.f35394c = j;
            this.f35395d = str;
        }

        /* renamed from: a */
        public void mo27692a(int i, String str, Throwable th) {
            new Thread(new C8335a(), "OS_SAVE_OUTCOMES").start();
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.WARN;
            C8338d3.m46594z1(r0Var, "Sending outcome with name: " + this.f35395d + " failed with status code: " + i + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
            C8338d3.C8353e1 e1Var = this.f35393b;
            if (e1Var != null) {
                e1Var.mo27712e((C8324c2) null);
            }
        }

        /* renamed from: b */
        public void mo27693b(String str) {
            C8330d2.this.m46383k(this.f35392a);
            C8338d3.C8353e1 e1Var = this.f35393b;
            if (e1Var != null) {
                e1Var.mo27712e(C8324c2.m46360a(this.f35392a));
            }
        }
    }

    /* renamed from: com.onesignal.d2$e */
    /* compiled from: OSOutcomeEventsController */
    class C8336e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11603b f35398a;

        C8336e(C11603b bVar) {
            this.f35398a = bVar;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C8330d2.this.f35386b.mo35523b().mo35529g(this.f35398a);
        }
    }

    /* renamed from: com.onesignal.d2$f */
    /* compiled from: OSOutcomeEventsController */
    static /* synthetic */ class C8337f {

        /* renamed from: a */
        static final /* synthetic */ int[] f35400a;

        /* renamed from: b */
        static final /* synthetic */ int[] f35401b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                ha.b[] r0 = p249ha.C10488b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35401b = r0
                r1 = 1
                ha.b r2 = p249ha.C10488b.IAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35401b     // Catch:{ NoSuchFieldError -> 0x001d }
                ha.b r3 = p249ha.C10488b.NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                ha.c[] r2 = p249ha.C10490c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f35400a = r2
                ha.c r3 = p249ha.C10490c.DIRECT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f35400a     // Catch:{ NoSuchFieldError -> 0x0038 }
                ha.c r2 = p249ha.C10490c.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f35400a     // Catch:{ NoSuchFieldError -> 0x0043 }
                ha.c r1 = p249ha.C10490c.UNATTRIBUTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f35400a     // Catch:{ NoSuchFieldError -> 0x004e }
                ha.c r1 = p249ha.C10490c.DISABLED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8330d2.C8337f.<clinit>():void");
        }
    }

    public C8330d2(C8497m2 m2Var, C11508d dVar) {
        this.f35387c = m2Var;
        this.f35386b = dVar;
        m46379g();
    }

    /* renamed from: f */
    private List<C10487a> m46378f(String str, List<C10487a> list) {
        List<C10487a> a = this.f35386b.mo35523b().mo35524a(str, list);
        if (a.size() > 0) {
            return a;
        }
        return null;
    }

    /* renamed from: g */
    private void m46379g() {
        this.f35385a = OSUtils.m46179L();
        Set<String> i = this.f35386b.mo35523b().mo35531i();
        if (i != null) {
            this.f35385a = i;
        }
    }

    /* renamed from: h */
    private List<C10487a> m46380h(List<C10487a> list) {
        ArrayList arrayList = new ArrayList(list);
        for (C10487a next : list) {
            if (next.mo33612d().mo33624c()) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "Outcomes disabled for channel: " + next.mo33611c().toString());
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private void m46381i(C11603b bVar) {
        new Thread(new C8336e(bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    /* renamed from: j */
    private void m46382j() {
        this.f35386b.mo35523b().mo35526c(this.f35385a);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m46383k(C11603b bVar) {
        if (bVar.mo35760e()) {
            m46382j();
        } else {
            m46381i(bVar);
        }
    }

    /* renamed from: l */
    private void m46384l(String str, float f, List<C10487a> list, C8338d3.C8353e1 e1Var) {
        C8338d3.C8353e1 e1Var2 = e1Var;
        long b = C8338d3.m46448M0().mo28281b() / 1000;
        int e = new OSUtils().mo27559e();
        String str2 = C8338d3.f35442h;
        boolean z = false;
        C11606e eVar = null;
        C11606e eVar2 = null;
        for (C10487a next : list) {
            int i = C8337f.f35400a[next.mo33612d().ordinal()];
            if (i == 1) {
                if (eVar == null) {
                    eVar = new C11606e();
                }
                eVar = m46387t(next, eVar);
            } else if (i == 2) {
                if (eVar2 == null) {
                    eVar2 = new C11606e();
                }
                eVar2 = m46387t(next, eVar2);
            } else if (i == 3) {
                z = true;
            } else if (i == 4) {
                C8338d3.m46492a(C8338d3.C8384r0.VERBOSE, "Outcomes disabled for channel: " + next.mo33611c());
                if (e1Var2 != null) {
                    e1Var2.mo27712e((C8324c2) null);
                    return;
                }
                return;
            }
        }
        if (eVar == null && eVar2 == null && !z) {
            C8338d3.m46492a(C8338d3.C8384r0.VERBOSE, "Outcomes disabled for all channels");
            if (e1Var2 != null) {
                e1Var2.mo27712e((C8324c2) null);
                return;
            }
            return;
        }
        C11603b bVar = new C11603b(str, new C11605d(eVar, eVar2), f, 0);
        this.f35386b.mo35523b().mo35534e(str2, e, bVar, new C8334d(bVar, e1Var, b, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m46385p(C11603b bVar) {
        int e = new OSUtils().mo27559e();
        this.f35386b.mo35523b().mo35534e(C8338d3.f35442h, e, bVar, new C8333c(bVar));
    }

    /* renamed from: s */
    private void m46386s(String str, List<C10487a> list, C8338d3.C8353e1 e1Var) {
        List<C10487a> h = m46380h(list);
        if (h.isEmpty()) {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z = false;
        Iterator<C10487a> it = h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo33612d().mo33622a()) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            List<C10487a> f = m46378f(str, h);
            if (f == null) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46492a(r0Var, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + h.toString() + "\nOutcome name: " + str);
                if (e1Var != null) {
                    e1Var.mo27712e((C8324c2) null);
                    return;
                }
                return;
            }
            m46384l(str, 0.0f, f, e1Var);
        } else if (this.f35385a.contains(str)) {
            C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var2, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + C10490c.UNATTRIBUTED + "\nOutcome name: " + str);
            if (e1Var != null) {
                e1Var.mo27712e((C8324c2) null);
            }
        } else {
            this.f35385a.add(str);
            m46384l(str, 0.0f, h, e1Var);
        }
    }

    /* renamed from: t */
    private C11606e m46387t(C10487a aVar, C11606e eVar) {
        int i = C8337f.f35401b[aVar.mo33611c().ordinal()];
        if (i == 1) {
            eVar.mo35772c(aVar.mo33610b());
        } else if (i == 2) {
            eVar.mo35773d(aVar.mo33610b());
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27683d() {
        new Thread(new C8331a(), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo27684e() {
        C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "OneSignal cleanOutcomes for session");
        this.f35385a = OSUtils.m46179L();
        m46382j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo27685m(List<C8418f1> list) {
        for (C8418f1 next : list) {
            String a = next.mo27777a();
            if (next.mo27779c()) {
                mo27689r(a, (C8338d3.C8353e1) null);
            } else if (next.mo27778b() > 0.0f) {
                mo27687o(a, next.mo27778b(), (C8338d3.C8353e1) null);
            } else {
                mo27686n(a, (C8338d3.C8353e1) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27686n(String str, C8338d3.C8353e1 e1Var) {
        m46384l(str, 0.0f, this.f35387c.mo27957e(), e1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27687o(String str, float f, C8338d3.C8353e1 e1Var) {
        m46384l(str, f, this.f35387c.mo27957e(), e1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27688q() {
        new Thread(new C8332b(), "OS_SEND_SAVED_OUTCOMES").start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo27689r(String str, C8338d3.C8353e1 e1Var) {
        m46386s(str, this.f35387c.mo27957e(), e1Var);
    }
}
