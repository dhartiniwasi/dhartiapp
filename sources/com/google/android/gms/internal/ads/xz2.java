package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xz2 {

    /* renamed from: a */
    private final e03 f20395a;

    /* renamed from: b */
    private final e03 f20396b;

    /* renamed from: c */
    private final b03 f20397c;

    /* renamed from: d */
    private final d03 f20398d;

    private xz2(b03 b03, d03 d03, e03 e03, e03 e032, boolean z) {
        this.f20397c = b03;
        this.f20398d = d03;
        this.f20395a = e03;
        if (e032 == null) {
            this.f20396b = e03.NONE;
        } else {
            this.f20396b = e032;
        }
    }

    /* renamed from: a */
    public static xz2 m23623a(b03 b03, d03 d03, e03 e03, e03 e032, boolean z) {
        e13.m11814b(d03, "ImpressionType is null");
        e13.m11814b(e03, "Impression owner is null");
        if (e03 == e03.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (b03 == b03.DEFINED_BY_JAVASCRIPT && e03 == e03.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (d03 != d03.DEFINED_BY_JAVASCRIPT || e03 != e03.NATIVE) {
            return new xz2(b03, d03, e03, e032, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: b */
    public final JSONObject mo15260b() {
        JSONObject jSONObject = new JSONObject();
        c13.m10680h(jSONObject, "impressionOwner", this.f20395a);
        c13.m10680h(jSONObject, "mediaEventsOwner", this.f20396b);
        c13.m10680h(jSONObject, "creativeType", this.f20397c);
        c13.m10680h(jSONObject, "impressionType", this.f20398d);
        c13.m10680h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
