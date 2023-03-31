package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.tq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2893tq {

    /* renamed from: a */
    public static final int f18208a;

    /* renamed from: b */
    public static final String f18209b;

    /* renamed from: c */
    public static final String f18210c;

    /* renamed from: d */
    public static final String f18211d;

    /* renamed from: e */
    public static final String f18212e;

    /* renamed from: f */
    private static final Pattern f18213f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: g */
    private static final Pattern f18214g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: h */
    private static final Pattern f18215h = Pattern.compile("%([A-Fa-f0-9]{2})");

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f18208a = i;
        String str = Build.DEVICE;
        f18209b = str;
        String str2 = Build.MANUFACTURER;
        f18210c = str2;
        String str3 = Build.MODEL;
        f18211d = str3;
        f18212e = str + ", " + str3 + ", " + str2 + ", " + i;
    }

    /* renamed from: a */
    public static float m21170a(float f, float f2, float f3) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m21171b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x0019
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0013
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0008
        L_0x0013:
            if (r7 == 0) goto L_0x0018
            int r5 = r0 + -1
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2893tq.m21171b(long[], long, boolean, boolean):int");
    }

    /* renamed from: c */
    public static int m21172c(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: d */
    public static int m21173d(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: e */
    public static int m21174e(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: f */
    public static int m21175f(int i) {
        return i != 1 ? 13107200 : 3538944;
    }

    /* renamed from: g */
    public static int m21176g(String str) {
        int length = str.length();
        C2335eq.m12243c(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: h */
    public static int m21177h(int i) {
        if (i == 8) {
            return 3;
        }
        if (i != 16) {
            return i != 24 ? i != 32 ? 0 : 1073741824 : RecyclerView.UNDEFINED_DURATION;
        }
        return 2;
    }

    /* renamed from: i */
    public static int m21178i(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 * 4;
        }
        if (i == 2) {
            return i2 + i2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static long m21179j(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i < 0 || j3 % j2 != 0) {
            return (i >= 0 || j2 % j3 != 0) ? (long) (((double) j) * (((double) j2) / ((double) j3))) : j * (j2 / j3);
        }
        return j / (j3 / j2);
    }

    /* renamed from: k */
    public static String m21180k(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: l */
    public static ExecutorService m21181l(String str) {
        return Executors.newSingleThreadExecutor(new C2856sq("Loader:ExtractorMediaPeriod"));
    }

    /* renamed from: m */
    public static void m21182m(C2669np npVar) {
        if (npVar != null) {
            try {
                npVar.mo12051b();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n */
    public static void m21183n(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            double d = 1000000.0d / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: o */
    public static boolean m21184o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: p */
    public static byte[] m21185p(String str) {
        byte[] bArr = new byte[38];
        for (int i = 0; i < 38; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: q */
    public static byte[] m21186q(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
