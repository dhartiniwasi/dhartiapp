package p345re;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: re.a */
/* compiled from: BoundaryInterfaceReflectionUtil */
public class C12451a {

    /* renamed from: re.a$a */
    /* compiled from: BoundaryInterfaceReflectionUtil */
    private static class C12452a implements InvocationHandler {

        /* renamed from: a */
        private final Object f45799a;

        public C12452a(Object obj) {
            this.f45799a = obj;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C12451a.m59409d(method, this.f45799a.getClass().getClassLoader()).invoke(this.f45799a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m59406a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C12451a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m59407b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m59410e()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static InvocationHandler m59408c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C12452a(obj);
    }

    /* renamed from: d */
    public static Method m59409d(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /* renamed from: e */
    private static boolean m59410e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
