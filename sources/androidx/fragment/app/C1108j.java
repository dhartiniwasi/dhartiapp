package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p124r.C5426g;

/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentFactory */
public class C1108j {

    /* renamed from: a */
    private static final C5426g<ClassLoader, C5426g<String, Class<?>>> f3032a = new C5426g<>();

    /* renamed from: b */
    static boolean m4968b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4969c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4969c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C5426g<ClassLoader, C5426g<String, Class<?>>> gVar = f3032a;
        C5426g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new C5426g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4970d(ClassLoader classLoader, String str) {
        try {
            return m4969c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C1054f("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C1054f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo4064a(ClassLoader classLoader, String str) {
        throw null;
    }
}
