package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C0825c;
import androidx.core.util.C0831h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
/* compiled from: ResourcesCompat */
public final class C0707h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2238a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0712e, SparseArray<C0711d>> f2239b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2240c = new Object();

    /* renamed from: androidx.core.content.res.h$a */
    /* compiled from: ResourcesCompat */
    static class C0708a {
        /* renamed from: a */
        static Drawable m3268a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    /* compiled from: ResourcesCompat */
    static class C0709b {
        /* renamed from: a */
        static Drawable m3269a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m3270b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    /* compiled from: ResourcesCompat */
    static class C0710c {
        /* renamed from: a */
        static int m3271a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m3272b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    /* compiled from: ResourcesCompat */
    private static class C0711d {

        /* renamed from: a */
        final ColorStateList f2241a;

        /* renamed from: b */
        final Configuration f2242b;

        /* renamed from: c */
        final int f2243c;

        C0711d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.f2241a = colorStateList;
            this.f2242b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f2243c = i;
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    /* compiled from: ResourcesCompat */
    private static final class C0712e {

        /* renamed from: a */
        final Resources f2244a;

        /* renamed from: b */
        final Resources.Theme f2245b;

        C0712e(Resources resources, Resources.Theme theme) {
            this.f2244a = resources;
            this.f2245b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0712e.class != obj.getClass()) {
                return false;
            }
            C0712e eVar = (C0712e) obj;
            if (!this.f2244a.equals(eVar.f2244a) || !C0825c.m3642a(this.f2245b, eVar.f2245b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C0825c.m3643b(this.f2244a, this.f2245b);
        }
    }

    /* renamed from: androidx.core.content.res.h$f */
    /* compiled from: ResourcesCompat */
    public static abstract class C0713f {
        /* renamed from: e */
        public static Handler m3275e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void mo3039c(int i, Handler handler) {
            m3275e(handler).post(new C0717i(this, i));
        }

        /* renamed from: d */
        public final void mo3040d(Typeface typeface, Handler handler) {
            m3275e(handler).post(new C0718j(this, typeface));
        }

        /* renamed from: h */
        public abstract void m3276f(int i);

        /* renamed from: i */
        public abstract void m3277g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$g */
    /* compiled from: ResourcesCompat */
    public static final class C0714g {

        /* renamed from: androidx.core.content.res.h$g$a */
        /* compiled from: ResourcesCompat */
        static class C0715a {

            /* renamed from: a */
            private static final Object f2246a = new Object();

            /* renamed from: b */
            private static Method f2247b;

            /* renamed from: c */
            private static boolean f2248c;

            /* renamed from: a */
            static void m3283a(Resources.Theme theme) {
                synchronized (f2246a) {
                    if (!f2248c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2247b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f2248c = true;
                    }
                    Method method = f2247b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f2247b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.h$g$b */
        /* compiled from: ResourcesCompat */
        static class C0716b {
            /* renamed from: a */
            static void m3284a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m3282a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0716b.m3284a(theme);
            } else if (i >= 23) {
                C0715a.m3283a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m3255a(C0712e eVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2240c) {
            WeakHashMap<C0712e, SparseArray<C0711d>> weakHashMap = f2239b;
            SparseArray sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i, new C0711d(colorStateList, eVar.f2244a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3256b(androidx.core.content.res.C0707h.C0712e r5, int r6) {
        /*
            java.lang.Object r0 = f2240c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.h$e, android.util.SparseArray<androidx.core.content.res.h$d>> r1 = f2239b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$d r2 = (androidx.core.content.res.C0707h.C0711d) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f2242b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f2244a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f2245b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f2243c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f2243c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f2241a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0707h.m3256b(androidx.core.content.res.h$e, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m3257c(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        C0712e eVar = new C0712e(resources, theme);
        ColorStateList b = m3256b(eVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList j = m3264j(resources, i, theme);
        if (j != null) {
            m3255a(eVar, i, j, theme);
            return j;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C0710c.m3272b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    /* renamed from: d */
    public static Drawable m3258d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0709b.m3269a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: e */
    public static Drawable m3259e(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0709b.m3270b(resources, i, i2, theme);
        }
        if (i3 >= 15) {
            return C0708a.m3268a(resources, i, i2);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: f */
    public static Typeface m3260f(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3266l(context, i, new TypedValue(), 0, (C0713f) null, (Handler) null, false, false);
    }

    /* renamed from: g */
    public static Typeface m3261g(Context context, int i, TypedValue typedValue, int i2, C0713f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m3266l(context, i, typedValue, i2, fVar, (Handler) null, true, false);
    }

    /* renamed from: h */
    public static void m3262h(Context context, int i, C0713f fVar, Handler handler) throws Resources.NotFoundException {
        C0831h.m3662f(fVar);
        if (context.isRestricted()) {
            fVar.mo3039c(-4, handler);
            return;
        }
        m3266l(context, i, new TypedValue(), 0, fVar, handler, false, false);
    }

    /* renamed from: i */
    private static TypedValue m3263i() {
        ThreadLocal<TypedValue> threadLocal = f2238a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: j */
    private static ColorStateList m3264j(Resources resources, int i, Resources.Theme theme) {
        if (m3265k(resources, i)) {
            return null;
        }
        try {
            return C0696c.m3208a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m3265k(Resources resources, int i) {
        TypedValue i2 = m3263i();
        resources.getValue(i, i2, true);
        int i3 = i2.type;
        if (i3 < 28 || i3 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static Typeface m3266l(Context context, int i, TypedValue typedValue, int i2, C0713f fVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface m = m3267m(context, resources, typedValue, i, i2, fVar, handler, z, z2);
        if (m != null || fVar != null || z2) {
            return m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m3267m(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0707h.C0713f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00bb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.mo3039c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0744f.m3428f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.mo3040d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0698e.m3229b(r2, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.mo3039c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0744f.m3425c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0744f.m3426d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.mo3040d(r0, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.mo3039c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00b5
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            r11.mo3039c(r15, r12)
        L_0x00ba:
            return r16
        L_0x00bb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0707h.m3267m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
