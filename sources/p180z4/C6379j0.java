package p180z4;

import java.util.concurrent.Callable;

/* renamed from: z4.j0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C6379j0 extends C6383l0 {

    /* renamed from: f */
    private final Callable f30622f;

    /* synthetic */ C6379j0(Callable callable, C6377i0 i0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (C6381k0) null);
        this.f30622f = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo21807a() {
        try {
            return (String) this.f30622f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
