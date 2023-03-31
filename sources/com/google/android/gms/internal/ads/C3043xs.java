package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3043xs {

    /* renamed from: a */
    ByteArrayOutputStream f20334a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    Base64OutputStream f20335b = new Base64OutputStream(this.f20334a, 10);

    public final String toString() {
        try {
            this.f20335b.close();
        } catch (IOException e) {
            pm0.m18665e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f20334a.close();
            return this.f20334a.toString();
        } catch (IOException e2) {
            pm0.m18665e("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f20334a = null;
            this.f20335b = null;
        }
    }
}
