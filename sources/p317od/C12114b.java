package p317od;

import java.io.Closeable;

/* renamed from: od.b */
/* compiled from: Closeable.kt */
public final class C12114b {
    /* renamed from: a */
    public static final void m58233a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C10329b.m52230a(th, th2);
        }
    }
}
