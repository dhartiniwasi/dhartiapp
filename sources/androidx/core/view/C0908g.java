package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.g */
/* compiled from: LayoutInflaterCompat */
public final class C0908g {

    /* renamed from: a */
    private static Field f2558a;

    /* renamed from: b */
    private static boolean f2559b;

    /* renamed from: a */
    private static void m4109a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2559b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2558a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f2559b = true;
        }
        Field field = f2558a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m4110b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m4109a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m4109a(layoutInflater, factory2);
            }
        }
    }
}
