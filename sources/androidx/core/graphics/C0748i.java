package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.i */
/* compiled from: TypefaceCompatApi26Impl */
public class C0748i extends C0746g {

    /* renamed from: g */
    protected final Class<?> f2314g;

    /* renamed from: h */
    protected final Constructor<?> f2315h;

    /* renamed from: i */
    protected final Method f2316i;

    /* renamed from: j */
    protected final Method f2317j;

    /* renamed from: k */
    protected final Method f2318k;

    /* renamed from: l */
    protected final Method f2319l;

    /* renamed from: m */
    protected final Method f2320m;

    public C0748i() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> z = mo3129z();
            constructor = mo3121A(z);
            method4 = mo3126w(z);
            method3 = mo3127x(z);
            method2 = mo3122B(z);
            method = mo3125v(z);
            Class<?> cls2 = z;
            method5 = mo3128y(z);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2314g = cls;
        this.f2315h = constructor;
        this.f2316i = method4;
        this.f2317j = method3;
        this.f2318k = method2;
        this.f2319l = method;
        this.f2320m = method5;
    }

    /* renamed from: p */
    private Object m3446p() {
        try {
            return this.f2315h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: q */
    private void m3447q(Object obj) {
        try {
            this.f2319l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: r */
    private boolean m3448r(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2316i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m3449s(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2317j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m3450t(Object obj) {
        try {
            return ((Boolean) this.f2318k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: u */
    private boolean m3451u() {
        if (this.f2316i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2316i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Constructor<?> mo3121A(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Method mo3122B(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo3119b(Context context, C0698e.C0701c cVar, Resources resources, int i) {
        if (!m3451u()) {
            return super.mo3119b(context, cVar, resources, i);
        }
        Object p = m3446p();
        if (p == null) {
            return null;
        }
        for (C0698e.C0702d dVar : cVar.mo3026a()) {
            if (!m3448r(context, p, dVar.mo3027a(), dVar.mo3029c(), dVar.mo3031e(), dVar.mo3032f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo3030d()))) {
                m3447q(p);
                return null;
            }
        }
        if (!m3450t(p)) {
            return null;
        }
        return mo3124m(p);
    }

    /* renamed from: c */
    public Typeface mo3120c(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        Typeface m;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m3451u()) {
            C0795g.C0797b i2 = mo3131i(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(i2.mo3179d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i2.mo3180e()).setItalic(i2.mo3181f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h = C0755m.m3500h(context, bVarArr, cancellationSignal);
            Object p = m3446p();
            if (p == null) {
                return null;
            }
            boolean z = false;
            for (C0795g.C0797b bVar : bVarArr) {
                ByteBuffer byteBuffer = h.get(bVar.mo3179d());
                if (byteBuffer != null) {
                    if (!m3449s(p, byteBuffer, bVar.mo3178c(), bVar.mo3180e(), bVar.mo3181f() ? 1 : 0)) {
                        m3447q(p);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m3447q(p);
                return null;
            } else if (m3450t(p) && (m = mo3124m(p)) != null) {
                return Typeface.create(m, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo3123e(Context context, Resources resources, int i, String str, int i2) {
        if (!m3451u()) {
            return super.mo3123e(context, resources, i, str, i2);
        }
        Object p = m3446p();
        if (p == null) {
            return null;
        }
        if (!m3448r(context, p, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m3447q(p);
            return null;
        } else if (!m3450t(p)) {
            return null;
        } else {
            return mo3124m(p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Typeface mo3124m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2314g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2320m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo3125v(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo3126w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo3127x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Method mo3128y(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Class<?> mo3129z() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }
}
