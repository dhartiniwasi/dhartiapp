package p264io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p210d7.C9874c;

/* renamed from: io.grpc.internal.b1 */
/* compiled from: JsonUtil */
public class C11135b1 {

    /* renamed from: a */
    private static final long f42962a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List<Map<String, ?>> m55108a(List<?> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<String> m55109b(List<?> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    /* renamed from: c */
    private static boolean m55110c(long j, int i) {
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = (long) i;
            if (j2 >= -999999999 && j2 < f42962a) {
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i2 < 0 || i < 0) {
                    return i2 <= 0 && i <= 0;
                }
                return true;
            }
        }
    }

    /* renamed from: d */
    public static Boolean m55111d(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[]{obj, str, map}));
    }

    /* renamed from: e */
    public static List<?> m55112e(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[]{obj, str, map}));
    }

    /* renamed from: f */
    public static List<Map<String, ?>> m55113f(Map<String, ?> map, String str) {
        List<?> e = m55112e(map, str);
        if (e == null) {
            return null;
        }
        return m55108a(e);
    }

    /* renamed from: g */
    public static List<String> m55114g(Map<String, ?> map, String str) {
        List<?> e = m55112e(map, str);
        if (e == null) {
            return null;
        }
        return m55109b(e);
    }

    /* renamed from: h */
    public static Double m55115h(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", new Object[]{obj, str}));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map}));
        }
    }

    /* renamed from: i */
    public static Integer m55116i(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d = (Double) obj;
            int intValue = d.intValue();
            if (((double) intValue) == d.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d);
        } else if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[]{obj, str}));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[]{obj, str}));
        }
    }

    /* renamed from: j */
    public static Map<String, ?> m55117j(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[]{obj, str, map}));
    }

    /* renamed from: k */
    public static String m55118k(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[]{obj, str, map}));
    }

    /* renamed from: l */
    public static Long m55119l(Map<String, ?> map, String str) {
        String k = m55118k(map, str);
        if (k == null) {
            return null;
        }
        try {
            return Long.valueOf(m55121n(k));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static long m55120m(long j, int i) {
        long j2 = (long) i;
        long j3 = f42962a;
        if (j2 <= (-j3) || j2 >= j3) {
            j = C9874c.m50645a(j, j2 / j3);
            i = (int) (j2 % j3);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + j3);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - j3);
            j++;
        }
        if (m55110c(j, i)) {
            return m55123p(TimeUnit.SECONDS.toNanos(j), (long) i);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
    }

    /* renamed from: n */
    private static long m55121n(String str) throws ParseException {
        boolean z;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        int o = str2.isEmpty() ? 0 : m55122o(str2);
        if (parseLong >= 0) {
            if (z) {
                parseLong = -parseLong;
                o = -o;
            }
            try {
                return m55120m(parseLong, o);
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } else {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
    }

    /* renamed from: o */
    private static int m55122o(String str) throws ParseException {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i += str.charAt(i2) - '0';
            }
        }
        return i;
    }

    /* renamed from: p */
    private static long m55123p(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        return z2 | z ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
