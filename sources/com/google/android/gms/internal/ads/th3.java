package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class th3 {

    /* renamed from: a */
    private final ConcurrentMap f17998a;

    /* renamed from: b */
    private final nh3 f17999b;

    /* renamed from: c */
    private final Class f18000c;

    /* renamed from: d */
    private final rn3 f18001d;

    /* synthetic */ th3(ConcurrentMap concurrentMap, nh3 nh3, rn3 rn3, Class cls, sh3 sh3) {
        this.f17998a = concurrentMap;
        this.f17999b = nh3;
        this.f18000c = cls;
        this.f18001d = rn3;
    }

    /* renamed from: a */
    public final nh3 mo14306a() {
        return this.f17999b;
    }

    /* renamed from: b */
    public final rn3 mo14307b() {
        return this.f18001d;
    }

    /* renamed from: c */
    public final Class mo14308c() {
        return this.f18000c;
    }

    /* renamed from: d */
    public final Collection mo14309d() {
        return this.f17998a.values();
    }

    /* renamed from: e */
    public final List mo14310e(byte[] bArr) {
        List list = (List) this.f17998a.get(new ph3(bArr, (oh3) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean mo14311f() {
        return !this.f18001d.mo13860a().isEmpty();
    }
}
