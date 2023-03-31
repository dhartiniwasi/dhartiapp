package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hh3 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f10330a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static gh3 m13854a(String str) throws GeneralSecurityException {
        Iterator it = f10330a.iterator();
        while (it.hasNext()) {
            gh3 gh3 = (gh3) it.next();
            if (gh3.zza()) {
                return gh3;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
