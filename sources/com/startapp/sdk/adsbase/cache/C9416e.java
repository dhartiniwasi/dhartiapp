package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.cache.C9419h;
import java.util.Iterator;

/* renamed from: com.startapp.sdk.adsbase.cache.e */
/* compiled from: Sta */
public class C9416e implements C9419h.C9421b {

    /* renamed from: a */
    public final /* synthetic */ C9410d f38806a;

    public C9416e(C9410d dVar) {
        this.f38806a = dVar;
    }

    /* renamed from: a */
    public void mo30705a(C9419h hVar) {
        synchronized (this.f38806a.f38789a) {
            Iterator<C9419h> it = this.f38806a.f38789a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == hVar) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
