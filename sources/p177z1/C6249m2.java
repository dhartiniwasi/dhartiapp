package p177z1;

import java.io.IOException;

/* renamed from: z1.m2 */
/* compiled from: ParserException */
public class C6249m2 extends IOException {

    /* renamed from: a */
    public final boolean f30083a;

    /* renamed from: b */
    public final int f30084b;

    protected C6249m2(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f30083a = z;
        this.f30084b = i;
    }

    /* renamed from: a */
    public static C6249m2 m36661a(String str, Throwable th) {
        return new C6249m2(str, th, true, 1);
    }

    /* renamed from: b */
    public static C6249m2 m36662b(String str, Throwable th) {
        return new C6249m2(str, th, true, 0);
    }

    /* renamed from: c */
    public static C6249m2 m36663c(String str, Throwable th) {
        return new C6249m2(str, th, true, 4);
    }

    /* renamed from: d */
    public static C6249m2 m36664d(String str) {
        return new C6249m2(str, (Throwable) null, false, 1);
    }
}
