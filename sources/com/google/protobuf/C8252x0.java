package com.google.protobuf;

import com.google.protobuf.C8260z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.x0 */
/* compiled from: MessageLiteToString */
final class C8252x0 {

    /* renamed from: a */
    private static final char[] f35167a;

    static {
        char[] cArr = new char[80];
        f35167a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    private static void m45748a(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = f35167a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    /* renamed from: b */
    private static boolean m45749b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof C8153i) {
                return obj.equals(C8153i.f34908b);
            }
            if (obj instanceof C8243v0) {
                if (obj == ((C8243v0) obj).mo27346a()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: c */
    private static String m45750c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    static void m45751d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d : (List) obj) {
                m45751d(sb, i, str, d);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d2 : ((Map) obj).entrySet()) {
                m45751d(sb, i, str, d2);
            }
        } else {
            sb.append(10);
            m45748a(i, sb);
            sb.append(m45750c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C8229s1.m45626c((String) obj));
                sb.append('\"');
            } else if (obj instanceof C8153i) {
                sb.append(": \"");
                sb.append(C8229s1.m45624a((C8153i) obj));
                sb.append('\"');
            } else if (obj instanceof C8260z) {
                sb.append(" {");
                m45752e((C8260z) obj, sb, i + 2);
                sb.append("\n");
                m45748a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i2 = i + 2;
                m45751d(sb, i2, "key", entry.getKey());
                m45751d(sb, i2, "value", entry.getValue());
                sb.append("\n");
                m45748a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: e */
    private static void m45752e(C8243v0 v0Var, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C8243v0 v0Var2 = v0Var;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m45751d(sb2, i3, substring.substring(0, substring.length() - 4), C8260z.m45888H(method2, v0Var2, new Object[0]));
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object H = C8260z.m45888H(method4, v0Var2, new Object[0]);
                        if (method5 == null) {
                            z = !m45749b(H);
                        } else {
                            z = ((Boolean) C8260z.m45888H(method5, v0Var2, new Object[0])).booleanValue();
                        }
                        if (z) {
                            m45751d(sb2, i3, substring, H);
                        }
                    }
                }
            } else {
                m45751d(sb2, i3, substring.substring(0, substring.length() - 3), C8260z.m45888H(method, v0Var2, new Object[0]));
            }
            i2 = 3;
        }
        if (v0Var2 instanceof C8260z.C8263c) {
            Iterator<Map.Entry<C8260z.C8264d, Object>> t = ((C8260z.C8263c) v0Var2).extensions.mo27307t();
            while (t.hasNext()) {
                Map.Entry next = t.next();
                m45751d(sb2, i3, "[" + ((C8260z.C8264d) next.getKey()).mo27311f() + "]", next.getValue());
            }
        }
        C8250w1 w1Var = ((C8260z) v0Var2).unknownFields;
        if (w1Var != null) {
            w1Var.mo27355m(sb2, i3);
        }
    }

    /* renamed from: f */
    static String m45753f(C8243v0 v0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m45752e(v0Var, sb, 0);
        return sb.toString();
    }
}
