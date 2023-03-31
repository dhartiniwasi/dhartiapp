package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.g */
/* compiled from: TypefaceCompatApi21Impl */
class C0746g extends C0751l {

    /* renamed from: b */
    private static Class<?> f2305b = null;

    /* renamed from: c */
    private static Constructor<?> f2306c = null;

    /* renamed from: d */
    private static Method f2307d = null;

    /* renamed from: e */
    private static Method f2308e = null;

    /* renamed from: f */
    private static boolean f2309f = false;

    C0746g() {
    }

    /* renamed from: l */
    private static boolean m3433l(Object obj, String str, int i, boolean z) {
        m3436o();
        try {
            return ((Boolean) f2307d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static Typeface mo3124m(Object obj) {
        m3436o();
        try {
            Object newInstance = Array.newInstance(f2305b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2308e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    private File m3435n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: o */
    private static void m3436o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2309f) {
            f2309f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f2306c = constructor;
            f2305b = cls;
            f2307d = method;
            f2308e = method2;
        }
    }

    /* renamed from: p */
    private static Object m3437p() {
        m3436o();
        try {
            return f2306c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo3119b(Context context, C0698e.C0701c cVar, Resources resources, int i) {
        Object p = m3437p();
        C0698e.C0702d[] a = cVar.mo3026a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0698e.C0702d dVar = a[i2];
            File e = C0755m.m3497e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C0755m.m3495c(e, resources, dVar.mo3028b())) {
                    e.delete();
                    return null;
                } else if (!m3433l(p, e.getPath(), dVar.mo3031e(), dVar.mo3032f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo3124m(p);
    }

    /* renamed from: c */
    public Typeface mo3120c(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C0795g.C0797b i2 = mo3131i(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i2.mo3179d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File n = m3435n(openFileDescriptor);
                if (n != null) {
                    if (n.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(n);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo3130d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
