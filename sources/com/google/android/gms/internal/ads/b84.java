package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b84 {

    /* renamed from: a */
    private final e54 f7157a;

    @Deprecated
    public b84(Context context, ds0 ds0, byte[] bArr) {
        this.f7157a = new e54(context, ds0, (byte[]) null);
    }

    @Deprecated
    /* renamed from: a */
    public final b84 mo8694a(d74 d74) {
        e54 e54 = this.f7157a;
        v91.m22052f(!e54.f8679q);
        Objects.requireNonNull(d74);
        e54.f8668f = new w44(d74);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public final b84 mo8695b(dk4 dk4) {
        e54 e54 = this.f7157a;
        v91.m22052f(!e54.f8679q);
        Objects.requireNonNull(dk4);
        e54.f8667e = new x44(dk4);
        return this;
    }

    @Deprecated
    /* renamed from: c */
    public final c84 mo8696c() {
        e54 e54 = this.f7157a;
        v91.m22052f(!e54.f8679q);
        e54.f8679q = true;
        return new c84(e54);
    }
}
