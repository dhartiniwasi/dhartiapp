package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C3123zy extends C2344ez {
    C3123zy(int i, String str, Integer num) {
        super(1, str, num, (C2307dz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8625a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo10052n(), ((Integer) mo10051m()).intValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8626b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo10052n()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(mo10052n())));
        }
        return (Integer) mo10051m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8627c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo10052n(), ((Integer) mo10051m()).intValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8628d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo10052n(), ((Integer) obj).intValue());
    }
}
