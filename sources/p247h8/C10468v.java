package p247h8;

import android.util.Log;

/* renamed from: h8.v */
/* compiled from: Logger */
public class C10468v {

    /* renamed from: a */
    private static C10470b f41451a = C10470b.WARN;

    /* renamed from: h8.v$a */
    /* compiled from: Logger */
    static /* synthetic */ class C10469a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                h8.v$b[] r0 = p247h8.C10468v.C10470b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41452a = r0
                h8.v$b r1 = p247h8.C10468v.C10470b.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41452a     // Catch:{ NoSuchFieldError -> 0x001d }
                h8.v$b r1 = p247h8.C10468v.C10470b.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h8.v$b r1 = p247h8.C10468v.C10470b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p247h8.C10468v.C10469a.<clinit>():void");
        }
    }

    /* renamed from: h8.v$b */
    /* compiled from: Logger */
    public enum C10470b {
        DEBUG,
        WARN,
        NONE
    }

    /* renamed from: a */
    public static void m52767a(String str, String str2, Object... objArr) {
        m52768b(C10470b.DEBUG, str, str2, objArr);
    }

    /* renamed from: b */
    private static void m52768b(C10470b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f41451a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", new Object[]{"24.4.3", str}) + String.format(str2, objArr);
            int i = C10469a.f41452a[bVar.ordinal()];
            if (i == 1) {
                Log.i("Firestore", str3);
            } else if (i == 2) {
                Log.w("Firestore", str3);
            } else if (i == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    /* renamed from: c */
    public static boolean m52769c() {
        return f41451a.ordinal() >= C10470b.DEBUG.ordinal();
    }

    /* renamed from: d */
    public static void m52770d(String str, String str2, Object... objArr) {
        m52768b(C10470b.WARN, str, str2, objArr);
    }
}
