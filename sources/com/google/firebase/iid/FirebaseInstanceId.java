package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.C7990u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p033d5.C4141r;
import p074j5.C4831a;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p257i8.C10562j;
import p267j8.C11499a;
import p276k8.C11600b;
import p285l8.C11765e;
import p367u8.C12709i;

@Deprecated
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f34467i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C7990u f34468j;

    /* renamed from: k */
    private static final Pattern f34469k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: l */
    static ScheduledExecutorService f34470l;

    /* renamed from: m */
    public static final /* synthetic */ int f34471m = 0;

    /* renamed from: a */
    final Executor f34472a;

    /* renamed from: b */
    private final C10412f f34473b;

    /* renamed from: c */
    private final C7982n f34474c;

    /* renamed from: d */
    private final C7979k f34475d;

    /* renamed from: e */
    private final C7987s f34476e;

    /* renamed from: f */
    private final C11765e f34477f;

    /* renamed from: g */
    private boolean f34478g;

    /* renamed from: h */
    private final List<C11499a.C11500a> f34479h;

    FirebaseInstanceId(C10412f fVar, C7982n nVar, Executor executor, Executor executor2, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this.f34478g = false;
        this.f34479h = new ArrayList();
        if (C7982n.m43985c(fVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f34468j == null) {
                    f34468j = new C7990u(fVar.mo33469m());
                }
            }
            this.f34473b = fVar;
            this.f34474c = nVar;
            this.f34475d = new C7979k(fVar, nVar, bVar, bVar2, eVar);
            this.f34472a = executor2;
            this.f34476e = new C7987s(executor);
            this.f34477f = eVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: b */
    private <T> T m43927b(C9975i<T> iVar) throws IOException {
        try {
            return C9980l.m51028b(iVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo26496A();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: c */
    private static <T> T m43928c(C9975i<T> iVar) throws InterruptedException {
        C4141r.m28222l(iVar, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.mo26348c(C7972d.f34486a, new C7973e(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return m43931l(iVar);
    }

    /* renamed from: e */
    private static void m43929e(C10412f fVar) {
        C4141r.m28218h(fVar.mo33471r().mo33485g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C4141r.m28218h(fVar.mo33471r().mo33480c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C4141r.m28218h(fVar.mo33471r().mo33479b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C4141r.m28212b(m43935t(fVar.mo33471r().mo33480c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4141r.m28212b(m43934s(fVar.mo33471r().mo33479b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C10412f fVar) {
        m43929e(fVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) fVar.mo33468k(FirebaseInstanceId.class);
        C4141r.m28222l(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: k */
    private C9975i<C7980l> m43930k(String str, String str2) {
        return C9980l.m51031e(null).mo26356k(this.f34472a, new C7971c(this, str, m43937z(str2)));
    }

    /* renamed from: l */
    private static <T> T m43931l(C9975i<T> iVar) {
        if (iVar.mo26362q()) {
            return iVar.mo26358m();
        }
        if (iVar.mo26360o()) {
            throw new CancellationException("Task is already canceled");
        } else if (iVar.mo26361p()) {
            throw new IllegalStateException(iVar.mo26357l());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* renamed from: m */
    private String m43932m() {
        if ("[DEFAULT]".equals(this.f34473b.mo33470q())) {
            return "";
        }
        return this.f34473b.mo33472s();
    }

    /* renamed from: q */
    static boolean m43933q() {
        if (Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3))) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    static boolean m43934s(String str) {
        return f34469k.matcher(str).matches();
    }

    /* renamed from: t */
    static boolean m43935t(String str) {
        return str.contains(":");
    }

    /* renamed from: z */
    private static String m43937z(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void mo26496A() {
        f34468j.mo26538d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public synchronized void mo26497B(boolean z) {
        this.f34478g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public synchronized void mo26498C() {
        if (!this.f34478g) {
            mo26499D(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized void mo26499D(long j) {
        mo26504g(new C7992v(this, Math.min(Math.max(30, j + j), f34467i)), j);
        this.f34478g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo26500E(C7990u.C7991a aVar) {
        return aVar == null || aVar.mo26544c(this.f34474c.mo26529a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo26501a(C11499a.C11500a aVar) {
        this.f34479h.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo26502d() throws IOException {
        return getToken(C7982n.m43985c(this.f34473b), "*");
    }

    @Deprecated
    /* renamed from: f */
    public void mo26503f(String str, String str2) throws IOException {
        m43929e(this.f34473b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String z = m43937z(str2);
            m43927b(this.f34475d.mo26525b(mo26507i(), str, z));
            f34468j.mo26539e(m43932m(), str, z);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo26504g(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f34470l == null) {
                f34470l = new ScheduledThreadPoolExecutor(1, new C4831a("FirebaseInstanceId"));
            }
            f34470l.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        m43929e(this.f34473b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C7980l) m43927b(m43930k(str, str2))).mo26528a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C10412f mo26506h() {
        return this.f34473b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo26507i() {
        try {
            f34468j.mo26543j(this.f34473b.mo33472s());
            return (String) m43928c(this.f34477f.getId());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Deprecated
    /* renamed from: j */
    public C9975i<C7980l> mo26508j() {
        m43929e(this.f34473b);
        return m43930k(C7982n.m43985c(this.f34473b), "*");
    }

    @Deprecated
    /* renamed from: n */
    public String mo26509n() {
        m43929e(this.f34473b);
        C7990u.C7991a o = mo26510o();
        if (mo26500E(o)) {
            mo26498C();
        }
        return C7990u.C7991a.m44014b(o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C7990u.C7991a mo26510o() {
        return mo26511p(C7982n.m43985c(this.f34473b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C7990u.C7991a mo26511p(String str, String str2) {
        return f34468j.mo26540g(m43932m(), str, str2);
    }

    /* renamed from: r */
    public boolean mo26512r() {
        return this.f34474c.mo26533g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ C9975i mo26513v(String str, String str2, String str3, String str4) throws Exception {
        f34468j.mo26542i(m43932m(), str, str2, str4, this.f34474c.mo26529a());
        return C9980l.m51031e(new C7981m(str3, str4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo26514w(C7990u.C7991a aVar, C7980l lVar) {
        String a = lVar.mo26528a();
        if (aVar == null || !a.equals(aVar.f34528a)) {
            for (C11499a.C11500a a2 : this.f34479h) {
                a2.mo26735a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ C9975i mo26515x(String str, String str2, String str3, C7990u.C7991a aVar) {
        return this.f34475d.mo26526e(str, str2, str3).mo26364s(this.f34472a, new C7975g(this, str2, str3, str)).mo26352g(C7976h.f34497a, new C7977i(this, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ C9975i mo26516y(String str, String str2, C9975i iVar) throws Exception {
        String i = mo26507i();
        C7990u.C7991a p = mo26511p(str, str2);
        if (!mo26500E(p)) {
            return C9980l.m51031e(new C7981m(i, p.f34528a));
        }
        return this.f34476e.mo26534a(str, str2, new C7974f(this, i, str, str2, p));
    }

    FirebaseInstanceId(C10412f fVar, C11600b<C12709i> bVar, C11600b<C10562j> bVar2, C11765e eVar) {
        this(fVar, new C7982n(fVar.mo33469m()), C7970b.m43967b(), C7970b.m43967b(), bVar, bVar2, eVar);
    }
}
