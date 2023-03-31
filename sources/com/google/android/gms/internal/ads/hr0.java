package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hr0 implements e60 {
    /* renamed from: b */
    private static final Integer m14023b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            pm0.m18667g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        gr0 gr0;
        xq0 xq0;
        Map map2 = map;
        ap0 ap0 = (ap0) obj;
        if (pm0.m18670j(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            pm0.m18662b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        yq0 A = C4409t.m29307A();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer b = m14023b(map2, "periodicReportIntervalMs");
            Integer b2 = m14023b(map2, "exoPlayerRenderingIntervalMs");
            Integer b3 = m14023b(map2, "exoPlayerIdleIntervalMs");
            zo0 zo0 = new zo0((String) map2.get("flags"));
            boolean z = zo0.f21204n;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        pm0.m18667g("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = A.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            xq0 = null;
                            break;
                        }
                        xq0 xq02 = (xq0) it.next();
                        if (xq02.f20325c == ap0 && str.equals(xq02.mo15229e())) {
                            xq0 = xq02;
                            break;
                        }
                    }
                } else {
                    xq0 = A.mo15495b(ap0);
                }
                if (xq0 != null) {
                    pm0.m18667g("Precache task is already running.");
                    return;
                } else if (ap0.mo8466c0() == null) {
                    pm0.m18667g("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer b4 = m14023b(map2, "player");
                    if (b4 == null) {
                        b4 = 0;
                    }
                    if (b != null) {
                        ap0.mo8454F(b.intValue());
                    }
                    if (b2 != null) {
                        ap0.mo8456Q(b2.intValue());
                    }
                    if (b3 != null) {
                        ap0.mo8470h0(b3.intValue());
                    }
                    int intValue = b4.intValue();
                    rq0 rq0 = ap0.mo8466c0().f24490b;
                    if (intValue > 0) {
                        int b0 = ro0.m19946b0();
                        if (b0 < zo0.f21198h) {
                            gr0 = new pr0(ap0, zo0);
                        } else if (b0 < zo0.f21192b) {
                            gr0 = new mr0(ap0, zo0);
                        } else {
                            gr0 = new kr0(ap0);
                        }
                    } else {
                        gr0 = new jr0(ap0);
                    }
                    new xq0(ap0, gr0, str, strArr).mo15227b();
                }
            } else {
                xq0 b5 = A.mo15495b(ap0);
                if (b5 != null) {
                    gr0 = b5.f20326d;
                } else {
                    pm0.m18667g("Precache must specify a source.");
                    return;
                }
            }
            Integer b6 = m14023b(map2, "minBufferMs");
            if (b6 != null) {
                gr0.mo10630s(b6.intValue());
            }
            Integer b7 = m14023b(map2, "maxBufferMs");
            if (b7 != null) {
                gr0.mo10629r(b7.intValue());
            }
            Integer b8 = m14023b(map2, "bufferForPlaybackMs");
            if (b8 != null) {
                gr0.mo10627p(b8.intValue());
            }
            Integer b9 = m14023b(map2, "bufferForPlaybackAfterRebufferMs");
            if (b9 != null) {
                gr0.mo10628q(b9.intValue());
            }
        } else if (!A.mo15498i(ap0)) {
            pm0.m18667g("Precache abort but no precache task running.");
        }
    }
}
