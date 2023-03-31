package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.j */
/* compiled from: TypefaceCompatApi28Impl */
public class C0749j extends C0748i {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Typeface mo3124m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2314g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2320m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Method mo3128y(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
