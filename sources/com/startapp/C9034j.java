package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.j */
/* compiled from: Sta */
public class C9034j {

    /* renamed from: com.startapp.j$a */
    /* compiled from: Sta */
    public class C9035a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdDisplayListener f36974a;

        /* renamed from: b */
        public final /* synthetic */ C9381Ad f36975b;

        public C9035a(AdDisplayListener adDisplayListener, C9381Ad ad, Context context) {
            this.f36974a = adDisplayListener;
            this.f36975b = ad;
        }

        public void run() {
            try {
                this.f36974a.adNotDisplayed(this.f36975b);
            } catch (Throwable th) {
                C9605vb.m50460a((Object) this.f36974a, th);
            }
        }
    }

    /* renamed from: a */
    public static void m48694a(Context context, AdDisplayListener adDisplayListener, C9381Ad ad) {
        C9035a aVar = null;
        C9615w2.m50488a("adNotDisplayed", adDisplayListener != null, (String) null, ad != null ? ad.getErrorMessage() : null);
        if (adDisplayListener != null) {
            aVar = new C9035a(adDisplayListener, ad, context);
        }
        C9396a.m49784a((Runnable) aVar);
    }
}
