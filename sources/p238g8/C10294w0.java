package p238g8;

import com.google.protobuf.C8153i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p211d8.C9905w;
import p220e8.C10009f;
import p220e8.C10012i;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10472x;
import p405y8.C13100d0;
import p405y8.C13108e0;
import p405y8.C13150p;

/* renamed from: g8.w0 */
/* compiled from: WriteStream */
public class C10294w0 extends C10224c<C13100d0, C13108e0, C10295a> {

    /* renamed from: v */
    public static final C8153i f40882v = C8153i.f34908b;

    /* renamed from: s */
    private final C10250k0 f40883s;

    /* renamed from: t */
    protected boolean f40884t = false;

    /* renamed from: u */
    private C8153i f40885u = f40882v;

    /* renamed from: g8.w0$a */
    /* compiled from: WriteStream */
    public interface C10295a extends C10268q0 {
        /* renamed from: c */
        void mo33029c(C9905w wVar, List<C10012i> list);

        /* renamed from: d */
        void mo33030d();
    }

    C10294w0(C10285v vVar, C10442g gVar, C10250k0 k0Var, C10295a aVar) {
        super(vVar, C13150p.m61719e(), gVar, C10442g.C10448d.WRITE_STREAM_CONNECTION_BACKOFF, C10442g.C10448d.WRITE_STREAM_IDLE, C10442g.C10448d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f40883s = k0Var;
    }

    /* renamed from: A */
    public void mo32920r(C13108e0 e0Var) {
        this.f40885u = e0Var.mo38165d0();
        if (!this.f40884t) {
            this.f40884t = true;
            ((C10295a) this.f40696m).mo33030d();
            return;
        }
        this.f40695l.mo33548f();
        C9905w y = this.f40883s.mo32998y(e0Var.mo38164b0());
        int f0 = e0Var.mo38167f0();
        ArrayList arrayList = new ArrayList(f0);
        for (int i = 0; i < f0; i++) {
            arrayList.add(this.f40883s.mo32994p(e0Var.mo38166e0(i), y));
        }
        ((C10295a) this.f40696m).mo33029c(y, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo33088B(C8153i iVar) {
        this.f40885u = (C8153i) C10472x.m52785b(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo33089C() {
        C10432b.m52648d(mo32917m(), "Writing handshake requires an opened stream", new Object[0]);
        C10432b.m52648d(!this.f40884t, "Handshake already completed", new Object[0]);
        mo32924x((C13100d0) C13100d0.m61575h0().mo38158E(this.f40883s.mo32984a()).build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo33090D(List<C10009f> list) {
        C10432b.m52648d(mo32917m(), "Writing mutations requires an opened stream", new Object[0]);
        C10432b.m52648d(this.f40884t, "Handshake must be complete before writing mutations", new Object[0]);
        C13100d0.C13102b h0 = C13100d0.m61575h0();
        for (C10009f O : list) {
            h0.mo38157D(this.f40883s.mo32978O(O));
        }
        h0.mo38159F(this.f40885u);
        mo32924x((C13100d0) h0.build());
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
    public void mo32921u() {
        this.f40884t = false;
        super.mo32921u();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo32922v() {
        super.mo32922v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo32923w() {
        if (this.f40884t) {
            mo33090D(Collections.emptyList());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C8153i mo33091y() {
        return this.f40885u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo33092z() {
        return this.f40884t;
    }
}
