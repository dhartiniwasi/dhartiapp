package androidx.loader.app;

import androidx.lifecycle.C1217l0;
import androidx.lifecycle.C1220n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
/* compiled from: LoaderManager */
public abstract class C1242a {
    /* renamed from: b */
    public static <T extends C1220n & C1217l0> C1242a m5493b(T t) {
        return new C1243b(t, ((C1217l0) t).getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo4456a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo4457c();
}
