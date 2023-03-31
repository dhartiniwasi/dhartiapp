package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.ou */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2711ou extends PushbackInputStream {

    /* renamed from: a */
    final /* synthetic */ C2749pu f15358a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2711ou(C2749pu puVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f15358a = puVar;
    }

    public final synchronized void close() throws IOException {
        C2823ru.m20031e(this.f15358a.f16040c);
        super.close();
    }
}
