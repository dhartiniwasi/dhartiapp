package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fy2 {

    /* renamed from: a */
    private final String f9579a = ((String) y00.f20407b.mo13438e());

    /* renamed from: a */
    public final String mo10349a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f9579a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
