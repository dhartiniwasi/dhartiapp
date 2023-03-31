package p361tc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p182a7.C6431n;
import p336qe.C12231c;
import p381vc.C12873c;

/* renamed from: tc.q */
/* compiled from: OutboundFlowController */
class C12632q {

    /* renamed from: a */
    private final C12636d f46371a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12873c f46372b;

    /* renamed from: c */
    private int f46373c = 65535;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12635c f46374d = new C12635c(0, 65535, (C12634b) null);

    /* renamed from: tc.q$b */
    /* compiled from: OutboundFlowController */
    public interface C12634b {
        /* renamed from: b */
        void mo37523b(int i);
    }

    /* renamed from: tc.q$c */
    /* compiled from: OutboundFlowController */
    public final class C12635c {

        /* renamed from: a */
        private final C12231c f46375a = new C12231c();

        /* renamed from: b */
        private Runnable f46376b;

        /* renamed from: c */
        private final int f46377c;

        /* renamed from: d */
        private int f46378d;

        /* renamed from: e */
        private int f46379e;

        /* renamed from: f */
        private final C12634b f46380f;

        /* renamed from: g */
        private boolean f46381g = false;

        C12635c(int i, int i2, C12634b bVar) {
            this.f46377c = i;
            this.f46378d = i2;
            this.f46380f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37524a(int i) {
            this.f46379e += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo37525b() {
            return this.f46379e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37526c() {
            this.f46379e = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37527d(C12231c cVar, int i, boolean z) {
            this.f46375a.mo35694k1(cVar, (long) i);
            this.f46381g |= z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37528e() {
            return this.f46375a.mo36771I() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo37529f(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.f46378d) {
                int i2 = this.f46378d + i;
                this.f46378d = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f46377c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo37530g() {
            return Math.max(0, Math.min(this.f46378d, (int) this.f46375a.mo36771I()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo37531h() {
            return mo37530g() - this.f46379e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo37532i() {
            return this.f46378d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo37533j() {
            return Math.min(this.f46378d, C12632q.this.f46374d.mo37532i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo37534k(C12231c cVar, int i, boolean z) {
            do {
                int min = Math.min(i, C12632q.this.f46372b.mo37450t1());
                int i2 = -min;
                C12632q.this.f46374d.mo37529f(i2);
                mo37529f(i2);
                try {
                    C12632q.this.f46372b.mo37443L0(cVar.mo36771I() == ((long) min) && z, this.f46377c, cVar, min);
                    this.f46380f.mo37523b(min);
                    i -= min;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo37535l(int i, C12637e eVar) {
            Runnable runnable;
            int min = Math.min(i, mo37533j());
            int i2 = 0;
            while (mo37528e() && min > 0) {
                if (((long) min) >= this.f46375a.mo36771I()) {
                    i2 += (int) this.f46375a.mo36771I();
                    C12231c cVar = this.f46375a;
                    mo37534k(cVar, (int) cVar.mo36771I(), this.f46381g);
                } else {
                    i2 += min;
                    mo37534k(this.f46375a, min, false);
                }
                eVar.mo37537b();
                min = Math.min(i - i2, mo37533j());
            }
            if (!mo37528e() && (runnable = this.f46376b) != null) {
                runnable.run();
                this.f46376b = null;
            }
            return i2;
        }
    }

    /* renamed from: tc.q$d */
    /* compiled from: OutboundFlowController */
    public interface C12636d {
        /* renamed from: a */
        C12635c[] mo37482a();
    }

    /* renamed from: tc.q$e */
    /* compiled from: OutboundFlowController */
    private static final class C12637e {

        /* renamed from: a */
        int f46383a;

        private C12637e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37536a() {
            return this.f46383a > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37537b() {
            this.f46383a++;
        }
    }

    public C12632q(C12636d dVar, C12873c cVar) {
        this.f46371a = (C12636d) C6431n.m37562o(dVar, "transport");
        this.f46372b = (C12873c) C6431n.m37562o(cVar, "frameWriter");
    }

    /* renamed from: c */
    public C12635c mo37517c(C12634b bVar, int i) {
        return new C12635c(i, this.f46373c, (C12634b) C6431n.m37562o(bVar, "stream"));
    }

    /* renamed from: d */
    public void mo37518d(boolean z, C12635c cVar, C12231c cVar2, boolean z2) {
        C6431n.m37562o(cVar2, "source");
        int j = cVar.mo37533j();
        boolean e = cVar.mo37528e();
        int I = (int) cVar2.mo36771I();
        if (e || j < I) {
            if (!e && j > 0) {
                cVar.mo37534k(cVar2, j, false);
            }
            cVar.mo37527d(cVar2, (int) cVar2.mo36771I(), z);
        } else {
            cVar.mo37534k(cVar2, I, z);
        }
        if (z2) {
            mo37519e();
        }
    }

    /* renamed from: e */
    public void mo37519e() {
        try {
            this.f46372b.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public boolean mo37520f(int i) {
        if (i >= 0) {
            int i2 = i - this.f46373c;
            this.f46373c = i;
            for (C12635c f : this.f46371a.mo37482a()) {
                f.mo37529f(i2);
            }
            if (i2 > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i);
    }

    /* renamed from: g */
    public int mo37521g(C12635c cVar, int i) {
        if (cVar == null) {
            int f = this.f46374d.mo37529f(i);
            mo37522h();
            return f;
        }
        int f2 = cVar.mo37529f(i);
        C12637e eVar = new C12637e();
        cVar.mo37535l(cVar.mo37533j(), eVar);
        if (eVar.mo37536a()) {
            mo37519e();
        }
        return f2;
    }

    /* renamed from: h */
    public void mo37522h() {
        int i;
        C12635c[] a = this.f46371a.mo37482a();
        Collections.shuffle(Arrays.asList(a));
        int i2 = this.f46374d.mo37532i();
        int length = a.length;
        while (true) {
            i = 0;
            if (length <= 0 || i2 <= 0) {
                C12637e eVar = new C12637e();
                C12635c[] a2 = this.f46371a.mo37482a();
                int length2 = a2.length;
            } else {
                int ceil = (int) Math.ceil((double) (((float) i2) / ((float) length)));
                for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                    C12635c cVar = a[i3];
                    int min = Math.min(i2, Math.min(cVar.mo37531h(), ceil));
                    if (min > 0) {
                        cVar.mo37524a(min);
                        i2 -= min;
                    }
                    if (cVar.mo37531h() > 0) {
                        a[i] = cVar;
                        i++;
                    }
                }
                length = i;
            }
        }
        C12637e eVar2 = new C12637e();
        C12635c[] a22 = this.f46371a.mo37482a();
        int length22 = a22.length;
        while (i < length22) {
            C12635c cVar2 = a22[i];
            cVar2.mo37535l(cVar2.mo37525b(), eVar2);
            cVar2.mo37526c();
            i++;
        }
        if (eVar2.mo37536a()) {
            mo37519e();
        }
    }
}
