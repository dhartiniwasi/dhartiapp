package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j13 {

    /* renamed from: a */
    private JSONObject f11177a;

    /* renamed from: b */
    private final s13 f11178b;

    public j13(s13 s13) {
        this.f11178b = s13;
    }

    /* renamed from: a */
    public final JSONObject mo11295a() {
        return this.f11177a;
    }

    /* renamed from: b */
    public final void mo11296b() {
        this.f11178b.mo13933b(new t13(this, (byte[]) null));
    }

    /* renamed from: c */
    public final void mo11297c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f11178b.mo13933b(new u13(this, hashSet, jSONObject, j, (byte[]) null));
    }

    /* renamed from: d */
    public final void mo11298d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f11178b.mo13933b(new v13(this, hashSet, jSONObject, j, (byte[]) null));
    }

    /* renamed from: e */
    public final void mo11299e(JSONObject jSONObject) {
        this.f11177a = jSONObject;
    }
}
