package p210d7;

/* renamed from: d7.d */
/* compiled from: MathPreconditions */
final class C9876d {
    /* renamed from: a */
    static void m50647a(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: b */
    static int m50648b(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    static void m50649c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
