package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0698e;
import androidx.core.provider.C0795g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.l */
/* compiled from: TypefaceCompatBaseImpl */
class C0751l {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0698e.C0701c> f2321a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.l$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0752a implements C0754c<C0795g.C0797b> {
        C0752a() {
        }

        /* renamed from: c */
        public int mo3133a(C0795g.C0797b bVar) {
            return bVar.mo3180e();
        }

        /* renamed from: d */
        public boolean mo3134b(C0795g.C0797b bVar) {
            return bVar.mo3181f();
        }
    }

    /* renamed from: androidx.core.graphics.l$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0753b implements C0754c<C0698e.C0702d> {
        C0753b() {
        }

        /* renamed from: c */
        public int mo3133a(C0698e.C0702d dVar) {
            return dVar.mo3031e();
        }

        /* renamed from: d */
        public boolean mo3134b(C0698e.C0702d dVar) {
            return dVar.mo3032f();
        }
    }

    /* renamed from: androidx.core.graphics.l$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C0754c<T> {
        /* renamed from: a */
        int mo3133a(T t);

        /* renamed from: b */
        boolean mo3134b(T t);
    }

    C0751l() {
    }

    /* renamed from: a */
    private void m3472a(Typeface typeface, C0698e.C0701c cVar) {
        long k = m3476k(typeface);
        if (k != 0) {
            this.f2321a.put(Long.valueOf(k), cVar);
        }
    }

    /* renamed from: f */
    private C0698e.C0702d m3473f(C0698e.C0701c cVar, int i) {
        return (C0698e.C0702d) m3474g(cVar.mo3026a(), i, new C0753b());
    }

    /* renamed from: g */
    private static <T> T m3474g(T[] tArr, int i, C0754c<T> cVar) {
        return m3475h(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, cVar);
    }

    /* renamed from: h */
    private static <T> T m3475h(T[] tArr, int i, boolean z, C0754c<T> cVar) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo3133a(t2) - i) * 2) + (cVar.mo3134b(t2) == z ? 0 : 1);
            if (t == null || i2 > abs) {
                t = t2;
                i2 = abs;
            }
        }
        return t;
    }

    /* renamed from: k */
    private static long m3476k(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo3119b(Context context, C0698e.C0701c cVar, Resources resources, int i) {
        C0698e.C0702d f = m3473f(cVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C0744f.m3426d(context, resources, f.mo3028b(), f.mo3027a(), 0, i);
        m3472a(d, cVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo3120c(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo3131i(bVarArr, i).mo3179d());
            try {
                Typeface d = mo3130d(context, inputStream);
                C0755m.m3493a(inputStream);
                return d;
            } catch (IOException unused) {
                C0755m.m3493a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0755m.m3493a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0755m.m3493a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0755m.m3493a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo3130d(Context context, InputStream inputStream) {
        File e = C0755m.m3497e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0755m.m3496d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo3123e(Context context, Resources resources, int i, String str, int i2) {
        File e = C0755m.m3497e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0755m.m3495c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0795g.C0797b mo3131i(C0795g.C0797b[] bVarArr, int i) {
        return (C0795g.C0797b) m3474g(bVarArr, i, new C0752a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0698e.C0701c mo3132j(Typeface typeface) {
        long k = m3476k(typeface);
        if (k == 0) {
            return null;
        }
        return this.f2321a.get(Long.valueOf(k));
    }
}
