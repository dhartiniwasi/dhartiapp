package com.startapp.sdk.adsbase;

import com.startapp.C8870c1;
import com.startapp.C9688ze;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class AdsConstants {

    /* renamed from: a */
    public static final String f38626a;

    /* renamed from: b */
    public static final String f38627b;

    /* renamed from: c */
    public static final String f38628c = "trackdownload";

    /* renamed from: d */
    public static final String f38629d;

    /* renamed from: e */
    public static final String f38630e = "https://imp.startappservice.com/tracking/adImpression";

    /* renamed from: f */
    public static final Boolean f38631f;

    /* renamed from: g */
    public static final Boolean f38632g;

    /* renamed from: h */
    public static final String[] f38633h = {"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};

    /* renamed from: i */
    public static final String[] f38634i = {"empty_star", "filled_star", "half_star"};

    /* compiled from: Sta */
    public enum AdApiType {
        HTML,
        JSON
    }

    static {
        String str = "get";
        StringBuilder a = C8870c1.m48422a(str);
        a.append("ads");
        f38626a = a.toString();
        StringBuilder a2 = C8870c1.m48422a(str);
        a2.append("htmlad");
        f38627b = a2.toString();
        StringBuilder a3 = C8870c1.m48422a(str);
        a3.append("adsmetadata");
        f38629d = a3.toString();
        Boolean bool = Boolean.FALSE;
        f38631f = bool;
        f38632g = bool;
    }

    /* renamed from: a */
    public static String m49678a(AdApiType adApiType, AdPreferences.Placement placement) {
        String str;
        String str2;
        String str3;
        int ordinal = adApiType.ordinal();
        String str4 = null;
        if (ordinal == 0) {
            str3 = f38627b;
            str2 = MetaData.f38952k.mo31012a(placement);
        } else if (ordinal != 1) {
            str = null;
            return C9688ze.m50607a(str4, str);
        } else {
            str3 = f38626a;
            str2 = MetaData.f38952k.mo31012a(placement);
        }
        String str5 = str3;
        str4 = str2;
        str = str5;
        return C9688ze.m50607a(str4, str);
    }
}
