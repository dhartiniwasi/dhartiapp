package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.startapp.gd */
/* compiled from: Sta */
public class C8988gd implements Runnable {

    /* renamed from: a */
    public NotDisplayedReason f36876a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;

    /* renamed from: b */
    public JSONObject f36877b;

    /* renamed from: c */
    public C8989a f36878c;

    /* renamed from: d */
    public final Handler f36879d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final WeakReference<View> f36880e;

    /* renamed from: f */
    public final C9087k9 f36881f;

    /* renamed from: g */
    public final BannerOptions f36882g;

    /* renamed from: h */
    public boolean f36883h = true;

    /* renamed from: com.startapp.gd$a */
    /* compiled from: Sta */
    public interface C8989a {
    }

    public C8988gd(View view, C9087k9 k9Var, BannerOptions bannerOptions) {
        this.f36880e = new WeakReference<>(view);
        this.f36881f = k9Var;
        this.f36882g = bannerOptions;
    }

    /* renamed from: a */
    public void mo29438a() {
        NotDisplayedReason notDisplayedReason;
        try {
            C9087k9 k9Var = this.f36881f;
            if (!(k9Var == null || (notDisplayedReason = this.f36876a) == null)) {
                k9Var.mo29608a(notDisplayedReason.toString(), this.f36877b);
            }
            this.f36879d.removeCallbacksAndMessages((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo29439b() {
        C9087k9 k9Var = this.f36881f;
        return (k9Var == null || k9Var.mo29611c() || this.f36880e.get() == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.C9322e) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.mo29439b()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x007b }
            r0.<init>()     // Catch:{ all -> 0x007b }
            java.lang.ref.WeakReference<android.view.View> r1 = r5.f36880e     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.banner.BannerOptions r2 = r5.f36882g     // Catch:{ all -> 0x007b }
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r1 = com.startapp.C8956fd.m48597a((android.view.View) r1, (com.startapp.sdk.ads.banner.BannerOptions) r2, (java.util.concurrent.atomic.AtomicReference<org.json.JSONObject>) r0)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0033
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r2 = r5.f36876a     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            int r2 = r2.mo30637a()     // Catch:{ all -> 0x007b }
            int r3 = r1.mo30637a()     // Catch:{ all -> 0x007b }
            if (r2 > r3) goto L_0x0033
        L_0x0029:
            r5.f36876a = r1     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007b }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x007b }
            r5.f36877b = r0     // Catch:{ all -> 0x007b }
        L_0x0033:
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x004a
            boolean r3 = r5.f36883h     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x004a
            r5.f36883h = r0     // Catch:{ all -> 0x007b }
            com.startapp.k9 r0 = r5.f36881f     // Catch:{ all -> 0x007b }
            r0.mo29609b()     // Catch:{ all -> 0x007b }
            com.startapp.gd$a r0 = r5.f36878c     // Catch:{ all -> 0x007b }
            goto L_0x006f
        L_0x004a:
            if (r1 != 0) goto L_0x006f
            boolean r0 = r5.f36883h     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x006f
            r5.f36883h = r2     // Catch:{ all -> 0x007b }
            com.startapp.k9 r0 = r5.f36881f     // Catch:{ all -> 0x007b }
            r0.mo29606a()     // Catch:{ all -> 0x007b }
            com.startapp.gd$a r0 = r5.f36878c     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006f
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.C9322e) r0     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r1 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r3 = r1.f38368j     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x006f
            boolean r4 = r1.f38363e     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x006f
            r3.adHidden(r1)     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r0 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            boolean unused = r0.f38363e = r2     // Catch:{ all -> 0x007b }
        L_0x006f:
            android.os.Handler r0 = r5.f36879d     // Catch:{ all -> 0x007b }
            r1 = 100
            r0.postDelayed(r5, r1)     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x0077:
            r5.mo29438a()     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x007b:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r0 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r5.f36876a = r0
            r5.mo29438a()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8988gd.run():void");
    }

    public C8988gd(WeakReference<View> weakReference, C9087k9 k9Var, BannerOptions bannerOptions) {
        this.f36880e = weakReference;
        this.f36881f = k9Var;
        this.f36882g = bannerOptions;
    }
}
