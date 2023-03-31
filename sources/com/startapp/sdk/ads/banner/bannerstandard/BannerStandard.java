package com.startapp.sdk.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.C8837b0;
import com.startapp.C8870c1;
import com.startapp.C9014hd;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9087k9;
import com.startapp.C9131m6;
import com.startapp.C9148n5;
import com.startapp.C9194o6;
import com.startapp.C9231q0;
import com.startapp.C9253r0;
import com.startapp.C9259r6;
import com.startapp.C9260r7;
import com.startapp.C9265rb;
import com.startapp.C9270s0;
import com.startapp.C9278s6;
import com.startapp.C9553t6;
import com.startapp.C9599v6;
import com.startapp.C9605vb;
import com.startapp.C9612w0;
import com.startapp.C9615w2;
import com.startapp.C9619w6;
import com.startapp.C9641x9;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p184aa.C6523c;

/* compiled from: Sta */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {

    /* renamed from: S */
    public static final /* synthetic */ int f38264S = 0;

    /* renamed from: B */
    public final C9270s0 f38265B;

    /* renamed from: C */
    public BannerListener f38266C;

    /* renamed from: D */
    public boolean f38267D;

    /* renamed from: E */
    public AdInformationObject f38268E;

    /* renamed from: F */
    public RelativeLayout f38269F;

    /* renamed from: G */
    public RelativeLayout f38270G;

    /* renamed from: H */
    public CloseableLayout f38271H;

    /* renamed from: I */
    public C9087k9 f38272I;

    /* renamed from: J */
    public C9260r7 f38273J;

    /* renamed from: K */
    public C9014hd f38274K;

    /* renamed from: L */
    public C9014hd f38275L;

    /* renamed from: M */
    public MraidBannerController f38276M;

    /* renamed from: N */
    public MraidBannerController f38277N;

    /* renamed from: O */
    public ViewGroup f38278O;

    /* renamed from: P */
    public final C9087k9.C9088a f38279P;

    /* renamed from: Q */
    public final Runnable f38280Q;

    /* renamed from: R */
    public final Runnable f38281R;

    /* renamed from: r */
    public BannerStandardAd f38282r;

    /* renamed from: s */
    public boolean f38283s;

    /* renamed from: t */
    public boolean f38284t;
    public WebView twoPartWebView;

    /* renamed from: u */
    public boolean f38285u;

    /* renamed from: v */
    public boolean f38286v;

    /* renamed from: w */
    public boolean f38287w;
    public WebView webView;

    /* renamed from: x */
    public final Handler f38288x;

    /* renamed from: y */
    public long f38289y;

    /* renamed from: z */
    public BannerOptions f38290z;

    /* compiled from: Sta */
    public class MraidBannerController extends C9612w0 {
        private WebView activeWebView;
        /* access modifiers changed from: private */
        public MraidState mraidState = MraidState.LOADING;
        private boolean mraidVisibility = false;
        /* access modifiers changed from: private */
        public C9278s6 nativeFeatureManager;
        private C9553t6 orientationProperties;
        private C9599v6 resizeProperties;

        /* compiled from: Sta */
        public class BannerWebViewClient extends C9619w6 {
            public BannerWebViewClient(C9131m6 m6Var) {
                super(m6Var);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (MraidBannerController.this.mraidState == MraidState.LOADING) {
                    C9605vb.m50458a(webView, true, "mraid.setPlacementType", "inline");
                    C9259r6.m49221a(BannerStandard.this.getContext(), webView, MraidBannerController.this.nativeFeatureManager);
                    MraidBannerController.this.updateDisplayMetrics(webView);
                    MraidState unused = MraidBannerController.this.mraidState = MraidState.DEFAULT;
                    C9194o6.m49099a(MraidBannerController.this.mraidState, webView);
                    C9605vb.m50458a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                }
                BannerStandard bannerStandard = BannerStandard.this;
                bannerStandard.mo30049p();
                if (MetaData.f38952k.mo31005U()) {
                    try {
                        bannerStandard.mo30044b(webView);
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                }
            }
        }

        public MraidBannerController(WebView webView, C9612w0.C9613a aVar) {
            super(aVar);
            this.activeWebView = webView;
            webView.setWebViewClient(new BannerWebViewClient(this));
            this.nativeFeatureManager = new C9278s6(BannerStandard.this.getContext());
            this.orientationProperties = new C9553t6();
        }

        /* access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z) {
            if (this.mraidVisibility != z) {
                this.mraidVisibility = z;
                C9605vb.m50458a(this.activeWebView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z));
            }
        }

        /* access modifiers changed from: private */
        public void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                C9194o6.m49101b(context, i, i2, webView);
                Point point = BannerStandard.this.f38265B.f38176a;
                C9194o6.m49100b(context, i3, i4, point.x, point.y, webView);
                C9194o6.m49096a(context, i, i2, webView);
                Point point2 = BannerStandard.this.f38265B.f38176a;
                C9194o6.m49095a(context, i3, i4, point2.x, point2.y, webView);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }

        public void close() {
            BannerStandard.m49336a(BannerStandard.this);
        }

        public void expand(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            int i = BannerStandard.f38264S;
            bannerStandard.mo29914b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            boolean z = str != null && !TextUtils.isEmpty(str);
            if (z) {
                bannerStandard.f38284t = false;
                if (bannerStandard.twoPartWebView == null) {
                    bannerStandard.twoPartWebView = ComponentLocator.m50248a(bannerStandard.getContext()).mo31187w().mo29704b();
                }
                bannerStandard.f38277N = new MraidBannerController(bannerStandard.twoPartWebView, new C9612w0.C9613a() {
                    public boolean onClickEvent(String str) {
                        if (!BannerStandard.this.f38284t) {
                            C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                            i4Var.f36952d = "fake_click";
                            i4Var.f36955g = C9396a.m49774a(str, (String) null);
                            StringBuilder a = C8870c1.m48422a("jsTag=");
                            a.append(BannerStandard.this.f38285u);
                            i4Var.f36953e = a.toString();
                            i4Var.mo29471a();
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if ((!bannerStandard.f38285u || bannerStandard.f38284t) && str != null) {
                            return BannerStandard.m49338a(bannerStandard, str);
                        }
                        return false;
                    }
                });
                bannerStandard.f38275L = new C9014hd(bannerStandard.twoPartWebView, BannerMetaData.f38219b.mo29957a(), new C9014hd.C9016b() {
                    public boolean onUpdate(boolean z) {
                        BannerStandard.this.f38276M.fireViewableChangeEvent(z);
                        BannerStandard.this.f38277N.fireViewableChangeEvent(z);
                        return BannerStandard.this.f38282r.mo30507r();
                    }
                });
                bannerStandard.twoPartWebView.setId(159868226);
                bannerStandard.mo30040a(bannerStandard.twoPartWebView);
                bannerStandard.twoPartWebView.loadUrl(str);
            }
            if (bannerStandard.f38276M.getState() == MraidState.DEFAULT) {
                if (z) {
                    bannerStandard.f38271H.addView(bannerStandard.twoPartWebView, layoutParams);
                } else {
                    RelativeLayout relativeLayout = bannerStandard.f38270G;
                    if (relativeLayout != null) {
                        relativeLayout.removeView(bannerStandard.webView);
                        bannerStandard.f38270G.setVisibility(4);
                    }
                    bannerStandard.f38271H.addView(bannerStandard.webView, layoutParams);
                }
                if (bannerStandard.f38278O == null) {
                    bannerStandard.f38278O = bannerStandard.mo30051s();
                }
                bannerStandard.f38278O.addView(bannerStandard.f38271H, new FrameLayout.LayoutParams(-1, -1));
            } else if (bannerStandard.f38276M.getState() == MraidState.RESIZED && z) {
                bannerStandard.f38271H.removeView(bannerStandard.webView);
                RelativeLayout relativeLayout2 = bannerStandard.f38270G;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(bannerStandard.webView, layoutParams);
                    bannerStandard.f38270G.setVisibility(4);
                }
                bannerStandard.f38271H.addView(bannerStandard.twoPartWebView, layoutParams);
            }
            bannerStandard.f38271H.setLayoutParams(layoutParams);
            bannerStandard.f38276M.setState(MraidState.EXPANDED);
        }

        public C9599v6 getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f38195b.contains(str);
        }

        public void resize() {
            BannerStandard bannerStandard = BannerStandard.this;
            C9599v6 resizeProperties2 = bannerStandard.f38276M.getResizeProperties();
            if (resizeProperties2 == null) {
                C9194o6.m49097a(bannerStandard.webView, "requires: setResizeProperties first", "resize");
                return;
            }
            bannerStandard.mo29914b();
            if (bannerStandard.f38276M.getState() != MraidState.LOADING && bannerStandard.f38276M.getState() != MraidState.HIDDEN) {
                if (bannerStandard.f38276M.getState() == MraidState.EXPANDED) {
                    C9194o6.m49097a(bannerStandard.webView, "Not allowed to resize from an already expanded ad", "resize");
                    return;
                }
                int i = resizeProperties2.f39290a;
                int i2 = resizeProperties2.f39291b;
                int i3 = resizeProperties2.f39292c;
                int i4 = resizeProperties2.f39293d;
                int[] iArr = new int[2];
                bannerStandard.webView.getLocationOnScreen(iArr);
                Context context = bannerStandard.getContext();
                int b = C9265rb.m49239b(context, iArr[0]) + i3;
                int round = Math.round(((float) iArr[1]) / context.getResources().getDisplayMetrics().density) + i4;
                Rect rect = new Rect(b, round, i + b, i2 + round);
                ViewGroup s = bannerStandard.mo30051s();
                int round2 = Math.round(((float) s.getWidth()) / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(((float) s.getHeight()) / context.getResources().getDisplayMetrics().density);
                int[] iArr2 = new int[2];
                s.getLocationOnScreen(iArr2);
                int round4 = Math.round(((float) iArr2[0]) / context.getResources().getDisplayMetrics().density);
                int round5 = Math.round(((float) iArr2[1]) / context.getResources().getDisplayMetrics().density);
                if (!resizeProperties2.f39295f) {
                    if (rect.width() > round2 || rect.height() > round3) {
                        C9194o6.m49097a(bannerStandard.webView, "Not enough room for the ad", "resize");
                        return;
                    }
                    rect.offsetTo(Math.max(round4, Math.min(rect.left, (round4 + round2) - rect.width())), Math.max(round5, Math.min(rect.top, (round5 + round3) - rect.height())));
                }
                Rect rect2 = new Rect();
                try {
                    CloseableLayout.ClosePosition a = CloseableLayout.ClosePosition.m49371a(resizeProperties2.f39294e, CloseableLayout.ClosePosition.TOP_RIGHT);
                    int i5 = bannerStandard.f38271H.f38296e;
                    Gravity.apply(a.mo30084a(), i5, i5, rect, rect2);
                    if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                        C9194o6.m49097a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else if (!rect.contains(rect2)) {
                        C9194o6.m49097a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else {
                        bannerStandard.f38271H.setCloseVisible(false);
                        bannerStandard.f38271H.setClosePosition(a);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                        layoutParams.leftMargin = rect.left - round4;
                        layoutParams.topMargin = rect.top - round5;
                        if (bannerStandard.f38276M.getState() == MraidState.DEFAULT) {
                            RelativeLayout relativeLayout = bannerStandard.f38270G;
                            if (relativeLayout != null) {
                                relativeLayout.removeView(bannerStandard.webView);
                                bannerStandard.f38270G.setVisibility(4);
                            }
                            bannerStandard.f38271H.addView(bannerStandard.webView, new FrameLayout.LayoutParams(-1, -1));
                            if (bannerStandard.f38278O == null) {
                                bannerStandard.f38278O = bannerStandard.mo30051s();
                            }
                            bannerStandard.f38278O.addView(bannerStandard.f38271H, layoutParams);
                        } else if (bannerStandard.f38276M.getState() == MraidState.RESIZED) {
                            bannerStandard.f38271H.setLayoutParams(layoutParams);
                        }
                        bannerStandard.f38271H.setClosePosition(a);
                        bannerStandard.f38276M.setState(MraidState.RESIZED);
                    }
                } catch (Exception e) {
                    C9194o6.m49097a(bannerStandard.webView, e.getMessage(), "resize");
                }
            }
        }

        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.m49337a(BannerStandard.this, Boolean.parseBoolean(str));
            }
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            C9553t6 t6Var = this.orientationProperties;
            if (t6Var.f39189a != parseBoolean || t6Var.f39190b != C9553t6.m50360a(str)) {
                C9553t6 t6Var2 = this.orientationProperties;
                t6Var2.f39189a = parseBoolean;
                t6Var2.f39190b = C9553t6.m50360a(str);
                applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
            }
        }

        public void setResizeProperties(Map<String, String> map) {
            boolean z;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null) {
                    if (!Boolean.parseBoolean(str)) {
                        z = false;
                        this.resizeProperties = new C9599v6(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
                    }
                }
                z = true;
                this.resizeProperties = new C9599v6(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
            } catch (Exception unused) {
                C9194o6.m49097a(this.activeWebView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState2) {
            this.mraidState = mraidState2;
            C9194o6.m49099a(mraidState2, this.activeWebView);
        }

        public void useCustomClose(String str) {
            BannerStandard.m49337a(BannerStandard.this, Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb A[Catch:{ all -> 0x0119 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m49338a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard r18, java.lang.String r19) {
        /*
            r0 = r18
            r2 = r19
            r18.getClass()
            r1 = 0
            java.lang.String r3 = com.startapp.sdk.adsbase.C9396a.m49774a((java.lang.String) r2, (java.lang.String) r1)
            android.content.Context r4 = r18.getContext()
            com.startapp.sdk.ads.banner.BannerListener r5 = r0.f38266C
            com.startapp.C9231q0.m49170a(r4, r5, r0, r3)
            com.startapp.k9 r3 = r0.f38272I
            if (r3 == 0) goto L_0x001c
            r3.mo29608a(r1, r1)
        L_0x001c:
            com.startapp.hd r3 = r0.f38274K
            if (r3 == 0) goto L_0x0023
            r3.mo29465a()
        L_0x0023:
            com.startapp.hd r3 = r0.f38275L
            if (r3 == 0) goto L_0x002a
            r3.mo29465a()
        L_0x002a:
            r18.mo30049p()
            android.content.Context r3 = r18.getContext()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
            boolean r3 = com.startapp.sdk.adsbase.C9396a.m49790a((android.content.Context) r3, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r4)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r4 = r0.f38282r
            java.lang.String[] r4 = r4.mo30504o()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r5 = r0.f38282r
            java.lang.String[] r5 = r5.mo30502m()
            boolean r6 = r0.f38285u
            java.lang.String r7 = "adId: "
            r14 = 1
            r15 = 0
            if (r6 != 0) goto L_0x011e
            java.lang.String r6 = "index="
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x011e
            int r6 = com.startapp.sdk.adsbase.C9396a.m49769a((java.lang.String) r19)     // Catch:{ all -> 0x0119 }
            if (r6 >= 0) goto L_0x0080
            com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x0119 }
            com.startapp.j4 r2 = com.startapp.C9043j4.f36994e     // Catch:{ all -> 0x0119 }
            r1.<init>((com.startapp.C9043j4) r2)     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "Wrong index extracted from URL"
            r1.f36952d = r2     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r2.<init>()     // Catch:{ all -> 0x0119 }
            r2.append(r7)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f38282r     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.getAdId()     // Catch:{ all -> 0x0119 }
            r2.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0119 }
            r1.f36953e = r0     // Catch:{ all -> 0x0119 }
            r1.mo29471a()     // Catch:{ all -> 0x0119 }
            goto L_0x0142
        L_0x0080:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r7 = r0.f38282r     // Catch:{ all -> 0x0119 }
            r7.getClass()     // Catch:{ all -> 0x0119 }
            if (r6 < 0) goto L_0x0090
            boolean[] r7 = r7.smartRedirect     // Catch:{ all -> 0x0119 }
            int r8 = r7.length     // Catch:{ all -> 0x0119 }
            if (r6 < r8) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            boolean r7 = r7[r6]     // Catch:{ all -> 0x0119 }
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            if (r7 == 0) goto L_0x00e4
            if (r3 != 0) goto L_0x00e4
            android.content.Context r3 = r18.getContext()     // Catch:{ all -> 0x0119 }
            int r7 = r4.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r7) goto L_0x00a3
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x0119 }
            r4 = r4[r6]     // Catch:{ all -> 0x0119 }
            r7[r15] = r4     // Catch:{ all -> 0x0119 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r1
        L_0x00a4:
            int r4 = r5.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r4) goto L_0x00a9
            r1 = r5[r6]     // Catch:{ all -> 0x0119 }
        L_0x00a9:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r18.getAdPreferences()     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r1.getAdTag()     // Catch:{ all -> 0x0119 }
            r5.<init>(r1)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0119 }
            long r8 = r1.mo30481z()     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0119 }
            long r10 = r1.mo30480y()     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f38282r     // Catch:{ all -> 0x0119 }
            boolean r12 = r1.mo30493a((int) r6)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f38282r     // Catch:{ all -> 0x0119 }
            java.lang.Boolean r13 = r1.mo30494b((int) r6)     // Catch:{ all -> 0x0119 }
            r16 = 0
            r17 = 0
            r1 = r3
            r2 = r19
            r3 = r7
            r6 = r8
            r8 = r10
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r17
            com.startapp.sdk.adsbase.C9396a.m49782a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x0119 }
            goto L_0x01df
        L_0x00e4:
            android.content.Context r5 = r18.getContext()     // Catch:{ all -> 0x0119 }
            int r7 = r4.length     // Catch:{ all -> 0x0119 }
            if (r6 >= r7) goto L_0x00f1
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x0119 }
            r4 = r4[r6]     // Catch:{ all -> 0x0119 }
            r1[r15] = r4     // Catch:{ all -> 0x0119 }
        L_0x00f1:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r18.getAdPreferences()     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r1.getAdTag()     // Catch:{ all -> 0x0119 }
            r7.<init>(r1)     // Catch:{ all -> 0x0119 }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f38282r     // Catch:{ all -> 0x0119 }
            boolean r1 = r1.mo30493a((int) r6)     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x010b
            if (r3 != 0) goto L_0x010b
            r6 = 1
            goto L_0x010c
        L_0x010b:
            r6 = 0
        L_0x010c:
            r8 = 0
            r1 = r5
            r2 = r19
            r3 = r4
            r4 = r7
            r5 = r6
            r6 = r8
            com.startapp.sdk.adsbase.C9396a.m49781a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)     // Catch:{ all -> 0x0119 }
            goto L_0x01df
        L_0x0119:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            goto L_0x0142
        L_0x011e:
            int r1 = r4.length
            if (r1 >= r14) goto L_0x0145
            com.startapp.i4 r1 = new com.startapp.i4
            com.startapp.j4 r2 = com.startapp.C9043j4.f36994e
            r1.<init>((com.startapp.C9043j4) r2)
            java.lang.String r2 = "No tracking URLs"
            r1.f36952d = r2
            java.lang.StringBuilder r2 = com.startapp.C8870c1.m48422a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f38282r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f36953e = r0
            r1.mo29471a()
        L_0x0142:
            r14 = 0
            goto L_0x01e7
        L_0x0145:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f38282r
            r1.getClass()
            boolean[] r1 = r1.smartRedirect
            int r6 = r1.length
            if (r6 > 0) goto L_0x0151
            r1 = 0
            goto L_0x0153
        L_0x0151:
            boolean r1 = r1[r15]
        L_0x0153:
            if (r1 == 0) goto L_0x01b5
            if (r3 != 0) goto L_0x01b5
            int r1 = r5.length
            if (r1 >= r14) goto L_0x017c
            com.startapp.i4 r1 = new com.startapp.i4
            com.startapp.j4 r2 = com.startapp.C9043j4.f36994e
            r1.<init>((com.startapp.C9043j4) r2)
            java.lang.String r2 = "No package names"
            r1.f36952d = r2
            java.lang.StringBuilder r2 = com.startapp.C8870c1.m48422a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f38282r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f36953e = r0
            r1.mo29471a()
            goto L_0x0142
        L_0x017c:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r3 = new java.lang.String[r14]
            r4 = r4[r15]
            r3[r15] = r4
            r4 = r5[r15]
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            com.startapp.sdk.adsbase.model.AdPreferences r6 = r18.getAdPreferences()
            java.lang.String r6 = r6.getAdTag()
            r5.<init>(r6)
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            long r6 = r6.mo30481z()
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            long r8 = r8.mo30480y()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r10 = r0.f38282r
            boolean r10 = r10.mo30493a((int) r15)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r11 = r0.f38282r
            java.lang.Boolean r11 = r11.mo30494b((int) r15)
            r12 = 0
            r13 = 0
            r2 = r19
            com.startapp.sdk.adsbase.C9396a.m49782a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            goto L_0x01df
        L_0x01b5:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r5 = new java.lang.String[r14]
            r4 = r4[r15]
            r5[r15] = r4
            com.startapp.sdk.adsbase.commontracking.TrackingParams r4 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            com.startapp.sdk.adsbase.model.AdPreferences r6 = r18.getAdPreferences()
            java.lang.String r6 = r6.getAdTag()
            r4.<init>(r6)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r6 = r0.f38282r
            boolean r6 = r6.mo30493a((int) r15)
            if (r6 == 0) goto L_0x01d7
            if (r3 != 0) goto L_0x01d7
            r15 = 1
        L_0x01d7:
            r6 = 0
            r2 = r19
            r3 = r5
            r5 = r15
            com.startapp.sdk.adsbase.C9396a.m49781a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)
        L_0x01df:
            android.webkit.WebView r1 = r0.webView
            r1.stopLoading()
            r0.setClicked(r14)
        L_0x01e7:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.m49338a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo30043b(Point point, int i) {
        if (point.x <= 0) {
            point.x = i;
        }
    }

    /* renamed from: c */
    public int mo29915c() {
        return Math.max(this.f38290z.mo29972i() - ((int) this.f38289y), 0);
    }

    /* renamed from: d */
    public int mo29916d() {
        return this.f38208i;
    }

    /* renamed from: e */
    public String mo29917e() {
        return "StartApp Banner";
    }

    /* renamed from: f */
    public int mo29918f() {
        return this.f38290z.mo29972i();
    }

    /* renamed from: g */
    public View mo29919g() {
        RelativeLayout relativeLayout = this.f38270G;
        return relativeLayout != null ? relativeLayout : this;
    }

    public String getBidToken() {
        BannerStandardAd bannerStandardAd = this.f38282r;
        if (bannerStandardAd != null) {
            return bannerStandardAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.f38287w = false;
        C9396a.m49784a(this.f38281R);
    }

    /* renamed from: i */
    public void mo29927i() {
        int i;
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.f38271H = closeableLayout;
            closeableLayout.setOnCloseListener(new CloseableLayout.C9311a() {
                public void onClose() {
                    BannerStandard.m49336a(BannerStandard.this);
                }
            });
            WebView b = ComponentLocator.m50248a(context).mo31187w().mo29704b();
            this.webView = b;
            this.f38276M = new MraidBannerController(b, new C9612w0.C9613a() {
                public boolean onClickEvent(String str) {
                    if (!BannerStandard.this.f38284t) {
                        C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                        i4Var.f36952d = "fake_click";
                        i4Var.f36955g = C9396a.m49774a(str, (String) null);
                        StringBuilder a = C8870c1.m48422a("jsTag=");
                        a.append(BannerStandard.this.f38285u);
                        i4Var.f36953e = a.toString();
                        i4Var.mo29471a();
                    }
                    BannerStandard bannerStandard = BannerStandard.this;
                    if ((!bannerStandard.f38285u || bannerStandard.f38284t) && str != null) {
                        return BannerStandard.m49338a(bannerStandard, str);
                    }
                    return false;
                }
            });
            this.f38290z = new BannerOptions();
            if (this.f38282r == null) {
                BannerStandardAd bannerStandardAd = this.f38282r;
                if (bannerStandardAd == null) {
                    i = 0;
                } else {
                    i = bannerStandardAd.mo30070v();
                }
                this.f38282r = new BannerStandardAd(context, i);
            }
            if (getId() == -1) {
                setId(this.f38208i);
            }
            this.webView.setId(159868225);
            mo30040a(this.webView);
            this.f38290z = BannerMetaData.f38219b.mo29958b();
            setMinimumWidth(C9265rb.m49233a(getContext(), this.f38265B.f38176a.x));
            setMinimumHeight(C9265rb.m49233a(getContext(), this.f38265B.f38176a.y));
            WebView webView2 = this.webView;
            Context context2 = getContext();
            C93098 r4 = new Runnable() {
                public void run() {
                }
            };
            TrackingParams trackingParams = new TrackingParams(getAdPreferences().getAdTag());
            boolean a = this.f38282r.mo30493a(0);
            C9148n5 n5Var = new C9148n5(context2, r4, trackingParams);
            n5Var.f37339b = a;
            webView2.addJavascriptInterface(n5Var, "startappwall");
            this.f38270G = new RelativeLayout(getContext());
            mo30039a((View) this.webView);
            C9396a.m49784a(this.f38281R);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.f38270G, layoutParams);
            if (this.f38286v) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = BannerStandard.this.getViewTreeObserver();
                        int i = C8837b0.f36438a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if (!bannerStandard.f38283s) {
                            bannerStandard.mo29931k();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            hideBanner();
            mo30041a("BannerStandard.init - webview failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29932l() {
        /*
            r4 = this;
            com.startapp.r7 r0 = r4.f38273J
            r1 = 0
            r4.f38273J = r1
            if (r0 == 0) goto L_0x0010
            r0.mo29869a()     // Catch:{ all -> 0x000c }
            r0 = 1
            goto L_0x0011
        L_0x000c:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0027
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10 r1 = new com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10
            r1.<init>()
            r2 = 4000(0xfa0, double:1.9763E-320)
            r0.postDelayed(r1, r2)
            goto L_0x002a
        L_0x0027:
            r4.mo30053u()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.mo29932l():void");
    }

    public void loadHtml() {
        String j;
        BannerStandardAd bannerStandardAd = this.f38282r;
        if (bannerStandardAd != null && (j = bannerStandardAd.mo30499j()) != null) {
            if (getAdPreferences().getAdTag() != null && getAdPreferences().getAdTag().length() > 0) {
                j = j.replaceAll("startapp_adtag_placeholder", getAdPreferences().getAdTag());
            }
            if (CacheMetaData.m49873d()) {
                this.f38288x.postDelayed(new Runnable() {
                    public void run() {
                        BannerStandard bannerStandard = BannerStandard.this;
                        int i = BannerStandard.f38264S;
                        bannerStandard.mo29930j();
                    }
                }, (long) this.f38290z.mo29972i());
            }
            this.f38289y = System.currentTimeMillis();
            getContext();
            C9605vb.m50464a(this.webView, j);
        }
    }

    /* renamed from: m */
    public void mo29935m() {
        C9087k9 k9Var = this.f38272I;
        if (k9Var != null && k9Var.mo29611c()) {
            super.mo29935m();
        }
    }

    /* renamed from: n */
    public final void mo30046n() {
        if (this.f38268E == null && this.f38269F == null) {
            this.f38269F = new RelativeLayout(getContext());
            AdInformationObject adInformationObject = new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f38282r.getAdInfoOverride(), this.f38282r.getConsentData(), this.f38282r.getRequestUrl(), this.f38282r.getDParam());
            this.f38268E = adInformationObject;
            adInformationObject.mo30608a(this.f38269F);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.f38269F.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f38269F);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.f38269F, layoutParams);
    }

    /* renamed from: o */
    public final void mo30047o() {
        BannerStandardAd bannerStandardAd = this.f38282r;
        if (bannerStandardAd != null && bannerStandardAd.mo30507r()) {
            this.f38274K = new C9014hd(this.webView, BannerMetaData.f38219b.mo29957a(), new C9014hd.C9016b() {
                public boolean onUpdate(boolean z) {
                    BannerStandard.this.f38276M.fireViewableChangeEvent(z);
                    return BannerStandard.this.f38282r.mo30507r();
                }
            });
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            C8837b0.m48307b(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            C8837b0.m48307b(webView3);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            C8837b0.m48300a(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            C8837b0.m48300a(webView3);
        }
        C9087k9 k9Var = this.f38272I;
        if (k9Var != null) {
            k9Var.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        C9014hd hdVar = this.f38274K;
        if (hdVar != null) {
            hdVar.mo29465a();
        }
        C9014hd hdVar2 = this.f38275L;
        if (hdVar2 != null) {
            hdVar2.mo29465a();
        }
        mo30049p();
        C9260r7 r7Var = this.f38273J;
        this.f38273J = null;
        if (r7Var != null) {
            try {
                r7Var.mo29869a();
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        WebView webView4 = this.webView;
        Map<Activity, Integer> map = C9605vb.f39316a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView4, SystemClock.uptimeMillis() + 1000);
    }

    public void onFailedToReceiveAd(C9381Ad ad) {
        if (ad != null) {
            mo30041a(ad.getErrorMessage());
        }
    }

    public void onReceiveAd(C9381Ad ad) {
        String str;
        this.f38284t = false;
        removeView(this.f38269F);
        BannerStandardAd bannerStandardAd = this.f38282r;
        if (bannerStandardAd == null || bannerStandardAd.mo30499j() == null || this.f38282r.mo30499j().compareTo("") == 0) {
            mo30041a("No Banner received");
            return;
        }
        this.f38285u = "true".equals(C9605vb.m50452a(this.f38282r.mo30499j(), "@jsTag@", "@jsTag@"));
        loadHtml();
        try {
            if (mo30042a(Integer.parseInt(C9605vb.m50452a(this.f38282r.mo30499j(), "@width@", "@width@")), Integer.parseInt(C9605vb.m50452a(this.f38282r.mo30499j(), "@height@", "@height@")))) {
                this.f38283s = true;
                mo30046n();
                mo30052t();
                mo29910a();
                mo30047o();
                if (this.f38287w) {
                    C9396a.m49784a(this.f38280Q);
                }
                if (this.f38266C != null && !this.f38267D) {
                    this.f38267D = true;
                    Context context = getContext();
                    BannerListener bannerListener = this.f38266C;
                    BannerStandardAd bannerStandardAd2 = this.f38282r;
                    bannerStandardAd2.getClass();
                    String[] strArr = bannerStandardAd2.trackingUrls;
                    if (strArr.length <= 0) {
                        str = null;
                    } else {
                        str = strArr[0];
                    }
                    C9231q0.m49172c(context, bannerListener, this, C9396a.m49774a(str, (String) null));
                    return;
                }
                return;
            }
            mo30041a("Banner cannot be displayed (not enough room)");
        } catch (NumberFormatException unused) {
            mo30041a("Error Casting width & height from HTML");
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            mo30041a(th.getMessage());
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        double ceil = Math.ceil((double) (((float) i) / displayMetrics.density));
        double ceil2 = Math.ceil((double) (((float) i2) / displayMetrics.density));
        Point point = this.f38265B.f38176a;
        if (ceil < ((double) point.x) || ceil2 < ((double) point.y)) {
            C9396a.m49784a(this.f38281R);
        } else if (this.f38287w && this.f38283s) {
            C9396a.m49784a(this.f38280Q);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                C8837b0.m48307b(webView2);
            }
            WebView webView3 = this.twoPartWebView;
            if (webView3 != null) {
                C8837b0.m48307b(webView3);
                return;
            }
            return;
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            C8837b0.m48300a(webView4);
        }
        WebView webView5 = this.twoPartWebView;
        if (webView5 != null) {
            C8837b0.m48300a(webView5);
        }
    }

    /* renamed from: p */
    public final void mo30049p() {
        this.f38288x.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[SYNTHETIC, Splitter:B:32:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093 A[EDGE_INSN: B:56:0x0093->B:30:0x0093 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[EDGE_INSN: B:57:0x00f4->B:48:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point mo30050q() {
        /*
            r8 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0025
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.width
            int r3 = r3 + r2
            int r1 = com.startapp.C9265rb.m49239b(r1, r3)
            r0.x = r1
        L_0x0025:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x0044
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.height
            int r3 = r3 + r2
            int r1 = com.startapp.C9265rb.m49239b(r1, r3)
            r0.y = r1
        L_0x0044:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x005f
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r8.f38282r
            r1.mo30067b(r2)
        L_0x005f:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 > 0) goto L_0x0163
        L_0x0075:
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            boolean r2 = r2 instanceof android.view.View     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x0092
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0144 }
            r3 = r2
            r2 = r8
            goto L_0x0094
        L_0x0092:
            r2 = r8
        L_0x0093:
            r3 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x00f4
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00a2
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 > 0) goto L_0x00f4
        L_0x00a2:
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00c1
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C9265rb.m49239b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo30043b(r0, r4)     // Catch:{ all -> 0x00ef }
        L_0x00c1:
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00e0
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C9265rb.m49239b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo30038a((android.graphics.Point) r0, (int) r4)     // Catch:{ all -> 0x00ef }
        L_0x00e0:
            android.view.ViewParent r4 = r3.getParent()     // Catch:{ all -> 0x00ef }
            boolean r4 = r4 instanceof android.view.View     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x0093
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x00ef }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00ef }
            goto L_0x0094
        L_0x00ef:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0146
        L_0x00f4:
            if (r3 != 0) goto L_0x0111
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.widthPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.C9265rb.m49239b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.mo30043b(r0, r3)     // Catch:{ all -> 0x00ef }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.heightPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.C9265rb.m49239b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.mo30038a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0111:
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C9265rb.m49239b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo30043b(r0, r4)     // Catch:{ all -> 0x00ef }
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r3 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r3
            int r3 = com.startapp.C9265rb.m49239b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo30038a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0144:
            r2 = move-exception
            r3 = r8
        L_0x0146:
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)
            android.content.Context r2 = r3.getContext()
            int r4 = r1.widthPixels
            int r2 = com.startapp.C9265rb.m49239b(r2, r4)
            r3.mo30043b(r0, r2)
            android.content.Context r2 = r3.getContext()
            int r1 = r1.heightPixels
            int r1 = com.startapp.C9265rb.m49239b(r2, r1)
            r3.mo30038a((android.graphics.Point) r0, (int) r1)
        L_0x0163:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.mo30050q():android.graphics.Point");
    }

    /* renamed from: r */
    public int mo29992r() {
        return 0;
    }

    /* renamed from: s */
    public final ViewGroup mo30051s() {
        View view;
        View rootView;
        ViewGroup viewGroup = this.f38278O;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.f38270G;
        View view2 = null;
        if (!(context instanceof Activity)) {
            view = null;
        } else {
            view = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        if (!(relativeLayout == null || (rootView = relativeLayout.getRootView()) == null || (view2 = rootView.findViewById(16908290)) != null)) {
            view2 = rootView;
        }
        if (view == null) {
            view = view2;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return this.f38270G;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.f38266C = bannerListener;
    }

    public void showBanner() {
        try {
            ComponentLocator.m50248a(getContext()).mo31183s().mo29264a(2048);
        } catch (Throwable unused) {
        }
        this.f38287w = true;
        C9396a.m49784a(this.f38280Q);
    }

    /* renamed from: t */
    public void mo30052t() {
        long j;
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        String[] strArr = this.f38282r.trackingUrls;
        TrackingParams trackingParams = new TrackingParams(getAdPreferences().getAdTag());
        if (this.f38282r.mo30497h() != null) {
            j = TimeUnit.SECONDS.toMillis(this.f38282r.mo30497h().longValue());
        } else {
            j = TimeUnit.SECONDS.toMillis(MetaData.f38952k.mo31037r());
        }
        C9087k9 k9Var = new C9087k9(context, placement, strArr, trackingParams, j);
        this.f38272I = k9Var;
        k9Var.mo29607a(this.f38279P);
        mo29913a(this.f38272I);
    }

    /* renamed from: u */
    public final void mo30053u() {
        if (this.f38282r != null) {
            Point point = this.f38205f;
            if (point == null) {
                point = mo30050q();
            }
            this.f38282r.mo30490a(point.x, point.y);
            this.f38282r.setState(C9381Ad.AdState.UN_INITIALIZED);
            this.f38282r.mo30068c(mo29992r());
            this.f38282r.load(mo29946v(), this);
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    /* renamed from: b */
    public final void mo30044b(WebView webView2) {
        C9260r7 r7Var = this.f38273J;
        if (r7Var == null) {
            r7Var = new C9260r7(webView2);
            this.f38273J = r7Var;
        }
        if (r7Var.mo29873c()) {
            try {
                RelativeLayout relativeLayout = this.f38269F;
                if (relativeLayout != null) {
                    r7Var.mo29871a(relativeLayout, C6523c.OTHER, (String) null);
                }
                CloseableLayout closeableLayout = this.f38271H;
                if (closeableLayout != null) {
                    r7Var.mo29871a(closeableLayout, C6523c.CLOSE_AD, (String) null);
                }
            } catch (RuntimeException unused) {
            }
            r7Var.mo29870a(webView2);
            r7Var.mo29875e();
            r7Var.mo29874d();
            r7Var.mo29872b();
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences) {
        this(context, z, adPreferences, (BannerStandardAd) null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context);
        this.f38283s = false;
        this.f38284t = true;
        this.f38285u = false;
        this.f38286v = true;
        this.f38287w = true;
        this.f38288x = new Handler(Looper.getMainLooper());
        this.f38265B = new C9270s0(getWidthInDp(), getHeightInDp());
        this.f38267D = false;
        this.f38268E = null;
        this.f38269F = null;
        this.f38279P = new C9087k9.C9088a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i = BannerStandard.f38264S;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.f38266C;
                C9253r0 r0Var = null;
                C9615w2.m50488a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    r0Var = new C9253r0(bannerListener, bannerStandard, context);
                }
                C9396a.m49784a((Runnable) r0Var);
                bannerStandard.f38289y = System.currentTimeMillis() - bannerStandard.f38289y;
                bannerStandard.mo29935m();
            }
        };
        this.f38280Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.f38270G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f38282r != null) {
                    C9641x9 t = ComponentLocator.m50248a(bannerStandard.getContext()).mo31184t();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r = bannerStandard.mo29992r();
                    String adId = bannerStandard.f38282r.getAdId();
                    if (adId != null) {
                        t.f39385a.put(new C9641x9.C9642a(placement, r), adId);
                    }
                }
            }
        };
        this.f38281R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.f38270G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            this.f38286v = z;
            this.f38282r = bannerStandardAd;
            setAdPreferences(adPreferences);
            mo29925h();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38283s = false;
        this.f38284t = true;
        this.f38285u = false;
        this.f38286v = true;
        this.f38287w = true;
        this.f38288x = new Handler(Looper.getMainLooper());
        this.f38265B = new C9270s0(getWidthInDp(), getHeightInDp());
        this.f38267D = false;
        this.f38268E = null;
        this.f38269F = null;
        this.f38279P = new C9087k9.C9088a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i = BannerStandard.f38264S;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.f38266C;
                C9253r0 r0Var = null;
                C9615w2.m50488a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    r0Var = new C9253r0(bannerListener, bannerStandard, context);
                }
                C9396a.m49784a((Runnable) r0Var);
                bannerStandard.f38289y = System.currentTimeMillis() - bannerStandard.f38289y;
                bannerStandard.mo29935m();
            }
        };
        this.f38280Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.f38270G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f38282r != null) {
                    C9641x9 t = ComponentLocator.m50248a(bannerStandard.getContext()).mo31184t();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r = bannerStandard.mo29992r();
                    String adId = bannerStandard.f38282r.getAdId();
                    if (adId != null) {
                        t.f39385a.put(new C9641x9.C9642a(placement, r), adId);
                    }
                }
            }
        };
        this.f38281R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.f38270G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            mo29925h();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public final void mo30040a(WebView webView2) {
        webView2.setBackgroundColor(0);
        webView2.setHorizontalScrollBarEnabled(false);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BannerStandard.this.f38284t = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
        webView2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView2.setLongClickable(false);
    }

    /* renamed from: a */
    public final void mo30039a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C9265rb.m49233a(getContext(), this.f38265B.f38176a.x), C9265rb.m49233a(getContext(), this.f38265B.f38176a.y));
        layoutParams.addRule(13);
        this.f38270G.addView(view, layoutParams);
    }

    /* renamed from: a */
    public final void mo30038a(Point point, int i) {
        if (point.y <= 0) {
            point.y = i;
        }
    }

    /* renamed from: a */
    public final void mo30041a(String str) {
        setErrorMessage(str);
        if (this.f38266C != null && !this.f38267D) {
            this.f38267D = true;
            C9231q0.m49171b(getContext(), this.f38266C, this, (String) null);
        }
    }

    /* renamed from: a */
    public final boolean mo30042a(int i, int i2) {
        Point q = mo30050q();
        if (q.x < i || q.y < i2) {
            Point point = new Point(0, 0);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
            } else {
                layoutParams.width = point.x;
                layoutParams.height = point.y;
            }
            this.webView.setLayoutParams(layoutParams);
            return false;
        }
        Point point2 = this.f38265B.f38176a;
        point2.x = i;
        point2.y = i2;
        int a = C9265rb.m49233a(getContext(), this.f38265B.f38176a.x);
        int a2 = C9265rb.m49233a(getContext(), this.f38265B.f38176a.y);
        this.f38270G.setMinimumWidth(a);
        this.f38270G.setMinimumHeight(a2);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(a, a2);
        } else {
            layoutParams2.width = a;
            layoutParams2.height = a2;
        }
        this.webView.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: a */
    public void mo29911a(int i) {
        this.f38208i = i;
    }

    /* renamed from: a */
    public static void m49337a(BannerStandard bannerStandard, boolean z) {
        if (z != (!bannerStandard.f38271H.f38294c.isVisible())) {
            bannerStandard.f38271H.setCloseVisible(!z);
        }
    }

    /* renamed from: a */
    public static void m49336a(BannerStandard bannerStandard) {
        MraidState mraidState;
        if (bannerStandard.f38276M.getState() != MraidState.LOADING && bannerStandard.f38276M.getState() != (mraidState = MraidState.HIDDEN)) {
            if (bannerStandard.f38276M.getState() == MraidState.RESIZED || bannerStandard.f38276M.getState() == MraidState.EXPANDED) {
                if (bannerStandard.f38277N != null) {
                    bannerStandard.f38271H.removeView(bannerStandard.twoPartWebView);
                    bannerStandard.f38275L.mo29465a();
                    bannerStandard.f38275L = null;
                    bannerStandard.f38277N = null;
                    bannerStandard.twoPartWebView.stopLoading();
                    bannerStandard.twoPartWebView = null;
                } else {
                    bannerStandard.f38271H.removeView(bannerStandard.webView);
                    bannerStandard.mo30039a((View) bannerStandard.webView);
                    C9396a.m49784a(bannerStandard.f38280Q);
                }
                CloseableLayout closeableLayout = bannerStandard.f38271H;
                if (!(closeableLayout == null || closeableLayout.getParent() == null || !(closeableLayout.getParent() instanceof ViewGroup))) {
                    ((ViewGroup) closeableLayout.getParent()).removeView(closeableLayout);
                }
                bannerStandard.f38276M.setState(MraidState.DEFAULT);
            } else if (bannerStandard.f38276M.getState() == MraidState.DEFAULT) {
                C9396a.m49784a(bannerStandard.f38281R);
                bannerStandard.f38276M.setState(mraidState);
            }
            bannerStandard.mo29935m();
        }
    }
}
