package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p124r.C5426g;

/* renamed from: androidx.core.graphics.h */
/* compiled from: TypefaceCompatApi24Impl */
class C0747h extends C0751l {

    /* renamed from: b */
    private static final Class<?> f2310b;

    /* renamed from: c */
    private static final Constructor<?> f2311c;

    /* renamed from: d */
    private static final Method f2312d;

    /* renamed from: e */
    private static final Method f2313e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f2311c = constructor;
        f2310b = cls;
        f2312d = method;
        f2313e = method2;
    }

    C0747h() {
    }

    /* renamed from: l */
    private static boolean m3440l(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2312d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: m */
    private static Typeface m3441m(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2310b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2313e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m3442n() {
        Method method = f2312d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: o */
    private static Object m3443o() {
        try {
            return f2311c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo3119b(Context context, C0698e.C0701c cVar, Resources resources, int i) {
        Object o = m3443o();
        if (o == null) {
            return null;
        }
        for (C0698e.C0702d dVar : cVar.mo3026a()) {
            ByteBuffer b = C0755m.m3494b(context, resources, dVar.mo3028b());
            if (b == null || !m3440l(o, b, dVar.mo3029c(), dVar.mo3031e(), dVar.mo3032f())) {
                return null;
            }
        }
        return m3441m(o);
    }

    /* renamed from: c */
    public Typeface mo3120c(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        Object o = m3443o();
        if (o == null) {
            return null;
        }
        C5426g gVar = new C5426g();
        for (C0795g.C0797b bVar : bVarArr) {
            Uri d = bVar.mo3179d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C0755m.m3498f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m3440l(o, byteBuffer, bVar.mo3178c(), bVar.mo3180e(), bVar.mo3181f())) {
                return null;
            }
        }
        Typeface m = m3441m(o);
        if (m == null) {
            return null;
        }
        return Typeface.create(m, i);
    }
}
