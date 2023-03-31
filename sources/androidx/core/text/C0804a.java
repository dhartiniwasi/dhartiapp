package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* compiled from: BidiFormatter */
public final class C0804a {

    /* renamed from: d */
    static final C0813d f2393d;

    /* renamed from: e */
    private static final String f2394e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2395f = Character.toString(8207);

    /* renamed from: g */
    static final C0804a f2396g;

    /* renamed from: h */
    static final C0804a f2397h;

    /* renamed from: a */
    private final boolean f2398a;

    /* renamed from: b */
    private final int f2399b;

    /* renamed from: c */
    private final C0813d f2400c;

    /* renamed from: androidx.core.text.a$a */
    /* compiled from: BidiFormatter */
    public static final class C0805a {

        /* renamed from: a */
        private boolean f2401a;

        /* renamed from: b */
        private int f2402b;

        /* renamed from: c */
        private C0813d f2403c;

        public C0805a() {
            m3598c(C0804a.m3591e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0804a m3597b(boolean z) {
            return z ? C0804a.f2397h : C0804a.f2396g;
        }

        /* renamed from: c */
        private void m3598c(boolean z) {
            this.f2401a = z;
            this.f2403c = C0804a.f2393d;
            this.f2402b = 2;
        }

        /* renamed from: a */
        public C0804a mo3189a() {
            if (this.f2402b == 2 && this.f2403c == C0804a.f2393d) {
                return m3597b(this.f2401a);
            }
            return new C0804a(this.f2401a, this.f2402b, this.f2403c);
        }
    }

    /* renamed from: androidx.core.text.a$b */
    /* compiled from: BidiFormatter */
    private static class C0806b {

        /* renamed from: f */
        private static final byte[] f2404f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f2405a;

        /* renamed from: b */
        private final boolean f2406b;

        /* renamed from: c */
        private final int f2407c;

        /* renamed from: d */
        private int f2408d;

        /* renamed from: e */
        private char f2409e;

        static {
            for (int i = 0; i < 1792; i++) {
                f2404f[i] = Character.getDirectionality(i);
            }
        }

        C0806b(CharSequence charSequence, boolean z) {
            this.f2405a = charSequence;
            this.f2406b = z;
            this.f2407c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m3600c(char c) {
            return c < 1792 ? f2404f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m3601f() {
            char charAt;
            int i = this.f2408d;
            do {
                int i2 = this.f2408d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2405a;
                int i3 = i2 - 1;
                this.f2408d = i3;
                charAt = charSequence.charAt(i3);
                this.f2409e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2408d = i;
            this.f2409e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m3602g() {
            char charAt;
            do {
                int i = this.f2408d;
                if (i >= this.f2407c) {
                    return 12;
                }
                CharSequence charSequence = this.f2405a;
                this.f2408d = i + 1;
                charAt = charSequence.charAt(i);
                this.f2409e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m3603h() {
            char charAt;
            int i = this.f2408d;
            while (true) {
                int i2 = this.f2408d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2405a;
                int i3 = i2 - 1;
                this.f2408d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f2409e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f2408d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2405a;
                        int i5 = i4 - 1;
                        this.f2408d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f2409e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f2408d = i;
            this.f2409e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m3604i() {
            char charAt;
            int i = this.f2408d;
            while (true) {
                int i2 = this.f2408d;
                if (i2 < this.f2407c) {
                    CharSequence charSequence = this.f2405a;
                    this.f2408d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f2409e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f2408d;
                            if (i3 >= this.f2407c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2405a;
                            this.f2408d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2409e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2408d = i;
                    this.f2409e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo3190a() {
            char charAt = this.f2405a.charAt(this.f2408d - 1);
            this.f2409e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2405a, this.f2408d);
                this.f2408d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2408d--;
            byte c = m3600c(this.f2409e);
            if (!this.f2406b) {
                return c;
            }
            char c2 = this.f2409e;
            if (c2 == '>') {
                return m3603h();
            }
            return c2 == ';' ? m3601f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo3191b() {
            char charAt = this.f2405a.charAt(this.f2408d);
            this.f2409e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2405a, this.f2408d);
                this.f2408d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2408d++;
            byte c = m3600c(this.f2409e);
            if (!this.f2406b) {
                return c;
            }
            char c2 = this.f2409e;
            if (c2 == '<') {
                return m3604i();
            }
            return c2 == '&' ? m3602g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3192d() {
            this.f2408d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2408d < this.f2407c && i == 0) {
                byte b = mo3191b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2408d > 0) {
                switch (mo3190a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3193e() {
            /*
                r7 = this;
                int r0 = r7.f2407c
                r7.f2408d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f2408d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo3190a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.C0804a.C0806b.mo3193e():int");
        }
    }

    static {
        C0813d dVar = C0814e.f2427c;
        f2393d = dVar;
        f2396g = new C0804a(false, 2, dVar);
        f2397h = new C0804a(true, 2, dVar);
    }

    C0804a(boolean z, int i, C0813d dVar) {
        this.f2398a = z;
        this.f2399b = i;
        this.f2400c = dVar;
    }

    /* renamed from: a */
    private static int m3588a(CharSequence charSequence) {
        return new C0806b(charSequence, false).mo3192d();
    }

    /* renamed from: b */
    private static int m3589b(CharSequence charSequence) {
        return new C0806b(charSequence, false).mo3193e();
    }

    /* renamed from: c */
    public static C0804a m3590c() {
        return new C0805a().mo3189a();
    }

    /* renamed from: e */
    static boolean m3591e(Locale locale) {
        return C0821f.m3639b(locale) == 1;
    }

    /* renamed from: f */
    private String m3592f(CharSequence charSequence, C0813d dVar) {
        boolean a = dVar.mo3219a(charSequence, 0, charSequence.length());
        if (!this.f2398a && (a || m3589b(charSequence) == 1)) {
            return f2394e;
        }
        if (this.f2398a) {
            return (!a || m3589b(charSequence) == -1) ? f2395f : "";
        }
        return "";
    }

    /* renamed from: g */
    private String m3593g(CharSequence charSequence, C0813d dVar) {
        boolean a = dVar.mo3219a(charSequence, 0, charSequence.length());
        if (!this.f2398a && (a || m3588a(charSequence) == 1)) {
            return f2394e;
        }
        if (this.f2398a) {
            return (!a || m3588a(charSequence) == -1) ? f2395f : "";
        }
        return "";
    }

    /* renamed from: d */
    public boolean mo3186d() {
        return (this.f2399b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo3187h(CharSequence charSequence) {
        return mo3188i(charSequence, this.f2400c, true);
    }

    /* renamed from: i */
    public CharSequence mo3188i(CharSequence charSequence, C0813d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo3219a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo3186d() && z) {
            spannableStringBuilder.append(m3593g(charSequence, a ? C0814e.f2426b : C0814e.f2425a));
        }
        if (a != this.f2398a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m3592f(charSequence, a ? C0814e.f2426b : C0814e.f2425a));
        }
        return spannableStringBuilder;
    }
}
