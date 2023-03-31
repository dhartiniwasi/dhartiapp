package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import p032d4.C4076a;
import p033d5.C4141r;
import p402y5.C13020b;
import p402y5.C13031i;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7495s3 extends C7332d5 {

    /* renamed from: y */
    static final Pair f32944y = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f32945c;

    /* renamed from: d */
    public C7473q3 f32946d;

    /* renamed from: e */
    public final C7462p3 f32947e = new C7462p3(this, "first_open_time", 0);

    /* renamed from: f */
    public final C7462p3 f32948f = new C7462p3(this, "app_install_time", 0);

    /* renamed from: g */
    public final C7484r3 f32949g = new C7484r3(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f32950h;

    /* renamed from: i */
    private boolean f32951i;

    /* renamed from: j */
    private long f32952j;

    /* renamed from: k */
    public final C7462p3 f32953k = new C7462p3(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C7440n3 f32954l = new C7440n3(this, "start_new_session", true);

    /* renamed from: m */
    public final C7484r3 f32955m = new C7484r3(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C7440n3 f32956n = new C7440n3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C7462p3 f32957o = new C7462p3(this, "last_pause_time", 0);

    /* renamed from: p */
    public final C7462p3 f32958p = new C7462p3(this, "session_id", 0);

    /* renamed from: q */
    public boolean f32959q;

    /* renamed from: r */
    public final C7440n3 f32960r = new C7440n3(this, "app_backgrounded", false);

    /* renamed from: s */
    public final C7440n3 f32961s = new C7440n3(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final C7462p3 f32962t = new C7462p3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final C7484r3 f32963u = new C7484r3(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final C7484r3 f32964v = new C7484r3(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final C7462p3 f32965w = new C7462p3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final C7451o3 f32966x = new C7451o3(this, "default_event_parameters", (Bundle) null);

    C7495s3(C7397j4 j4Var) {
        super(j4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo24234g() {
        SharedPreferences sharedPreferences = this.f32389a.mo24121d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f32945c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f32959q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f32945c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f32389a.mo24443z();
        this.f32946d = new C7473q3(this, "health_monitor", Math.max(0, ((Long) C7516u2.f33044d.mo24669a((Object) null)).longValue()), (C13031i) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo24235h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final SharedPreferences mo24642n() {
        mo24189f();
        mo24236i();
        C4141r.m28221k(this.f32945c);
        return this.f32945c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Pair mo24643o(String str) {
        mo24189f();
        long b = this.f32389a.mo24116a().mo18371b();
        String str2 = this.f32950h;
        if (str2 != null && b < this.f32952j) {
            return new Pair(str2, Boolean.valueOf(this.f32951i));
        }
        this.f32952j = b + this.f32389a.mo24443z().mo24293q(str, C7516u2.f33042c);
        C4076a.m28011d(true);
        try {
            C4076a.C4077a a = C4076a.m28009a(this.f32389a.mo24121d());
            this.f32950h = "";
            String a2 = a.mo17308a();
            if (a2 != null) {
                this.f32950h = a2;
            }
            this.f32951i = a.mo17309b();
        } catch (Exception e) {
            this.f32389a.mo24135l().mo24255p().mo24209b("Unable to get advertising id", e);
            this.f32950h = "";
        }
        C4076a.m28011d(false);
        return new Pair(this.f32950h, Boolean.valueOf(this.f32951i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C13020b mo24644p() {
        mo24189f();
        return C13020b.m61314b(mo24642n().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Boolean mo24645q() {
        mo24189f();
        if (mo24642n().contains("measurement_enabled")) {
            return Boolean.valueOf(mo24642n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo24646r(Boolean bool) {
        mo24189f();
        SharedPreferences.Editor edit = mo24642n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo24647t(boolean z) {
        mo24189f();
        this.f32389a.mo24135l().mo24260v().mo24209b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo24642n().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo24648u() {
        SharedPreferences sharedPreferences = this.f32945c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo24649v(long j) {
        return j - this.f32953k.mo24604a() > this.f32957o.mo24604a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo24650w(int i) {
        return C13020b.m61316j(i, mo24642n().getInt("consent_source", 100));
    }
}
