package androidx.lifecycle;

import android.app.Application;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: androidx.lifecycle.e0 */
/* compiled from: SavedStateViewModelFactory.kt */
public final class C1189e0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List<Class<?>> f3303a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<Class<?>> f3304b;

    static {
        Class<C1240z> cls = C1240z.class;
        f3303a = C10522j.m52970f(Application.class, cls);
        f3304b = C10521i.m52966b(cls);
    }

    /* renamed from: c */
    public static final <T> Constructor<T> m5382c(Class<T> cls, List<? extends Class<?>> list) {
        C11669k.m56787e(cls, "modelClass");
        C11669k.m56787e(list, InAppPurchaseMetaData.KEY_SIGNATURE);
        Constructor<T>[] constructors = cls.getConstructors();
        C11669k.m56786d(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C11669k.m56786d(parameterTypes, "constructor.parameterTypes");
            List o = C10515f.m52939o(parameterTypes);
            if (C11669k.m56783a(list, o)) {
                return constructor;
            }
            if (list.size() != o.size() || !o.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends C1194g0> T m5383d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        C11669k.m56787e(cls, "modelClass");
        C11669k.m56787e(constructor, "constructor");
        C11669k.m56787e(objArr, "params");
        try {
            return (C1194g0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
