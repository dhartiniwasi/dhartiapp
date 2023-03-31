package p170y0;

import android.util.Log;

/* renamed from: y0.j */
/* compiled from: Logger */
public abstract class C6094j {

    /* renamed from: a */
    private static C6094j f29483a = null;

    /* renamed from: b */
    private static final int f29484b = 20;

    /* renamed from: y0.j$a */
    /* compiled from: Logger */
    public static class C6095a extends C6094j {

        /* renamed from: c */
        private int f29485c;

        public C6095a(int i) {
            super(i);
            this.f29485c = i;
        }

        /* renamed from: a */
        public void mo20921a(String str, String str2, Throwable... thArr) {
            if (this.f29485c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo20922b(String str, String str2, Throwable... thArr) {
            if (this.f29485c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo20923d(String str, String str2, Throwable... thArr) {
            if (this.f29485c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: g */
        public void mo20924g(String str, String str2, Throwable... thArr) {
            if (this.f29485c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: h */
        public void mo20925h(String str, String str2, Throwable... thArr) {
            if (this.f29485c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C6094j(int i) {
    }

    /* renamed from: c */
    public static synchronized C6094j m35717c() {
        C6094j jVar;
        synchronized (C6094j.class) {
            if (f29483a == null) {
                f29483a = new C6095a(3);
            }
            jVar = f29483a;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized void m35718e(C6094j jVar) {
        synchronized (C6094j.class) {
            f29483a = jVar;
        }
    }

    /* renamed from: f */
    public static String m35719f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f29484b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo20921a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo20922b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo20923d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo20924g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo20925h(String str, String str2, Throwable... thArr);
}
