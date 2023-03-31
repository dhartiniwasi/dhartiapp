package p033d5;

import android.util.Log;

/* renamed from: d5.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4111i {

    /* renamed from: a */
    private final String f23331a;

    /* renamed from: b */
    private final String f23332b;

    public C4111i(String str) {
        this(str, (String) null);
    }

    /* renamed from: f */
    private final String m28156f(String str) {
        String str2 = this.f23332b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public boolean mo17402a(int i) {
        return Log.isLoggable(this.f23331a, i);
    }

    /* renamed from: b */
    public void mo17403b(String str, String str2) {
        if (mo17402a(3)) {
            Log.d(str, m28156f(str2));
        }
    }

    /* renamed from: c */
    public void mo17404c(String str, String str2, Throwable th) {
        if (mo17402a(6)) {
            Log.e(str, m28156f(str2), th);
        }
    }

    /* renamed from: d */
    public void mo17405d(String str, String str2) {
        if (mo17402a(2)) {
            Log.v(str, m28156f(str2));
        }
    }

    /* renamed from: e */
    public void mo17406e(String str, String str2) {
        if (mo17402a(5)) {
            Log.w(str, m28156f(str2));
        }
    }

    public C4111i(String str, String str2) {
        C4141r.m28222l(str, "log tag cannot be null");
        C4141r.m28213c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f23331a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f23332b = null;
        } else {
            this.f23332b = str2;
        }
    }
}
