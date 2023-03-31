package p182a7;

/* renamed from: a7.c */
/* compiled from: CharMatcher */
public abstract class C6409c implements C6432o<Character> {

    /* renamed from: a7.c$a */
    /* compiled from: CharMatcher */
    static abstract class C6410a extends C6409c {
        C6410a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C6409c.super.mo21826b((Character) obj);
        }
    }

    /* renamed from: a7.c$b */
    /* compiled from: CharMatcher */
    private static final class C6411b extends C6410a {

        /* renamed from: a */
        private final char f30657a;

        C6411b(char c) {
            this.f30657a = c;
        }

        /* renamed from: e */
        public boolean mo21828e(char c) {
            return c == this.f30657a;
        }

        public String toString() {
            String a = C6409c.m37511g(this.f30657a);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: a7.c$c */
    /* compiled from: CharMatcher */
    static abstract class C6412c extends C6410a {

        /* renamed from: a */
        private final String f30658a;

        C6412c(String str) {
            this.f30658a = (String) C6431n.m37561n(str);
        }

        public final String toString() {
            return this.f30658a;
        }
    }

    /* renamed from: a7.c$d */
    /* compiled from: CharMatcher */
    private static final class C6413d extends C6412c {

        /* renamed from: b */
        static final C6413d f30659b = new C6413d();

        private C6413d() {
            super("CharMatcher.none()");
        }

        /* renamed from: c */
        public int mo21827c(CharSequence charSequence, int i) {
            C6431n.m37564q(i, charSequence.length());
            return -1;
        }

        /* renamed from: e */
        public boolean mo21828e(char c) {
            return false;
        }
    }

    /* renamed from: a7.c$e */
    /* compiled from: CharMatcher */
    static final class C6414e extends C6412c {

        /* renamed from: b */
        static final int f30660b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        static final C6414e f30661c = new C6414e();

        C6414e() {
            super("CharMatcher.whitespace()");
        }

        /* renamed from: e */
        public boolean mo21828e(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f30660b) == c;
        }
    }

    protected C6409c() {
    }

    /* renamed from: d */
    public static C6409c m37509d(char c) {
        return new C6411b(c);
    }

    /* renamed from: f */
    public static C6409c m37510f() {
        return C6413d.f30659b;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static String m37511g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: h */
    public static C6409c m37512h() {
        return C6414e.f30661c;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo21826b(Character ch) {
        return mo21828e(ch.charValue());
    }

    /* renamed from: c */
    public int mo21827c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C6431n.m37564q(i, length);
        while (i < length) {
            if (mo21828e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo21828e(char c);
}
