package com.google.android.gms.internal.p026firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3657q3 {

    /* renamed from: a */
    private static final char[] f22540a;

    static {
        char[] cArr = new char[80];
        f22540a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m26538a(C3591o3 o3Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m26541d(o3Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m26539b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m26539b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m26539b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m26540c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C3658q4.m26542a(C3325g1.m25615w((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C3325g1) {
                sb.append(": \"");
                sb.append(C3658q4.m26542a((C3325g1) obj));
                sb.append('\"');
            } else if (obj instanceof C3425j2) {
                sb.append(" {");
                m26541d((C3425j2) obj, sb, i + 2);
                sb.append("\n");
                m26540c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m26539b(sb, i3, "key", entry.getKey());
                m26539b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m26540c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m26540c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f22540a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m26541d(C3591o3 o3Var, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C3591o3 o3Var2 = o3Var;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o3Var.getClass().getDeclaredMethods();
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
                m26539b(sb2, i3, substring.substring(0, substring.length() - 4), C3425j2.m25860e(method2, o3Var2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m26539b(sb2, i3, substring.substring(0, substring.length() - 3), C3425j2.m25860e(method, o3Var2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e = C3425j2.m25860e(method4, o3Var2, new Object[0]);
                    if (method5 == null) {
                        if (e instanceof Boolean) {
                            if (!((Boolean) e).booleanValue()) {
                            }
                        } else if (e instanceof Integer) {
                            if (((Integer) e).intValue() == 0) {
                            }
                        } else if (e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) e).floatValue()) == 0) {
                            }
                        } else if (!(e instanceof Double)) {
                            if (e instanceof String) {
                                z = e.equals("");
                            } else if (e instanceof C3325g1) {
                                z = e.equals(C3325g1.f22056b);
                            } else if (e instanceof C3591o3) {
                                if (e == ((C3591o3) e).mo16198I()) {
                                }
                            } else if ((e instanceof Enum) && ((Enum) e).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) e).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C3425j2.m25860e(method5, o3Var2, new Object[0])).booleanValue()) {
                    }
                    m26539b(sb2, i3, substring, e);
                }
            }
            i2 = 3;
        }
        if (!(o3Var2 instanceof C3359h2)) {
            C3757t4 t4Var = ((C3425j2) o3Var2).zzc;
            if (t4Var != null) {
                t4Var.mo16803i(sb2, i3);
                return;
            }
            return;
        }
        C3359h2 h2Var = (C3359h2) o3Var2;
        throw null;
    }
}
