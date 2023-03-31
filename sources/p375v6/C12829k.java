package p375v6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p227f6.C10135k;

/* renamed from: v6.k */
/* compiled from: ShapeAppearanceModel */
public class C12829k {

    /* renamed from: m */
    public static final C12818c f46874m = new C12827i(0.5f);

    /* renamed from: a */
    C12819d f46875a;

    /* renamed from: b */
    C12819d f46876b;

    /* renamed from: c */
    C12819d f46877c;

    /* renamed from: d */
    C12819d f46878d;

    /* renamed from: e */
    C12818c f46879e;

    /* renamed from: f */
    C12818c f46880f;

    /* renamed from: g */
    C12818c f46881g;

    /* renamed from: h */
    C12818c f46882h;

    /* renamed from: i */
    C12821f f46883i;

    /* renamed from: j */
    C12821f f46884j;

    /* renamed from: k */
    C12821f f46885k;

    /* renamed from: l */
    C12821f f46886l;

    /* renamed from: v6.k$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C12832c {
        /* renamed from: a */
        C12818c mo37772a(C12818c cVar);
    }

    /* renamed from: a */
    public static C12831b m60629a() {
        return new C12831b();
    }

    /* renamed from: b */
    public static C12831b m60630b(Context context, int i, int i2) {
        return m60631c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C12831b m60631c(Context context, int i, int i2, int i3) {
        return m60632d(context, i, i2, new C12816a((float) i3));
    }

    /* renamed from: d */
    private static C12831b m60632d(Context context, int i, int i2, C12818c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10135k.f40515z2);
        try {
            int i3 = obtainStyledAttributes.getInt(C10135k.f40241A2, 0);
            int i4 = obtainStyledAttributes.getInt(C10135k.f40256D2, i3);
            int i5 = obtainStyledAttributes.getInt(C10135k.f40261E2, i3);
            int i6 = obtainStyledAttributes.getInt(C10135k.f40251C2, i3);
            int i7 = obtainStyledAttributes.getInt(C10135k.f40246B2, i3);
            C12818c m = m60636m(obtainStyledAttributes, C10135k.f40266F2, cVar);
            C12818c m2 = m60636m(obtainStyledAttributes, C10135k.f40281I2, m);
            C12818c m3 = m60636m(obtainStyledAttributes, C10135k.f40286J2, m);
            C12818c m4 = m60636m(obtainStyledAttributes, C10135k.f40276H2, m);
            return new C12831b().mo37808x(i4, m2).mo37794B(i5, m3).mo37804t(i6, m4).mo37800p(i7, m60636m(obtainStyledAttributes, C10135k.f40271G2, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C12831b m60633e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m60634f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C12831b m60634f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m60635g(context, attributeSet, i, i2, new C12816a((float) i3));
    }

    /* renamed from: g */
    public static C12831b m60635g(Context context, AttributeSet attributeSet, int i, int i2, C12818c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40389d2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10135k.f40395e2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10135k.f40401f2, 0);
        obtainStyledAttributes.recycle();
        return m60632d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C12818c m60636m(TypedArray typedArray, int i, C12818c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C12816a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C12827i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C12821f mo37777h() {
        return this.f46885k;
    }

    /* renamed from: i */
    public C12819d mo37778i() {
        return this.f46878d;
    }

    /* renamed from: j */
    public C12818c mo37779j() {
        return this.f46882h;
    }

    /* renamed from: k */
    public C12819d mo37780k() {
        return this.f46877c;
    }

    /* renamed from: l */
    public C12818c mo37781l() {
        return this.f46881g;
    }

    /* renamed from: n */
    public C12821f mo37782n() {
        return this.f46886l;
    }

    /* renamed from: o */
    public C12821f mo37783o() {
        return this.f46884j;
    }

    /* renamed from: p */
    public C12821f mo37784p() {
        return this.f46883i;
    }

    /* renamed from: q */
    public C12819d mo37785q() {
        return this.f46875a;
    }

    /* renamed from: r */
    public C12818c mo37786r() {
        return this.f46879e;
    }

    /* renamed from: s */
    public C12819d mo37787s() {
        return this.f46876b;
    }

    /* renamed from: t */
    public C12818c mo37788t() {
        return this.f46880f;
    }

    /* renamed from: u */
    public boolean mo37789u(RectF rectF) {
        Class<C12821f> cls = C12821f.class;
        boolean z = this.f46886l.getClass().equals(cls) && this.f46884j.getClass().equals(cls) && this.f46883i.getClass().equals(cls) && this.f46885k.getClass().equals(cls);
        float a = this.f46879e.mo37727a(rectF);
        boolean z2 = this.f46880f.mo37727a(rectF) == a && this.f46882h.mo37727a(rectF) == a && this.f46881g.mo37727a(rectF) == a;
        boolean z3 = (this.f46876b instanceof C12828j) && (this.f46875a instanceof C12828j) && (this.f46877c instanceof C12828j) && (this.f46878d instanceof C12828j);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C12831b mo37790v() {
        return new C12831b(this);
    }

    /* renamed from: w */
    public C12829k mo37791w(float f) {
        return mo37790v().mo37799o(f).mo37798m();
    }

    /* renamed from: x */
    public C12829k mo37792x(C12832c cVar) {
        return mo37790v().mo37793A(cVar.mo37772a(mo37786r())).mo37797E(cVar.mo37772a(mo37788t())).mo37803s(cVar.mo37772a(mo37779j())).mo37807w(cVar.mo37772a(mo37781l())).mo37798m();
    }

    private C12829k(C12831b bVar) {
        this.f46875a = bVar.f46887a;
        this.f46876b = bVar.f46888b;
        this.f46877c = bVar.f46889c;
        this.f46878d = bVar.f46890d;
        this.f46879e = bVar.f46891e;
        this.f46880f = bVar.f46892f;
        this.f46881g = bVar.f46893g;
        this.f46882h = bVar.f46894h;
        this.f46883i = bVar.f46895i;
        this.f46884j = bVar.f46896j;
        this.f46885k = bVar.f46897k;
        this.f46886l = bVar.f46898l;
    }

    /* renamed from: v6.k$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C12831b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12819d f46887a = C12826h.m60622b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C12819d f46888b = C12826h.m60622b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C12819d f46889c = C12826h.m60622b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C12819d f46890d = C12826h.m60622b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C12818c f46891e = new C12816a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C12818c f46892f = new C12816a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C12818c f46893g = new C12816a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C12818c f46894h = new C12816a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C12821f f46895i = C12826h.m60623c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C12821f f46896j = C12826h.m60623c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C12821f f46897k = C12826h.m60623c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C12821f f46898l = C12826h.m60623c();

        public C12831b() {
        }

        /* renamed from: n */
        private static float m60665n(C12819d dVar) {
            if (dVar instanceof C12828j) {
                return ((C12828j) dVar).f46873a;
            }
            if (dVar instanceof C12820e) {
                return ((C12820e) dVar).f46824a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C12831b mo37793A(C12818c cVar) {
            this.f46891e = cVar;
            return this;
        }

        /* renamed from: B */
        public C12831b mo37794B(int i, C12818c cVar) {
            return mo37795C(C12826h.m60621a(i)).mo37797E(cVar);
        }

        /* renamed from: C */
        public C12831b mo37795C(C12819d dVar) {
            this.f46888b = dVar;
            float n = m60665n(dVar);
            if (n != -1.0f) {
                mo37796D(n);
            }
            return this;
        }

        /* renamed from: D */
        public C12831b mo37796D(float f) {
            this.f46892f = new C12816a(f);
            return this;
        }

        /* renamed from: E */
        public C12831b mo37797E(C12818c cVar) {
            this.f46892f = cVar;
            return this;
        }

        /* renamed from: m */
        public C12829k mo37798m() {
            return new C12829k(this);
        }

        /* renamed from: o */
        public C12831b mo37799o(float f) {
            return mo37810z(f).mo37796D(f).mo37806v(f).mo37802r(f);
        }

        /* renamed from: p */
        public C12831b mo37800p(int i, C12818c cVar) {
            return mo37801q(C12826h.m60621a(i)).mo37803s(cVar);
        }

        /* renamed from: q */
        public C12831b mo37801q(C12819d dVar) {
            this.f46890d = dVar;
            float n = m60665n(dVar);
            if (n != -1.0f) {
                mo37802r(n);
            }
            return this;
        }

        /* renamed from: r */
        public C12831b mo37802r(float f) {
            this.f46894h = new C12816a(f);
            return this;
        }

        /* renamed from: s */
        public C12831b mo37803s(C12818c cVar) {
            this.f46894h = cVar;
            return this;
        }

        /* renamed from: t */
        public C12831b mo37804t(int i, C12818c cVar) {
            return mo37805u(C12826h.m60621a(i)).mo37807w(cVar);
        }

        /* renamed from: u */
        public C12831b mo37805u(C12819d dVar) {
            this.f46889c = dVar;
            float n = m60665n(dVar);
            if (n != -1.0f) {
                mo37806v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C12831b mo37806v(float f) {
            this.f46893g = new C12816a(f);
            return this;
        }

        /* renamed from: w */
        public C12831b mo37807w(C12818c cVar) {
            this.f46893g = cVar;
            return this;
        }

        /* renamed from: x */
        public C12831b mo37808x(int i, C12818c cVar) {
            return mo37809y(C12826h.m60621a(i)).mo37793A(cVar);
        }

        /* renamed from: y */
        public C12831b mo37809y(C12819d dVar) {
            this.f46887a = dVar;
            float n = m60665n(dVar);
            if (n != -1.0f) {
                mo37810z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C12831b mo37810z(float f) {
            this.f46891e = new C12816a(f);
            return this;
        }

        public C12831b(C12829k kVar) {
            this.f46887a = kVar.f46875a;
            this.f46888b = kVar.f46876b;
            this.f46889c = kVar.f46877c;
            this.f46890d = kVar.f46878d;
            this.f46891e = kVar.f46879e;
            this.f46892f = kVar.f46880f;
            this.f46893g = kVar.f46881g;
            this.f46894h = kVar.f46882h;
            this.f46895i = kVar.f46883i;
            this.f46896j = kVar.f46884j;
            this.f46897k = kVar.f46885k;
            this.f46898l = kVar.f46886l;
        }
    }

    public C12829k() {
        this.f46875a = C12826h.m60622b();
        this.f46876b = C12826h.m60622b();
        this.f46877c = C12826h.m60622b();
        this.f46878d = C12826h.m60622b();
        this.f46879e = new C12816a(0.0f);
        this.f46880f = new C12816a(0.0f);
        this.f46881g = new C12816a(0.0f);
        this.f46882h = new C12816a(0.0f);
        this.f46883i = C12826h.m60623c();
        this.f46884j = C12826h.m60623c();
        this.f46885k = C12826h.m60623c();
        this.f46886l = C12826h.m60623c();
    }
}
