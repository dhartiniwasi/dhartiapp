package p049g0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C11669k;

/* renamed from: g0.a */
/* compiled from: CreationExtras.kt */
public abstract class C4298a {

    /* renamed from: a */
    private final Map<C4300b<?>, Object> f24175a = new LinkedHashMap();

    /* renamed from: g0.a$a */
    /* compiled from: CreationExtras.kt */
    public static final class C4299a extends C4298a {

        /* renamed from: b */
        public static final C4299a f24176b = new C4299a();

        private C4299a() {
        }

        /* renamed from: a */
        public <T> T mo17710a(C4300b<T> bVar) {
            C11669k.m56787e(bVar, "key");
            return null;
        }
    }

    /* renamed from: g0.a$b */
    /* compiled from: CreationExtras.kt */
    public interface C4300b<T> {
    }

    /* renamed from: a */
    public abstract <T> T mo17710a(C4300b<T> bVar);

    /* renamed from: b */
    public final Map<C4300b<?>, Object> mo17711b() {
        return this.f24175a;
    }
}
