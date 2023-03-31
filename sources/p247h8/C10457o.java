package p247h8;

import android.net.Uri;
import com.google.firebase.firestore.C7900c0;
import com.google.firebase.firestore.C7903e;
import com.google.firebase.firestore.C7912h;
import com.google.firebase.firestore.C7920k0;
import com.google.firebase.firestore.C7921l;
import com.google.firebase.firestore.C7928o;
import com.google.firebase.firestore.C7934q;
import com.google.firebase.firestore.C7945r0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p246h7.C10428q;

/* renamed from: h8.o */
/* compiled from: CustomClassMapper */
public class C10457o {

    /* renamed from: a */
    private static final ConcurrentMap<Class<?>, C10458a<?>> f41422a = new ConcurrentHashMap();

    /* renamed from: h8.o$a */
    /* compiled from: CustomClassMapper */
    private static class C10458a<T> {

        /* renamed from: a */
        private final Class<T> f41423a;

        /* renamed from: b */
        private final Constructor<T> f41424b;

        /* renamed from: c */
        private final boolean f41425c;

        /* renamed from: d */
        private final boolean f41426d;

        /* renamed from: e */
        private final Map<String, String> f41427e = new HashMap();

        /* renamed from: f */
        private final Map<String, Method> f41428f = new HashMap();

        /* renamed from: g */
        private final Map<String, Method> f41429g = new HashMap();

        /* renamed from: h */
        private final Map<String, Field> f41430h = new HashMap();

        /* renamed from: i */
        private final HashSet<String> f41431i = new HashSet<>();

        /* renamed from: j */
        private final HashSet<String> f41432j = new HashSet<>();

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C10458a(java.lang.Class<T> r11) {
            /*
                r10 = this;
                r10.<init>()
                r10.f41423a = r11
                java.lang.Class<com.google.firebase.firestore.v0> r0 = com.google.firebase.firestore.C7953v0.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r10.f41425c = r0
                java.lang.Class<com.google.firebase.firestore.d0> r0 = com.google.firebase.firestore.C7902d0.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r1 = 1
                r0 = r0 ^ r1
                r10.f41426d = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f41427e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f41429g = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f41428f = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f41430h = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f41431i = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f41432j = r0
                r0 = 0
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004c }
                java.lang.reflect.Constructor r2 = r11.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x004c }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x004c }
                goto L_0x004d
            L_0x004c:
                r2 = 0
            L_0x004d:
                r10.f41424b = r2
                java.lang.reflect.Method[] r2 = r11.getMethods()
                int r3 = r2.length
                r4 = 0
            L_0x0055:
                if (r4 >= r3) goto L_0x00a4
                r5 = r2[r4]
                boolean r6 = m52750n(r5)
                if (r6 == 0) goto L_0x00a1
                java.lang.String r6 = m52747j(r5)
                r10.m52739b(r6)
                r5.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = r10.f41428f
                boolean r7 = r7.containsKey(r6)
                if (r7 != 0) goto L_0x007a
                java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = r10.f41428f
                r7.put(r6, r5)
                r10.m52742e(r5)
                goto L_0x00a1
            L_0x007a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Found conflicting getters for name "
                r1.append(r2)
                java.lang.String r2 = r5.getName()
                r1.append(r2)
                java.lang.String r2 = " on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x00a1:
                int r4 = r4 + 1
                goto L_0x0055
            L_0x00a4:
                java.lang.reflect.Field[] r2 = r11.getFields()
                int r3 = r2.length
                r4 = 0
            L_0x00aa:
                if (r4 >= r3) goto L_0x00c1
                r5 = r2[r4]
                boolean r6 = m52749m(r5)
                if (r6 == 0) goto L_0x00be
                java.lang.String r6 = m52746i(r5)
                r10.m52739b(r6)
                r10.m52741d(r5)
            L_0x00be:
                int r4 = r4 + 1
                goto L_0x00aa
            L_0x00c1:
                r2 = r11
            L_0x00c2:
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                int r4 = r3.length
                r5 = 0
            L_0x00c8:
                if (r5 >= r4) goto L_0x0199
                r6 = r3[r5]
                boolean r7 = m52751o(r6)
                if (r7 == 0) goto L_0x0195
                java.lang.String r7 = m52747j(r6)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f41427e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x0195
                boolean r8 = r8.equals(r7)
                if (r8 == 0) goto L_0x016e
                java.util.Map<java.lang.String, java.lang.reflect.Method> r8 = r10.f41429g
                java.lang.Object r8 = r8.get(r7)
                java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
                if (r8 != 0) goto L_0x0103
                r6.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Method> r8 = r10.f41429g
                r8.put(r7, r6)
                r10.m52743f(r6)
                goto L_0x0195
            L_0x0103:
                boolean r7 = m52745h(r6, r8)
                if (r7 != 0) goto L_0x0195
                if (r2 != r11) goto L_0x0132
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = " has multiple setter overloads with name "
                r1.append(r11)
                java.lang.String r11 = r6.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x0132:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found conflicting setters with name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r1 = " (conflicts with "
                r0.append(r1)
                java.lang.String r1 = r8.getName()
                r0.append(r1)
                java.lang.String r1 = " defined on "
                r0.append(r1)
                java.lang.Class r1 = r8.getDeclaringClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x016e:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found setter on "
                r0.append(r1)
                java.lang.String r1 = r2.getName()
                r0.append(r1)
                java.lang.String r1 = " with invalid case-sensitive name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x0195:
                int r5 = r5 + 1
                goto L_0x00c8
            L_0x0199:
                java.lang.reflect.Field[] r3 = r2.getDeclaredFields()
                int r4 = r3.length
                r5 = 0
            L_0x019f:
                if (r5 >= r4) goto L_0x01cb
                r6 = r3[r5]
                java.lang.String r7 = m52746i(r6)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f41427e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                boolean r8 = r8.containsKey(r9)
                if (r8 == 0) goto L_0x01c8
                java.util.Map<java.lang.String, java.lang.reflect.Field> r8 = r10.f41430h
                boolean r8 = r8.containsKey(r7)
                if (r8 != 0) goto L_0x01c8
                r6.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Field> r8 = r10.f41430h
                r8.put(r7, r6)
                r10.m52741d(r6)
            L_0x01c8:
                int r5 = r5 + 1
                goto L_0x019f
            L_0x01cb:
                java.lang.Class r2 = r2.getSuperclass()
                if (r2 == 0) goto L_0x01d9
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                boolean r3 = r2.equals(r3)
                if (r3 == 0) goto L_0x00c2
            L_0x01d9:
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.f41427e
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x022d
                java.util.HashSet<java.lang.String> r0 = r10.f41432j
                java.util.Iterator r0 = r0.iterator()
            L_0x01e7:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x022c
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map<java.lang.String, java.lang.reflect.Method> r2 = r10.f41429g
                boolean r2 = r2.containsKey(r1)
                if (r2 != 0) goto L_0x01e7
                java.util.Map<java.lang.String, java.lang.reflect.Field> r2 = r10.f41430h
                boolean r2 = r2.containsKey(r1)
                if (r2 == 0) goto L_0x0204
                goto L_0x01e7
            L_0x0204:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "@DocumentId is annotated on property "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " of class "
                r2.append(r1)
                java.lang.String r11 = r11.getName()
                r2.append(r11)
                java.lang.String r11 = " but no field or public setter was found"
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                r0.<init>(r11)
                throw r0
            L_0x022c:
                return
            L_0x022d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No properties to serialize found on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p247h8.C10457o.C10458a.<init>(java.lang.Class):void");
        }

        /* renamed from: b */
        private void m52739b(String str) {
            Map<String, String> map = this.f41427e;
            Locale locale = Locale.US;
            String put = map.put(str.toLowerCase(locale), str);
            if (put != null && !str.equals(put)) {
                throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
            }
        }

        /* renamed from: c */
        private static String m52740c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(C7920k0.class)) {
                return ((C7920k0) accessibleObject.getAnnotation(C7920k0.class)).value();
            }
            return null;
        }

        /* renamed from: d */
        private void m52741d(Field field) {
            if (field.isAnnotationPresent(C7945r0.class)) {
                Class<?> type = field.getType();
                if (type == Date.class || type == C10428q.class) {
                    this.f41431i.add(m52746i(field));
                } else {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
            }
            if (field.isAnnotationPresent(C7912h.class)) {
                m52744g("Field", "is", field.getType());
                this.f41432j.add(m52746i(field));
            }
        }

        /* renamed from: e */
        private void m52742e(Method method) {
            if (method.isAnnotationPresent(C7945r0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType == Date.class || returnType == C10428q.class) {
                    this.f41431i.add(m52747j(method));
                } else {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
            }
            if (method.isAnnotationPresent(C7912h.class)) {
                m52744g("Method", "returns", method.getReturnType());
                this.f41432j.add(m52747j(method));
            }
        }

        /* renamed from: f */
        private void m52743f(Method method) {
            if (method.isAnnotationPresent(C7945r0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            } else if (method.isAnnotationPresent(C7912h.class)) {
                m52744g("Method", "accepts", method.getParameterTypes()[0]);
                this.f41432j.add(m52747j(method));
            }
        }

        /* renamed from: g */
        private void m52744g(String str, String str2, Type type) {
            if (type != String.class && type != C7921l.class) {
                throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
            }
        }

        /* renamed from: h */
        private static boolean m52745h(Method method, Method method2) {
            C10457o.m52733d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            C10457o.m52733d(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            C10457o.m52733d(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class[] parameterTypes = method.getParameterTypes();
            Class[] parameterTypes2 = method2.getParameterTypes();
            C10457o.m52733d(parameterTypes.length == 1, "Expected exactly one parameter");
            C10457o.m52733d(parameterTypes2.length == 1, "Expected exactly one parameter");
            if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static String m52746i(Field field) {
            String c = m52740c(field);
            return c != null ? c : field.getName();
        }

        /* renamed from: j */
        private static String m52747j(Method method) {
            String c = m52740c(method);
            return c != null ? c : m52748l(method.getName());
        }

        /* renamed from: l */
        private static String m52748l(String str) {
            String[] strArr = {"get", "set", "is"};
            int i = 0;
            String str2 = null;
            for (int i2 = 0; i2 < 3; i2++) {
                String str3 = strArr[i2];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                while (i < charArray.length && Character.isUpperCase(charArray[i])) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                    i++;
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }

        /* renamed from: m */
        private static boolean m52749m(Field field) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(C7928o.class)) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        private static boolean m52750n(Method method) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(C7928o.class)) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        private static boolean m52751o(Method method) {
            if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(C7928o.class)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public Map<String, Object> mo33541k(T t, C10459b bVar) {
            Object obj;
            Object obj2;
            if (this.f41423a.isAssignableFrom(t.getClass())) {
                HashMap hashMap = new HashMap();
                for (String next : this.f41427e.values()) {
                    if (!this.f41432j.contains(next)) {
                        if (this.f41428f.containsKey(next)) {
                            obj = C10430a.m52641a(this.f41428f.get(next), t, new Object[0]);
                        } else {
                            Field field = this.f41430h.get(next);
                            if (field != null) {
                                try {
                                    obj = field.get(t);
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                }
                            } else {
                                throw new IllegalStateException("Bean property without field or getter: " + next);
                            }
                        }
                        if (!this.f41431i.contains(next) || obj != null) {
                            obj2 = C10457o.m52736g(obj, bVar.mo33542a(next));
                        } else {
                            obj2 = C7934q.m43841g();
                        }
                        hashMap.put(next, obj2);
                    }
                }
                return hashMap;
            }
            throw new IllegalArgumentException("Can't serialize object of class " + t.getClass() + " with BeanMapper for class " + this.f41423a);
        }
    }

    /* renamed from: h8.o$b */
    /* compiled from: CustomClassMapper */
    static class C10459b {

        /* renamed from: d */
        static final C10459b f41433d = new C10459b((C10459b) null, (String) null, 0);

        /* renamed from: a */
        private final int f41434a;

        /* renamed from: b */
        private final C10459b f41435b;

        /* renamed from: c */
        private final String f41436c;

        C10459b(C10459b bVar, String str, int i) {
            this.f41435b = bVar;
            this.f41436c = str;
            this.f41434a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10459b mo33542a(String str) {
            return new C10459b(this, str, this.f41434a + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo33543b() {
            return this.f41434a;
        }

        public String toString() {
            int i = this.f41434a;
            if (i == 0) {
                return "";
            }
            if (i == 1) {
                return this.f41436c;
            }
            return this.f41435b.toString() + "." + this.f41436c;
        }
    }

    /* renamed from: c */
    public static Object m52732c(Object obj) {
        return m52735f(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m52733d(boolean z, String str) {
        if (!z) {
            throw new RuntimeException("Hard assert failed: " + str);
        }
    }

    /* renamed from: e */
    private static <T> C10458a<T> m52734e(Class<T> cls) {
        ConcurrentMap<Class<?>, C10458a<?>> concurrentMap = f41422a;
        C10458a<T> aVar = (C10458a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        C10458a<T> aVar2 = new C10458a<>(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    /* renamed from: f */
    private static <T> Object m52735f(T t) {
        return m52736g(t, C10459b.f41433d);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static <T> Object m52736g(T t, C10459b bVar) {
        if (bVar.mo33543b() > 500) {
            throw m52737h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        } else if (t == null) {
            return null;
        } else {
            if (t instanceof Number) {
                if ((t instanceof Long) || (t instanceof Integer) || (t instanceof Double) || (t instanceof Float)) {
                    return t;
                }
                throw m52737h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", new Object[]{t.getClass().getSimpleName()}));
            } else if ((t instanceof String) || (t instanceof Boolean)) {
                return t;
            } else {
                if (t instanceof Character) {
                    throw m52737h(bVar, "Characters are not supported, please use Strings");
                } else if (t instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t).entrySet()) {
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            String str = (String) key;
                            hashMap.put(str, m52736g(entry.getValue(), bVar.mo33542a(str)));
                        } else {
                            throw m52737h(bVar, "Maps with non-string keys are not supported");
                        }
                    }
                    return hashMap;
                } else if (t instanceof Collection) {
                    if (t instanceof List) {
                        List list = (List) t;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (int i = 0; i < list.size(); i++) {
                            Object obj = list.get(i);
                            arrayList.add(m52736g(obj, bVar.mo33542a("[" + i + "]")));
                        }
                        return arrayList;
                    }
                    throw m52737h(bVar, "Serializing Collections is not supported, please use Lists instead");
                } else if (t.getClass().isArray()) {
                    throw m52737h(bVar, "Serializing Arrays is not supported, please use Lists instead");
                } else if (t instanceof Enum) {
                    String name = ((Enum) t).name();
                    try {
                        return C10458a.m52746i(t.getClass().getField(name));
                    } catch (NoSuchFieldException unused) {
                        return name;
                    }
                } else if ((t instanceof Date) || (t instanceof C10428q) || (t instanceof C7900c0) || (t instanceof C7903e) || (t instanceof C7921l) || (t instanceof C7934q)) {
                    return t;
                } else {
                    if ((t instanceof Uri) || (t instanceof URI) || (t instanceof URL)) {
                        return t.toString();
                    }
                    return m52734e(t.getClass()).mo33541k(t, bVar);
                }
            }
        }
    }

    /* renamed from: h */
    private static IllegalArgumentException m52737h(C10459b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.mo33543b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
