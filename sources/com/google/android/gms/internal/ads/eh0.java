package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class eh0 implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f8804a;

    /* renamed from: b */
    final /* synthetic */ gh0 f8805b;

    eh0(gh0 gh0, Context context) {
        this.f8805b = gh0;
        this.f8804a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        dh0 dh0;
        fh0 fh0 = (fh0) this.f8805b.f9904a.get(this.f8804a);
        if (fh0 == null || fh0.f9278a + ((Long) u00.f18322a.mo13438e()).longValue() < C4409t.m29310b().mo18370a()) {
            dh0 = new ch0(this.f8804a).mo9166a();
        } else {
            dh0 = new ch0(this.f8804a, fh0.f9279b).mo9166a();
        }
        gh0 gh0 = this.f8805b;
        gh0.f9904a.put(this.f8804a, new fh0(gh0, dh0));
        return dh0;
    }
}
