package com.startapp;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.k5 */
/* compiled from: Sta */
public class C9065k5 {
    /* renamed from: a */
    public static <T> T m48755a(String str, Class<T> cls) {
        try {
            return C9024i5.m48685a(cls, new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m48756b(Object obj) {
        if (obj == null) {
            return null;
        }
        Class cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && !Object.class.equals(cls)) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        String a = C9112l5.m48943a(field);
                        if (C9112l5.m48944b(field)) {
                            jSONObject.put(a, m48756b(field.get(obj)));
                        } else {
                            if (List.class.isAssignableFrom(field.getType())) {
                                JSONArray jSONArray = new JSONArray();
                                for (Object a2 : (List) field.get(obj)) {
                                    jSONArray.put(m48754a(a2));
                                }
                                jSONObject.put(a, jSONArray);
                            } else {
                                if (Set.class.isAssignableFrom(field.getType())) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (Object a3 : (Set) field.get(obj)) {
                                        jSONArray2.put(m48754a(a3));
                                    }
                                    jSONObject.put(a, jSONArray2);
                                } else {
                                    if (Map.class.isAssignableFrom(field.getType())) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        for (Map.Entry entry : ((Map) field.get(obj)).entrySet()) {
                                            jSONObject2.put(entry.getKey().toString(), m48754a(entry.getValue()));
                                        }
                                        jSONObject.put(a, jSONObject2);
                                    } else {
                                        jSONObject.put(a, field.get(obj));
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Object m48754a(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class) || cls.equals(String.class)) {
            return obj;
        }
        return m48756b(obj);
    }
}
