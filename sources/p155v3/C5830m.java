package p155v3;

import java.io.IOException;

/* renamed from: v3.m */
/* compiled from: DataSourceException */
public class C5830m extends IOException {

    /* renamed from: a */
    public final int f28858a;

    public C5830m(int i) {
        this.f28858a = i;
    }

    /* renamed from: a */
    public static boolean m34613a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof C5830m) && ((C5830m) th).f28858a == 2008) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    public C5830m(Throwable th, int i) {
        super(th);
        this.f28858a = i;
    }

    public C5830m(String str, int i) {
        super(str);
        this.f28858a = i;
    }

    public C5830m(String str, Throwable th, int i) {
        super(str, th);
        this.f28858a = i;
    }
}
