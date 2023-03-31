package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uq0 implements e60 {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        ap0 ap0 = (ap0) obj;
        st0 d0 = ap0.mo8467d0();
        if (d0 == null) {
            try {
                st0 st0 = new st0(ap0, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                ap0.mo8453E(st0);
                d0 = st0;
            } catch (NullPointerException e) {
                e = e;
                pm0.m18665e("Unable to parse videoMeta message.", e);
                C4409t.m29325q().mo15126t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                pm0.m18665e("Unable to parse videoMeta message.", e);
                C4409t.m29325q().mo15126t(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (pm0.m18670j(3)) {
            pm0.m18662b("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        d0.mo14135J6(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
