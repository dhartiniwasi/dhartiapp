package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.e */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C0814e {

    /* renamed from: a */
    public static final C0813d f2425a = new C0819e((C0817c) null, false);

    /* renamed from: b */
    public static final C0813d f2426b = new C0819e((C0817c) null, true);

    /* renamed from: c */
    public static final C0813d f2427c;

    /* renamed from: d */
    public static final C0813d f2428d;

    /* renamed from: e */
    public static final C0813d f2429e = new C0819e(C0815a.f2431b, false);

    /* renamed from: f */
    public static final C0813d f2430f = C0820f.f2436b;

    /* renamed from: androidx.core.text.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0815a implements C0817c {

        /* renamed from: b */
        static final C0815a f2431b = new C0815a(true);

        /* renamed from: a */
        private final boolean f2432a;

        private C0815a(boolean z) {
            this.f2432a = z;
        }

        /* renamed from: a */
        public int mo3220a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0814e.m3628a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f2432a) {
                        return 1;
                    }
                } else if (this.f2432a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f2432a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0816b implements C0817c {

        /* renamed from: a */
        static final C0816b f2433a = new C0816b();

        private C0816b() {
        }

        /* renamed from: a */
        public int mo3220a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0814e.m3629b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C0817c {
        /* renamed from: a */
        int mo3220a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C0818d implements C0813d {

        /* renamed from: a */
        private final C0817c f2434a;

        C0818d(C0817c cVar) {
            this.f2434a = cVar;
        }

        /* renamed from: c */
        private boolean m3633c(CharSequence charSequence, int i, int i2) {
            int a = this.f2434a.mo3220a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo3221b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3219a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f2434a == null) {
                return mo3221b();
            } else {
                return m3633c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo3221b();
    }

    /* renamed from: androidx.core.text.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0819e extends C0818d {

        /* renamed from: b */
        private final boolean f2435b;

        C0819e(C0817c cVar, boolean z) {
            super(cVar);
            this.f2435b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3221b() {
            return this.f2435b;
        }
    }

    /* renamed from: androidx.core.text.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0820f extends C0818d {

        /* renamed from: b */
        static final C0820f f2436b = new C0820f();

        C0820f() {
            super((C0817c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo3221b() {
            return C0821f.m3639b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0816b bVar = C0816b.f2433a;
        f2427c = new C0819e(bVar, false);
        f2428d = new C0819e(bVar, true);
    }

    /* renamed from: a */
    static int m3628a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m3629b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
