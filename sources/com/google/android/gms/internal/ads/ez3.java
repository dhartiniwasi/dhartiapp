package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ez3 {
    /* renamed from: a */
    static String m12372a(cz3 cz3, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m12375d(cz3, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m12373b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m12373b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m12373b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(l04.m15765a(jw3.m15088M((String) obj)));
                sb.append('\"');
            } else if (obj instanceof jw3) {
                sb.append(": \"");
                sb.append(l04.m15765a((jw3) obj));
                sb.append('\"');
            } else if (obj instanceof sx3) {
                sb.append(" {");
                m12375d((sx3) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m12373b(sb, i4, "key", entry.getKey());
                m12373b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m12374c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m12375d(cz3 cz3, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : cz3.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m12373b(sb, i, m12374c(concat), sx3.m20715z(method2, cz3, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m12373b(sb, i, m12374c(concat2), sx3.m20715z(method3, cz3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object z2 = sx3.m20715z(method4, cz3, new Object[0]);
                    if (method5 == null) {
                        if (z2 instanceof Boolean) {
                            if (!((Boolean) z2).booleanValue()) {
                            }
                        } else if (z2 instanceof Integer) {
                            if (((Integer) z2).intValue() == 0) {
                            }
                        } else if (z2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) z2).floatValue()) == 0) {
                            }
                        } else if (!(z2 instanceof Double)) {
                            if (z2 instanceof String) {
                                z = z2.equals("");
                            } else if (z2 instanceof jw3) {
                                z = z2.equals(jw3.f11808b);
                            } else if (z2 instanceof cz3) {
                                if (z2 == ((cz3) z2).mo9745c()) {
                                }
                            } else if ((z2 instanceof Enum) && ((Enum) z2).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) z2).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) sx3.m20715z(method5, cz3, new Object[0])).booleanValue()) {
                    }
                    m12373b(sb, i, m12374c(concat3), z2);
                }
            }
        }
        if (!(cz3 instanceof qx3)) {
            o04 o04 = ((sx3) cz3).zzc;
            if (o04 != null) {
                o04.mo12784g(sb, i);
                return;
            }
            return;
        }
        qx3 qx3 = (qx3) cz3;
        throw null;
    }
}
