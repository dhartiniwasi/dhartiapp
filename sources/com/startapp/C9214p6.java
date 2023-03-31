package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.C9612w0;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* renamed from: com.startapp.p6 */
/* compiled from: Sta */
public class C9214p6 extends C8971g5 {

    /* renamed from: K */
    public MraidState f38054K = MraidState.LOADING;

    /* renamed from: L */
    public C9218d f38055L;

    /* renamed from: M */
    public C9278s6 f38056M;

    /* renamed from: N */
    public C9553t6 f38057N;

    /* renamed from: O */
    public TextView f38058O;

    /* renamed from: P */
    public ImageView f38059P;

    /* renamed from: Q */
    public boolean f38060Q = false;

    /* renamed from: R */
    public boolean f38061R = false;

    /* renamed from: S */
    public Handler f38062S = null;

    /* renamed from: com.startapp.p6$a */
    /* compiled from: Sta */
    public class C9215a implements C9612w0.C9613a {
        public C9215a() {
        }

        public boolean onClickEvent(String str) {
            return C9214p6.this.mo29393a(str, true);
        }
    }

    /* renamed from: com.startapp.p6$b */
    /* compiled from: Sta */
    public class C9216b extends WebChromeClient {
        public C9216b(C9214p6 p6Var) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                    i4Var.f36952d = "MraidMode.ConsoleError";
                    i4Var.f36953e = consoleMessage.message();
                    i4Var.mo29471a();
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: com.startapp.p6$c */
    /* compiled from: Sta */
    public class C9217c extends C9619w6 {
        public C9217c(C9131m6 m6Var) {
            super(m6Var);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (C9214p6.this.f38054K == MraidState.LOADING) {
                C9605vb.m50458a(webView, true, "mraid.setPlacementType", "interstitial");
                C9214p6 p6Var = C9214p6.this;
                C9259r6.m49221a(p6Var.f36755b, webView, p6Var.f38056M);
                C9214p6.this.mo29812y();
                C9214p6.this.mo29398j();
                C9214p6 p6Var2 = C9214p6.this;
                if (!p6Var2.f38060Q) {
                    p6Var2.mo29411w();
                }
                C9214p6 p6Var3 = C9214p6.this;
                MraidState mraidState = MraidState.DEFAULT;
                p6Var3.f38054K = mraidState;
                C9194o6.m49099a(mraidState, webView);
                C9605vb.m50458a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                C9214p6 p6Var4 = C9214p6.this;
                if (p6Var4.f38061R) {
                    p6Var4.f38055L.fireViewableChangeEvent();
                }
                C9214p6 p6Var5 = C9214p6.this;
                Handler handler = p6Var5.f38062S;
                if (handler != null) {
                    handler.post(new C9242q6(p6Var5));
                }
                C9214p6 p6Var6 = C9214p6.this;
                p6Var6.mo29389a((View) p6Var6.f36837x);
                p6Var6.f36836w0 = SystemClock.uptimeMillis();
            }
        }
    }

    /* renamed from: com.startapp.p6$d */
    /* compiled from: Sta */
    public class C9218d extends C9612w0 {
        public C9218d(C9612w0.C9613a aVar) {
            super(aVar);
        }

        public void close() {
            C9214p6 p6Var = C9214p6.this;
            MraidState mraidState = MraidState.HIDDEN;
            p6Var.f38054K = mraidState;
            C9194o6.m49099a(mraidState, p6Var.f36834v);
            C9214p6.this.f36832I.run();
        }

        public void fireViewableChangeEvent() {
            C9214p6 p6Var = C9214p6.this;
            C9605vb.m50458a(p6Var.f36834v, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(p6Var.f38061R));
        }

        public boolean isFeatureSupported(String str) {
            return C9214p6.this.f38056M.f38195b.contains(str);
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            C9553t6 t6Var = C9214p6.this.f38057N;
            if (t6Var.f39189a != parseBoolean || t6Var.f39190b != C9553t6.m50360a(str)) {
                C9553t6 t6Var2 = C9214p6.this.f38057N;
                t6Var2.f39189a = parseBoolean;
                t6Var2.f39190b = C9553t6.m50360a(str);
                C9214p6 p6Var = C9214p6.this;
                applyOrientationProperties(p6Var.f36755b, p6Var.f38057N);
            }
        }

        public void useCustomClose(String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            C9214p6 p6Var = C9214p6.this;
            if (p6Var.f38060Q != parseBoolean) {
                boolean unused = p6Var.f38060Q = parseBoolean;
                if (parseBoolean) {
                    C9214p6 p6Var2 = C9214p6.this;
                    p6Var2.getClass();
                    try {
                        ImageButton imageButton = p6Var2.f36837x;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                        }
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                } else {
                    C9214p6.this.mo29411w();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo29396b(String str) {
        return false;
    }

    /* renamed from: c */
    public boolean mo29352c() {
        if (mo29811x()) {
            return super.mo29352c();
        }
        return true;
    }

    /* renamed from: e */
    public void mo29073e() {
        this.f38061R = false;
        if (this.f38054K == MraidState.DEFAULT) {
            this.f38055L.fireViewableChangeEvent();
        }
        super.mo29073e();
    }

    /* renamed from: f */
    public void mo29074f() {
        super.mo29074f();
        if (this.f38062S == null && mo29405p()) {
            this.f38062S = new Handler();
        }
        this.f38061R = true;
        if (this.f38054K == MraidState.DEFAULT) {
            this.f38055L.fireViewableChangeEvent();
        }
    }

    public void onClick(View view) {
        if (mo29811x()) {
            this.f38055L.close();
        }
    }

    /* renamed from: p */
    public boolean mo29405p() {
        return this.f36772s > 0;
    }

    /* renamed from: v */
    public void mo29410v() {
        this.f36834v.setWebViewClient(new C9217c(this.f38055L));
        this.f36834v.setWebChromeClient(new C9216b(this));
    }

    /* renamed from: x */
    public final boolean mo29811x() {
        return (SystemClock.uptimeMillis() - this.f36825A) / 1000 >= ((long) this.f36772s);
    }

    /* renamed from: y */
    public final void mo29812y() {
        Activity activity = this.f36755b;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            C9194o6.m49101b(activity, i, i2, this.f36834v);
            C9194o6.m49096a(activity, i, i2, this.f36834v);
            C9194o6.m49095a(activity, 0, 0, i, i2, this.f36834v);
            C9194o6.m49100b(activity, 0, 0, i, i2, this.f36834v);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public void mo29070a(Bundle bundle) {
        super.mo29070a(bundle);
        if (this.f38056M == null) {
            this.f38056M = new C9278s6(this.f36755b);
        }
        if (this.f38057N == null) {
            this.f38057N = new C9553t6(true, 2);
        }
        if (this.f38055L == null) {
            this.f38055L = new C9218d(new C9215a());
        }
    }

    /* renamed from: a */
    public void mo29348a(Configuration configuration) {
        mo29812y();
    }

    /* renamed from: a */
    public boolean mo29393a(String str, boolean z) {
        MraidState mraidState = MraidState.HIDDEN;
        this.f38054K = mraidState;
        C9194o6.m49099a(mraidState, this.f36834v);
        try {
            return super.mo29393a(str, z);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo29391a(RelativeLayout relativeLayout) {
        if (mo29405p() && !this.f36773t) {
            int a = C9265rb.m49233a((Context) this.f36755b, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(this.f36755b);
            this.f38059P = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a2 = C9265rb.m49233a((Context) this.f36755b, 32);
            gradientDrawable.setSize(a2, a2);
            imageView.setImageDrawable(gradientDrawable);
            this.f38059P.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f38059P, layoutParams);
            TextView textView = new TextView(this.f36755b);
            this.f38058O = textView;
            textView.setTextColor(-1);
            this.f38058O.setGravity(17);
            relativeLayout.addView(this.f38058O, layoutParams);
        }
    }
}
