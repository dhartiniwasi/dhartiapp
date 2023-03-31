package p033d5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import p067i5.C4707u;

/* renamed from: d5.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4141r {
    /* renamed from: a */
    public static void m28211a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m28212b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m28213c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m28214d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    /* renamed from: e */
    public static void m28215e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static void m28216f(String str) {
        if (!C4707u.m30433a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static String m28217g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: h */
    public static String m28218h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m28219i() {
        m28220j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m28220j(String str) {
        if (C4707u.m30433a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: k */
    public static <T> T m28221k(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    /* renamed from: l */
    public static <T> T m28222l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: m */
    public static int m28223m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static void m28224n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m28225o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: p */
    public static void m28226p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
