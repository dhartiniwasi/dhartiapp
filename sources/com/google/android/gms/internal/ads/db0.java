package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class db0 extends um0 {

    /* renamed from: b */
    private final cb0 f8170b;

    public db0(cb0 cb0, String str) {
        super(str);
        this.f8170b = cb0;
    }

    /* renamed from: f */
    public final boolean mo9501f(String str) {
        pm0.m18662b("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        pm0.m18662b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.mo9501f(str);
    }
}
