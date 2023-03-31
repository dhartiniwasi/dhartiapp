package com.onesignal.flutter;

import android.content.Context;
import com.onesignal.C8295a2;
import com.onesignal.C8329d1;
import com.onesignal.C8338d3;
import com.onesignal.C8407e2;
import com.onesignal.C8449g2;
import com.onesignal.C8468j2;
import com.onesignal.C8548p2;
import com.onesignal.C8575q1;
import com.onesignal.C8579q2;
import com.onesignal.C8599s0;
import com.onesignal.C8622u0;
import com.onesignal.C8640w0;
import com.onesignal.C8646x0;
import com.onesignal.C8685z1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

public class OneSignalPlugin extends C8434a implements C12502a, C6556k.C6560c, C12588a, C8338d3.C8396x0, C8338d3.C8390u0, C8548p2, C8599s0, C8468j2, C8407e2, C8338d3.C8398y0 {

    /* renamed from: d */
    private C8646x0 f35611d;

    /* renamed from: e */
    private boolean f35612e = false;

    /* renamed from: f */
    private boolean f35613f = false;

    /* renamed from: g */
    private boolean f35614g = false;

    /* renamed from: h */
    private boolean f35615h = false;

    /* renamed from: i */
    private final HashMap<String, C8295a2> f35616i = new HashMap<>();

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$a */
    class C8426a extends C8329d1 {
        C8426a() {
        }

        /* renamed from: a */
        public void mo27679a(C8640w0 w0Var) {
            OneSignalPlugin.this.mo27798o("OneSignal#onDidDismissInAppMessage", C8443f.m46793f(w0Var));
        }

        /* renamed from: b */
        public void mo27680b(C8640w0 w0Var) {
            OneSignalPlugin.this.mo27798o("OneSignal#onDidDisplayInAppMessage", C8443f.m46793f(w0Var));
        }

        /* renamed from: c */
        public void mo27681c(C8640w0 w0Var) {
            OneSignalPlugin.this.mo27798o("OneSignal#onWillDismissInAppMessage", C8443f.m46793f(w0Var));
        }

        /* renamed from: d */
        public void mo27682d(C8640w0 w0Var) {
            OneSignalPlugin.this.mo27798o("OneSignal#onWillDisplayInAppMessage", C8443f.m46793f(w0Var));
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$b */
    static class C8427b extends C8429d implements C8338d3.C8374m0 {
        C8427b(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: j */
        public void mo27735j(C8338d3.C8372l0 l0Var) {
            if (!this.f35620f.getAndSet(true)) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error when " + this.f35619e + ": " + l0Var.mo27733a(), (Object) null);
            }
        }

        public void onSuccess() {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring!");
                return;
            }
            mo27801r(this.f35618d, (Object) null);
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$c */
    static class C8428c extends C8429d implements C8338d3.C8386s0 {
        C8428c(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: a */
        public void mo27745a(JSONObject jSONObject) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                mo27801r(this.f35618d, C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f35619e + ": " + e.getMessage(), (Object) null);
            }
        }

        /* renamed from: g */
        public void mo27746g(C8338d3.C8378o0 o0Var) {
            if (!this.f35620f.getAndSet(true)) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error when " + this.f35619e + " (" + o0Var.mo27741b() + "): " + o0Var.mo27740a(), (Object) null);
            }
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$d */
    static class C8429d extends C8434a {

        /* renamed from: d */
        protected final C6556k.C6561d f35618d;

        /* renamed from: e */
        protected final String f35619e;

        /* renamed from: f */
        protected final AtomicBoolean f35620f = new AtomicBoolean(false);

        C8429d(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            this.f35623c = cVar;
            this.f35622b = kVar;
            this.f35618d = dVar;
            this.f35619e = str;
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$e */
    static class C8430e extends C8429d implements C8338d3.C8356f1 {
        C8430e(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: a */
        public void mo27715a(JSONObject jSONObject) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                mo27801r(this.f35618d, C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f35619e + ": " + e.getMessage(), (Object) null);
            }
        }

        /* renamed from: f */
        public void mo27716f(JSONObject jSONObject) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error attempting to " + this.f35619e + " " + jSONObject.toString(), C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar2 = this.f35618d;
                mo27799p(dVar2, "OneSignal", "Encountered an error attempting to deserialize server response " + this.f35619e + " " + e.getMessage(), (Object) null);
            }
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$f */
    static class C8431f extends C8429d implements C8338d3.C8362h1 {
        C8431f(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: n */
        public void mo27722n(boolean z) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response");
                return;
            }
            mo27801r(this.f35618d, Boolean.valueOf(z));
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$g */
    static class C8432g extends C8429d implements C8338d3.C8347c1 {
        C8432g(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: a */
        public void mo27705a(JSONObject jSONObject) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response: " + jSONObject);
                return;
            }
            try {
                mo27801r(this.f35618d, C8443f.m46795h(jSONObject));
            } catch (JSONException e) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error attempting to deserialize server response for " + this.f35619e + ": " + e.getMessage(), (Object) null);
            }
        }

        /* renamed from: d */
        public void mo27706d(C8338d3.C8344b1 b1Var) {
            if (!this.f35620f.getAndSet(true)) {
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error when " + this.f35619e + " (" + b1Var.mo27702b() + "): " + b1Var.mo27701a(), (Object) null);
            }
        }
    }

    /* renamed from: com.onesignal.flutter.OneSignalPlugin$h */
    static class C8433h extends C8429d implements C8338d3.C8350d1 {
        C8433h(C6539c cVar, C6556k kVar, C6556k.C6561d dVar, String str) {
            super(cVar, kVar, dVar, str);
        }

        /* renamed from: b */
        public void mo27708b(String str) {
            if (this.f35620f.getAndSet(true)) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OneSignal " + this.f35619e + " handler called twice, ignoring! response: " + str);
                return;
            }
            if (str == null) {
                str = "Successfully set language.";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("success", Boolean.TRUE);
            hashMap.put("message", str);
            mo27801r(this.f35618d, hashMap);
        }

        /* renamed from: h */
        public void mo27709h(C8338d3.C8394w0 w0Var) {
            if (!this.f35620f.getAndSet(true)) {
                String a = w0Var.mo27752a();
                if (a == null) {
                    a = "Failed to set language.";
                }
                C6556k.C6561d dVar = this.f35618d;
                mo27799p(dVar, "OneSignal", "Encountered an error when " + this.f35619e + ": " + a, (Object) null);
            }
        }
    }

    /* renamed from: A */
    private void m46724A() {
        this.f35612e = true;
        C8646x0 x0Var = this.f35611d;
        if (x0Var != null) {
            mo27749k(x0Var);
            this.f35611d = null;
        }
    }

    /* renamed from: B */
    private void m46725B() {
        C8338d3.m46587x2(this);
    }

    /* renamed from: C */
    private void m46726C() {
        this.f35613f = true;
    }

    /* renamed from: D */
    private void m46727D(C6556k.C6561d dVar) {
        C8338d3.m46554p1(new C8427b(this.f35623c, this.f35622b, dVar, "logoutEmail"));
    }

    /* renamed from: E */
    private void m46728E(C6556k.C6561d dVar) {
        C8338d3.m46558q1(new C8432g(this.f35623c, this.f35622b, dVar, "logoutSMSNumber"));
    }

    /* renamed from: F */
    private void m46729F() {
        C8338d3.m46587x2((C8338d3.C8396x0) null);
        C8338d3.m46555p2((C8338d3.C8390u0) null);
    }

    /* renamed from: G */
    private void m46730G(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46594z1(C8338d3.C8384r0.values()[((Integer) jVar.mo22156a("logLevel")).intValue()], (String) jVar.mo22156a("message"));
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: H */
    private void m46731H(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46409C1(new JSONObject((Map) jVar.f31000b), new C8430e(this.f35623c, this.f35622b, dVar, "postNotification"));
    }

    /* renamed from: I */
    private void m46732I(C6556k.C6561d dVar) {
        C8338d3.m46417E1();
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: J */
    private void m46733J(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46413D1(((Boolean) jVar.mo22156a("fallback")).booleanValue(), new C8431f(this.f35623c, this.f35622b, dVar, "promptPermission"));
    }

    /* renamed from: K */
    private void m46734K(C6556k.C6561d dVar) {
        C8338d3.m46461P1(new C8428c(this.f35623c, this.f35622b, dVar, "removeExternalUserId"));
    }

    /* renamed from: L */
    private void m46735L(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46464Q1(((Integer) jVar.mo22156a("notificationId")).intValue());
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: M */
    private void m46736M(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46555p2(this);
        C8338d3.m46506d1(this.f35621a);
        C8338d3.m46539l2((String) jVar.mo22156a("appId"));
        mo27794P();
        if (!this.f35614g || C8338d3.m46458O2()) {
            m46745t();
        } else {
            this.f35615h = true;
        }
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: N */
    private void m46737N(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46543m2((String) jVar.mo22156a("email"), (String) jVar.mo22156a("emailAuthHashToken"), new C8427b(this.f35623c, this.f35622b, dVar, "setEmail"));
    }

    /* renamed from: O */
    private void m46738O(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("externalUserId");
        String str2 = (String) jVar.mo22156a("authHashToken");
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        C8338d3.m46551o2(str, str2, new C8428c(this.f35623c, this.f35622b, dVar, "setExternalUserId"));
    }

    /* renamed from: Q */
    private void m46739Q(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("language");
        if (str != null && str.length() == 0) {
            str = null;
        }
        C8338d3.m46567s2(str, new C8433h(this.f35623c, this.f35622b, dVar, "setLanguage"));
    }

    /* renamed from: R */
    private void m46740R(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46575u2(((Boolean) jVar.f31000b).booleanValue());
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: S */
    private void m46741S(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46579v2(((Integer) jVar.mo22156a("console")).intValue(), ((Integer) jVar.mo22156a("visual")).intValue());
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: T */
    private void m46742T(C6555j jVar, C6556k.C6561d dVar) {
        boolean booleanValue = ((Boolean) jVar.mo22156a("required")).booleanValue();
        this.f35614g = booleanValue;
        C8338d3.m46402A2(booleanValue);
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: U */
    private void m46743U(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46406B2((String) jVar.mo22156a("smsNumber"), (String) jVar.mo22156a("smsAuthHashToken"), new C8432g(this.f35623c, this.f35622b, dVar, "setSMSNumber"));
    }

    /* renamed from: V */
    private void m46744V(C6555j jVar, C6556k.C6561d dVar) {
        mo27801r(dVar, Boolean.valueOf(C8338d3.m46458O2()));
    }

    /* renamed from: t */
    private void m46745t() {
        C8338d3.m46473T1(this);
        C8338d3.m46453N1(this);
        C8338d3.m46470S1(this);
        C8338d3.m46467R1(this);
        C8338d3.m46407C(this);
        C8338d3.m46584x(this);
        C8338d3.m46403B(this);
        C8338d3.m46399A(this);
        C8338d3.m46591y2(this);
    }

    /* renamed from: u */
    private void m46746u(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46435J();
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: v */
    private void m46747v(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("notificationId");
        boolean booleanValue = ((Boolean) jVar.mo22156a("shouldDisplay")).booleanValue();
        C8295a2 a2Var = this.f35616i.get(str);
        if (a2Var == null) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
            C8338d3.m46594z1(r0Var, "Could not find notification completion block with id: " + str);
        } else if (booleanValue) {
            a2Var.mo27590b(a2Var.mo27591c());
        } else {
            a2Var.mo27590b((C8575q1) null);
        }
    }

    /* renamed from: w */
    private void m46748w(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46425G1(((Boolean) jVar.mo22156a("granted")).booleanValue());
        if (this.f35615h) {
            this.f35615h = false;
            m46745t();
        }
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: x */
    private void m46749x(C6555j jVar, C6556k.C6561d dVar) {
        C8338d3.m46447M(((Boolean) jVar.f31000b).booleanValue());
        mo27801r(dVar, (Object) null);
    }

    /* renamed from: y */
    private void m46750y(C6556k.C6561d dVar) {
        mo27801r(dVar, C8443f.m46789b(C8338d3.m46513f0()));
    }

    /* renamed from: z */
    private void m46751z(Context context, C6539c cVar) {
        this.f35621a = context;
        this.f35623c = cVar;
        C8338d3.f35418Q = "flutter";
        this.f35615h = false;
        C6556k kVar = new C6556k(cVar, "OneSignal");
        this.f35622b = kVar;
        kVar.mo22161e(this);
        C8445g.m46807v(cVar);
        C8441d.m46781v(cVar);
        C8442e.m46784t(cVar);
    }

    /* renamed from: P */
    public void mo27794P() {
        C8338d3.m46559q2(new C8426a());
    }

    /* renamed from: k */
    public void mo27749k(C8646x0 x0Var) {
        if (!this.f35612e) {
            this.f35611d = x0Var;
        } else {
            mo27798o("OneSignal#handleClickedInAppMessage", C8443f.m46792e(x0Var));
        }
    }

    /* renamed from: l */
    public void mo27756l(C8295a2 a2Var) {
        if (!this.f35613f) {
            a2Var.mo27590b(a2Var.mo27591c());
            return;
        }
        this.f35616i.put(a2Var.mo27591c().mo28137t(), a2Var);
        try {
            mo27798o("OneSignal#handleNotificationWillShowInForeground", C8443f.m46798k(a2Var));
        } catch (JSONException e) {
            e.getStackTrace();
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
            C8338d3.m46594z1(r0Var, "Encountered an error attempting to convert OSNotificationReceivedEvent object to hash map: " + e.getMessage());
        }
    }

    /* renamed from: m */
    public void mo27754m(C8685z1 z1Var) {
        try {
            mo27798o("OneSignal#handleOpenedNotification", C8443f.m46797j(z1Var));
        } catch (JSONException e) {
            e.getStackTrace();
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
            C8338d3.m46594z1(r0Var, "Encountered an error attempting to convert OSNotificationOpenResult object to hash map: " + e.getMessage());
        }
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.f35621a = cVar.getActivity();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m46751z(bVar.mo37292a(), bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        m46729F();
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.contentEquals("OneSignal#setAppId")) {
            m46736M(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setLogLevel")) {
            m46741S(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#log")) {
            m46730G(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#requiresUserPrivacyConsent")) {
            mo27801r(dVar, Boolean.valueOf(C8338d3.m46482W1()));
        } else if (jVar.f30999a.contentEquals("OneSignal#setRequiresUserPrivacyConsent")) {
            m46742T(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#consentGranted")) {
            m46748w(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#userProvidedPrivacyConsent")) {
            m46744V(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#promptPermission")) {
            m46733J(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#getDeviceState")) {
            m46750y(dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#disablePush")) {
            m46749x(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#postNotification")) {
            m46731H(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#promptLocation")) {
            m46732I(dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setLocationShared")) {
            m46740R(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setEmail")) {
            m46737N(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#logoutEmail")) {
            m46727D(dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setSMSNumber")) {
            m46743U(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#logoutSMSNumber")) {
            m46728E(dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setExternalUserId")) {
            m46738O(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#removeExternalUserId")) {
            m46734K(dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#setLanguage")) {
            m46739Q(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#initNotificationOpenedHandlerParams")) {
            m46725B();
        } else if (jVar.f30999a.contentEquals("OneSignal#initInAppMessageClickedHandlerParams")) {
            m46724A();
        } else if (jVar.f30999a.contentEquals("OneSignal#initNotificationWillShowInForegroundHandlerParams")) {
            m46726C();
        } else if (jVar.f30999a.contentEquals("OneSignal#completeNotification")) {
            m46747v(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#clearOneSignalNotifications")) {
            m46746u(jVar, dVar);
        } else if (jVar.f30999a.contentEquals("OneSignal#removeNotification")) {
            m46735L(jVar, dVar);
        } else {
            mo27800q(dVar);
        }
    }

    public void onOSEmailSubscriptionChanged(C8622u0 u0Var) {
        mo27798o("OneSignal#emailSubscriptionChanged", C8443f.m46790c(u0Var));
    }

    public void onOSPermissionChanged(C8449g2 g2Var) {
        mo27798o("OneSignal#permissionChanged", C8443f.m46801n(g2Var));
    }

    public void onOSSubscriptionChanged(C8579q2 q2Var) {
        mo27798o("OneSignal#subscriptionChanged", C8443f.m46803p(q2Var));
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
    }
}
