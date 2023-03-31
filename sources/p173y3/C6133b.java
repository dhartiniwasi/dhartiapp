package p173y3;

import java.nio.ByteBuffer;
import p021c2.C1848g;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6217e3;
import p177z1.C6218f;
import p177z1.C6264q;
import p177z1.C6272r1;

/* renamed from: y3.b */
/* compiled from: CameraMotionRenderer */
public final class C6133b extends C6218f {

    /* renamed from: v */
    private final C1848g f29556v = new C1848g(1);

    /* renamed from: w */
    private final C5918a0 f29557w = new C5918a0();

    /* renamed from: x */
    private long f29558x;

    /* renamed from: y */
    private C6132a f29559y;

    /* renamed from: z */
    private long f29560z;

    public C6133b() {
        super(6);
    }

    /* renamed from: Q */
    private float[] m35799Q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f29557w.mo20544M(byteBuffer.array(), byteBuffer.limit());
        this.f29557w.mo20546O(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f29557w.mo20563p());
        }
        return fArr;
    }

    /* renamed from: R */
    private void m35800R() {
        C6132a aVar = this.f29559y;
        if (aVar != null) {
            aVar.mo20984e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        m35800R();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) {
        this.f29560z = Long.MIN_VALUE;
        m35800R();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18662M(C6272r1[] r1VarArr, long j, long j2) {
        this.f29558x = j2;
    }

    /* renamed from: a */
    public int mo18664a(C6272r1 r1Var) {
        if ("application/x-camera-motion".equals(r1Var.f30243t)) {
            return C6217e3.m36424a(4);
        }
        return C6217e3.m36424a(0);
    }

    /* renamed from: b */
    public String mo6482b() {
        return "CameraMotionRenderer";
    }

    /* renamed from: d */
    public boolean mo6484d() {
        return mo21222h();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: p */
    public void mo18666p(long j, long j2) {
        while (!mo21222h() && this.f29560z < 100000 + j) {
            this.f29556v.mo7029n();
            if (mo21294N(mo21289B(), this.f29556v, 0) == -4 && !this.f29556v.mo7034s()) {
                C1848g gVar = this.f29556v;
                this.f29560z = gVar.f5432e;
                if (this.f29559y != null && !gVar.mo7033r()) {
                    this.f29556v.mo7051y();
                    float[] Q = m35799Q((ByteBuffer) C5953m0.m35138j(this.f29556v.f5430c));
                    if (Q != null) {
                        ((C6132a) C5953m0.m35138j(this.f29559y)).mo20983c(this.f29560z - this.f29558x, Q);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public void mo6490r(int i, Object obj) throws C6264q {
        if (i == 8) {
            this.f29559y = (C6132a) obj;
        } else {
            super.mo6490r(i, obj);
        }
    }
}
