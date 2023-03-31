package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uo2 {

    /* renamed from: a */
    private Uri f18655a;

    /* renamed from: b */
    private final int f18656b = 1;

    /* renamed from: c */
    private Map f18657c = Collections.emptyMap();

    /* renamed from: d */
    private long f18658d;

    /* renamed from: e */
    private int f18659e;

    /* renamed from: a */
    public final uo2 mo14556a(int i) {
        this.f18659e = 6;
        return this;
    }

    /* renamed from: b */
    public final uo2 mo14557b(Map map) {
        this.f18657c = map;
        return this;
    }

    /* renamed from: c */
    public final uo2 mo14558c(long j) {
        this.f18658d = j;
        return this;
    }

    /* renamed from: d */
    public final uo2 mo14559d(Uri uri) {
        this.f18655a = uri;
        return this;
    }

    /* renamed from: e */
    public final wq2 mo14560e() {
        if (this.f18655a != null) {
            return new wq2(this.f18655a, 0, 1, (byte[]) null, this.f18657c, this.f18658d, -1, (String) null, this.f18659e, (Object) null, (vp2) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
