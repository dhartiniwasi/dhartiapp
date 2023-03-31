package p098n1;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p153v1.C5761d;

/* renamed from: n1.u */
/* compiled from: TransportRuntimeComponent */
abstract class C5101u implements Closeable {

    /* renamed from: n1.u$a */
    /* compiled from: TransportRuntimeComponent */
    interface C5102a {
        /* renamed from: a */
        C5102a mo19035a(Context context);

        C5101u build();
    }

    C5101u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C5761d mo19033a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C5100t mo19034b();

    public void close() throws IOException {
        mo19033a().close();
    }
}
