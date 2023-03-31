package p053g4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qj2;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.vm0;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import p060h4.C4541l4;
import p081k5.C4888c;

/* renamed from: g4.r */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4407r {

    /* renamed from: a */
    private final Context f24530a;

    /* renamed from: b */
    private final String f24531b;

    /* renamed from: c */
    private final Map f24532c = new TreeMap();

    /* renamed from: d */
    private String f24533d;

    /* renamed from: e */
    private String f24534e;

    /* renamed from: f */
    private final String f24535f;

    public C4407r(Context context, String str) {
        String str2;
        this.f24530a = context.getApplicationContext();
        this.f24531b = str;
        String packageName = context.getPackageName();
        try {
            str2 = packageName + "-" + C4888c.m31075a(context).mo18673f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            pm0.m18665e("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f24535f = str2;
    }

    /* renamed from: a */
    public final String mo17918a() {
        return this.f24535f;
    }

    /* renamed from: b */
    public final String mo17919b() {
        return this.f24534e;
    }

    /* renamed from: c */
    public final String mo17920c() {
        return this.f24531b;
    }

    /* renamed from: d */
    public final String mo17921d() {
        return this.f24533d;
    }

    /* renamed from: e */
    public final Map mo17922e() {
        return this.f24532c;
    }

    /* renamed from: f */
    public final void mo17923f(C4541l4 l4Var, vm0 vm0) {
        this.f24533d = l4Var.f24898r.f24821a;
        Bundle bundle = l4Var.f24901u;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) s00.f17166c.mo13438e();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    this.f24534e = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f24532c.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            this.f24532c.put("SDKVersion", vm0.f19150a);
            if (((Boolean) s00.f17164a.mo13438e()).booleanValue()) {
                try {
                    Bundle a = qj2.m19234a(this.f24530a, new JSONArray((String) s00.f17165b.mo13438e()));
                    for (String str3 : a.keySet()) {
                        this.f24532c.put(str3, a.get(str3).toString());
                    }
                } catch (JSONException e) {
                    pm0.m18665e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
    }
}
