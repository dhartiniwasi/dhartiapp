package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.az */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C2196az extends C2344ez {
    C2196az(int i, String str, Long l) {
        super(1, str, l, (C2307dz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8625a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo10052n(), ((Long) mo10051m()).longValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8626b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo10052n()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(mo10052n())));
        }
        return (Long) mo10051m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8627c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo10052n(), ((Long) mo10051m()).longValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8628d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo10052n(), ((Long) obj).longValue());
    }
}
