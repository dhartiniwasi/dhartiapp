package p343rc;

/* renamed from: rc.w0 */
/* compiled from: ManagedChannelProvider */
public abstract class C12404w0 {

    /* renamed from: rc.w0$a */
    /* compiled from: ManagedChannelProvider */
    public static final class C12405a extends RuntimeException {
        public C12405a(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    public static C12404w0 m59304d() {
        C12404w0 d = C12407x0.m59311b().mo37154d();
        if (d != null) {
            return d;
        }
        throw new C12405a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12402v0<?> mo37146a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo37147b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo37148c();
}
