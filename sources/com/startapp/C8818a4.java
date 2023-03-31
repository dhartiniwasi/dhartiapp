package com.startapp;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import java.util.HashMap;

/* renamed from: com.startapp.a4 */
/* compiled from: Sta */
public class C8818a4 extends C8944f3 implements View.OnClickListener {

    /* renamed from: B */
    public static boolean f36388B = false;

    /* renamed from: A */
    public String f36389A;

    /* renamed from: v */
    public RelativeLayout f36390v;

    /* renamed from: w */
    public NavigationBarLayout f36391w;

    /* renamed from: x */
    public WebView f36392x;

    /* renamed from: y */
    public AnimatingProgressBar f36393y;

    /* renamed from: z */
    public FrameLayout f36394z;

    /* renamed from: com.startapp.a4$a */
    /* compiled from: Sta */
    public class C8819a extends WebChromeClient {
        public C8819a() {
        }

        public void onProgressChanged(WebView webView, int i) {
            C8818a4.this.f36393y.setProgress(i);
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (str != null && !str.equals("")) {
                C8818a4.this.f36391w.f39123f.setText(str);
            }
        }
    }

    /* renamed from: com.startapp.a4$b */
    /* compiled from: Sta */
    public static class C8820b extends WebViewClient {

        /* renamed from: a */
        public Context f36396a;

        /* renamed from: b */
        public C8818a4 f36397b;

        /* renamed from: c */
        public NavigationBarLayout f36398c;

        /* renamed from: d */
        public AnimatingProgressBar f36399d;

        /* renamed from: e */
        public int f36400e = 0;

        /* renamed from: f */
        public boolean f36401f = false;

        public C8820b(Context context, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, C8818a4 a4Var) {
            this.f36396a = context;
            this.f36399d = animatingProgressBar;
            this.f36398c = navigationBarLayout;
            this.f36397b = a4Var;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!C8818a4.f36388B) {
                this.f36398c.mo31197a(webView);
                int i = this.f36400e - 1;
                this.f36400e = i;
                if (i == 0) {
                    this.f36401f = false;
                    this.f36399d.mo31192a();
                    if (this.f36399d.isShown()) {
                        this.f36399d.setVisibility(8);
                    }
                    this.f36398c.mo31197a(webView);
                }
                super.onPageFinished(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!C8818a4.f36388B) {
                if (this.f36401f) {
                    this.f36400e = 1;
                    this.f36399d.mo31192a();
                    this.f36398c.mo31197a(webView);
                } else {
                    this.f36400e = Math.max(this.f36400e, 1);
                }
                this.f36399d.setVisibility(0);
                this.f36398c.f39124g.setText(str);
                this.f36398c.mo31197a(webView);
                super.onPageStarted(webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            this.f36399d.mo31192a();
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView != null && str != null && !C9605vb.m50472b(webView.getContext(), str) && !C8818a4.f36388B) {
                if (!this.f36401f) {
                    this.f36401f = true;
                    this.f36399d.mo31192a();
                    this.f36400e = 0;
                }
                this.f36400e++;
                if (C9396a.m49797c(str) && !C9396a.m49795b(str)) {
                    return false;
                }
                this.f36400e = 1;
                C9396a.m49794b(this.f36396a, str, (String) null);
                C8818a4 a4Var = this.f36397b;
                if (a4Var != null) {
                    a4Var.mo29075i();
                }
            }
            return true;
        }
    }

    public C8818a4(String str) {
        this.f36389A = str;
    }

    /* renamed from: a */
    public void mo29070a(Bundle bundle) {
        Bundle bundle2 = bundle;
        C8846b6.m48400a((Context) this.f36755b).mo29212a(this.f36757d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        f36388B = false;
        this.f36390v = new RelativeLayout(this.f36755b);
        String str = this.f36389A;
        if (this.f36391w == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f36755b);
            this.f36391w = navigationBarLayout;
            navigationBarLayout.setDescendantFocusability(262144);
            navigationBarLayout.setBackgroundColor(Color.parseColor("#e9e9e9"));
            navigationBarLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, C9265rb.m49233a(navigationBarLayout.getContext(), 60)));
            navigationBarLayout.setId(2101);
            HashMap hashMap = new HashMap();
            hashMap.put("BACK", new C8981g7((Bitmap) null, 14, 22, "back_.png"));
            hashMap.put("BACK_DARK", new C8981g7((Bitmap) null, 14, 22, "back_dark.png"));
            hashMap.put("FORWARD", new C8981g7((Bitmap) null, 14, 22, "forward_.png"));
            hashMap.put("FORWARD_DARK", new C8981g7((Bitmap) null, 14, 22, "forward_dark.png"));
            hashMap.put("X", new C8981g7((Bitmap) null, 23, 23, "x_dark.png"));
            hashMap.put("BROWSER", new C8981g7((Bitmap) null, 28, 28, "browser_icon_dark.png"));
            navigationBarLayout.f39126i = hashMap;
            NavigationBarLayout navigationBarLayout2 = this.f36391w;
            navigationBarLayout2.getClass();
            Typeface typeface = Typeface.DEFAULT;
            Typeface typeface2 = typeface;
            navigationBarLayout2.f39123f = C9265rb.m49236a(navigationBarLayout2.getContext(), navigationBarLayout2.f39123f, typeface2, 1, 16.46f, NavigationBarLayout.f39116j, 2102);
            navigationBarLayout2.f39124g = C9265rb.m49236a(navigationBarLayout2.getContext(), navigationBarLayout2.f39123f, typeface2, 1, 12.12f, NavigationBarLayout.f39117k, 2107);
            navigationBarLayout2.f39123f.setText("Loading...");
            RelativeLayout relativeLayout = new RelativeLayout(navigationBarLayout2.getContext());
            navigationBarLayout2.f39118a = relativeLayout;
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            navigationBarLayout2.f39118a.addView(navigationBarLayout2.f39123f, C9265rb.m49235a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
            RelativeLayout relativeLayout2 = navigationBarLayout2.f39118a;
            TextView textView = navigationBarLayout2.f39124g;
            RelativeLayout.LayoutParams a = C9265rb.m49235a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]);
            a.addRule(3, 2102);
            relativeLayout2.addView(textView, a);
            for (C8981g7 next : navigationBarLayout2.f39126i.values()) {
                Bitmap a2 = C8941f1.m48561a(navigationBarLayout2.getContext(), next.f36854d);
                if (a2 != null) {
                    next.f36851a = Bitmap.createScaledBitmap(a2, C9265rb.m49233a(navigationBarLayout2.getContext(), next.f36852b), C9265rb.m49233a(navigationBarLayout2.getContext(), next.f36853c), true);
                }
            }
            navigationBarLayout2.f39119b = C9265rb.m49234a(navigationBarLayout2.getContext(), navigationBarLayout2.f39119b, navigationBarLayout2.f39126i.get("X").f36851a, 2103);
            navigationBarLayout2.f39121d = C9265rb.m49234a(navigationBarLayout2.getContext(), navigationBarLayout2.f39121d, navigationBarLayout2.f39126i.get("BROWSER").f36851a, 2104);
            navigationBarLayout2.f39122e = C9265rb.m49234a(navigationBarLayout2.getContext(), navigationBarLayout2.f39122e, navigationBarLayout2.f39126i.get("BACK").f36851a, 2105);
            navigationBarLayout2.f39120c = C9265rb.m49234a(navigationBarLayout2.getContext(), navigationBarLayout2.f39120c, navigationBarLayout2.f39126i.get("FORWARD").f36851a, 2106);
            int a3 = C9265rb.m49233a(navigationBarLayout2.getContext(), 10);
            navigationBarLayout2.f39120c.setPadding(a3, a3, a3, a3);
            navigationBarLayout2.f39120c.setEnabled(false);
            navigationBarLayout2.f39122e.setPadding(a3, a3, a3, a3);
            navigationBarLayout2.addView(navigationBarLayout2.f39119b, C9265rb.m49235a(navigationBarLayout2.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
            ImageView imageView = navigationBarLayout2.f39121d;
            RelativeLayout.LayoutParams a4 = C9265rb.m49235a(navigationBarLayout2.getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
            a4.addRule(0, 2103);
            navigationBarLayout2.addView(imageView, a4);
            RelativeLayout relativeLayout3 = navigationBarLayout2.f39118a;
            RelativeLayout.LayoutParams a5 = C9265rb.m49235a(navigationBarLayout2.getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
            a5.addRule(0, 2104);
            navigationBarLayout2.addView(relativeLayout3, a5);
            this.f36391w.setButtonsListener(this);
        }
        this.f36390v.addView(this.f36391w);
        this.f36393y = new AnimatingProgressBar(this.f36755b, (AttributeSet) null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f36393y.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f36393y.setBackgroundColor(-1);
        this.f36393y.setId(2108);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C9265rb.m49233a((Context) this.f36755b, 4));
        layoutParams.addRule(3, 2101);
        this.f36390v.addView(this.f36393y, layoutParams);
        this.f36394z = new FrameLayout(this.f36755b);
        if (this.f36392x == null) {
            try {
                mo29076j();
                this.f36392x.loadUrl(str);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                this.f36391w.mo31196a();
                C9396a.m49794b(this.f36755b, str, (String) null);
                this.f36755b.finish();
            }
        }
        this.f36394z.addView(this.f36392x);
        this.f36394z.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f36390v.addView(this.f36394z, layoutParams2);
        if (bundle2 != null) {
            this.f36392x.restoreState(bundle2);
        }
        this.f36755b.setContentView(this.f36390v, new RelativeLayout.LayoutParams(-2, -2));
    }

    /* renamed from: b */
    public void mo29072b(Bundle bundle) {
        this.f36392x.saveState(bundle);
    }

    /* renamed from: e */
    public void mo29073e() {
    }

    /* renamed from: f */
    public void mo29074f() {
    }

    /* renamed from: i */
    public void mo29075i() {
        try {
            f36388B = true;
            this.f36392x.stopLoading();
            this.f36392x.removeAllViews();
            this.f36392x.postInvalidate();
            C8837b0.m48300a(this.f36392x);
            this.f36392x.destroy();
            this.f36392x = null;
        } catch (Exception unused) {
        }
        this.f36391w.mo31196a();
        this.f36755b.finish();
    }

    /* renamed from: j */
    public final void mo29076j() {
        WebView b = ComponentLocator.m50248a((Context) this.f36755b).mo31187w().mo29704b();
        this.f36392x = b;
        b.getSettings().setJavaScriptEnabled(true);
        this.f36392x.getSettings().setUseWideViewPort(true);
        this.f36392x.getSettings().setLoadWithOverviewMode(true);
        this.f36392x.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f36392x.getSettings().setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f36392x.getSettings().setDisplayZoomControls(false);
        }
        this.f36392x.setWebViewClient(new C8820b(this.f36755b, this.f36391w, this.f36393y, this));
        this.f36392x.setWebChromeClient(new C8819a());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2103:
                mo29075i();
                return;
            case 2104:
                WebView webView = this.f36392x;
                if (webView != null) {
                    C9396a.m49794b(this.f36755b, webView.getUrl(), (String) null);
                    mo29075i();
                    return;
                }
                return;
            case 2105:
                WebView webView2 = this.f36392x;
                if (webView2 != null && webView2.canGoBack()) {
                    this.f36393y.mo31192a();
                    this.f36392x.goBack();
                    return;
                }
                return;
            case 2106:
                WebView webView3 = this.f36392x;
                if (webView3 != null && webView3.canGoForward()) {
                    this.f36393y.mo31192a();
                    this.f36392x.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo29071a(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        WebView webView = this.f36392x;
        if (webView == null || !webView.canGoBack()) {
            mo29075i();
            return true;
        }
        this.f36393y.mo31192a();
        this.f36392x.goBack();
        return true;
    }
}
