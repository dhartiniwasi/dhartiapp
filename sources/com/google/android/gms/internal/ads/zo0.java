package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zo0 {

    /* renamed from: a */
    public final boolean f21191a;

    /* renamed from: b */
    public final int f21192b;

    /* renamed from: c */
    public final int f21193c;

    /* renamed from: d */
    public final int f21194d;

    /* renamed from: e */
    public final String f21195e;

    /* renamed from: f */
    public final int f21196f;

    /* renamed from: g */
    public final int f21197g;

    /* renamed from: h */
    public final int f21198h;

    /* renamed from: i */
    public final int f21199i;

    /* renamed from: j */
    public final boolean f21200j;

    /* renamed from: k */
    public final int f21201k;

    /* renamed from: l */
    public final boolean f21202l;

    /* renamed from: m */
    public final boolean f21203m;

    /* renamed from: n */
    public final boolean f21204n;

    /* renamed from: o */
    public final boolean f21205o;

    /* renamed from: p */
    public final long f21206p;

    /* renamed from: q */
    public final long f21207q;

    public zo0(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f21191a = m24722a(jSONObject, "aggressive_media_codec_release", C2679nz.f14302G);
        this.f21192b = m24723b(jSONObject, "byte_buffer_precache_limit", C2679nz.f14587j);
        this.f21193c = m24723b(jSONObject, "exo_cache_buffer_size", C2679nz.f14697u);
        this.f21194d = m24723b(jSONObject, "exo_connect_timeout_millis", C2679nz.f14547f);
        C2344ez ezVar = C2679nz.f14537e;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f21195e = str2;
            this.f21196f = m24723b(jSONObject, "exo_read_timeout_millis", C2679nz.f14557g);
            this.f21197g = m24723b(jSONObject, "load_check_interval_bytes", C2679nz.f14567h);
            this.f21198h = m24723b(jSONObject, "player_precache_limit", C2679nz.f14577i);
            this.f21199i = m24723b(jSONObject, "socket_receive_buffer_size", C2679nz.f14597k);
            this.f21200j = m24722a(jSONObject, "use_cache_data_source", C2679nz.f14691t3);
            this.f21201k = m24723b(jSONObject, "min_retry_count", C2679nz.f14607l);
            this.f21202l = m24722a(jSONObject, "treat_load_exception_as_non_fatal", C2679nz.f14637o);
            this.f21203m = m24722a(jSONObject, "using_official_simple_exo_player", C2679nz.f14284E1);
            this.f21204n = m24722a(jSONObject, "enable_multiple_video_playback", C2679nz.f14294F1);
            this.f21205o = m24722a(jSONObject, "use_range_http_data_source", C2679nz.f14314H1);
            this.f21206p = m24724c(jSONObject, "range_http_data_source_high_water_mark", C2679nz.f14324I1);
            this.f21207q = m24724c(jSONObject, "range_http_data_source_low_water_mark", C2679nz.f14334J1);
        }
        str2 = (String) C4596v.m30088c().mo12227b(ezVar);
        this.f21195e = str2;
        this.f21196f = m24723b(jSONObject, "exo_read_timeout_millis", C2679nz.f14557g);
        this.f21197g = m24723b(jSONObject, "load_check_interval_bytes", C2679nz.f14567h);
        this.f21198h = m24723b(jSONObject, "player_precache_limit", C2679nz.f14577i);
        this.f21199i = m24723b(jSONObject, "socket_receive_buffer_size", C2679nz.f14597k);
        this.f21200j = m24722a(jSONObject, "use_cache_data_source", C2679nz.f14691t3);
        this.f21201k = m24723b(jSONObject, "min_retry_count", C2679nz.f14607l);
        this.f21202l = m24722a(jSONObject, "treat_load_exception_as_non_fatal", C2679nz.f14637o);
        this.f21203m = m24722a(jSONObject, "using_official_simple_exo_player", C2679nz.f14284E1);
        this.f21204n = m24722a(jSONObject, "enable_multiple_video_playback", C2679nz.f14294F1);
        this.f21205o = m24722a(jSONObject, "use_range_http_data_source", C2679nz.f14314H1);
        this.f21206p = m24724c(jSONObject, "range_http_data_source_high_water_mark", C2679nz.f14324I1);
        this.f21207q = m24724c(jSONObject, "range_http_data_source_low_water_mark", C2679nz.f14334J1);
    }

    /* renamed from: a */
    private static final boolean m24722a(JSONObject jSONObject, String str, C2344ez ezVar) {
        boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    /* renamed from: b */
    private static final int m24723b(JSONObject jSONObject, String str, C2344ez ezVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C4596v.m30088c().mo12227b(ezVar)).intValue();
    }

    /* renamed from: c */
    private static final long m24724c(JSONObject jSONObject, String str, C2344ez ezVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) C4596v.m30088c().mo12227b(ezVar)).longValue();
    }
}
