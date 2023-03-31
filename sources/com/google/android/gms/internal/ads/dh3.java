package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dh3 {
    /* renamed from: a */
    public static ch3 m11501a(String str) throws GeneralSecurityException {
        ch3 ch3 = (ch3) xh3.m23226k().get(str);
        if (ch3 != null) {
            return ch3;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
