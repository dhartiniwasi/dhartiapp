package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uj3 {

    /* renamed from: a */
    private static final Logger f18565a = Logger.getLogger(uj3.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f18566b = new AtomicBoolean(false);

    private uj3() {
    }

    /* renamed from: a */
    static Boolean m21663a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f18565a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m21664b() {
        return f18566b.get();
    }
}
