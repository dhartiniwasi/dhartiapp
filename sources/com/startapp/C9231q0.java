package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.C9396a;

/* renamed from: com.startapp.q0 */
/* compiled from: Sta */
public class C9231q0 {

    /* renamed from: com.startapp.q0$a */
    /* compiled from: Sta */
    public class C9232a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f38101a;

        /* renamed from: b */
        public final /* synthetic */ View f38102b;

        public C9232a(BannerListener bannerListener, View view, Context context) {
            this.f38101a = bannerListener;
            this.f38102b = view;
        }

        public void run() {
            try {
                this.f38101a.onReceiveAd(this.f38102b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f38101a, th);
            }
        }
    }

    /* renamed from: com.startapp.q0$b */
    /* compiled from: Sta */
    public class C9233b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f38103a;

        /* renamed from: b */
        public final /* synthetic */ View f38104b;

        public C9233b(BannerListener bannerListener, View view, Context context) {
            this.f38103a = bannerListener;
            this.f38104b = view;
        }

        public void run() {
            try {
                this.f38103a.onFailedToReceiveAd(this.f38104b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f38103a, th);
            }
        }
    }

    /* renamed from: com.startapp.q0$c */
    /* compiled from: Sta */
    public class C9234c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BannerListener f38105a;

        /* renamed from: b */
        public final /* synthetic */ View f38106b;

        public C9234c(BannerListener bannerListener, View view, Context context) {
            this.f38105a = bannerListener;
            this.f38106b = view;
        }

        public void run() {
            try {
                this.f38105a.onClick(this.f38106b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f38105a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m49170a(Context context, BannerListener bannerListener, View view, String str) {
        C9234c cVar = null;
        C9615w2.m50488a("onClicked", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            cVar = new C9234c(bannerListener, view, context);
        }
        C9396a.m49784a((Runnable) cVar);
    }

    /* renamed from: b */
    public static void m49171b(Context context, BannerListener bannerListener, View view, String str) {
        C9233b bVar = null;
        C9615w2.m50488a("onLoadFailed", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            bVar = new C9233b(bannerListener, view, context);
        }
        C9396a.m49784a((Runnable) bVar);
    }

    /* renamed from: c */
    public static void m49172c(Context context, BannerListener bannerListener, View view, String str) {
        C9232a aVar = null;
        C9615w2.m50488a("onLoad", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            aVar = new C9232a(bannerListener, view, context);
        }
        C9396a.m49784a((Runnable) aVar);
    }
}
