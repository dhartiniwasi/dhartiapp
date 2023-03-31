package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.C8944f3;
import com.startapp.C9087k9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p184aa.C6523c;

/* renamed from: com.startapp.g5 */
/* compiled from: Sta */
public class C8971g5 extends C8944f3 implements View.OnClickListener {

    /* renamed from: A */
    public long f36825A = 0;

    /* renamed from: B */
    public C9087k9 f36826B;

    /* renamed from: C */
    public boolean f36827C = true;

    /* renamed from: D */
    public boolean f36828D = false;

    /* renamed from: E */
    public int f36829E = 0;

    /* renamed from: F */
    public boolean f36830F = false;

    /* renamed from: H */
    public C9260r7 f36831H;

    /* renamed from: I */
    public Runnable f36832I = new C8972a();

    /* renamed from: J */
    public Runnable f36833J = new C8973b();

    /* renamed from: v */
    public WebView f36834v;

    /* renamed from: w */
    public RelativeLayout f36835w;

    /* renamed from: w0 */
    public long f36836w0;

    /* renamed from: x */
    public ImageButton f36837x;

    /* renamed from: x0 */
    public final C9087k9.C9088a f36838x0 = new C8974c();

    /* renamed from: com.startapp.g5$a */
    /* compiled from: Sta */
    public class C8972a implements Runnable {
        public C8972a() {
        }

        public void run() {
            C8971g5.this.mo29397i();
            C8971g5.this.mo29351b();
        }
    }

    /* renamed from: com.startapp.g5$b */
    /* compiled from: Sta */
    public class C8973b implements Runnable {
        public C8973b() {
        }

        public void run() {
            C8971g5 g5Var = C8971g5.this;
            g5Var.f36827C = true;
            WebView webView = g5Var.f36834v;
            if (webView != null) {
                webView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
    }

    /* renamed from: com.startapp.g5$c */
    /* compiled from: Sta */
    public class C8974c implements C9087k9.C9088a {
        public C8974c() {
        }

        public void onSent(String str) {
            C8971g5 g5Var = C8971g5.this;
            g5Var.getClass();
            Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
            intent.putExtra("dParam", str);
            C8846b6.m48400a((Context) g5Var.f36755b).mo29213a(intent);
        }
    }

    /* renamed from: com.startapp.g5$d */
    /* compiled from: Sta */
    public class C8975d implements View.OnLongClickListener {
        public C8975d(C8971g5 g5Var) {
        }

        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: com.startapp.g5$e */
    /* compiled from: Sta */
    public class C8976e implements View.OnTouchListener {
        public C8976e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C8971g5.this.f36827C = true;
            if (motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.startapp.g5$f */
    /* compiled from: Sta */
    public class C8977f implements Runnable {
        public C8977f() {
        }

        public void run() {
            C8971g5.this.mo29351b();
        }
    }

    /* renamed from: com.startapp.g5$g */
    /* compiled from: Sta */
    public class C8978g extends WebViewClient {
        public C8978g() {
        }

        public void onPageFinished(WebView webView, String str) {
            C8971g5.this.mo29390a(webView);
            C8971g5 g5Var = C8971g5.this;
            C9605vb.m50458a(g5Var.f36834v, true, "gClientInterface.setMode", g5Var.f36761h);
            Object[] objArr = {"externalLinks"};
            C9605vb.m50458a(C8971g5.this.f36834v, true, "enableScheme", objArr);
            C8971g5.this.mo29407r();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || C9605vb.m50472b(webView.getContext(), str)) {
                return true;
            }
            if (!C8971g5.this.f36827C) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "fake_click";
                i4Var.f36955g = C8971g5.this.mo29347a();
                StringBuilder a = C8870c1.m48422a("jsTag=");
                a.append(C8971g5.this.f36830F);
                i4Var.f36953e = a.toString();
                i4Var.mo29471a();
            }
            C8971g5 g5Var = C8971g5.this;
            if (!g5Var.f36830F || g5Var.f36827C) {
                return g5Var.mo29393a(str, false);
            }
            return false;
        }
    }

    /* renamed from: com.startapp.g5$h */
    /* compiled from: Sta */
    public class C8979h implements Runnable {
        public C8979h() {
        }

        public void run() {
            WebView webView = C8971g5.this.f36834v;
            if (webView != null) {
                C8837b0.m48300a(webView);
            }
        }
    }

    /* renamed from: a */
    public void mo29070a(Bundle bundle) {
        C8846b6.m48400a((Context) this.f36755b).mo29212a(this.f36757d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            if (bundle.containsKey("postrollHtml")) {
                mo29349a(bundle.getString("postrollHtml"));
            }
            this.f36828D = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.f36829E = bundle.getInt("replayNum");
        }
    }

    /* renamed from: a */
    public void mo29390a(WebView webView) {
    }

    /* renamed from: a */
    public void mo29391a(RelativeLayout relativeLayout) {
    }

    /* renamed from: b */
    public void mo29351b() {
        this.f36755b.runOnUiThread(new C8944f3.C8946b());
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38681o = false;
        C9087k9 k9Var = this.f36826B;
        if (k9Var != null) {
            k9Var.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        this.f36755b.runOnUiThread(new C8979h());
    }

    /* renamed from: c */
    public boolean mo29352c() {
        if (this.f36753G != null && SystemClock.uptimeMillis() - this.f36836w0 < this.f36753G.longValue()) {
            return true;
        }
        mo29397i();
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38681o = false;
        this.f36826B.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        return false;
    }

    /* renamed from: d */
    public void mo29353d() {
        if (this.f36757d != null) {
            C8846b6.m48400a((Context) this.f36755b).mo29211a(this.f36757d);
        }
        this.f36757d = null;
        C9260r7 r7Var = this.f36831H;
        if (r7Var != null) {
            r7Var.mo29869a();
            this.f36831H = null;
        }
        WebView webView = this.f36834v;
        Map<Activity, Integer> map = C9605vb.f39316a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView, SystemClock.uptimeMillis() + 1000);
    }

    /* renamed from: e */
    public void mo29073e() {
        C9087k9 k9Var = this.f36826B;
        if (k9Var != null) {
            k9Var.mo29606a();
        }
        WebView webView = this.f36834v;
        if (webView != null) {
            C8837b0.m48300a(webView);
        }
    }

    /* renamed from: f */
    public void mo29074f() {
        C9381Ad ad = this.f36765l;
        if (ad instanceof InterstitialAd ? ((InterstitialAd) ad).mo30091d() : false) {
            mo29351b();
            return;
        }
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38681o = true;
        if (this.f36826B == null) {
            C9087k9 k9Var = new C9087k9(this.f36755b, this.f36767n, this.f36762i, mo29402n(), mo29401m());
            this.f36826B = k9Var;
            k9Var.mo29607a(this.f36838x0);
        }
        WebView webView = this.f36834v;
        if (webView == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f36755b);
            this.f36835w = relativeLayout;
            relativeLayout.setContentDescription("StartApp Ad");
            this.f36835w.setId(1475346432);
            this.f36755b.setContentView(this.f36835w);
            try {
                WebView b = ComponentLocator.m50248a((Context) this.f36755b).mo31187w().mo29704b();
                this.f36834v = b;
                b.setBackgroundColor(-16777216);
                this.f36755b.getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.f36834v.setVerticalScrollBarEnabled(false);
                this.f36834v.setHorizontalScrollBarEnabled(false);
                this.f36834v.getSettings().setJavaScriptEnabled(true);
                WebView webView2 = this.f36834v;
                if (Build.VERSION.SDK_INT >= 17) {
                    webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
                if (this.f36774u) {
                    C8837b0.m48301a(this.f36834v, (Paint) null);
                }
                this.f36834v.setOnLongClickListener(new C8975d(this));
                this.f36834v.setLongClickable(false);
                this.f36834v.addJavascriptInterface(mo29400l(), "startappwall");
                mo29406q();
                mo29394b(this.f36834v);
                mo29410v();
                C9605vb.m50464a(this.f36834v, this.f36766m);
                this.f36830F = "true".equals(C9605vb.m50452a(this.f36766m, "@jsTag@", "@jsTag@"));
                this.f36835w.addView(this.f36834v, new RelativeLayout.LayoutParams(-1, -1));
                RelativeLayout relativeLayout2 = this.f36835w;
                AdInformationObject adInformationObject = new AdInformationObject(this.f36755b, AdInformationObject.Size.LARGE, this.f36767n, this.f36768o, this.f36765l.getConsentData(), this.f36765l.getRequestUrl(), this.f36765l.getDParam());
                this.f36756c = adInformationObject;
                adInformationObject.mo30608a(relativeLayout2);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                mo29351b();
            }
        } else {
            C8837b0.m48307b(webView);
            this.f36826B.mo29609b();
        }
        this.f36825A = SystemClock.uptimeMillis();
    }

    /* renamed from: i */
    public void mo29397i() {
        String[] strArr = this.f36758e;
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            C9396a.m49778a((Context) this.f36755b, strArr[0], mo29403o());
        }
    }

    /* renamed from: j */
    public void mo29398j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f36755b);
            ImageButton imageButton = new ImageButton(this.f36755b);
            this.f36837x = imageButton;
            imageButton.setBackgroundColor(0);
            this.f36837x.setOnClickListener(this);
            int a = C9265rb.m49233a((Context) this.f36755b, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f36837x, layoutParams);
            mo29391a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a, a);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f36835w.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: k */
    public long mo29399k() {
        return (SystemClock.uptimeMillis() - this.f36825A) / 1000;
    }

    /* renamed from: l */
    public C9148n5 mo29400l() {
        Activity activity = this.f36755b;
        Runnable runnable = this.f36832I;
        Runnable runnable2 = this.f36833J;
        C9148n5 n5Var = new C9148n5((Context) activity, runnable, mo29403o(), mo29350a(0));
        n5Var.f37341d = runnable;
        n5Var.f37342e = runnable2;
        return n5Var;
    }

    /* renamed from: m */
    public long mo29401m() {
        Long l = this.f36770q;
        if (l != null) {
            return TimeUnit.SECONDS.toMillis(l.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f38952k.mo31037r());
    }

    /* renamed from: n */
    public TrackingParams mo29402n() {
        return new TrackingParams(this.f36769p);
    }

    /* renamed from: o */
    public TrackingParams mo29403o() {
        return new CloseTrackingParams(mo29399k(), this.f36769p);
    }

    public void onClick(View view) {
    }

    /* renamed from: p */
    public boolean mo29405p() {
        return false;
    }

    /* renamed from: q */
    public void mo29406q() {
        this.f36826B.mo29609b();
    }

    /* renamed from: r */
    public void mo29407r() {
        mo29389a((View) this.f36837x);
        this.f36836w0 = SystemClock.uptimeMillis();
    }

    /* renamed from: t */
    public void mo29408t() {
    }

    /* renamed from: u */
    public void mo29409u() {
        if (mo29405p() && !this.f36828D && this.f36829E == 0) {
            this.f36828D = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", mo29347a());
            C8846b6.m48400a((Context) this.f36755b).mo29213a(intent);
            mo29408t();
        }
    }

    /* renamed from: v */
    public void mo29410v() {
        this.f36834v.setWebViewClient(new C8978g());
    }

    /* renamed from: w */
    public void mo29411w() {
        try {
            if (this.f36837x != null) {
                this.f36837x.setImageDrawable(new BitmapDrawable(this.f36755b.getResources(), C8993h1.m48653a("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC")));
                this.f36837x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f36837x.setVisibility(0);
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[SYNTHETIC, Splitter:B:11:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29393a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.startapp.k9 r0 = r5.f36826B
            r1 = 0
            r0.mo29608a(r1, r1)
            com.startapp.sdk.adsbase.Ad r0 = r5.f36765l
            android.app.Activity r1 = r5.f36755b
            android.content.Context r1 = com.startapp.C9058k0.m48718a(r1)
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            android.app.Activity r1 = r5.f36755b
        L_0x0013:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r5.f36767n
            boolean r1 = com.startapp.sdk.adsbase.C9396a.m49790a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.C9605vb.f39316a
            boolean r0 = r0 instanceof com.startapp.sdk.ads.splash.SplashAd
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            boolean r1 = r5.mo29396b((java.lang.String) r6)
            if (r1 == 0) goto L_0x0045
            int r1 = com.startapp.sdk.adsbase.C9396a.m49769a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            boolean[] r4 = r5.f36759f     // Catch:{ all -> 0x0040 }
            boolean r4 = r4[r1]     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x003c
            if (r0 != 0) goto L_0x003c
            r5.mo29395b(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x003c:
            r5.mo29392a(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r6 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)
            return r3
        L_0x0045:
            boolean[] r1 = r5.f36759f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            r5.mo29395b(r6, r3, r7)
            goto L_0x0054
        L_0x0051:
            r5.mo29392a(r6, r3, r7)
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8971g5.mo29393a(java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    public void mo29394b(WebView webView) {
        this.f36827C = false;
        webView.setOnTouchListener(new C8976e());
    }

    /* renamed from: b */
    public void mo29072b(Bundle bundle) {
        String str = this.f36766m;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.f36828D);
        bundle.putInt("replayNum", this.f36829E);
    }

    /* renamed from: b */
    public boolean mo29396b(String str) {
        return !this.f36830F && str.contains("index=");
    }

    /* renamed from: b */
    public final void mo29395b(String str, int i, boolean z) {
        C8977f fVar;
        int i2 = i;
        boolean l = MetaData.f38952k.mo31031l();
        Activity activity = this.f36755b;
        String[] strArr = this.f36763j;
        boolean z2 = false;
        String[] strArr2 = i2 < strArr.length ? new String[]{strArr[i2]} : null;
        String[] strArr3 = this.f36764k;
        String str2 = i2 < strArr3.length ? strArr3[i2] : null;
        TrackingParams o = mo29403o();
        long z3 = AdsCommonMetaData.f38625h.mo30481z();
        long y = AdsCommonMetaData.f38625h.mo30480y();
        boolean a = mo29350a(i2);
        Boolean[] boolArr = this.f36771r;
        Boolean bool = (boolArr == null || i2 < 0 || i2 >= boolArr.length) ? null : boolArr[i2];
        if (!l) {
            C9381Ad ad = this.f36765l;
            if (ad instanceof InterstitialAd) {
                z2 = ((InterstitialAd) ad).mo30092u();
            }
            if (!z2) {
                fVar = null;
                C9396a.m49782a(activity, str, strArr2, str2, o, z3, y, a, bool, z, fVar);
            }
        }
        fVar = new C8977f();
        C9396a.m49782a(activity, str, strArr2, str2, o, z3, y, a, bool, z, fVar);
    }

    /* renamed from: a */
    public final void mo29392a(String str, int i, boolean z) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", mo29347a());
        C8846b6.m48400a((Context) this.f36755b).mo29213a(intent);
        Context a = C9058k0.m48718a(this.f36755b);
        if (a == null) {
            a = this.f36755b;
        }
        boolean a2 = C9396a.m49790a(a, this.f36767n);
        Activity activity = this.f36755b;
        String[] strArr = this.f36763j;
        boolean z2 = false;
        C9396a.m49781a((Context) activity, str, i < strArr.length ? new String[]{strArr[i]} : null, mo29403o(), mo29350a(i) && !a2, z);
        if (!MetaData.f38952k.mo31031l()) {
            C9381Ad ad = this.f36765l;
            if (ad instanceof InterstitialAd) {
                z2 = ((InterstitialAd) ad).mo30092u();
            }
            if (!z2) {
                return;
            }
        }
        mo29351b();
    }

    /* renamed from: a */
    public void mo29389a(View view) {
        AdInformationView adInformationView;
        if (MetaData.f38952k.mo31005U()) {
            C9260r7 r7Var = new C9260r7(this.f36834v);
            this.f36831H = r7Var;
            if (r7Var.mo29873c()) {
                try {
                    AdInformationObject adInformationObject = this.f36756c;
                    if (!(adInformationObject == null || (adInformationView = adInformationObject.f38720b) == null)) {
                        this.f36831H.mo29871a(adInformationView, C6523c.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.f36831H.mo29871a(view, C6523c.CLOSE_AD, (String) null);
                    }
                } catch (RuntimeException unused) {
                }
                this.f36831H.mo29870a(this.f36834v);
                this.f36831H.mo29875e();
                this.f36831H.mo29874d();
                this.f36831H.mo29872b();
            }
        }
    }
}
