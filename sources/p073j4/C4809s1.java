package p073j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2895ts;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.rl0;
import com.google.android.gms.internal.ads.w00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4699m;

/* renamed from: j4.s1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4809s1 implements C4800p1 {

    /* renamed from: A */
    private boolean f25494A = false;

    /* renamed from: B */
    private String f25495B = "";

    /* renamed from: C */
    private int f25496C = -1;

    /* renamed from: D */
    private int f25497D = -1;

    /* renamed from: E */
    private long f25498E = 0;

    /* renamed from: a */
    private final Object f25499a = new Object();

    /* renamed from: b */
    private boolean f25500b;

    /* renamed from: c */
    private final List f25501c = new ArrayList();

    /* renamed from: d */
    private lf3 f25502d;

    /* renamed from: e */
    private C2895ts f25503e = null;

    /* renamed from: f */
    private SharedPreferences f25504f;

    /* renamed from: g */
    private SharedPreferences.Editor f25505g;

    /* renamed from: h */
    private boolean f25506h = true;

    /* renamed from: i */
    private String f25507i;

    /* renamed from: j */
    private String f25508j;

    /* renamed from: k */
    private boolean f25509k = true;

    /* renamed from: l */
    private String f25510l = "-1";

    /* renamed from: m */
    private String f25511m = "-1";

    /* renamed from: n */
    private String f25512n = "-1";

    /* renamed from: o */
    private int f25513o = -1;

    /* renamed from: p */
    private rl0 f25514p = new rl0("", 0);

    /* renamed from: q */
    private long f25515q = 0;

    /* renamed from: r */
    private long f25516r = 0;

    /* renamed from: s */
    private int f25517s = -1;

    /* renamed from: t */
    private int f25518t = 0;

    /* renamed from: u */
    private Set f25519u = Collections.emptySet();

    /* renamed from: v */
    private JSONObject f25520v = new JSONObject();

    /* renamed from: w */
    private boolean f25521w = true;

    /* renamed from: x */
    private boolean f25522x = true;

    /* renamed from: y */
    private String f25523y = null;

    /* renamed from: z */
    private String f25524z = "";

    /* renamed from: E */
    private final void m30744E() {
        lf3 lf3 = this.f25502d;
        if (lf3 != null && !lf3.isDone()) {
            try {
                this.f25502d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                pm0.m18668h("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                pm0.m18665e("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: F */
    private final void m30745F() {
        dn0.f8325a.execute(new C4806r1(this));
    }

    /* renamed from: A */
    public final void mo18481A(String str, String str2, boolean z) {
        m30744E();
        synchronized (this.f25499a) {
            JSONArray optJSONArray = this.f25520v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i;
                        } else {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C4409t.m29310b().mo18370a());
                optJSONArray.put(length, jSONObject);
                this.f25520v.put(str, optJSONArray);
            } catch (JSONException e) {
                pm0.m18668h("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f25505g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f25520v.toString());
                this.f25505g.apply();
            }
            m30745F();
        }
    }

    /* renamed from: B */
    public final void mo18482B(boolean z) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25521w != z) {
                this.f25521w = z;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: C */
    public final void mo18483C(String str) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
            m30744E();
            synchronized (this.f25499a) {
                if (!this.f25524z.equals(str)) {
                    this.f25524z = str;
                    SharedPreferences.Editor editor = this.f25505g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f25505g.apply();
                    }
                    m30745F();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void mo18530D(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f25499a) {
            this.f25504f = sharedPreferences;
            this.f25505g = edit;
            if (C4699m.m30416g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f25506h = this.f25504f.getBoolean("use_https", this.f25506h);
            this.f25521w = this.f25504f.getBoolean("content_url_opted_out", this.f25521w);
            this.f25507i = this.f25504f.getString("content_url_hashes", this.f25507i);
            this.f25509k = this.f25504f.getBoolean("gad_idless", this.f25509k);
            this.f25522x = this.f25504f.getBoolean("content_vertical_opted_out", this.f25522x);
            this.f25508j = this.f25504f.getString("content_vertical_hashes", this.f25508j);
            this.f25518t = this.f25504f.getInt("version_code", this.f25518t);
            this.f25514p = new rl0(this.f25504f.getString("app_settings_json", this.f25514p.mo13843c()), this.f25504f.getLong("app_settings_last_update_ms", this.f25514p.mo13841a()));
            this.f25515q = this.f25504f.getLong("app_last_background_time_ms", this.f25515q);
            this.f25517s = this.f25504f.getInt("request_in_session_count", this.f25517s);
            this.f25516r = this.f25504f.getLong("first_ad_req_time_ms", this.f25516r);
            this.f25519u = this.f25504f.getStringSet("never_pool_slots", this.f25519u);
            this.f25523y = this.f25504f.getString("display_cutout", this.f25523y);
            this.f25496C = this.f25504f.getInt("app_measurement_npa", this.f25496C);
            this.f25497D = this.f25504f.getInt("sd_app_measure_npa", this.f25497D);
            this.f25498E = this.f25504f.getLong("sd_app_measure_npa_ts", this.f25498E);
            this.f25524z = this.f25504f.getString("inspector_info", this.f25524z);
            this.f25494A = this.f25504f.getBoolean("linked_device", this.f25494A);
            this.f25495B = this.f25504f.getString("linked_ad_unit", this.f25495B);
            this.f25510l = this.f25504f.getString("IABTCF_gdprApplies", this.f25510l);
            this.f25512n = this.f25504f.getString("IABTCF_PurposeConsents", this.f25512n);
            this.f25511m = this.f25504f.getString("IABTCF_TCString", this.f25511m);
            this.f25513o = this.f25504f.getInt("gad_has_consent_for_cookies", this.f25513o);
            try {
                this.f25520v = new JSONObject(this.f25504f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                pm0.m18668h("Could not convert native advanced settings to json object", e);
            }
            m30745F();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18484J(java.lang.String r6) {
        /*
            r5 = this;
            r5.m30744E()
            java.lang.Object r0 = r5.f25499a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0050 }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 2
            goto L_0x003b
        L_0x003a:
            r6 = -1
        L_0x003b:
            if (r6 == 0) goto L_0x004c
            if (r6 == r4) goto L_0x0048
            if (r6 == r3) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            r6 = 0
            return r6
        L_0x0044:
            java.lang.String r6 = r5.f25512n     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0048:
            java.lang.String r6 = r5.f25511m     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x004c:
            java.lang.String r6 = r5.f25510l     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0050:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4809s1.mo18484J(java.lang.String):java.lang.String");
    }

    /* renamed from: T */
    public final long mo18485T() {
        long j;
        m30744E();
        synchronized (this.f25499a) {
            j = this.f25498E;
        }
        return j;
    }

    /* renamed from: U */
    public final rl0 mo18486U() {
        rl0 rl0;
        m30744E();
        synchronized (this.f25499a) {
            rl0 = this.f25514p;
        }
        return rl0;
    }

    /* renamed from: V */
    public final rl0 mo18487V() {
        rl0 rl0;
        synchronized (this.f25499a) {
            rl0 = this.f25514p;
        }
        return rl0;
    }

    /* renamed from: W */
    public final String mo18488W() {
        String str;
        m30744E();
        synchronized (this.f25499a) {
            str = this.f25507i;
        }
        return str;
    }

    /* renamed from: X */
    public final String mo18489X() {
        String str;
        m30744E();
        synchronized (this.f25499a) {
            str = this.f25508j;
        }
        return str;
    }

    /* renamed from: Y */
    public final String mo18490Y() {
        String str;
        m30744E();
        synchronized (this.f25499a) {
            str = this.f25524z;
        }
        return str;
    }

    /* renamed from: Z */
    public final String mo18491Z() {
        String str;
        m30744E();
        synchronized (this.f25499a) {
            str = this.f25495B;
        }
        return str;
    }

    /* renamed from: a */
    public final long mo18492a() {
        long j;
        m30744E();
        synchronized (this.f25499a) {
            j = this.f25516r;
        }
        return j;
    }

    /* renamed from: b */
    public final long mo18493b() {
        long j;
        m30744E();
        synchronized (this.f25499a) {
            j = this.f25515q;
        }
        return j;
    }

    /* renamed from: b0 */
    public final JSONObject mo18494b0() {
        JSONObject jSONObject;
        m30744E();
        synchronized (this.f25499a) {
            jSONObject = this.f25520v;
        }
        return jSONObject;
    }

    /* renamed from: c */
    public final C2895ts mo18495c() {
        if (!this.f25500b) {
            return null;
        }
        if ((mo18520y() && mo18508m()) || !((Boolean) w00.f19399b.mo13438e()).booleanValue()) {
            return null;
        }
        synchronized (this.f25499a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f25503e == null) {
                this.f25503e = new C2895ts();
            }
            this.f25503e.mo14372e();
            pm0.m18666f("start fetching content...");
            C2895ts tsVar = this.f25503e;
            return tsVar;
        }
    }

    /* renamed from: c0 */
    public final String mo18496c0() {
        String str;
        m30744E();
        synchronized (this.f25499a) {
            str = this.f25523y;
        }
        return str;
    }

    /* renamed from: d */
    public final int mo18497d() {
        int i;
        m30744E();
        synchronized (this.f25499a) {
            i = this.f25513o;
        }
        return i;
    }

    /* renamed from: d0 */
    public final void mo18498d0() {
        m30744E();
        synchronized (this.f25499a) {
            this.f25520v = new JSONObject();
            SharedPreferences.Editor editor = this.f25505g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f25505g.apply();
            }
            m30745F();
        }
    }

    /* renamed from: e */
    public final int mo18499e() {
        int i;
        m30744E();
        synchronized (this.f25499a) {
            i = this.f25517s;
        }
        return i;
    }

    /* renamed from: f */
    public final void mo18500f(String str) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
            m30744E();
            synchronized (this.f25499a) {
                if (!this.f25495B.equals(str)) {
                    this.f25495B = str;
                    SharedPreferences.Editor editor = this.f25505g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f25505g.apply();
                    }
                    m30745F();
                }
            }
        }
    }

    /* renamed from: f0 */
    public final boolean mo18501f0() {
        boolean z;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14668r0)).booleanValue()) {
            return false;
        }
        m30744E();
        synchronized (this.f25499a) {
            z = this.f25509k;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo18502g(int i) {
        m30744E();
        synchronized (this.f25499a) {
            this.f25513o = i;
            SharedPreferences.Editor editor = this.f25505g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.f25505g.apply();
            }
            m30745F();
        }
    }

    /* renamed from: h */
    public final void mo18503h(Runnable runnable) {
        this.f25501c.add(runnable);
    }

    /* renamed from: i */
    public final boolean mo18504i() {
        boolean z;
        m30744E();
        synchronized (this.f25499a) {
            z = this.f25494A;
        }
        return z;
    }

    /* renamed from: j */
    public final void mo18505j(int i) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25497D != i) {
                this.f25497D = i;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: k */
    public final void mo18506k(int i) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25518t != i) {
                this.f25518t = i;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: l */
    public final void mo18507l(long j) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25498E != j) {
                this.f25498E = j;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo18508m() {
        boolean z;
        m30744E();
        synchronized (this.f25499a) {
            z = this.f25522x;
        }
        return z;
    }

    /* renamed from: n */
    public final void mo18509n(boolean z) {
        m30744E();
        synchronized (this.f25499a) {
            if (z != this.f25509k) {
                this.f25509k = z;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: o */
    public final void mo18510o(String str) {
        m30744E();
        synchronized (this.f25499a) {
            if (!TextUtils.equals(this.f25523y, str)) {
                this.f25523y = str;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: p */
    public final void mo18511p(boolean z) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
            m30744E();
            synchronized (this.f25499a) {
                if (this.f25494A != z) {
                    this.f25494A = z;
                    SharedPreferences.Editor editor = this.f25505g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f25505g.apply();
                    }
                    m30745F();
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo18512q(String str) {
        m30744E();
        synchronized (this.f25499a) {
            if (!str.equals(this.f25507i)) {
                this.f25507i = str;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: r */
    public final void mo18513r(long j) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25515q != j) {
                this.f25515q = j;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: s */
    public final void mo18514s(String str) {
        m30744E();
        synchronized (this.f25499a) {
            long a = C4409t.m29310b().mo18370a();
            if (str != null) {
                if (!str.equals(this.f25514p.mo13843c())) {
                    this.f25514p = new rl0(str, a);
                    SharedPreferences.Editor editor = this.f25505g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f25505g.putLong("app_settings_last_update_ms", a);
                        this.f25505g.apply();
                    }
                    m30745F();
                    for (Runnable run : this.f25501c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f25514p.mo13847g(a);
        }
    }

    /* renamed from: t */
    public final void mo18515t(int i) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25517s != i) {
                this.f25517s = i;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: u */
    public final void mo18516u(Context context) {
        synchronized (this.f25499a) {
            if (this.f25504f == null) {
                this.f25502d = dn0.f8325a.mo12323G(new C4803q1(this, context, "admob"));
                this.f25500b = true;
            }
        }
    }

    /* renamed from: v */
    public final void mo18517v(String str) {
        m30744E();
        synchronized (this.f25499a) {
            if (!str.equals(this.f25508j)) {
                this.f25508j = str;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* renamed from: w */
    public final void mo18518w(boolean z) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25522x != z) {
                this.f25522x = z;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18519x(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.m30744E()
            java.lang.Object r0 = r5.f25499a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x006c }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0046
            if (r1 == r3) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x0043:
            r5.f25512n = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0046:
            r5.f25511m = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0049:
            r5.f25510l = r7     // Catch:{ all -> 0x006c }
        L_0x004b:
            android.content.SharedPreferences$Editor r1 = r5.f25505g     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x005d
            android.content.SharedPreferences$Editor r7 = r5.f25505g     // Catch:{ all -> 0x006c }
            r7.remove(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0062
        L_0x005d:
            android.content.SharedPreferences$Editor r1 = r5.f25505g     // Catch:{ all -> 0x006c }
            r1.putString(r6, r7)     // Catch:{ all -> 0x006c }
        L_0x0062:
            android.content.SharedPreferences$Editor r6 = r5.f25505g     // Catch:{ all -> 0x006c }
            r6.apply()     // Catch:{ all -> 0x006c }
        L_0x0067:
            r5.m30745F()     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4809s1.mo18519x(java.lang.String, java.lang.String):void");
    }

    /* renamed from: y */
    public final boolean mo18520y() {
        boolean z;
        m30744E();
        synchronized (this.f25499a) {
            z = this.f25521w;
        }
        return z;
    }

    /* renamed from: z */
    public final void mo18521z(long j) {
        m30744E();
        synchronized (this.f25499a) {
            if (this.f25516r != j) {
                this.f25516r = j;
                SharedPreferences.Editor editor = this.f25505g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f25505g.apply();
                }
                m30745F();
            }
        }
    }

    public final int zza() {
        int i;
        m30744E();
        synchronized (this.f25499a) {
            i = this.f25518t;
        }
        return i;
    }
}
