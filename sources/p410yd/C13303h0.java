package p410yd;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p272jd.C11561a;
import p272jd.C11570g;
import p354se.C12519b;

/* renamed from: yd.h0 */
/* compiled from: CoroutineContext.kt */
public final class C13303h0 extends C11561a implements C13295f2<String> {

    /* renamed from: b */
    public static final C13304a f47624b = new C13304a((C11665g) null);

    /* renamed from: a */
    private final long f47625a;

    /* renamed from: yd.h0$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C13304a implements C11570g.C11575c<C13303h0> {
        private C13304a() {
        }

        public /* synthetic */ C13304a(C11665g gVar) {
            this();
        }
    }

    public C13303h0(long j) {
        super(f47624b);
        this.f47625a = j;
    }

    /* renamed from: H */
    public final long mo38425H() {
        return this.f47625a;
    }

    /* renamed from: I */
    public void mo38419g(C11570g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: K */
    public String mo38420t(C11570g gVar) {
        String H;
        C13308i0 i0Var = (C13308i0) gVar.get(C13308i0.f47628b);
        String str = "coroutine";
        if (!(i0Var == null || (H = i0Var.mo38435H()) == null)) {
            str = H;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int E = C13011o.m61265E(name, " @", 0, false, 6, (Object) null);
        if (E < 0) {
            E = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + E + 10);
        String substring = name.substring(0, E);
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(mo38425H());
        String sb2 = sb.toString();
        C11669k.m56786d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13303h0) && this.f47625a == ((C13303h0) obj).f47625a;
    }

    public int hashCode() {
        return C12519b.m59675a(this.f47625a);
    }

    public String toString() {
        return "CoroutineId(" + this.f47625a + ')';
    }
}
