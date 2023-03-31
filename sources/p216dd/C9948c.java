package p216dd;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C11669k;

/* renamed from: dd.c */
/* compiled from: Repository.kt */
public abstract class C9948c<T> {

    /* renamed from: a */
    private final Map<String, T> f39878a = new HashMap();

    /* renamed from: c */
    private final boolean m50935c(String str) {
        return this.f39878a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo32512a() {
        this.f39878a.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32509b(String str) {
        C11669k.m56787e(str, "id");
        this.f39878a.remove(str);
    }

    /* renamed from: d */
    public final T mo32513d(String str) throws C9949d {
        C11669k.m56787e(str, "id");
        if (m50935c(str)) {
            T t = this.f39878a.get(str);
            C11669k.m56784b(t);
            return t;
        }
        throw new C9949d(str);
    }

    /* renamed from: e */
    public final void mo32514e(String str, T t) {
        C11669k.m56787e(str, "id");
        this.f39878a.put(str, t);
    }
}
