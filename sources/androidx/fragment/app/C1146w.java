package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C1208j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.w */
/* compiled from: FragmentTransaction */
public abstract class C1146w {

    /* renamed from: a */
    private final C1108j f3150a;

    /* renamed from: b */
    private final ClassLoader f3151b;

    /* renamed from: c */
    ArrayList<C1147a> f3152c = new ArrayList<>();

    /* renamed from: d */
    int f3153d;

    /* renamed from: e */
    int f3154e;

    /* renamed from: f */
    int f3155f;

    /* renamed from: g */
    int f3156g;

    /* renamed from: h */
    int f3157h;

    /* renamed from: i */
    boolean f3158i;

    /* renamed from: j */
    boolean f3159j = true;

    /* renamed from: k */
    String f3160k;

    /* renamed from: l */
    int f3161l;

    /* renamed from: m */
    CharSequence f3162m;

    /* renamed from: n */
    int f3163n;

    /* renamed from: o */
    CharSequence f3164o;

    /* renamed from: p */
    ArrayList<String> f3165p;

    /* renamed from: q */
    ArrayList<String> f3166q;

    /* renamed from: r */
    boolean f3167r = false;

    /* renamed from: s */
    ArrayList<Runnable> f3168s;

    /* renamed from: androidx.fragment.app.w$a */
    /* compiled from: FragmentTransaction */
    static final class C1147a {

        /* renamed from: a */
        int f3169a;

        /* renamed from: b */
        Fragment f3170b;

        /* renamed from: c */
        int f3171c;

        /* renamed from: d */
        int f3172d;

        /* renamed from: e */
        int f3173e;

        /* renamed from: f */
        int f3174f;

        /* renamed from: g */
        C1208j.C1211c f3175g;

        /* renamed from: h */
        C1208j.C1211c f3176h;

        C1147a() {
        }

        C1147a(int i, Fragment fragment) {
            this.f3169a = i;
            this.f3170b = fragment;
            C1208j.C1211c cVar = C1208j.C1211c.RESUMED;
            this.f3175g = cVar;
            this.f3176h = cVar;
        }
    }

    C1146w(C1108j jVar, ClassLoader classLoader) {
        this.f3150a = jVar;
        this.f3151b = classLoader;
    }

    /* renamed from: b */
    public C1146w mo4288b(int i, Fragment fragment, String str) {
        mo3887k(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1146w mo4289c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2817O = viewGroup;
        return mo4288b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public C1146w mo4290d(Fragment fragment, String str) {
        mo3887k(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4291e(C1147a aVar) {
        this.f3152c.add(aVar);
        aVar.f3171c = this.f3153d;
        aVar.f3172d = this.f3154e;
        aVar.f3173e = this.f3155f;
        aVar.f3174f = this.f3156g;
    }

    /* renamed from: f */
    public abstract int mo3883f();

    /* renamed from: g */
    public abstract int mo3884g();

    /* renamed from: h */
    public abstract void mo3885h();

    /* renamed from: i */
    public abstract void mo3886i();

    /* renamed from: j */
    public C1146w mo4292j() {
        if (!this.f3158i) {
            this.f3159j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3887k(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2809G;
            if (str2 == null || str.equals(str2)) {
                fragment.f2809G = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2809G + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2807E;
                if (i3 == 0 || i3 == i) {
                    fragment.f2807E = i;
                    fragment.f2808F = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2807E + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4291e(new C1147a(i2, fragment));
    }

    /* renamed from: l */
    public C1146w mo3888l(Fragment fragment) {
        mo4291e(new C1147a(3, fragment));
        return this;
    }

    /* renamed from: m */
    public C1146w mo4293m(int i, Fragment fragment) {
        return mo4294n(i, fragment, (String) null);
    }

    /* renamed from: n */
    public C1146w mo4294n(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3887k(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: o */
    public C1146w mo4295o(boolean z) {
        this.f3167r = z;
        return this;
    }
}
