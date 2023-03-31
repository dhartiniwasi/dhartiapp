package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.C8001d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10561i;
import p276k8.C11600b;
import p285l8.C11761a;
import p285l8.C11762b;
import p285l8.C11763c;
import p285l8.C11764d;
import p285l8.C11765e;
import p285l8.C11767g;
import p294m8.C11870a;
import p302n7.C11972x;
import p303n8.C11978b;
import p303n8.C11979c;
import p303n8.C11981d;
import p312o8.C12036c;
import p312o8.C12037d;
import p312o8.C12041f;

/* renamed from: com.google.firebase.installations.c */
/* compiled from: FirebaseInstallations */
public class C7998c implements C11765e {

    /* renamed from: m */
    private static final Object f34544m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f34545n = new C7999a();

    /* renamed from: a */
    private final C10412f f34546a;

    /* renamed from: b */
    private final C12036c f34547b;

    /* renamed from: c */
    private final C11979c f34548c;

    /* renamed from: d */
    private final C8008i f34549d;

    /* renamed from: e */
    private final C11972x<C11978b> f34550e;

    /* renamed from: f */
    private final C11767g f34551f;

    /* renamed from: g */
    private final Object f34552g;

    /* renamed from: h */
    private final ExecutorService f34553h;

    /* renamed from: i */
    private final Executor f34554i;

    /* renamed from: j */
    private String f34555j;

    /* renamed from: k */
    private Set<C11870a> f34556k;

    /* renamed from: l */
    private final List<C8007h> f34557l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* compiled from: FirebaseInstallations */
    class C7999a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f34558a = new AtomicInteger(1);

        C7999a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f34558a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class C8000b {

        /* renamed from: a */
        static final /* synthetic */ int[] f34559a;

        /* renamed from: b */
        static final /* synthetic */ int[] f34560b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                o8.f$b[] r0 = p312o8.C12041f.C12043b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34560b = r0
                r1 = 1
                o8.f$b r2 = p312o8.C12041f.C12043b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f34560b     // Catch:{ NoSuchFieldError -> 0x001d }
                o8.f$b r3 = p312o8.C12041f.C12043b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f34560b     // Catch:{ NoSuchFieldError -> 0x0028 }
                o8.f$b r3 = p312o8.C12041f.C12043b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                o8.d$b[] r2 = p312o8.C12037d.C12039b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f34559a = r2
                o8.d$b r3 = p312o8.C12037d.C12039b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f34559a     // Catch:{ NoSuchFieldError -> 0x0043 }
                o8.d$b r2 = p312o8.C12037d.C12039b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C7998c.C8000b.<clinit>():void");
        }
    }

    C7998c(C10412f fVar, C11600b<C10561i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new C12036c(fVar.mo33469m(), bVar), new C11979c(fVar), C8008i.m44078c(), new C11972x(new C11764d(fVar)), new C11767g());
    }

    /* renamed from: A */
    private String m44032A(C11981d dVar) {
        if ((!this.f34546a.mo33470q().equals("CHIME_ANDROID_SDK") && !this.f34546a.mo33475y()) || !dVar.mo36339m()) {
            return this.f34551f.mo36003a();
        }
        String f = m44049o().mo36331f();
        return TextUtils.isEmpty(f) ? this.f34551f.mo36003a() : f;
    }

    /* renamed from: B */
    private C11981d m44033B(C11981d dVar) throws C8001d {
        C12037d d = this.f34547b.mo36412d(mo26564l(), dVar.mo36314d(), mo26566t(), mo26565m(), (dVar.mo36314d() == null || dVar.mo36314d().length() != 11) ? null : m44049o().mo36332i());
        int i = C8000b.f34559a[d.mo36391e().ordinal()];
        if (i == 1) {
            return dVar.mo36344s(d.mo36389c(), d.mo36390d(), this.f34549d.mo26571b(), d.mo36388b().mo36403c(), d.mo36388b().mo36404d());
        } else if (i == 2) {
            return dVar.mo36342q("BAD CONFIG");
        } else {
            throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
        }
    }

    /* renamed from: C */
    private void m44034C(Exception exc) {
        synchronized (this.f34552g) {
            Iterator<C8007h> it = this.f34557l.iterator();
            while (it.hasNext()) {
                if (it.next().mo26568a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: D */
    private void m44035D(C11981d dVar) {
        synchronized (this.f34552g) {
            Iterator<C8007h> it = this.f34557l.iterator();
            while (it.hasNext()) {
                if (it.next().mo26569b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: E */
    private synchronized void m44036E(String str) {
        this.f34555j = str;
    }

    /* renamed from: F */
    private synchronized void m44037F(C11981d dVar, C11981d dVar2) {
        if (this.f34556k.size() != 0 && !TextUtils.equals(dVar.mo36314d(), dVar2.mo36314d())) {
            for (C11870a a : this.f34556k) {
                a.mo36124a(dVar2.mo36314d());
            }
        }
    }

    /* renamed from: f */
    private C9975i<C8005g> m44042f() {
        C9977j jVar = new C9977j();
        m44044h(new C8003e(this.f34549d, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: g */
    private C9975i<String> m44043g() {
        C9977j jVar = new C9977j();
        m44044h(new C8004f(jVar));
        return jVar.mo32542a();
    }

    /* renamed from: h */
    private void m44044h(C8007h hVar) {
        synchronized (this.f34552g) {
            this.f34557l.add(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m44055v(boolean r3) {
        /*
            r2 = this;
            n8.d r0 = r2.m44052r()
            boolean r1 = r0.mo36335i()     // Catch:{ d -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo36338l()     // Catch:{ d -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.i r3 = r2.f34549d     // Catch:{ d -> 0x005f }
            boolean r3 = r3.mo26573f(r0)     // Catch:{ d -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            n8.d r3 = r2.m44047k(r0)     // Catch:{ d -> 0x005f }
            goto L_0x0026
        L_0x0022:
            n8.d r3 = r2.m44033B(r0)     // Catch:{ d -> 0x005f }
        L_0x0026:
            r2.m44054u(r3)
            r2.m44037F(r0, r3)
            boolean r0 = r3.mo36337k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo36314d()
            r2.m44036E(r0)
        L_0x0039:
            boolean r0 = r3.mo36335i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.C8001d.C8002a.BAD_CONFIG
            r3.<init>(r0)
            r2.m44034C(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo36336j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m44034C(r3)
            goto L_0x005e
        L_0x005b:
            r2.m44035D(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m44034C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C7998c.m44055v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m44057x(boolean z) {
        C11981d s = m44053s();
        if (z) {
            s = s.mo36341p();
        }
        m44035D(s);
        this.f34554i.execute(new C11762b(this, z));
    }

    /* renamed from: k */
    private C11981d m44047k(C11981d dVar) throws C8001d {
        C12041f e = this.f34547b.mo36413e(mo26564l(), dVar.mo36314d(), mo26566t(), dVar.mo36317f());
        int i = C8000b.f34560b[e.mo36402b().ordinal()];
        if (i == 1) {
            return dVar.mo36340o(e.mo36403c(), e.mo36404d(), this.f34549d.mo26571b());
        } else if (i == 2) {
            return dVar.mo36342q("BAD CONFIG");
        } else {
            if (i == 3) {
                m44036E((String) null);
                return dVar.mo36343r();
            }
            throw new C8001d("Firebase Installations Service is unavailable. Please try again later.", C8001d.C8002a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    private synchronized String m44048n() {
        return this.f34555j;
    }

    /* renamed from: o */
    private C11978b m44049o() {
        return this.f34550e.get();
    }

    /* renamed from: p */
    public static C7998c m44050p() {
        return m44051q(C10412f.m52582o());
    }

    /* renamed from: q */
    public static C7998c m44051q(C10412f fVar) {
        C4141r.m28212b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (C7998c) fVar.mo33468k(C11765e.class);
    }

    /* renamed from: r */
    private C11981d m44052r() {
        C11981d d;
        synchronized (f34544m) {
            C7997b a = C7997b.m44030a(this.f34546a.mo33469m(), "generatefid.lock");
            try {
                d = this.f34548c.mo36334d();
                if (a != null) {
                    a.mo26561b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo26561b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: s */
    private C11981d m44053s() {
        C11981d d;
        synchronized (f34544m) {
            C7997b a = C7997b.m44030a(this.f34546a.mo33469m(), "generatefid.lock");
            try {
                d = this.f34548c.mo36334d();
                if (d.mo36336j()) {
                    d = this.f34548c.mo36333b(d.mo36345t(m44032A(d)));
                }
                if (a != null) {
                    a.mo26561b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo26561b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: u */
    private void m44054u(C11981d dVar) {
        synchronized (f34544m) {
            C7997b a = C7997b.m44030a(this.f34546a.mo33469m(), "generatefid.lock");
            try {
                this.f34548c.mo36333b(dVar);
                if (a != null) {
                    a.mo26561b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo26561b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m44056w() {
        m44057x(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ C11978b m44058y(C10412f fVar) {
        return new C11978b(fVar);
    }

    /* renamed from: z */
    private void m44059z() {
        C4141r.m28218h(mo26565m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4141r.m28218h(mo26566t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4141r.m28218h(mo26564l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4141r.m28212b(C8008i.m44081h(mo26565m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4141r.m28212b(C8008i.m44080g(mo26564l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: a */
    public C9975i<C8005g> mo26562a(boolean z) {
        m44059z();
        C9975i<C8005g> f = m44042f();
        this.f34553h.execute(new C11763c(this, z));
        return f;
    }

    public C9975i<String> getId() {
        m44059z();
        String n = m44048n();
        if (n != null) {
            return C9980l.m51031e(n);
        }
        C9975i<String> g = m44043g();
        this.f34553h.execute(new C11761a(this));
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo26564l() {
        return this.f34546a.mo33471r().mo33479b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo26565m() {
        return this.f34546a.mo33471r().mo33480c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo26566t() {
        return this.f34546a.mo33471r().mo33485g();
    }

    C7998c(ExecutorService executorService, Executor executor, C10412f fVar, C12036c cVar, C11979c cVar2, C8008i iVar, C11972x<C11978b> xVar, C11767g gVar) {
        this.f34552g = new Object();
        this.f34556k = new HashSet();
        this.f34557l = new ArrayList();
        this.f34546a = fVar;
        this.f34547b = cVar;
        this.f34548c = cVar2;
        this.f34549d = iVar;
        this.f34550e = xVar;
        this.f34551f = gVar;
        this.f34553h = executorService;
        this.f34554i = executor;
    }
}
