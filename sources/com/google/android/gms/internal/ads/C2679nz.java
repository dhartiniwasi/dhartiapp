package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.AdError;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.nz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2679nz {

    /* renamed from: A */
    public static final C2344ez f14242A;

    /* renamed from: A0 */
    public static final C2344ez f14243A0;

    /* renamed from: A1 */
    public static final C2344ez f14244A1 = C2344ez.m12350g(1, "gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: A2 */
    public static final C2344ez f14245A2 = C2344ez.m12350g(1, "gads:gestures:as2percentage", 0);

    /* renamed from: A3 */
    public static final C2344ez f14246A3 = C2344ez.m12351h(1, "gads:cache:function_call_timeout", 5000);

    /* renamed from: A4 */
    public static final C2344ez f14247A4;

    /* renamed from: A5 */
    public static final C2344ez f14248A5 = C2344ez.m12353j(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: A6 */
    public static final C2344ez f14249A6 = C2344ez.m12353j(1, "gads:scar:google_view_domain_suffixes", ".doubleclick.net,.googleadservices.com,.googlesyndication.com");

    /* renamed from: A7 */
    public static final C2344ez f14250A7 = C2344ez.m12353j(1, "gads:plugin_regex", "^Flutter-GMA-.*|^unity-.*");

    /* renamed from: A8 */
    public static final C2344ez f14251A8;

    /* renamed from: B */
    public static final C2344ez f14252B = C2344ez.m12351h(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: B0 */
    public static final C2344ez f14253B0 = C2344ez.m12350g(1, "gads:show_interstitial_with_context:min_version", ScarAdapterFactory.CODE_19_8);

    /* renamed from: B1 */
    public static final C2344ez f14254B1 = C2344ez.m12351h(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: B2 */
    public static final C2344ez f14255B2;

    /* renamed from: B3 */
    public static final C2344ez f14256B3;

    /* renamed from: B4 */
    public static final C2344ez f14257B4;

    /* renamed from: B5 */
    public static final C2344ez f14258B5 = C2344ez.m12353j(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: B6 */
    public static final C2344ez f14259B6;

    /* renamed from: B7 */
    public static final C2344ez f14260B7 = C2344ez.m12350g(1, "gads:app_event_queue_size", 20);

    /* renamed from: B8 */
    public static final C2344ez f14261B8;

    /* renamed from: C */
    public static final C2344ez f14262C;

    /* renamed from: C0 */
    public static final C2344ez f14263C0;

    /* renamed from: C1 */
    public static final C2344ez f14264C1 = C2344ez.m12351h(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: C2 */
    public static final C2344ez f14265C2;

    /* renamed from: C3 */
    public static final C2344ez f14266C3;

    /* renamed from: C4 */
    public static final C2344ez f14267C4;

    /* renamed from: C5 */
    public static final C2344ez f14268C5 = C2344ez.m12350g(1, "gads:rewarded_precache_pool:size", 1);

    /* renamed from: C6 */
    public static final C2344ez f14269C6;

    /* renamed from: C7 */
    public static final C2344ez f14270C7;

    /* renamed from: C8 */
    public static final C2344ez f14271C8;

    /* renamed from: D */
    public static final C2344ez f14272D;

    /* renamed from: D0 */
    public static final C2344ez f14273D0;

    /* renamed from: D1 */
    public static final C2344ez f14274D1;

    /* renamed from: D2 */
    public static final C2344ez f14275D2;

    /* renamed from: D3 */
    public static final C2344ez f14276D3 = C2344ez.m12353j(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: D4 */
    public static final C2344ez f14277D4;

    /* renamed from: D5 */
    public static final C2344ez f14278D5 = C2344ez.m12350g(1, "gads:interstitial_precache_pool:size", 1);

    /* renamed from: D6 */
    public static final C2344ez f14279D6;

    /* renamed from: D7 */
    public static final C2344ez f14280D7;

    /* renamed from: D8 */
    public static final C2344ez f14281D8;

    /* renamed from: E */
    public static final C2344ez f14282E = C2344ez.m12350g(1, "gads:video:spinner:scale", 4);

    /* renamed from: E0 */
    public static final C2344ez f14283E0;

    /* renamed from: E1 */
    public static final C2344ez f14284E1;

    /* renamed from: E2 */
    public static final C2344ez f14285E2;

    /* renamed from: E3 */
    public static final C2344ez f14286E3 = C2344ez.m12350g(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: E4 */
    public static final C2344ez f14287E4 = C2344ez.m12350g(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: E5 */
    public static final C2344ez f14288E5 = C2344ez.m12350g(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);

    /* renamed from: E6 */
    public static final C2344ez f14289E6;

    /* renamed from: E7 */
    public static final C2344ez f14290E7;

    /* renamed from: E8 */
    public static final C2344ez f14291E8;

    /* renamed from: F */
    public static final C2344ez f14292F = C2344ez.m12351h(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: F0 */
    public static final C2344ez f14293F0;

    /* renamed from: F1 */
    public static final C2344ez f14294F1;

    /* renamed from: F2 */
    public static final C2344ez f14295F2;

    /* renamed from: F3 */
    public static final C2344ez f14296F3;

    /* renamed from: F4 */
    public static final C2344ez f14297F4;

    /* renamed from: F5 */
    public static final C2344ez f14298F5 = C2344ez.m12350g(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);

    /* renamed from: F6 */
    public static final C2344ez f14299F6;

    /* renamed from: F7 */
    public static final C2344ez f14300F7 = C2344ez.m12353j(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");

    /* renamed from: F8 */
    public static final C2344ez f14301F8;

    /* renamed from: G */
    public static final C2344ez f14302G;

    /* renamed from: G0 */
    public static final C2344ez f14303G0;

    /* renamed from: G1 */
    public static final C2344ez f14304G1;

    /* renamed from: G2 */
    public static final C2344ez f14305G2;

    /* renamed from: G3 */
    public static final C2344ez f14306G3;

    /* renamed from: G4 */
    public static final C2344ez f14307G4;

    /* renamed from: G5 */
    public static final C2344ez f14308G5 = C2344ez.m12353j(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: G6 */
    public static final C2344ez f14309G6 = C2344ez.m12350g(1, "gads:native_ads_signal:timeout", AdError.NETWORK_ERROR_CODE);

    /* renamed from: G7 */
    public static final C2344ez f14310G7 = C2344ez.m12350g(1, "gads:inspector:max_ad_life_cycles", AdError.NETWORK_ERROR_CODE);

    /* renamed from: G8 */
    public static final C2344ez f14311G8;

    /* renamed from: H */
    public static final C2344ez f14312H;

    /* renamed from: H0 */
    public static final C2344ez f14313H0 = C2344ez.m12353j(1, "gads:webview_cookie_url", "https://googleads.g.doubleclick.net");

    /* renamed from: H1 */
    public static final C2344ez f14314H1;

    /* renamed from: H2 */
    public static final C2344ez f14315H2;

    /* renamed from: H3 */
    public static final C2344ez f14316H3;

    /* renamed from: H4 */
    public static final C2344ez f14317H4;

    /* renamed from: H5 */
    public static final C2344ez f14318H5 = C2344ez.m12353j(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: H6 */
    public static final C2344ez f14319H6;

    /* renamed from: H7 */
    public static final C2344ez f14320H7 = C2344ez.m12350g(1, "gads:inspector:ui_invocation_millis", AdError.SERVER_ERROR_CODE);

    /* renamed from: H8 */
    public static final C2344ez f14321H8;

    /* renamed from: I */
    public static final C2344ez f14322I = C2344ez.m12353j(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: I0 */
    public static final C2344ez f14323I0;

    /* renamed from: I1 */
    public static final C2344ez f14324I1 = C2344ez.m12351h(1, "gads:video:range_http_data_source_high_water_mark", 614400);

    /* renamed from: I2 */
    public static final C2344ez f14325I2;

    /* renamed from: I3 */
    public static final C2344ez f14326I3;

    /* renamed from: I4 */
    public static final C2344ez f14327I4;

    /* renamed from: I5 */
    public static final C2344ez f14328I5 = C2344ez.m12353j(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: I6 */
    public static final C2344ez f14329I6;

    /* renamed from: I7 */
    public static final C2344ez f14330I7;

    /* renamed from: I8 */
    public static final C2344ez f14331I8;

    /* renamed from: J */
    public static final C2344ez f14332J = C2344ez.m12350g(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: J0 */
    public static final C2344ez f14333J0;

    /* renamed from: J1 */
    public static final C2344ez f14334J1 = C2344ez.m12351h(1, "gads:video:range_http_data_source_low_water_mark", 102400);

    /* renamed from: J2 */
    public static final C2344ez f14335J2;

    /* renamed from: J3 */
    public static final C2344ez f14336J3;

    /* renamed from: J4 */
    public static final C2344ez f14337J4 = C2344ez.m12353j(1, "gads:uri_query_to_map_bg_thread:types", "/result");

    /* renamed from: J5 */
    public static final C2344ez f14338J5 = C2344ez.m12353j(1, "gads:app_open_precache_pool:discard_strategy", "oldest");

    /* renamed from: J6 */
    public static final C2344ez f14339J6;

    /* renamed from: J7 */
    public static final C2344ez f14340J7 = C2344ez.m12349f(1, "gads:inspector:shake_strength", 2.0f);

    /* renamed from: J8 */
    public static final C2344ez f14341J8;

    /* renamed from: K */
    public static final C2344ez f14342K = C2344ez.m12353j(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: K0 */
    public static final C2344ez f14343K0;

    /* renamed from: K1 */
    public static final C2344ez f14344K1;

    /* renamed from: K2 */
    public static final C2344ez f14345K2;

    /* renamed from: K3 */
    public static final C2344ez f14346K3;

    /* renamed from: K4 */
    public static final C2344ez f14347K4 = C2344ez.m12350g(1, "gads:uri_query_to_map_bg_thread:min_length", AdError.NETWORK_ERROR_CODE);

    /* renamed from: K5 */
    public static final C2344ez f14348K5 = C2344ez.m12350g(1, "gads:app_open_precache_pool:count", 0);

    /* renamed from: K6 */
    public static final C2344ez f14349K6;

    /* renamed from: K7 */
    public static final C2344ez f14350K7 = C2344ez.m12350g(1, "gads:inspector:shake_interval", 500);

    /* renamed from: K8 */
    public static final C2344ez f14351K8;

    /* renamed from: L */
    public static final C2344ez f14352L = C2344ez.m12353j(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: L0 */
    public static final C2344ez f14353L0;

    /* renamed from: L1 */
    public static final C2344ez f14354L1;

    /* renamed from: L2 */
    public static final C2344ez f14355L2;

    /* renamed from: L3 */
    public static final C2344ez f14356L3;

    /* renamed from: L4 */
    public static final C2344ez f14357L4;

    /* renamed from: L5 */
    public static final C2344ez f14358L5 = C2344ez.m12353j(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: L6 */
    public static final C2344ez f14359L6 = C2344ez.m12350g(1, "gads:interscroller:min_width", 300);

    /* renamed from: L7 */
    public static final C2344ez f14360L7 = C2344ez.m12350g(1, "gads:inspector:shake_reset_time_ms", 3000);

    /* renamed from: L8 */
    public static final C2344ez f14361L8;

    /* renamed from: M */
    public static final C2344ez f14362M = C2344ez.m12353j(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");

    /* renamed from: M0 */
    public static final C2344ez f14363M0 = C2344ez.m12351h(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: M1 */
    public static final C2344ez f14364M1;

    /* renamed from: M2 */
    public static final C2344ez f14365M2 = C2344ez.m12350g(1, "gads:gass:impression_retry:count", 0);

    /* renamed from: M3 */
    public static final C2344ez f14366M3 = C2344ez.m12353j(1, "gad:publisher_testing:cct_v2:enabled_list", "");

    /* renamed from: M4 */
    public static final C2344ez f14367M4;

    /* renamed from: M5 */
    public static final C2344ez f14368M5 = C2344ez.m12350g(1, "gads:app_open_precache_pool:size", 1);

    /* renamed from: M6 */
    public static final C2344ez f14369M6 = C2344ez.m12350g(1, "gads:interscroller:min_height", 250);

    /* renamed from: M7 */
    public static final C2344ez f14370M7 = C2344ez.m12350g(1, "gads:inspector:shake_count", 3);

    /* renamed from: M8 */
    public static final C2344ez f14371M8;

    /* renamed from: N */
    public static final C2344ez f14372N = C2344ez.m12353j(1, "gad:mraid:version", "3.0");

    /* renamed from: N0 */
    public static final C2344ez f14373N0 = C2344ez.m12351h(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: N1 */
    public static final C2344ez f14374N1;

    /* renamed from: N2 */
    public static final C2344ez f14375N2 = C2344ez.m12350g(1, "gads:gass:impression_retry:delay_ms", 400);

    /* renamed from: N3 */
    public static final C2344ez f14376N3;

    /* renamed from: N4 */
    public static final C2344ez f14377N4;

    /* renamed from: N5 */
    public static final C2344ez f14378N5 = C2344ez.m12350g(1, "gads:app_open_precache_pool:ad_time_limit", 14400);

    /* renamed from: N6 */
    public static final C2344ez f14379N6;

    /* renamed from: N7 */
    public static final C2344ez f14380N7;

    /* renamed from: N8 */
    public static final C2344ez f14381N8 = C2344ez.m12350g(1, "gads:v46_granular_version", 221080000);

    /* renamed from: O */
    public static final C2344ez f14382O;

    /* renamed from: O0 */
    public static final C2344ez f14383O0;

    /* renamed from: O1 */
    public static final C2344ez f14384O1;

    /* renamed from: O2 */
    public static final C2344ez f14385O2 = C2344ez.m12354k(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: O3 */
    public static final C2344ez f14386O3 = C2344ez.m12351h(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: O4 */
    public static final C2344ez f14387O4;

    /* renamed from: O5 */
    public static final C2344ez f14388O5;

    /* renamed from: O6 */
    public static final C2344ez f14389O6;

    /* renamed from: O7 */
    public static final C2344ez f14390O7 = C2344ez.m12349f(1, "gads:inspector:flick_rotation_threshold", 45.0f);

    /* renamed from: O8 */
    public static final C2344ez f14391O8 = C2344ez.m12350g(1, "gads:v48_granular_version", 221909000);

    /* renamed from: P */
    public static final C2344ez f14392P;

    /* renamed from: P0 */
    public static final C2344ez f14393P0 = C2344ez.m12351h(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: P1 */
    public static final C2344ez f14394P1;

    /* renamed from: P2 */
    public static final C2344ez f14395P2 = C2344ez.m12353j(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: P3 */
    public static final C2344ez f14396P3 = C2344ez.m12353j(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: P4 */
    public static final C2344ez f14397P4;

    /* renamed from: P5 */
    public static final C2344ez f14398P5;

    /* renamed from: P6 */
    public static final C2344ez f14399P6;

    /* renamed from: P7 */
    public static final C2344ez f14400P7 = C2344ez.m12350g(1, "gads:inspector:flick_reset_time_ms", 3000);

    /* renamed from: P8 */
    public static final C2344ez f14401P8;

    /* renamed from: Q */
    public static final C2344ez f14402Q = C2344ez.m12350g(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: Q0 */
    public static final C2344ez f14403Q0;

    /* renamed from: Q1 */
    public static final C2344ez f14404Q1;

    /* renamed from: Q2 */
    public static final C2344ez f14405Q2;

    /* renamed from: Q3 */
    public static final C2344ez f14406Q3 = C2344ez.m12353j(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: Q4 */
    public static final C2344ez f14407Q4;

    /* renamed from: Q5 */
    public static final C2344ez f14408Q5;

    /* renamed from: Q6 */
    public static final C2344ez f14409Q6;

    /* renamed from: Q7 */
    public static final C2344ez f14410Q7 = C2344ez.m12350g(1, "gads:inspector:flick_count", 2);

    /* renamed from: Q8 */
    public static final C2344ez f14411Q8;

    /* renamed from: R */
    public static final C2344ez f14412R = C2344ez.m12350g(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: R0 */
    public static final C2344ez f14413R0 = C2344ez.m12351h(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: R1 */
    public static final C2344ez f14414R1;

    /* renamed from: R2 */
    public static final C2344ez f14415R2 = C2344ez.m12353j(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: R3 */
    public static final C2344ez f14416R3 = C2344ez.m12353j(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: R4 */
    public static final C2344ez f14417R4;

    /* renamed from: R5 */
    public static final C2344ez f14418R5;

    /* renamed from: R6 */
    public static final C2344ez f14419R6 = C2344ez.m12353j(1, "gad:publisher_testing:policy_validator:enabled_list", "");

    /* renamed from: R7 */
    public static final C2344ez f14420R7 = C2344ez.m12350g(1, "gads:inspector:icon_width_px", 256);

    /* renamed from: R8 */
    public static final C2344ez f14421R8;

    /* renamed from: S */
    public static final C2344ez f14422S = C2344ez.m12350g(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: S0 */
    public static final C2344ez f14423S0;

    /* renamed from: S1 */
    public static final C2344ez f14424S1;

    /* renamed from: S2 */
    public static final C2344ez f14425S2 = C2344ez.m12353j(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: S3 */
    public static final C2344ez f14426S3 = C2344ez.m12353j(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: S4 */
    public static final C2344ez f14427S4;

    /* renamed from: S5 */
    public static final C2344ez f14428S5;

    /* renamed from: S6 */
    public static final C2344ez f14429S6 = C2344ez.m12350g(1, "gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: S7 */
    public static final C2344ez f14430S7 = C2344ez.m12350g(1, "gads:inspector:icon_height_px", 256);

    /* renamed from: S8 */
    public static final C2344ez f14431S8;

    /* renamed from: T */
    public static final C2344ez f14432T = C2344ez.m12353j(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: T0 */
    public static final C2344ez f14433T0;

    /* renamed from: T1 */
    public static final C2344ez f14434T1 = C2344ez.m12350g(1, "gads:gestures:a2:enabled", 0);

    /* renamed from: T2 */
    public static final C2344ez f14435T2;

    /* renamed from: T3 */
    public static final C2344ez f14436T3 = C2344ez.m12350g(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: T4 */
    public static final C2344ez f14437T4;

    /* renamed from: T5 */
    public static final C2344ez f14438T5;

    /* renamed from: T6 */
    public static final C2344ez f14439T6;

    /* renamed from: T7 */
    public static final C2344ez f14440T7;

    /* renamed from: T8 */
    public static final C2344ez f14441T8;

    /* renamed from: U */
    public static final C2344ez f14442U = C2344ez.m12353j(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: U0 */
    public static final C2344ez f14443U0;

    /* renamed from: U1 */
    public static final C2344ez f14444U1;

    /* renamed from: U2 */
    public static final C2344ez f14445U2 = C2344ez.m12350g(1, "gads:native_video_load_timeout", 10);

    /* renamed from: U3 */
    public static final C2344ez f14446U3 = C2344ez.m12350g(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: U4 */
    public static final C2344ez f14447U4;

    /* renamed from: U5 */
    public static final C2344ez f14448U5;

    /* renamed from: U6 */
    public static final C2344ez f14449U6 = C2344ez.m12350g(1, "gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: U7 */
    public static final C2344ez f14450U7;

    /* renamed from: U8 */
    public static final C2344ez f14451U8;

    /* renamed from: V */
    public static final C2344ez f14452V;

    /* renamed from: V0 */
    public static final C2344ez f14453V0 = C2344ez.m12353j(1, "gads:close_button_asset_name", "default");

    /* renamed from: V1 */
    public static final C2344ez f14454V1;

    /* renamed from: V2 */
    public static final C2344ez f14455V2 = C2344ez.m12353j(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: V3 */
    public static final C2344ez f14456V3;

    /* renamed from: V4 */
    public static final C2344ez f14457V4;

    /* renamed from: V5 */
    public static final C2344ez f14458V5;

    /* renamed from: V6 */
    public static final C2344ez f14459V6 = C2344ez.m12350g(1, "gads:policy_validator_overlay_height:dp", 140);

    /* renamed from: V7 */
    public static final C2344ez f14460V7;

    /* renamed from: W */
    public static final C2344ez f14461W;

    /* renamed from: W0 */
    public static final C2344ez f14462W0 = C2344ez.m12351h(1, "gads:close_button_fade_in_duration_ms", 0);

    /* renamed from: W1 */
    public static final C2344ez f14463W1;

    /* renamed from: W2 */
    public static final C2344ez f14464W2;

    /* renamed from: W3 */
    public static final C2344ez f14465W3;

    /* renamed from: W4 */
    public static final C2344ez f14466W4;

    /* renamed from: W5 */
    public static final C2344ez f14467W5 = C2344ez.m12353j(1, "gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: W6 */
    public static final C2344ez f14468W6;

    /* renamed from: W7 */
    public static final C2344ez f14469W7;

    /* renamed from: X */
    public static final C2344ez f14470X;

    /* renamed from: X0 */
    public static final C2344ez f14471X0;

    /* renamed from: X1 */
    public static final C2344ez f14472X1;

    /* renamed from: X2 */
    public static final C2344ez f14473X2;

    /* renamed from: X3 */
    public static final C2344ez f14474X3;

    /* renamed from: X4 */
    public static final C2344ez f14475X4;

    /* renamed from: X5 */
    public static final C2344ez f14476X5;

    /* renamed from: X6 */
    public static final C2344ez f14477X6;

    /* renamed from: X7 */
    public static final C2344ez f14478X7;

    /* renamed from: Y */
    public static final C2344ez f14479Y;

    /* renamed from: Y0 */
    public static final C2344ez f14480Y0;

    /* renamed from: Y1 */
    public static final C2344ez f14481Y1;

    /* renamed from: Y2 */
    public static final C2344ez f14482Y2;

    /* renamed from: Y3 */
    public static final C2344ez f14483Y3;

    /* renamed from: Y4 */
    public static final C2344ez f14484Y4;

    /* renamed from: Y5 */
    public static final C2344ez f14485Y5;

    /* renamed from: Y6 */
    public static final C2344ez f14486Y6;

    /* renamed from: Y7 */
    public static final C2344ez f14487Y7;

    /* renamed from: Z */
    public static final C2344ez f14488Z = C2344ez.m12353j(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: Z0 */
    public static final C2344ez f14489Z0;

    /* renamed from: Z1 */
    public static final C2344ez f14490Z1 = C2344ez.m12353j(1, "gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");

    /* renamed from: Z2 */
    public static final C2344ez f14491Z2;

    /* renamed from: Z3 */
    public static final C2344ez f14492Z3 = C2344ez.m12350g(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: Z4 */
    public static final C2344ez f14493Z4;

    /* renamed from: Z5 */
    public static final C2344ez f14494Z5;

    /* renamed from: Z6 */
    public static final C2344ez f14495Z6;

    /* renamed from: Z7 */
    public static final C2344ez f14496Z7;

    /* renamed from: a */
    public static final C2344ez f14497a = C2344ez.m12353j(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0 */
    public static final C2344ez f14498a0 = C2344ez.m12353j(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: a1 */
    public static final C2344ez f14499a1 = C2344ez.m12350g(1, "gads:banner_refresh_time:seconds", 60);

    /* renamed from: a2 */
    public static final C2344ez f14500a2 = C2344ez.m12353j(1, "gads:msa:experiments:incapi:debug_cert", "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b");

    /* renamed from: a3 */
    public static final C2344ez f14501a3;

    /* renamed from: a4 */
    public static final C2344ez f14502a4;

    /* renamed from: a5 */
    public static final C2344ez f14503a5 = C2344ez.m12351h(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: a6 */
    public static final C2344ez f14504a6;

    /* renamed from: a7 */
    public static final C2344ez f14505a7;

    /* renamed from: a8 */
    public static final C2344ez f14506a8;

    /* renamed from: b */
    public static final C2344ez f14507b = C2344ez.m12353j(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: b0 */
    public static final C2344ez f14508b0;

    /* renamed from: b1 */
    public static final C2344ez f14509b1;

    /* renamed from: b2 */
    public static final C2344ez f14510b2;

    /* renamed from: b3 */
    public static final C2344ez f14511b3;

    /* renamed from: b4 */
    public static final C2344ez f14512b4;

    /* renamed from: b5 */
    public static final C2344ez f14513b5 = C2344ez.m12350g(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: b6 */
    public static final C2344ez f14514b6 = C2344ez.m12350g(1, "gads:maximum_query_json_cache_size", 200);

    /* renamed from: b7 */
    public static final C2344ez f14515b7 = C2344ez.m12353j(1, "gads:server_transaction_source:list", "Network");

    /* renamed from: b8 */
    public static final C2344ez f14516b8;

    /* renamed from: c */
    public static final q00 f14517c = j10.f11173d;

    /* renamed from: c0 */
    public static final C2344ez f14518c0 = C2344ez.m12353j(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: c1 */
    public static final C2344ez f14519c1 = C2344ez.m12353j(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: c2 */
    public static final q00 f14520c2 = i10.f10577b;

    /* renamed from: c3 */
    public static final C2344ez f14521c3;

    /* renamed from: c4 */
    public static final C2344ez f14522c4;

    /* renamed from: c5 */
    public static final C2344ez f14523c5 = C2344ez.m12350g(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: c6 */
    public static final C2344ez f14524c6 = C2344ez.m12351h(1, "gads:timeout_query_json_cache:millis", 3600000);

    /* renamed from: c7 */
    public static final C2344ez f14525c7;

    /* renamed from: c8 */
    public static final C2344ez f14526c8;

    /* renamed from: d */
    public static final C2344ez f14527d = C2344ez.m12350g(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: d0 */
    public static final C2344ez f14528d0 = C2344ez.m12351h(1, "gads:sai:timeout_ms", -1);

    /* renamed from: d1 */
    public static final C2344ez f14529d1 = C2344ez.m12353j(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: d2 */
    public static final C2344ez f14530d2;

    /* renamed from: d3 */
    public static final C2344ez f14531d3;

    /* renamed from: d4 */
    public static final C2344ez f14532d4 = C2344ez.m12353j(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: d5 */
    public static final C2344ez f14533d5 = C2344ez.m12350g(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: d6 */
    public static final C2344ez f14534d6;

    /* renamed from: d7 */
    public static final C2344ez f14535d7;

    /* renamed from: d8 */
    public static final C2344ez f14536d8 = C2344ez.m12350g(1, "gads:max_timeout_view_click_ms", AdError.NETWORK_ERROR_CODE);

    /* renamed from: e */
    public static final C2344ez f14537e = C2344ez.m12353j(1, "gads:video_exo_player:version", "3");

    /* renamed from: e0 */
    public static final C2344ez f14538e0 = C2344ez.m12350g(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: e1 */
    public static final C2344ez f14539e1;

    /* renamed from: e2 */
    public static final C2344ez f14540e2 = C2344ez.m12351h(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: e3 */
    public static final C2344ez f14541e3;

    /* renamed from: e4 */
    public static final C2344ez f14542e4 = C2344ez.m12353j(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: e5 */
    public static final C2344ez f14543e5 = C2344ez.m12350g(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: e6 */
    public static final C2344ez f14544e6;

    /* renamed from: e7 */
    public static final C2344ez f14545e7 = C2344ez.m12350g(1, "gads:ad_error_api:min_version", 202006000);

    /* renamed from: e8 */
    public static final C2344ez f14546e8;

    /* renamed from: f */
    public static final C2344ez f14547f = C2344ez.m12350g(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: f0 */
    public static final C2344ez f14548f0;

    /* renamed from: f1 */
    public static final C2344ez f14549f1 = C2344ez.m12351h(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: f2 */
    public static final C2344ez f14550f2;

    /* renamed from: f3 */
    public static final C2344ez f14551f3;

    /* renamed from: f4 */
    public static final C2344ez f14552f4 = C2344ez.m12350g(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: f5 */
    public static final C2344ez f14553f5;

    /* renamed from: f6 */
    public static final C2344ez f14554f6;

    /* renamed from: f7 */
    public static final C2344ez f14555f7;

    /* renamed from: f8 */
    public static final C2344ez f14556f8;

    /* renamed from: g */
    public static final C2344ez f14557g = C2344ez.m12350g(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: g0 */
    public static final C2344ez f14558g0 = C2344ez.m12350g(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: g1 */
    public static final C2344ez f14559g1 = C2344ez.m12351h(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: g2 */
    public static final C2344ez f14560g2;

    /* renamed from: g3 */
    public static final C2344ez f14561g3;

    /* renamed from: g4 */
    public static final C2344ez f14562g4;

    /* renamed from: g5 */
    public static final C2344ez f14563g5;

    /* renamed from: g6 */
    public static final C2344ez f14564g6;

    /* renamed from: g7 */
    public static final C2344ez f14565g7;

    /* renamed from: g8 */
    public static final C2344ez f14566g8 = C2344ez.m12350g(1, "gads:h5ads:max_num_ad_objects", 10);

    /* renamed from: h */
    public static final C2344ez f14567h = C2344ez.m12350g(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: h0 */
    public static final C2344ez f14568h0;

    /* renamed from: h1 */
    public static final C2344ez f14569h1;

    /* renamed from: h2 */
    public static final C2344ez f14570h2;

    /* renamed from: h3 */
    public static final C2344ez f14571h3;

    /* renamed from: h4 */
    public static final C2344ez f14572h4 = C2344ez.m12350g(1, "gads:omid:destroy_webview_delay", AdError.NETWORK_ERROR_CODE);

    /* renamed from: h5 */
    public static final C2344ez f14573h5;

    /* renamed from: h6 */
    public static final C2344ez f14574h6;

    /* renamed from: h7 */
    public static final C2344ez f14575h7 = C2344ez.m12350g(1, "gads:mediation_no_fill_error:min_version", 999999999);

    /* renamed from: h8 */
    public static final C2344ez f14576h8 = C2344ez.m12350g(1, "gads:h5ads:max_gmsg_length", 5000);

    /* renamed from: i */
    public static final C2344ez f14577i = C2344ez.m12350g(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: i0 */
    public static final C2344ez f14578i0;

    /* renamed from: i1 */
    public static final C2344ez f14579i1;

    /* renamed from: i2 */
    public static final C2344ez f14580i2;

    /* renamed from: i3 */
    public static final C2344ez f14581i3 = C2344ez.m12351h(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: i4 */
    public static final C2344ez f14582i4;

    /* renamed from: i5 */
    public static final C2344ez f14583i5 = C2344ez.m12353j(1, "gads:sp:json_string", "");

    /* renamed from: i6 */
    public static final C2344ez f14584i6;

    /* renamed from: i7 */
    public static final C2344ez f14585i7;

    /* renamed from: i8 */
    public static final C2344ez f14586i8 = C2344ez.m12353j(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage||function(msg,params){window.h5_iframe.contentWindow.postMessage({messageName:'receive_message_action',parameters:{messageName:msg,parameters:params}},'*');})");

    /* renamed from: j */
    public static final C2344ez f14587j = C2344ez.m12350g(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: j0 */
    public static final C2344ez f14588j0;

    /* renamed from: j1 */
    public static final C2344ez f14589j1;

    /* renamed from: j2 */
    public static final C2344ez f14590j2;

    /* renamed from: j3 */
    public static final C2344ez f14591j3 = C2344ez.m12351h(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: j4 */
    public static final C2344ez f14592j4;

    /* renamed from: j5 */
    public static final C2344ez f14593j5;

    /* renamed from: j6 */
    public static final C2344ez f14594j6;

    /* renamed from: j7 */
    public static final C2344ez f14595j7 = C2344ez.m12350g(1, "gads:offline_database_version:version", 1);

    /* renamed from: j8 */
    public static final C2344ez f14596j8;

    /* renamed from: k */
    public static final C2344ez f14597k = C2344ez.m12350g(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: k0 */
    public static final C2344ez f14598k0;

    /* renamed from: k1 */
    public static final C2344ez f14599k1 = C2344ez.m12353j(1, "gads:logged_adapter_version_classes", "");

    /* renamed from: k2 */
    public static final C2344ez f14600k2;

    /* renamed from: k3 */
    public static final C2344ez f14601k3 = C2344ez.m12350g(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: k4 */
    public static final C2344ez f14602k4;

    /* renamed from: k5 */
    public static final C2344ez f14603k5 = C2344ez.m12350g(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: k6 */
    public static final C2344ez f14604k6 = C2344ez.m12351h(1, "gads:timeout_signal_collection_in_exp:millis", 1000);

    /* renamed from: k7 */
    public static final C2344ez f14605k7;

    /* renamed from: k8 */
    public static final C2344ez f14606k8;

    /* renamed from: l */
    public static final C2344ez f14607l = C2344ez.m12350g(1, "gads:video_exo_player:min_retry_count", -1);

    /* renamed from: l0 */
    public static final C2344ez f14608l0;

    /* renamed from: l1 */
    public static final C2344ez f14609l1 = C2344ez.m12351h(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);

    /* renamed from: l2 */
    public static final C2344ez f14610l2;

    /* renamed from: l3 */
    public static final C2344ez f14611l3 = C2344ez.m12350g(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: l4 */
    public static final C2344ez f14612l4;

    /* renamed from: l5 */
    public static final C2344ez f14613l5;

    /* renamed from: l6 */
    public static final C2344ez f14614l6;

    /* renamed from: l7 */
    public static final C2344ez f14615l7;

    /* renamed from: l8 */
    public static final C2344ez f14616l8;

    /* renamed from: m */
    public static final C2344ez f14617m;

    /* renamed from: m0 */
    public static final C2344ez f14618m0;

    /* renamed from: m1 */
    public static final C2344ez f14619m1 = C2344ez.m12353j(1, "gads:rtb_logging:regex", "(?!)");

    /* renamed from: m2 */
    public static final C2344ez f14620m2;

    /* renamed from: m3 */
    public static final C2344ez f14621m3;

    /* renamed from: m4 */
    public static final C2344ez f14622m4;

    /* renamed from: m5 */
    public static final C2344ez f14623m5;

    /* renamed from: m6 */
    public static final C2344ez f14624m6;

    /* renamed from: m7 */
    public static final C2344ez f14625m7;

    /* renamed from: m8 */
    public static final C2344ez f14626m8;

    /* renamed from: n */
    public static final C2344ez f14627n;

    /* renamed from: n0 */
    public static final C2344ez f14628n0;

    /* renamed from: n1 */
    public static final C2344ez f14629n1;

    /* renamed from: n2 */
    public static final C2344ez f14630n2;

    /* renamed from: n3 */
    public static final C2344ez f14631n3 = C2344ez.m12351h(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: n4 */
    public static final C2344ez f14632n4 = C2344ez.m12353j(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: n5 */
    public static final C2344ez f14633n5 = C2344ez.m12350g(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: n6 */
    public static final C2344ez f14634n6;

    /* renamed from: n7 */
    public static final C2344ez f14635n7;

    /* renamed from: n8 */
    public static final C2344ez f14636n8;

    /* renamed from: o */
    public static final C2344ez f14637o;

    /* renamed from: o0 */
    public static final C2344ez f14638o0;

    /* renamed from: o1 */
    public static final C2344ez f14639o1;

    /* renamed from: o2 */
    public static final C2344ez f14640o2;

    /* renamed from: o3 */
    public static final C2344ez f14641o3;

    /* renamed from: o4 */
    public static final C2344ez f14642o4;

    /* renamed from: o5 */
    public static final C2344ez f14643o5;

    /* renamed from: o6 */
    public static final C2344ez f14644o6;

    /* renamed from: o7 */
    public static final C2344ez f14645o7;

    /* renamed from: o8 */
    public static final C2344ez f14646o8;

    /* renamed from: p */
    public static final C2344ez f14647p;

    /* renamed from: p0 */
    public static final C2344ez f14648p0 = C2344ez.m12351h(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90));

    /* renamed from: p1 */
    public static final C2344ez f14649p1;

    /* renamed from: p2 */
    public static final C2344ez f14650p2 = C2344ez.m12351h(1, "gads:app_set_id_info_signal:timeout:millis", 2000);

    /* renamed from: p3 */
    public static final C2344ez f14651p3;

    /* renamed from: p4 */
    public static final C2344ez f14652p4 = C2344ez.m12350g(1, "gads:app_open_beta:min_version", 999999999);

    /* renamed from: p5 */
    public static final C2344ez f14653p5;

    /* renamed from: p6 */
    public static final C2344ez f14654p6;

    /* renamed from: p7 */
    public static final C2344ez f14655p7;

    /* renamed from: p8 */
    public static final C2344ez f14656p8 = C2344ez.m12350g(1, "gads:msa:visminalpha", 90);

    /* renamed from: q */
    public static final C2344ez f14657q = C2344ez.m12350g(1, "gads:video_exo_player:wait_timeout_ms", 500);

    /* renamed from: q0 */
    public static final C2344ez f14658q0 = C2344ez.m12353j(1, "gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");

    /* renamed from: q1 */
    public static final C2344ez f14659q1;

    /* renamed from: q2 */
    public static final C2344ez f14660q2;

    /* renamed from: q3 */
    public static final C2344ez f14661q3;

    /* renamed from: q4 */
    public static final C2344ez f14662q4 = C2344ez.m12350g(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);

    /* renamed from: q5 */
    public static final C2344ez f14663q5;

    /* renamed from: q6 */
    public static final C2344ez f14664q6;

    /* renamed from: q7 */
    public static final C2344ez f14665q7;

    /* renamed from: q8 */
    public static final C2344ez f14666q8;

    /* renamed from: r */
    public static final C2344ez f14667r;

    /* renamed from: r0 */
    public static final C2344ez f14668r0;

    /* renamed from: r1 */
    public static final C2344ez f14669r1;

    /* renamed from: r2 */
    public static final C2344ez f14670r2;

    /* renamed from: r3 */
    public static final C2344ez f14671r3 = C2344ez.m12351h(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: r4 */
    public static final C2344ez f14672r4;

    /* renamed from: r5 */
    public static final C2344ez f14673r5;

    /* renamed from: r6 */
    public static final C2344ez f14674r6;

    /* renamed from: r7 */
    public static final C2344ez f14675r7;

    /* renamed from: r8 */
    public static final C2344ez f14676r8;

    /* renamed from: s */
    public static final C2344ez f14677s = C2344ez.m12350g(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: s0 */
    public static final C2344ez f14678s0;

    /* renamed from: s1 */
    public static final C2344ez f14679s1;

    /* renamed from: s2 */
    public static final C2344ez f14680s2;

    /* renamed from: s3 */
    public static final C2344ez f14681s3;

    /* renamed from: s4 */
    public static final C2344ez f14682s4 = C2344ez.m12353j(1, "gads:nonagon:app_open:ad_unit_exclusions", "(?!)");

    /* renamed from: s5 */
    public static final C2344ez f14683s5;

    /* renamed from: s6 */
    public static final C2344ez f14684s6 = C2344ez.m12353j(1, "gads:scar_v2:user_agent:key", "ua");

    /* renamed from: s7 */
    public static final C2344ez f14685s7;

    /* renamed from: s8 */
    public static final C2344ez f14686s8;

    /* renamed from: t */
    public static final C2344ez f14687t = C2344ez.m12350g(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: t0 */
    public static final C2344ez f14688t0;

    /* renamed from: t1 */
    public static final C2344ez f14689t1;

    /* renamed from: t2 */
    public static final C2344ez f14690t2;

    /* renamed from: t3 */
    public static final C2344ez f14691t3;

    /* renamed from: t4 */
    public static final C2344ez f14692t4;

    /* renamed from: t5 */
    public static final C2344ez f14693t5;

    /* renamed from: t6 */
    public static final C2344ez f14694t6;

    /* renamed from: t7 */
    public static final C2344ez f14695t7;

    /* renamed from: t8 */
    public static final C2344ez f14696t8 = C2344ez.m12350g(1, "gads:timeout_for_show_call_succeed:ms", 3000);

    /* renamed from: u */
    public static final C2344ez f14697u = C2344ez.m12350g(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: u0 */
    public static final C2344ez f14698u0 = C2344ez.m12353j(1, "gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: u1 */
    public static final C2344ez f14699u1;

    /* renamed from: u2 */
    public static final C2344ez f14700u2;

    /* renamed from: u3 */
    public static final C2344ez f14701u3;

    /* renamed from: u4 */
    public static final C2344ez f14702u4;

    /* renamed from: u5 */
    public static final C2344ez f14703u5;

    /* renamed from: u6 */
    public static final C2344ez f14704u6 = C2344ez.m12353j(1, "gads:scar_v2:prior_click_count:key", "pcc");

    /* renamed from: u7 */
    public static final C2344ez f14705u7 = C2344ez.m12350g(1, "gads:remote_log_send_rate_ms", 60000);

    /* renamed from: u8 */
    public static final C2344ez f14706u8;

    /* renamed from: v */
    public static final C2344ez f14707v = C2344ez.m12351h(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: v0 */
    public static final C2344ez f14708v0;

    /* renamed from: v1 */
    public static final C2344ez f14709v1 = C2344ez.m12350g(1, "gads:native_ad_options_rtb:min_version", ScarAdapterFactory.CODE_19_8);

    /* renamed from: v2 */
    public static final C2344ez f14710v2 = C2344ez.m12353j(1, "gads:gestures:pk", "");

    /* renamed from: v3 */
    public static final C2344ez f14711v3 = C2344ez.m12351h(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: v4 */
    public static final C2344ez f14712v4 = C2344ez.m12353j(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: v5 */
    public static final C2344ez f14713v5;

    /* renamed from: v6 */
    public static final C2344ez f14714v6 = C2344ez.m12353j(1, "gads:scar_v2:pings_from_gma:key", "is_gma");

    /* renamed from: v7 */
    public static final C2344ez f14715v7 = C2344ez.m12350g(1, "gads:remote_log_queue_max_entries", 500);

    /* renamed from: v8 */
    public static final C2344ez f14716v8;

    /* renamed from: w */
    public static final C2344ez f14717w = C2344ez.m12351h(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: w0 */
    public static final C2344ez f14718w0;

    /* renamed from: w1 */
    public static final C2344ez f14719w1;

    /* renamed from: w2 */
    public static final C2344ez f14720w2;

    /* renamed from: w3 */
    public static final C2344ez f14721w3 = C2344ez.m12351h(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: w4 */
    public static final C2344ez f14722w4;

    /* renamed from: w5 */
    public static final C2344ez f14723w5 = C2344ez.m12350g(1, "gads:rewarded_precache_pool:count", 0);

    /* renamed from: w6 */
    public static final C2344ez f14724w6;

    /* renamed from: w7 */
    public static final C2344ez f14725w7 = C2344ez.m12353j(1, "gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1");

    /* renamed from: w8 */
    public static final C2344ez f14726w8;

    /* renamed from: x */
    public static final C2344ez f14727x = C2344ez.m12350g(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: x0 */
    public static final C2344ez f14728x0;

    /* renamed from: x1 */
    public static final C2344ez f14729x1;

    /* renamed from: x2 */
    public static final C2344ez f14730x2;

    /* renamed from: x3 */
    public static final C2344ez f14731x3;

    /* renamed from: x4 */
    public static final C2344ez f14732x4;

    /* renamed from: x5 */
    public static final C2344ez f14733x5 = C2344ez.m12350g(1, "gads:interstitial_precache_pool:count", 0);

    /* renamed from: x6 */
    public static final C2344ez f14734x6 = C2344ez.m12353j(1, "gads:scar:google_click_paths", "/aclk,/pcs/click,/dbm/clk");

    /* renamed from: x7 */
    public static final C2344ez f14735x7 = C2344ez.m12350g(1, "gads:cui_monitoring_interval_ms", 300000);

    /* renamed from: x8 */
    public static final C2344ez f14736x8;

    /* renamed from: y */
    public static final C2344ez f14737y = C2344ez.m12353j(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: y0 */
    public static final C2344ez f14738y0;

    /* renamed from: y1 */
    public static final C2344ez f14739y1;

    /* renamed from: y2 */
    public static final C2344ez f14740y2;

    /* renamed from: y3 */
    public static final C2344ez f14741y3;

    /* renamed from: y4 */
    public static final C2344ez f14742y4 = C2344ez.m12353j(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: y5 */
    public static final C2344ez f14743y5 = C2344ez.m12353j(1, "gads:rewarded_precache_pool:discard_strategy", "lru");

    /* renamed from: y6 */
    public static final C2344ez f14744y6 = C2344ez.m12353j(1, "gads:scar:google_click_domain_suffixes", ".doubleclick.net,.googleadservices.com");

    /* renamed from: y7 */
    public static final C2344ez f14745y7 = C2344ez.m12350g(1, "gads:cui_buffer_size", AdError.NETWORK_ERROR_CODE);

    /* renamed from: y8 */
    public static final C2344ez f14746y8;

    /* renamed from: z */
    public static final C2344ez f14747z = C2344ez.m12351h(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: z0 */
    public static final C2344ez f14748z0;

    /* renamed from: z1 */
    public static final C2344ez f14749z1;

    /* renamed from: z2 */
    public static final C2344ez f14750z2;

    /* renamed from: z3 */
    public static final C2344ez f14751z3;

    /* renamed from: z4 */
    public static final C2344ez f14752z4;

    /* renamed from: z5 */
    public static final C2344ez f14753z5 = C2344ez.m12353j(1, "gads:interstitial_precache_pool:discard_strategy", "lru");

    /* renamed from: z6 */
    public static final C2344ez f14754z6 = C2344ez.m12353j(1, "gads:scar:google_view_paths", "/pagead/adview,/pcs/view,/pagead/conversion,/dbm/ad");

    /* renamed from: z7 */
    public static final C2344ez f14755z7 = C2344ez.m12350g(1, "gads:cuj_automatic_flush_delay_ms", 30000);

    /* renamed from: z8 */
    public static final C2344ez f14756z8;

    static {
        Boolean bool = Boolean.TRUE;
        f14617m = C2344ez.m12352i(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f14627n = C2344ez.m12352i(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f14637o = C2344ez.m12352i(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool);
        f14647p = C2344ez.m12352i(1, "gads:video_exo_player:wait_with_timeout", bool2);
        f14667r = C2344ez.m12352i(1, "gads:null_key_bundle_to_json:enabled", bool2);
        f14242A = C2344ez.m12352i(1, "gads:video:force_watermark", bool2);
        f14262C = C2344ez.m12352i(1, "gads:video:spinner:enabled", bool2);
        f14272D = C2344ez.m12352i(1, "gads:video:shutter:enabled", bool2);
        f14302G = C2344ez.m12352i(1, "gads:video:aggressive_media_codec_release", bool2);
        f14312H = C2344ez.m12352i(1, "gads:memory_bundle:debug_info", bool2);
        f14382O = C2344ez.m12352i(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f14392P = C2344ez.m12352i(1, "gads:mraid:initial_size_fallback", bool2);
        f14452V = C2344ez.m12352i(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f14461W = C2344ez.m12352i(1, "gads:content_fetch_enable_new_content_score", bool2);
        f14470X = C2344ez.m12352i(1, "gads:content_fetch_enable_serve_once", bool2);
        f14479Y = C2344ez.m12352i(1, "gads:sai:enabled", bool);
        f14508b0 = C2344ez.m12352i(1, "gads:sai:using_macro:enabled", bool2);
        f14548f0 = C2344ez.m12352i(1, "gads:sai:app_measurement_enabled3", bool2);
        f14568h0 = C2344ez.m12352i(1, "gads:sai:force_through_reflection", bool);
        f14578i0 = C2344ez.m12352i(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f14588j0 = C2344ez.m12352i(1, "gads:sai:logging_disabled_for_drx", bool2);
        f14598k0 = C2344ez.m12352i(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f14608l0 = C2344ez.m12352i(1, "gads:idless:idless_disables_attestation", bool);
        f14618m0 = C2344ez.m12352i(1, "gads:idless:app_measurement_idless_enabled", bool);
        f14628n0 = C2344ez.m12352i(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f14638o0 = C2344ez.m12352i(1, "gads:sai:server_side_npa:enabled", bool2);
        f14668r0 = C2344ez.m12352i(1, "gads:idless:internal_state_enabled", bool);
        f14678s0 = C2344ez.m12352i(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f14688t0 = C2344ez.m12352i(1, "gads:custom_idless:enabled", bool2);
        f14708v0 = C2344ez.m12352i(1, "gads:idless_native_check:disabled", bool2);
        f14718w0 = C2344ez.m12352i(1, "gads:tfcd_deny_ad_storage:enabled", bool2);
        f14728x0 = C2344ez.m12352i(1, "gads:tfua_deny_ad_storage:enabled", bool2);
        f14738y0 = C2344ez.m12352i(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f14748z0 = C2344ez.m12352i(1, "gads:interstitial:foreground_report:enabled", bool2);
        f14243A0 = C2344ez.m12352i(1, "gads:interstitial:default_immersive", bool2);
        f14263C0 = C2344ez.m12352i(1, "gads:interstitial:ad_overlay_omit_ad_html", bool2);
        f14273D0 = C2344ez.m12352i(1, "gads:webview:error_web_response:enabled", bool2);
        f14283E0 = C2344ez.m12352i(1, "gads:webview:set_fixed_text_zoom", bool);
        f14293F0 = C2344ez.m12352i(1, "gads:webviewgone:kill_process:enabled", bool2);
        f14303G0 = C2344ez.m12352i(1, "gads:webviewgone:new_onshow:enabled", bool2);
        f14323I0 = C2344ez.m12352i(1, "gads:webview_cookie_filter:enabled", bool2);
        f14333J0 = C2344ez.m12352i(1, "gads:new_rewarded_ad:enabled", bool);
        f14343K0 = C2344ez.m12352i(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f14353L0 = C2344ez.m12352i(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f14383O0 = C2344ez.m12352i(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f14403Q0 = C2344ez.m12352i(1, "gads:disable_adid_values_in_ms", bool2);
        f14423S0 = C2344ez.m12352i(1, "gads:custom_close_blocking:enabled", bool2);
        f14433T0 = C2344ez.m12352i(1, "gads:disabling_closable_area:enabled", bool2);
        f14443U0 = C2344ez.m12352i(1, "gads:force_top_right_close_button:enabled", bool2);
        f14471X0 = C2344ez.m12352i(1, "gads:disable_click_during_fade_in", bool2);
        f14480Y0 = C2344ez.m12352i(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f14489Z0 = C2344ez.m12352i(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f14509b1 = C2344ez.m12352i(1, "gads:server_transaction_for_banner_refresh:enabled", bool2);
        f14539e1 = C2344ez.m12352i(1, "gads:include_local_global_rectangles", bool2);
        f14569h1 = C2344ez.m12352i(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f14579i1 = C2344ez.m12352i(1, "gads:position_watcher:send_scroll_data", bool2);
        f14589j1 = C2344ez.m12352i(1, "gads:gen204_signals:enabled", bool2);
        f14629n1 = C2344ez.m12352i(1, "gads:include_failure_to_instantiate_adapter:enabled", bool2);
        f14639o1 = C2344ez.m12352i(1, "gads:presentation_error:urls_enabled", bool);
        f14649p1 = C2344ez.m12352i(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f14659q1 = C2344ez.m12352i(1, "gads:native_required_assets:enabled", bool2);
        f14669r1 = C2344ez.m12352i(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f14679s1 = C2344ez.m12352i(1, "gads:include_timeout_in_rtb_signals:enabled", bool2);
        f14689t1 = C2344ez.m12352i(1, "gads:include_signal_error_code_in_rtb_signals:enabled", bool2);
        f14699u1 = C2344ez.m12352i(1, "gads:include_adapter_error_code_in_ans:enabled", bool2);
        f14719w1 = C2344ez.m12352i(1, "gads:track_view_next_runloop:enabled", bool2);
        f14729x1 = C2344ez.m12352i(1, "gads:synchronize_measurement_listener:enabled", bool2);
        f14739y1 = C2344ez.m12352i(1, "gads:native_required_assets:viewability:enabled", bool2);
        f14749z1 = C2344ez.m12352i(1, "gads:signal_adapters:enabled", bool2);
        f14274D1 = C2344ez.m12352i(1, "gads:additional_video_csi:enabled", bool);
        f14284E1 = C2344ez.m12352i(1, "gads:using_official_simple_exoplayer:enabled", bool2);
        f14294F1 = C2344ez.m12352i(1, "gads:multiple_video_playback:enabled", bool);
        f14304G1 = C2344ez.m12352i(1, "gads:pause_time_update_when_video_completed:enabled", bool2);
        f14314H1 = C2344ez.m12352i(1, "gads:video:use_range_http_data_source", bool2);
        f14344K1 = C2344ez.m12352i(1, "gads:run_exoplayer_video_stream_task_in_ui_thread:enabled", bool);
        f14354L1 = C2344ez.m12352i(1, "gads:csi:enabled_per_sampling", bool2);
        f14364M1 = C2344ez.m12352i(1, "gads:always_set_transfer_listener:enabled", bool2);
        f14374N1 = C2344ez.m12352i(1, "gads:initialization_csi:enabled", bool2);
        f14384O1 = C2344ez.m12352i(1, "gads:csi:enable_csi_latency_reporting", bool2);
        f14394P1 = C2344ez.m12352i(1, "gads:msa:experiments:enabled", bool2);
        f14404Q1 = C2344ez.m12352i(1, "gads:msa:experiments:ps:enabled", bool);
        f14414R1 = C2344ez.m12352i(1, "gads:msa:experiments:fb:enabled", bool);
        f14424S1 = C2344ez.m12352i(1, "gads:msa:experiments:ps:er", bool);
        f14444U1 = C2344ez.m12352i(1, "gads:msa:experiments:a2", bool2);
        f14454V1 = C2344ez.m12352i(1, "gads:msa:experiments:log", bool2);
        f14463W1 = C2344ez.m12352i(1, "gads:msa:experiments:vfb", bool);
        f14472X1 = C2344ez.m12352i(1, "gads:msa:experiments:incapi:enabled", bool);
        f14481Y1 = C2344ez.m12352i(1, "gads:msa:experiments:incapigass:enabled", bool2);
        f14510b2 = C2344ez.m12352i(1, "gads:gestures:clearTd:enabled", bool2);
        f14530d2 = C2344ez.m12352i(1, "gads:gestures:errorlogging:enabled", bool2);
        f14550f2 = C2344ez.m12352i(1, "gads:gestures:asig:enabled", bool2);
        f14560g2 = C2344ez.m12352i(1, "gads:gestures:ans:enabled", bool2);
        f14570h2 = C2344ez.m12352i(1, "gads:gestures:tos:enabled", bool2);
        f14580i2 = C2344ez.m12352i(1, "gads:gestures:imd:enabled", bool2);
        f14590j2 = C2344ez.m12352i(1, "gads:gestures:brt:enabled", bool);
        f14600k2 = C2344ez.m12352i(1, "gads:gestures:fpi:enabled", bool2);
        f14610l2 = C2344ez.m12352i(1, "gads:signal:app_permissions:disabled", bool2);
        f14620m2 = C2344ez.m12352i(1, "gads:signal:app_set_id_info_in_ad_request:enabled", bool2);
        f14630n2 = C2344ez.m12352i(1, "gads:signal:app_set_id_info_signal_latency_fix:enabled", bool2);
        f14640o2 = C2344ez.m12352i(1, "gads:app_set_id_info_signal:timeout:enabled", bool2);
        f14660q2 = C2344ez.m12352i(1, "gads:caching_app_set_id_info:enabled", bool2);
        f14670r2 = C2344ez.m12352i(1, "gads:signal:app_set_id_info_under_gmscore:enabled", bool2);
        f14680s2 = C2344ez.m12352i(1, "gads:signal:app_set_id_info_for_scar:enabled", bool);
        f14690t2 = C2344ez.m12352i(1, "gads:signal:ad_id_permission_signal:enabled", bool2);
        f14700u2 = C2344ez.m12352i(1, "gads:gestures:hpk:enabled", bool);
        f14720w2 = C2344ez.m12352i(1, "gads:gestures:bs:enabled", bool);
        f14730x2 = C2344ez.m12352i(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f14740y2 = C2344ez.m12352i(1, "gads:gestures:init_new_thread:enabled", bool);
        f14750z2 = C2344ez.m12352i(1, "gads:gestures:pds:enabled", bool);
        f14255B2 = C2344ez.m12352i(1, "gads:gestures:ns:enabled", bool);
        f14265C2 = C2344ez.m12352i(1, "gads:gestures:vtm:enabled", bool2);
        f14275D2 = C2344ez.m12352i(1, "gads:gestures:vdd:enabled", bool2);
        f14285E2 = C2344ez.m12352i(1, "gads:gestures:asvs:enabled", bool2);
        f14295F2 = C2344ez.m12352i(1, "gads:gadsignalsdelegate_ui_thread_fix:enabled", bool2);
        f14305G2 = C2344ez.m12352i(1, "gads:native:asset_view_touch_events", bool2);
        f14315H2 = C2344ez.m12352i(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f14325I2 = C2344ez.m12352i(1, "gads:ais:enabled", bool);
        f14335J2 = C2344ez.m12352i(1, "gads:rewarded:ssv_options_holder_holder:enabled", bool2);
        f14345K2 = C2344ez.m12352i(1, "gads:stav:enabled", bool2);
        f14355L2 = C2344ez.m12352i(1, "gads:spam:impression_ui_idle:enable", bool2);
        f14405Q2 = C2344ez.m12352i(1, "gads:js_flags:disable_phenotype", bool2);
        f14435T2 = C2344ez.m12352i(1, "gads:native:get_native_ad_view_signals", bool2);
        f14464W2 = C2344ez.m12352i(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f14473X2 = C2344ez.m12352i(1, "gads:native:media_view_match_parent:enabled", bool);
        f14482Y2 = C2344ez.m12352i(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f14491Z2 = C2344ez.m12352i(1, "gads:native:count_impression_for_assets", bool2);
        f14501a3 = C2344ez.m12352i(1, "gads:native:count_impression_on_mediaview_first_visible", bool2);
        f14511b3 = C2344ez.m12352i(1, "gads:native:count_impression_on_mediaview_entirely_visible", bool2);
        f14521c3 = C2344ez.m12352i(1, "gads:native:enable_enigma_watermarking", bool2);
        f14531d3 = C2344ez.m12352i(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f14541e3 = C2344ez.m12352i(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f14551f3 = C2344ez.m12352i(1, "gads:get_request_signals_cld:enabled", bool);
        f14561g3 = C2344ez.m12352i(1, "gads:get_request_signals_common_cld:enabled", bool);
        f14571h3 = C2344ez.m12352i(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        f14621m3 = C2344ez.m12352i(1, "gads:cache:downloader_use_high_priority", bool2);
        f14641o3 = C2344ez.m12352i(1, "gads:cache:bind_on_foreground", bool2);
        f14651p3 = C2344ez.m12352i(1, "gads:cache:bind_on_init", bool2);
        f14661q3 = C2344ez.m12352i(1, "gads:cache:bind_on_request", bool2);
        f14681s3 = C2344ez.m12352i(1, "gads:cache:unbind_on_bg_thread", bool2);
        f14691t3 = C2344ez.m12352i(1, "gads:cache:use_cache_data_source", bool2);
        f14701u3 = C2344ez.m12352i(1, "gads:cache:connection_per_read", bool2);
        f14731x3 = C2344ez.m12352i(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f14741y3 = C2344ez.m12352i(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        f14751z3 = C2344ez.m12352i(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        f14256B3 = C2344ez.m12352i(1, "gads:cache:add_itag_to_cache_key:enabled", bool);
        f14266C3 = C2344ez.m12352i(1, "gads:http_assets_cache:enabled", bool2);
        f14296F3 = C2344ez.m12352i(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f14306G3 = C2344ez.m12352i(1, "gads:chrome_custom_tabs:disabled", bool2);
        f14316H3 = C2344ez.m12352i(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f14326I3 = C2344ez.m12352i(1, "gads:cct_v2_connection:enabled", bool2);
        f14336J3 = C2344ez.m12352i(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f14346K3 = C2344ez.m12352i(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f14356L3 = C2344ez.m12352i(1, "gad:cct_v2_beta:enabled", bool2);
        f14376N3 = C2344ez.m12352i(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f14456V3 = C2344ez.m12352i(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f14465W3 = C2344ez.m12352i(1, "gad:interstitial_for_multi_window", bool2);
        f14474X3 = C2344ez.m12352i(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f14483Y3 = C2344ez.m12352i(1, "gad:interstitial_multi_window_method", bool2);
        f14502a4 = C2344ez.m12352i(1, "gads:clearcut_logging:enabled", bool2);
        f14512b4 = C2344ez.m12352i(1, "gads:clearcut_logging:write_to_file", bool2);
        f14522c4 = C2344ez.m12352i(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f14562g4 = C2344ez.m12352i(1, "gads:omid:enabled", bool);
        f14582i4 = C2344ez.m12352i(1, "gads:omid_use_admob_impl_dependency:enabled", bool);
        f14592j4 = C2344ez.m12352i(1, "gads:omid_use_base_64_encoding_for_native_html:enabled", bool);
        f14602k4 = C2344ez.m12352i(1, "gads:omid_use_media_type_for_native:enabled", bool2);
        f14612l4 = C2344ez.m12352i(1, "gads:omid_use_impression_listener_full_screen:enabled", bool2);
        f14622m4 = C2344ez.m12352i(1, "gads:nonagon:banner:enabled", bool);
        f14642o4 = C2344ez.m12352i(1, "gads:nonagon:app_open:enabled", bool);
        f14672r4 = C2344ez.m12352i(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        f14692t4 = C2344ez.m12352i(1, "gads:nonagon:app_open_ad_show_emitter:enabled", bool2);
        f14702u4 = C2344ez.m12352i(1, "gads:nonagon:interstitial:enabled", bool);
        f14722w4 = C2344ez.m12352i(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f14732x4 = C2344ez.m12352i(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f14752z4 = C2344ez.m12352i(1, "gads:nonagon:banner:check_dp_size", bool);
        f14247A4 = C2344ez.m12352i(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f14257B4 = C2344ez.m12352i(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f14267C4 = C2344ez.m12352i(1, "gads:nonagon:continue_on_no_fill", bool2);
        f14277D4 = C2344ez.m12352i(1, "gads:nonagon:separate_timeout:enabled", bool);
        f14297F4 = C2344ez.m12352i(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f14307G4 = C2344ez.m12352i(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f14317H4 = C2344ez.m12352i(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f14327I4 = C2344ez.m12352i(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f14357L4 = C2344ez.m12352i(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f14367M4 = C2344ez.m12352i(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f14377N4 = C2344ez.m12352i(1, "gads:active_view_audio_signal_audio_mode:enabled", bool2);
        f14387O4 = C2344ez.m12352i(1, "gads:signals:ad_id_info:enabled", bool2);
        f14397P4 = C2344ez.m12352i(1, "gads:signals:app_index:enabled", bool2);
        f14407Q4 = C2344ez.m12352i(1, "gads:signals:attestation_token:enabled", bool2);
        f14417R4 = C2344ez.m12352i(1, "gads:signals:cache:enabled", bool2);
        f14427S4 = C2344ez.m12352i(1, "gads:signals:doritos:enabled", bool2);
        f14437T4 = C2344ez.m12352i(1, "gads:signals:doritos:v1:enabled", bool2);
        f14447U4 = C2344ez.m12352i(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f14457V4 = C2344ez.m12352i(1, "gads:signals:parental_control:enabled", bool2);
        f14466W4 = C2344ez.m12352i(1, "gads:signals:video_decoder:enabled", bool2);
        f14475X4 = C2344ez.m12352i(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f14484Y4 = C2344ez.m12352i(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        f14493Z4 = C2344ez.m12352i(1, "gads:attestation_token:enabled", bool2);
        f14553f5 = C2344ez.m12352i(1, "gads:consent:shared_preference_reading:enabled", bool);
        f14563g5 = C2344ez.m12352i(1, "gads:consent:iab_consent_info:enabled", bool);
        f14573h5 = C2344ez.m12352i(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f14593j5 = C2344ez.m12352i(1, "gads:nativeads:image:sample:enabled", bool);
        f14613l5 = C2344ez.m12352i(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f14623m5 = C2344ez.m12352i(1, "gads:offline_signaling:enabled", bool2);
        f14643o5 = C2344ez.m12352i(1, "gads:nativeads:template_signal:enabled", bool);
        f14653p5 = C2344ez.m12352i(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f14663q5 = C2344ez.m12352i(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f14673r5 = C2344ez.m12352i(1, "gads:buffer_click_url_as_ready_to_ping:enabled", bool2);
        f14683s5 = C2344ez.m12352i(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f14693t5 = C2344ez.m12352i(1, "gads:cache_layer_from_cld:enabled", bool2);
        f14703u5 = C2344ez.m12352i(1, "gads:cache_layer_wait_for_app_settings:enabled", bool2);
        f14713v5 = C2344ez.m12352i(1, "gads:precache_pool:verbose_logging", bool2);
        f14388O5 = C2344ez.m12352i(1, "gads:memory_leak:b129558083", bool2);
        f14398P5 = C2344ez.m12352i(1, "gads:unhandled_event_reporting:enabled", bool2);
        f14408Q5 = C2344ez.m12352i(1, "gads:response_info:enabled", bool);
        f14418R5 = C2344ez.m12352i(1, "gads:ad_source_response_info:enabled", bool);
        f14428S5 = C2344ez.m12352i(1, "gads:loaded_adapter_response_response_info:enabled", bool);
        f14438T5 = C2344ez.m12352i(1, "gads:response_info_extras:enabled", bool);
        f14448U5 = C2344ez.m12352i(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f14458V5 = C2344ez.m12352i(1, "gads:csi:mediation_failure:enabled", bool2);
        f14476X5 = C2344ez.m12352i(1, "gads:csi:eids_from_cld:enabled", bool2);
        f14485Y5 = C2344ez.m12352i(1, "gads:request_id_check:enabled", bool2);
        f14494Z5 = C2344ez.m12352i(1, "gads:request_id_int32:enabled", bool);
        f14504a6 = C2344ez.m12352i(1, "gads:render_decouple:enabled", bool);
        f14534d6 = C2344ez.m12352i(1, "gads:scar_csi:enabled", bool);
        f14544e6 = C2344ez.m12352i(1, "gads:scar_csi_sampling:enabled", bool2);
        f14554f6 = C2344ez.m12352i(1, "gads:query_map_eviction_fullinfo:enabled", bool2);
        f14564g6 = C2344ez.m12352i(1, "gads:query_map_update_bg_thread:enabled", bool2);
        f14574h6 = C2344ez.m12352i(1, "gads:query_map_eviction_ping:enabled", bool2);
        f14584i6 = C2344ez.m12352i(1, "gads:scar_signal_comparison_experiment:enabled", bool2);
        f14594j6 = C2344ez.m12352i(1, "gads:scar_signal_comparison_format:unknown", bool2);
        f14614l6 = C2344ez.m12352i(1, "gads:scar_trustless_token_for_gbid:enabled", bool2);
        f14624m6 = C2344ez.m12352i(1, "gads:disable_token_under_idless:enabled", bool2);
        f14634n6 = C2344ez.m12352i(1, "gads:scar_encryption_key_for_gbid:enabled", bool2);
        f14644o6 = C2344ez.m12352i(1, "gads:scar_decrypt_csi_for_gbid:enabled", bool2);
        f14654p6 = C2344ez.m12352i(1, "gads:scar_v2:send_click_ping:enabled", bool2);
        f14664q6 = C2344ez.m12352i(1, "gads:scar_v2:send_impression_pings:enabled", bool2);
        f14674r6 = C2344ez.m12352i(1, "gads:scar_v2:user_agent:enabled", bool2);
        f14694t6 = C2344ez.m12352i(1, "gads:scar_v2:prior_click_count:enabled", bool2);
        f14724w6 = C2344ez.m12352i(1, "gads:scar:use_flag_regexes:enabled", bool);
        f14259B6 = C2344ez.m12352i(1, "gads:scar:ping_non_google_urls:enabled", bool2);
        f14269C6 = C2344ez.m12352i(1, "gads:scar_format_fix:enabled", bool2);
        f14279D6 = C2344ez.m12352i(1, "gads:scar_csi_v47:enabled", bool2);
        f14289E6 = C2344ez.m12352i(1, "gads:scar_csi_format_fix:enabled", bool2);
        f14299F6 = C2344ez.m12352i(1, "gads:signal_collection_without_rendering:enabled", bool);
        f14319H6 = C2344ez.m12352i(2, "DISABLE_CRASH_REPORTING", bool2);
        f14329I6 = C2344ez.m12352i(1, "gads:paid_event_listener:enabled", bool);
        f14339J6 = C2344ez.m12352i(1, "gads:interscroller_ad:enabled", bool);
        f14349K6 = C2344ez.m12352i(1, "gads:interscroller_ad:refresh:enabled", bool2);
        f14379N6 = C2344ez.m12352i(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f14389O6 = C2344ez.m12352i(1, "gads:nas_collect_mediaview_matrix:enabled", bool2);
        f14399P6 = C2344ez.m12352i(1, "gads:nas_collect_layout_params:enabled", bool2);
        f14409Q6 = C2344ez.m12352i(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f14439T6 = C2344ez.m12352i(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f14468W6 = C2344ez.m12352i(1, "gads:use_wide_viewport:enabled", bool2);
        f14477X6 = C2344ez.m12352i(1, "gads:load_with_overview_mode:enabled", bool2);
        f14486Y6 = C2344ez.m12352i(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f14495Z6 = C2344ez.m12352i(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f14505a7 = C2344ez.m12352i(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f14525c7 = C2344ez.m12352i(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f14535d7 = C2344ez.m12352i(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f14555f7 = C2344ez.m12352i(1, "gads:forward_bow_error_string:enabled", bool);
        f14565g7 = C2344ez.m12352i(1, "gads:continue_on_process_response:enabled", bool2);
        f14585i7 = C2344ez.m12352i(1, "gads:line_item_no_fill_conversion:enabled", bool2);
        f14605k7 = C2344ez.m12352i(1, "gads:offline_ads_notification:enabled", bool);
        f14615l7 = C2344ez.m12352i(1, "gads:use_new_network_api:enabled", bool);
        f14625m7 = C2344ez.m12352i(1, "gads:handle_click_recorded_event:enabled", bool2);
        f14635n7 = C2344ez.m12352i(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f14645o7 = C2344ez.m12352i(1, "gads:handle_intent_async:enabled", bool);
        f14655p7 = C2344ez.m12352i(1, "gads:skip_deep_link_validation_native_ads:enabled", bool);
        f14665q7 = C2344ez.m12352i(1, "gads:try_deep_link_fallback_native_ads:enabled", bool);
        f14675r7 = C2344ez.m12352i(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool);
        f14685s7 = C2344ez.m12352i(1, "gads:new_remote_logging_utils:enabled", bool2);
        f14695t7 = C2344ez.m12352i(1, "gads:remote_logging:enabled", bool2);
        f14270C7 = C2344ez.m12352i(1, "gads:hide_grey_title_bar:enabled", bool2);
        f14280D7 = C2344ez.m12352i(1, "gads:interstitial_ad_parameter_handler:enabled", bool);
        f14290E7 = C2344ez.m12352i(1, "gads:inspector:enabled", bool);
        f14330I7 = C2344ez.m12352i(1, "gads:inspector:shake_enabled", bool);
        f14380N7 = C2344ez.m12352i(1, "gads:inspector:flick_enabled", bool);
        f14440T7 = C2344ez.m12352i(1, "gads:inspector:ad_manager_enabled", bool);
        f14450U7 = C2344ez.m12352i(1, "gads:inspector:policy_violations_enabled", bool2);
        f14460V7 = C2344ez.m12352i(1, "gads:inspector:bidding_data_enabled", bool);
        f14469W7 = C2344ez.m12352i(1, "gads:inspector:credentials_enabled", bool);
        f14478X7 = C2344ez.m12352i(1, "gads:inspector:export_request_logs_enabled", bool2);
        f14487Y7 = C2344ez.m12352i(1, "gads:inspector:sdk_version_enabled", bool2);
        f14496Z7 = C2344ez.m12352i(1, "gads:inspector:adapter_supports_init_enabled", bool2);
        f14506a8 = C2344ez.m12352i(1, "gads:inspector:out_of_context_testing_enabled", bool2);
        f14516b8 = C2344ez.m12352i(1, "gads:paw_register_webview:enabled", bool);
        f14526c8 = C2344ez.m12352i(1, "gads:paw_webview_early_initialization:enabled", bool2);
        f14546e8 = C2344ez.m12352i(1, "gads:as_view_click_latency_logging:enabled", bool2);
        f14556f8 = C2344ez.m12352i(1, "gads:h5ads:enabled", bool);
        f14596j8 = C2344ez.m12352i(1, "gads:native_html_video_asset:enabled", bool);
        f14606k8 = C2344ez.m12352i(1, "gads:native_html_image_asset:enabled", bool);
        f14616l8 = C2344ez.m12352i(1, "gads:leibniz:events:enabled", bool2);
        f14626m8 = C2344ez.m12352i(1, "gads:msa:alphavis_enabled", bool2);
        f14636n8 = C2344ez.m12352i(1, "gads:msa:adutilalphavis_enabled", bool2);
        f14646o8 = C2344ez.m12352i(1, "gads:msa:nativealphavis_enabled", bool2);
        f14666q8 = C2344ez.m12352i(1, "gads:msa:vswfl", bool2);
        f14676r8 = C2344ez.m12352i(1, "gads:msa:poslogger", bool2);
        f14686s8 = C2344ez.m12352i(1, "gads:new_dynamite_module_method:enabled", bool2);
        f14706u8 = C2344ez.m12352i(1, "gads:read_pub_callback_param_open_gmsg:enabled", bool);
        f14716v8 = C2344ez.m12352i(1, "gads:read_pub_callback_param_click_gmsg:enabled", bool);
        f14726w8 = C2344ez.m12352i(1, "gads:forward_physical_click_to_ad_listener:enabled", bool);
        f14736x8 = C2344ez.m12352i(1, "gads:webview_destroy_workaround:enabled", bool);
        f14746y8 = C2344ez.m12352i(1, "gads:appstate_getresource_fix:enabled", bool2);
        f14756z8 = C2344ez.m12352i(1, "gads:convert_ad_unit_lower_case_rtb:enabled", bool2);
        f14251A8 = C2344ez.m12352i(1, "gads:drx_ad_unit_regex_case_insensitive:enabled", bool2);
        f14261B8 = C2344ez.m12352i(1, "gads:csi_ping_for_invalid_dynamite_flags_access:enabled", bool2);
        f14271C8 = C2344ez.m12352i(1, "gads:gestures:paos:enabled", bool2);
        f14281D8 = C2344ez.m12352i(1, "gads:normalized_device_volume:enabled", bool2);
        f14291E8 = C2344ez.m12352i(1, "gads:register_receiver_options:enabled", bool);
        f14301F8 = C2344ez.m12352i(1, "gads:bg_ad_key_signal_gen:enabled", bool2);
        f14311G8 = C2344ez.m12352i(1, "gads:bg_clearcut_provider:enabled", bool2);
        f14321H8 = C2344ez.m12352i(1, "gads:queryInfo_generate_bg:enabled", bool2);
        f14331I8 = C2344ez.m12352i(1, "gads:bg_banner_resume:enabled", bool2);
        f14341J8 = C2344ez.m12352i(1, "gads:bg_banner_destroy:enabled", bool2);
        f14351K8 = C2344ez.m12352i(1, "gads:bg_banner_pause:enabled", bool2);
        f14361L8 = C2344ez.m12352i(2, "OPTIMIZE_INITIALIZATION", bool2);
        f14371M8 = C2344ez.m12352i(2, "OPTIMIZE_AD_LOADING", bool2);
        f14401P8 = C2344ez.m12352i(1, "gads:manifest_flag_collection:enabled", bool2);
        f14411Q8 = C2344ez.m12352i(1, "gads:bstar_csi:enabled", bool2);
        f14421R8 = C2344ez.m12352i(1, "gads:bstar_signals:enabled", bool2);
        f14431S8 = C2344ez.m12352i(1, "gads:full_screen_1px_open:enabled", bool2);
        f14441T8 = C2344ez.m12352i(1, "gads:app_id_as_session_token:enabled", bool2);
        f14451U8 = C2344ez.m12352i(1, "gads:lmd_overlay:enabled", bool2);
    }

    /* renamed from: a */
    public static List m17341a() {
        return C4596v.m30086a().mo10352a();
    }

    /* renamed from: b */
    public static List m17342b() {
        return C4596v.m30086a().mo10353b();
    }

    /* renamed from: c */
    public static void m17343c(Context context) {
        C2754pz.m18985a(new C2642mz(context));
    }

    /* renamed from: d */
    public static void m17344d(Context context, int i, JSONObject jSONObject) {
        C4596v.m30087b();
        SharedPreferences.Editor edit = C2419gz.m13608a(context).edit();
        C4596v.m30086a();
        q00 q00 = v00.f18872a;
        C4596v.m30086a().mo10356e(edit, 1, jSONObject);
        C4596v.m30087b();
        edit.commit();
    }
}
