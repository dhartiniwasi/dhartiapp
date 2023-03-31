package p262id;

/* renamed from: id.b */
/* compiled from: Comparisons.kt */
class C10610b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m53194a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
