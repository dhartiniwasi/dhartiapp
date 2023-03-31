package p017b5;

import android.os.Looper;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2055d;
import com.google.android.gms.common.api.C2063c;
import com.google.android.gms.common.api.internal.C2073b;
import com.google.android.gms.common.api.internal.C2136y0;
import p007a5.C0111g;

/* renamed from: b5.s */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1821s<O extends C2051a.C2055d> extends C1807l {

    /* renamed from: c */
    private final C2063c<O> f5368c;

    public C1821s(C2063c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5368c = cVar;
    }

    /* renamed from: e */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6989e(T t) {
        return this.f5368c.mo7973f(t);
    }

    /* renamed from: f */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6990f(T t) {
        return this.f5368c.mo7975h(t);
    }

    /* renamed from: g */
    public final Looper mo6991g() {
        return this.f5368c.mo7979l();
    }

    /* renamed from: k */
    public final void mo6992k(C2136y0 y0Var) {
    }
}
