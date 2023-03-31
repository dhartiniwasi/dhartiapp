package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m04 extends RuntimeException {
    public m04(cz3 cz3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final ey3 mo12250a() {
        return new ey3(getMessage());
    }
}
