package p161w3;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: w3.r */
/* compiled from: Log */
public final class C5961r {

    /* renamed from: a */
    private static final Object f29136a = new Object();

    /* renamed from: b */
    private static int f29137b = 0;

    /* renamed from: c */
    private static boolean f29138c = true;

    /* renamed from: d */
    private static C5962a f29139d = C5962a.f29140a;

    /* renamed from: w3.r$a */
    /* compiled from: Log */
    public interface C5962a {

        /* renamed from: a */
        public static final C5962a f29140a = new C5963a();

        /* renamed from: w3.r$a$a */
        /* compiled from: Log */
        class C5963a implements C5962a {
            C5963a() {
            }

            /* renamed from: a */
            public void mo20656a(String str, String str2) {
                Log.w(str, str2);
            }

            /* renamed from: b */
            public void mo20657b(String str, String str2) {
                Log.e(str, str2);
            }

            /* renamed from: c */
            public void mo20658c(String str, String str2) {
                Log.d(str, str2);
            }

            /* renamed from: d */
            public void mo20659d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        /* renamed from: a */
        void mo20656a(String str, String str2);

        /* renamed from: b */
        void mo20657b(String str, String str2);

        /* renamed from: c */
        void mo20658c(String str, String str2);

        /* renamed from: d */
        void mo20659d(String str, String str2);
    }

    /* renamed from: a */
    private static String m35207a(String str, Throwable th) {
        String e = m35211e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        return str + "\n  " + e.replace("\n", "\n  ") + 10;
    }

    /* renamed from: b */
    public static void m35208b(String str, String str2) {
        synchronized (f29136a) {
            if (f29137b == 0) {
                f29139d.mo20658c(str, str2);
            }
        }
    }

    /* renamed from: c */
    public static void m35209c(String str, String str2) {
        synchronized (f29136a) {
            if (f29137b <= 3) {
                f29139d.mo20657b(str, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m35210d(String str, String str2, Throwable th) {
        m35209c(str, m35207a(str2, th));
    }

    /* renamed from: e */
    public static String m35211e(Throwable th) {
        synchronized (f29136a) {
            if (th == null) {
                return null;
            }
            if (m35214h(th)) {
                return "UnknownHostException (no network)";
            }
            if (!f29138c) {
                String message = th.getMessage();
                return message;
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }

    /* renamed from: f */
    public static void m35212f(String str, String str2) {
        synchronized (f29136a) {
            if (f29137b <= 1) {
                f29139d.mo20659d(str, str2);
            }
        }
    }

    /* renamed from: g */
    public static void m35213g(String str, String str2, Throwable th) {
        m35212f(str, m35207a(str2, th));
    }

    /* renamed from: h */
    private static boolean m35214h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: i */
    public static void m35215i(String str, String str2) {
        synchronized (f29136a) {
            if (f29137b <= 2) {
                f29139d.mo20656a(str, str2);
            }
        }
    }

    /* renamed from: j */
    public static void m35216j(String str, String str2, Throwable th) {
        m35215i(str, m35207a(str2, th));
    }
}
