package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.C9419h;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.sdk.ads.video.h */
/* compiled from: Sta */
public class C9364h {

    /* renamed from: a */
    public LinkedList<CachedVideoAd> f38530a = new LinkedList<>();

    /* renamed from: b */
    public final Context f38531b;

    /* renamed from: c */
    public final Executor f38532c;

    /* renamed from: d */
    public final C9410d f38533d;

    public C9364h(Context context, Executor executor, C9410d dVar) {
        this.f38531b = context;
        this.f38532c = executor;
        this.f38533d = dVar;
    }

    /* renamed from: a */
    public boolean mo30350a(int i) {
        ArrayList arrayList;
        boolean z;
        Iterator it = this.f38530a.iterator();
        boolean z2 = false;
        while (it.hasNext() && this.f38530a.size() > i) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            C9410d dVar = this.f38533d;
            String a = cachedVideoAd.mo30680a();
            synchronized (dVar) {
                arrayList = new ArrayList(dVar.f38789a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                C9440d dVar2 = ((C9419h) it2.next()).f38815e;
                if (dVar2 instanceof VideoEnabledAd) {
                    VideoEnabledAd videoEnabledAd = (VideoEnabledAd) dVar2;
                    if (!(videoEnabledAd.mo30296w() == null || videoEnabledAd.mo30296w().mo30278c() == null || !videoEnabledAd.mo30296w().mo30278c().equals(a))) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                it.remove();
                if (cachedVideoAd.mo30680a() != null) {
                    new File(cachedVideoAd.mo30680a()).delete();
                }
                z2 = true;
            }
        }
        return z2;
    }
}
