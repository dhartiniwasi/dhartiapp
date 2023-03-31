package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C9416e;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* renamed from: com.startapp.q1 */
/* compiled from: Sta */
public abstract class C9235q1 {

    /* renamed from: a */
    public C9419h f38107a;

    /* renamed from: b */
    public Handler f38108b = null;

    /* renamed from: c */
    public Long f38109c = null;

    /* renamed from: d */
    public boolean f38110d = false;

    /* renamed from: com.startapp.q1$a */
    /* compiled from: Sta */
    public class C9236a implements Runnable {
        public C9236a() {
        }

        public void run() {
            C9235q1.this.mo29806c();
        }
    }

    public C9235q1(C9419h hVar) {
        this.f38107a = hVar;
    }

    /* renamed from: a */
    public abstract boolean mo29804a();

    /* renamed from: b */
    public abstract long mo29805b();

    /* renamed from: c */
    public void mo29806c() {
        this.f38109c = null;
        this.f38110d = false;
        C9419h hVar = this.f38107a;
        if (hVar.f38823m < MetaData.f38952k.mo30996L()) {
            hVar.f38823m++;
            hVar.mo30709a((StartAppAd) null, (AdEventListener) null, true, false);
            return;
        }
        C9419h.C9421b bVar = hVar.f38826p;
        if (bVar != null) {
            ((C9416e) bVar).mo30705a(hVar);
        }
    }

    /* renamed from: d */
    public void mo29849d() {
        if (!this.f38110d) {
            if (this.f38109c == null) {
                this.f38109c = Long.valueOf(System.currentTimeMillis());
            }
            if (mo29804a()) {
                if (this.f38108b == null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    this.f38108b = new Handler(myLooper);
                }
                long b = mo29805b();
                if (b >= 0) {
                    this.f38110d = true;
                    this.f38108b.postDelayed(new C9236a(), b);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo29850e() {
        Handler handler = this.f38108b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f38109c = null;
        this.f38110d = false;
    }
}
