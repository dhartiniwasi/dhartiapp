package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.l */
/* compiled from: ResourcesFlusher */
class C0319l {

    /* renamed from: a */
    private static Field f850a;

    /* renamed from: b */
    private static boolean f851b;

    /* renamed from: c */
    private static Class<?> f852c;

    /* renamed from: d */
    private static boolean f853d;

    /* renamed from: e */
    private static Field f854e;

    /* renamed from: f */
    private static boolean f855f;

    /* renamed from: g */
    private static Field f856g;

    /* renamed from: h */
    private static boolean f857h;

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: ResourcesFlusher */
    static class C0320a {
        /* renamed from: a */
        static void m1520a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    static void m1515a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1518d(resources);
            } else if (i >= 23) {
                m1517c(resources);
            } else if (i >= 21) {
                m1516b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m1516b(Resources resources) {
        if (!f851b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f850a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f851b = true;
        }
        Field field = f850a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1517c(Resources resources) {
        if (!f851b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f850a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f851b = true;
        }
        Object obj = null;
        Field field = f850a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m1519e(obj);
        }
    }

    /* renamed from: d */
    private static void m1518d(Resources resources) {
        Object obj;
        if (!f857h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f856g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f857h = true;
        }
        Field field = f856g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f851b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f850a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f851b = true;
                }
                Field field2 = f850a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m1519e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m1519e(Object obj) {
        if (!f853d) {
            try {
                f852c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f853d = true;
        }
        Class<?> cls = f852c;
        if (cls != null) {
            if (!f855f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f854e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f855f = true;
            }
            Field field = f854e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    C0320a.m1520a(longSparseArray);
                }
            }
        }
    }
}
