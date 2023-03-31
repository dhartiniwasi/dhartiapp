package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p180z4.C6378j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ih0 extends jh0 {

    /* renamed from: a */
    private final Object f10783a = new Object();

    /* renamed from: b */
    private final Context f10784b;

    /* renamed from: c */
    private SharedPreferences f10785c;

    /* renamed from: d */
    private final fa0 f10786d;

    public ih0(Context context, fa0 fa0) {
        this.f10784b = context.getApplicationContext();
        this.f10786d = fa0;
    }

    /* renamed from: c */
    public static JSONObject m14325c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", vm0.m22307I1().f19150a);
            jSONObject.put("mf", e10.f8557a.mo13438e());
            jSONObject.put("cl", "474357726");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", C6378j.f30617a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m9485c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", C6378j.f30617a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final lf3 mo11107a() {
        synchronized (this.f10783a) {
            if (this.f10785c == null) {
                this.f10785c = this.f10784b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C4409t.m29310b().mo18370a() - this.f10785c.getLong("js_last_update", 0) < ((Long) e10.f8558b.mo13438e()).longValue()) {
            return cf3.m10911i((Object) null);
        }
        return cf3.m10915m(this.f10786d.mo10117c(m14325c(this.f10784b)), new hh0(this), dn0.f8330f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo11108b(JSONObject jSONObject) {
        C2679nz.m17344d(this.f10784b, 1, jSONObject);
        this.f10785c.edit().putLong("js_last_update", C4409t.m29310b().mo18370a()).apply();
        return null;
    }
}
