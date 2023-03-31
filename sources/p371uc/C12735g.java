package p371uc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: uc.g */
/* compiled from: OptionalMethod */
public class C12735g<T> {

    /* renamed from: a */
    private final Class<?> f46653a;

    /* renamed from: b */
    private final String f46654b;

    /* renamed from: c */
    private final Class[] f46655c;

    public C12735g(Class<?> cls, String str, Class... clsArr) {
        this.f46653a = cls;
        this.f46654b = str;
        this.f46655c = clsArr;
    }

    /* renamed from: a */
    private Method m60392a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f46654b;
        if (str == null) {
            return null;
        }
        Method b = m60393b(cls, str, this.f46655c);
        if (b == null || (cls2 = this.f46653a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m60393b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m60393b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo37653c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m60392a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f46654b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo37654d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m60392a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo37655e(T t, Object... objArr) {
        try {
            return mo37654d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo37656f(T t, Object... objArr) {
        try {
            return mo37653c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo37657g(T t) {
        return m60392a(t.getClass()) != null;
    }
}
