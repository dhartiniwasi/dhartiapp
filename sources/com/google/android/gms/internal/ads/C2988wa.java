package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.wa */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2988wa implements C2543ka {

    /* renamed from: a */
    private File f19539a = null;

    /* renamed from: b */
    final /* synthetic */ Context f19540b;

    C2988wa(Context context) {
        this.f19540b = context;
    }

    public final File zza() {
        if (this.f19539a == null) {
            this.f19539a = new File(this.f19540b.getCacheDir(), "volley");
        }
        return this.f19539a;
    }
}
