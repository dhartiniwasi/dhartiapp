package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cg4 {

    /* renamed from: d */
    private static final AtomicLong f7715d = new AtomicLong();

    /* renamed from: a */
    public final wq2 f7716a;

    /* renamed from: b */
    public final Uri f7717b;

    /* renamed from: c */
    public final Map f7718c;

    public cg4(long j, wq2 wq2, Uri uri, Map map, long j2, long j3, long j4) {
        this.f7716a = wq2;
        this.f7717b = uri;
        this.f7718c = map;
    }

    /* renamed from: a */
    public static long m10931a() {
        return f7715d.getAndIncrement();
    }
}
