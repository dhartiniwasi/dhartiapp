package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p060h4.C4596v;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ls2 {

    /* renamed from: a */
    public final List f12929a;

    /* renamed from: b */
    public final String f12930b;

    /* renamed from: c */
    public final int f12931c;

    /* renamed from: d */
    public final String f12932d;

    /* renamed from: e */
    public final int f12933e;

    /* renamed from: f */
    public final long f12934f;

    /* renamed from: g */
    public final boolean f12935g;

    /* renamed from: h */
    public final String f12936h;

    /* renamed from: i */
    public final ks2 f12937i;

    /* renamed from: j */
    public final Bundle f12938j;

    /* renamed from: k */
    public final String f12939k;

    /* renamed from: l */
    public final String f12940l;

    ls2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j = 0;
        ks2 ks2 = null;
        boolean z = false;
        String str4 = str3;
        String str5 = str4;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = C4820w0.m30814d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                String str6 = str3;
                if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14555f7)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    JsonReader jsonReader2 = jsonReader;
                    if ("bidding_data".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14438T5)).booleanValue()) {
                            try {
                                Bundle a = C4820w0.m30811a(C4820w0.m30818h(jsonReader));
                                if (a != null) {
                                    bundle = a;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14478X7)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14478X7)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    ks2 = new ks2(jsonReader);
                }
                str3 = str6;
            }
            JsonReader jsonReader3 = jsonReader;
        }
        JsonReader jsonReader4 = jsonReader;
        jsonReader.endObject();
        this.f12929a = emptyList;
        this.f12931c = i;
        this.f12930b = str4;
        this.f12932d = str5;
        this.f12933e = i2;
        this.f12934f = j;
        this.f12937i = ks2;
        this.f12935g = z;
        this.f12936h = str;
        this.f12938j = bundle;
        this.f12939k = str2;
        this.f12940l = str3;
    }
}
