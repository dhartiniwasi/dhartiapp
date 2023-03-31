package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C8303b0;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import com.onesignal.C8592r3;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.o4 */
/* compiled from: UserStateSynchronizer */
abstract class C8532o4 {

    /* renamed from: a */
    protected final Object f35819a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8592r3.C8597d f35820b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f35821c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AtomicBoolean f35822d = new AtomicBoolean();

    /* renamed from: e */
    private final Queue<C8338d3.C8367j0> f35823e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    private final Queue<C8338d3.C8392v0> f35824f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    private final Queue<C8592r3.C8595b> f35825g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    HashMap<Integer, C8538f> f35826h = new HashMap<>();

    /* renamed from: i */
    private final Object f35827i = new C8533a();

    /* renamed from: j */
    protected boolean f35828j = false;

    /* renamed from: k */
    private C8451g4 f35829k;

    /* renamed from: l */
    private C8451g4 f35830l;

    /* renamed from: com.onesignal.o4$a */
    /* compiled from: UserStateSynchronizer */
    class C8533a {
        C8533a() {
        }
    }

    /* renamed from: com.onesignal.o4$b */
    /* compiled from: UserStateSynchronizer */
    class C8534b extends C8524o3.C8531g {
        C8534b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.WARN;
            C8338d3.m46492a(r0Var, "Failed last request. statusCode: " + i + "\nresponse: " + str);
            if (C8532o4.this.m47250U(i, str, "already logged out of email")) {
                C8532o4.this.m47249O();
            } else if (C8532o4.this.m47250U(i, str, "not a valid device_type")) {
                C8532o4.this.m47246J();
            } else {
                C8532o4.this.m47245I(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            C8532o4.this.m47249O();
        }
    }

    /* renamed from: com.onesignal.o4$c */
    /* compiled from: UserStateSynchronizer */
    class C8535c extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ JSONObject f35833a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f35834b;

        C8535c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f35833a = jSONObject;
            this.f35834b = jSONObject2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
            C8338d3.m46492a(r0Var, "Failed PUT sync request with status code: " + i + " and response: " + str);
            synchronized (C8532o4.this.f35819a) {
                if (C8532o4.this.m47250U(i, str, "No user with this id found")) {
                    C8532o4.this.m47246J();
                } else {
                    C8532o4.this.m47245I(i);
                }
            }
            if (this.f35833a.has("tags")) {
                C8532o4.this.m47251Z(new C8338d3.C8368j1(i, str));
            }
            if (this.f35833a.has("external_user_id")) {
                C8338d3.m46594z1(r0Var, "Error setting external user id for push with status code: " + i + " and message: " + str);
                C8532o4.this.m47272u();
            }
            if (this.f35833a.has("language")) {
                C8532o4.this.m47267p(new C8592r3.C8596c(i, str));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            synchronized (C8532o4.this.f35819a) {
                C8532o4.this.mo28025A().mo27827r(this.f35834b, this.f35833a);
                C8532o4.this.mo27906Q(this.f35833a);
            }
            if (this.f35833a.has("tags")) {
                C8532o4.this.m47253a0();
            }
            if (this.f35833a.has("external_user_id")) {
                C8532o4.this.m47273v();
            }
            if (this.f35833a.has("language")) {
                C8532o4.this.m47268q();
            }
        }
    }

    /* renamed from: com.onesignal.o4$d */
    /* compiled from: UserStateSynchronizer */
    class C8536d extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ JSONObject f35836a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f35837b;

        /* renamed from: c */
        final /* synthetic */ String f35838c;

        C8536d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.f35836a = jSONObject;
            this.f35837b = jSONObject2;
            this.f35838c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            synchronized (C8532o4.this.f35819a) {
                C8532o4.this.f35828j = false;
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.WARN;
                C8338d3.m46492a(r0Var, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                if (C8532o4.this.m47250U(i, str, "not a valid device_type")) {
                    C8532o4.this.m47246J();
                } else {
                    C8532o4.this.m47245I(i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            synchronized (C8532o4.this.f35819a) {
                C8532o4 o4Var = C8532o4.this;
                o4Var.f35828j = false;
                o4Var.mo28025A().mo27827r(this.f35836a, this.f35837b);
                try {
                    C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                    C8338d3.m46594z1(r0Var, "doCreateOrNewSession:response: " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String optString = jSONObject.optString("id");
                        C8532o4.this.mo27866g0(optString);
                        C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.INFO;
                        C8338d3.m46492a(r0Var2, "Device registered, UserId = " + optString);
                    } else {
                        C8338d3.C8384r0 r0Var3 = C8338d3.C8384r0.INFO;
                        C8338d3.m46492a(r0Var3, "session sent, UserId = " + this.f35838c);
                    }
                    C8532o4.this.mo28030H().mo27828s("session", Boolean.FALSE);
                    C8532o4.this.mo28030H().mo27826q();
                    if (jSONObject.has("in_app_messages")) {
                        C8338d3.m46541m0().mo27625p0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    C8532o4.this.mo27906Q(this.f35837b);
                } catch (JSONException e) {
                    C8338d3.m46496b(C8338d3.C8384r0.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                }
            }
        }
    }

    /* renamed from: com.onesignal.o4$e */
    /* compiled from: UserStateSynchronizer */
    static class C8537e {

        /* renamed from: a */
        boolean f35840a;

        /* renamed from: b */
        JSONObject f35841b;

        C8537e(boolean z, JSONObject jSONObject) {
            this.f35840a = z;
            this.f35841b = jSONObject;
        }
    }

    /* renamed from: com.onesignal.o4$f */
    /* compiled from: UserStateSynchronizer */
    class C8538f extends HandlerThread {

        /* renamed from: a */
        int f35842a;

        /* renamed from: b */
        Handler f35843b = new Handler(getLooper());

        /* renamed from: c */
        int f35844c;

        /* renamed from: com.onesignal.o4$f$a */
        /* compiled from: UserStateSynchronizer */
        class C8539a implements Runnable {
            C8539a() {
            }

            public void run() {
                if (!C8532o4.this.f35822d.get()) {
                    C8532o4.this.mo28040e0(false);
                }
            }
        }

        C8538f(int i) {
            super("OSH_NetworkHandlerThread_" + C8532o4.this.f35820b);
            this.f35842a = i;
            start();
        }

        /* renamed from: b */
        private Runnable m47311b() {
            if (this.f35842a != 0) {
                return null;
            }
            return new C8539a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo28046a() {
            boolean hasMessages;
            synchronized (this.f35843b) {
                boolean z = this.f35844c < 3;
                boolean hasMessages2 = this.f35843b.hasMessages(0);
                if (z && !hasMessages2) {
                    this.f35844c++;
                    this.f35843b.postDelayed(m47311b(), (long) (this.f35844c * 15000));
                }
                hasMessages = this.f35843b.hasMessages(0);
            }
            return hasMessages;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo28047c() {
            if (C8532o4.this.f35821c) {
                synchronized (this.f35843b) {
                    this.f35844c = 0;
                    this.f35843b.removeCallbacksAndMessages((Object) null);
                    this.f35843b.postDelayed(m47311b(), 5000);
                }
            }
        }
    }

    C8532o4(C8592r3.C8597d dVar) {
        this.f35820b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m47245I(int i) {
        if (i == 403) {
            C8338d3.m46492a(C8338d3.C8384r0.FATAL, "403 error updating player, omitting further retries!");
            m47274x();
        } else if (!mo28026D(0).mo28046a()) {
            m47274x();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m47246J() {
        C8338d3.m46492a(C8338d3.C8384r0.WARN, "Creating new player based on missing player_id noted above.");
        C8338d3.m46484X0();
        mo28035T();
        mo27866g0((String) null);
        mo27907W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        m47271t(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        m47269r(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47247M(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.mo27863B()
            boolean r1 = r8.m47257d0()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r8.m47270s(r0)
            return
        L_0x0010:
            com.onesignal.g4 r1 = r8.f35829k
            if (r1 != 0) goto L_0x0017
            r8.mo28032L()
        L_0x0017:
            if (r9 != 0) goto L_0x0021
            boolean r9 = r8.m47248N()
            if (r9 == 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            java.lang.Object r1 = r8.f35819a
            monitor-enter(r1)
            com.onesignal.g4 r2 = r8.mo28025A()     // Catch:{ all -> 0x0082 }
            com.onesignal.g4 r3 = r8.mo28029G()     // Catch:{ all -> 0x0082 }
            org.json.JSONObject r2 = r2.mo27816d(r3, r9)     // Catch:{ all -> 0x0082 }
            com.onesignal.g4 r3 = r8.mo28029G()     // Catch:{ all -> 0x0082 }
            com.onesignal.g4 r4 = r8.mo28025A()     // Catch:{ all -> 0x0082 }
            r5 = 0
            org.json.JSONObject r3 = r4.mo27817f(r3, r5)     // Catch:{ all -> 0x0082 }
            com.onesignal.d3$r0 r4 = com.onesignal.C8338d3.C8384r0.DEBUG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "UserStateSynchronizer internalSyncUserState from session call: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r9)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = " jsonBody: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0082 }
            com.onesignal.C8338d3.m46594z1(r4, r6)     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0070
            com.onesignal.g4 r9 = r8.mo28025A()     // Catch:{ all -> 0x0082 }
            r9.mo27827r(r3, r5)     // Catch:{ all -> 0x0082 }
            r8.m47253a0()     // Catch:{ all -> 0x0082 }
            r8.m47273v()     // Catch:{ all -> 0x0082 }
            r8.m47268q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            return
        L_0x0070:
            com.onesignal.g4 r4 = r8.mo28029G()     // Catch:{ all -> 0x0082 }
            r4.mo27826q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x007e
            r8.m47271t(r0, r2, r3)
            goto L_0x0081
        L_0x007e:
            r8.m47269r(r0, r2, r3)
        L_0x0081:
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8532o4.m47247M(boolean):void");
    }

    /* renamed from: N */
    private boolean m47248N() {
        return (mo28029G().mo27820i().mo28284b("session") || mo27863B() == null) && !this.f35828j;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m47249O() {
        mo28029G().mo27831v("logoutEmail");
        this.f35830l.mo27831v("email_auth_hash");
        this.f35830l.mo27832w("parent_player_id");
        this.f35830l.mo27832w("email");
        this.f35830l.mo27826q();
        mo28025A().mo27831v("email_auth_hash");
        mo28025A().mo27832w("parent_player_id");
        String f = mo28025A().mo27822l().mo28288f("email");
        mo28025A().mo27832w("email");
        C8592r3.m47637x();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "Device successfully logged out of email: " + f);
        C8338d3.m46484X0();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public boolean m47250U(int i, String str, String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("errors") || !jSONObject.optString("errors").contains(str2)) {
                    return false;
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m47251Z(C8338d3.C8368j1 j1Var) {
        while (true) {
            C8338d3.C8367j0 poll = this.f35823e.poll();
            if (poll != null) {
                poll.mo27729i(j1Var);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m47253a0() {
        JSONObject jSONObject = C8592r3.m47622i(false).f35841b;
        while (true) {
            C8338d3.C8367j0 poll = this.f35823e.poll();
            if (poll != null) {
                poll.mo27728a(jSONObject);
            } else {
                return;
            }
        }
    }

    /* renamed from: d0 */
    private boolean m47257d0() {
        return mo28029G().mo27820i().mo28285c("logoutEmail", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m47267p(C8592r3.C8596c cVar) {
        while (true) {
            C8592r3.C8595b poll = this.f35825g.poll();
            if (poll != null) {
                poll.mo27717a(cVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m47268q() {
        String d = C8592r3.m47617d();
        while (true) {
            C8592r3.C8595b poll = this.f35825g.poll();
            if (poll != null) {
                poll.mo27718b(d);
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private void m47269r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f35828j = true;
        mo27912n(jSONObject);
        C8524o3.m47239k(str2, jSONObject, new C8536d(jSONObject2, jSONObject, str));
    }

    /* renamed from: s */
    private void m47270s(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            C8645x i = mo28025A().mo27820i();
            if (i.mo28283a("email_auth_hash")) {
                jSONObject.put("email_auth_hash", i.mo28288f("email_auth_hash"));
            }
            C8645x l = mo28025A().mo27822l();
            if (l.mo28283a("parent_player_id")) {
                jSONObject.put("parent_player_id", l.mo28288f("parent_player_id"));
            }
            jSONObject.put("app_id", l.mo28288f("app_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C8524o3.m47239k(str2, jSONObject, new C8534b());
    }

    /* renamed from: t */
    private void m47271t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            C8338d3.m46594z1(mo27905C(), "Error updating the user record because of the null user id");
            m47251Z(new C8338d3.C8368j1(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            m47272u();
            m47267p(new C8592r3.C8596c(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        C8524o3.m47241m("players/" + str, jSONObject, new C8535c(jSONObject, jSONObject2));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m47272u() {
        while (true) {
            C8338d3.C8392v0 poll = this.f35824f.poll();
            if (poll != null) {
                poll.mo27750a(mo28045z(), false);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m47273v() {
        while (true) {
            C8338d3.C8392v0 poll = this.f35824f.poll();
            if (poll != null) {
                poll.mo27750a(mo28045z(), true);
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private void m47274x() {
        JSONObject d = mo28025A().mo27816d(this.f35830l, false);
        if (d != null) {
            mo27919w(d);
        }
        if (mo28029G().mo27820i().mo28285c("logoutEmail", false)) {
            C8338d3.m46475U0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C8451g4 mo28025A() {
        if (this.f35829k == null) {
            synchronized (this.f35819a) {
                if (this.f35829k == null) {
                    this.f35829k = mo27864P("CURRENT_STATE", true);
                }
            }
        }
        return this.f35829k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract String mo27863B();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract C8338d3.C8384r0 mo27905C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C8538f mo28026D(Integer num) {
        C8538f fVar;
        synchronized (this.f35827i) {
            if (!this.f35826h.containsKey(num)) {
                this.f35826h.put(num, new C8538f(num.intValue()));
            }
            fVar = this.f35826h.get(num);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public String mo28027E() {
        return mo28029G().mo27822l().mo28289g("identifier", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo28028F() {
        return mo28030H().mo27820i().mo28284b("session");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C8451g4 mo28029G() {
        if (this.f35830l == null) {
            synchronized (this.f35819a) {
                if (this.f35830l == null) {
                    this.f35830l = mo27864P("TOSYNC_STATE", true);
                }
            }
        }
        return this.f35830l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C8451g4 mo28030H() {
        if (this.f35830l == null) {
            this.f35830l = mo28025A().mo27815c("TOSYNC_STATE");
        }
        mo27907W();
        return this.f35830l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo28031K() {
        return this.f35824f.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo28032L() {
        if (this.f35829k == null) {
            synchronized (this.f35819a) {
                if (this.f35829k == null) {
                    this.f35829k = mo27864P("CURRENT_STATE", true);
                }
            }
        }
        mo28029G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract C8451g4 mo27864P(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract void mo27906Q(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo28033R() {
        boolean z = false;
        if (this.f35830l == null) {
            return false;
        }
        synchronized (this.f35819a) {
            if (mo28025A().mo27816d(this.f35830l, m47248N()) != null) {
                z = true;
            }
            this.f35830l.mo27826q();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo28034S(boolean z) {
        boolean z2 = this.f35821c != z;
        this.f35821c = z;
        if (z2 && z) {
            mo27907W();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo28035T() {
        mo28025A().mo27812A(new JSONObject());
        mo28025A().mo27826q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public abstract void mo27865V(String str);

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract void mo27907W();

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo28036X(JSONObject jSONObject, C8524o3.C8531g gVar) {
        C8524o3.m47238j("players/" + mo27863B() + "/on_purchase", jSONObject, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo28037Y(JSONObject jSONObject, C8338d3.C8367j0 j0Var) {
        if (j0Var != null) {
            this.f35823e.add(j0Var);
        }
        mo28030H().mo27819h(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo28038b0(String str, String str2, C8338d3.C8392v0 v0Var) throws JSONException {
        if (v0Var != null) {
            this.f35824f.add(v0Var);
        }
        C8451g4 H = mo28030H();
        H.mo27829t("external_user_id", str);
        if (str2 != null) {
            H.mo27829t("external_user_id_auth_hash", str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo28039c0() {
        try {
            synchronized (this.f35819a) {
                mo28030H().mo27828s("session", Boolean.TRUE);
                mo28030H().mo27826q();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo28040e0(boolean z) {
        this.f35822d.set(true);
        m47247M(z);
        this.f35822d.set(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo28041f0(JSONObject jSONObject, C8592r3.C8595b bVar) {
        if (bVar != null) {
            this.f35825g.add(bVar);
        }
        mo28030H().mo27819h(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public abstract void mo27866g0(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo28042h0(C8303b0.C8307d dVar) {
        mo28030H().mo27835z(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo27912n(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo28043o() {
        mo28029G().mo27814b();
        mo28029G().mo27826q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo27919w(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public JSONObject mo28044y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b;
        synchronized (this.f35819a) {
            b = C8293a0.m46256b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo28045z() {
        return this.f35820b.name().toLowerCase();
    }
}
