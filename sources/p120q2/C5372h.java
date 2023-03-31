package p120q2;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import p021c2.C1848g;
import p161w3.C5917a;

/* renamed from: q2.h */
/* compiled from: BatchBuffer */
final class C5372h extends C1848g {

    /* renamed from: i */
    private long f27494i;

    /* renamed from: r */
    private int f27495r;

    /* renamed from: s */
    private int f27496s = 32;

    public C5372h() {
        super(2);
    }

    /* renamed from: D */
    private boolean m32893D(C1848g gVar) {
        ByteBuffer byteBuffer;
        if (!mo19470H()) {
            return true;
        }
        if (this.f27495r >= this.f27496s || gVar.mo7033r() != mo7033r()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f5430c;
        if (byteBuffer2 == null || (byteBuffer = this.f5430c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo19466C(C1848g gVar) {
        C5917a.m34868a(!gVar.mo7052z());
        C5917a.m34868a(!gVar.mo7032q());
        C5917a.m34868a(!gVar.mo7034s());
        if (!m32893D(gVar)) {
            return false;
        }
        int i = this.f27495r;
        this.f27495r = i + 1;
        if (i == 0) {
            this.f5432e = gVar.f5432e;
            if (gVar.mo7036u()) {
                mo7037v(1);
            }
        }
        if (gVar.mo7033r()) {
            mo7037v(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = gVar.f5430c;
        if (byteBuffer != null) {
            mo7050x(byteBuffer.remaining());
            this.f5430c.put(byteBuffer);
        }
        this.f27494i = gVar.f5432e;
        return true;
    }

    /* renamed from: E */
    public long mo19467E() {
        return this.f5432e;
    }

    /* renamed from: F */
    public long mo19468F() {
        return this.f27494i;
    }

    /* renamed from: G */
    public int mo19469G() {
        return this.f27495r;
    }

    /* renamed from: H */
    public boolean mo19470H() {
        return this.f27495r > 0;
    }

    /* renamed from: I */
    public void mo19471I(int i) {
        C5917a.m34868a(i > 0);
        this.f27496s = i;
    }

    /* renamed from: n */
    public void mo7029n() {
        super.mo7029n();
        this.f27495r = 0;
    }
}
