package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kg3 {

    /* renamed from: a */
    private final OutputStream f12081a;

    private kg3(OutputStream outputStream) {
        this.f12081a = outputStream;
    }

    /* renamed from: b */
    public static kg3 m15410b(OutputStream outputStream) {
        return new kg3(outputStream);
    }

    /* renamed from: a */
    public final void mo11699a(us3 us3) throws IOException {
        try {
            us3.mo14149j(this.f12081a);
        } finally {
            this.f12081a.close();
        }
    }
}
