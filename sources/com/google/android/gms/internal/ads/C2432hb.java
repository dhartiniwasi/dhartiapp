package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.hb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2432hb extends h34 {

    /* renamed from: s */
    ByteBuffer f10266s;

    public C2432hb(String str) {
        super(str);
    }

    /* renamed from: c */
    public final void mo10451c(ByteBuffer byteBuffer) {
        this.f10266s = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
