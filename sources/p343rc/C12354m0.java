package p343rc;

import java.nio.charset.Charset;
import p199c7.C6765a;
import p343rc.C12411y0;

/* renamed from: rc.m0 */
/* compiled from: InternalMetadata */
public final class C12354m0 {

    /* renamed from: a */
    public static final Charset f45672a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final C6765a f45673b = C12411y0.f45762f;

    /* renamed from: rc.m0$a */
    /* compiled from: InternalMetadata */
    public interface C12355a<T> extends C12411y0.C12421j<T> {
    }

    /* renamed from: a */
    public static int m59156a(C12411y0 y0Var) {
        return y0Var.mo37167h();
    }

    /* renamed from: b */
    public static <T> C12411y0.C12418g<T> m59157b(String str, C12355a<T> aVar) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C12411y0.C12418g.m59363g(str, z, aVar);
    }

    /* renamed from: c */
    public static C12411y0 m59158c(byte[]... bArr) {
        return new C12411y0(bArr);
    }

    /* renamed from: d */
    public static byte[][] m59159d(C12411y0 y0Var) {
        return y0Var.mo37171q();
    }
}
