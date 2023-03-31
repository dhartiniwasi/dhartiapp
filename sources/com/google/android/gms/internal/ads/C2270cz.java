package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C2270cz extends C2344ez {
    C2270cz(int i, String str, String str2) {
        super(1, str, str2, (C2307dz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8625a(JSONObject jSONObject) {
        return jSONObject.optString(mo10052n(), (String) mo10051m());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8626b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo10052n()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(mo10052n()));
        }
        return (String) mo10051m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8627c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo10052n(), (String) mo10051m());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8628d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo10052n(), (String) obj);
    }
}
