package p053g4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.az2;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.fa0;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.ja0;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.ma0;
import com.google.android.gms.internal.ads.mf3;
import com.google.android.gms.internal.ads.my2;
import com.google.android.gms.internal.ads.ny2;
import com.google.android.gms.internal.ads.pa0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.rl0;
import com.google.android.gms.internal.ads.vm0;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;
import p060h4.C4596v;
import p073j4.C4794n1;
import p081k5.C4888c;

/* renamed from: g4.e */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4394e {

    /* renamed from: a */
    private Context f24497a;

    /* renamed from: b */
    private long f24498b = 0;

    /* renamed from: a */
    public final void mo17899a(Context context, vm0 vm0, String str, Runnable runnable, az2 az2) {
        mo17900b(context, vm0, true, (rl0) null, str, (String) null, runnable, az2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17900b(Context context, vm0 vm0, boolean z, rl0 rl0, String str, String str2, Runnable runnable, az2 az2) {
        PackageInfo f;
        if (C4409t.m29310b().mo18371b() - this.f24498b < 5000) {
            pm0.m18667g("Not retrying to fetch app settings");
            return;
        }
        this.f24498b = C4409t.m29310b().mo18371b();
        if (rl0 != null) {
            long a = rl0.mo13841a();
            if (C4409t.m29310b().mo18370a() - a <= ((Long) C4596v.m30088c().mo12227b(C2679nz.f14581i3)).longValue() && rl0.mo13849i()) {
                return;
            }
        }
        if (context == null) {
            pm0.m18667g("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f24497a = applicationContext;
            ny2 a2 = my2.m16825a(context, 4);
            a2.mo11828T();
            pa0 a3 = C4409t.m29316h().mo10444a(this.f24497a, vm0, az2);
            ja0 ja0 = ma0.f13287b;
            fa0 a4 = a3.mo13200a("google.afma.config.fetchAppSettings", ja0, ja0);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", C2679nz.m17341a()));
                try {
                    ApplicationInfo applicationInfo = this.f24497a.getApplicationInfo();
                    if (!(applicationInfo == null || (f = C4888c.m31075a(context).mo18673f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put(MediationMetaData.KEY_VERSION, f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    C4794n1.m30693k("Error fetching PackageInfo.");
                }
                lf3 c = a4.mo10117c(jSONObject);
                C4393d dVar = new C4393d(az2, a2);
                mf3 mf3 = dn0.f8330f;
                lf3 n = cf3.m10916n(c, dVar, mf3);
                if (runnable != null) {
                    c.mo10135j(runnable, mf3);
                }
                gn0.m13405a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                pm0.m18665e("Error requesting application settings", e);
                a2.mo11826G(false);
                az2.mo8629b(a2.mo11831W());
            }
        } else {
            pm0.m18667g("App settings could not be fetched. Required parameters missing");
        }
    }

    /* renamed from: c */
    public final void mo17901c(Context context, vm0 vm0, String str, rl0 rl0, az2 az2) {
        mo17900b(context, vm0, false, rl0, rl0 != null ? rl0.mo13842b() : null, str, (Runnable) null, az2);
    }
}
