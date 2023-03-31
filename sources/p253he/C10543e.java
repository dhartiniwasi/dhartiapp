package p253he;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p244ge.C10364e0;
import p244ge.C10370g0;
import p244ge.C10395w;
import p244ge.C10397x;
import p244ge.C10401z;
import p300me.C11890c;
import p336qe.C12231c;
import p336qe.C12235f;
import p336qe.C12245m;
import p336qe.C12252t;

/* renamed from: he.e */
/* compiled from: Util */
public final class C10543e {

    /* renamed from: a */
    public static final byte[] f41560a;

    /* renamed from: b */
    public static final String[] f41561b = new String[0];

    /* renamed from: c */
    public static final C10395w f41562c = C10395w.m52492g(new String[0]);

    /* renamed from: d */
    public static final C10370g0 f41563d;

    /* renamed from: e */
    public static final C10364e0 f41564e;

    /* renamed from: f */
    private static final C12245m f41565f = C12245m.m58823i(C12235f.m58763j("efbbbf"), C12235f.m58763j("feff"), C12235f.m58763j("fffe"), C12235f.m58763j("0000ffff"), C12235f.m58763j("ffff0000"));

    /* renamed from: g */
    private static final Charset f41566g = Charset.forName("UTF-32BE");

    /* renamed from: h */
    private static final Charset f41567h = Charset.forName("UTF-32LE");

    /* renamed from: i */
    public static final TimeZone f41568i = TimeZone.getTimeZone("GMT");

    /* renamed from: j */
    public static final Comparator<String> f41569j = C10541c.f41557a;

    /* renamed from: k */
    private static final Method f41570k;

    /* renamed from: l */
    private static final Pattern f41571l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f41560a = bArr;
        Method method = null;
        f41563d = C10370g0.m52393h((C10401z) null, bArr);
        f41564e = C10364e0.m52348c((C10401z) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f41570k = method;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ Thread m53028A(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: B */
    public static boolean m53029B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static X509TrustManager m53030C() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: D */
    public static boolean m53031D(C10397x xVar, C10397x xVar2) {
        return xVar.mo33427l().equals(xVar2.mo33427l()) && xVar.mo33432w() == xVar2.mo33432w() && xVar.mo33417B().equals(xVar2.mo33417B());
    }

    /* renamed from: E */
    public static boolean m53032E(C12252t tVar, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c = tVar.mo33809o().mo36857e() ? tVar.mo33809o().mo36855c() - nanoTime : Long.MAX_VALUE;
        tVar.mo33809o().mo36856d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C12231c cVar = new C12231c();
            while (tVar.mo33810z(cVar, 8192) != -1) {
                cVar.mo36786a();
            }
            if (c == Long.MAX_VALUE) {
                tVar.mo33809o().mo36853a();
            } else {
                tVar.mo33809o().mo36856d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                tVar.mo33809o().mo36853a();
            } else {
                tVar.mo33809o().mo36856d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                tVar.mo33809o().mo36853a();
            } else {
                tVar.mo33809o().mo36856d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: F */
    public static int m53033F(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: G */
    public static int m53034G(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static ThreadFactory m53035H(String str, boolean z) {
        return new C10542d(str, z);
    }

    /* renamed from: I */
    public static List<C11890c> m53036I(C10395w wVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wVar.mo33405h(); i++) {
            arrayList.add(new C11890c(wVar.mo33402e(i), wVar.mo33407i(i)));
        }
        return arrayList;
    }

    /* renamed from: J */
    public static C10395w m53037J(List<C11890c> list) {
        C10395w.C10396a aVar = new C10395w.C10396a();
        for (C11890c next : list) {
            C10539a.f41555a.mo33229b(aVar, next.f44652a.mo36832B(), next.f44653b.mo36832B());
        }
        return aVar.mo33413d();
    }

    /* renamed from: K */
    public static String m53038K(String str, int i, int i2) {
        int F = m53033F(str, i, i2);
        return str.substring(F, m53034G(str, F, i2));
    }

    /* renamed from: L */
    public static boolean m53039L(String str) {
        return f41571l.matcher(str).matches();
    }

    /* renamed from: b */
    public static void m53041b(Throwable th, Throwable th2) {
        Method method = f41570k;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: c */
    public static String m53042c(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m53051l(str, 0, str.length());
            } else {
                inetAddress = m53051l(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m53063x(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m53048i(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m53043d(String str, long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new IllegalArgumentException(str + " < 0");
        }
    }

    /* renamed from: e */
    public static void m53044e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: f */
    public static void m53045f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m53046g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m53065z(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String[] m53047h(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: i */
    private static boolean m53048i(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m53049j(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: k */
    private static boolean m53050k(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static InetAddress m53051l(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m53050k(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int j = m53049j(str.charAt(i));
                    if (j == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + j;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: m */
    public static int m53052m(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static int m53053n(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static boolean m53054o(C12252t tVar, int i, TimeUnit timeUnit) {
        try {
            return m53032E(tVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static String m53055p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: q */
    public static String m53056q(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    /* renamed from: r */
    public static String m53057r(C10397x xVar, boolean z) {
        String str;
        if (xVar.mo33427l().contains(":")) {
            str = "[" + xVar.mo33427l() + "]";
        } else {
            str = xVar.mo33427l();
        }
        if (!z && xVar.mo33432w() == C10397x.m52508d(xVar.mo33417B())) {
            return str;
        }
        return str + ":" + xVar.mo33432w();
    }

    /* renamed from: s */
    public static <T> List<T> m53058s(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* renamed from: t */
    public static <T> List<T> m53059t(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m53060u(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: v */
    public static int m53061v(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static int m53062w(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    private static String m53063x(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C12231c cVar = new C12231c();
        while (i < bArr.length) {
            if (i == i2) {
                cVar.mo36787a0(58);
                i += i4;
                if (i == 16) {
                    cVar.mo36787a0(58);
                }
            } else {
                if (i > 0) {
                    cVar.mo36787a0(58);
                }
                cVar.mo36768G0((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo36766F();
    }

    /* renamed from: y */
    public static String[] m53064y(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: z */
    public static boolean m53065z(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
