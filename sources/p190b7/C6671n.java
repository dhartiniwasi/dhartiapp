package p190b7;

/* renamed from: b7.n */
/* compiled from: Hashing */
final class C6671n {
    /* renamed from: a */
    static int m38410a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m38411b(Object obj) {
        return m38410a(obj == null ? 0 : obj.hashCode());
    }
}
