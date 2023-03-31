package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ma0 {

    /* renamed from: a */
    private static final Charset f13286a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final ja0 f13287b = new la0();

    /* renamed from: c */
    public static final ha0 f13288c = ka0.f11982a;

    /* renamed from: a */
    static /* synthetic */ InputStream m16457a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f13286a));
    }
}
