package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.vs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2969vs {

    /* renamed from: b */
    private static MessageDigest f19227b;

    /* renamed from: a */
    protected final Object f19228a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo14810a() {
        synchronized (this.f19228a) {
            MessageDigest messageDigest = f19227b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f19227b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f19227b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo8528b(String str);
}
