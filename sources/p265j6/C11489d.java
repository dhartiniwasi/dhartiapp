package p265j6;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p328q6.C12190a;

/* renamed from: j6.d */
/* compiled from: CircularRevealWidget */
public interface C11489d {

    /* renamed from: j6.d$b */
    /* compiled from: CircularRevealWidget */
    public static class C11491b implements TypeEvaluator<C11494e> {

        /* renamed from: b */
        public static final TypeEvaluator<C11494e> f43906b = new C11491b();

        /* renamed from: a */
        private final C11494e f43907a = new C11494e();

        /* renamed from: a */
        public C11494e evaluate(float f, C11494e eVar, C11494e eVar2) {
            this.f43907a.mo35492a(C12190a.m58479c(eVar.f43910a, eVar2.f43910a, f), C12190a.m58479c(eVar.f43911b, eVar2.f43911b, f), C12190a.m58479c(eVar.f43912c, eVar2.f43912c, f));
            return this.f43907a;
        }
    }

    /* renamed from: j6.d$c */
    /* compiled from: CircularRevealWidget */
    public static class C11492c extends Property<C11489d, C11494e> {

        /* renamed from: a */
        public static final Property<C11489d, C11494e> f43908a = new C11492c("circularReveal");

        private C11492c(String str) {
            super(C11494e.class, str);
        }

        /* renamed from: a */
        public C11494e get(C11489d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C11489d dVar, C11494e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: j6.d$d */
    /* compiled from: CircularRevealWidget */
    public static class C11493d extends Property<C11489d, Integer> {

        /* renamed from: a */
        public static final Property<C11489d, Integer> f43909a = new C11493d("circularRevealScrimColor");

        private C11493d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C11489d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C11489d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: j6.d$e */
    /* compiled from: CircularRevealWidget */
    public static class C11494e {

        /* renamed from: a */
        public float f43910a;

        /* renamed from: b */
        public float f43911b;

        /* renamed from: c */
        public float f43912c;

        /* renamed from: a */
        public void mo35492a(float f, float f2, float f3) {
            this.f43910a = f;
            this.f43911b = f2;
            this.f43912c = f3;
        }

        private C11494e() {
        }

        public C11494e(float f, float f2, float f3) {
            this.f43910a = f;
            this.f43911b = f2;
            this.f43912c = f3;
        }
    }

    /* renamed from: a */
    void mo35472a();

    /* renamed from: b */
    void mo35473b();

    int getCircularRevealScrimColor();

    C11494e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C11494e eVar);
}
