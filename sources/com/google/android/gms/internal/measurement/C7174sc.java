package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7174sc implements C7158rc {

    /* renamed from: A */
    public static final C6908c7 f32058A;

    /* renamed from: B */
    public static final C6908c7 f32059B;

    /* renamed from: C */
    public static final C6908c7 f32060C;

    /* renamed from: D */
    public static final C6908c7 f32061D;

    /* renamed from: E */
    public static final C6908c7 f32062E;

    /* renamed from: F */
    public static final C6908c7 f32063F;

    /* renamed from: G */
    public static final C6908c7 f32064G;

    /* renamed from: H */
    public static final C6908c7 f32065H;

    /* renamed from: I */
    public static final C6908c7 f32066I;

    /* renamed from: J */
    public static final C6908c7 f32067J;

    /* renamed from: K */
    public static final C6908c7 f32068K;

    /* renamed from: L */
    public static final C6908c7 f32069L;

    /* renamed from: M */
    public static final C6908c7 f32070M;

    /* renamed from: a */
    public static final C6908c7 f32071a;

    /* renamed from: b */
    public static final C6908c7 f32072b;

    /* renamed from: c */
    public static final C6908c7 f32073c;

    /* renamed from: d */
    public static final C6908c7 f32074d;

    /* renamed from: e */
    public static final C6908c7 f32075e;

    /* renamed from: f */
    public static final C6908c7 f32076f;

    /* renamed from: g */
    public static final C6908c7 f32077g;

    /* renamed from: h */
    public static final C6908c7 f32078h;

    /* renamed from: i */
    public static final C6908c7 f32079i;

    /* renamed from: j */
    public static final C6908c7 f32080j;

    /* renamed from: k */
    public static final C6908c7 f32081k;

    /* renamed from: l */
    public static final C6908c7 f32082l;

    /* renamed from: m */
    public static final C6908c7 f32083m;

    /* renamed from: n */
    public static final C6908c7 f32084n;

    /* renamed from: o */
    public static final C6908c7 f32085o;

    /* renamed from: p */
    public static final C6908c7 f32086p;

    /* renamed from: q */
    public static final C6908c7 f32087q;

    /* renamed from: r */
    public static final C6908c7 f32088r;

    /* renamed from: s */
    public static final C6908c7 f32089s;

    /* renamed from: t */
    public static final C6908c7 f32090t;

    /* renamed from: u */
    public static final C6908c7 f32091u;

    /* renamed from: v */
    public static final C6908c7 f32092v;

    /* renamed from: w */
    public static final C6908c7 f32093w;

    /* renamed from: x */
    public static final C6908c7 f32094x;

    /* renamed from: y */
    public static final C6908c7 f32095y;

    /* renamed from: z */
    public static final C6908c7 f32096z;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f32071a = a.mo24018d("measurement.ad_id_cache_time", 10000);
        f32072b = a.mo24018d("measurement.max_bundles_per_iteration", 100);
        f32073c = a.mo24018d("measurement.config.cache_time", 86400000);
        f32074d = a.mo24019e("measurement.log_tag", "FA");
        f32075e = a.mo24019e("measurement.config.url_authority", "app-measurement.com");
        f32076f = a.mo24019e("measurement.config.url_scheme", "https");
        f32077g = a.mo24018d("measurement.upload.debug_upload_interval", 1000);
        f32078h = a.mo24018d("measurement.lifetimevalue.max_currency_tracked", 4);
        f32079i = a.mo24018d("measurement.store.max_stored_events_per_app", 100000);
        f32080j = a.mo24018d("measurement.experiment.max_ids", 50);
        f32081k = a.mo24018d("measurement.audience.filter_result_max_count", 200);
        f32082l = a.mo24018d("measurement.alarm_manager.minimum_interval", 60000);
        f32083m = a.mo24018d("measurement.upload.minimum_delay", 500);
        f32084n = a.mo24018d("measurement.monitoring.sample_period_millis", 86400000);
        f32085o = a.mo24018d("measurement.upload.realtime_upload_interval", 10000);
        f32086p = a.mo24018d("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f32087q = a.mo24018d("measurement.config.cache_time.service", 3600000);
        f32088r = a.mo24018d("measurement.service_client.idle_disconnect_millis", 5000);
        f32089s = a.mo24019e("measurement.log_tag.service", "FA-SVC");
        f32090t = a.mo24018d("measurement.upload.stale_data_deletion_interval", 86400000);
        f32091u = a.mo24018d("measurement.sdk.attribution.cache.ttl", 604800000);
        f32092v = a.mo24018d("measurement.redaction.app_instance_id.ttl", 7200000);
        f32093w = a.mo24018d("measurement.upload.backoff_period", 43200000);
        f32094x = a.mo24018d("measurement.upload.initial_upload_delay_time", 15000);
        f32095y = a.mo24018d("measurement.upload.interval", 3600000);
        f32096z = a.mo24018d("measurement.upload.max_bundle_size", 65536);
        f32058A = a.mo24018d("measurement.upload.max_bundles", 100);
        f32059B = a.mo24018d("measurement.upload.max_conversions_per_day", 500);
        f32060C = a.mo24018d("measurement.upload.max_error_events_per_day", 1000);
        f32061D = a.mo24018d("measurement.upload.max_events_per_bundle", 1000);
        f32062E = a.mo24018d("measurement.upload.max_events_per_day", 100000);
        f32063F = a.mo24018d("measurement.upload.max_public_events_per_day", 50000);
        f32064G = a.mo24018d("measurement.upload.max_queue_time", 2419200000L);
        f32065H = a.mo24018d("measurement.upload.max_realtime_events_per_day", 10);
        f32066I = a.mo24018d("measurement.upload.max_batch_size", 65536);
        f32067J = a.mo24018d("measurement.upload.retry_count", 6);
        f32068K = a.mo24018d("measurement.upload.retry_time", 1800000);
        f32069L = a.mo24019e("measurement.upload.url", "https://app-measurement.com/a");
        f32070M = a.mo24018d("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final String mo23829A() {
        return (String) f32076f.mo23250b();
    }

    /* renamed from: C */
    public final long mo23830C() {
        return ((Long) f32065H.mo23250b()).longValue();
    }

    /* renamed from: K */
    public final long mo23831K() {
        return ((Long) f32066I.mo23250b()).longValue();
    }

    /* renamed from: T */
    public final long mo23832T() {
        return ((Long) f32079i.mo23250b()).longValue();
    }

    /* renamed from: U */
    public final long mo23833U() {
        return ((Long) f32081k.mo23250b()).longValue();
    }

    /* renamed from: V */
    public final long mo23834V() {
        return ((Long) f32082l.mo23250b()).longValue();
    }

    /* renamed from: W */
    public final long mo23835W() {
        return ((Long) f32083m.mo23250b()).longValue();
    }

    /* renamed from: X */
    public final long mo23836X() {
        return ((Long) f32084n.mo23250b()).longValue();
    }

    /* renamed from: Y */
    public final long mo23837Y() {
        return ((Long) f32090t.mo23250b()).longValue();
    }

    /* renamed from: Z */
    public final long mo23838Z() {
        return ((Long) f32085o.mo23250b()).longValue();
    }

    /* renamed from: a */
    public final long mo23839a() {
        return ((Long) f32078h.mo23250b()).longValue();
    }

    /* renamed from: a0 */
    public final long mo23840a0() {
        return ((Long) f32088r.mo23250b()).longValue();
    }

    /* renamed from: b */
    public final long mo23841b() {
        return ((Long) f32077g.mo23250b()).longValue();
    }

    /* renamed from: b0 */
    public final long mo23842b0() {
        return ((Long) f32091u.mo23250b()).longValue();
    }

    /* renamed from: c */
    public final long mo23843c() {
        return ((Long) f32080j.mo23250b()).longValue();
    }

    /* renamed from: c0 */
    public final long mo23844c0() {
        return ((Long) f32086p.mo23250b()).longValue();
    }

    /* renamed from: d */
    public final long mo23845d() {
        return ((Long) f32072b.mo23250b()).longValue();
    }

    /* renamed from: d0 */
    public final long mo23846d0() {
        return ((Long) f32094x.mo23250b()).longValue();
    }

    /* renamed from: e */
    public final long mo23847e() {
        return ((Long) f32073c.mo23250b()).longValue();
    }

    /* renamed from: e0 */
    public final long mo23848e0() {
        return ((Long) f32093w.mo23250b()).longValue();
    }

    /* renamed from: g */
    public final long mo23849g() {
        return ((Long) f32095y.mo23250b()).longValue();
    }

    /* renamed from: g0 */
    public final long mo23850g0() {
        return ((Long) f32058A.mo23250b()).longValue();
    }

    /* renamed from: h */
    public final long mo23851h() {
        return ((Long) f32092v.mo23250b()).longValue();
    }

    /* renamed from: h0 */
    public final long mo23852h0() {
        return ((Long) f32063F.mo23250b()).longValue();
    }

    /* renamed from: i0 */
    public final long mo23853i0() {
        return ((Long) f32068K.mo23250b()).longValue();
    }

    /* renamed from: j */
    public final long mo23854j() {
        return ((Long) f32096z.mo23250b()).longValue();
    }

    /* renamed from: j0 */
    public final long mo23855j0() {
        return ((Long) f32062E.mo23250b()).longValue();
    }

    /* renamed from: k0 */
    public final long mo23856k0() {
        return ((Long) f32067J.mo23250b()).longValue();
    }

    /* renamed from: l0 */
    public final long mo23857l0() {
        return ((Long) f32064G.mo23250b()).longValue();
    }

    /* renamed from: m0 */
    public final long mo23858m0() {
        return ((Long) f32061D.mo23250b()).longValue();
    }

    /* renamed from: o */
    public final long mo23859o() {
        return ((Long) f32070M.mo23250b()).longValue();
    }

    /* renamed from: q */
    public final long mo23860q() {
        return ((Long) f32060C.mo23250b()).longValue();
    }

    /* renamed from: t */
    public final long mo23861t() {
        return ((Long) f32059B.mo23250b()).longValue();
    }

    /* renamed from: u */
    public final String mo23862u() {
        return (String) f32069L.mo23250b();
    }

    /* renamed from: w */
    public final String mo23863w() {
        return (String) f32075e.mo23250b();
    }

    public final long zza() {
        return ((Long) f32071a.mo23250b()).longValue();
    }
}
