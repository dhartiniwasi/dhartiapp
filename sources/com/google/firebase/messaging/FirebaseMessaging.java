package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.C8079w0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p074j5.C4831a;
import p084l1.C4907g;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10408b;
import p246h7.C10412f;
import p257i8.C10562j;
import p267j8.C11499a;
import p276k8.C11600b;
import p285l8.C11765e;
import p367u8.C12709i;
import p395x7.C12977a;
import p395x7.C12978b;
import p395x7.C12980d;

public class FirebaseMessaging {

    /* renamed from: o */
    private static final long f34573o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p */
    private static C8079w0 f34574p;

    /* renamed from: q */
    static C4907g f34575q;

    /* renamed from: r */
    static ScheduledExecutorService f34576r;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10412f f34577a;

    /* renamed from: b */
    private final C11499a f34578b;

    /* renamed from: c */
    private final C11765e f34579c;

    /* renamed from: d */
    private final Context f34580d;

    /* renamed from: e */
    private final C8027d0 f34581e;

    /* renamed from: f */
    private final C8068r0 f34582f;

    /* renamed from: g */
    private final C8009a f34583g;

    /* renamed from: h */
    private final Executor f34584h;

    /* renamed from: i */
    private final Executor f34585i;

    /* renamed from: j */
    private final Executor f34586j;

    /* renamed from: k */
    private final C9975i<C8019b1> f34587k;

    /* renamed from: l */
    private final C8044i0 f34588l;

    /* renamed from: m */
    private boolean f34589m;

    /* renamed from: n */
    private final Application.ActivityLifecycleCallbacks f34590n;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    private class C8009a {

        /* renamed from: a */
        private final C12980d f34591a;

        /* renamed from: b */
        private boolean f34592b;

        /* renamed from: c */
        private C12978b<C10408b> f34593c;

        /* renamed from: d */
        private Boolean f34594d;

        C8009a(C12980d dVar) {
            this.f34591a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m44134d(C12977a aVar) {
            if (mo26591c()) {
                FirebaseMessaging.this.m44098Q();
            }
        }

        /* renamed from: e */
        private Boolean m44135e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m = FirebaseMessaging.this.f34577a.mo33469m();
            SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo26590b() {
            if (!this.f34592b) {
                Boolean e = m44135e();
                this.f34594d = e;
                if (e == null) {
                    C8014a0 a0Var = new C8014a0(this);
                    this.f34593c = a0Var;
                    this.f34591a.mo36307c(C10408b.class, a0Var);
                }
                this.f34592b = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo26591c() {
            boolean z;
            mo26590b();
            Boolean bool = this.f34594d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f34577a.mo33474x();
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public synchronized void mo26592f(boolean z) {
            mo26590b();
            C12978b<C10408b> bVar = this.f34593c;
            if (bVar != null) {
                this.f34591a.mo36306a(C10408b.class, bVar);
                this.f34593c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f34577a.mo33469m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.m44098Q();
            }
            this.f34594d = Boolean.valueOf(z);
        }
    }

    FirebaseMessaging(C10412f fVar, C11499a aVar, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar, C4907g gVar, C12980d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, gVar, dVar, new C8044i0(fVar.mo33469m()));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ C9975i m44086A(String str, C8079w0.C8080a aVar) {
        return this.f34581e.mo26626f().mo26364s(this.f34586j, new C8070s(this, str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ C9975i m44087B(String str, C8079w0.C8080a aVar, String str2) throws Exception {
        m44113s(this.f34580d).mo26745g(m44114t(), str, str2, this.f34588l.mo26643a());
        if (aVar == null || !str2.equals(aVar.f34779a)) {
            m44091F(str2);
        }
        return C9980l.m51031e(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m44088C(C9977j jVar) {
        try {
            this.f34578b.mo26518b(C8044i0.m44300c(this.f34577a), "FCM");
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m44089D(C9977j jVar) {
        try {
            C9980l.m51027a(this.f34581e.mo26625c());
            m44113s(this.f34580d).mo26742d(m44114t(), C8044i0.m44300c(this.f34577a));
            jVar.mo32544c(null);
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m44090E(C9977j jVar) {
        try {
            jVar.mo32544c(mo26582n());
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m44092G() {
        if (mo26588y()) {
            m44098Q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m44093H(C8019b1 b1Var) {
        if (mo26588y()) {
            b1Var.mo26617q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m44094I() {
        C8055m0.m44367c(this.f34580d);
    }

    /* renamed from: P */
    private synchronized void m44097P() {
        if (!this.f34589m) {
            mo26579S(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m44098Q() {
        C11499a aVar = this.f34578b;
        if (aVar != null) {
            aVar.mo26517a();
        } else if (mo26580T(mo26587v())) {
            m44097P();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C10412f fVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) fVar.mo33468k(cls);
            C4141r.m28222l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: r */
    public static synchronized FirebaseMessaging m44112r() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C10412f.m52582o());
        }
        return instance;
    }

    /* renamed from: s */
    private static synchronized C8079w0 m44113s(Context context) {
        C8079w0 w0Var;
        synchronized (FirebaseMessaging.class) {
            if (f34574p == null) {
                f34574p = new C8079w0(context);
            }
            w0Var = f34574p;
        }
        return w0Var;
    }

    /* renamed from: t */
    private String m44114t() {
        if ("[DEFAULT]".equals(this.f34577a.mo33470q())) {
            return "";
        }
        return this.f34577a.mo33472s();
    }

    /* renamed from: w */
    public static C4907g m44115w() {
        return f34575q;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m44091F(String str) {
        if ("[DEFAULT]".equals(this.f34577a.mo33470q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f34577a.mo33470q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C8052l(this.f34580d).mo26676i(intent);
        }
    }

    /* renamed from: L */
    public void mo26574L(C8059o0 o0Var) {
        if (!TextUtils.isEmpty(o0Var.mo26695R1())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f34580d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            o0Var.mo26697T1(intent);
            this.f34580d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    /* renamed from: M */
    public void mo26575M(boolean z) {
        this.f34583g.mo26592f(z);
    }

    /* renamed from: N */
    public void mo26576N(boolean z) {
        C8041h0.m44296y(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public synchronized void mo26577O(boolean z) {
        this.f34589m = z;
    }

    /* renamed from: R */
    public C9975i<Void> mo26578R(String str) {
        return this.f34587k.mo26363r(new C8074u(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public synchronized void mo26579S(long j) {
        mo26584p(new C8082x0(this, Math.min(Math.max(30, 2 * j), f34573o)), j);
        this.f34589m = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo26580T(C8079w0.C8080a aVar) {
        return aVar == null || aVar.mo26746b(this.f34588l.mo26643a());
    }

    /* renamed from: U */
    public C9975i<Void> mo26581U(String str) {
        return this.f34587k.mo26363r(new C8072t(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo26582n() throws IOException {
        C11499a aVar = this.f34578b;
        if (aVar != null) {
            try {
                return (String) C9980l.m51027a(aVar.mo26519c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C8079w0.C8080a v = mo26587v();
            if (!mo26580T(v)) {
                return v.f34779a;
            }
            String c = C8044i0.m44300c(this.f34577a);
            try {
                return (String) C9980l.m51027a(this.f34582f.mo26729b(c, new C8063p(this, c, v)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* renamed from: o */
    public C9975i<Void> mo26583o() {
        if (this.f34578b != null) {
            C9977j jVar = new C9977j();
            this.f34584h.execute(new C8084y(this, jVar));
            return jVar.mo32542a();
        } else if (mo26587v() == null) {
            return C9980l.m51031e(null);
        } else {
            C9977j jVar2 = new C9977j();
            C8054m.m44362e().execute(new C8065q(this, jVar2));
            return jVar2.mo32542a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo26584p(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f34576r == null) {
                f34576r = new ScheduledThreadPoolExecutor(1, new C4831a("TAG"));
            }
            f34576r.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Context mo26585q() {
        return this.f34580d;
    }

    /* renamed from: u */
    public C9975i<String> mo26586u() {
        C11499a aVar = this.f34578b;
        if (aVar != null) {
            return aVar.mo26519c();
        }
        C9977j jVar = new C9977j();
        this.f34584h.execute(new C8086z(this, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C8079w0.C8080a mo26587v() {
        return m44113s(this.f34580d).mo26743e(m44114t(), C8044i0.m44300c(this.f34577a));
    }

    /* renamed from: y */
    public boolean mo26588y() {
        return this.f34583g.mo26591c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo26589z() {
        return this.f34588l.mo26647g();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(p246h7.C10412f r12, p267j8.C11499a r13, p276k8.C11600b<p367u8.C12709i> r14, p276k8.C11600b<p257i8.C10562j> r15, p285l8.C11765e r16, p084l1.C4907g r17, p395x7.C12980d r18, com.google.firebase.messaging.C8044i0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.d0 r7 = new com.google.firebase.messaging.d0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.C8054m.m44363f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.C8054m.m44360c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.C8054m.m44359b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(h7.f, j8.a, k8.b, k8.b, l8.e, l1.g, x7.d, com.google.firebase.messaging.i0):void");
    }

    FirebaseMessaging(C10412f fVar, C11499a aVar, C11765e eVar, C4907g gVar, C12980d dVar, C8044i0 i0Var, C8027d0 d0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f34589m = false;
        f34575q = gVar;
        this.f34577a = fVar;
        this.f34578b = aVar;
        this.f34579c = eVar;
        this.f34583g = new C8009a(dVar);
        Context m = fVar.mo33469m();
        this.f34580d = m;
        C8058o oVar = new C8058o();
        this.f34590n = oVar;
        this.f34588l = i0Var;
        this.f34585i = executor;
        this.f34581e = d0Var;
        this.f34582f = new C8068r0(executor);
        this.f34584h = executor2;
        this.f34586j = executor3;
        Context m2 = fVar.mo33469m();
        if (m2 instanceof Application) {
            ((Application) m2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + m2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.mo26520d(new C8076v(this));
        }
        executor2.execute(new C8081x(this));
        C9975i<C8019b1> f = C8019b1.m44171f(this, i0Var, d0Var, m, C8054m.m44364g());
        this.f34587k = f;
        f.mo26352g(executor2, new C8067r(this));
        executor2.execute(new C8078w(this));
    }
}
