package p079k3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6217e3;
import p177z1.C6218f;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: k3.o */
/* compiled from: TextRenderer */
public final class C4882o extends C6218f implements Handler.Callback {

    /* renamed from: A */
    private boolean f25809A;

    /* renamed from: B */
    private boolean f25810B;

    /* renamed from: C */
    private int f25811C;

    /* renamed from: D */
    private C6272r1 f25812D;

    /* renamed from: E */
    private C4875i f25813E;

    /* renamed from: F */
    private C4879l f25814F;

    /* renamed from: G */
    private C4880m f25815G;

    /* renamed from: H */
    private C4880m f25816H;

    /* renamed from: I */
    private int f25817I;

    /* renamed from: J */
    private long f25818J;

    /* renamed from: v */
    private final Handler f25819v;

    /* renamed from: w */
    private final C4881n f25820w;

    /* renamed from: x */
    private final C4877k f25821x;

    /* renamed from: y */
    private final C6279s1 f25822y;

    /* renamed from: z */
    private boolean f25823z;

    public C4882o(C4881n nVar, Looper looper) {
        this(nVar, looper, C4877k.f25805a);
    }

    /* renamed from: Q */
    private void m31043Q() {
        m31051Z(Collections.emptyList());
    }

    /* renamed from: R */
    private long m31044R() {
        if (this.f25817I == -1) {
            return Long.MAX_VALUE;
        }
        C5917a.m34872e(this.f25815G);
        if (this.f25817I >= this.f25815G.mo18651j()) {
            return Long.MAX_VALUE;
        }
        return this.f25815G.mo18649b(this.f25817I);
    }

    /* renamed from: S */
    private void m31045S(C4876j jVar) {
        C5961r.m35210d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f25812D, jVar);
        m31043Q();
        m31050X();
    }

    /* renamed from: T */
    private void m31046T() {
        this.f25810B = true;
        this.f25813E = this.f25821x.mo18658b((C6272r1) C5917a.m34872e(this.f25812D));
    }

    /* renamed from: U */
    private void m31047U(List<C4864b> list) {
        this.f25820w.mo18661s(list);
        this.f25820w.mo18660j(new C4868e(list));
    }

    /* renamed from: V */
    private void m31048V() {
        this.f25814F = null;
        this.f25817I = -1;
        C4880m mVar = this.f25815G;
        if (mVar != null) {
            mVar.mo7053w();
            this.f25815G = null;
        }
        C4880m mVar2 = this.f25816H;
        if (mVar2 != null) {
            mVar2.mo7053w();
            this.f25816H = null;
        }
    }

    /* renamed from: W */
    private void m31049W() {
        m31048V();
        ((C4875i) C5917a.m34872e(this.f25813E)).mo7041a();
        this.f25813E = null;
        this.f25811C = 0;
    }

    /* renamed from: X */
    private void m31050X() {
        m31049W();
        m31046T();
    }

    /* renamed from: Z */
    private void m31051Z(List<C4864b> list) {
        Handler handler = this.f25819v;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m31047U(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        this.f25812D = null;
        this.f25818J = -9223372036854775807L;
        m31043Q();
        m31049W();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) {
        m31043Q();
        this.f25823z = false;
        this.f25809A = false;
        this.f25818J = -9223372036854775807L;
        if (this.f25811C != 0) {
            m31050X();
            return;
        }
        m31048V();
        ((C4875i) C5917a.m34872e(this.f25813E)).flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18662M(C6272r1[] r1VarArr, long j, long j2) {
        this.f25812D = r1VarArr[0];
        if (this.f25813E != null) {
            this.f25811C = 1;
        } else {
            m31046T();
        }
    }

    /* renamed from: Y */
    public void mo18663Y(long j) {
        C5917a.m34873f(mo21235w());
        this.f25818J = j;
    }

    /* renamed from: a */
    public int mo18664a(C6272r1 r1Var) {
        if (this.f25821x.mo18657a(r1Var)) {
            return C6217e3.m36424a(r1Var.f30230M == 0 ? 4 : 2);
        } else if (C5967v.m35254r(r1Var.f30243t)) {
            return C6217e3.m36424a(1);
        } else {
            return C6217e3.m36424a(0);
        }
    }

    /* renamed from: b */
    public String mo6482b() {
        return "TextRenderer";
    }

    /* renamed from: d */
    public boolean mo6484d() {
        return this.f25809A;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m31047U((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: p */
    public void mo18666p(long j, long j2) {
        boolean z;
        if (mo21235w()) {
            long j3 = this.f25818J;
            if (j3 != -9223372036854775807L && j >= j3) {
                m31048V();
                this.f25809A = true;
            }
        }
        if (!this.f25809A) {
            if (this.f25816H == null) {
                ((C4875i) C5917a.m34872e(this.f25813E)).mo18644b(j);
                try {
                    this.f25816H = (C4880m) ((C4875i) C5917a.m34872e(this.f25813E)).mo7042c();
                } catch (C4876j e) {
                    m31045S(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f25815G != null) {
                    long R = m31044R();
                    z = false;
                    while (R <= j) {
                        this.f25817I++;
                        R = m31044R();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C4880m mVar = this.f25816H;
                if (mVar != null) {
                    if (mVar.mo7034s()) {
                        if (!z && m31044R() == Long.MAX_VALUE) {
                            if (this.f25811C == 2) {
                                m31050X();
                            } else {
                                m31048V();
                                this.f25809A = true;
                            }
                        }
                    } else if (mVar.f5438b <= j) {
                        C4880m mVar2 = this.f25815G;
                        if (mVar2 != null) {
                            mVar2.mo7053w();
                        }
                        this.f25817I = mVar.mo18648a(j);
                        this.f25815G = mVar;
                        this.f25816H = null;
                        z = true;
                    }
                }
                if (z) {
                    C5917a.m34872e(this.f25815G);
                    m31051Z(this.f25815G.mo18650c(j));
                }
                if (this.f25811C != 2) {
                    while (!this.f25823z) {
                        try {
                            C4879l lVar = this.f25814F;
                            if (lVar == null) {
                                lVar = (C4879l) ((C4875i) C5917a.m34872e(this.f25813E)).mo7043d();
                                if (lVar != null) {
                                    this.f25814F = lVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f25811C == 1) {
                                lVar.mo7037v(4);
                                ((C4875i) C5917a.m34872e(this.f25813E)).mo7044e(lVar);
                                this.f25814F = null;
                                this.f25811C = 2;
                                return;
                            }
                            int N = mo21294N(this.f25822y, lVar, 0);
                            if (N == -4) {
                                if (lVar.mo7034s()) {
                                    this.f25823z = true;
                                    this.f25810B = false;
                                } else {
                                    C6272r1 r1Var = this.f25822y.f30328b;
                                    if (r1Var != null) {
                                        lVar.f25806i = r1Var.f30247x;
                                        lVar.mo7051y();
                                        this.f25810B &= !lVar.mo7036u();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f25810B) {
                                    ((C4875i) C5917a.m34872e(this.f25813E)).mo7044e(lVar);
                                    this.f25814F = null;
                                }
                            } else if (N == -3) {
                                return;
                            }
                        } catch (C4876j e2) {
                            m31045S(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C4882o(C4881n nVar, Looper looper, C4877k kVar) {
        super(3);
        Handler handler;
        this.f25820w = (C4881n) C5917a.m34872e(nVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = C5953m0.m35162v(looper, this);
        }
        this.f25819v = handler;
        this.f25821x = kVar;
        this.f25822y = new C6279s1();
        this.f25818J = -9223372036854775807L;
    }
}
