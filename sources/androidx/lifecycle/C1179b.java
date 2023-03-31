package androidx.lifecycle;

import androidx.lifecycle.C1208j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* compiled from: ClassesInfoCache */
final class C1179b {

    /* renamed from: c */
    static C1179b f3285c = new C1179b();

    /* renamed from: a */
    private final Map<Class<?>, C1180a> f3286a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3287b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* compiled from: ClassesInfoCache */
    static class C1180a {

        /* renamed from: a */
        final Map<C1208j.C1210b, List<C1181b>> f3288a = new HashMap();

        /* renamed from: b */
        final Map<C1181b, C1208j.C1210b> f3289b;

        C1180a(Map<C1181b, C1208j.C1210b> map) {
            this.f3289b = map;
            for (Map.Entry next : map.entrySet()) {
                C1208j.C1210b bVar = (C1208j.C1210b) next.getValue();
                List list = this.f3288a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3288a.put(bVar, list);
                }
                list.add((C1181b) next.getKey());
            }
        }

        /* renamed from: b */
        private static void m5362b(List<C1181b> list, C1220n nVar, C1208j.C1210b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo4368a(nVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4367a(C1220n nVar, C1208j.C1210b bVar, Object obj) {
            m5362b(this.f3288a.get(bVar), nVar, bVar, obj);
            m5362b(this.f3288a.get(C1208j.C1210b.ON_ANY), nVar, bVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* compiled from: ClassesInfoCache */
    static final class C1181b {

        /* renamed from: a */
        final int f3290a;

        /* renamed from: b */
        final Method f3291b;

        C1181b(int i, Method method) {
            this.f3290a = i;
            this.f3291b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4368a(C1220n nVar, C1208j.C1210b bVar, Object obj) {
            try {
                int i = this.f3290a;
                if (i == 0) {
                    this.f3291b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3291b.invoke(obj, new Object[]{nVar});
                } else if (i == 2) {
                    this.f3291b.invoke(obj, new Object[]{nVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1181b)) {
                return false;
            }
            C1181b bVar = (C1181b) obj;
            if (this.f3290a != bVar.f3290a || !this.f3291b.getName().equals(bVar.f3291b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3290a * 31) + this.f3291b.getName().hashCode();
        }
    }

    C1179b() {
    }

    /* renamed from: a */
    private C1180a m5357a(Class<?> cls, Method[] methodArr) {
        int i;
        C1180a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo4365c(superclass)) == null)) {
            hashMap.putAll(c.f3289b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo4365c(c2).f3289b.entrySet()) {
                m5359e(hashMap, (C1181b) next.getKey(), (C1208j.C1210b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m5358b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1230v vVar = (C1230v) method.getAnnotation(C1230v.class);
            if (vVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1220n.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1208j.C1210b value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1208j.C1210b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1208j.C1210b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m5359e(hashMap, new C1181b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1180a aVar = new C1180a(hashMap);
        this.f3286a.put(cls, aVar);
        this.f3287b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m5358b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m5359e(Map<C1181b, C1208j.C1210b> map, C1181b bVar, C1208j.C1210b bVar2, Class<?> cls) {
        C1208j.C1210b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f3291b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1180a mo4365c(Class<?> cls) {
        C1180a aVar = this.f3286a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m5357a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4366d(Class<?> cls) {
        Boolean bool = this.f3287b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m5358b(cls);
        for (Method annotation : b) {
            if (((C1230v) annotation.getAnnotation(C1230v.class)) != null) {
                m5357a(cls, b);
                return true;
            }
        }
        this.f3287b.put(cls, Boolean.FALSE);
        return false;
    }
}
