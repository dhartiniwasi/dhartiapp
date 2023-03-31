package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oa */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2691oa {

    /* renamed from: a */
    private final int f15013a;

    /* renamed from: b */
    private final List f15014b;

    /* renamed from: c */
    private final int f15015c;

    /* renamed from: d */
    private final InputStream f15016d;

    public C2691oa(int i, List list, int i2, InputStream inputStream) {
        this.f15013a = i;
        this.f15014b = list;
        this.f15015c = i2;
        this.f15016d = inputStream;
    }

    /* renamed from: a */
    public final int mo12880a() {
        return this.f15015c;
    }

    /* renamed from: b */
    public final int mo12881b() {
        return this.f15013a;
    }

    /* renamed from: c */
    public final InputStream mo12882c() {
        InputStream inputStream = this.f15016d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List mo12883d() {
        return Collections.unmodifiableList(this.f15014b);
    }
}
