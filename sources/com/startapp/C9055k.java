package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: com.startapp.k */
/* compiled from: Sta */
public class C9055k {

    /* renamed from: com.startapp.k$a */
    /* compiled from: Sta */
    public class C9056a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f37026a;

        /* renamed from: b */
        public final /* synthetic */ C9381Ad f37027b;

        public C9056a(AdEventListener adEventListener, C9381Ad ad, Context context) {
            this.f37026a = adEventListener;
            this.f37027b = ad;
        }

        public void run() {
            try {
                this.f37026a.onReceiveAd(this.f37027b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f37026a, th);
            }
        }
    }

    /* renamed from: com.startapp.k$b */
    /* compiled from: Sta */
    public class C9057b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f37028a;

        /* renamed from: b */
        public final /* synthetic */ C9381Ad f37029b;

        public C9057b(AdEventListener adEventListener, C9381Ad ad, Context context) {
            this.f37028a = adEventListener;
            this.f37029b = ad;
        }

        public void run() {
            try {
                this.f37028a.onFailedToReceiveAd(this.f37029b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f37028a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m48716a(Context context, AdEventListener adEventListener, C9381Ad ad, boolean z) {
        C9057b bVar = null;
        if (!z) {
            C9615w2.m50488a("onLoadFailed", adEventListener != null, (String) null, ad != null ? ad.getErrorMessage() : null);
        }
        if (adEventListener != null) {
            bVar = new C9057b(adEventListener, ad, context);
        }
        C9396a.m49784a((Runnable) bVar);
    }

    /* renamed from: b */
    public static void m48717b(Context context, AdEventListener adEventListener, C9381Ad ad, boolean z) {
        C9056a aVar = null;
        if (!z) {
            C9615w2.m50488a("onLoad", adEventListener != null, (String) null, (String) null);
        }
        if (adEventListener != null) {
            aVar = new C9056a(adEventListener, ad, context);
        }
        C9396a.m49784a((Runnable) aVar);
    }
}
