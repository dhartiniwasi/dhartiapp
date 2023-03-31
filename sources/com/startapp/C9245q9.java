package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.q9 */
/* compiled from: Sta */
public class C9245q9 extends C8825a8<String> implements C9620w7 {

    /* renamed from: j */
    public final C8923e2 f38120j;

    /* renamed from: k */
    public final C8908d3<SensorsConfig> f38121k;

    public C9245q9(Context context, C9441e eVar, C8923e2 e2Var, C9256r3 r3Var, C8908d3<SensorsConfig> d3Var) {
        super(context, eVar, r3Var, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        this.f38120j = e2Var;
        this.f38121k = d3Var;
    }

    /* renamed from: a */
    public Object mo29087a(String str) {
        return str;
    }

    /* renamed from: a */
    public void mo29232a(Object obj) {
        mo29088b(obj != null ? obj.toString() : null);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo29309c() {
        return "";
    }

    /* renamed from: d */
    public long mo29090d() {
        SensorsConfig call = this.f38121k.call();
        if (call != null) {
            return call.mo31122h();
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo29092f() {
        SensorsConfig call;
        if (!this.f38120j.mo29324c() || (call = this.f38121k.call()) == null || !call.mo31127l()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo29093g() {
        Context context = this.f36944a;
        ComponentLocator.m50248a(context).mo31175k().execute(new C9210p3(context, this).f39427d);
    }
}
