package p238g8;

import com.google.protobuf.C8153i;
import java.util.Map;
import p025c8.C6792f4;
import p211d8.C9905w;
import p247h8.C10432b;
import p247h8.C10442g;
import p405y8.C13150p;
import p405y8.C13153q;
import p405y8.C13157r;

/* renamed from: g8.v0 */
/* compiled from: WatchStream */
public class C10291v0 extends C10224c<C13153q, C13157r, C10292a> {

    /* renamed from: t */
    public static final C8153i f40879t = C8153i.f34908b;

    /* renamed from: s */
    private final C10250k0 f40880s;

    /* renamed from: g8.v0$a */
    /* compiled from: WatchStream */
    interface C10292a extends C10268q0 {
        /* renamed from: e */
        void mo33028e(C9905w wVar, C10275t0 t0Var);
    }

    C10291v0(C10285v vVar, C10442g gVar, C10250k0 k0Var, C10292a aVar) {
        super(vVar, C13150p.m61717c(), gVar, C10442g.C10448d.LISTEN_STREAM_CONNECTION_BACKOFF, C10442g.C10448d.LISTEN_STREAM_IDLE, C10442g.C10448d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f40880s = k0Var;
    }

    /* renamed from: A */
    public void mo33084A(C6792f4 f4Var) {
        C10432b.m52648d(mo32917m(), "Watching queries requires an open stream", new Object[0]);
        C13153q.C13155b E = C13153q.m61733i0().mo38218F(this.f40880s.mo32984a()).mo38217E(this.f40880s.mo32980U(f4Var));
        Map<String, String> N = this.f40880s.mo32977N(f4Var);
        if (N != null) {
            E.mo38216D(N);
        }
        mo32924x((C13153q) E.build());
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo32916l() {
        super.mo32916l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo32917m() {
        return super.mo32917m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo32918n() {
        return super.mo32918n();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo32921u() {
        super.mo32921u();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo32922v() {
        super.mo32922v();
    }

    /* renamed from: y */
    public void mo32920r(C13157r rVar) {
        this.f40695l.mo33548f();
        C10275t0 A = this.f40880s.mo32970A(rVar);
        ((C10292a) this.f40696m).mo33028e(this.f40880s.mo32999z(rVar), A);
    }

    /* renamed from: z */
    public void mo33086z(int i) {
        C10432b.m52648d(mo32917m(), "Unwatching targets requires an open stream", new Object[0]);
        mo32924x((C13153q) C13153q.m61733i0().mo38218F(this.f40880s.mo32984a()).mo38219G(i).build());
    }
}
