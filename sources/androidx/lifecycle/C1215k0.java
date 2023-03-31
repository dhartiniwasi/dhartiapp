package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.k0 */
/* compiled from: ViewModelStore */
public class C1215k0 {

    /* renamed from: a */
    private final HashMap<String, C1194g0> f3338a = new HashMap<>();

    /* renamed from: a */
    public final void mo4404a() {
        for (C1194g0 a : this.f3338a.values()) {
            a.mo4392a();
        }
        this.f3338a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1194g0 mo4405b(String str) {
        return this.f3338a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo4406c() {
        return new HashSet(this.f3338a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4407d(String str, C1194g0 g0Var) {
        C1194g0 put = this.f3338a.put(str, g0Var);
        if (put != null) {
            put.mo4218d();
        }
    }
}
