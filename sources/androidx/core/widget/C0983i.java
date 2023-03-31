package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.i */
/* compiled from: PopupWindowCompat */
public final class C0983i {

    /* renamed from: a */
    private static Method f2697a;

    /* renamed from: b */
    private static boolean f2698b;

    /* renamed from: c */
    private static Field f2699c;

    /* renamed from: d */
    private static boolean f2700d;

    /* renamed from: androidx.core.widget.i$a */
    /* compiled from: PopupWindowCompat */
    static class C0984a {
        /* renamed from: a */
        static void m4447a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.i$b */
    /* compiled from: PopupWindowCompat */
    static class C0985b {
        /* renamed from: a */
        static boolean m4448a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m4449b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m4450c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m4451d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m4444a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C0985b.m4450c(popupWindow, z);
        } else if (i >= 21) {
            if (!f2700d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2699c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2700d = true;
            }
            Field field = f2699c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m4445b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0985b.m4451d(popupWindow, i);
            return;
        }
        if (!f2698b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2697a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2698b = true;
        }
        Method method = f2697a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m4446c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0984a.m4447a(popupWindow, view, i, i2, i3);
            return;
        }
        if ((C0901e.m4084b(i3, C0835a0.m3682B(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
