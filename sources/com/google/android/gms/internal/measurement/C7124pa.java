package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.pa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7124pa {

    /* renamed from: a */
    private static final char[] f31948a;

    static {
        char[] cArr = new char[80];
        f31948a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m40599a(C7092na naVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m40602d(naVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m40600b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m40600b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m40600b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m40601c(i, sb);
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
                sb.append(C7109ob.m40537a(C6977g8.m40062t((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C6977g8) {
                sb.append(": \"");
                sb.append(C7109ob.m40537a((C6977g8) obj));
                sb.append('\"');
            } else if (obj instanceof C6995h9) {
                sb.append(" {");
                m40602d((C6995h9) obj, sb, i + 2);
                sb.append("\n");
                m40601c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m40600b(sb, i3, "key", entry.getKey());
                m40600b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m40601c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m40601c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f31948a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m40602d(C7092na naVar, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C7092na naVar2 = naVar;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = naVar.getClass().getDeclaredMethods();
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
                m40600b(sb2, i3, substring.substring(0, substring.length() - 4), C6995h9.m40159p(method2, naVar2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m40600b(sb2, i3, substring.substring(0, substring.length() - 3), C6995h9.m40159p(method, naVar2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object p = C6995h9.m40159p(method4, naVar2, new Object[0]);
                    if (method5 == null) {
                        if (p instanceof Boolean) {
                            if (!((Boolean) p).booleanValue()) {
                            }
                        } else if (p instanceof Integer) {
                            if (((Integer) p).intValue() == 0) {
                            }
                        } else if (p instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) p).floatValue()) == 0) {
                            }
                        } else if (!(p instanceof Double)) {
                            if (p instanceof String) {
                                z = p.equals("");
                            } else if (p instanceof C6977g8) {
                                z = p.equals(C6977g8.f31702b);
                            } else if (p instanceof C7092na) {
                                if (p == ((C7092na) p).mo23489e()) {
                                }
                            } else if ((p instanceof Enum) && ((Enum) p).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) p).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C6995h9.m40159p(method5, naVar2, new Object[0])).booleanValue()) {
                    }
                    m40600b(sb2, i3, substring, p);
                }
            }
            i2 = 3;
        }
        if (!(naVar2 instanceof C6961f9)) {
            C7157rb rbVar = ((C6995h9) naVar2).zzc;
            if (rbVar != null) {
                rbVar.mo23826i(sb2, i3);
                return;
            }
            return;
        }
        C6961f9 f9Var = (C6961f9) naVar2;
        throw null;
    }
}
