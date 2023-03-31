package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
/* compiled from: Lifecycling */
public class C1226r {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3350a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C1193g>>> f3351b = new HashMap();

    /* renamed from: a */
    private static C1193g m5455a(Constructor<? extends C1193g> constructor, Object obj) {
        try {
            return (C1193g) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C1193g> m5456b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m5457c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m5457c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m5458d(Class<?> cls) {
        Integer num = f3350a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m5461g(cls);
        f3350a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m5459e(Class<?> cls) {
        return cls != null && C1218m.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C1216l m5460f(Object obj) {
        boolean z = obj instanceof C1216l;
        boolean z2 = obj instanceof C1190f;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1190f) obj, (C1216l) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1190f) obj, (C1216l) null);
        }
        if (z) {
            return (C1216l) obj;
        }
        Class<?> cls = obj.getClass();
        if (m5458d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3351b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m5455a((Constructor) list.get(0), obj));
        }
        C1193g[] gVarArr = new C1193g[list.size()];
        for (int i = 0; i < list.size(); i++) {
            gVarArr[i] = m5455a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(gVarArr);
    }

    /* renamed from: g */
    private static int m5461g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C1193g> b = m5456b(cls);
        if (b != null) {
            f3351b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C1179b.f3285c.mo4366d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m5459e(superclass)) {
                if (m5458d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3351b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m5459e(cls2)) {
                    if (m5458d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3351b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3351b.put(cls, arrayList);
            return 2;
        }
    }
}
