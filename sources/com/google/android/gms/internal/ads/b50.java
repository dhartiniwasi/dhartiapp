package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b50 implements e60 {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                pm0.m18667g("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                pm0.m18667g("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C4409t.m29310b().mo18371b() + (Long.parseLong(str4) - C4409t.m29310b().mo18370a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    vs0.mo8462Y().mo8154c(str2, str3, b);
                } catch (NumberFormatException e) {
                    pm0.m18668h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                pm0.m18667g("No value given for CSI experiment.");
            } else {
                vs0.mo8462Y().mo8152a().mo9000d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(MediationMetaData.KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                pm0.m18667g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                pm0.m18667g("No name given for CSI extra.");
            } else {
                vs0.mo8462Y().mo8152a().mo9000d(str6, str7);
            }
        }
    }
}
