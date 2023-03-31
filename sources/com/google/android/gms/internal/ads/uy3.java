package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uy3 implements xz3 {

    /* renamed from: b */
    private static final az3 f18864b = new sy3();

    /* renamed from: a */
    private final az3 f18865a;

    public uy3() {
        az3 az3;
        az3[] az3Arr = new az3[2];
        az3Arr[0] = nx3.m17325c();
        try {
            az3 = (az3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            az3 = f18864b;
        }
        az3Arr[1] = az3;
        ty3 ty3 = new ty3(az3Arr);
        cy3.m11234f(ty3, "messageInfoFactory");
        this.f18865a = ty3;
    }

    /* renamed from: a */
    private static boolean m21906a(zy3 zy3) {
        return zy3.mo11551e() == 1;
    }

    /* renamed from: c */
    public final wz3 mo14639c(Class cls) {
        Class<sx3> cls2 = sx3.class;
        yz3.m24292g(cls);
        zy3 a = this.f18865a.mo8631a(cls);
        if (a.mo11550d()) {
            if (cls2.isAssignableFrom(cls)) {
                return gz3.m13635k(yz3.m24286b(), hx3.m14073b(), a.zza());
            }
            return gz3.m13635k(yz3.m24287b0(), hx3.m14072a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m21906a(a)) {
                return fz3.m12934K(cls, a, iz3.m14604b(), qy3.m19487e(), yz3.m24286b(), hx3.m14073b(), yy3.m24244b());
            }
            return fz3.m12934K(cls, a, iz3.m14604b(), qy3.m19487e(), yz3.m24286b(), (fx3) null, yy3.m24244b());
        } else if (m21906a(a)) {
            return fz3.m12934K(cls, a, iz3.m14603a(), qy3.m19486d(), yz3.m24287b0(), hx3.m14072a(), yy3.m24243a());
        } else {
            return fz3.m12934K(cls, a, iz3.m14603a(), qy3.m19486d(), yz3.m24284a(), (fx3) null, yy3.m24243a());
        }
    }
}
