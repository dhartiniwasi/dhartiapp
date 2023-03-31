package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.C6958f6;
import com.google.android.gms.internal.measurement.C7136q6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p402y5.C13022c;
import p402y5.C13024d;

/* renamed from: com.google.android.gms.measurement.internal.u2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7516u2 {

    /* renamed from: A */
    public static final C7505t2 f33012A = m41924a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C7349f0.f32460a);

    /* renamed from: B */
    public static final C7505t2 f33013B = m41924a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C7360g0.f32494a);

    /* renamed from: C */
    public static final C7505t2 f33014C = m41924a("measurement.upload.retry_time", 1800000L, 1800000L, C7371h0.f32528a);

    /* renamed from: D */
    public static final C7505t2 f33015D = m41924a("measurement.upload.retry_count", 6, 6, C7393j0.f32598a);

    /* renamed from: E */
    public static final C7505t2 f33016E = m41924a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C7404k0.f32659a);

    /* renamed from: F */
    public static final C7505t2 f33017F = m41924a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C7415l0.f32686a);

    /* renamed from: G */
    public static final C7505t2 f33018G = m41924a("measurement.audience.filter_result_max_count", 200, 200, C7437n0.f32761a);

    /* renamed from: H */
    public static final C7505t2 f33019H = m41924a("measurement.upload.max_public_user_properties", 25, 25, (C7483r2) null);

    /* renamed from: I */
    public static final C7505t2 f33020I = m41924a("measurement.upload.max_event_name_cardinality", 500, 500, (C7483r2) null);

    /* renamed from: J */
    public static final C7505t2 f33021J = m41924a("measurement.upload.max_public_event_params", 25, 25, (C7483r2) null);

    /* renamed from: K */
    public static final C7505t2 f33022K = m41924a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C7448o0.f32809a);

    /* renamed from: L */
    public static final C7505t2 f33023L;

    /* renamed from: M */
    public static final C7505t2 f33024M = m41924a("measurement.test.string_flag", "---", "---", C7470q0.f32881a);

    /* renamed from: N */
    public static final C7505t2 f33025N = m41924a("measurement.test.long_flag", -1L, -1L, C7481r0.f32922a);

    /* renamed from: O */
    public static final C7505t2 f33026O = m41924a("measurement.test.int_flag", -2, -2, C7492s0.f32941a);

    /* renamed from: P */
    public static final C7505t2 f33027P;

    /* renamed from: Q */
    public static final C7505t2 f33028Q = m41924a("measurement.experiment.max_ids", 50, 50, C7525v0.f33105a);

    /* renamed from: R */
    public static final C7505t2 f33029R = m41924a("measurement.max_bundles_per_iteration", 100, 100, C7535w0.f33135a);

    /* renamed from: S */
    public static final C7505t2 f33030S = m41924a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C7545x0.f33172a);

    /* renamed from: T */
    public static final C7505t2 f33031T = m41924a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C7295a1.f32307a);

    /* renamed from: U */
    public static final C7505t2 f33032U;

    /* renamed from: V */
    public static final C7505t2 f33033V;

    /* renamed from: W */
    public static final C7505t2 f33034W;

    /* renamed from: X */
    public static final C7505t2 f33035X;

    /* renamed from: Y */
    public static final C7505t2 f33036Y;

    /* renamed from: Z */
    public static final C7505t2 f33037Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f33038a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C7505t2 f33039a0;

    /* renamed from: b */
    private static final Set f33040b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C7505t2 f33041b0;

    /* renamed from: c */
    public static final C7505t2 f33042c = m41924a("measurement.ad_id_cache_time", 10000L, 10000L, C7382i0.f32551a);

    /* renamed from: c0 */
    public static final C7505t2 f33043c0;

    /* renamed from: d */
    public static final C7505t2 f33044d = m41924a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C7294a0.f32306a);

    /* renamed from: d0 */
    public static final C7505t2 f33045d0;

    /* renamed from: e */
    public static final C7505t2 f33046e = m41924a("measurement.config.cache_time", 86400000L, 3600000L, C7426m0.f32710a);

    /* renamed from: e0 */
    public static final C7505t2 f33047e0;

    /* renamed from: f */
    public static final C7505t2 f33048f = m41924a("measurement.config.url_scheme", "https", "https", C7555y0.f33195a);

    /* renamed from: f0 */
    public static final C7505t2 f33049f0;

    /* renamed from: g */
    public static final C7505t2 f33050g = m41924a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C7416l1.f32687a);

    /* renamed from: g0 */
    public static final C7505t2 f33051g0;

    /* renamed from: h */
    public static final C7505t2 f33052h = m41924a("measurement.upload.max_bundles", 100, 100, C7546x1.f33173a);

    /* renamed from: h0 */
    public static final C7505t2 f33053h0 = m41924a("measurement.service.storage_consent_support_version", 203600, 203600, C7460p1.f32850a);

    /* renamed from: i */
    public static final C7505t2 f33054i = m41924a("measurement.upload.max_batch_size", 65536, 65536, C7395j2.f32600a);

    /* renamed from: i0 */
    public static final C7505t2 f33055i0;

    /* renamed from: j */
    public static final C7505t2 f33056j = m41924a("measurement.upload.max_bundle_size", 65536, 65536, C7406k2.f32661a);

    /* renamed from: j0 */
    public static final C7505t2 f33057j0;

    /* renamed from: k */
    public static final C7505t2 f33058k;

    /* renamed from: k0 */
    public static final C7505t2 f33059k0;

    /* renamed from: l */
    public static final C7505t2 f33060l = m41924a("measurement.upload.max_events_per_day", 100000, 100000, C7428m2.f32712a);

    /* renamed from: l0 */
    public static final C7505t2 f33061l0;

    /* renamed from: m */
    public static final C7505t2 f33062m;

    /* renamed from: m0 */
    public static final C7505t2 f33063m0;

    /* renamed from: n */
    public static final C7505t2 f33064n = m41924a("measurement.upload.max_public_events_per_day", 50000, 50000, C7350f1.f32461a);

    /* renamed from: n0 */
    public static final C7505t2 f33065n0;

    /* renamed from: o */
    public static final C7505t2 f33066o = m41924a("measurement.upload.max_conversions_per_day", 10000, 10000, C7471q1.f32882a);

    /* renamed from: o0 */
    public static final C7505t2 f33067o0;

    /* renamed from: p */
    public static final C7505t2 f33068p = m41924a("measurement.upload.max_realtime_events_per_day", 10, 10, C7318c2.f32380a);

    /* renamed from: p0 */
    public static final C7505t2 f33069p0;

    /* renamed from: q */
    public static final C7505t2 f33070q = m41924a("measurement.store.max_stored_events_per_app", 100000, 100000, C7439n2.f32763a);

    /* renamed from: q0 */
    public static final C7505t2 f33071q0;

    /* renamed from: r */
    public static final C7505t2 f33072r = m41924a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C7450o2.f32811a);

    /* renamed from: r0 */
    public static final C7505t2 f33073r0;

    /* renamed from: s */
    public static final C7505t2 f33074s = m41924a("measurement.upload.backoff_period", 43200000L, 43200000L, C7461p2.f32851a);

    /* renamed from: s0 */
    public static final C7505t2 f33075s0;

    /* renamed from: t */
    public static final C7505t2 f33076t = m41924a("measurement.upload.window_interval", 3600000L, 3600000L, C7472q2.f32883a);

    /* renamed from: t0 */
    public static final C7505t2 f33077t0;

    /* renamed from: u */
    public static final C7505t2 f33078u = m41924a("measurement.upload.interval", 3600000L, 3600000L, C7544x.f33171a);

    /* renamed from: u0 */
    public static final C7505t2 f33079u0;

    /* renamed from: v */
    public static final C7505t2 f33080v = m41924a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C7564z.f33213a);

    /* renamed from: v0 */
    public static final C7505t2 f33081v0;

    /* renamed from: w */
    public static final C7505t2 f33082w = m41924a("measurement.upload.debug_upload_interval", 1000L, 1000L, C7305b0.f32365a);

    /* renamed from: w0 */
    public static final C7505t2 f33083w0;

    /* renamed from: x */
    public static final C7505t2 f33084x = m41924a("measurement.upload.minimum_delay", 500L, 500L, C7316c0.f32378a);

    /* renamed from: y */
    public static final C7505t2 f33085y = m41924a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C7327d0.f32407a);

    /* renamed from: z */
    public static final C7505t2 f33086z = m41924a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C7338e0.f32445a);

    static {
        Integer valueOf = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
        f33058k = m41924a("measurement.upload.max_events_per_bundle", valueOf, valueOf, C7417l2.f32688a);
        f33062m = m41924a("measurement.upload.max_error_events_per_day", valueOf, valueOf, C7503t0.f32979a);
        Boolean bool = Boolean.FALSE;
        f33023L = m41924a("measurement.test.boolean_flag", bool, bool, C7459p0.f32849a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f33027P = m41924a("measurement.test.double_flag", valueOf2, valueOf2, C7514u0.f33010a);
        Boolean bool2 = Boolean.TRUE;
        f33032U = m41924a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C7306b1.f32366a);
        f33033V = m41924a("measurement.quality.checksum", bool, bool, (C7483r2) null);
        f33034W = m41924a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C7317c1.f32379a);
        f33035X = m41924a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C7328d1.f32408a);
        f33036Y = m41924a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C7339e1.f32446a);
        f33037Z = m41924a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C7361g1.f32495a);
        f33039a0 = m41924a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C7372h1.f32529a);
        f33041b0 = m41924a("measurement.lifecycle.app_in_background_parameter", bool, bool, C7383i1.f32552a);
        f33043c0 = m41924a("measurement.integration.disable_firebase_instance_id", bool, bool, C7394j1.f32599a);
        f33045d0 = m41924a("measurement.collection.service.update_with_analytics_fix", bool, bool, C7405k1.f32660a);
        f33047e0 = m41924a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C7427m1.f32711a);
        f33049f0 = m41924a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C7438n1.f32762a);
        f33051g0 = m41924a("measurement.collection.synthetic_data_mitigation", bool, bool, C7449o1.f32810a);
        f33055i0 = m41924a("measurement.client.click_identifier_control.dev", bool, bool, C7482r1.f32923a);
        f33057j0 = m41924a("measurement.service.click_identifier_control", bool, bool, C7493s1.f32942a);
        f33059k0 = m41924a("measurement.service.store_null_safelist", bool2, bool2, C7504t1.f32980a);
        f33061l0 = m41924a("measurement.service.store_safelist", bool2, bool2, C7515u1.f33011a);
        f33063m0 = m41924a("measurement.collection.enable_session_stitching_token.service", bool, bool, C7526v1.f33106a);
        f33065n0 = m41924a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, C7536w1.f33136a);
        f33067o0 = m41924a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, C7556y1.f33196a);
        f33069p0 = m41924a("measurement.session_stitching_token_enabled", bool, bool, C7566z1.f33216a);
        f33071q0 = m41924a("measurement.redaction.e_tag", bool2, bool2, C7307b2.f32367a);
        f33073r0 = m41924a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, C7329d2.f32409a);
        f33075s0 = m41924a("measurement.redaction.retain_major_os_version", bool2, bool2, C7340e2.f32447a);
        f33077t0 = m41924a("measurement.redaction.scion_payload_generator", bool2, bool2, C7351f2.f32462a);
        f33079u0 = m41924a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, C7362g2.f32496a);
        f33081v0 = m41924a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, C7373h2.f32530a);
        f33083w0 = m41924a("measurement.sessionid.enable_client_session_id", bool2, bool2, C7384i2.f32553a);
    }

    /* renamed from: a */
    static C7505t2 m41924a(String str, Object obj, Object obj2, C7483r2 r2Var) {
        C7505t2 t2Var = new C7505t2(str, obj, obj2, r2Var, (C13024d) null);
        f33038a.add(t2Var);
        return t2Var;
    }

    /* renamed from: c */
    public static Map m41926c(Context context) {
        C6958f6 a = C6958f6.m40016a(context.getContentResolver(), C7136q6.m40654a("com.google.android.gms.measurement"), C13022c.f47281a);
        return a == null ? Collections.emptyMap() : a.mo23410b();
    }
}
