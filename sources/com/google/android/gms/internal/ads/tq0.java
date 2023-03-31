package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;
import p060h4.C4596v;
import p073j4.C4785k1;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tq0 implements e60 {

    /* renamed from: a */
    private boolean f18216a;

    /* renamed from: b */
    private static int m21187b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C4584t.m30036b();
                i = im0.m14418y(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                pm0.m18667g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    /* renamed from: c */
    private static void m21188c(oo0 oo0, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                oo0.mo12996e(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                pm0.m18667g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            oo0.mo12995d(Integer.parseInt(str2));
        }
        if (str3 != null) {
            oo0.mo12993D(Integer.parseInt(str3));
        }
        if (str4 != null) {
            oo0.mo12994E(Integer.parseInt(str4));
        }
        if (str5 != null) {
            oo0.mo12999g(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        int i;
        int i2;
        int i3;
        Map map2 = map;
        ap0 ap0 = (ap0) obj;
        Integer num = null;
        Integer valueOf = map2.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map2.get("playerId"))) : null;
        Integer q = (ap0.mo8472k0() == null || ap0.mo8472k0().mo13313a() == null) ? null : ap0.mo8472k0().mo13313a().mo13006q();
        if (valueOf == null || q == null || valueOf.equals(q)) {
            String str = (String) map2.get("action");
            if (str == null) {
                pm0.m18667g("Action missing from video GMSG.");
                return;
            }
            if (pm0.m18670j(3)) {
                JSONObject jSONObject = new JSONObject(map2);
                jSONObject.remove("google.afma.Notify_dt");
                pm0.m18662b("Video GMSG: " + str + " " + jSONObject.toString());
            }
            if ("background".equals(str)) {
                String str2 = (String) map2.get("color");
                if (TextUtils.isEmpty(str2)) {
                    pm0.m18667g("Color parameter missing from background video GMSG.");
                    return;
                }
                try {
                    ap0.setBackgroundColor(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    pm0.m18667g("Invalid color parameter in background video GMSG.");
                }
            } else if ("playerBackground".equals(str)) {
                String str3 = (String) map2.get("color");
                if (TextUtils.isEmpty(str3)) {
                    pm0.m18667g("Color parameter missing from playerBackground video GMSG.");
                    return;
                }
                try {
                    ap0.mo8455L(Color.parseColor(str3));
                } catch (IllegalArgumentException unused2) {
                    pm0.m18667g("Invalid color parameter in playerBackground video GMSG.");
                }
            } else if ("decoderProps".equals(str)) {
                String str4 = (String) map2.get("mimeTypes");
                if (str4 == null) {
                    pm0.m18667g("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    ap0.mo9081R("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, C4785k1.m30681a(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                ap0.mo9081R("onVideoEvent", hashMap3);
            } else {
                po0 k0 = ap0.mo8472k0();
                if (k0 == null) {
                    pm0.m18667g("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = ap0.getContext();
                    int b = m21187b(context, map2, "x", 0);
                    int b2 = m21187b(context, map2, "y", 0);
                    int b3 = m21187b(context, map2, "w", -1);
                    C2344ez ezVar = C2679nz.f14482Y2;
                    if (!((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                        if (C4794n1.m30695m()) {
                            C4794n1.m30693k("Calculate width with original width " + b3 + ", videoHost.getVideoBoundingWidth() " + ap0.mo8460W() + ", x " + b + ".");
                        }
                        i = Math.min(b3, ap0.mo8460W() - b);
                    } else if (b3 == -1) {
                        i = ap0.mo8460W();
                    } else {
                        i = Math.min(b3, ap0.mo8460W());
                    }
                    int b4 = m21187b(context, map2, "h", -1);
                    if (!((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                        if (C4794n1.m30695m()) {
                            C4794n1.m30693k("Calculate height with original height " + b4 + ", videoHost.getVideoBoundingHeight() " + ap0.mo8459V() + ", y " + b2 + ".");
                        }
                        i2 = Math.min(b4, ap0.mo8459V() - b2);
                    } else if (b4 == -1) {
                        i2 = ap0.mo8459V();
                    } else {
                        i2 = Math.min(b4, ap0.mo8459V());
                    }
                    int i4 = i2;
                    try {
                        i3 = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused3) {
                        i3 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || k0.mo13313a() != null) {
                        k0.mo13314b(b, b2, i, i4);
                        return;
                    }
                    k0.mo13315c(b, b2, i, i4, i3, parseBoolean, new zo0((String) map2.get("flags")), valueOf);
                    oo0 a = k0.mo13313a();
                    if (a != null) {
                        m21188c(a, map2);
                        return;
                    }
                    return;
                }
                st0 d0 = ap0.mo8467d0();
                if (d0 != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map2.get("currentTime");
                        if (str6 == null) {
                            pm0.m18667g("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            d0.mo14139N6(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused4) {
                            pm0.m18667g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        d0.mo14141j();
                        return;
                    }
                }
                oo0 a2 = k0.mo13313a();
                if (a2 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    ap0.mo9081R("onVideoEvent", hashMap4);
                } else if ("click".equals(str)) {
                    Context context2 = ap0.getContext();
                    int b5 = m21187b(context2, map2, "x", 0);
                    int b6 = m21187b(context2, map2, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) b5, (float) b6, 0);
                    a2.mo12992C(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        pm0.m18667g("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a2.mo12991B((int) (Float.parseFloat(str7) * 1000.0f));
                    } catch (NumberFormatException unused5) {
                        pm0.m18667g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    }
                } else if ("hide".equals(str)) {
                    a2.setVisibility(4);
                } else if ("load".equals(str)) {
                    a2.mo13011w();
                } else if ("loadControl".equals(str)) {
                    m21188c(a2, map2);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map2.get("muted"))) {
                        a2.mo13012x();
                    } else {
                        a2.mo13004m();
                    }
                } else if ("pause".equals(str)) {
                    a2.mo13014z();
                } else if ("play".equals(str)) {
                    a2.mo12990A();
                } else if ("show".equals(str)) {
                    a2.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str8 = (String) map2.get("src");
                    if (map2.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map2.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused6) {
                            pm0.m18667g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map2.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map2.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                strArr2[i5] = jSONArray.getString(i5);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused7) {
                            pm0.m18667g("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        ap0.mo8454F(num.intValue());
                    }
                    a2.mo13000h(str8, strArr);
                } else if ("touchMove".equals(str)) {
                    Context context3 = ap0.getContext();
                    a2.mo13003l((float) m21187b(context3, map2, "dx", 0), (float) m21187b(context3, map2, "dy", 0));
                    if (!this.f18216a) {
                        ap0.mo8477t();
                        this.f18216a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str10 = (String) map2.get("volume");
                    if (str10 == null) {
                        pm0.m18667g("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a2.mo13002j(Float.parseFloat(str10));
                    } catch (NumberFormatException unused8) {
                        pm0.m18667g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    }
                } else if ("watermark".equals(str)) {
                    a2.mo13007s();
                } else {
                    pm0.m18667g("Unknown video action: ".concat(str));
                }
            }
        } else {
            pm0.m18666f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", new Object[]{valueOf, q}));
        }
    }
}
