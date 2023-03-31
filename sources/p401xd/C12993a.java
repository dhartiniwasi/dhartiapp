package p401xd;

import p372ud.C12752c;

/* renamed from: xd.a */
/* compiled from: CharJVM.kt */
class C12993a {
    /* renamed from: a */
    public static final int m61214a(int i) {
        if (new C12752c(2, 36).mo37683k(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C12752c(2, 36));
    }

    /* renamed from: b */
    public static final int m61215b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m61216c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
