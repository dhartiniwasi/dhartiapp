package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w60 implements e60 {

    /* renamed from: a */
    private final v60 f19507a;

    public w60(v60 v60) {
        this.f19507a = v60;
    }

    /* renamed from: b */
    public static void m22606b(vs0 vs0, v60 v60) {
        vs0.mo12105d1("/reward", new w60(v60));
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            bi0 bi0 = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    bi0 = new bi0(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                pm0.m18668h("Unable to parse reward amount.", e);
            }
            this.f19507a.mo12069D(bi0);
        } else if ("video_start".equals(str)) {
            this.f19507a.mo12071e();
        } else if ("video_complete".equals(str)) {
            this.f19507a.mo12070d();
        }
    }
}
