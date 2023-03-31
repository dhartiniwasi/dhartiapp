package p164x0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p345re.C12451a;

/* renamed from: x0.a */
/* compiled from: ApiFeature */
public abstract class C5988a implements C6010h {

    /* renamed from: c */
    private static final Set<C5988a> f29210c = new HashSet();

    /* renamed from: a */
    private final String f29211a;

    /* renamed from: b */
    private final String f29212b;

    /* renamed from: x0.a$a */
    /* compiled from: ApiFeature */
    private static class C5989a {

        /* renamed from: a */
        static final Set<String> f29213a = new HashSet(Arrays.asList(C6025v.m35448d().mo20725a()));
    }

    /* renamed from: x0.a$b */
    /* compiled from: ApiFeature */
    public static final class C5990b extends C5988a {
        C5990b(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* renamed from: x0.a$c */
    /* compiled from: ApiFeature */
    public static final class C5991c extends C5988a {
        C5991c(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* renamed from: x0.a$d */
    /* compiled from: ApiFeature */
    public static final class C5992d extends C5988a {
        C5992d(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return false;
        }
    }

    /* renamed from: x0.a$e */
    /* compiled from: ApiFeature */
    public static final class C5993e extends C5988a {
        C5993e(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: x0.a$f */
    /* compiled from: ApiFeature */
    public static final class C5994f extends C5988a {
        C5994f(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: x0.a$g */
    /* compiled from: ApiFeature */
    public static final class C5995g extends C5988a {
        C5995g(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: x0.a$h */
    /* compiled from: ApiFeature */
    public static final class C5996h extends C5988a {
        C5996h(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public boolean mo20708c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    C5988a(String str, String str2) {
        this.f29211a = str;
        this.f29212b = str2;
        f29210c.add(this);
    }

    /* renamed from: e */
    public static Set<C5988a> m35326e() {
        return Collections.unmodifiableSet(f29210c);
    }

    /* renamed from: a */
    public String mo20706a() {
        return this.f29211a;
    }

    /* renamed from: b */
    public boolean mo20707b() {
        return mo20708c() || mo20709d();
    }

    /* renamed from: c */
    public abstract boolean mo20708c();

    /* renamed from: d */
    public boolean mo20709d() {
        return C12451a.m59407b(C5989a.f29213a, this.f29212b);
    }
}
