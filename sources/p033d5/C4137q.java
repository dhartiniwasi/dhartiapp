package p033d5;

import p007a5.C0106c;
import p007a5.C0110f;
import p007a5.C0111g;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: d5.q */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4137q {

    /* renamed from: a */
    private static final C4139q0 f23384a = new C4128n0();

    /* renamed from: d5.q$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4138a<R extends C0111g, T> {
        /* renamed from: a */
        T mo17444a(R r);
    }

    /* renamed from: a */
    public static <R extends C0111g, T extends C0110f<R>> C9975i<T> m28208a(C0106c<R> cVar, T t) {
        return m28209b(cVar, new C4135p0(t));
    }

    /* renamed from: b */
    public static <R extends C0111g, T> C9975i<T> m28209b(C0106c<R> cVar, C4138a<R, T> aVar) {
        C4139q0 q0Var = f23384a;
        C9977j jVar = new C9977j();
        cVar.mo253a(new C4131o0(cVar, jVar, aVar, q0Var));
        return jVar.mo32542a();
    }
}
