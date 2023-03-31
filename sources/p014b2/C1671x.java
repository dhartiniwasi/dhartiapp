package p014b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p014b2.C1637g;

/* renamed from: b2.x */
/* compiled from: BaseAudioProcessor */
public abstract class C1671x implements C1637g {

    /* renamed from: b */
    protected C1637g.C1638a f4843b;

    /* renamed from: c */
    protected C1637g.C1638a f4844c;

    /* renamed from: d */
    private C1637g.C1638a f4845d;

    /* renamed from: e */
    private C1637g.C1638a f4846e;

    /* renamed from: f */
    private ByteBuffer f4847f;

    /* renamed from: g */
    private ByteBuffer f4848g;

    /* renamed from: h */
    private boolean f4849h;

    public C1671x() {
        ByteBuffer byteBuffer = C1637g.f4700a;
        this.f4847f = byteBuffer;
        this.f4848g = byteBuffer;
        C1637g.C1638a aVar = C1637g.C1638a.f4701e;
        this.f4845d = aVar;
        this.f4846e = aVar;
        this.f4843b = aVar;
        this.f4844c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6622a() {
        return this.f4848g.hasRemaining();
    }

    /* renamed from: b */
    public boolean mo6512b() {
        return this.f4846e != C1637g.C1638a.f4701e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b;

    /* renamed from: d */
    public boolean mo6513d() {
        return this.f4849h && this.f4848g == C1637g.f4700a;
    }

    /* renamed from: e */
    public ByteBuffer mo6514e() {
        ByteBuffer byteBuffer = this.f4848g;
        this.f4848g = C1637g.f4700a;
        return byteBuffer;
    }

    public final void flush() {
        this.f4848g = C1637g.f4700a;
        this.f4849h = false;
        this.f4843b = this.f4845d;
        this.f4844c = this.f4846e;
        mo6521i();
    }

    /* renamed from: g */
    public final C1637g.C1638a mo6516g(C1637g.C1638a aVar) throws C1637g.C1639b {
        this.f4845d = aVar;
        this.f4846e = mo6455c(aVar);
        return mo6512b() ? this.f4846e : C1637g.C1638a.f4701e;
    }

    /* renamed from: h */
    public final void mo6517h() {
        this.f4849h = true;
        mo6522j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6521i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6522j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6523k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final ByteBuffer mo6623l(int i) {
        if (this.f4847f.capacity() < i) {
            this.f4847f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f4847f.clear();
        }
        ByteBuffer byteBuffer = this.f4847f;
        this.f4848g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f4847f = C1637g.f4700a;
        C1637g.C1638a aVar = C1637g.C1638a.f4701e;
        this.f4845d = aVar;
        this.f4846e = aVar;
        this.f4843b = aVar;
        this.f4844c = aVar;
        mo6523k();
    }
}
