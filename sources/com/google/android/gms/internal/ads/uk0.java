package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uk0 {
    /* renamed from: a */
    static Uri m21683a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m21684b(Uri uri, Context context) {
        if (!C4409t.m29324p().mo14043z(context)) {
            return uri.toString();
        }
        String f = C4409t.m29324p().mo14023f(context);
        if (f == null) {
            return uri.toString();
        }
        String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14518c0);
        String uri2 = uri.toString();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14508b0)).booleanValue() && uri2.contains(str)) {
            C4409t.m29324p().mo14035r(context, f);
            return m21686d(uri2, context).replace(str, f);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = m21683a(m21686d(uri2, context), "fbs_aeid", f).toString();
            C4409t.m29324p().mo14035r(context, f);
            return uri3;
        }
    }

    /* renamed from: c */
    public static String m21685c(String str, Context context, boolean z) {
        String f;
        if ((((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14588j0)).booleanValue() && !z) || !C4409t.m29324p().mo14043z(context) || TextUtils.isEmpty(str) || (f = C4409t.m29324p().mo14023f(context)) == null) {
            return str;
        }
        String str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14518c0);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14508b0)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (C4409t.m29326r().mo18432D(str)) {
                C4409t.m29324p().mo14035r(context, f);
                return m21683a(m21686d(str, context), "fbs_aeid", f).toString();
            } else if (!C4409t.m29326r().mo18433E(str)) {
                return str;
            } else {
                C4409t.m29324p().mo14036s(context, f);
                return m21683a(m21686d(str, context), "fbs_aeid", f).toString();
            }
        } else if (C4409t.m29326r().mo18432D(str)) {
            C4409t.m29324p().mo14035r(context, f);
            return m21686d(str, context).replace(str2, f);
        } else if (!C4409t.m29326r().mo18433E(str)) {
            return str;
        } else {
            C4409t.m29324p().mo14036s(context, f);
            return m21686d(str, context).replace(str2, f);
        }
    }

    /* renamed from: d */
    private static String m21686d(String str, Context context) {
        String j = C4409t.m29324p().mo14027j(context);
        String h = C4409t.m29324p().mo14025h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = m21683a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : m21683a(str, "fbs_aiid", h).toString();
    }
}
