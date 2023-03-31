package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0698e;
import androidx.core.content.res.C0707h;
import androidx.core.provider.C0795g;
import p124r.C5419e;

/* renamed from: androidx.core.graphics.f */
/* compiled from: TypefaceCompat */
public class C0744f {

    /* renamed from: a */
    private static final C0751l f2302a;

    /* renamed from: b */
    private static final C5419e<String, Typeface> f2303b = new C5419e<>(16);

    /* renamed from: androidx.core.graphics.f$a */
    /* compiled from: TypefaceCompat */
    public static class C0745a extends C0795g.C0798c {

        /* renamed from: a */
        private C0707h.C0713f f2304a;

        public C0745a(C0707h.C0713f fVar) {
            this.f2304a = fVar;
        }

        /* renamed from: a */
        public void mo3117a(int i) {
            C0707h.C0713f fVar = this.f2304a;
            if (fVar != null) {
                fVar.m3276f(i);
            }
        }

        /* renamed from: b */
        public void mo3118b(Typeface typeface) {
            C0707h.C0713f fVar = this.f2304a;
            if (fVar != null) {
                fVar.m3277g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f2302a = new C0750k();
        } else if (i >= 28) {
            f2302a = new C0749j();
        } else if (i >= 26) {
            f2302a = new C0748i();
        } else if (i >= 24 && C0747h.m3442n()) {
            f2302a = new C0747h();
        } else if (i >= 21) {
            f2302a = new C0746g();
        } else {
            f2302a = new C0751l();
        }
    }

    /* renamed from: a */
    public static Typeface m3423a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g = m3429g(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return g;
        }
    }

    /* renamed from: b */
    public static Typeface m3424b(Context context, CancellationSignal cancellationSignal, C0795g.C0797b[] bVarArr, int i) {
        return f2302a.mo3120c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m3425c(Context context, C0698e.C0700b bVar, Resources resources, int i, String str, int i2, int i3, C0707h.C0713f fVar, Handler handler, boolean z) {
        Typeface typeface;
        C0698e.C0700b bVar2 = bVar;
        C0707h.C0713f fVar2 = fVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C0698e.C0703e) {
            C0698e.C0703e eVar = (C0698e.C0703e) bVar2;
            Typeface h = m3430h(eVar.mo3035c());
            if (h != null) {
                if (fVar2 != null) {
                    fVar2.mo3040d(h, handler2);
                }
                return h;
            }
            typeface = C0795g.m3573c(context, eVar.mo3034b(), i3, !z ? fVar2 == null : eVar.mo3033a() == 0, z ? eVar.mo3036d() : -1, C0707h.C0713f.m3275e(handler), new C0745a(fVar2));
            Resources resources2 = resources;
            int i4 = i3;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f2302a.mo3119b(context, (C0698e.C0701c) bVar2, resources, i3);
            if (fVar2 != null) {
                if (typeface != null) {
                    fVar2.mo3040d(typeface, handler2);
                } else {
                    fVar2.mo3039c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f2303b.mo19587d(m3427e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m3426d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface e = f2302a.mo3123e(context, resources, i, str, i3);
        if (e != null) {
            f2303b.mo19587d(m3427e(resources, i, str, i2, i3), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m3427e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m3428f(Resources resources, int i, String str, int i2, int i3) {
        return f2303b.mo19586c(m3427e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m3429g(Context context, Typeface typeface, int i) {
        C0751l lVar = f2302a;
        C0698e.C0701c j = lVar.mo3132j(typeface);
        if (j == null) {
            return null;
        }
        return lVar.mo3119b(context, j, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m3430h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
