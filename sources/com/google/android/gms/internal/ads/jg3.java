package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jg3 {

    /* renamed from: a */
    private final InputStream f11598a;

    private jg3(InputStream inputStream) {
        this.f11598a = inputStream;
    }

    /* renamed from: b */
    public static jg3 m14855b(byte[] bArr) {
        return new jg3(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final us3 mo11399a() throws IOException {
        try {
            return us3.m21843K(this.f11598a, ex3.m12308a());
        } finally {
            this.f11598a.close();
        }
    }
}
