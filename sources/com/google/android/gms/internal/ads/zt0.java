package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zt0 extends ct0 {
    public zt0(vs0 vs0, C2971vu vuVar, boolean z) {
        super(vs0, vuVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final WebResourceResponse mo15659l0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof vs0)) {
            pm0.m18667g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        vs0 vs0 = (vs0) webView;
        nj0 nj0 = this.f7898C;
        if (nj0 != null) {
            nj0.mo11128b(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo9282D(str, map);
        }
        if (vs0.mo12108f0() != null) {
            vs0.mo12108f0().mo9286K();
        }
        if (vs0.mo9698n().mo12442i()) {
            str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14362M);
        } else if (vs0.mo12098X0()) {
            str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14352L);
        } else {
            str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14342K);
        }
        C4409t.m29326r();
        return C4751b2.m30600R(vs0.getContext(), vs0.mo10299b0().f19150a, str2);
    }
}
