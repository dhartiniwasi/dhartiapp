package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C8821a5;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.enums.AnonymizationLevel;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.startapp.b5 */
/* compiled from: Sta */
public class C8844b5 {

    /* renamed from: A */
    private static final String f36449A = "P3INS_PFK_LAST_EXPORT_TIME";

    /* renamed from: B */
    private static final String f36450B = "P3INS_PFK_QOE_MANAGER_ENABLED";

    /* renamed from: C */
    private static final String f36451C = "P3INS_PFK_REGISTRATION_TIMESTAMP";

    /* renamed from: D */
    private static final String f36452D = "P3INS_PFK_IS_ALREADY_REGISTERED";

    /* renamed from: E */
    private static final String f36453E = "P3INS_PFK_SEND_REGISTRATION_TIMESTAMP_ENABLED";

    /* renamed from: F */
    private static final String f36454F = "P3INS_PFK_UPLOAD_EXTRA";

    /* renamed from: G */
    private static final String f36455G = "P3INS_PFK_VOWIFI_TEST_MANAGER_ENABLED";

    /* renamed from: H */
    private static final String f36456H = "P3INS_PFK_CT_CRITERIA_SERVER_LIST";

    /* renamed from: I */
    private static final String f36457I = "P3INS_PFK_LTR_CRITERIA_SERVER_LIST";

    /* renamed from: J */
    private static final String f36458J = "P3INS_PFK_CDN_CT_SERVER_LIST";

    /* renamed from: K */
    private static final String f36459K = "P3INS_PFK_CDN_CT_CRITERIA";

    /* renamed from: L */
    private static final String f36460L = "P3INS_PFK_CDN_LTR_SERVER_LIST";

    /* renamed from: M */
    private static final String f36461M = "P3INS_PFK_CDN_LTR_CRITERIA";

    /* renamed from: N */
    private static final String f36462N = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_MODIFIED";

    /* renamed from: O */
    private static final String f36463O = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_CHECK";

    /* renamed from: P */
    private static final String f36464P = "P3INS_PFK_WIFI_SCAN_TIMESTAMP";

    /* renamed from: Q */
    private static final String f36465Q = "P3INS_PFK_WIFI_SCAN_ENABLED";

    /* renamed from: R */
    private static final String f36466R = "p3inspreferences";

    /* renamed from: b */
    private static final String f36467b = "p3ins_pfk_ul_params";

    /* renamed from: c */
    private static final String f36468c = "p3ins_pfk_ul_paramsetid";

    /* renamed from: d */
    private static final String f36469d = "p3ins_pfk_ul_allowed";

    /* renamed from: e */
    private static final String f36470e = "p3ins_pfk_db_retry";

    /* renamed from: f */
    private static final String f36471f = "p3ins_pfk_last_upload_time";

    /* renamed from: g */
    private static final String f36472g = "p3ins_pfk_guid";

    /* renamed from: h */
    private static final String f36473h = "P3INS_PFK_GUID_TIMESTAMP";

    /* renamed from: i */
    private static final String f36474i = "P3INS_PFK_CONNECTIVITY_TEST_ENABLED";

    /* renamed from: j */
    private static final String f36475j = "P3INS_PFK_CONNECTIVITY_KEEPALIVE_ENABLED";

    /* renamed from: k */
    private static final String f36476k = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_CHECK";

    /* renamed from: l */
    private static final String f36477l = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_MODIFIED";

    /* renamed from: m */
    private static final String f36478m = "P3INS_PFK_CONNECTIVITY_TEST_TIMESTAMP";

    /* renamed from: n */
    private static final String f36479n = "P3INS_PFK_APPUSAGE_SERVICE_ENABLED";

    /* renamed from: o */
    private static final String f36480o = "P3INS_PFK_APPUSAGE_LAST_SCREEN_SESSION_COUNTER";

    /* renamed from: p */
    private static final String f36481p = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_ENABLED";

    /* renamed from: q */
    private static final String f36482q = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_INTERVAL";

    /* renamed from: r */
    private static final String f36483r = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_LAST_TIMESTAMP";

    /* renamed from: s */
    private static final String f36484s = "P3INS_PFK_APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED";

    /* renamed from: t */
    private static final String f36485t = "P3INS_PFK_VOICEMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: u */
    private static final String f36486u = "P3INS_PFK_VOICE_SERVICE_ENABLED";

    /* renamed from: v */
    private static final String f36487v = "P3INS_PFK_MESSAGING_SERVICE_ENABLED";

    /* renamed from: w */
    private static final String f36488w = "P3INS_PFK_MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: x */
    private static final String f36489x = "P3INS_PFK_COVERAGE_SERVICE_ENABLED";

    /* renamed from: y */
    private static final String f36490y = "P3INS_PFK_COVERAGE_SERVICE_TRIGGER_PROVIDER_MODE";

    /* renamed from: z */
    private static final String f36491z = "P3INS_PFK_TRAFFIC_ANALYZER_ENABLED";

    /* renamed from: a */
    private SharedPreferences f36492a;

    /* renamed from: com.startapp.b5$a */
    /* compiled from: Sta */
    public class C8845a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f36493a;

        public C8845a(String str) {
            this.f36493a = str;
        }

        public void run() {
            C8821a5.C8822a d = C8821a5.m48256d();
            if (d != null) {
                d.mo29084a(this.f36493a);
            }
        }
    }

    public C8844b5(Context context) {
        this.f36492a = context.getSharedPreferences(f36466R, 0);
    }

    /* renamed from: O */
    private boolean m48316O() {
        return this.f36492a.getBoolean(f36452D, false);
    }

    /* renamed from: A */
    public boolean mo29131A() {
        return this.f36492a.getBoolean(f36487v, C8821a5.m48254b().MESSAGING_SERVICE_ENABLED());
    }

    /* renamed from: B */
    public boolean mo29132B() {
        return this.f36492a.getBoolean(f36450B, C8821a5.m48254b().QOE_MANAGER_ENABLED());
    }

    /* renamed from: C */
    public long mo29133C() {
        return this.f36492a.getLong(f36451C, 0);
    }

    /* renamed from: D */
    public boolean mo29134D() {
        return this.f36492a.getBoolean(f36453E, C8821a5.m48254b().SEND_REGISTRATION_TIMESTAMP_ENABLED());
    }

    /* renamed from: E */
    public boolean mo29135E() {
        return this.f36492a.getBoolean(f36491z, C8821a5.m48254b().TRAFFIC_ANALYZER_ENABLED());
    }

    /* renamed from: F */
    public long mo29136F() {
        return this.f36492a.getLong(f36477l, 0);
    }

    /* renamed from: G */
    public String mo29137G() {
        return this.f36492a.getString(f36454F, "");
    }

    /* renamed from: H */
    public String mo29138H() {
        return this.f36492a.getString(f36468c, "");
    }

    /* renamed from: I */
    public String mo29139I() {
        return this.f36492a.getString(f36467b, "");
    }

    /* renamed from: J */
    public long mo29140J() {
        return this.f36492a.getLong(f36470e, 0);
    }

    /* renamed from: K */
    public boolean mo29141K() {
        return this.f36492a.getBoolean(f36455G, C8821a5.m48254b().VOWIFI_TEST_MANAGER_ENABLED());
    }

    /* renamed from: L */
    public AnonymizationLevel mo29142L() {
        return m48317a(this.f36492a.getString(f36485t, C8821a5.m48254b().VOICEMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    /* renamed from: M */
    public boolean mo29143M() {
        return this.f36492a.getBoolean(f36486u, C8821a5.m48254b().VOICE_SERVICE_ENABLED());
    }

    /* renamed from: N */
    public boolean mo29144N() {
        return this.f36492a.getBoolean(f36465Q, C8821a5.m48254b().WIFI_SCAN_ENABLED());
    }

    /* renamed from: P */
    public boolean mo29145P() {
        return this.f36492a.getBoolean(f36469d, true);
    }

    /* renamed from: a */
    public void mo29147a(long j) {
        this.f36492a.edit().putLong(f36482q, j).commit();
    }

    /* renamed from: b */
    public boolean mo29153b() {
        return this.f36492a.getBoolean(f36484s, C8821a5.m48254b().APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED());
    }

    /* renamed from: c */
    public boolean mo29158c() {
        return this.f36492a.getBoolean(f36481p, C8821a5.m48254b().APPUSAGE_MANAGER_INSTALLED_APP_SNAPSHOT_ENABLED());
    }

    /* renamed from: d */
    public void mo29163d(boolean z) {
        this.f36492a.edit().putBoolean(f36481p, z).commit();
    }

    /* renamed from: e */
    public boolean mo29167e() {
        return this.f36492a.getBoolean(f36479n, C8821a5.m48254b().APPUSAGE_SERVICE_ENABLED());
    }

    /* renamed from: f */
    public void mo29171f(boolean z) {
        this.f36492a.edit().putBoolean(f36475j, z).commit();
    }

    /* renamed from: g */
    public void mo29173g(long j) {
        this.f36492a.edit().putLong(f36449A, j).commit();
    }

    /* renamed from: h */
    public void mo29178h(boolean z) {
        this.f36492a.edit().putBoolean(f36489x, z).commit();
    }

    /* renamed from: i */
    public void mo29179i(long j) {
        this.f36492a.edit().putLong(f36471f, j).commit();
    }

    /* renamed from: j */
    public void mo29184j(boolean z) {
        this.f36492a.edit().putBoolean(f36450B, z).commit();
    }

    /* renamed from: k */
    public void mo29185k(long j) {
        this.f36492a.edit().putLong(f36451C, j).commit();
    }

    /* renamed from: l */
    public boolean mo29190l() {
        return this.f36492a.getBoolean(f36475j, C8821a5.m48254b().CONNECTIVITY_KEEPALIVE_ENABLED());
    }

    /* renamed from: m */
    public boolean mo29193m() {
        return this.f36492a.getBoolean(f36474i, C8821a5.m48254b().CONNECTIVITY_TEST_ENABLED());
    }

    /* renamed from: n */
    public boolean mo29195n() {
        return this.f36492a.getBoolean(f36489x, C8821a5.m48254b().COVERAGE_MAPPER_SERVICE_ENABLED());
    }

    /* renamed from: o */
    public void mo29197o(boolean z) {
        this.f36492a.edit().putBoolean(f36486u, z).commit();
    }

    /* renamed from: p */
    public String mo29198p() {
        return mo29146a(false);
    }

    /* renamed from: q */
    public Set<String> mo29200q() {
        return this.f36492a.getStringSet(f36457I, (Set) null);
    }

    /* renamed from: r */
    public long mo29201r() {
        return this.f36492a.getLong(f36483r, 0);
    }

    /* renamed from: s */
    public long mo29202s() {
        return this.f36492a.getLong(f36480o, 1);
    }

    /* renamed from: t */
    public long mo29203t() {
        return this.f36492a.getLong(f36463O, 0);
    }

    /* renamed from: u */
    public long mo29204u() {
        return this.f36492a.getLong(f36478m, 2147483647L);
    }

    /* renamed from: v */
    public long mo29205v() {
        return this.f36492a.getLong(f36449A, 0);
    }

    /* renamed from: w */
    public long mo29206w() {
        return this.f36492a.getLong(f36476k, 0);
    }

    /* renamed from: x */
    public long mo29207x() {
        return this.f36492a.getLong(f36471f, 0);
    }

    /* renamed from: y */
    public long mo29208y() {
        return this.f36492a.getLong(f36464P, 2147483647L);
    }

    /* renamed from: z */
    public AnonymizationLevel mo29209z() {
        return m48317a(this.f36492a.getString(f36488w, C8821a5.m48254b().MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    /* renamed from: a */
    public String mo29146a(boolean z) {
        String string = this.f36492a.getString(f36472g, "");
        boolean z2 = true;
        if (string == null || string.length() == 0) {
            string = m48318a();
        } else {
            long d = C9603va.m50435d();
            long j = this.f36492a.getLong(f36473h, 0);
            long GUID_MAX_AGE = C8821a5.m48254b().GUID_MAX_AGE();
            if ((GUID_MAX_AGE != -1 || z) && (d - j > GUID_MAX_AGE || z)) {
                string = m48318a();
            } else {
                z2 = false;
            }
        }
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new C9006h9(new C8845a(string)));
            if (mo29134D()) {
                m48316O();
            }
        }
        return string;
    }

    /* renamed from: b */
    public void mo29151b(AnonymizationLevel anonymizationLevel) {
        this.f36492a.edit().putString(f36485t, anonymizationLevel.toString()).commit();
    }

    /* renamed from: c */
    public void mo29154c(long j) {
        this.f36492a.edit().putLong(f36483r, j).commit();
    }

    /* renamed from: d */
    public long mo29159d() {
        return this.f36492a.getLong(f36482q, 86400000);
    }

    /* renamed from: e */
    public void mo29166e(boolean z) {
        this.f36492a.edit().putBoolean(f36479n, z).commit();
    }

    /* renamed from: f */
    public void mo29169f(long j) {
        this.f36492a.edit().putLong(f36478m, j).commit();
    }

    /* renamed from: g */
    public void mo29175g(boolean z) {
        this.f36492a.edit().putBoolean(f36474i, z).commit();
    }

    /* renamed from: h */
    public void mo29177h(long j) {
        this.f36492a.edit().putLong(f36476k, j).commit();
    }

    /* renamed from: i */
    public void mo29180i(boolean z) {
        this.f36492a.edit().putBoolean(f36487v, z).commit();
    }

    /* renamed from: j */
    public String mo29182j() {
        return this.f36492a.getString(f36461M, C8821a5.m48254b().LATENCY_TEST_CRITERIA().name());
    }

    /* renamed from: k */
    public void mo29186k(boolean z) {
        this.f36492a.edit().putBoolean(f36453E, z).commit();
    }

    /* renamed from: l */
    public void mo29189l(boolean z) {
        this.f36492a.edit().putBoolean(f36491z, z).commit();
    }

    /* renamed from: m */
    public void mo29192m(boolean z) {
        this.f36492a.edit().putBoolean(f36469d, z).commit();
    }

    /* renamed from: n */
    public void mo29194n(boolean z) {
        this.f36492a.edit().putBoolean(f36455G, z).commit();
    }

    /* renamed from: o */
    public LocationController.ProviderMode mo29196o() {
        return m48319b(this.f36492a.getString(f36490y, C8821a5.m48254b().COVERAGE_MAPPER_SERVICE_TRIGGER_PROVIDER_MODE().toString()));
    }

    /* renamed from: p */
    public void mo29199p(boolean z) {
        this.f36492a.edit().putBoolean(f36465Q, z).commit();
    }

    /* renamed from: b */
    private LocationController.ProviderMode m48319b(String str) {
        LocationController.ProviderMode providerMode = LocationController.ProviderMode.Gps;
        if (str.equals(providerMode.toString())) {
            return providerMode;
        }
        LocationController.ProviderMode providerMode2 = LocationController.ProviderMode.GpsAndNetwork;
        if (str.equals(providerMode2.toString())) {
            return providerMode2;
        }
        LocationController.ProviderMode providerMode3 = LocationController.ProviderMode.Network;
        if (str.equals(providerMode3.toString())) {
            return providerMode3;
        }
        LocationController.ProviderMode providerMode4 = LocationController.ProviderMode.Passive;
        if (str.equals(providerMode4.toString())) {
            return providerMode4;
        }
        LocationController.ProviderMode providerMode5 = LocationController.ProviderMode.RailNet;
        if (str.equals(providerMode5.toString())) {
            return providerMode5;
        }
        return null;
    }

    /* renamed from: c */
    public void mo29157c(boolean z) {
        this.f36492a.edit().putBoolean(f36484s, z).commit();
    }

    /* renamed from: d */
    public void mo29160d(long j) {
        this.f36492a.edit().putLong(f36480o, j).apply();
    }

    /* renamed from: e */
    public void mo29165e(String str) {
        this.f36492a.edit().putString(f36454F, str).commit();
    }

    /* renamed from: f */
    public void mo29170f(String str) {
        this.f36492a.edit().putString(f36468c, str).commit();
    }

    /* renamed from: g */
    public void mo29174g(String str) {
        this.f36492a.edit().putString(f36467b, str).commit();
    }

    /* renamed from: h */
    public String mo29176h() {
        return this.f36492a.getString(f36459K, C8821a5.m48254b().CONNECTIVITY_TEST_CRITERIA().name());
    }

    /* renamed from: i */
    public String[] mo29181i() {
        Set<String> stringSet = this.f36492a.getStringSet(f36458J, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return C8821a5.m48254b().CONNECTIVITY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    /* renamed from: j */
    public void mo29183j(long j) {
        this.f36492a.edit().putLong(f36464P, j).commit();
    }

    /* renamed from: k */
    public String[] mo29187k() {
        Set<String> stringSet = this.f36492a.getStringSet(f36460L, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return C8821a5.m48254b().LATENCY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    /* renamed from: l */
    public void mo29188l(long j) {
        this.f36492a.edit().putLong(f36477l, j).commit();
    }

    /* renamed from: m */
    public void mo29191m(long j) {
        this.f36492a.edit().putLong(f36470e, j).commit();
    }

    /* renamed from: c */
    public void mo29155c(String str) {
        this.f36492a.edit().putString(f36459K, str).commit();
    }

    /* renamed from: d */
    public void mo29162d(Set<String> set) {
        this.f36492a.edit().putStringSet(f36457I, set).commit();
    }

    /* renamed from: e */
    public void mo29164e(long j) {
        this.f36492a.edit().putLong(f36463O, j).commit();
    }

    /* renamed from: f */
    public Set<String> mo29168f() {
        return this.f36492a.getStringSet(f36456H, (Set) null);
    }

    /* renamed from: g */
    public long mo29172g() {
        return this.f36492a.getLong(f36462N, 0);
    }

    /* renamed from: c */
    public void mo29156c(Set<String> set) {
        this.f36492a.edit().putStringSet(f36460L, set).commit();
    }

    /* renamed from: d */
    public void mo29161d(String str) {
        this.f36492a.edit().putString(f36461M, str).commit();
    }

    /* renamed from: b */
    private void m48320b(boolean z) {
        this.f36492a.edit().putBoolean(f36452D, z).commit();
    }

    /* renamed from: b */
    public void mo29150b(long j) {
        this.f36492a.edit().putLong(f36462N, j).commit();
    }

    /* renamed from: b */
    public void mo29152b(Set<String> set) {
        this.f36492a.edit().putStringSet(f36458J, set).commit();
    }

    /* renamed from: a */
    private String m48318a() {
        String replace = UUID.randomUUID().toString().replace("-", "");
        SharedPreferences.Editor edit = this.f36492a.edit();
        edit.putString(f36472g, replace);
        edit.putLong(f36473h, C9603va.m50435d());
        edit.commit();
        return replace;
    }

    /* renamed from: a */
    public void mo29148a(AnonymizationLevel anonymizationLevel) {
        this.f36492a.edit().putString(f36488w, anonymizationLevel.toString()).commit();
    }

    /* renamed from: a */
    private AnonymizationLevel m48317a(String str) {
        AnonymizationLevel anonymizationLevel = AnonymizationLevel.Anonymized;
        if (str.equals(anonymizationLevel.toString())) {
            return anonymizationLevel;
        }
        AnonymizationLevel anonymizationLevel2 = AnonymizationLevel.Full;
        if (str.equals(anonymizationLevel2.toString())) {
            return anonymizationLevel2;
        }
        AnonymizationLevel anonymizationLevel3 = AnonymizationLevel.None;
        str.equals(anonymizationLevel3.toString());
        return anonymizationLevel3;
    }

    /* renamed from: a */
    public void mo29149a(Set<String> set) {
        this.f36492a.edit().putStringSet(f36456H, set).commit();
    }
}
