package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p186ac.C6555j;
import p186ac.C6556k;

public class PlatformUtil implements C6556k.C6560c {
    protected static final String LOG_TAG = "PlatformUtil";
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_platformutil");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] split = str.split("_");
        String str2 = split[0];
        String str3 = "";
        String str4 = split.length > 1 ? split[1] : str3;
        if (split.length > 2) {
            str3 = split[2];
        }
        return new Locale(str2, str4, str3);
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        if (str.equals("formatDate")) {
            long longValue = ((Long) jVar.mo22156a("date")).longValue();
            String str2 = (String) jVar.mo22156a("format");
            Locale localeFromString = getLocaleFromString((String) jVar.mo22156a("locale"));
            String str3 = (String) jVar.mo22156a("timezone");
            if (str3 == null) {
                str3 = "UTC";
            }
            dVar.success(formatDate(longValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
        } else if (!str.equals("getSystemVersion")) {
            dVar.notImplemented();
        } else {
            dVar.success(String.valueOf(Build.VERSION.SDK_INT));
        }
    }
}
