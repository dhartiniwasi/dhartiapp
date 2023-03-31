package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.onesignal.C8303b0;
import com.onesignal.C8497m2;
import com.onesignal.C8508n3;
import com.onesignal.C8524o3;
import com.onesignal.C8532o4;
import com.onesignal.C8585r1;
import com.onesignal.C8592r3;
import com.onesignal.C8605s3;
import com.onesignal.C8610t1;
import com.onesignal.C8634v3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p240ga.C10306f;
import p249ha.C10487a;
import p259ia.C10568a;
import p259ia.C10570c;
import p269ja.C11508d;

/* renamed from: com.onesignal.d3 */
/* compiled from: OneSignal */
public class C8338d3 {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static C8547p1 f35402A = new C8522o1();

    /* renamed from: B */
    private static C8540p f35403B;

    /* renamed from: C */
    private static C8497m2.C8499b f35404C = new C8366j();

    /* renamed from: D */
    private static C8294a1 f35405D = new C8294a1();

    /* renamed from: E */
    private static C8642w2 f35406E = new C8649x2();
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static C8461i2 f35407F = new C8461i2();

    /* renamed from: G */
    private static C8616t2 f35408G = new C8616t2(f35402A);

    /* renamed from: H */
    private static C8624u2 f35409H = new C8624u2(f35407F, f35402A);

    /* renamed from: I */
    private static C8408e3 f35410I = new C8549p3();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static C8507n2 f35411J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static C10306f f35412K;

    /* renamed from: L */
    private static C8497m2 f35413L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static C8330d2 f35414M;

    /* renamed from: N */
    private static C11508d f35415N;

    /* renamed from: O */
    private static C8610t1 f35416O;

    /* renamed from: P */
    private static final Object f35417P = new C8389u();

    /* renamed from: Q */
    public static String f35418Q = "native";
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static String f35419R;

    /* renamed from: S */
    private static OSUtils f35420S = new OSUtils();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public static boolean f35421T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static boolean f35422U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public static boolean f35423V;

    /* renamed from: W */
    private static boolean f35424W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static boolean f35425X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static C8303b0.C8307d f35426Y;

    /* renamed from: Z */
    private static Collection<JSONArray> f35427Z = new ArrayList();

    /* renamed from: a */
    private static C8347c1 f35428a;

    /* renamed from: a0 */
    private static HashSet<String> f35429a0 = new HashSet<>();

    /* renamed from: b */
    private static C8347c1 f35430b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final ArrayList<C8388t0> f35431b0 = new ArrayList<>();

    /* renamed from: c */
    private static C8374m0 f35432c;

    /* renamed from: c0 */
    private static C8504n f35433c0;

    /* renamed from: d */
    private static C8374m0 f35434d;

    /* renamed from: d0 */
    private static C8419f2 f35435d0;

    /* renamed from: e */
    private static List<C8376n0> f35436e = new ArrayList();

    /* renamed from: e0 */
    static C8419f2 f35437e0;

    /* renamed from: f */
    static Context f35438f;

    /* renamed from: f0 */
    private static C8311b2<C8407e2, C8449g2> f35439f0;

    /* renamed from: g */
    static WeakReference<Activity> f35440g;

    /* renamed from: g0 */
    private static OSSubscriptionState f35441g0;

    /* renamed from: h */
    static String f35442h;

    /* renamed from: h0 */
    static OSSubscriptionState f35443h0;

    /* renamed from: i */
    static String f35444i;

    /* renamed from: i0 */
    private static C8311b2<C8548p2, C8579q2> f35445i0;

    /* renamed from: j */
    private static C8384r0 f35446j = C8384r0.NONE;

    /* renamed from: j0 */
    private static C8609t0 f35447j0;

    /* renamed from: k */
    private static C8384r0 f35448k = C8384r0.WARN;

    /* renamed from: k0 */
    static C8609t0 f35449k0;

    /* renamed from: l */
    private static String f35450l = null;

    /* renamed from: l0 */
    private static C8311b2<C8599s0, C8622u0> f35451l0;

    /* renamed from: m */
    private static String f35452m = null;

    /* renamed from: m0 */
    private static C8474k2 f35453m0;

    /* renamed from: n */
    private static String f35454n = null;

    /* renamed from: n0 */
    static C8474k2 f35455n0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static int f35456o = Integer.MAX_VALUE;

    /* renamed from: o0 */
    private static C8311b2<C8468j2, C8482l2> f35457o0;

    /* renamed from: p */
    static C10568a f35458p = null;

    /* renamed from: p0 */
    private static C8382q0 f35459p0;

    /* renamed from: q */
    static C8341a1 f35460q;

    /* renamed from: q0 */
    private static C8605s3 f35461q0;

    /* renamed from: r */
    static C8398y0 f35462r;

    /* renamed from: s */
    static C8396x0 f35463s;

    /* renamed from: t */
    static C8390u0 f35464t;

    /* renamed from: u */
    private static boolean f35465u;

    /* renamed from: v */
    private static boolean f35466v;

    /* renamed from: w */
    private static C8364i0 f35467w = C8364i0.APP_CLOSE;

    /* renamed from: x */
    private static C8422f4 f35468x;

    /* renamed from: y */
    private static C8401d4 f35469y;

    /* renamed from: z */
    private static C8409e4 f35470z;

    /* renamed from: com.onesignal.d3$a */
    /* compiled from: OneSignal */
    class C8339a implements Runnable {
        C8339a() {
        }

        public void run() {
            try {
                C8338d3.m46449M1();
            } catch (JSONException e) {
                C8338d3.m46496b(C8384r0.FATAL, "FATAL Error registering device!", e);
            }
        }
    }

    /* renamed from: com.onesignal.d3$a0 */
    /* compiled from: OneSignal */
    class C8340a0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35471a;

        /* renamed from: b */
        final /* synthetic */ C8353e1 f35472b;

        C8340a0(String str, C8353e1 e1Var) {
            this.f35471a = str;
            this.f35472b = e1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running sendUniqueOutcome() operation from pending queue.");
            C8338d3.m46535k2(this.f35471a, this.f35472b);
        }
    }

    /* renamed from: com.onesignal.d3$a1 */
    /* compiled from: OneSignal */
    public interface C8341a1 {
        /* renamed from: a */
        void mo27698a(Context context, C8295a2 a2Var);
    }

    /* renamed from: com.onesignal.d3$b */
    /* compiled from: OneSignal */
    class C8342b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35473a;

        /* renamed from: b */
        final /* synthetic */ String f35474b;

        /* renamed from: c */
        final /* synthetic */ C8347c1 f35475c;

        C8342b(String str, String str2, C8347c1 c1Var) {
            this.f35473a = str;
            this.f35474b = str2;
            this.f35475c = c1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setSMSNumber() operation from a pending task queue.");
            C8338d3.m46406B2(this.f35473a, this.f35474b, this.f35475c);
        }
    }

    /* renamed from: com.onesignal.d3$b0 */
    /* compiled from: OneSignal */
    class C8343b0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35476a;

        /* renamed from: b */
        final /* synthetic */ float f35477b;

        /* renamed from: c */
        final /* synthetic */ C8353e1 f35478c;

        C8343b0(String str, float f, C8353e1 e1Var) {
            this.f35476a = str;
            this.f35477b = f;
            this.f35478c = e1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running sendOutcomeWithValue() operation from pending queue.");
            C8338d3.m46519g2(this.f35476a, this.f35477b, this.f35478c);
        }
    }

    /* renamed from: com.onesignal.d3$b1 */
    /* compiled from: OneSignal */
    public static class C8344b1 {

        /* renamed from: a */
        private C8365i1 f35479a;

        /* renamed from: b */
        private String f35480b;

        C8344b1(C8365i1 i1Var, String str) {
            this.f35479a = i1Var;
            this.f35480b = str;
        }

        /* renamed from: a */
        public String mo27701a() {
            return this.f35480b;
        }

        /* renamed from: b */
        public C8365i1 mo27702b() {
            return this.f35479a;
        }
    }

    /* renamed from: com.onesignal.d3$c */
    /* compiled from: OneSignal */
    class C8345c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8347c1 f35481a;

        C8345c(C8347c1 c1Var) {
            this.f35481a = c1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running  logoutSMSNumber() operation from pending task queue.");
            C8338d3.m46558q1(this.f35481a);
        }
    }

    /* renamed from: com.onesignal.d3$c0 */
    /* compiled from: OneSignal */
    class C8346c0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8329d1 f35482a;

        C8346c0(C8329d1 d1Var) {
            this.f35482a = d1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setInAppMessageLifecycleHandler() operation from pending queue.");
            C8338d3.m46559q2(this.f35482a);
        }
    }

    /* renamed from: com.onesignal.d3$c1 */
    /* compiled from: OneSignal */
    public interface C8347c1 {
        /* renamed from: a */
        void mo27705a(JSONObject jSONObject);

        /* renamed from: d */
        void mo27706d(C8344b1 b1Var);
    }

    /* renamed from: com.onesignal.d3$d */
    /* compiled from: OneSignal */
    class C8348d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35483a;

        /* renamed from: b */
        final /* synthetic */ String f35484b;

        /* renamed from: c */
        final /* synthetic */ C8374m0 f35485c;

        C8348d(String str, String str2, C8374m0 m0Var) {
            this.f35483a = str;
            this.f35484b = str2;
            this.f35485c = m0Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setEmail() operation from a pending task queue.");
            C8338d3.m46543m2(this.f35483a, this.f35484b, this.f35485c);
        }
    }

    /* renamed from: com.onesignal.d3$d0 */
    /* compiled from: OneSignal */
    class C8349d0 implements C8303b0.C8305b {
        C8349d0() {
        }

        /* renamed from: a */
        public void mo27610a(C8303b0.C8307d dVar) {
            C8303b0.C8307d unused = C8338d3.f35426Y = dVar;
            boolean unused2 = C8338d3.f35422U = true;
            C8338d3.m46445L1();
        }

        public C8303b0.C8309f getType() {
            return C8303b0.C8309f.STARTUP;
        }
    }

    /* renamed from: com.onesignal.d3$d1 */
    /* compiled from: OneSignal */
    public interface C8350d1 {
        /* renamed from: b */
        void mo27708b(String str);

        /* renamed from: h */
        void mo27709h(C8394w0 w0Var);
    }

    /* renamed from: com.onesignal.d3$e */
    /* compiled from: OneSignal */
    class C8351e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8374m0 f35486a;

        C8351e(C8374m0 m0Var) {
            this.f35486a = m0Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running  logoutEmail() operation from pending task queue.");
            C8338d3.m46554p1(this.f35486a);
        }
    }

    /* renamed from: com.onesignal.d3$e0 */
    /* compiled from: OneSignal */
    class C8352e0 implements C8605s3.C8606a {
        C8352e0() {
        }

        /* renamed from: a */
        public void mo27711a(String str, int i) {
            C8547p1 d = C8338d3.f35402A;
            d.mo28016d("registerForPushToken completed with id: " + str + " status: " + i);
            if (i < 1) {
                if (C8592r3.m47619f() == null && (C8338d3.f35456o == 1 || C8338d3.m46429H1(C8338d3.f35456o))) {
                    int unused = C8338d3.f35456o = i;
                }
            } else if (C8338d3.m46429H1(C8338d3.f35456o)) {
                int unused2 = C8338d3.f35456o = i;
            }
            String unused3 = C8338d3.f35419R = str;
            boolean unused4 = C8338d3.f35421T = true;
            C8338d3.m46501c0(C8338d3.f35438f).mo27552j(str);
            C8338d3.m46445L1();
        }
    }

    /* renamed from: com.onesignal.d3$e1 */
    /* compiled from: OneSignal */
    public interface C8353e1 {
        /* renamed from: e */
        void mo27712e(C8324c2 c2Var);
    }

    /* renamed from: com.onesignal.d3$f */
    /* compiled from: OneSignal */
    class C8354f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35487a;

        /* renamed from: b */
        final /* synthetic */ C8350d1 f35488b;

        C8354f(String str, C8350d1 d1Var) {
            this.f35487a = str;
            this.f35488b = d1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setLanguage() operation from pending task queue.");
            C8338d3.m46567s2(this.f35487a, this.f35488b);
        }
    }

    /* renamed from: com.onesignal.d3$f0 */
    /* compiled from: OneSignal */
    class C8355f0 implements C8508n3.C8512c {

        /* renamed from: a */
        final /* synthetic */ boolean f35489a;

        C8355f0(boolean z) {
            this.f35489a = z;
        }

        /* renamed from: a */
        public void mo27714a(C8508n3.C8515f fVar) {
            boolean unused = C8338d3.f35425X = false;
            String str = fVar.f35759a;
            if (str != null) {
                C8338d3.f35444i = str;
            }
            C8338d3.f35407F.mo27858r(fVar, C8338d3.f35412K, C8338d3.f35411J, C8338d3.f35402A);
            C8338d3.m46590y1();
            C8447g0.m46814f(C8338d3.f35438f, fVar.f35764f);
            if (this.f35489a) {
                C8338d3.m46441K1();
            }
        }
    }

    /* renamed from: com.onesignal.d3$f1 */
    /* compiled from: OneSignal */
    public interface C8356f1 {
        /* renamed from: a */
        void mo27715a(JSONObject jSONObject);

        /* renamed from: f */
        void mo27716f(JSONObject jSONObject);
    }

    /* renamed from: com.onesignal.d3$g */
    /* compiled from: OneSignal */
    class C8357g implements C8592r3.C8595b {

        /* renamed from: a */
        final /* synthetic */ C8350d1 f35490a;

        C8357g(C8350d1 d1Var) {
            this.f35490a = d1Var;
        }

        /* renamed from: a */
        public void mo27717a(C8592r3.C8596c cVar) {
            this.f35490a.mo27709h(new C8394w0(cVar.f36008a, cVar.f36009b));
        }

        /* renamed from: b */
        public void mo27718b(String str) {
            this.f35490a.mo27708b(str);
        }
    }

    /* renamed from: com.onesignal.d3$g0 */
    /* compiled from: OneSignal */
    class C8358g0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8384r0 f35491a;

        /* renamed from: b */
        final /* synthetic */ String f35492b;

        C8358g0(C8384r0 r0Var, String str) {
            this.f35491a = r0Var;
            this.f35492b = str;
        }

        public void run() {
            if (C8338d3.m46486Y() != null) {
                new AlertDialog.Builder(C8338d3.m46486Y()).setTitle(this.f35491a.toString()).setMessage(this.f35492b).show();
            }
        }
    }

    /* renamed from: com.onesignal.d3$g1 */
    /* compiled from: OneSignal */
    enum C8359g1 {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    /* renamed from: com.onesignal.d3$h */
    /* compiled from: OneSignal */
    class C8360h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35498a;

        /* renamed from: b */
        final /* synthetic */ String f35499b;

        /* renamed from: c */
        final /* synthetic */ C8386s0 f35500c;

        C8360h(String str, String str2, C8386s0 s0Var) {
            this.f35498a = str;
            this.f35499b = str2;
            this.f35500c = s0Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setExternalUserId() operation from pending task queue.");
            C8338d3.m46551o2(this.f35498a, this.f35499b, this.f35500c);
        }
    }

    /* renamed from: com.onesignal.d3$h0 */
    /* compiled from: OneSignal */
    class C8361h0 implements Runnable {
        C8361h0() {
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running onAppLostFocus() operation from a pending task queue.");
            C8338d3.m46427H();
        }
    }

    /* renamed from: com.onesignal.d3$h1 */
    /* compiled from: OneSignal */
    public interface C8362h1 {
        /* renamed from: n */
        void mo27722n(boolean z);
    }

    /* renamed from: com.onesignal.d3$i */
    /* compiled from: OneSignal */
    class C8363i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f35501a;

        /* renamed from: b */
        final /* synthetic */ C8367j0 f35502b;

        C8363i(JSONObject jSONObject, C8367j0 j0Var) {
            this.f35501a = jSONObject;
            this.f35502b = j0Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running sendTags() operation from pending task queue.");
            C8338d3.m46531j2(this.f35501a, this.f35502b);
        }
    }

    /* renamed from: com.onesignal.d3$i0 */
    /* compiled from: OneSignal */
    public enum C8364i0 {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        /* renamed from: a */
        public boolean mo27724a() {
            return equals(APP_CLOSE);
        }

        /* renamed from: b */
        public boolean mo27725b() {
            return equals(APP_OPEN);
        }

        /* renamed from: c */
        public boolean mo27726c() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    /* renamed from: com.onesignal.d3$i1 */
    /* compiled from: OneSignal */
    public enum C8365i1 {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* renamed from: com.onesignal.d3$j */
    /* compiled from: OneSignal */
    class C8366j implements C8497m2.C8499b {
        C8366j() {
        }

        /* renamed from: a */
        public void mo27727a(List<C10487a> list) {
            if (C8338d3.f35414M == null) {
                C8338d3.m46492a(C8384r0.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (C8338d3.f35414M != null) {
                C8338d3.f35414M.mo27684e();
            }
            C8338d3.m46537l0().mo28053g(list);
        }
    }

    /* renamed from: com.onesignal.d3$j0 */
    /* compiled from: OneSignal */
    public interface C8367j0 {
        /* renamed from: a */
        void mo27728a(JSONObject jSONObject);

        /* renamed from: i */
        void mo27729i(C8368j1 j1Var);
    }

    /* renamed from: com.onesignal.d3$j1 */
    /* compiled from: OneSignal */
    public static class C8368j1 {

        /* renamed from: a */
        private String f35512a;

        /* renamed from: b */
        private int f35513b;

        C8368j1(int i, String str) {
            this.f35512a = str;
            this.f35513b = i;
        }

        /* renamed from: a */
        public int mo27730a() {
            return this.f35513b;
        }

        /* renamed from: b */
        public String mo27731b() {
            return this.f35512a;
        }
    }

    /* renamed from: com.onesignal.d3$k */
    /* compiled from: OneSignal */
    class C8369k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f35514a;

        /* renamed from: b */
        final /* synthetic */ C8367j0 f35515b;

        C8369k(JSONObject jSONObject, C8367j0 j0Var) {
            this.f35514a = jSONObject;
            this.f35515b = j0Var;
        }

        public void run() {
            if (this.f35514a == null) {
                C8338d3.f35402A.mo28013a("Attempted to send null tags");
                C8367j0 j0Var = this.f35515b;
                if (j0Var != null) {
                    j0Var.mo27729i(new C8368j1(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = C8592r3.m47622i(false).f35841b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.f35514a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object opt = this.f35514a.opt(next);
                    if (!(opt instanceof JSONArray)) {
                        if (!(opt instanceof JSONObject)) {
                            if (!this.f35514a.isNull(next)) {
                                if (!"".equals(opt)) {
                                    jSONObject2.put(next, opt.toString());
                                }
                            }
                            if (jSONObject != null && jSONObject.has(next)) {
                                jSONObject2.put(next, "");
                            }
                        }
                    }
                    C8384r0 r0Var = C8384r0.ERROR;
                    C8338d3.m46492a(r0Var, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                } catch (Throwable unused) {
                }
            }
            if (!jSONObject2.toString().equals("{}")) {
                C8547p1 d = C8338d3.f35402A;
                d.mo28016d("Available tags to send: " + jSONObject2.toString());
                C8592r3.m47633t(jSONObject2, this.f35515b);
                return;
            }
            C8338d3.f35402A.mo28016d("Send tags ended successfully");
            C8367j0 j0Var2 = this.f35515b;
            if (j0Var2 != null) {
                j0Var2.mo27728a(jSONObject);
            }
        }
    }

    /* renamed from: com.onesignal.d3$k0 */
    /* compiled from: OneSignal */
    public enum C8370k0 {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* renamed from: com.onesignal.d3$l */
    /* compiled from: OneSignal */
    class C8371l extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ C8356f1 f35521a;

        C8371l(C8356f1 f1Var) {
            this.f35521a = f1Var;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:(1:3)|4|5|6|7|13) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27538a(int r2, java.lang.String r3, java.lang.Throwable r4) {
            /*
                r1 = this;
                java.lang.String r0 = "create notification failed"
                com.onesignal.C8338d3.m46550o1(r0, r2, r4, r3)
                com.onesignal.d3$f1 r4 = r1.f35521a
                if (r4 == 0) goto L_0x0027
                if (r2 != 0) goto L_0x000d
                java.lang.String r3 = "{\"error\": \"HTTP no response error\"}"
            L_0x000d:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0016 }
                r2.<init>(r3)     // Catch:{ all -> 0x0016 }
                r4.mo27716f(r2)     // Catch:{ all -> 0x0016 }
                goto L_0x0027
            L_0x0016:
                com.onesignal.d3$f1 r2 = r1.f35521a     // Catch:{ JSONException -> 0x0023 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0023 }
                java.lang.String r4 = "{\"error\": \"Unknown response!\"}"
                r3.<init>(r4)     // Catch:{ JSONException -> 0x0023 }
                r2.mo27716f(r3)     // Catch:{ JSONException -> 0x0023 }
                goto L_0x0027
            L_0x0023:
                r2 = move-exception
                r2.printStackTrace()
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8338d3.C8371l.mo27538a(int, java.lang.String, java.lang.Throwable):void");
        }

        /* renamed from: b */
        public void mo27539b(String str) {
            C8547p1 d = C8338d3.f35402A;
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP create notification success: ");
            sb.append(str != null ? str : "null");
            d.mo28016d(sb.toString());
            if (this.f35521a != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("errors")) {
                        this.f35521a.mo27716f(jSONObject);
                    } else {
                        this.f35521a.mo27715a(new JSONObject(str));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.onesignal.d3$l0 */
    /* compiled from: OneSignal */
    public static class C8372l0 {

        /* renamed from: a */
        private C8370k0 f35522a;

        /* renamed from: b */
        private String f35523b;

        C8372l0(C8370k0 k0Var, String str) {
            this.f35522a = k0Var;
            this.f35523b = str;
        }

        /* renamed from: a */
        public String mo27733a() {
            return this.f35523b;
        }
    }

    /* renamed from: com.onesignal.d3$m */
    /* compiled from: OneSignal */
    class C8373m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8388t0 f35524a;

        C8373m(C8388t0 t0Var) {
            this.f35524a = t0Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running getTags() operation from pending queue.");
            C8338d3.m46444L0(this.f35524a);
        }
    }

    /* renamed from: com.onesignal.d3$m0 */
    /* compiled from: OneSignal */
    public interface C8374m0 {
        /* renamed from: j */
        void mo27735j(C8372l0 l0Var);

        void onSuccess();
    }

    /* renamed from: com.onesignal.d3$n */
    /* compiled from: OneSignal */
    class C8375n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8388t0 f35525a;

        C8375n(C8388t0 t0Var) {
            this.f35525a = t0Var;
        }

        public void run() {
            synchronized (C8338d3.f35431b0) {
                C8338d3.f35431b0.add(this.f35525a);
                if (C8338d3.f35431b0.size() <= 1) {
                    C8338d3.m46485X1();
                }
            }
        }
    }

    /* renamed from: com.onesignal.d3$n0 */
    /* compiled from: OneSignal */
    interface C8376n0 {
        /* renamed from: a */
        void mo27738a(C8364i0 i0Var);
    }

    /* renamed from: com.onesignal.d3$o */
    /* compiled from: OneSignal */
    class C8377o implements Runnable {
        C8377o() {
        }

        public void run() {
            JSONObject jSONObject;
            C8532o4.C8537e i = C8592r3.m47622i(!C8338d3.f35423V);
            if (i.f35840a) {
                boolean unused = C8338d3.f35423V = true;
            }
            synchronized (C8338d3.f35431b0) {
                Iterator it = C8338d3.f35431b0.iterator();
                while (it.hasNext()) {
                    C8388t0 t0Var = (C8388t0) it.next();
                    if (i.f35841b != null) {
                        if (!i.toString().equals("{}")) {
                            jSONObject = i.f35841b;
                            t0Var.mo27748c(jSONObject);
                        }
                    }
                    jSONObject = null;
                    t0Var.mo27748c(jSONObject);
                }
                C8338d3.f35431b0.clear();
            }
        }
    }

    /* renamed from: com.onesignal.d3$o0 */
    /* compiled from: OneSignal */
    public static class C8378o0 {

        /* renamed from: a */
        private C8380p0 f35526a;

        /* renamed from: b */
        private String f35527b;

        C8378o0(C8380p0 p0Var, String str) {
            this.f35526a = p0Var;
            this.f35527b = str;
        }

        /* renamed from: a */
        public String mo27740a() {
            return this.f35527b;
        }

        /* renamed from: b */
        public C8380p0 mo27741b() {
            return this.f35526a;
        }
    }

    /* renamed from: com.onesignal.d3$p */
    /* compiled from: OneSignal */
    class C8379p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8685z1 f35528a;

        C8379p(C8685z1 z1Var) {
            this.f35528a = z1Var;
        }

        public void run() {
            C8338d3.f35463s.mo27754m(this.f35528a);
        }
    }

    /* renamed from: com.onesignal.d3$p0 */
    /* compiled from: OneSignal */
    public enum C8380p0 {
        REQUIRES_EXTERNAL_ID_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* renamed from: com.onesignal.d3$q */
    /* compiled from: OneSignal */
    class C8381q extends C8524o3.C8531g {
        C8381q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8338d3.m46550o1("sending Notification Opened Failed", i, th, str);
        }
    }

    /* renamed from: com.onesignal.d3$q0 */
    /* compiled from: OneSignal */
    private static class C8382q0 {

        /* renamed from: a */
        JSONArray f35533a;

        /* renamed from: b */
        boolean f35534b;

        /* renamed from: c */
        C8524o3.C8531g f35535c;

        C8382q0(JSONArray jSONArray) {
            this.f35533a = jSONArray;
        }
    }

    /* renamed from: com.onesignal.d3$r */
    /* compiled from: OneSignal */
    class C8383r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f35536a;

        C8383r(boolean z) {
            this.f35536a = z;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setSubscription() operation from pending queue.");
            C8338d3.m46447M(this.f35536a);
        }
    }

    /* renamed from: com.onesignal.d3$r0 */
    /* compiled from: OneSignal */
    public enum C8384r0 {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* renamed from: com.onesignal.d3$s */
    /* compiled from: OneSignal */
    class C8385s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f35545a;

        C8385s(boolean z) {
            this.f35545a = z;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running setLocationShared() operation from pending task queue.");
            C8338d3.m46575u2(this.f35545a);
        }
    }

    /* renamed from: com.onesignal.d3$s0 */
    /* compiled from: OneSignal */
    public interface C8386s0 {
        /* renamed from: a */
        void mo27745a(JSONObject jSONObject);

        /* renamed from: g */
        void mo27746g(C8378o0 o0Var);
    }

    /* renamed from: com.onesignal.d3$t */
    /* compiled from: OneSignal */
    class C8387t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8400z0 f35546a;

        /* renamed from: b */
        final /* synthetic */ boolean f35547b;

        C8387t(C8400z0 z0Var, boolean z) {
            this.f35546a = z0Var;
            this.f35547b = z;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running promptLocation() operation from pending queue.");
            C8338d3.m46421F1(this.f35546a, this.f35547b);
        }
    }

    /* renamed from: com.onesignal.d3$t0 */
    /* compiled from: OneSignal */
    public interface C8388t0 {
        /* renamed from: c */
        void mo27748c(JSONObject jSONObject);
    }

    /* renamed from: com.onesignal.d3$u */
    /* compiled from: OneSignal */
    class C8389u {
        C8389u() {
        }
    }

    /* renamed from: com.onesignal.d3$u0 */
    /* compiled from: OneSignal */
    public interface C8390u0 {
        /* renamed from: k */
        void mo27749k(C8646x0 x0Var);
    }

    /* renamed from: com.onesignal.d3$v */
    /* compiled from: OneSignal */
    class C8391v extends C8303b0.C8308e {

        /* renamed from: a */
        final /* synthetic */ C8400z0 f35548a;

        C8391v(C8400z0 z0Var) {
            this.f35548a = z0Var;
        }

        /* renamed from: a */
        public void mo27610a(C8303b0.C8307d dVar) {
            if (!C8338d3.m46426G2("promptLocation()") && dVar != null) {
                C8592r3.m47612D(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27613b(C8359g1 g1Var) {
            super.mo27613b(g1Var);
            C8400z0 z0Var = this.f35548a;
            if (z0Var != null) {
                z0Var.mo27758a(g1Var);
            }
        }

        public C8303b0.C8309f getType() {
            return C8303b0.C8309f.PROMPT_LOCATION;
        }
    }

    /* renamed from: com.onesignal.d3$v0 */
    /* compiled from: OneSignal */
    interface C8392v0 {
        /* renamed from: a */
        void mo27750a(String str, boolean z);
    }

    /* renamed from: com.onesignal.d3$w */
    /* compiled from: OneSignal */
    class C8393w implements Runnable {
        C8393w() {
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running clearOneSignalNotifications() operation from pending queue.");
            C8338d3.m46435J();
        }
    }

    /* renamed from: com.onesignal.d3$w0 */
    /* compiled from: OneSignal */
    public static class C8394w0 {

        /* renamed from: a */
        private int f35549a;

        /* renamed from: b */
        private String f35550b;

        C8394w0(int i, String str) {
            this.f35549a = i;
            this.f35550b = str;
        }

        /* renamed from: a */
        public String mo27752a() {
            return this.f35550b;
        }
    }

    /* renamed from: com.onesignal.d3$x */
    /* compiled from: OneSignal */
    class C8395x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f35551a;

        C8395x(int i) {
            this.f35551a = i;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running removeNotification() operation from pending queue.");
            C8338d3.m46464Q1(this.f35551a);
        }
    }

    /* renamed from: com.onesignal.d3$x0 */
    /* compiled from: OneSignal */
    public interface C8396x0 {
        /* renamed from: m */
        void mo27754m(C8685z1 z1Var);
    }

    /* renamed from: com.onesignal.d3$y */
    /* compiled from: OneSignal */
    class C8397y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f35552a;

        C8397y(boolean z) {
            this.f35552a = z;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running pauseInAppMessages() operation from pending queue.");
            C8338d3.m46405B1(this.f35552a);
        }
    }

    /* renamed from: com.onesignal.d3$y0 */
    /* compiled from: OneSignal */
    public interface C8398y0 {
        /* renamed from: l */
        void mo27756l(C8295a2 a2Var);
    }

    /* renamed from: com.onesignal.d3$z */
    /* compiled from: OneSignal */
    class C8399z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35553a;

        /* renamed from: b */
        final /* synthetic */ C8353e1 f35554b;

        C8399z(String str, C8353e1 e1Var) {
            this.f35553a = str;
            this.f35554b = e1Var;
        }

        public void run() {
            C8338d3.f35402A.mo28016d("Running sendOutcome() operation from pending queue.");
            C8338d3.m46515f2(this.f35553a, this.f35554b);
        }
    }

    /* renamed from: com.onesignal.d3$z0 */
    /* compiled from: OneSignal */
    interface C8400z0 {
        /* renamed from: a */
        void mo27758a(C8359g1 g1Var);
    }

    static {
        C8523o2 o2Var = new C8523o2();
        f35411J = o2Var;
        C10306f fVar = new C10306f(o2Var, f35402A, f35406E);
        f35412K = fVar;
        f35413L = new C8497m2(f35404C, fVar, f35402A);
    }

    /* renamed from: A */
    public static void m46399A(C8407e2 e2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        m46581w0().mo27628a(e2Var);
        if (m46493a0(f35438f).mo27782b(m46549o0(f35438f))) {
            OSPermissionChangedInternalObserver.m46147a(m46493a0(f35438f));
        }
    }

    /* renamed from: A0 */
    static C8508n3.C8515f m46400A0() {
        return f35407F.mo27845d();
    }

    /* renamed from: A1 */
    static void m46401A1(Activity activity, JSONArray jSONArray) {
        try {
            Intent b = C8608t.f36032a.mo28207a(activity, jSONArray.getJSONObject(0)).mo28193b();
            if (b != null) {
                C8547p1 p1Var = f35402A;
                p1Var.mo28018f("SDK running startActivity with Intent: " + b);
                activity.startActivity(b);
                return;
            }
            f35402A.mo28018f("SDK not showing an Activity automatically due to it's settings.");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: A2 */
    public static void m46402A2(boolean z) {
        if (m46593z0().mo27848g()) {
            f35402A.mo28017e("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!m46482W1() || z) {
            m46593z0().mo27857p(z);
        } else {
            m46492a(C8384r0.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    /* renamed from: B */
    public static void m46403B(C8468j2 j2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        m46412D0().mo27628a(j2Var);
        if (m46497b0(f35438f).mo27890b(m46553p0(f35438f))) {
            OSSMSSubscriptionChangedInternalObserver.m46155a(m46497b0(f35438f));
        }
    }

    /* renamed from: B0 */
    static String m46404B0() {
        if (f35454n == null && f35438f != null) {
            f35454n = C8500m3.m47107f(C8500m3.f35731a, "PREFS_OS_SMS_ID", (String) null);
        }
        if (TextUtils.isEmpty(f35454n)) {
            return null;
        }
        return f35454n;
    }

    /* renamed from: B1 */
    public static void m46405B1(boolean z) {
        if (f35438f == null) {
            f35402A.mo28013a("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            f35409H.mo28224c(new C8397y(z));
            return;
        }
        m46541m0().mo27627v0(!z);
    }

    /* renamed from: B2 */
    public static void m46406B2(String str, String str2, C8347c1 c1Var) {
        if (f35409H.mo28238g("setSMSNumber()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            f35409H.mo28224c(new C8342b(str, str2, c1Var));
        } else if (!m46426G2("setSMSNumber()")) {
            if (TextUtils.isEmpty(str)) {
                if (c1Var != null) {
                    c1Var.mo27706d(new C8344b1(C8365i1.VALIDATION, "SMS number is invalid"));
                }
                f35402A.mo28013a("SMS number is invalid");
            } else if (!m46400A0().f35761c || !(str2 == null || str2.length() == 0)) {
                f35428a = c1Var;
                m46497b0(f35438f).mo27897h(str);
                C8592r3.m47639z(str, str2);
            } else {
                if (c1Var != null) {
                    c1Var.mo27706d(new C8344b1(C8365i1.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                f35402A.mo28013a("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    /* renamed from: C */
    public static void m46407C(C8548p2 p2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        m46440K0().mo27628a(p2Var);
        if (m46501c0(f35438f).mo27542a(m46561r0(f35438f))) {
            OSSubscriptionChangedInternalObserver.m46156a(m46501c0(f35438f));
        }
    }

    /* renamed from: C0 */
    static C8474k2 m46408C0() {
        return m46497b0(f35438f);
    }

    /* renamed from: C1 */
    public static void m46409C1(JSONObject jSONObject, C8356f1 f1Var) {
        if (!m46426G2("postNotification()")) {
            try {
                if (!jSONObject.has("app_id")) {
                    jSONObject.put("app_id", m46416E0());
                }
                if (jSONObject.has("app_id")) {
                    C8524o3.m47238j("notifications/", jSONObject, new C8371l(f1Var));
                } else if (f1Var != null) {
                    f1Var.mo27716f(new JSONObject().put("error", "Missing app_id"));
                }
            } catch (JSONException e) {
                f35402A.mo28015c("HTTP create notification json exception!", e);
                if (f1Var != null) {
                    try {
                        f1Var.mo27716f(new JSONObject("{'error': 'HTTP create notification json exception!'}"));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: C2 */
    private static void m46410C2(boolean z) {
        C8301b.m46282c((Application) f35438f);
        if (z) {
            f35458p = new C10568a(f35411J);
            C8500m3.m47116o();
            C8475k3 d0 = m46505d0();
            C8610t1 t1Var = new C8610t1(d0, f35402A);
            f35416O = t1Var;
            t1Var.mo28220h();
            m46541m0().mo27615G();
            if (f35415N == null) {
                f35415N = new C11508d(f35402A, f35410I, d0, f35411J);
            }
            f35413L.mo27959g();
            m46577v0().mo27683d();
        }
    }

    /* renamed from: D */
    public static void m46411D(Map<String, Object> map) {
        m46541m0().mo27614C(map);
    }

    /* renamed from: D0 */
    static C8311b2<C8468j2, C8482l2> m46412D0() {
        if (f35457o0 == null) {
            f35457o0 = new C8311b2<>("onSMSSubscriptionChanged", true);
        }
        return f35457o0;
    }

    /* renamed from: D1 */
    public static void m46413D1(boolean z, C8362h1 h1Var) {
        C8479l0.f35681d.mo27921h(z, h1Var);
    }

    /* renamed from: D2 */
    private static void m46414D2(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                m46402A2("ENABLE".equalsIgnoreCase(string));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: E */
    static void m46415E(String str) {
        C8364i0 i0Var = C8364i0.NOTIFICATION_CLICK;
        f35467w = i0Var;
        f35413L.mo27962j(i0Var, str);
    }

    /* renamed from: E0 */
    static String m46416E0() {
        return m46420F0(f35438f);
    }

    /* renamed from: E1 */
    public static void m46417E1() {
        m46421F1((C8400z0) null, false);
    }

    /* renamed from: E2 */
    static boolean m46418E2(C8632v1 v1Var) {
        if (!m46518g1()) {
            m46594z1(C8384r0.INFO, "App is in background, show notification");
            return false;
        } else if (f35462r == null) {
            m46594z1(C8384r0.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        } else if (!v1Var.mo28260n()) {
            return true;
        } else {
            m46594z1(C8384r0.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        }
    }

    /* renamed from: F */
    static boolean m46419F() {
        if (f35407F.mo27861v()) {
            return OSUtils.m46194a(f35438f);
        }
        return true;
    }

    /* renamed from: F0 */
    private static String m46420F0(Context context) {
        if (context == null) {
            return null;
        }
        return C8500m3.m47107f(C8500m3.f35731a, "GT_APP_ID", (String) null);
    }

    /* renamed from: F1 */
    static void m46421F1(C8400z0 z0Var, boolean z) {
        if (f35409H.mo28238g("promptLocation()")) {
            f35402A.mo28013a("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            f35409H.mo28224c(new C8387t(z0Var, z));
        } else if (!m46426G2("promptLocation()")) {
            C8303b0.m46289g(f35438f, true, z, new C8391v(z0Var));
        }
    }

    /* renamed from: F2 */
    private static boolean m46422F2(Activity activity, JSONArray jSONArray) {
        if (f35466v) {
            return false;
        }
        try {
            return new C8663y1(activity, jSONArray.getJSONObject(0)).mo28334a();
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: G */
    static boolean m46423G(C8384r0 r0Var) {
        return r0Var.compareTo(f35446j) < 1 || r0Var.compareTo(f35448k) < 1;
    }

    /* renamed from: G0 */
    private static String m46424G0(Context context) {
        if (context == null) {
            return null;
        }
        return C8500m3.m47107f(C8500m3.f35731a, "GT_PLAYER_ID", (String) null);
    }

    /* renamed from: G1 */
    public static void m46425G1(boolean z) {
        boolean O2 = m46458O2();
        f35407F.mo27860u(z);
        if (!O2 && z && f35433c0 != null) {
            m46492a(C8384r0.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
            m46433I1();
        }
    }

    /* renamed from: G2 */
    static boolean m46426G2(String str) {
        if (!m46482W1()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        C8384r0 r0Var = C8384r0.WARN;
        m46492a(r0Var, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    /* renamed from: H */
    static void m46427H() {
        if (!f35466v) {
            C8401d4 d4Var = f35469y;
            if (d4Var != null) {
                d4Var.mo27759c();
            }
            m46537l0().mo28049a();
            m46507d2();
        }
    }

    /* renamed from: H0 */
    public static String m46428H0() {
        return "040802";
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static boolean m46429H1(int i) {
        return i < -6;
    }

    /* renamed from: H2 */
    private static boolean m46430H2() {
        if (m46518g1() && m46530j1()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    static void m46431I(C8364i0 i0Var) {
        for (C8376n0 a : new ArrayList(f35436e)) {
            a.mo27738a(i0Var);
        }
    }

    /* renamed from: I0 */
    static C8497m2 m46432I0() {
        return f35413L;
    }

    /* renamed from: I1 */
    private static boolean m46433I1() {
        Context context;
        String str;
        if (f35465u) {
            return false;
        }
        C8504n nVar = f35433c0;
        if (nVar == null) {
            str = m46416E0();
            context = f35438f;
            f35402A.mo28013a("Trying to continue OneSignal with null delayed params");
        } else {
            str = nVar.mo27970a();
            context = f35433c0.mo27971b();
        }
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("reassignDelayedInitParams with appContext: " + f35438f);
        f35433c0 = null;
        m46539l2(str);
        if (f35465u) {
            return true;
        }
        if (context == null) {
            f35402A.mo28013a("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        m46506d1(context);
        return true;
    }

    /* renamed from: I2 */
    static void m46434I2(boolean z) {
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("OneSignal startLocationShared: " + z);
        m46593z0().mo27856o(z);
        if (!z) {
            f35402A.mo28016d("OneSignal is shareLocation set false, clearing last location!");
            C8592r3.m47615b();
        }
    }

    /* renamed from: J */
    public static void m46435J() {
        C8610t1 t1Var;
        if (f35409H.mo28238g("clearOneSignalNotifications()") || (t1Var = f35416O) == null) {
            f35402A.mo28013a("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
            f35409H.mo28224c(new C8393w());
            return;
        }
        t1Var.mo28221i(new WeakReference(f35438f));
    }

    /* renamed from: J0 */
    static C8507n2 m46436J0() {
        return f35411J;
    }

    /* renamed from: J1 */
    static void m46437J1() {
        m46493a0(f35438f).mo27786e();
    }

    /* renamed from: J2 */
    private static void m46438J2() {
        C8303b0.m46289g(f35438f, false, false, new C8349d0());
    }

    /* renamed from: K */
    public static void m46439K(Collection<String> collection, C8367j0 j0Var) {
        if (!m46426G2("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String put : collection) {
                    jSONObject.put(put, "");
                }
                m46531j2(jSONObject, j0Var);
            } catch (Throwable th) {
                m46496b(C8384r0.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    /* renamed from: K0 */
    static C8311b2<C8548p2, C8579q2> m46440K0() {
        if (f35445i0 == null) {
            f35445i0 = new C8311b2<>("onOSSubscriptionChanged", true);
        }
        return f35445i0;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static void m46441K1() {
        m46585x0().mo28203a(f35438f, f35444i, new C8352e0());
    }

    /* renamed from: K2 */
    private static void m46442K2() {
        if (!f35424W) {
            f35424W = true;
            if (f35466v && C8592r3.m47621h()) {
                f35422U = false;
            }
            m46438J2();
            f35421T = false;
            if (m46400A0() != null) {
                m46441K1();
            } else {
                m46562r1(f35442h, m46463Q0(), true);
            }
        }
    }

    /* renamed from: L */
    public static void m46443L(JSONArray jSONArray, C8367j0 j0Var) {
        if (!m46426G2("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    jSONObject.put(jSONArray.getString(i), "");
                }
                m46531j2(jSONObject, j0Var);
            } catch (Throwable th) {
                m46496b(C8384r0.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    /* renamed from: L0 */
    public static void m46444L0(C8388t0 t0Var) {
        if (f35409H.mo28238g("getTags()")) {
            f35402A.mo28013a("Waiting for remote params. Moving getTags() operation to a pending queue.");
            f35409H.mo28224c(new C8373m(t0Var));
        } else if (!m46426G2("getTags()")) {
            if (t0Var == null) {
                f35402A.mo28013a("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new C8375n(t0Var), "OS_GETTAGS").start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static void m46445L1() {
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("registerUser:registerForPushFired:" + f35421T + ", locationFired: " + f35422U + ", remoteParams: " + m46400A0() + ", appId: " + f35442h);
        if (!f35421T || !f35422U || m46400A0() == null || f35442h == null) {
            f35402A.mo28016d("registerUser not possible");
        } else {
            new Thread(new C8339a(), "OS_REG_USER").start();
        }
    }

    /* renamed from: L2 */
    static void m46446L2(String str) {
        m46495a2(str);
        m46489Z(f35438f).mo28217i(str);
        try {
            C8592r3.m47613E(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M */
    public static void m46447M(boolean z) {
        if (f35409H.mo28238g("setSubscription()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            f35409H.mo28224c(new C8383r(z));
        } else if (!m46426G2("setSubscription()")) {
            m46501c0(f35438f).mo27551i(z);
            C8592r3.m47609A(!z);
        }
    }

    /* renamed from: M0 */
    static C8642w2 m46448M0() {
        return f35406E;
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static void m46449M1() throws JSONException {
        C8303b0.C8307d dVar;
        String packageName = f35438f.getPackageName();
        PackageManager packageManager = f35438f.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", m46416E0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", m46456O0());
        jSONObject.put("timezone_id", m46452N0());
        jSONObject.put("language", f35458p.mo33766b());
        jSONObject.put("sdk", "040802");
        jSONObject.put("sdk_type", f35418Q);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("net_type", f35420S.mo27560i());
        jSONObject.put("carrier", f35420S.mo27558d());
        jSONObject.put("rooted", C8316b4.m46332a());
        C8592r3.m47611C(jSONObject, (C8592r3.C8595b) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", f35419R);
        jSONObject2.put("subscribableStatus", f35456o);
        jSONObject2.put("androidPermission", m46419F());
        jSONObject2.put("device_type", f35420S.mo27559e());
        C8592r3.m47613E(jSONObject2);
        if (m46526i1() && (dVar = f35426Y) != null) {
            C8592r3.m47612D(dVar);
        }
        f35402A.mo28016d("registerUserTask calling readyToUpdate");
        C8592r3.m47629p(true);
        f35424W = false;
    }

    /* renamed from: M2 */
    static void m46450M2(String str) {
        m46499b2(str);
        m46497b0(f35438f).mo27898i(str);
    }

    /* renamed from: N */
    private static void m46451N() {
        if (m46430H2()) {
            C8547p1 p1Var = f35402A;
            p1Var.mo28016d("Starting new session with appEntryState: " + m46480W());
            C8592r3.m47636w();
            m46577v0().mo27684e();
            f35413L.mo27965m(m46480W());
            m46541m0().mo28350s0();
            m46571t2(f35406E.mo28281b());
        } else if (m46518g1()) {
            C8547p1 p1Var2 = f35402A;
            p1Var2.mo28016d("Continue on same session with appEntryState: " + m46480W());
            f35413L.mo27956c(m46480W());
        }
        m46541m0().mo27619X();
        if (!f35466v && m46498b1()) {
            f35402A.mo28016d("doSessionInit on background with already registered user");
        }
        m46442K2();
    }

    /* renamed from: N0 */
    private static String m46452N0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    /* renamed from: N1 */
    public static void m46453N1(C8599s0 s0Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
        } else {
            m46529j0().mo27631d(s0Var);
        }
    }

    /* renamed from: N2 */
    static void m46454N2(String str) {
        m46503c2(str);
        m46510e1();
        m46501c0(f35438f).mo27553k(str);
        C8382q0 q0Var = f35459p0;
        if (q0Var != null) {
            m46523h2(q0Var.f35533a, q0Var.f35534b, q0Var.f35535c);
            f35459p0 = null;
        }
        C8592r3.m47630q();
    }

    /* renamed from: O */
    private static void m46455O() {
        for (JSONArray Y1 : f35427Z) {
            m46488Y1(Y1);
        }
        f35427Z.clear();
    }

    /* renamed from: O0 */
    private static int m46456O0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / AdError.NETWORK_ERROR_CODE;
    }

    /* renamed from: O1 */
    static void m46457O1(C8376n0 n0Var) {
        f35436e.remove(n0Var);
    }

    /* renamed from: O2 */
    public static boolean m46458O2() {
        return f35407F.mo27846e();
    }

    /* renamed from: P */
    static void m46459P() {
        C8374m0 m0Var = f35432c;
        if (m0Var != null) {
            m0Var.mo27735j(new C8372l0(C8370k0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f35432c = null;
        }
    }

    /* renamed from: P0 */
    public static Object m46460P0(String str) {
        if (f35438f != null) {
            return m46541m0().mo27617U(str);
        }
        f35402A.mo28013a("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
        return null;
    }

    /* renamed from: P1 */
    public static void m46461P1(C8386s0 s0Var) {
        if (!m46426G2("removeExternalUserId()")) {
            m46547n2("", s0Var);
        }
    }

    /* renamed from: Q */
    static void m46462Q() {
        C8374m0 m0Var = f35432c;
        if (m0Var != null) {
            m0Var.onSuccess();
            f35432c = null;
        }
    }

    /* renamed from: Q0 */
    static String m46463Q0() {
        Context context;
        if (f35450l == null && (context = f35438f) != null) {
            f35450l = m46424G0(context);
        }
        return f35450l;
    }

    /* renamed from: Q1 */
    public static void m46464Q1(int i) {
        if (f35409H.mo28238g("removeNotification()") || f35416O == null) {
            f35402A.mo28013a("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            f35409H.mo28224c(new C8395x(i));
        } else if (!m46426G2("removeNotification()")) {
            f35416O.mo28223l(i, new WeakReference(f35438f));
        }
    }

    /* renamed from: R */
    static void m46465R(C8600s1 s1Var) {
        m46594z1(C8384r0.INFO, "Fire notificationWillShowInForegroundHandler");
        C8295a2 c = s1Var.mo28195c();
        try {
            f35462r.mo27756l(c);
        } catch (Throwable th) {
            m46594z1(C8384r0.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c.mo27590b(c.mo27591c());
            throw th;
        }
    }

    /* renamed from: R0 */
    private static void m46466R0(Context context) {
        C8289a b = C8301b.m46281b();
        boolean z = context instanceof Activity;
        boolean z2 = m46486Y() == null;
        m46563r2(!z2 || z);
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("OneSignal handleActivityLifecycleHandler inForeground: " + f35466v);
        if (f35466v) {
            if (z2 && z && b != null) {
                b.mo27585r((Activity) context);
                b.mo27586s(true);
            }
            OSNotificationRestoreWorkManager.m46139c(context, false);
            m46537l0().mo28050b();
        } else if (b != null) {
            b.mo27586s(true);
        }
    }

    /* renamed from: R1 */
    public static void m46467R1(C8407e2 e2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not modify permission observer");
        } else {
            m46581w0().mo27631d(e2Var);
        }
    }

    /* renamed from: S */
    private static void m46468S(C8685z1 z1Var) {
        OSUtils.m46187T(new C8379p(z1Var));
    }

    /* renamed from: S0 */
    private static void m46469S0() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f35469y = new C8401d4(f35438f);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: S1 */
    public static void m46470S1(C8468j2 j2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
        } else {
            m46412D0().mo27631d(j2Var);
        }
    }

    /* renamed from: T */
    static void m46471T() {
        C8347c1 c1Var = f35428a;
        if (c1Var != null) {
            c1Var.mo27706d(new C8344b1(C8365i1.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f35428a = null;
        }
    }

    /* renamed from: T0 */
    private static void m46472T0() {
        String E0 = m46416E0();
        if (E0 == null) {
            C8384r0 r0Var = C8384r0.DEBUG;
            m46492a(r0Var, "App id set for first time:  " + f35442h);
            C8458i.m46864d(0, f35438f);
            m46491Z1(f35442h);
        } else if (!E0.equals(f35442h)) {
            C8384r0 r0Var2 = C8384r0.DEBUG;
            m46492a(r0Var2, "App id has changed:\nFrom: " + E0 + "\n To: " + f35442h + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
            m46491Z1(f35442h);
            C8592r3.m47631r();
            f35407F.mo27842a();
        }
    }

    /* renamed from: T1 */
    public static void m46473T1(C8548p2 p2Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not modify subscription observer");
        } else {
            m46440K0().mo27631d(p2Var);
        }
    }

    /* renamed from: U */
    static void m46474U(JSONObject jSONObject) {
        C8347c1 c1Var = f35428a;
        if (c1Var != null) {
            c1Var.mo27705a(jSONObject);
            f35428a = null;
        }
    }

    /* renamed from: U0 */
    static void m46475U0() {
        C8374m0 m0Var = f35434d;
        if (m0Var != null) {
            m0Var.mo27735j(new C8372l0(C8370k0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f35434d = null;
        }
    }

    /* renamed from: U1 */
    public static void m46476U1(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m46541m0().mo27626q0(arrayList);
    }

    /* renamed from: V */
    private static C8685z1 m46477V(JSONArray jSONArray) {
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", (String) null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C8575q1(jSONObject));
                }
            } catch (Throwable th) {
                m46496b(C8384r0.ERROR, "Error parsing JSON item " + i + "/" + length + " for callback.", th);
            }
        }
        return new C8685z1(new C8575q1(arrayList, jSONObject, optInt), new C8585r1(str != null ? C8585r1.C8586a.ActionTaken : C8585r1.C8586a.Opened, str));
    }

    /* renamed from: V0 */
    static void m46478V0(Activity activity, JSONArray jSONArray, String str) {
        if (!m46426G2((String) null)) {
            m46570t1(activity, jSONArray);
            if (f35470z != null && m46533k0()) {
                f35470z.mo27766g(m46477V(jSONArray));
            }
            if (m46422F2(activity, jSONArray)) {
                m46415E(str);
            }
            m46401A1(activity, jSONArray);
            m46488Y1(jSONArray);
        }
    }

    /* renamed from: V1 */
    public static void m46479V1(Collection<String> collection) {
        m46541m0().mo27626q0(collection);
    }

    /* renamed from: W */
    static C8364i0 m46480W() {
        return f35467w;
    }

    /* renamed from: W0 */
    static void m46481W0(C8632v1 v1Var) {
        try {
            JSONObject jSONObject = new JSONObject(v1Var.mo28251e().toString());
            jSONObject.put("androidNotificationId", v1Var.mo28247a());
            C8685z1 V = m46477V(C8411f0.m46666g(jSONObject));
            if (f35470z != null && m46533k0()) {
                f35470z.mo27767h(V);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: W1 */
    public static boolean m46482W1() {
        return f35438f == null || (m46538l1() && !m46458O2());
    }

    /* renamed from: X */
    static boolean m46483X() {
        return f35407F.mo27843b();
    }

    /* renamed from: X0 */
    static void m46484X0() {
        C8374m0 m0Var = f35434d;
        if (m0Var != null) {
            m0Var.onSuccess();
            f35434d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static void m46485X1() {
        if (m46463Q0() == null) {
            f35402A.mo28017e("getTags called under a null user!");
        } else {
            m46510e1();
        }
    }

    /* renamed from: Y */
    static Activity m46486Y() {
        C8289a b = C8301b.m46281b();
        if (b != null) {
            return b.mo27576d();
        }
        return null;
    }

    /* renamed from: Y0 */
    static void m46487Y0(JSONObject jSONObject) {
        C8347c1 c1Var = f35430b;
        if (c1Var != null) {
            c1Var.mo27705a(jSONObject);
            f35430b = null;
        }
    }

    /* renamed from: Y1 */
    private static void m46488Y1(JSONArray jSONArray) {
        if (f35463s == null) {
            f35427Z.add(jSONArray);
            return;
        }
        C8685z1 V = m46477V(jSONArray);
        m46588y(V, f35467w);
        m46468S(V);
    }

    /* renamed from: Z */
    private static C8609t0 m46489Z(Context context) {
        if (context == null) {
            return null;
        }
        if (f35447j0 == null) {
            C8609t0 t0Var = new C8609t0(false);
            f35447j0 = t0Var;
            t0Var.mo28213e().mo27629b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f35447j0;
    }

    /* renamed from: Z0 */
    static boolean m46490Z0() {
        return !TextUtils.isEmpty(f35452m);
    }

    /* renamed from: Z1 */
    private static void m46491Z1(String str) {
        if (f35438f != null) {
            C8500m3.m47114m(C8500m3.f35731a, "GT_APP_ID", str);
        }
    }

    /* renamed from: a */
    static void m46492a(C8384r0 r0Var, String str) {
        m46496b(r0Var, str, (Throwable) null);
    }

    /* renamed from: a0 */
    private static C8419f2 m46493a0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35435d0 == null) {
            C8419f2 f2Var = new C8419f2(false);
            f35435d0 = f2Var;
            f2Var.mo27783c().mo27629b(new OSPermissionChangedInternalObserver());
        }
        return f35435d0;
    }

    /* renamed from: a1 */
    static boolean m46494a1() {
        return !TextUtils.isEmpty(f35454n);
    }

    /* renamed from: a2 */
    static void m46495a2(String str) {
        f35452m = str;
        if (f35438f != null) {
            C8500m3.m47114m(C8500m3.f35731a, "OS_EMAIL_ID", "".equals(f35452m) ? null : f35452m);
        }
    }

    /* renamed from: b */
    static void m46496b(C8384r0 r0Var, String str, Throwable th) {
        if (r0Var.compareTo(f35448k) < 1) {
            if (r0Var == C8384r0.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (r0Var == C8384r0.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (r0Var == C8384r0.INFO) {
                Log.i("OneSignal", str, th);
            } else if (r0Var == C8384r0.WARN) {
                Log.w("OneSignal", str, th);
            } else if (r0Var == C8384r0.ERROR || r0Var == C8384r0.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (r0Var.compareTo(f35446j) < 1 && m46486Y() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                OSUtils.m46187T(new C8358g0(r0Var, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    /* renamed from: b0 */
    private static C8474k2 m46497b0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35453m0 == null) {
            C8474k2 k2Var = new C8474k2(false);
            f35453m0 = k2Var;
            k2Var.mo27891c().mo27629b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f35453m0;
    }

    /* renamed from: b1 */
    static boolean m46498b1() {
        return m46463Q0() != null;
    }

    /* renamed from: b2 */
    static void m46499b2(String str) {
        f35454n = str;
        if (f35438f != null) {
            C8500m3.m47114m(C8500m3.f35731a, "PREFS_OS_SMS_ID", "".equals(f35454n) ? null : f35454n);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static OSSubscriptionState m46501c0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35441g0 == null) {
            f35441g0 = new OSSubscriptionState(false, m46493a0(context).mo27781a());
            m46493a0(context).mo27783c().mo27628a(f35441g0);
            f35441g0.mo27543b().mo27629b(new OSSubscriptionChangedInternalObserver());
        }
        return f35441g0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        return;
     */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m46502c1(android.content.Context r5) {
        /*
            java.lang.Class<com.onesignal.d3> r0 = com.onesignal.C8338d3.class
            monitor-enter(r0)
            com.onesignal.p1 r1 = f35402A     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Starting OneSignal initialization!"
            r1.mo28014b(r2)     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f35438f     // Catch:{ all -> 0x00dd }
            com.onesignal.C8600s1.m47647h(r1)     // Catch:{ all -> 0x00dd }
            boolean r1 = m46482W1()     // Catch:{ all -> 0x00dd }
            r2 = 0
            if (r1 != 0) goto L_0x00a9
            com.onesignal.i2 r1 = f35407F     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.mo27853l()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x0020
            goto L_0x00a9
        L_0x0020:
            int r1 = f35456o     // Catch:{ all -> 0x00dd }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L_0x0028
            goto L_0x0032
        L_0x0028:
            com.onesignal.OSUtils r1 = f35420S     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f35438f     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f35442h     // Catch:{ all -> 0x00dd }
            int r1 = r1.mo27556A(r3, r4)     // Catch:{ all -> 0x00dd }
        L_0x0032:
            f35456o = r1     // Catch:{ all -> 0x00dd }
            boolean r1 = m46534k1()     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            boolean r1 = f35465u     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0050
            com.onesignal.d3$x0 r5 = f35463s     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0047
            m46455O()     // Catch:{ all -> 0x00dd }
        L_0x0047:
            com.onesignal.p1 r5 = f35402A     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization already completed."
            r5.mo28016d(r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x0050:
            m46466R0(r5)     // Catch:{ all -> 0x00dd }
            f35440g = r2     // Catch:{ all -> 0x00dd }
            com.onesignal.C8592r3.m47625l()     // Catch:{ all -> 0x00dd }
            m46472T0()     // Catch:{ all -> 0x00dd }
            m46469S0()     // Catch:{ all -> 0x00dd }
            android.content.Context r5 = f35438f     // Catch:{ all -> 0x00dd }
            com.onesignal.f2 r5 = m46493a0(r5)     // Catch:{ all -> 0x00dd }
            com.onesignal.OSPermissionChangedInternalObserver.m46148b(r5)     // Catch:{ all -> 0x00dd }
            m46451N()     // Catch:{ all -> 0x00dd }
            com.onesignal.d3$x0 r5 = f35463s     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0071
            m46455O()     // Catch:{ all -> 0x00dd }
        L_0x0071:
            android.content.Context r5 = f35438f     // Catch:{ all -> 0x00dd }
            boolean r5 = com.onesignal.C8422f4.m46702a(r5)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0082
            com.onesignal.f4 r5 = new com.onesignal.f4     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f35438f     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f35468x = r5     // Catch:{ all -> 0x00dd }
        L_0x0082:
            boolean r5 = com.onesignal.C8409e4.m46650a()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0091
            com.onesignal.e4 r5 = new com.onesignal.e4     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f35438f     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f35470z = r5     // Catch:{ all -> 0x00dd }
        L_0x0091:
            r5 = 1
            f35465u = r5     // Catch:{ all -> 0x00dd }
            com.onesignal.d3$r0 r5 = com.onesignal.C8338d3.C8384r0.VERBOSE     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization done."
            m46492a(r5, r1)     // Catch:{ all -> 0x00dd }
            com.onesignal.d2 r5 = m46577v0()     // Catch:{ all -> 0x00dd }
            r5.mo27688q()     // Catch:{ all -> 0x00dd }
            com.onesignal.u2 r5 = f35409H     // Catch:{ all -> 0x00dd }
            r5.mo28226f()     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x00a9:
            com.onesignal.i2 r1 = f35407F     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.mo27853l()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x00b9
            com.onesignal.p1 r1 = f35402A     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for remote params."
            r1.mo28014b(r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00c0
        L_0x00b9:
            com.onesignal.p1 r1 = f35402A     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for privacy consent to be set."
            r1.mo28014b(r3)     // Catch:{ all -> 0x00dd }
        L_0x00c0:
            com.onesignal.n r1 = new com.onesignal.n     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f35438f     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f35442h     // Catch:{ all -> 0x00dd }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00dd }
            f35433c0 = r1     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = f35442h     // Catch:{ all -> 0x00dd }
            f35442h = r2     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = m46463Q0()     // Catch:{ all -> 0x00dd }
            r2 = 0
            m46562r1(r1, r5, r2)     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r0)
            return
        L_0x00dd:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8338d3.m46502c1(android.content.Context):void");
    }

    /* renamed from: c2 */
    static void m46503c2(String str) {
        f35450l = str;
        if (f35438f != null) {
            C8500m3.m47114m(C8500m3.f35731a, "GT_PLAYER_ID", f35450l);
        }
    }

    /* renamed from: d0 */
    static C8475k3 m46505d0() {
        return C8475k3.m46963n(f35438f);
    }

    /* renamed from: d1 */
    public static void m46506d1(Context context) {
        if (context == null) {
            f35402A.mo28017e("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f35440g = new WeakReference<>((Activity) context);
        }
        boolean z = f35438f == null;
        f35438f = context.getApplicationContext();
        m46410C2(z);
        m46414D2(f35438f);
        if (f35442h == null) {
            String E0 = m46416E0();
            if (E0 == null) {
                f35402A.mo28017e("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            C8547p1 p1Var = f35402A;
            p1Var.mo28014b("appContext set and cached app id found, calling setAppId with: " + E0);
            m46539l2(E0);
            return;
        }
        C8547p1 p1Var2 = f35402A;
        p1Var2.mo28014b("initWithContext called with: " + context);
        m46502c1(context);
    }

    /* renamed from: d2 */
    private static boolean m46507d2() {
        boolean o = C8592r3.m47628o();
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("OneSignal scheduleSyncService unsyncedChanges: " + o);
        if (o) {
            C8587r2.m47596q().mo28188s(f35438f);
        }
        boolean m = C8303b0.m46295m(f35438f);
        C8547p1 p1Var2 = f35402A;
        p1Var2.mo28016d("OneSignal scheduleSyncService locationScheduled: " + m);
        return m || o;
    }

    /* renamed from: e0 */
    static C8475k3 m46509e0(Context context) {
        return C8475k3.m46963n(context);
    }

    /* renamed from: e1 */
    private static void m46510e1() {
        ArrayList<C8388t0> arrayList = f35431b0;
        synchronized (arrayList) {
            if (arrayList.size() != 0) {
                new Thread(new C8377o(), "OS_GETTAGS_CALLBACK").start();
            }
        }
    }

    /* renamed from: e2 */
    static void m46511e2(List<C8418f1> list) {
        C8330d2 d2Var = f35414M;
        if (d2Var == null || f35442h == null) {
            m46492a(C8384r0.ERROR, "Make sure OneSignal.init is called first");
        } else {
            d2Var.mo27685m(list);
        }
    }

    /* renamed from: f0 */
    public static C8546p0 m46513f0() {
        Context context = f35438f;
        if (context != null) {
            return new C8546p0(m46501c0(context), m46493a0(f35438f), m46489Z(f35438f), m46497b0(f35438f));
        }
        f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
        return null;
    }

    /* renamed from: f1 */
    static boolean m46514f1() {
        return f35465u && m46518g1();
    }

    /* renamed from: f2 */
    public static void m46515f2(String str, C8353e1 e1Var) {
        if (!m46542m1(str)) {
            f35402A.mo28013a("Make sure OneSignal initWithContext and setAppId is called first");
        } else if (f35409H.mo28238g("sendOutcome()") || f35414M == null) {
            f35402A.mo28013a("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
            f35409H.mo28224c(new C8399z(str, e1Var));
        } else if (!m46426G2("sendOutcome()")) {
            f35414M.mo27686n(str, e1Var);
        }
    }

    /* renamed from: g0 */
    static boolean m46517g0() {
        return f35407F.mo27849h();
    }

    /* renamed from: g1 */
    static boolean m46518g1() {
        return f35466v;
    }

    /* renamed from: g2 */
    public static void m46519g2(String str, float f, C8353e1 e1Var) {
        C8330d2 d2Var;
        if (m46542m1(str) && m46546n1(f)) {
            if (f35409H.mo28238g("sendOutcomeWithValue()") || (d2Var = f35414M) == null) {
                f35402A.mo28013a("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
                f35409H.mo28224c(new C8343b0(str, f, e1Var));
                return;
            }
            d2Var.mo27687o(str, f, e1Var);
        }
    }

    /* renamed from: h0 */
    static String m46521h0() {
        if (f35452m == null && f35438f != null) {
            f35452m = C8500m3.m47107f(C8500m3.f35731a, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(f35452m)) {
            return null;
        }
        return f35452m;
    }

    /* renamed from: h1 */
    static boolean m46522h1() {
        return f35465u;
    }

    /* renamed from: h2 */
    static void m46523h2(JSONArray jSONArray, boolean z, C8524o3.C8531g gVar) {
        if (!m46426G2("sendPurchases()")) {
            if (m46463Q0() == null) {
                C8382q0 q0Var = new C8382q0(jSONArray);
                f35459p0 = q0Var;
                q0Var.f35534b = z;
                q0Var.f35535c = gVar;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", m46416E0());
                if (z) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                C8592r3.m47632s(jSONObject, gVar);
            } catch (Throwable th) {
                m46496b(C8384r0.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    /* renamed from: i0 */
    static C8609t0 m46525i0() {
        return m46489Z(f35438f);
    }

    /* renamed from: i1 */
    public static boolean m46526i1() {
        return f35407F.mo27850i();
    }

    /* renamed from: i2 */
    public static void m46527i2(JSONObject jSONObject) {
        m46531j2(jSONObject, (C8367j0) null);
    }

    /* renamed from: j0 */
    static C8311b2<C8599s0, C8622u0> m46529j0() {
        if (f35451l0 == null) {
            f35451l0 = new C8311b2<>("onOSEmailSubscriptionChanged", true);
        }
        return f35451l0;
    }

    /* renamed from: j1 */
    private static boolean m46530j1() {
        long b = m46448M0().mo28281b();
        long q0 = m46557q0();
        long j = b - q0;
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("isPastOnSessionTime currentTimeMillis: " + b + " lastSessionTime: " + q0 + " difference: " + j);
        return j >= 30000;
    }

    /* renamed from: j2 */
    public static void m46531j2(JSONObject jSONObject, C8367j0 j0Var) {
        if (f35409H.mo28238g("sendTags()")) {
            f35402A.mo28013a("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            f35409H.mo28224c(new C8363i(jSONObject, j0Var));
        } else if (!m46426G2("sendTags()")) {
            C8369k kVar = new C8369k(jSONObject, j0Var);
            if (f35409H.mo28225e()) {
                f35402A.mo28016d("Sending sendTags() operation to pending task queue.");
                f35409H.mo28224c(kVar);
                return;
            }
            kVar.run();
        }
    }

    /* renamed from: k0 */
    static boolean m46533k0() {
        return f35407F.mo27844c();
    }

    /* renamed from: k1 */
    private static boolean m46534k1() {
        return f35456o == -999;
    }

    /* renamed from: k2 */
    public static void m46535k2(String str, C8353e1 e1Var) {
        if (m46542m1(str)) {
            if (f35409H.mo28238g("sendUniqueOutcome()") || f35414M == null) {
                f35402A.mo28013a("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
                f35409H.mo28224c(new C8340a0(str, e1Var));
            } else if (!m46426G2("sendUniqueOutcome()")) {
                f35414M.mo27689r(str, e1Var);
            }
        }
    }

    /* renamed from: l0 */
    static C8540p m46537l0() {
        if (f35403B == null) {
            f35403B = new C8540p(new C8631v0(), f35402A);
        }
        return f35403B;
    }

    /* renamed from: l1 */
    static boolean m46538l1() {
        return f35407F.mo27851j();
    }

    /* renamed from: l2 */
    public static void m46539l2(String str) {
        if (str == null || str.isEmpty()) {
            C8547p1 p1Var = f35402A;
            p1Var.mo28017e("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(f35442h)) {
            f35465u = false;
            C8547p1 p1Var2 = f35402A;
            p1Var2.mo28014b("setAppId called with id: " + str + " changing id from: " + f35442h);
        }
        f35442h = str;
        if (f35438f == null) {
            f35402A.mo28017e("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
            return;
        }
        WeakReference<Activity> weakReference = f35440g;
        if (weakReference == null || weakReference.get() == null) {
            m46502c1(f35438f);
        } else {
            m46502c1((Context) f35440g.get());
        }
    }

    /* renamed from: m0 */
    static C8667z0 m46541m0() {
        return f35405D.mo27589a(m46505d0(), f35408G, m46569t0(), m46436J0(), f35458p);
    }

    /* renamed from: m1 */
    private static boolean m46542m1(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        m46492a(C8384r0.ERROR, "Outcome name must not be empty");
        return false;
    }

    /* renamed from: m2 */
    public static void m46543m2(String str, String str2, C8374m0 m0Var) {
        if (f35409H.mo28238g("setEmail()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            f35409H.mo28224c(new C8348d(str, str2, m0Var));
        } else if (!m46426G2("setEmail()")) {
            if (!OSUtils.m46177J(str)) {
                if (m0Var != null) {
                    m0Var.mo27735j(new C8372l0(C8370k0.VALIDATION, "Email is invalid"));
                }
                f35402A.mo28013a("Email is invalid");
            } else if (!m46400A0().f35762d || !(str2 == null || str2.length() == 0)) {
                f35432c = m0Var;
                String trim = str.trim();
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                m46489Z(f35438f).mo28216h(trim);
                C8592r3.m47634u(trim.toLowerCase(), str2);
            } else {
                if (m0Var != null) {
                    m0Var.mo27735j(new C8372l0(C8370k0.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                f35402A.mo28013a("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    /* renamed from: n0 */
    private static C8609t0 m46545n0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35449k0 == null) {
            f35449k0 = new C8609t0(true);
        }
        return f35449k0;
    }

    /* renamed from: n1 */
    private static boolean m46546n1(float f) {
        if (f > 0.0f) {
            return true;
        }
        m46492a(C8384r0.ERROR, "Outcome value must be greater than 0");
        return false;
    }

    /* renamed from: n2 */
    public static void m46547n2(String str, C8386s0 s0Var) {
        m46551o2(str, (String) null, s0Var);
    }

    /* renamed from: o0 */
    private static C8419f2 m46549o0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35437e0 == null) {
            f35437e0 = new C8419f2(true);
        }
        return f35437e0;
    }

    /* renamed from: o1 */
    static void m46550o1(String str, int i, Throwable th, String str2) {
        String str3;
        if (str2 == null || !m46423G(C8384r0.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        m46496b(C8384r0.WARN, "HTTP code: " + i + " " + str + str3, th);
    }

    /* renamed from: o2 */
    public static void m46551o2(String str, String str2, C8386s0 s0Var) {
        if (f35409H.mo28238g("setExternalUserId()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            f35409H.mo28224c(new C8360h(str, str2, s0Var));
        } else if (!m46426G2("setExternalUserId()")) {
            if (str == null) {
                f35402A.mo28017e("External id can't be null, set an empty string to remove an external id");
            } else if (str.isEmpty() || m46400A0() == null || !m46400A0().f35763e || !(str2 == null || str2.length() == 0)) {
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                try {
                    C8592r3.m47635v(str, str2, s0Var);
                } catch (JSONException e) {
                    String str3 = str.equals("") ? "remove" : "set";
                    C8547p1 p1Var = f35402A;
                    p1Var.mo28013a("Attempted to " + str3 + " external ID but encountered a JSON exception");
                    e.printStackTrace();
                }
            } else {
                if (s0Var != null) {
                    s0Var.mo27746g(new C8378o0(C8380p0.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                f35402A.mo28013a("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    /* renamed from: p0 */
    private static C8474k2 m46553p0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35455n0 == null) {
            f35455n0 = new C8474k2(true);
        }
        return f35455n0;
    }

    /* renamed from: p1 */
    public static void m46554p1(C8374m0 m0Var) {
        if (f35409H.mo28238g("logoutEmail()")) {
            f35402A.mo28013a("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            f35409H.mo28224c(new C8351e(m0Var));
        } else if (!m46426G2("logoutEmail()")) {
            if (m46521h0() == null) {
                if (m0Var != null) {
                    m0Var.mo27735j(new C8372l0(C8370k0.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
                }
                f35402A.mo28013a("logoutEmail not valid as email was not set or already logged out!");
                return;
            }
            f35434d = m0Var;
            C8592r3.m47626m();
        }
    }

    /* renamed from: p2 */
    public static void m46555p2(C8390u0 u0Var) {
        f35464t = u0Var;
    }

    /* renamed from: q0 */
    private static long m46557q0() {
        return C8500m3.m47105d(C8500m3.f35731a, "OS_LAST_SESSION_TIME", -31000);
    }

    /* renamed from: q1 */
    public static void m46558q1(C8347c1 c1Var) {
        if (f35409H.mo28238g("logoutSMSNumber()")) {
            f35402A.mo28013a("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            f35409H.mo28224c(new C8345c(c1Var));
        } else if (!m46426G2("logoutSMSNumber()")) {
            if (m46404B0() == null) {
                if (c1Var != null) {
                    c1Var.mo27706d(new C8344b1(C8365i1.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
                }
                f35402A.mo28013a("logoutSMSNumber() not valid as sms number was not set or already logged out!");
                return;
            }
            f35430b = c1Var;
            C8592r3.m47627n();
        }
    }

    /* renamed from: q2 */
    public static void m46559q2(C8329d1 d1Var) {
        if (f35438f == null) {
            f35402A.mo28013a("Waiting initWithContext. Moving setInAppMessageLifecycleHandler() operation to a pending task queue.");
            f35409H.mo28224c(new C8346c0(d1Var));
            return;
        }
        m46541m0().mo28351u0(d1Var);
    }

    /* renamed from: r0 */
    private static OSSubscriptionState m46561r0(Context context) {
        if (context == null) {
            return null;
        }
        if (f35443h0 == null) {
            f35443h0 = new OSSubscriptionState(true, false);
        }
        return f35443h0;
    }

    /* renamed from: r1 */
    private static void m46562r1(String str, String str2, boolean z) {
        if (m46400A0() == null && !f35425X) {
            f35425X = true;
            C8508n3.m47152e(str, str2, new C8355f0(z));
        }
    }

    /* renamed from: r2 */
    static void m46563r2(boolean z) {
        f35466v = z;
    }

    /* renamed from: s0 */
    private static C8384r0 m46565s0(int i) {
        switch (i) {
            case 0:
                return C8384r0.NONE;
            case 1:
                return C8384r0.FATAL;
            case 2:
                return C8384r0.ERROR;
            case 3:
                return C8384r0.WARN;
            case 4:
                return C8384r0.INFO;
            case 5:
                return C8384r0.DEBUG;
            case 6:
                return C8384r0.VERBOSE;
            default:
                if (i < 0) {
                    return C8384r0.NONE;
                }
                return C8384r0.VERBOSE;
        }
    }

    /* renamed from: s1 */
    static void m46566s1(Context context, JSONObject jSONObject, C8610t1.C8615e eVar) {
        if (f35416O == null) {
            f35416O = new C8610t1(m46509e0(context), f35402A);
        }
        f35416O.mo28222k(jSONObject, eVar);
    }

    /* renamed from: s2 */
    public static void m46567s2(String str, C8350d1 d1Var) {
        if (f35409H.mo28238g("setLanguage()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            f35409H.mo28224c(new C8354f(str, d1Var));
            return;
        }
        C8357g gVar = null;
        if (d1Var != null) {
            gVar = new C8357g(d1Var);
        }
        if (!m46426G2("setLanguage()")) {
            C10570c cVar = new C10570c(f35411J);
            cVar.mo33769b(str);
            f35458p.mo33767c(cVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("language", f35458p.mo33766b());
                C8592r3.m47611C(jSONObject, gVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: t0 */
    static C8547p1 m46569t0() {
        return f35402A;
    }

    /* renamed from: t1 */
    private static void m46570t1(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i).optString("custom", (String) null)).optString("i", (String) null);
                if (!f35429a0.contains(optString)) {
                    f35429a0.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", m46420F0(context));
                    jSONObject.put("player_id", m46424G0(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", f35420S.mo27559e());
                    C8524o3.m47240l("notifications/" + optString, jSONObject, new C8381q());
                }
            } catch (Throwable th) {
                m46496b(C8384r0.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    /* renamed from: t2 */
    static void m46571t2(long j) {
        C8547p1 p1Var = f35402A;
        p1Var.mo28016d("Last session time set to: " + j);
        C8500m3.m47113l(C8500m3.f35731a, "OS_LAST_SESSION_TIME", j);
    }

    /* renamed from: u0 */
    static String m46573u0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", (String) null);
            }
            f35402A.mo28016d("Not a OneSignal formatted FCM message. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            f35402A.mo28016d("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
    }

    /* renamed from: u1 */
    static void m46574u1() {
        C8384r0 r0Var = C8384r0.DEBUG;
        m46492a(r0Var, "Application on focus");
        m46563r2(true);
        C8364i0 i0Var = f35467w;
        C8364i0 i0Var2 = C8364i0.NOTIFICATION_CLICK;
        if (!i0Var.equals(i0Var2)) {
            m46431I(f35467w);
            if (!f35467w.equals(i0Var2)) {
                f35467w = C8364i0.APP_OPEN;
            }
        }
        C8303b0.m46294l();
        C8479l0.f35681d.mo27920g();
        if (!OSUtils.m46188U(f35442h)) {
            if (!f35407F.mo27853l()) {
                m46492a(r0Var, "Delay onAppFocus logic due to missing remote params");
                m46562r1(f35442h, m46463Q0(), false);
                return;
            }
            m46578v1();
        }
    }

    /* renamed from: u2 */
    public static void m46575u2(boolean z) {
        if (f35409H.mo28238g("setLocationShared()")) {
            f35402A.mo28013a("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            f35409H.mo28224c(new C8385s(z));
        } else if (!m46593z0().mo27847f()) {
            m46434I2(z);
        }
    }

    /* renamed from: v0 */
    static C8330d2 m46577v0() {
        if (f35414M == null) {
            synchronized (f35417P) {
                if (f35414M == null) {
                    if (f35415N == null) {
                        f35415N = new C11508d(f35402A, f35410I, m46505d0(), f35411J);
                    }
                    f35414M = new C8330d2(f35413L, f35415N);
                }
            }
        }
        return f35414M;
    }

    /* renamed from: v1 */
    private static void m46578v1() {
        if (!m46426G2("onAppFocus")) {
            m46537l0().mo28050b();
            m46451N();
            C8422f4 f4Var = f35468x;
            if (f4Var != null) {
                f4Var.mo27790u();
            }
            OSNotificationRestoreWorkManager.m46139c(f35438f, false);
            m46437J1();
            if (f35470z != null && m46533k0()) {
                f35470z.mo27765f();
            }
            C8587r2.m47596q().mo28186p(f35438f);
        }
    }

    /* renamed from: v2 */
    public static void m46579v2(int i, int i2) {
        m46583w2(m46565s0(i), m46565s0(i2));
    }

    /* renamed from: w0 */
    static C8311b2<C8407e2, C8449g2> m46581w0() {
        if (f35439f0 == null) {
            f35439f0 = new C8311b2<>("onOSPermissionChanged", true);
        }
        return f35439f0;
    }

    /* renamed from: w1 */
    static void m46582w1() {
        C8384r0 r0Var = C8384r0.DEBUG;
        m46492a(r0Var, "Application lost focus initDone: " + f35465u);
        m46563r2(false);
        f35467w = C8364i0.APP_CLOSE;
        m46571t2(m46448M0().mo28281b());
        C8303b0.m46294l();
        if (f35465u) {
            m46427H();
        } else if (f35409H.mo28238g("onAppLostFocus()")) {
            f35402A.mo28013a("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            f35409H.mo28224c(new C8361h0());
        }
    }

    /* renamed from: w2 */
    public static void m46583w2(C8384r0 r0Var, C8384r0 r0Var2) {
        f35448k = r0Var;
        f35446j = r0Var2;
    }

    /* renamed from: x */
    public static void m46584x(C8599s0 s0Var) {
        if (f35438f == null) {
            f35402A.mo28013a("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        m46529j0().mo27628a(s0Var);
        if (m46489Z(f35438f).mo28209b(m46545n0(f35438f))) {
            OSEmailSubscriptionChangedInternalObserver.m46122a(m46489Z(f35438f));
        }
    }

    /* renamed from: x0 */
    private static C8605s3 m46585x0() {
        C8605s3 s3Var = f35461q0;
        if (s3Var != null) {
            return s3Var;
        }
        if (OSUtils.m46170C()) {
            f35461q0 = new C8619t3();
        } else if (!OSUtils.m46169B()) {
            f35461q0 = new C8643w3();
        } else if (OSUtils.m46207r()) {
            f35461q0 = m46589y0();
        }
        return f35461q0;
    }

    /* renamed from: x1 */
    static void m46586x1() {
        m46437J1();
    }

    /* renamed from: x2 */
    public static void m46587x2(C8396x0 x0Var) {
        f35463s = x0Var;
        if (f35465u && x0Var != null) {
            m46455O();
        }
    }

    /* renamed from: y */
    static void m46588y(C8376n0 n0Var, C8364i0 i0Var) {
        if (!i0Var.equals(C8364i0.NOTIFICATION_CLICK)) {
            f35436e.add(n0Var);
        }
    }

    /* renamed from: y0 */
    private static C8634v3 m46589y0() {
        C8508n3.C8513d dVar = f35407F.mo27845d().f35774p;
        return new C8634v3(f35438f, dVar != null ? new C8634v3.C8635a(dVar.f35748a, dVar.f35749b, dVar.f35750c) : null);
    }

    /* renamed from: y1 */
    static void m46590y1() {
        if (!m46433I1() && f35466v) {
            m46578v1();
        }
    }

    /* renamed from: y2 */
    public static void m46591y2(C8398y0 y0Var) {
        f35462r = y0Var;
    }

    /* renamed from: z */
    static void m46592z(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", f35420S.mo27560i());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: z0 */
    static C8461i2 m46593z0() {
        return f35407F;
    }

    /* renamed from: z1 */
    public static void m46594z1(C8384r0 r0Var, String str) {
        m46492a(r0Var, str);
    }

    /* renamed from: z2 */
    static void m46595z2(C8341a1 a1Var) {
        if (f35460q == null) {
            f35460q = a1Var;
        }
    }
}
