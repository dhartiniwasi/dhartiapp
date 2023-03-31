package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fv3 extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ gv3 f9473a;

    fv3(gv3 gv3) {
        this.f9473a = gv3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) su3.f17667f.mo14144a(this.f9473a.f10073b);
            mac.init(this.f9473a.f10074c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
