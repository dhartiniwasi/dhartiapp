package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import com.startapp.C9023i4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.splash.C9342g;
import com.startapp.sdk.adsbase.C9396a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SplashConfig implements Serializable {

    /* renamed from: c */
    public static final Theme f38389c = Theme.OCEAN;

    /* renamed from: d */
    public static final MinSplashTime f38390d = MinSplashTime.REGULAR;

    /* renamed from: e */
    public static final long f38391e = 7500;

    /* renamed from: f */
    public static final MaxAdDisplayTime f38392f = MaxAdDisplayTime.FOR_EVER;

    /* renamed from: g */
    public static final Orientation f38393g = Orientation.AUTO;
    private static final long serialVersionUID = 995423687458599030L;

    /* renamed from: a */
    public transient Drawable f38394a = null;
    private String appName = "";

    /* renamed from: b */
    public transient String f38395b = "";
    private int customScreen = -1;
    @C9226pb(type = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = f38392f;
    private Long defaultMaxLoadTime = Long.valueOf(f38391e);
    @C9226pb(type = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = f38390d;
    @C9226pb(type = Orientation.class)
    private Orientation defaultOrientation = f38393g;
    @C9226pb(type = Theme.class)
    private Theme defaultTheme = f38389c;
    private boolean forceNative = false;
    private boolean htmlSplash = true;
    private byte[] logoByteArray = null;
    private int logoRes = -1;
    private String splashBgColor = "#066CAA";
    private String splashFontColor = "ffffff";
    private String splashLoadingType = "LoadingDots";

    /* renamed from: com.startapp.sdk.ads.splash.SplashConfig$1 */
    /* compiled from: Sta */
    public static /* synthetic */ class C93271 {
        public static final /* synthetic */ int[] $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Theme[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Theme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme = r0
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.DEEP_BLUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.SKY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.ASHEN_SKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.BLAZE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.GLOOMY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.OCEAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.USER_DEFINED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashConfig.C93271.<clinit>():void");
        }
    }

    /* compiled from: Sta */
    public enum MaxAdDisplayTime {
        SHORT(5000),
        LONG(10000),
        FOR_EVER(86400000);
        
        private long index;

        private MaxAdDisplayTime(long j) {
            this.index = j;
        }

        public static MaxAdDisplayTime getByIndex(long j) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].getIndex() == j) {
                    maxAdDisplayTime = values[i];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    maxAdDisplayTime = values[i];
                }
            }
            return maxAdDisplayTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum MinSplashTime {
        REGULAR(3000),
        SHORT(AdError.SERVER_ERROR_CODE),
        LONG(5000);
        
        private long index;

        private MinSplashTime(int i) {
            this.index = (long) i;
        }

        public static MinSplashTime getByIndex(long j) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].getIndex() == j) {
                    minSplashTime = values[i];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    minSplashTime = values[i];
                }
            }
            return minSplashTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);
        
        private int index;

        private Orientation(int i) {
            this.index = i;
        }

        public static Orientation getByIndex(int i) {
            Orientation orientation = PORTRAIT;
            Orientation[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    orientation = values[i2];
                }
            }
            return orientation;
        }

        public static Orientation getByName(String str) {
            Orientation orientation = AUTO;
            Orientation[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    orientation = values[i];
                }
            }
            return orientation;
        }

        public int getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);
        
        private int index;

        private Theme(int i) {
            this.index = i;
        }

        public static Theme getByIndex(int i) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    theme = values[i2];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    theme = values[i];
                }
            }
            return theme;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public static SplashConfig getDefaultSplashConfig() {
        SplashConfig splashConfig = new SplashConfig();
        SplashConfig minSplashTime = splashConfig.setTheme(f38389c).setMinSplashTime(f38390d);
        minSplashTime.defaultMaxLoadTime = Long.valueOf(f38391e);
        minSplashTime.setMaxAdDisplayTime(f38392f).setOrientation(f38393g).setLoadingType("LoadingDots").setAppName("");
        return splashConfig;
    }

    /* renamed from: a */
    public Long mo30209a() {
        return this.defaultMaxLoadTime;
    }

    /* renamed from: b */
    public boolean mo30210b() {
        return this.defaultTheme == Theme.USER_DEFINED || getCustomScreen() != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashConfig splashConfig = (SplashConfig) obj;
        if (this.forceNative == splashConfig.forceNative && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && C9605vb.m50465a(this.appName, splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && C9605vb.m50465a(this.defaultMaxLoadTime, splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && C9605vb.m50465a(this.splashBgColor, splashConfig.splashBgColor) && C9605vb.m50465a(this.splashFontColor, splashConfig.splashFontColor) && C9605vb.m50465a(this.splashLoadingType, splashConfig.splashLoadingType)) {
            return true;
        }
        return false;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getErrorMessage() {
        return this.f38395b;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public Drawable getLogo() {
        return this.f38394a;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.hashCode(this.logoByteArray) + (Arrays.deepHashCode(objArr) * 31);
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SplashConfig setCustomScreen(int i) {
        this.customScreen = i;
        return this;
    }

    public void setDefaults(Context context) {
        ApplicationInfo applicationInfo;
        SplashConfig a = SplashMetaData.f38416a.mo30255a();
        if (a == null) {
            a = getDefaultSplashConfig();
        } else {
            this.htmlSplash = a.isHtmlSplash();
        }
        SplashConfig defaultSplashConfig = getDefaultSplashConfig();
        if (a.defaultTheme == null) {
            a.setTheme(defaultSplashConfig.defaultTheme);
        }
        if (a.getMinSplashTime() == null) {
            a.setMinSplashTime(defaultSplashConfig.getMinSplashTime());
        }
        if (a.defaultMaxLoadTime == null) {
            a.defaultMaxLoadTime = Long.valueOf(defaultSplashConfig.defaultMaxLoadTime.longValue());
        }
        if (a.getMaxAdDisplayTime() == null) {
            a.setMaxAdDisplayTime(defaultSplashConfig.getMaxAdDisplayTime());
        }
        if (a.getOrientation() == null) {
            a.setOrientation(defaultSplashConfig.getOrientation());
        }
        if (a.getLoadingType() == null) {
            a.setLoadingType(defaultSplashConfig.getLoadingType());
        }
        if (a.getAppName().equals("")) {
            a.setAppName(C9396a.m49773a(context, "Welcome!"));
        }
        if (getMaxAdDisplayTime() == null) {
            setMaxAdDisplayTime(a.getMaxAdDisplayTime());
        }
        if (this.defaultMaxLoadTime == null) {
            this.defaultMaxLoadTime = Long.valueOf(a.defaultMaxLoadTime.longValue());
        }
        if (getMinSplashTime() == null) {
            setMinSplashTime(a.getMinSplashTime());
        }
        if (getOrientation() == null) {
            setOrientation(a.getOrientation());
        }
        if (this.defaultTheme == null) {
            setTheme(a.defaultTheme);
        }
        if (getLogoRes() == -1 && (applicationInfo = context.getApplicationInfo()) != null) {
            setLogo(applicationInfo.icon);
        }
        if (getAppName().equals("")) {
            setAppName(a.getAppName());
        }
    }

    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    public SplashConfig setLogo(int i) {
        this.logoRes = i;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    /* renamed from: a */
    public View mo30207a(Context context) {
        Theme theme = this.defaultTheme;
        if (theme == Theme.USER_DEFINED) {
            try {
                return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getCustomScreen(), (ViewGroup) null);
            } catch (Resources.NotFoundException e) {
                Log.w("StartAppSDK", e);
                return null;
            } catch (InflateException e2) {
                Log.w("StartAppSDK", e2);
                return null;
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                return null;
            }
        } else {
            switch (C9342g.C9343a.f38445a[theme.ordinal()]) {
                case 1:
                    View a = C9342g.m49454a(context, this);
                    a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16356182, -15029533, -16356182}));
                    ((TextView) a.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                    ((TextView) a.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(208, 210, 210));
                    return a;
                case 2:
                    View a2 = C9342g.m49454a(context, this);
                    int i = context.getResources().getDisplayMetrics().widthPixels;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-921103, -6040347});
                    gradientDrawable.setGradientType(1);
                    gradientDrawable.setGradientRadius((float) (i / 2));
                    a2.setBackgroundDrawable(gradientDrawable);
                    ((TextView) a2.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                    ((TextView) a2.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(162, 172, 175));
                    return a2;
                case 3:
                    View a3 = C9342g.m49454a(context, this);
                    a3.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3881788, -1}));
                    ((TextView) a3.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                    ((TextView) a3.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(153, 153, 153));
                    return a3;
                case 4:
                    View a4 = C9342g.m49454a(context, this);
                    int i2 = context.getResources().getDisplayMetrics().widthPixels;
                    GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-92376, -40960});
                    gradientDrawable2.setGradientType(1);
                    gradientDrawable2.setGradientRadius((float) (i2 / 2));
                    a4.setBackgroundDrawable(gradientDrawable2);
                    ((TextView) a4.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                    ((TextView) a4.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(255, 198, 151));
                    return a4;
                case 5:
                    View a5 = C9342g.m49454a(context, this);
                    a5.setBackgroundColor(Color.rgb(47, 53, 63));
                    ((TextView) a5.findViewById(100)).setTextColor(Color.rgb(51, 181, 229));
                    ((TextView) a5.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(122, 130, 139));
                    return a5;
                case 6:
                    View a6 = C9342g.m49454a(context, this);
                    a6.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14451558, -7876130}));
                    ((TextView) a6.findViewById(100)).setTextColor(Color.rgb(6, 61, 82));
                    ((TextView) a6.findViewById(C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall)).setTextColor(Color.rgb(6, 61, 82));
                    return a6;
                default:
                    return null;
            }
        }
    }

    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    /* renamed from: b */
    public boolean mo30211b(Context context) {
        if (C93271.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()] != 7) {
            if (getAppName().equals("")) {
                setAppName(C9396a.m49773a(context, "Welcome!"));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                try {
                    if (getLogoRes() == -1) {
                        setLogo(context.getApplicationInfo().icon);
                        this.f38394a = context.getResources().getDrawable(context.getApplicationInfo().icon);
                    } else {
                        this.f38394a = context.getResources().getDrawable(getLogoRes());
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        } else if (getCustomScreen() == -1) {
            this.f38395b = "StartApp: Exception getting custom screen resource id, make sure it is set";
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public SplashHtml mo30208a(Activity activity) {
        String str = "#333333";
        String str2 = "#066CAA";
        switch (C93271.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()]) {
            case 1:
                break;
            case 2:
                str2 = "#a3d4e5";
                break;
            case 3:
                str2 = "#E3E3E3";
                break;
            case 4:
                str2 = "#FF6600";
                break;
            case 5:
                str = "#33B5E5";
                str2 = "#2F353F";
                break;
            case 6:
                str = "#063D51";
                str2 = "#237C9A";
                break;
            default:
                str = "ffffff";
                break;
        }
        str = "#FFFFFF";
        this.splashBgColor = str2;
        this.splashFontColor = str;
        SplashHtml splashHtml = new SplashHtml(activity);
        splashHtml.mo30250a(this);
        splashHtml.mo30253d();
        return splashHtml;
    }
}
