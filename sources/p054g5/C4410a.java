package p054g5;

import android.util.Log;
import java.util.Locale;
import p033d5.C4111i;

/* renamed from: g5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4410a {

    /* renamed from: a */
    private final String f24575a;

    /* renamed from: b */
    private final String f24576b;

    /* renamed from: c */
    private final C4111i f24577c;

    /* renamed from: d */
    private final int f24578d;

    public C4410a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f24576b = str2;
        this.f24575a = str;
        this.f24577c = new C4111i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f24575a, i)) {
            i++;
        }
        this.f24578d = i;
    }

    /* renamed from: a */
    public void mo17928a(String str, Object... objArr) {
        if (mo17933f(3)) {
            Log.d(this.f24575a, mo17931d(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo17929b(String str, Throwable th, Object... objArr) {
        Log.e(this.f24575a, mo17931d(str, objArr), th);
    }

    /* renamed from: c */
    public void mo17930c(String str, Object... objArr) {
        Log.e(this.f24575a, mo17931d(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo17931d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f24576b.concat(str);
    }

    /* renamed from: e */
    public void mo17932e(String str, Object... objArr) {
        Log.i(this.f24575a, mo17931d(str, objArr));
    }

    /* renamed from: f */
    public boolean mo17933f(int i) {
        return this.f24578d <= i;
    }

    /* renamed from: g */
    public void mo17934g(String str, Object... objArr) {
        if (mo17933f(2)) {
            Log.v(this.f24575a, mo17931d(str, objArr));
        }
    }

    /* renamed from: h */
    public void mo17935h(String str, Object... objArr) {
        Log.w(this.f24575a, mo17931d(str, objArr));
    }

    /* renamed from: i */
    public void mo17936i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f24575a, mo17931d(str, objArr), th);
    }

    /* renamed from: j */
    public void mo17937j(Throwable th) {
        Log.wtf(this.f24575a, th);
    }
}
