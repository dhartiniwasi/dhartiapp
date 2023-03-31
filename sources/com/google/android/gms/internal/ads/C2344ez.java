package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.ez */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C2344ez {

    /* renamed from: a */
    private final int f9031a;

    /* renamed from: b */
    private final String f9032b;

    /* renamed from: c */
    private final Object f9033c;

    /* synthetic */ C2344ez(int i, String str, Object obj, C2307dz dzVar) {
        this.f9031a = i;
        this.f9032b = str;
        this.f9033c = obj;
        C4596v.m30086a().mo10355d(this);
    }

    /* renamed from: f */
    public static C2344ez m12349f(int i, String str, float f) {
        return new C2233bz(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static C2344ez m12350g(int i, String str, int i2) {
        return new C3123zy(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static C2344ez m12351h(int i, String str, long j) {
        return new C2196az(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static C2344ez m12352i(int i, String str, Boolean bool) {
        return new C3086yy(i, str, bool);
    }

    /* renamed from: j */
    public static C2344ez m12353j(int i, String str, String str2) {
        return new C2270cz(1, str, str2);
    }

    /* renamed from: k */
    public static C2344ez m12354k(int i, String str) {
        C2344ez j = m12353j(1, "gads:sdk_core_constants:experiment_id", (String) null);
        C4596v.m30086a().mo10354c(j);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo8625a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract Object mo8626b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo8627c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo8628d(SharedPreferences.Editor editor, Object obj);

    /* renamed from: e */
    public final int mo10049e() {
        return this.f9031a;
    }

    /* renamed from: l */
    public final Object mo10050l() {
        return C4596v.m30088c().mo12227b(this);
    }

    /* renamed from: m */
    public final Object mo10051m() {
        return this.f9033c;
    }

    /* renamed from: n */
    public final String mo10052n() {
        return this.f9032b;
    }
}
