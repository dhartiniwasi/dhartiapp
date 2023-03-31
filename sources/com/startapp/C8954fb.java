package com.startapp;

import android.net.TrafficStats;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: com.startapp.fb */
/* compiled from: Sta */
public class C8954fb {

    /* renamed from: a */
    private static final String f36781a = "fb";

    /* renamed from: b */
    private static String[] f36782b = null;

    /* renamed from: c */
    private static String[] f36783c = null;

    /* renamed from: d */
    private static boolean f36784d = true;

    /* renamed from: e */
    private static Method f36785e;

    /* renamed from: f */
    private static Method f36786f;

    /* renamed from: g */
    private static Method f36787g;

    static {
        Class<String> cls = String.class;
        try {
            Method declaredMethod = TrafficStats.class.getDeclaredMethod("getRxBytes", new Class[]{cls});
            f36785e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            C9632x2.m50512b(th);
        }
        try {
            Method declaredMethod2 = TrafficStats.class.getDeclaredMethod("getTxBytes", new Class[]{cls});
            f36786f = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable th2) {
            C9632x2.m50512b(th2);
        }
        try {
            Method declaredMethod3 = TrafficStats.class.getDeclaredMethod("getMobileIfaces", new Class[0]);
            f36787g = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (Throwable th3) {
            C9632x2.m50512b(th3);
        }
    }

    /* renamed from: a */
    private static void m48586a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement != null && nextElement.getName().startsWith("eth")) {
                        String[] strArr = f36782b;
                        if (strArr != null && strArr.length > 0) {
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                if (nextElement.getName().equals(strArr[i])) {
                                    break;
                                }
                                i++;
                            }
                        }
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        boolean z = false;
                        if (inetAddresses != null) {
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress nextElement2 = inetAddresses.nextElement();
                                if (nextElement2 != null && nextElement2.isLinkLocalAddress() && !nextElement2.isLoopbackAddress()) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(C9135ma.m48968a(nextElement.getName()));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        } finally {
            f36783c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f36784d = false;
        }
    }

    /* renamed from: b */
    public static synchronized long m48587b() {
        long j;
        String[] strArr;
        synchronized (C8954fb.class) {
            j = 0;
            if (f36784d && ((strArr = f36783c) == null || strArr.length <= 0)) {
                m48586a();
            }
            String[] strArr2 = f36783c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String a : strArr2) {
                    long a2 = m48585a(a);
                    if (a2 > -1) {
                        j += a2;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    public static synchronized long m48589c() {
        long j;
        String[] strArr;
        synchronized (C8954fb.class) {
            j = 0;
            if (f36784d && ((strArr = f36783c) == null || strArr.length <= 0)) {
                m48586a();
            }
            String[] strArr2 = f36783c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String b : strArr2) {
                    long b2 = m48588b(b);
                    if (b2 > -1) {
                        j += b2;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: d */
    private static void m48591d() {
        Method method = f36787g;
        if (method != null) {
            try {
                String[] strArr = (String[]) method.invoke((Object) null, new Object[0]);
                if (strArr != null) {
                    f36782b = strArr;
                }
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
    }

    /* renamed from: e */
    public static synchronized long m48592e() {
        long j;
        synchronized (C8954fb.class) {
            try {
                j = TrafficStats.getMobileRxBytes();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
                j = 0;
            }
            if (j <= 0) {
                String[] strArr = f36782b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c = m48590c("/sys/class/net/" + str + "/statistics/rx_bytes");
                        if (c > -1) {
                            j += c;
                        }
                    }
                }
            } else if (f36782b == null) {
                m48591d();
            }
        }
        return j;
    }

    /* renamed from: f */
    public static synchronized long m48593f() {
        long j;
        synchronized (C8954fb.class) {
            try {
                j = TrafficStats.getMobileTxBytes();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
                j = 0;
            }
            if (j <= 0) {
                String[] strArr = f36782b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c = m48590c("/sys/class/net/" + str + "/statistics/tx_bytes");
                        if (c > -1) {
                            j += c;
                        }
                    }
                }
            } else if (f36782b == null) {
                m48591d();
            }
        }
        return j;
    }

    /* renamed from: g */
    public static synchronized long m48594g() {
        long totalRxBytes;
        synchronized (C8954fb.class) {
            totalRxBytes = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
        }
        return totalRxBytes;
    }

    /* renamed from: h */
    public static synchronized long m48595h() {
        long totalTxBytes;
        synchronized (C8954fb.class) {
            totalTxBytes = TrafficStats.getTotalTxBytes() - TrafficStats.getMobileTxBytes();
        }
        return totalTxBytes;
    }

    /* renamed from: b */
    public static long m48588b(String str) {
        Method method = f36786f;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return m48590c("/sys/class/net/" + str + "/statistics/tx_bytes");
    }

    /* renamed from: c */
    private static long m48590c(String str) {
        String[] a = C9622w9.m50493a(str);
        if (a.length > 0) {
            return Long.parseLong(a[0]);
        }
        return -1;
    }

    /* renamed from: a */
    public static long m48585a(String str) {
        Method method = f36785e;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return m48590c("/sys/class/net/" + str + "/statistics/rx_bytes");
    }
}
