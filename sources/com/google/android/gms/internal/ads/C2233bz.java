package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C2233bz extends C2344ez {
    C2233bz(int i, String str, Float f) {
        super(1, str, f, (C2307dz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8625a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo10052n(), (double) ((Float) mo10051m()).floatValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8626b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(mo10052n()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(mo10052n())));
        }
        return (Float) mo10051m();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8627c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo10052n(), ((Float) mo10051m()).floatValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8628d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo10052n(), ((Float) obj).floatValue());
    }
}
