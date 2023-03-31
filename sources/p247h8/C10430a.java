package p247h8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h8.a */
/* compiled from: ApiUtil */
public class C10430a {
    /* renamed from: a */
    static Object m52641a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    public static AssertionError m52642b(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str);
        assertionError.initCause(th);
        return assertionError;
    }
}
