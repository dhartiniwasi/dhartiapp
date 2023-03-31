package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ty3 implements az3 {

    /* renamed from: a */
    private final az3[] f18296a;

    ty3(az3... az3Arr) {
        this.f18296a = az3Arr;
    }

    /* renamed from: a */
    public final zy3 mo8631a(Class cls) {
        az3[] az3Arr = this.f18296a;
        for (int i = 0; i < 2; i++) {
            az3 az3 = az3Arr[i];
            if (az3.mo8632b(cls)) {
                return az3.mo8631a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo8632b(Class cls) {
        az3[] az3Arr = this.f18296a;
        for (int i = 0; i < 2; i++) {
            if (az3Arr[i].mo8632b(cls)) {
                return true;
            }
        }
        return false;
    }
}
