package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C3086yy extends C2344ez {
    C3086yy(int i, String str, Boolean bool) {
        super(i, str, bool, (C2307dz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8625a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo10052n(), ((Boolean) mo10051m()).booleanValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8626b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo10052n()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(mo10052n())));
        }
        return (Boolean) mo10051m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8627c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo10052n(), ((Boolean) mo10051m()).booleanValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8628d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo10052n(), ((Boolean) obj).booleanValue());
    }
}
