package com.onesignal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.C8338d3;
import com.onesignal.C8487m1;
import com.onesignal.C8571q0;
import com.onesignal.C8601s2;
import com.onesignal.C8646x0;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p259ia.C10568a;

/* renamed from: com.onesignal.z0 */
/* compiled from: OSInAppMessageController */
class C8667z0 extends C8505n0 implements C8571q0.C8574c, C8601s2.C8604c {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final Object f36181v = new Object();

    /* renamed from: w */
    private static ArrayList<String> f36182w = new C8676i();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8547p1 f36183a;

    /* renamed from: b */
    private final C8616t2 f36184b;

    /* renamed from: c */
    private final C10568a f36185c;

    /* renamed from: d */
    private C8601s2 f36186d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8487m1 f36187e;

    /* renamed from: f */
    private C8329d1 f36188f;

    /* renamed from: g */
    C8298a3 f36189g;

    /* renamed from: h */
    private ArrayList<C8323c1> f36190h;

    /* renamed from: i */
    private final Set<String> f36191i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Set<String> f36192j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Set<String> f36193k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Set<String> f36194l;

    /* renamed from: m */
    private final ArrayList<C8323c1> f36195m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<C8323c1> f36196n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8460i1 f36197o = null;

    /* renamed from: p */
    private boolean f36198p = true;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f36199q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f36200r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C8662y0 f36201s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f36202t = false;

    /* renamed from: u */
    Date f36203u = null;

    /* renamed from: com.onesignal.z0$a */
    /* compiled from: OSInAppMessageController */
    class C8668a implements C8487m1.C8496i {

        /* renamed from: a */
        final /* synthetic */ String f36204a;

        /* renamed from: b */
        final /* synthetic */ C8323c1 f36205b;

        C8668a(String str, C8323c1 c1Var) {
            this.f36204a = str;
            this.f36205b = c1Var;
        }

        /* renamed from: b */
        public void mo27953b(String str) {
        }

        /* renamed from: c */
        public void mo27954c(String str) {
            C8667z0.this.f36194l.remove(this.f36204a);
            this.f36205b.mo27652n(this.f36204a);
        }
    }

    /* renamed from: com.onesignal.z0$b */
    /* compiled from: OSInAppMessageController */
    class C8669b extends C8452h {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36207a;

        C8669b(C8323c1 c1Var) {
            this.f36207a = c1Var;
        }

        public void run() {
            super.run();
            C8667z0.this.f36187e.mo27935A(this.f36207a);
            C8667z0.this.f36187e.mo27936B(C8667z0.this.f36203u);
        }
    }

    /* renamed from: com.onesignal.z0$c */
    /* compiled from: OSInAppMessageController */
    class C8670c implements C8338d3.C8388t0 {

        /* renamed from: a */
        final /* synthetic */ boolean f36209a;

        /* renamed from: b */
        final /* synthetic */ C8323c1 f36210b;

        C8670c(boolean z, C8323c1 c1Var) {
            this.f36209a = z;
            this.f36210b = c1Var;
        }

        /* renamed from: c */
        public void mo27748c(JSONObject jSONObject) {
            boolean unused = C8667z0.this.f36202t = false;
            if (jSONObject != null) {
                String unused2 = C8667z0.this.f36200r = jSONObject.toString();
            }
            if (C8667z0.this.f36201s != null) {
                if (!this.f36209a) {
                    C8338d3.m46432I0().mo27963k(this.f36210b.f36098a);
                }
                C8662y0 n = C8667z0.this.f36201s;
                C8667z0 z0Var = C8667z0.this;
                n.mo28331h(z0Var.mo28340A0(z0Var.f36201s.mo28324a()));
                C8551p4.m47381I(this.f36210b, C8667z0.this.f36201s);
                C8662y0 unused3 = C8667z0.this.f36201s = null;
            }
        }
    }

    /* renamed from: com.onesignal.z0$d */
    /* compiled from: OSInAppMessageController */
    class C8671d implements C8487m1.C8496i {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36212a;

        C8671d(C8323c1 c1Var) {
            this.f36212a = c1Var;
        }

        /* renamed from: b */
        public void mo27953b(String str) {
            try {
                C8662y0 p = C8667z0.this.m47942l0(new JSONObject(str), this.f36212a);
                if (p.mo28324a() == null) {
                    C8667z0.this.f36183a.mo28016d("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (C8667z0.this.f36202t) {
                    C8662y0 unused = C8667z0.this.f36201s = p;
                } else {
                    C8338d3.m46432I0().mo27963k(this.f36212a.f36098a);
                    C8667z0.this.mo28348j0(this.f36212a);
                    p.mo28331h(C8667z0.this.mo28340A0(p.mo28324a()));
                    C8551p4.m47381I(this.f36212a, p);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public void mo27954c(String str) {
            boolean unused = C8667z0.this.f36199q = false;
            try {
                if (new JSONObject(str).getBoolean("retry")) {
                    C8667z0.this.m47948o0(this.f36212a);
                } else {
                    C8667z0.this.mo28343c0(this.f36212a, true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onesignal.z0$e */
    /* compiled from: OSInAppMessageController */
    class C8672e implements C8487m1.C8496i {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36214a;

        C8672e(C8323c1 c1Var) {
            this.f36214a = c1Var;
        }

        /* renamed from: b */
        public void mo27953b(String str) {
            try {
                C8662y0 p = C8667z0.this.m47942l0(new JSONObject(str), this.f36214a);
                if (p.mo28324a() == null) {
                    C8667z0.this.f36183a.mo28016d("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (C8667z0.this.f36202t) {
                    C8662y0 unused = C8667z0.this.f36201s = p;
                } else {
                    C8667z0.this.mo28348j0(this.f36214a);
                    p.mo28331h(C8667z0.this.mo28340A0(p.mo28324a()));
                    C8551p4.m47381I(this.f36214a, p);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public void mo27954c(String str) {
            C8667z0.this.m47921H((C8323c1) null);
        }
    }

    /* renamed from: com.onesignal.z0$f */
    /* compiled from: OSInAppMessageController */
    class C8673f extends C8452h {
        C8673f() {
        }

        public void run() {
            super.run();
            C8667z0.this.f36187e.mo27941h();
        }
    }

    /* renamed from: com.onesignal.z0$g */
    /* compiled from: OSInAppMessageController */
    class C8674g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f36217a;

        C8674g(Map map) {
            this.f36217a = map;
        }

        public void run() {
            C8667z0.this.f36183a.mo28016d("Delaying addTriggers due to redisplay data not retrieved yet");
            C8667z0.this.m47920F(this.f36217a.keySet());
        }
    }

    /* renamed from: com.onesignal.z0$h */
    /* compiled from: OSInAppMessageController */
    class C8675h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f36219a;

        C8675h(Collection collection) {
            this.f36219a = collection;
        }

        public void run() {
            C8667z0.this.f36183a.mo28016d("Delaying removeTriggersForKeys due to redisplay data not retrieved yet");
            C8667z0.this.m47920F(this.f36219a);
        }
    }

    /* renamed from: com.onesignal.z0$i */
    /* compiled from: OSInAppMessageController */
    class C8676i extends ArrayList<String> {
        C8676i() {
            add(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            add("app");
            add("all");
        }
    }

    /* renamed from: com.onesignal.z0$j */
    /* compiled from: OSInAppMessageController */
    class C8677j extends C8452h {
        C8677j() {
        }

        public void run() {
            super.run();
            synchronized (C8667z0.f36181v) {
                C8667z0 z0Var = C8667z0.this;
                List unused = z0Var.f36196n = z0Var.f36187e.mo27942k();
                C8547p1 v = C8667z0.this.f36183a;
                v.mo28016d("Retrieved IAMs from DB redisplayedInAppMessages: " + C8667z0.this.f36196n.toString());
            }
        }
    }

    /* renamed from: com.onesignal.z0$k */
    /* compiled from: OSInAppMessageController */
    class C8678k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONArray f36222a;

        C8678k(JSONArray jSONArray) {
            this.f36222a = jSONArray;
        }

        public void run() {
            C8667z0.this.m47952r0();
            try {
                C8667z0.this.m47946n0(this.f36222a);
            } catch (JSONException e) {
                C8667z0.this.f36183a.mo28015c("ERROR processing InAppMessageJson JSON Response.", e);
            }
        }
    }

    /* renamed from: com.onesignal.z0$l */
    /* compiled from: OSInAppMessageController */
    class C8679l implements Runnable {
        C8679l() {
        }

        public void run() {
            C8667z0.this.f36183a.mo28016d("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            C8667z0.this.m47923K();
        }
    }

    /* renamed from: com.onesignal.z0$m */
    /* compiled from: OSInAppMessageController */
    class C8680m implements C8487m1.C8496i {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36225a;

        C8680m(C8323c1 c1Var) {
            this.f36225a = c1Var;
        }

        /* renamed from: b */
        public void mo27953b(String str) {
        }

        /* renamed from: c */
        public void mo27954c(String str) {
            C8667z0.this.f36192j.remove(this.f36225a.f36098a);
        }
    }

    /* renamed from: com.onesignal.z0$n */
    /* compiled from: OSInAppMessageController */
    class C8681n implements C8338d3.C8400z0 {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36227a;

        /* renamed from: b */
        final /* synthetic */ List f36228b;

        C8681n(C8323c1 c1Var, List list) {
            this.f36227a = c1Var;
            this.f36228b = list;
        }

        /* renamed from: a */
        public void mo27758a(C8338d3.C8359g1 g1Var) {
            C8460i1 unused = C8667z0.this.f36197o = null;
            C8547p1 v = C8667z0.this.f36183a;
            v.mo28016d("IAM prompt to handle finished with result: " + g1Var);
            C8323c1 c1Var = this.f36227a;
            if (!c1Var.f35376k || g1Var != C8338d3.C8359g1.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                C8667z0.this.m47964z0(c1Var, this.f36228b);
            } else {
                C8667z0.this.m47962y0(c1Var, this.f36228b);
            }
        }
    }

    /* renamed from: com.onesignal.z0$o */
    /* compiled from: OSInAppMessageController */
    class C8682o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f36230a;

        /* renamed from: b */
        final /* synthetic */ List f36231b;

        C8682o(C8323c1 c1Var, List list) {
            this.f36230a = c1Var;
            this.f36231b = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C8667z0.this.m47964z0(this.f36230a, this.f36231b);
        }
    }

    /* renamed from: com.onesignal.z0$p */
    /* compiled from: OSInAppMessageController */
    class C8683p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f36233a;

        /* renamed from: b */
        final /* synthetic */ C8646x0 f36234b;

        C8683p(String str, C8646x0 x0Var) {
            this.f36233a = str;
            this.f36234b = x0Var;
        }

        public void run() {
            C8338d3.m46432I0().mo27960h(this.f36233a);
            C8338d3.f35464t.mo27749k(this.f36234b);
        }
    }

    /* renamed from: com.onesignal.z0$q */
    /* compiled from: OSInAppMessageController */
    class C8684q implements C8487m1.C8496i {

        /* renamed from: a */
        final /* synthetic */ String f36236a;

        C8684q(String str) {
            this.f36236a = str;
        }

        /* renamed from: b */
        public void mo27953b(String str) {
        }

        /* renamed from: c */
        public void mo27954c(String str) {
            C8667z0.this.f36193k.remove(this.f36236a);
        }
    }

    protected C8667z0(C8475k3 k3Var, C8616t2 t2Var, C8547p1 p1Var, C8507n2 n2Var, C10568a aVar) {
        this.f36184b = t2Var;
        this.f36190h = new ArrayList<>();
        Set<String> L = OSUtils.m46179L();
        this.f36191i = L;
        this.f36195m = new ArrayList<>();
        Set<String> L2 = OSUtils.m46179L();
        this.f36192j = L2;
        Set<String> L3 = OSUtils.m46179L();
        this.f36193k = L3;
        Set<String> L4 = OSUtils.m46179L();
        this.f36194l = L4;
        this.f36189g = new C8298a3(this);
        this.f36186d = new C8601s2(this);
        this.f36185c = aVar;
        this.f36183a = p1Var;
        C8487m1 S = mo28342S(k3Var, p1Var, n2Var);
        this.f36187e = S;
        Set<String> m = S.mo27944m();
        if (m != null) {
            L.addAll(m);
        }
        Set<String> p = this.f36187e.mo27947p();
        if (p != null) {
            L2.addAll(p);
        }
        Set<String> s = this.f36187e.mo27950s();
        if (s != null) {
            L3.addAll(s);
        }
        Set<String> l = this.f36187e.mo27943l();
        if (l != null) {
            L4.addAll(l);
        }
        Date q = this.f36187e.mo27948q();
        if (q != null) {
            this.f36203u = q;
        }
        mo27618W();
    }

    /* renamed from: B0 */
    private String m47917B0(C8323c1 c1Var) {
        String b = this.f36185c.mo33766b();
        Iterator<String> it = f36182w.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (c1Var.f35367b.containsKey(next)) {
                HashMap hashMap = c1Var.f35367b.get(next);
                if (hashMap.containsKey(b)) {
                    return (String) hashMap.get(b);
                }
                return (String) hashMap.get("default");
            }
        }
        return null;
    }

    /* renamed from: D */
    private void m47918D() {
        synchronized (this.f36195m) {
            if (!this.f36186d.mo28201c()) {
                this.f36183a.mo28017e("In app message not showing due to system condition not correct");
                return;
            }
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("displayFirstIAMOnQueue: " + this.f36195m);
            if (this.f36195m.size() <= 0 || mo27620Y()) {
                C8547p1 p1Var2 = this.f36183a;
                p1Var2.mo28016d("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + mo27620Y());
                return;
            }
            this.f36183a.mo28016d("No IAM showing currently, showing first item in the queue!");
            m47922I(this.f36195m.get(0));
        }
    }

    /* renamed from: E */
    private void m47919E(C8323c1 c1Var, List<C8460i1> list) {
        if (list.size() > 0) {
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("IAM showing prompts from IAM: " + c1Var.toString());
            C8551p4.m47404x();
            m47964z0(c1Var, list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m47920F(Collection<String> collection) {
        m47933a0(collection);
        m47923K();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m47921H(com.onesignal.C8323c1 r6) {
        /*
            r5 = this;
            com.onesignal.m2 r0 = com.onesignal.C8338d3.m46432I0()
            r0.mo27961i()
            boolean r0 = r5.m47960x0()
            if (r0 == 0) goto L_0x0015
            com.onesignal.p1 r6 = r5.f36183a
            java.lang.String r0 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            r6.mo28016d(r0)
            return
        L_0x0015:
            r0 = 0
            r5.f36199q = r0
            java.util.ArrayList<com.onesignal.c1> r1 = r5.f36195m
            monitor-enter(r1)
            if (r6 == 0) goto L_0x005f
            boolean r2 = r6.f35376k     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.c1> r2 = r5.f36195m     // Catch:{ all -> 0x009f }
            int r2 = r2.size()     // Catch:{ all -> 0x009f }
            if (r2 <= 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.c1> r2 = r5.f36195m     // Catch:{ all -> 0x009f }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x003a
            com.onesignal.p1 r6 = r5.f36183a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "Message already removed from the queue!"
            r6.mo28016d(r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x003a:
            java.util.ArrayList<com.onesignal.c1> r6 = r5.f36195m     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.remove(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.c1 r6 = (com.onesignal.C8323c1) r6     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.f36098a     // Catch:{ all -> 0x009f }
            com.onesignal.p1 r2 = r5.f36183a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message with id: "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = ", dismissed (removed) from the queue!"
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x009f }
            r2.mo28016d(r6)     // Catch:{ all -> 0x009f }
        L_0x005f:
            java.util.ArrayList<com.onesignal.c1> r6 = r5.f36195m     // Catch:{ all -> 0x009f }
            int r6 = r6.size()     // Catch:{ all -> 0x009f }
            if (r6 <= 0) goto L_0x0093
            com.onesignal.p1 r6 = r5.f36183a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "In app message on queue available: "
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.c1> r3 = r5.f36195m     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.c1 r3 = (com.onesignal.C8323c1) r3     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.f36098a     // Catch:{ all -> 0x009f }
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009f }
            r6.mo28016d(r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.c1> r6 = r5.f36195m     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.c1 r6 = (com.onesignal.C8323c1) r6     // Catch:{ all -> 0x009f }
            r5.m47922I(r6)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0093:
            com.onesignal.p1 r6 = r5.f36183a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "In app message dismissed evaluating messages"
            r6.mo28016d(r0)     // Catch:{ all -> 0x009f }
            r5.m47923K()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8667z0.m47921H(com.onesignal.c1):void");
    }

    /* renamed from: I */
    private void m47922I(C8323c1 c1Var) {
        if (!this.f36198p) {
            this.f36183a.mo28014b("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.f36199q = true;
        m47930T(c1Var, false);
        this.f36187e.mo27945n(C8338d3.f35442h, c1Var.f36098a, m47917B0(c1Var), new C8671d(c1Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m47923K() {
        this.f36183a.mo28016d("Starting evaluateInAppMessages");
        if (mo28352w0()) {
            this.f36184b.mo28224c(new C8679l());
            return;
        }
        Iterator<C8323c1> it = this.f36190h.iterator();
        while (it.hasNext()) {
            C8323c1 next = it.next();
            if (this.f36189g.mo27596c(next)) {
                m47955t0(next);
                if (!this.f36191i.contains(next.f36098a) && !next.mo27649i()) {
                    m47948o0(next);
                }
            }
        }
    }

    /* renamed from: M */
    private void m47924M(C8646x0 x0Var) {
        if (x0Var.mo28294d() != null && !x0Var.mo28294d().isEmpty()) {
            if (x0Var.mo28298h() == C8646x0.C8647a.BROWSER) {
                OSUtils.m46182O(x0Var.mo28294d());
            } else if (x0Var.mo28298h() == C8646x0.C8647a.IN_APP_WEBVIEW) {
                C8462i3.m46903b(x0Var.mo28294d(), true);
            }
        }
    }

    /* renamed from: N */
    private void m47925N(String str, List<C8418f1> list) {
        C8338d3.m46432I0().mo27960h(str);
        C8338d3.m46511e2(list);
    }

    /* renamed from: O */
    private void m47926O(String str, C8646x0 x0Var) {
        if (C8338d3.f35464t != null) {
            OSUtils.m46187T(new C8683p(str, x0Var));
        }
    }

    /* renamed from: P */
    private void m47927P(C8323c1 c1Var, C8646x0 x0Var) {
        String B0 = m47917B0(c1Var);
        if (B0 != null) {
            String b = x0Var.mo28292b();
            if ((c1Var.mo27645f().mo27926e() && c1Var.mo27646g(b)) || !this.f36194l.contains(b)) {
                this.f36194l.add(b);
                c1Var.mo27640b(b);
                this.f36187e.mo27938D(C8338d3.f35442h, C8338d3.m46463Q0(), B0, new OSUtils().mo27559e(), c1Var.f36098a, b, x0Var.mo28299i(), this.f36194l, new C8668a(b, c1Var));
            }
        }
    }

    /* renamed from: Q */
    private void m47928Q(C8323c1 c1Var, C8448g1 g1Var) {
        String B0 = m47917B0(c1Var);
        if (B0 != null) {
            String a = g1Var.mo27807a();
            String str = c1Var.f36098a + a;
            if (this.f36193k.contains(str)) {
                this.f36183a.mo28014b("Already sent page impression for id: " + a);
                return;
            }
            this.f36193k.add(str);
            this.f36187e.mo27940F(C8338d3.f35442h, C8338d3.m46463Q0(), B0, new OSUtils().mo27559e(), c1Var.f36098a, a, this.f36193k, new C8684q(str));
        }
    }

    /* renamed from: R */
    private void m47929R(C8646x0 x0Var) {
        if (x0Var.mo28297g() != null) {
            C8506n1 g = x0Var.mo28297g();
            if (g.mo27973a() != null) {
                C8338d3.m46527i2(g.mo27973a());
            }
            if (g.mo27974b() != null) {
                C8338d3.m46443L(g.mo27974b(), (C8338d3.C8367j0) null);
            }
        }
    }

    /* renamed from: T */
    private void m47930T(C8323c1 c1Var, boolean z) {
        this.f36202t = false;
        if (z || c1Var.mo27643e()) {
            this.f36202t = true;
            C8338d3.m46444L0(new C8670c(z, c1Var));
        }
    }

    /* renamed from: V */
    private boolean m47931V(C8323c1 c1Var) {
        if (this.f36189g.mo27599g(c1Var)) {
            return !c1Var.mo27647h();
        }
        boolean z = !c1Var.mo27647h() && c1Var.f35368c.isEmpty();
        if (c1Var.mo27650j() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private void m47932Z(C8646x0 x0Var) {
        if (x0Var.mo28297g() != null) {
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + x0Var.mo28297g().toString());
        }
        if (x0Var.mo28295e().size() > 0) {
            C8547p1 p1Var2 = this.f36183a;
            p1Var2.mo28016d("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + x0Var.mo28295e().toString());
        }
    }

    /* renamed from: a0 */
    private void m47933a0(Collection<String> collection) {
        Iterator<C8323c1> it = this.f36190h.iterator();
        while (it.hasNext()) {
            C8323c1 next = it.next();
            if (!next.mo27650j() && this.f36196n.contains(next) && this.f36189g.mo27598f(next, collection)) {
                C8547p1 p1Var = this.f36183a;
                p1Var.mo28016d("Trigger changed for message: " + next.toString());
                next.mo27655q(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public C8662y0 m47942l0(JSONObject jSONObject, C8323c1 c1Var) {
        C8662y0 y0Var = new C8662y0(jSONObject);
        c1Var.mo27653o(y0Var.mo28325b().doubleValue());
        return y0Var;
    }

    /* renamed from: m0 */
    private void m47944m0(C8323c1 c1Var) {
        c1Var.mo27645f().mo27929h(C8338d3.m46448M0().mo28281b() / 1000);
        c1Var.mo27645f().mo27924c();
        c1Var.mo27655q(false);
        c1Var.mo27654p(true);
        mo27972d(new C8669b(c1Var), "OS_IAM_DB_ACCESS");
        int indexOf = this.f36196n.indexOf(c1Var);
        if (indexOf != -1) {
            this.f36196n.set(indexOf, c1Var);
        } else {
            this.f36196n.add(c1Var);
        }
        C8547p1 p1Var = this.f36183a;
        p1Var.mo28016d("persistInAppMessageForRedisplay: " + c1Var.toString() + " with msg array data: " + this.f36196n.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m47946n0(JSONArray jSONArray) throws JSONException {
        synchronized (f36181v) {
            ArrayList<C8323c1> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                C8323c1 c1Var = new C8323c1(jSONArray.getJSONObject(i));
                if (c1Var.f36098a != null) {
                    arrayList.add(c1Var);
                }
            }
            this.f36190h = arrayList;
        }
        m47923K();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m47948o0(C8323c1 c1Var) {
        synchronized (this.f36195m) {
            if (!this.f36195m.contains(c1Var)) {
                this.f36195m.add(c1Var);
                C8547p1 p1Var = this.f36183a;
                p1Var.mo28016d("In app message with id: " + c1Var.f36098a + ", added to the queue");
            }
            m47918D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m47952r0() {
        for (C8323c1 p : this.f36196n) {
            p.mo27654p(false);
        }
    }

    /* renamed from: t0 */
    private void m47955t0(C8323c1 c1Var) {
        boolean contains = this.f36191i.contains(c1Var.f36098a);
        int indexOf = this.f36196n.indexOf(c1Var);
        if (contains && indexOf != -1) {
            C8323c1 c1Var2 = this.f36196n.get(indexOf);
            c1Var.mo27645f().mo27928g(c1Var2.mo27645f());
            c1Var.mo27654p(c1Var2.mo27647h());
            boolean V = m47931V(c1Var);
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("setDataForRedisplay: " + c1Var.toString() + " triggerHasChanged: " + V);
            if (V && c1Var.mo27645f().mo27925d() && c1Var.mo27645f().mo27930i()) {
                C8547p1 p1Var2 = this.f36183a;
                p1Var2.mo28016d("setDataForRedisplay message available for redisplay: " + c1Var.f36098a);
                this.f36191i.remove(c1Var.f36098a);
                this.f36192j.remove(c1Var.f36098a);
                this.f36193k.clear();
                this.f36187e.mo27937C(this.f36193k);
                c1Var.mo27641c();
            }
        }
    }

    /* renamed from: x0 */
    private boolean m47960x0() {
        return this.f36197o != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m47962y0(C8323c1 c1Var, List<C8460i1> list) {
        String string = C8338d3.f35438f.getString(C8300a4.location_permission_missing_title);
        new AlertDialog.Builder(C8338d3.m46486Y()).setTitle(string).setMessage(C8338d3.f35438f.getString(C8300a4.location_permission_missing_message)).setPositiveButton(17039370, new C8682o(c1Var, list)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m47964z0(C8323c1 c1Var, List<C8460i1> list) {
        Iterator<C8460i1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C8460i1 next = it.next();
            if (!next.mo27839c()) {
                this.f36197o = next;
                break;
            }
        }
        if (this.f36197o != null) {
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("IAM prompt to handle: " + this.f36197o.toString());
            this.f36197o.mo27840d(true);
            this.f36197o.mo27763b(new C8681n(c1Var, list));
            return;
        }
        C8547p1 p1Var2 = this.f36183a;
        p1Var2.mo28016d("No IAM prompt to handle, dismiss message: " + c1Var.f36098a);
        mo27622b0(c1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public String mo28340A0(String str) {
        String str2 = this.f36200r;
        return str + String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", new Object[]{str2});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo27614C(Map<String, Object> map) {
        C8547p1 p1Var = this.f36183a;
        p1Var.mo28016d("Triggers added: " + map.toString());
        this.f36189g.mo27595a(map);
        if (mo28352w0()) {
            this.f36184b.mo28224c(new C8674g(map));
        } else {
            m47920F(map.keySet());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo27615G() {
        mo27972d(new C8673f(), "OS_IAM_DB_ACCESS");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo27616J(String str) {
        this.f36199q = true;
        C8323c1 c1Var = new C8323c1(true);
        m47930T(c1Var, true);
        this.f36187e.mo27946o(C8338d3.f35442h, str, new C8672e(c1Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo28341L(Runnable runnable) {
        synchronized (f36181v) {
            if (mo28352w0()) {
                this.f36183a.mo28016d("Delaying task due to redisplay data not retrieved yet");
                this.f36184b.mo28224c(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C8487m1 mo28342S(C8475k3 k3Var, C8547p1 p1Var, C8507n2 n2Var) {
        if (this.f36187e == null) {
            this.f36187e = new C8487m1(k3Var, p1Var, n2Var);
        }
        return this.f36187e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public Object mo27617U(String str) {
        return this.f36189g.mo27597e(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo27618W() {
        this.f36184b.mo28224c(new C8677j());
        this.f36184b.mo28226f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo27619X() {
        if (!this.f36190h.isEmpty()) {
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("initWithCachedInAppMessages with already in memory messages: " + this.f36190h);
            return;
        }
        String r = this.f36187e.mo27949r();
        C8547p1 p1Var2 = this.f36183a;
        p1Var2.mo28016d("initWithCachedInAppMessages: " + r);
        if (r != null && !r.isEmpty()) {
            synchronized (f36181v) {
                try {
                    if (this.f36190h.isEmpty()) {
                        m47946n0(new JSONArray(r));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo27620Y() {
        return this.f36199q;
    }

    /* renamed from: a */
    public void mo27621a() {
        this.f36183a.mo28016d("messageTriggerConditionChanged called");
        m47923K();
    }

    /* renamed from: b */
    public void mo28088b(String str) {
        C8547p1 p1Var = this.f36183a;
        p1Var.mo28016d("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        m47933a0(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo27622b0(C8323c1 c1Var) {
        mo28343c0(c1Var, false);
    }

    /* renamed from: c */
    public void mo28202c() {
        m47918D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo28343c0(C8323c1 c1Var, boolean z) {
        if (!c1Var.f35376k) {
            this.f36191i.add(c1Var.f36098a);
            if (!z) {
                this.f36187e.mo27951x(this.f36191i);
                this.f36203u = new Date();
                m47944m0(c1Var);
            }
            C8547p1 p1Var = this.f36183a;
            p1Var.mo28016d("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.f36191i.toString());
        }
        if (!m47960x0()) {
            mo28344f0(c1Var);
        }
        m47921H(c1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo27623d0(C8323c1 c1Var, JSONObject jSONObject) throws JSONException {
        C8646x0 x0Var = new C8646x0(jSONObject);
        x0Var.mo28300l(c1Var.mo27656r());
        m47926O(c1Var.f36098a, x0Var);
        m47919E(c1Var, x0Var.mo28296f());
        m47924M(x0Var);
        m47927P(c1Var, x0Var);
        m47929R(x0Var);
        m47925N(c1Var.f36098a, x0Var.mo28295e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo27624e0(C8323c1 c1Var, JSONObject jSONObject) throws JSONException {
        C8646x0 x0Var = new C8646x0(jSONObject);
        x0Var.mo28300l(c1Var.mo27656r());
        m47926O(c1Var.f36098a, x0Var);
        m47919E(c1Var, x0Var.mo28296f());
        m47924M(x0Var);
        m47932Z(x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo28344f0(C8323c1 c1Var) {
        C8329d1 d1Var = this.f36188f;
        if (d1Var == null) {
            this.f36183a.mo28014b("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        } else {
            d1Var.mo27679a(c1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo28345g0(C8323c1 c1Var) {
        C8329d1 d1Var = this.f36188f;
        if (d1Var == null) {
            this.f36183a.mo28014b("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
        } else {
            d1Var.mo27680b(c1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo28346h0(C8323c1 c1Var) {
        mo28345g0(c1Var);
        if (!c1Var.f35376k && !this.f36192j.contains(c1Var.f36098a)) {
            this.f36192j.add(c1Var.f36098a);
            String B0 = m47917B0(c1Var);
            if (B0 != null) {
                this.f36187e.mo27939E(C8338d3.f35442h, C8338d3.m46463Q0(), B0, new OSUtils().mo27559e(), c1Var.f36098a, this.f36192j, new C8680m(c1Var));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo28347i0(C8323c1 c1Var) {
        C8329d1 d1Var = this.f36188f;
        if (d1Var == null) {
            this.f36183a.mo28014b("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        } else {
            d1Var.mo27681c(c1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo28348j0(C8323c1 c1Var) {
        C8329d1 d1Var = this.f36188f;
        if (d1Var == null) {
            this.f36183a.mo28014b("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
        } else {
            d1Var.mo27682d(c1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo28349k0(C8323c1 c1Var, JSONObject jSONObject) {
        C8448g1 g1Var = new C8448g1(jSONObject);
        if (!c1Var.f35376k) {
            m47928Q(c1Var, g1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo27625p0(JSONArray jSONArray) throws JSONException {
        this.f36187e.mo27952y(jSONArray.toString());
        mo28341L(new C8678k(jSONArray));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo27626q0(Collection<String> collection) {
        C8547p1 p1Var = this.f36183a;
        p1Var.mo28016d("Triggers key to remove: " + collection.toString());
        this.f36189g.mo27600h(collection);
        if (mo28352w0()) {
            this.f36184b.mo28224c(new C8675h(collection));
        } else {
            m47920F(collection);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo28350s0() {
        C8571q0.m47441e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo28351u0(C8329d1 d1Var) {
        this.f36188f = d1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo27627v0(boolean z) {
        this.f36198p = z;
        if (z) {
            m47923K();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public boolean mo28352w0() {
        boolean z;
        synchronized (f36181v) {
            z = this.f36196n == null && this.f36184b.mo28225e();
        }
        return z;
    }
}
