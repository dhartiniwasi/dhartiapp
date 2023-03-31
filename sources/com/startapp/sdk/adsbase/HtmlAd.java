package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.startapp.C9023i4;
import com.startapp.C9134m9;
import com.startapp.C9149n6;
import com.startapp.C9600v7;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public abstract class HtmlAd extends C9381Ad {

    /* renamed from: c */
    public static String f38638c = null;
    private static final long serialVersionUID = 1;
    private List<AppPresenceDetails> apps;
    private String[] closingUrl = {""};
    private Long delayCloseInterval;
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = "";
    public boolean[] inAppBrowserEnabled = {true};
    private boolean isMraidAd = false;
    private int orientation = 0;
    private String[] packageNames = {""};
    private int rewardDuration = 0;
    private boolean rewardedHideTimer = false;
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = {false};
    private String[] trackingClickUrls = {""};
    public String[] trackingUrls = {""};
    private int width;

    public HtmlAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        if (f38638c == null) {
            mo30506q();
        }
    }

    /* renamed from: a */
    public void mo30490a(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* renamed from: b */
    public void mo30495b(String str) {
        Long l = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l == null || parseLong < l.longValue())) {
                        l = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
    }

    /* renamed from: c */
    public void mo30294c(String str) {
        if (Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(new StringBuffer(str)).find()) {
            if (Build.VERSION.SDK_INT < 11) {
                StringBuffer stringBuffer = new StringBuffer(str);
                String property = System.getProperty("line.separator");
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(stringBuffer);
                if (matcher.find()) {
                    stringBuffer.delete(matcher.start(), matcher.end());
                }
                Matcher matcher2 = Pattern.compile("<head[^>]*>", 2).matcher(stringBuffer);
                for (int i = 0; matcher2.find(i); i = matcher2.end()) {
                    stringBuffer.insert(matcher2.end(), property + "<script>" + property + C9149n6.m48988a() + property + "</script>");
                }
                str = stringBuffer.toString();
            }
            this.isMraidAd = true;
        }
        if (MetaData.f38952k.mo31005U()) {
            try {
                str = C9134m9.m48966a(C9600v7.m50421a(), str);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        Map<Activity, Integer> map = C9605vb.f39316a;
        C9410d dVar = C9410d.f38788h;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        dVar.f38790b.put(uuid, str);
        this.htmlUuid = uuid;
        String a = C9605vb.m50452a(str, "@smartRedirect@", "@smartRedirect@");
        if (a != null) {
            String[] split = a.split(",");
            this.smartRedirect = new boolean[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                if (split[i2].compareTo("true") == 0) {
                    this.smartRedirect[i2] = true;
                } else {
                    this.smartRedirect[i2] = false;
                }
            }
        }
        String a2 = C9605vb.m50452a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a2 != null) {
            this.trackingClickUrls = a2.split(",");
        }
        String a3 = C9605vb.m50452a(str, "@closeUrl@", "@closeUrl@");
        if (a3 != null) {
            this.closingUrl = a3.split(",");
        }
        String a4 = C9605vb.m50452a(str, "@tracking@", "@tracking@");
        if (a4 != null) {
            this.trackingUrls = a4.split(",");
        }
        String a5 = C9605vb.m50452a(str, "@packageName@", "@packageName@");
        if (a5 != null) {
            this.packageNames = a5.split(",");
        }
        String a6 = C9605vb.m50452a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a6 != null) {
            String[] split2 = a6.split(",");
            this.inAppBrowserEnabled = new boolean[split2.length];
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (split2[i3].compareTo("false") == 0) {
                    this.inAppBrowserEnabled[i3] = false;
                } else {
                    this.inAppBrowserEnabled[i3] = true;
                }
            }
        }
        String a7 = C9605vb.m50452a(str, "@orientation@", "@orientation@");
        if (a7 != null) {
            Map<Activity, Integer> map2 = C9605vb.f39316a;
            mo30491a(SplashConfig.Orientation.getByName(a7));
        }
        String a8 = C9605vb.m50452a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a8 != null) {
            getAdInfoOverride().mo30613a(Boolean.parseBoolean(a8));
        }
        String a9 = C9605vb.m50452a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a9 != null) {
            getAdInfoOverride().mo30612a(AdInformationPositions.Position.getByName(a9));
        }
        String a10 = C9605vb.m50452a(str, "@ttl@", "@ttl@");
        if (a10 != null) {
            mo30495b(a10);
        }
        String a11 = C9605vb.m50452a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a11 != null) {
            if (Arrays.asList(a11.split(",")).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a12 = C9605vb.m50452a(str, "@delayCloseInterval@", "@delayCloseInterval@");
        if (a12 != null && a12.length() > 0) {
            try {
                this.delayCloseInterval = Long.valueOf(Long.parseLong(a12));
            } catch (NumberFormatException unused) {
            }
        }
        String a13 = C9605vb.m50452a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a13 != null && a13.length() > 0) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(a13));
            } catch (NumberFormatException unused2) {
            }
        }
        String a14 = C9605vb.m50452a(str, "@rewardDuration@", "@rewardDuration@");
        if (a14 != null) {
            try {
                this.rewardDuration = Integer.parseInt(a14);
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
        }
        String a15 = C9605vb.m50452a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a15 != null) {
            try {
                this.rewardedHideTimer = Boolean.parseBoolean(a15);
            } catch (Throwable th3) {
                C9023i4.m48681a(th3);
            }
        }
        String a16 = C9605vb.m50452a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a16 != null && !a16.equals("")) {
            String[] split3 = a16.split(",");
            this.sendRedirectHops = new Boolean[split3.length];
            for (int i4 = 0; i4 < split3.length; i4++) {
                if (split3[i4].compareTo("true") == 0) {
                    this.sendRedirectHops[i4] = Boolean.TRUE;
                } else if (split3[i4].compareTo("false") == 0) {
                    this.sendRedirectHops[i4] = Boolean.FALSE;
                } else {
                    this.sendRedirectHops[i4] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.mo30751b(C9605vb.m50452a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.mo30753c(C9605vb.m50452a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.mo30749a(C9605vb.m50452a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a17 = C9605vb.m50452a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a17)) {
                this.consentData.mo30747a(Integer.valueOf(Integer.parseInt(a17)));
            }
        } catch (Throwable th4) {
            C9023i4.m48681a(th4);
        }
        try {
            String a18 = C9605vb.m50452a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a18)) {
                this.consentData.mo30748a(Long.valueOf(Long.parseLong(a18)));
            }
        } catch (Throwable th5) {
            C9023i4.m48681a(th5);
        }
        try {
            String a19 = C9605vb.m50452a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a19)) {
                this.consentData.mo30746a(Boolean.valueOf(Boolean.parseBoolean(a19)));
            }
        } catch (Throwable th6) {
            C9023i4.m48681a(th6);
        }
        int length = this.smartRedirect.length;
        String[] strArr = this.trackingUrls;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i5 = 0;
            while (true) {
                boolean[] zArr2 = this.smartRedirect;
                if (i5 >= zArr2.length) {
                    break;
                }
                zArr[i5] = zArr2[i5];
                i5++;
            }
            while (i5 < this.trackingUrls.length) {
                zArr[i5] = false;
                i5++;
            }
            this.smartRedirect = zArr;
        }
    }

    /* renamed from: g */
    public String[] mo30496g() {
        return this.closingUrl;
    }

    public String getAdId() {
        return C9605vb.m50452a(mo30499j(), "@adId@", "@adId@");
    }

    public String getBidToken() {
        return C9605vb.m50452a(mo30499j(), "@bidToken@", "@bidToken@");
    }

    public String getDParam() {
        String[] strArr = this.trackingClickUrls;
        String[] strArr2 = this.trackingUrls;
        String str = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            str = strArr2[0];
        }
        return C9396a.m49774a(str2, str);
    }

    /* renamed from: h */
    public Long mo30497h() {
        return this.delayImpressionInSeconds;
    }

    /* renamed from: i */
    public int mo30498i() {
        return this.height;
    }

    /* renamed from: j */
    public String mo30499j() {
        C9410d dVar = C9410d.f38788h;
        return dVar.f38790b.get(this.htmlUuid);
    }

    /* renamed from: k */
    public String mo30500k() {
        return this.htmlUuid;
    }

    /* renamed from: l */
    public int mo30501l() {
        return this.orientation;
    }

    /* renamed from: m */
    public String[] mo30502m() {
        return this.packageNames;
    }

    /* renamed from: n */
    public int mo30503n() {
        return this.rewardDuration;
    }

    /* renamed from: o */
    public String[] mo30504o() {
        return this.trackingClickUrls;
    }

    /* renamed from: p */
    public int mo30505p() {
        return this.width;
    }

    /* renamed from: q */
    public final void mo30506q() {
        f38638c = C9605vb.m50447a(getContext());
    }

    /* renamed from: r */
    public boolean mo30507r() {
        return this.isMraidAd;
    }

    /* renamed from: s */
    public boolean mo30508s() {
        return this.rewardedHideTimer;
    }

    /* renamed from: t */
    public Boolean[] mo30509t() {
        return this.sendRedirectHops;
    }

    /* renamed from: x */
    public Long mo30510x() {
        return this.delayCloseInterval;
    }

    /* renamed from: a */
    public void mo30491a(SplashConfig.Orientation orientation2) {
        this.orientation = 0;
        Map<Activity, Integer> map = C9605vb.f39316a;
        if (orientation2 == null) {
            return;
        }
        if (orientation2.equals(SplashConfig.Orientation.PORTRAIT)) {
            this.orientation = 1;
        } else if (orientation2.equals(SplashConfig.Orientation.LANDSCAPE)) {
            this.orientation = 2;
        }
    }

    /* renamed from: b */
    public Boolean mo30494b(int i) {
        Boolean[] boolArr = this.sendRedirectHops;
        if (boolArr == null || i < 0 || i >= boolArr.length) {
            return null;
        }
        return boolArr[i];
    }

    /* renamed from: a */
    public boolean mo30493a(int i) {
        boolean[] zArr = this.inAppBrowserEnabled;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return true;
        }
        return zArr[i];
    }

    /* renamed from: a */
    public void mo30492a(List<AppPresenceDetails> list) {
        this.apps = list;
    }
}
