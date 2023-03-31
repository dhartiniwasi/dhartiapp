package p264io.grpc.internal;

import p264io.grpc.internal.C11183f2;

/* renamed from: io.grpc.internal.g2 */
/* compiled from: SharedResourcePool */
public final class C11240g2<T> implements C11327p1<T> {

    /* renamed from: a */
    private final C11183f2.C11187d<T> f43271a;

    private C11240g2(C11183f2.C11187d<T> dVar) {
        this.f43271a = dVar;
    }

    /* renamed from: c */
    public static <T> C11240g2<T> m55467c(C11183f2.C11187d<T> dVar) {
        return new C11240g2<>(dVar);
    }

    /* renamed from: a */
    public T mo35180a() {
        return C11183f2.m55283d(this.f43271a);
    }

    /* renamed from: b */
    public T mo35181b(Object obj) {
        C11183f2.m55284f(this.f43271a, obj);
        return null;
    }
}
