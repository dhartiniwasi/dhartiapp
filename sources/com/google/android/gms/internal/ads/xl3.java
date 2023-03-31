package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xl3 {

    /* renamed from: a */
    public static final sn3 f20195a = new wl3((vl3) null);

    /* renamed from: a */
    public static yn3 m23367a(th3 th3) {
        bh3 bh3;
        un3 un3 = new un3();
        un3.mo14551b(th3.mo14307b());
        for (List it : th3.mo14309d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    nh3 nh3 = (nh3) it2.next();
                    int e = nh3.mo12627e() - 2;
                    if (e == 1) {
                        bh3 = bh3.f7268b;
                    } else if (e == 2) {
                        bh3 = bh3.f7269c;
                    } else if (e == 3) {
                        bh3 = bh3.f7270d;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    un3.mo14550a(bh3, nh3.mo12623a(), nh3.mo12624b());
                }
            }
        }
        if (th3.mo14306a() != null) {
            un3.mo14552c(th3.mo14306a().mo12623a());
        }
        try {
            return un3.mo14553d();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
