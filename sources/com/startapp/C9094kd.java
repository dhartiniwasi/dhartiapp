package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.AdsConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.kd */
/* compiled from: Sta */
public class C9094kd {

    /* renamed from: a */
    public final C9139md f37208a;

    /* renamed from: b */
    public final Queue<WeakReference<WebView>> f37209b = new LinkedList();

    /* renamed from: com.startapp.kd$a */
    /* compiled from: Sta */
    public class C9095a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ Handler f37210a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f37211b;

        /* renamed from: c */
        public final /* synthetic */ WebView f37212c;

        /* renamed from: d */
        public final /* synthetic */ C9605vb.C9606a f37213d;

        /* renamed from: e */
        public final /* synthetic */ AtomicLong f37214e;

        /* renamed from: f */
        public final /* synthetic */ int f37215f;

        /* renamed from: com.startapp.kd$a$a */
        /* compiled from: Sta */
        public class C9096a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ long f37217a;

            public C9096a(long j) {
                this.f37217a = j;
            }

            public void run() {
                if (C9095a.this.f37211b.compareAndSet(false, true)) {
                    C9095a aVar = C9095a.this;
                    C9094kd.this.mo29623a(aVar.f37212c);
                    C9095a aVar2 = C9095a.this;
                    aVar2.f37213d.mo29864a(false, aVar2.f37214e.get(), this.f37217a, true);
                }
            }
        }

        /* renamed from: com.startapp.kd$a$b */
        /* compiled from: Sta */
        public class C9097b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f37219a;

            public C9097b(String str) {
                this.f37219a = str;
            }

            public void run() {
                if (C9095a.this.f37211b.compareAndSet(false, true)) {
                    C9095a aVar = C9095a.this;
                    C9094kd.this.mo29623a(aVar.f37212c);
                    C9095a.this.f37213d.mo29863a(3, String.valueOf(this.f37219a));
                }
            }
        }

        public C9095a(Handler handler, AtomicBoolean atomicBoolean, WebView webView, C9605vb.C9606a aVar, AtomicLong atomicLong, int i) {
            this.f37210a = handler;
            this.f37211b = atomicBoolean;
            this.f37212c = webView;
            this.f37213d = aVar;
            this.f37214e = atomicLong;
            this.f37215f = i;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long a = C9605vb.m50443a();
            this.f37210a.removeCallbacksAndMessages((Object) null);
            this.f37210a.postDelayed(new C9096a(a), (long) this.f37215f);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f37210a.removeCallbacksAndMessages((Object) null);
            this.f37210a.post(new C9097b(str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || C9605vb.m50472b(webView.getContext(), str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.startapp.kd$b */
    /* compiled from: Sta */
    public class C9098b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f37221a;

        /* renamed from: b */
        public final /* synthetic */ WebView f37222b;

        /* renamed from: c */
        public final /* synthetic */ C9605vb.C9606a f37223c;

        public C9098b(AtomicBoolean atomicBoolean, WebView webView, C9605vb.C9606a aVar) {
            this.f37221a = atomicBoolean;
            this.f37222b = webView;
            this.f37223c = aVar;
        }

        public void run() {
            if (this.f37221a.compareAndSet(false, true)) {
                C9094kd.this.mo29623a(this.f37222b);
                this.f37223c.mo29863a(2, "Unknown error");
            }
        }
    }

    /* renamed from: com.startapp.kd$c */
    /* compiled from: Sta */
    public class C9099c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f37225a;

        /* renamed from: b */
        public final /* synthetic */ WebView f37226b;

        /* renamed from: c */
        public final /* synthetic */ C9605vb.C9606a f37227c;

        /* renamed from: d */
        public final /* synthetic */ AtomicLong f37228d;

        public C9099c(AtomicBoolean atomicBoolean, WebView webView, C9605vb.C9606a aVar, AtomicLong atomicLong) {
            this.f37225a = atomicBoolean;
            this.f37226b = webView;
            this.f37227c = aVar;
            this.f37228d = atomicLong;
        }

        public void run() {
            if (this.f37225a.compareAndSet(false, true)) {
                C9094kd.this.mo29623a(this.f37226b);
                this.f37227c.mo29864a(false, this.f37228d.get(), C9605vb.m50443a(), false);
            }
        }
    }

    public C9094kd(Context context, C9139md mdVar) {
        this.f37208a = mdVar;
    }

    /* renamed from: a */
    public void mo29623a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.f37209b.size() < 3) {
            this.f37209b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    /* renamed from: a */
    public void mo29624a(String str, C9605vb.C9606a aVar) {
        int i;
        String str2 = str;
        C9605vb.C9606a aVar2 = aVar;
        if ("true".equals(C9605vb.m50452a(str2, "@doNotRender@", "@doNotRender@"))) {
            aVar.mo29864a(true, 0, 0, false);
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f37209b.size() <= 0) {
                    break;
                }
                WeakReference poll = this.f37209b.poll();
                if (poll != null) {
                    webView = (WebView) poll.get();
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                aVar2.mo29863a(1, "WebView instantiation Error");
                return;
            }
        }
        if (webView == null) {
            webView = this.f37208a.mo29704b();
        }
        WebView webView2 = webView;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Handler handler = new Handler(Looper.getMainLooper());
        AtomicLong atomicLong = new AtomicLong();
        if (AdsConstants.f38631f.booleanValue()) {
            webView2.getSettings().setBlockNetworkImage(false);
            webView2.getSettings().setLoadsImagesAutomatically(true);
            webView2.getSettings().setJavaScriptEnabled(true);
            i = 25000;
        } else {
            i = 0;
        }
        webView2.setWebChromeClient(new WebChromeClient());
        C9095a aVar3 = r1;
        AtomicLong atomicLong2 = atomicLong;
        C9095a aVar4 = new C9095a(handler, atomicBoolean, webView2, aVar, atomicLong, i);
        webView2.setWebViewClient(aVar3);
        atomicLong2.set(C9605vb.m50443a());
        if (!C9605vb.m50464a(webView2, str2)) {
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new C9098b(atomicBoolean, webView2, aVar2));
            return;
        }
        handler.postDelayed(new C9099c(atomicBoolean, webView2, aVar, atomicLong2), 25000);
    }
}
