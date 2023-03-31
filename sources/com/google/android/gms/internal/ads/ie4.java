package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ie4 {

    /* renamed from: a */
    private long f10758a;

    /* renamed from: b */
    private long f10759b;

    /* renamed from: c */
    private boolean f10760c;

    ie4() {
    }

    /* renamed from: d */
    private final long m14297d(long j) {
        return this.f10758a + Math.max(0, ((this.f10759b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public final long mo11099a(C2388g4 g4Var) {
        return m14297d((long) g4Var.f9687z);
    }

    /* renamed from: b */
    public final long mo11100b(C2388g4 g4Var, fo3 fo3) {
        if (this.f10759b == 0) {
            this.f10758a = fo3.f9375e;
        }
        if (this.f10760c) {
            return fo3.f9375e;
        }
        ByteBuffer byteBuffer = fo3.f9373c;
        Objects.requireNonNull(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int c = C2308e.m11793c(b);
        if (c == -1) {
            this.f10760c = true;
            this.f10759b = 0;
            this.f10758a = fo3.f9375e;
            ot1.m18060e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return fo3.f9375e;
        }
        long d = m14297d((long) g4Var.f9687z);
        this.f10759b += (long) c;
        return d;
    }

    /* renamed from: c */
    public final void mo11101c() {
        this.f10758a = 0;
        this.f10759b = 0;
        this.f10760c = false;
    }
}
