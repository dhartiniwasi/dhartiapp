package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3234d9 {

    /* renamed from: a */
    private static final Logger f21936a = Logger.getLogger(C3234d9.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f21937b = new AtomicBoolean(false);

    private C3234d9() {
    }

    /* renamed from: a */
    static Boolean m25411a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f21936a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m25412b() {
        return f21937b.get();
    }
}
