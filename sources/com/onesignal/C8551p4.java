package com.onesignal;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.C8289a;
import com.onesignal.C8338d3;
import com.onesignal.C8651y;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.p4 */
/* compiled from: WebViewManager */
class C8551p4 extends C8289a.C8291b {

    /* renamed from: k */
    private static final String f35871k = "com.onesignal.p4";

    /* renamed from: l */
    private static final int f35872l = C8313b3.m46320b(24);

    /* renamed from: m */
    protected static C8551p4 f35873m = null;

    /* renamed from: a */
    private final Object f35874a = new C8553b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8325c3 f35875b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8651y f35876c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Activity f35877d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8323c1 f35878e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8662y0 f35879f;

    /* renamed from: g */
    private String f35880g = null;

    /* renamed from: h */
    private Integer f35881h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f35882i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f35883j = false;

    /* renamed from: com.onesignal.p4$a */
    /* compiled from: WebViewManager */
    static /* synthetic */ class C8552a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35884a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.p4$m[] r0 = com.onesignal.C8551p4.C8565m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35884a = r0
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35884a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8551p4.C8552a.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.p4$b */
    /* compiled from: WebViewManager */
    class C8553b {
        C8553b() {
        }
    }

    /* renamed from: com.onesignal.p4$c */
    /* compiled from: WebViewManager */
    class C8554c implements C8564l {

        /* renamed from: a */
        final /* synthetic */ Activity f35886a;

        /* renamed from: b */
        final /* synthetic */ C8323c1 f35887b;

        /* renamed from: c */
        final /* synthetic */ C8662y0 f35888c;

        C8554c(Activity activity, C8323c1 c1Var, C8662y0 y0Var) {
            this.f35886a = activity;
            this.f35887b = c1Var;
            this.f35888c = y0Var;
        }

        /* renamed from: a */
        public void mo28072a() {
            C8551p4.f35873m = null;
            C8551p4.m47374B(this.f35886a, this.f35887b, this.f35888c);
        }
    }

    /* renamed from: com.onesignal.p4$d */
    /* compiled from: WebViewManager */
    class C8555d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8323c1 f35889a;

        /* renamed from: b */
        final /* synthetic */ C8662y0 f35890b;

        C8555d(C8323c1 c1Var, C8662y0 y0Var) {
            this.f35889a = c1Var;
            this.f35890b = y0Var;
        }

        public void run() {
            C8551p4.m47381I(this.f35889a, this.f35890b);
        }
    }

    /* renamed from: com.onesignal.p4$e */
    /* compiled from: WebViewManager */
    class C8556e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f35892b;

        /* renamed from: c */
        final /* synthetic */ String f35893c;

        /* renamed from: d */
        final /* synthetic */ C8662y0 f35894d;

        C8556e(Activity activity, String str, C8662y0 y0Var) {
            this.f35892b = activity;
            this.f35893c = str;
            this.f35894d = y0Var;
        }

        public void run() {
            try {
                C8551p4.this.m47380H(this.f35892b, this.f35893c, this.f35894d.mo28330g());
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("No WebView installed")) {
                    throw e;
                }
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error setting up WebView: ", e);
            }
        }
    }

    /* renamed from: com.onesignal.p4$f */
    /* compiled from: WebViewManager */
    class C8557f implements Runnable {
        C8557f() {
        }

        public void run() {
            int[] c = C8313b3.m46321c(C8551p4.this.f35877d);
            C8551p4.this.f35875b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c[0]), Integer.valueOf(c[1]), Integer.valueOf(c[2]), Integer.valueOf(c[3])})}), (ValueCallback) null);
        }
    }

    /* renamed from: com.onesignal.p4$g */
    /* compiled from: WebViewManager */
    class C8558g implements Runnable {

        /* renamed from: com.onesignal.p4$g$a */
        /* compiled from: WebViewManager */
        class C8559a implements ValueCallback<String> {
            C8559a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                try {
                    C8551p4 p4Var = C8551p4.this;
                    C8551p4.this.m47382J(Integer.valueOf(p4Var.m47375C(p4Var.f35877d, new JSONObject(str))));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        C8558g() {
        }

        public void run() {
            C8551p4 p4Var = C8551p4.this;
            p4Var.m47379G(p4Var.f35877d);
            if (C8551p4.this.f35879f.mo28330g()) {
                C8551p4.this.m47383K();
            }
            C8551p4.this.f35875b.evaluateJavascript("getPageMetaData()", new C8559a());
        }
    }

    /* renamed from: com.onesignal.p4$h */
    /* compiled from: WebViewManager */
    class C8560h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f35898a;

        /* renamed from: b */
        final /* synthetic */ String f35899b;

        C8560h(Activity activity, String str) {
            this.f35898a = activity;
            this.f35899b = str;
        }

        public void run() {
            C8551p4.this.m47379G(this.f35898a);
            C8551p4.this.f35875b.loadData(this.f35899b, "text/html; charset=utf-8", "base64");
        }
    }

    /* renamed from: com.onesignal.p4$i */
    /* compiled from: WebViewManager */
    class C8561i implements C8651y.C8661j {
        C8561i() {
        }

        /* renamed from: a */
        public void mo28080a() {
            C8338d3.m46541m0().mo27622b0(C8551p4.this.f35878e);
            C8551p4.this.m47376D();
        }

        /* renamed from: b */
        public void mo28081b() {
            C8338d3.m46541m0().mo28346h0(C8551p4.this.f35878e);
        }

        /* renamed from: c */
        public void mo28082c() {
            C8338d3.m46541m0().mo28347i0(C8551p4.this.f35878e);
        }
    }

    /* renamed from: com.onesignal.p4$j */
    /* compiled from: WebViewManager */
    class C8562j implements C8564l {

        /* renamed from: a */
        final /* synthetic */ C8564l f35902a;

        C8562j(C8564l lVar) {
            this.f35902a = lVar;
        }

        /* renamed from: a */
        public void mo28072a() {
            boolean unused = C8551p4.this.f35882i = false;
            C8551p4.this.m47378F((C8651y) null);
            C8564l lVar = this.f35902a;
            if (lVar != null) {
                lVar.mo28072a();
            }
        }
    }

    /* renamed from: com.onesignal.p4$k */
    /* compiled from: WebViewManager */
    class C8563k {
        C8563k() {
        }

        /* renamed from: a */
        private C8565m m47416a(JSONObject jSONObject) {
            C8565m mVar = C8565m.FULL_SCREEN;
            try {
                if (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) {
                    return mVar;
                }
                return C8565m.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e) {
                e.printStackTrace();
                return mVar;
            }
        }

        /* renamed from: b */
        private boolean m47417b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        /* renamed from: c */
        private int m47418c(JSONObject jSONObject) {
            try {
                C8551p4 p4Var = C8551p4.this;
                return p4Var.m47375C(p4Var.f35877d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        /* renamed from: d */
        private void m47419d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString("id", (String) null);
            boolean unused = C8551p4.this.f35883j = jSONObject2.getBoolean("close");
            if (C8551p4.this.f35878e.f35376k) {
                C8338d3.m46541m0().mo27624e0(C8551p4.this.f35878e, jSONObject2);
            } else if (optString != null) {
                C8338d3.m46541m0().mo27623d0(C8551p4.this.f35878e, jSONObject2);
            }
            if (C8551p4.this.f35883j) {
                C8551p4.this.mo28071w((C8564l) null);
            }
        }

        /* renamed from: e */
        private void m47420e(JSONObject jSONObject) throws JSONException {
            C8338d3.m46541m0().mo28349k0(C8551p4.this.f35878e, jSONObject);
        }

        /* renamed from: f */
        private void m47421f(JSONObject jSONObject) {
            C8565m a = m47416a(jSONObject);
            int c = a == C8565m.FULL_SCREEN ? -1 : m47418c(jSONObject);
            boolean b = m47417b(jSONObject);
            C8551p4.this.f35879f.mo28332i(a);
            C8551p4.this.f35879f.mo28333j(c);
            C8551p4.this.m47403v(b);
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                char c = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals("page_change")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    m47421f(jSONObject);
                } else if (c != 1) {
                    if (c == 3) {
                        m47420e(jSONObject);
                    }
                } else if (!C8551p4.this.f35876c.mo28307O()) {
                    m47419d(jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onesignal.p4$l */
    /* compiled from: WebViewManager */
    interface C8564l {
        /* renamed from: a */
        void mo28072a();
    }

    /* renamed from: com.onesignal.p4$m */
    /* compiled from: WebViewManager */
    enum C8565m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo28084a() {
            int i = C8552a.f35884a[ordinal()];
            return i == 1 || i == 2;
        }
    }

    protected C8551p4(C8323c1 c1Var, Activity activity, C8662y0 y0Var) {
        this.f35878e = c1Var;
        this.f35877d = activity;
        this.f35879f = y0Var;
    }

    /* renamed from: A */
    private int m47373A(Activity activity) {
        return C8313b3.m46324f(activity) - (this.f35879f.mo28330g() ? 0 : f35872l * 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static void m47374B(Activity activity, C8323c1 c1Var, C8662y0 y0Var) {
        if (y0Var.mo28330g()) {
            m47377E(y0Var, activity);
        }
        try {
            String encodeToString = Base64.encodeToString(y0Var.mo28324a().getBytes("UTF-8"), 2);
            C8551p4 p4Var = new C8551p4(c1Var, activity, y0Var);
            f35873m = p4Var;
            OSUtils.m46187T(new C8556e(activity, encodeToString, y0Var));
        } catch (UnsupportedEncodingException e) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Catch on initInAppMessage: ", e);
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public int m47375C(Activity activity, JSONObject jSONObject) {
        try {
            int b = C8313b3.m46320b(jSONObject.getJSONObject("rect").getInt("height"));
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var, "getPageHeightData:pxHeight: " + b);
            int A = m47373A(activity);
            if (b <= A) {
                return b;
            }
            C8338d3.m46492a(r0Var, "getPageHeightData:pxHeight is over screen max: " + A);
            return A;
        } catch (JSONException e) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m47376D() {
        C8289a b = C8301b.m46281b();
        if (b != null) {
            b.mo27584q(f35871k + this.f35878e.f36098a);
        }
    }

    /* renamed from: E */
    private static void m47377E(C8662y0 y0Var, Activity activity) {
        String a = y0Var.mo28324a();
        int[] c = C8313b3.m46321c(activity);
        String format = String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c[0]), Integer.valueOf(c[1]), Integer.valueOf(c[2]), Integer.valueOf(c[3])})});
        y0Var.mo28331h(a + format);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m47378F(C8651y yVar) {
        synchronized (this.f35874a) {
            this.f35876c = yVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m47379G(Activity activity) {
        this.f35875b.layout(0, 0, m47406z(activity), m47373A(activity));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m47380H(Activity activity, String str, boolean z) {
        m47405y();
        C8325c3 c3Var = new C8325c3(activity);
        this.f35875b = c3Var;
        c3Var.setOverScrollMode(2);
        this.f35875b.setVerticalScrollBarEnabled(false);
        this.f35875b.setHorizontalScrollBarEnabled(false);
        this.f35875b.getSettings().setJavaScriptEnabled(true);
        this.f35875b.addJavascriptInterface(new C8563k(), "OSAndroid");
        if (z) {
            this.f35875b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f35875b.setFitsSystemWindows(false);
            }
        }
        m47401t(this.f35875b);
        C8313b3.m46319a(activity, new C8560h(activity, str));
    }

    /* renamed from: I */
    static void m47381I(C8323c1 c1Var, C8662y0 y0Var) {
        Activity Y = C8338d3.m46486Y();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "in app message showMessageContent on currentActivity: " + Y);
        if (Y != null) {
            C8551p4 p4Var = f35873m;
            if (p4Var == null || !c1Var.f35376k) {
                m47374B(Y, c1Var, y0Var);
            } else {
                p4Var.mo28071w(new C8554c(Y, c1Var, y0Var));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new C8555d(c1Var, y0Var), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m47382J(Integer num) {
        synchronized (this.f35874a) {
            if (this.f35876c == null) {
                C8338d3.m46492a(C8338d3.C8384r0.WARN, "No messageView found to update a with a new height.");
                return;
            }
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "In app message, showing first one with height: " + num);
            this.f35876c.mo28310U(this.f35875b);
            if (num != null) {
                this.f35881h = num;
                this.f35876c.mo28313Z(num.intValue());
            }
            this.f35876c.mo28312X(this.f35877d);
            this.f35876c.mo28304B();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m47383K() {
        OSUtils.m46187T(new C8557f());
    }

    /* renamed from: t */
    private void m47401t(WebView webView) {
        if (Build.VERSION.SDK_INT == 19) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: u */
    private void m47402u() {
        C8651y yVar = this.f35876c;
        if (yVar != null) {
            if (yVar.mo28306M() != C8565m.FULL_SCREEN || this.f35879f.mo28330g()) {
                C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "In app message new activity, calculate height and show ");
                C8313b3.m46319a(this.f35877d, new C8558g());
                return;
            }
            m47382J((Integer) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m47403v(boolean z) {
        this.f35881h = Integer.valueOf(this.f35879f.mo28327d());
        m47378F(new C8651y(this.f35875b, this.f35879f, z));
        this.f35876c.mo28309R(new C8561i());
        C8289a b = C8301b.m46281b();
        if (b != null) {
            b.mo27574b(f35871k + this.f35878e.f36098a, this);
        }
    }

    /* renamed from: x */
    static void m47404x() {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + f35873m);
        C8551p4 p4Var = f35873m;
        if (p4Var != null) {
            p4Var.mo28071w((C8564l) null);
        }
    }

    /* renamed from: y */
    private static void m47405y() {
        if (Build.VERSION.SDK_INT >= 19 && C8338d3.m46423G(C8338d3.C8384r0.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: z */
    private int m47406z(Activity activity) {
        if (this.f35879f.mo28330g()) {
            return C8313b3.m46323e(activity);
        }
        return C8313b3.m46328j(activity) - (f35872l * 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27565a(Activity activity) {
        String str = this.f35880g;
        this.f35877d = activity;
        this.f35880g = activity.getLocalClassName();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "In app message activity available currentActivityName: " + this.f35880g + " lastActivityName: " + str);
        if (str == null) {
            m47382J((Integer) null);
        } else if (str.equals(this.f35880g)) {
            m47402u();
        } else if (!this.f35883j) {
            C8651y yVar = this.f35876c;
            if (yVar != null) {
                yVar.mo28308P();
            }
            m47382J(this.f35881h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27587b(Activity activity) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "In app message activity stopped, cleaning views, currentActivityName: " + this.f35880g + "\nactivity: " + this.f35877d + "\nmessageView: " + this.f35876c);
        if (this.f35876c != null && activity.getLocalClassName().equals(this.f35880g)) {
            this.f35876c.mo28308P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo28071w(C8564l lVar) {
        C8651y yVar = this.f35876c;
        if (yVar != null && !this.f35882i) {
            if (!(this.f35878e == null || yVar == null)) {
                C8338d3.m46541m0().mo28347i0(this.f35878e);
            }
            this.f35876c.mo28305K(new C8562j(lVar));
            this.f35882i = true;
        } else if (lVar != null) {
            lVar.mo28072a();
        }
    }
}
