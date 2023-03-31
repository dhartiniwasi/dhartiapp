package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p067i5.C4689c;
import p067i5.C4691e;
import p067i5.C4694h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class om0 {

    /* renamed from: b */
    private static final Object f15260b = new Object();

    /* renamed from: c */
    private static boolean f15261c = false;

    /* renamed from: d */
    private static boolean f15262d = false;

    /* renamed from: e */
    private static final C4691e f15263e = C4694h.m30388d();

    /* renamed from: f */
    private static final Set f15264f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: g */
    public static final /* synthetic */ int f15265g = 0;

    /* renamed from: a */
    private final List f15266a;

    public om0(String str) {
        List list;
        if (!m17944l()) {
            list = new ArrayList();
        } else {
            list = Arrays.asList(new String[]{"network_request_".concat(String.valueOf(UUID.randomUUID().toString()))});
        }
        this.f15266a = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m17939a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m17951s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C4689c.m30371c(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    static /* synthetic */ void m17940b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m17951s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m17941i() {
        synchronized (f15260b) {
            f15261c = false;
            f15262d = false;
            pm0.m18667g("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m17942j(boolean z) {
        synchronized (f15260b) {
            f15261c = true;
            f15262d = z;
        }
    }

    /* renamed from: k */
    public static boolean m17943k(Context context) {
        if (!((Boolean) a10.f6367a.mo13438e()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            pm0.m18668h("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m17944l() {
        boolean z;
        synchronized (f15260b) {
            z = false;
            if (f15261c && f15262d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m17945m() {
        boolean z;
        synchronized (f15260b) {
            z = f15261c;
        }
        return z;
    }

    /* renamed from: n */
    private static synchronized void m17946n(String str) {
        synchronized (om0.class) {
            pm0.m18666f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                pm0.m18666f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            pm0.m18666f("GMA Debug FINISH");
        }
    }

    /* renamed from: o */
    private final void m17947o(String str, nm0 nm0) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f15263e.mo18370a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f15266a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            nm0.mo11438a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            pm0.m18665e("unable to log", e);
        }
        m17946n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m17948p(String str) {
        m17947o("onNetworkRequestError", new km0(str));
    }

    /* renamed from: q */
    private final void m17949q(String str, String str2, Map map, byte[] bArr) {
        m17947o("onNetworkRequest", new lm0(str, str2, map, bArr));
    }

    /* renamed from: r */
    private final void m17950r(Map map, int i) {
        m17947o("onNetworkResponse", new jm0(i, map));
    }

    /* renamed from: s */
    private static void m17951s(JsonWriter jsonWriter, Map map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!f15264f.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            pm0.m18664d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: c */
    public final void mo12977c(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m17944l()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m17949q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: d */
    public final void mo12978d(String str, String str2, Map map, byte[] bArr) {
        if (m17944l()) {
            m17949q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void mo12979e(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (m17944l()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            m17950r(hashMap, i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    pm0.m18667g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m17948p(str);
            }
        }
    }

    /* renamed from: f */
    public final void mo12980f(Map map, int i) {
        if (m17944l()) {
            m17950r(map, i);
            if (i < 200 || i >= 300) {
                m17948p((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo12981g(String str) {
        if (m17944l() && str != null) {
            mo12982h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void mo12982h(byte[] bArr) {
        m17947o("onNetworkResponseBody", new mm0(bArr));
    }
}
