package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.startapp.C8843b4;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.no */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2668no implements C2368fl {

    /* renamed from: a */
    private final C2557ko f14136a = new C2557ko();

    /* renamed from: b */
    private final C2520jo f14137b = new C2520jo();

    /* renamed from: c */
    private final C2633mq f14138c = new C2633mq(32);

    /* renamed from: d */
    private final AtomicInteger f14139d = new AtomicInteger();

    /* renamed from: e */
    private C2594lo f14140e;

    /* renamed from: f */
    private C2594lo f14141f;

    /* renamed from: g */
    private C2774qi f14142g;

    /* renamed from: h */
    private C2774qi f14143h;

    /* renamed from: i */
    private long f14144i;

    /* renamed from: j */
    private int f14145j = 65536;

    /* renamed from: k */
    private C2631mo f14146k;

    /* renamed from: l */
    private final C2781qp f14147l;

    public C2668no(C2781qp qpVar, byte[] bArr) {
        this.f14147l = qpVar;
        C2594lo loVar = new C2594lo(0, 65536);
        this.f14140e = loVar;
        this.f14141f = loVar;
    }

    /* renamed from: o */
    private final int m17201o(int i) {
        if (this.f14145j == 65536) {
            this.f14145j = 0;
            C2594lo loVar = this.f14141f;
            if (loVar.f12860c) {
                this.f14141f = loVar.f12862e;
            }
            C2594lo loVar2 = this.f14141f;
            C2558kp b = this.f14147l.mo13577b();
            C2594lo loVar3 = new C2594lo(this.f14141f.f12859b, 65536);
            loVar2.f12861d = b;
            loVar2.f12862e = loVar3;
            loVar2.f12860c = true;
        }
        return Math.min(i, 65536 - this.f14145j);
    }

    /* renamed from: p */
    private final void m17202p() {
        this.f14136a.mo11742g();
        C2594lo loVar = this.f14140e;
        if (loVar.f12860c) {
            C2594lo loVar2 = this.f14141f;
            int i = (loVar2.f12860c ? 1 : 0) + (((int) (loVar2.f12858a - loVar.f12858a)) / 65536);
            C2558kp[] kpVarArr = new C2558kp[i];
            for (int i2 = 0; i2 < i; i2++) {
                kpVarArr[i2] = loVar.f12861d;
                loVar.f12861d = null;
                loVar = loVar.f12862e;
            }
            this.f14147l.mo13579d(kpVarArr);
        }
        C2594lo loVar3 = new C2594lo(0, 65536);
        this.f14140e = loVar3;
        this.f14141f = loVar3;
        this.f14144i = 0;
        this.f14145j = 65536;
        this.f14147l.mo13582g();
    }

    /* renamed from: q */
    private final void m17203q(long j) {
        while (true) {
            C2594lo loVar = this.f14140e;
            if (j >= loVar.f12859b) {
                this.f14147l.mo13578c(loVar.f12861d);
                C2594lo loVar2 = this.f14140e;
                loVar2.f12861d = null;
                this.f14140e = loVar2.f12862e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m17204r() {
        if (!this.f14139d.compareAndSet(1, 0)) {
            m17202p();
        }
    }

    /* renamed from: s */
    private final void m17205s(long j, byte[] bArr, int i) {
        m17203q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f14140e.f12858a);
            int min = Math.min(i - i2, 65536 - i3);
            C2558kp kpVar = this.f14140e.f12861d;
            System.arraycopy(kpVar.f12205a, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f14140e.f12859b) {
                this.f14147l.mo13578c(kpVar);
                C2594lo loVar = this.f14140e;
                loVar.f12861d = null;
                this.f14140e = loVar.f12862e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m17206t() {
        return this.f14139d.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public final int mo10171a(C2924uk ukVar, int i, boolean z) throws IOException, InterruptedException {
        if (!m17206t()) {
            int b = ukVar.mo14522b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = ukVar.mo14521a(this.f14141f.f12861d.f12205a, this.f14145j, m17201o(i));
            if (a != -1) {
                this.f14145j += a;
                this.f14144i += (long) a;
                return a;
            }
            throw new EOFException();
        } finally {
            m17204r();
        }
    }

    /* renamed from: b */
    public final void mo10172b(C2774qi qiVar) {
        C2774qi qiVar2 = qiVar == null ? null : qiVar;
        boolean k = this.f14136a.mo11746k(qiVar2);
        this.f14143h = qiVar;
        C2631mo moVar = this.f14146k;
        if (moVar != null && k) {
            moVar.mo12383h(qiVar2);
        }
    }

    /* renamed from: c */
    public final void mo10173c(long j, int i, int i2, int i3, C2330el elVar) {
        if (m17206t()) {
            try {
                this.f14136a.mo11743h(j, i, this.f14144i - ((long) i2), i2, elVar);
            } finally {
                m17204r();
            }
        } else {
            long j2 = j;
            this.f14136a.mo11744i(j);
        }
    }

    /* renamed from: d */
    public final void mo10174d(C2633mq mqVar, int i) {
        if (m17206t()) {
            while (i > 0) {
                int o = m17201o(i);
                mqVar.mo12406q(this.f14141f.f12861d.f12205a, this.f14145j, o);
                this.f14145j += o;
                this.f14144i += (long) o;
                i -= o;
            }
            m17204r();
            return;
        }
        mqVar.mo12412w(i);
    }

    /* renamed from: e */
    public final int mo12670e() {
        return this.f14136a.mo11736a();
    }

    /* renamed from: f */
    public final int mo12671f(C2811ri riVar, C2664nk nkVar, boolean z, boolean z2, long j) {
        int i;
        C2664nk nkVar2 = nkVar;
        int b = this.f14136a.mo11737b(riVar, nkVar, z, z2, this.f14142g, this.f14137b);
        if (b == -5) {
            this.f14142g = riVar.f16958a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!nkVar.mo11139f()) {
                if (nkVar2.f14050d < j) {
                    nkVar2.mo11134a(RecyclerView.UNDEFINED_DURATION);
                }
                if (nkVar.mo12646i()) {
                    C2520jo joVar = this.f14137b;
                    long j2 = joVar.f11724b;
                    this.f14138c.mo12408s(1);
                    m17205s(j2, this.f14138c.f13448a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f14138c.f13448a[0];
                    byte b3 = b2 & C8843b4.f36445d;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    C2590lk lkVar = nkVar2.f14048b;
                    if (lkVar.f12823a == null) {
                        lkVar.f12823a = new byte[16];
                    }
                    m17205s(j3, lkVar.f12823a, b4);
                    long j4 = j3 + ((long) b4);
                    if (b3 != 0) {
                        this.f14138c.mo12408s(2);
                        m17205s(j4, this.f14138c.f13448a, 2);
                        j4 += 2;
                        i = this.f14138c.mo12399j();
                    } else {
                        i = 1;
                    }
                    C2590lk lkVar2 = nkVar2.f14048b;
                    int[] iArr = lkVar2.f12826d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = lkVar2.f12827e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (b3 != 0) {
                        int i2 = i * 6;
                        this.f14138c.mo12408s(i2);
                        m17205s(j4, this.f14138c.f13448a, i2);
                        j4 += (long) i2;
                        this.f14138c.mo12411v(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f14138c.mo12399j();
                            iArr4[i3] = this.f14138c.mo12398i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = joVar.f11723a - ((int) (j4 - joVar.f11724b));
                    }
                    C2330el elVar = joVar.f11726d;
                    C2590lk lkVar3 = nkVar2.f14048b;
                    lkVar3.mo12039b(i, iArr2, iArr4, elVar.f8840b, lkVar3.f12823a, 1);
                    long j5 = joVar.f11724b;
                    int i4 = (int) (j4 - j5);
                    joVar.f11724b = j5 + ((long) i4);
                    joVar.f11723a -= i4;
                }
                nkVar2.mo12645h(this.f14137b.f11723a);
                C2520jo joVar2 = this.f14137b;
                long j6 = joVar2.f11724b;
                ByteBuffer byteBuffer = nkVar2.f14049c;
                int i5 = joVar2.f11723a;
                m17203q(j6);
                while (i5 > 0) {
                    int i6 = (int) (j6 - this.f14140e.f12858a);
                    int min = Math.min(i5, 65536 - i6);
                    C2558kp kpVar = this.f14140e.f12861d;
                    byteBuffer.put(kpVar.f12205a, i6, min);
                    j6 += (long) min;
                    i5 -= min;
                    if (j6 == this.f14140e.f12859b) {
                        this.f14147l.mo13578c(kpVar);
                        C2594lo loVar = this.f14140e;
                        loVar.f12861d = null;
                        this.f14140e = loVar.f12862e;
                    }
                }
                m17203q(this.f14137b.f11725c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long mo12672g() {
        return this.f14136a.mo11738c();
    }

    /* renamed from: h */
    public final C2774qi mo12673h() {
        return this.f14136a.mo11741f();
    }

    /* renamed from: i */
    public final void mo12674i() {
        if (this.f14139d.getAndSet(2) == 0) {
            m17202p();
        }
    }

    /* renamed from: j */
    public final void mo12675j(boolean z) {
        int andSet = this.f14139d.getAndSet(true != z ? 2 : 0);
        m17202p();
        this.f14136a.mo11745j();
        if (andSet == 2) {
            this.f14142g = null;
        }
    }

    /* renamed from: k */
    public final void mo12676k(C2631mo moVar) {
        this.f14146k = moVar;
    }

    /* renamed from: l */
    public final void mo12677l() {
        long d = this.f14136a.mo11739d();
        if (d != -1) {
            m17203q(d);
        }
    }

    /* renamed from: m */
    public final boolean mo12678m() {
        return this.f14136a.mo11747l();
    }

    /* renamed from: n */
    public final boolean mo12679n(long j, boolean z) {
        long e = this.f14136a.mo11740e(j, z);
        if (e == -1) {
            return false;
        }
        m17203q(e);
        return true;
    }
}
