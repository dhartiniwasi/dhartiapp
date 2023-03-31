package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y42 implements z42 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.b03 m23759e(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.b03 r4 = com.google.android.gms.internal.ads.b03.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.b03 r4 = com.google.android.gms.internal.ads.b03.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.b03 r4 = com.google.android.gms.internal.ads.b03.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y42.m23759e(java.lang.String):com.google.android.gms.internal.ads.b03");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.d03 m23760f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.d03 r4 = com.google.android.gms.internal.ads.d03.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.d03 r4 = com.google.android.gms.internal.ads.d03.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.d03 r4 = com.google.android.gms.internal.ads.d03.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.d03 r4 = com.google.android.gms.internal.ads.d03.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y42.m23760f(java.lang.String):com.google.android.gms.internal.ads.d03");
    }

    /* renamed from: g */
    private static e03 m23761g(String str) {
        if ("native".equals(str)) {
            return e03.NATIVE;
        }
        if ("javascript".equals(str)) {
            return e03.JAVASCRIPT;
        }
        return e03.NONE;
    }

    /* renamed from: D */
    public final void mo15326D(C4954a aVar) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue() && uz2.m21913b()) {
            Object P0 = C4956b.m31384P0(aVar);
            if (P0 instanceof wz2) {
                ((wz2) P0).mo8160e();
            }
        }
    }

    /* renamed from: a */
    public final C4954a mo15327a(String str, WebView webView, String str2, String str3, String str4, String str5, c52 c52, b52 b52, String str6) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue() || !uz2.m21913b()) {
            return null;
        }
        g03 a = g03.m12983a(str5, str);
        e03 g = m23761g("javascript");
        e03 g2 = m23761g(str4);
        b03 e = m23759e(b52.toString());
        e03 e03 = e03.NONE;
        if (g == e03) {
            pm0.m18667g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (e == null) {
            pm0.m18667g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(b52)));
            return null;
        } else if (e == b03.VIDEO && g2 == e03) {
            pm0.m18667g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return C4956b.m31385o3(wz2.m22968a(xz2.m23623a(e, m23760f(c52.toString()), g, g2, true), yz2.m24250c(a, webView, str6, "")));
        }
    }

    /* renamed from: b */
    public final void mo15328b(C4954a aVar, View view) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue() && uz2.m21913b()) {
            Object P0 = C4956b.m31384P0(aVar);
            if (P0 instanceof wz2) {
                ((wz2) P0).mo8159d(view);
            }
        }
    }

    /* renamed from: c */
    public final C4954a mo15329c(String str, WebView webView, String str2, String str3, String str4, c52 c52, b52 b52, String str5) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue() || !uz2.m21913b()) {
            return null;
        }
        g03 a = g03.m12983a("Google", str);
        e03 g = m23761g("javascript");
        b03 e = m23759e(b52.toString());
        e03 e03 = e03.NONE;
        if (g == e03) {
            pm0.m18667g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (e == null) {
            pm0.m18667g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(b52)));
            return null;
        } else {
            e03 g2 = m23761g(str4);
            if (e == b03.VIDEO && g2 == e03) {
                pm0.m18667g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return C4956b.m31385o3(wz2.m22968a(xz2.m23623a(e, m23760f(c52.toString()), g, g2, true), yz2.m24249b(a, webView, str5, "")));
        }
    }

    /* renamed from: d */
    public final boolean mo15330d(Context context) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14562g4)).booleanValue()) {
            pm0.m18667g("Omid flag is disabled");
            return false;
        } else if (uz2.m21913b()) {
            return true;
        } else {
            uz2.m21912a(context);
            return uz2.m21913b();
        }
    }
}
