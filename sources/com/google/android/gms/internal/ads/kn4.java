package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kn4 {

    /* renamed from: a */
    private final jn4 f12181a;

    /* renamed from: b */
    private final AtomicBoolean f12182b = new AtomicBoolean(false);

    public kn4(jn4 jn4) {
        this.f12181a = jn4;
    }

    /* renamed from: a */
    public final qn4 mo11735a(Object... objArr) {
        Constructor constructor;
        synchronized (this.f12182b) {
            if (!this.f12182b.get()) {
                try {
                    constructor = this.f12181a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f12182b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (qn4) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
