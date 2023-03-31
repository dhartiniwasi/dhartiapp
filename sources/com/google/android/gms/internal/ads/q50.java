package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p053g4.C4409t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q50 implements e60 {
    q50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            C4794n1.m30693k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        e63 j = f63.m12434j();
        j.mo9810b((String) map.get("appId"));
        j.mo9816h(vs0.getWidth());
        j.mo9815g(vs0.mo10647w().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            j.mo9812d(81);
        } else {
            j.mo9812d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            j.mo9813e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            j.mo9813e(0.02f);
        }
        if (map.containsKey("enifd")) {
            j.mo9809a((String) map.get("enifd"));
        }
        try {
            C4409t.m29320l().mo18341j(vs0, j.mo9817i());
        } catch (NullPointerException e) {
            C4409t.m29325q().mo15126t(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            C4794n1.m30693k("Missing parameters for LMD Overlay show request");
        }
    }
}
