package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class j34 extends h34 {

    /* renamed from: s */
    private int f11211s;

    protected j34(String str) {
        super("mvhd");
    }

    /* renamed from: e */
    public final int mo11311e() {
        if (!this.f10180c) {
            mo10728d();
        }
        return this.f11211s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo11312g(ByteBuffer byteBuffer) {
        this.f11211s = C2246cb.m10815c(byteBuffer.get());
        C2246cb.m10816d(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
