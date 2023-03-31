package p177z1;

/* renamed from: z1.p1 */
/* compiled from: ExoTimeoutException */
public final class C6263p1 extends RuntimeException {

    /* renamed from: a */
    public final int f30169a;

    public C6263p1(int i) {
        super(m36810a(i));
        this.f30169a = i;
    }

    /* renamed from: a */
    private static String m36810a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
