package p127r2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6217e3;
import p177z1.C6218f;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: r2.g */
/* compiled from: MetadataRenderer */
public final class C5441g extends C6218f implements Handler.Callback {

    /* renamed from: A */
    private boolean f27694A;

    /* renamed from: B */
    private boolean f27695B;

    /* renamed from: C */
    private long f27696C;

    /* renamed from: D */
    private long f27697D;

    /* renamed from: E */
    private C5432a f27698E;

    /* renamed from: v */
    private final C5437d f27699v;

    /* renamed from: w */
    private final C5440f f27700w;

    /* renamed from: x */
    private final Handler f27701x;

    /* renamed from: y */
    private final C5439e f27702y;

    /* renamed from: z */
    private C5436c f27703z;

    public C5441g(C5440f fVar, Looper looper) {
        this(fVar, looper, C5437d.f27692a);
    }

    /* renamed from: Q */
    private void m33291Q(C5432a aVar, List<C5432a.C5434b> list) {
        for (int i = 0; i < aVar.mo19696d(); i++) {
            C6272r1 c0 = aVar.mo19695c(i).mo17875c0();
            if (c0 == null || !this.f27699v.mo19707a(c0)) {
                list.add(aVar.mo19695c(i));
            } else {
                C5436c b = this.f27699v.mo19708b(c0);
                byte[] bArr = (byte[]) C5917a.m34872e(aVar.mo19695c(i).mo17880u1());
                this.f27702y.mo7029n();
                this.f27702y.mo7050x(bArr.length);
                ((ByteBuffer) C5953m0.m35138j(this.f27702y.f5430c)).put(bArr);
                this.f27702y.mo7051y();
                C5432a a = b.mo19706a(this.f27702y);
                if (a != null) {
                    m33291Q(a, list);
                }
            }
        }
    }

    /* renamed from: R */
    private void m33292R(C5432a aVar) {
        Handler handler = this.f27701x;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m33293S(aVar);
        }
    }

    /* renamed from: S */
    private void m33293S(C5432a aVar) {
        this.f27700w.mo19709o(aVar);
    }

    /* renamed from: T */
    private boolean m33294T(long j) {
        boolean z;
        C5432a aVar = this.f27698E;
        if (aVar == null || this.f27697D > j) {
            z = false;
        } else {
            m33292R(aVar);
            this.f27698E = null;
            this.f27697D = -9223372036854775807L;
            z = true;
        }
        if (this.f27694A && this.f27698E == null) {
            this.f27695B = true;
        }
        return z;
    }

    /* renamed from: U */
    private void m33295U() {
        if (!this.f27694A && this.f27698E == null) {
            this.f27702y.mo7029n();
            C6279s1 B = mo21289B();
            int N = mo21294N(B, this.f27702y, 0);
            if (N == -4) {
                if (this.f27702y.mo7034s()) {
                    this.f27694A = true;
                    return;
                }
                C5439e eVar = this.f27702y;
                eVar.f27693i = this.f27696C;
                eVar.mo7051y();
                C5432a a = ((C5436c) C5953m0.m35138j(this.f27703z)).mo19706a(this.f27702y);
                if (a != null) {
                    ArrayList arrayList = new ArrayList(a.mo19696d());
                    m33291Q(a, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f27698E = new C5432a((List<? extends C5432a.C5434b>) arrayList);
                        this.f27697D = this.f27702y.f5432e;
                    }
                }
            } else if (N == -5) {
                this.f27696C = ((C6272r1) C5917a.m34872e(B.f30328b)).f30247x;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        this.f27698E = null;
        this.f27697D = -9223372036854775807L;
        this.f27703z = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) {
        this.f27698E = null;
        this.f27697D = -9223372036854775807L;
        this.f27694A = false;
        this.f27695B = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18662M(C6272r1[] r1VarArr, long j, long j2) {
        this.f27703z = this.f27699v.mo19708b(r1VarArr[0]);
    }

    /* renamed from: a */
    public int mo18664a(C6272r1 r1Var) {
        if (!this.f27699v.mo19707a(r1Var)) {
            return C6217e3.m36424a(0);
        }
        return C6217e3.m36424a(r1Var.f30230M == 0 ? 4 : 2);
    }

    /* renamed from: b */
    public String mo6482b() {
        return "MetadataRenderer";
    }

    /* renamed from: d */
    public boolean mo6484d() {
        return this.f27695B;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m33293S((C5432a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: p */
    public void mo18666p(long j, long j2) {
        boolean z = true;
        while (z) {
            m33295U();
            z = m33294T(j);
        }
    }

    public C5441g(C5440f fVar, Looper looper, C5437d dVar) {
        super(5);
        Handler handler;
        this.f27700w = (C5440f) C5917a.m34872e(fVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = C5953m0.m35162v(looper, this);
        }
        this.f27701x = handler;
        this.f27699v = (C5437d) C5917a.m34872e(dVar);
        this.f27702y = new C5439e();
        this.f27697D = -9223372036854775807L;
    }
}
