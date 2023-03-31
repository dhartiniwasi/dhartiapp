package p017b5;

import com.google.android.gms.common.api.C2062b;
import java.util.Map;
import java.util.Set;
import p124r.C5413a;
import p180z4.C6362b;
import p218e6.C9977j;

/* renamed from: b5.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1802i0 {

    /* renamed from: a */
    private final C5413a<C1787b<?>, C6362b> f5343a;

    /* renamed from: b */
    private final C5413a<C1787b<?>, String> f5344b;

    /* renamed from: c */
    private final C9977j<Map<C1787b<?>, String>> f5345c;

    /* renamed from: d */
    private int f5346d;

    /* renamed from: e */
    private boolean f5347e;

    /* renamed from: a */
    public final Set<C1787b<?>> mo6960a() {
        return this.f5343a.keySet();
    }

    /* renamed from: b */
    public final void mo6961b(C1787b<?> bVar, C6362b bVar2, String str) {
        this.f5343a.put(bVar, bVar2);
        this.f5344b.put(bVar, str);
        this.f5346d--;
        if (!bVar2.mo21755M1()) {
            this.f5347e = true;
        }
        if (this.f5346d != 0) {
            return;
        }
        if (this.f5347e) {
            this.f5345c.mo32543b(new C2062b(this.f5343a));
            return;
        }
        this.f5345c.mo32544c(this.f5344b);
    }
}
