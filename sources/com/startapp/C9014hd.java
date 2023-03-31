package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.startapp.hd */
/* compiled from: Sta */
public class C9014hd {

    /* renamed from: a */
    public final Handler f36931a;

    /* renamed from: b */
    public final WeakReference<View> f36932b;

    /* renamed from: c */
    public final BannerOptions f36933c;

    /* renamed from: com.startapp.hd$a */
    /* compiled from: Sta */
    public class C9015a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9016b f36934a;

        public C9015a(C9016b bVar) {
            this.f36934a = bVar;
        }

        public void run() {
            if (this.f36934a.onUpdate(C9014hd.m48673a(C9014hd.this))) {
                C9014hd.this.f36931a.postDelayed(this, 100);
            }
        }
    }

    /* renamed from: com.startapp.hd$b */
    /* compiled from: Sta */
    public interface C9016b {
        boolean onUpdate(boolean z);
    }

    public C9014hd(View view, BannerOptions bannerOptions, C9016b bVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f36931a = handler;
        this.f36932b = new WeakReference<>(view);
        this.f36933c = bannerOptions;
        handler.postDelayed(new C9015a(bVar), 100);
    }

    /* renamed from: a */
    public void mo29465a() {
        this.f36931a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public static boolean m48673a(C9014hd hdVar) {
        return C8956fd.m48597a((View) hdVar.f36932b.get(), hdVar.f36933c, (AtomicReference<JSONObject>) new AtomicReference()) == null;
    }
}
