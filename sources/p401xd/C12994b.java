package p401xd;

/* renamed from: xd.b */
/* compiled from: Char.kt */
class C12994b extends C12993a {
    /* renamed from: d */
    public static final boolean m61217d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
