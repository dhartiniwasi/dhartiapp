package p244ge;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p253he.C10540b;
import p273je.C11590k;

/* renamed from: ge.c0 */
/* compiled from: RealCall */
final class C10357c0 implements C10366f {

    /* renamed from: a */
    final C10351a0 f41041a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11590k f41042b;

    /* renamed from: c */
    final C10360d0 f41043c;

    /* renamed from: d */
    final boolean f41044d;

    /* renamed from: e */
    private boolean f41045e;

    /* renamed from: ge.c0$a */
    /* compiled from: RealCall */
    final class C10358a extends C10540b {

        /* renamed from: b */
        private final C10369g f41046b;

        /* renamed from: c */
        private volatile AtomicInteger f41047c;

        /* renamed from: d */
        final /* synthetic */ C10357c0 f41048d;

        static {
            Class<C10357c0> cls = C10357c0.class;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33250a() {
            /*
                r5 = this;
                ge.c0 r0 = r5.f41048d
                je.k r0 = r0.f41042b
                r0.mo35746p()
                r0 = 0
                ge.c0 r1 = r5.f41048d     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                ge.f0 r0 = r1.mo33245d()     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                r1 = 1
                ge.g r2 = r5.f41046b     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                ge.c0 r3 = r5.f41048d     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.mo33319a(r3, r0)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            L_0x0018:
                ge.c0 r0 = r5.f41048d
                ge.a0 r0 = r0.f41041a
                ge.p r0 = r0.mo33213h()
                r0.mo33369c(r5)
                goto L_0x0082
            L_0x0024:
                r0 = move-exception
                goto L_0x002b
            L_0x0026:
                r0 = move-exception
                goto L_0x0058
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x002b:
                ge.c0 r2 = r5.f41048d     // Catch:{ all -> 0x0053 }
                r2.mo33242b()     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0052
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0053 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r2.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                r2.append(r0)     // Catch:{ all -> 0x0053 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0053 }
                r1.<init>(r2)     // Catch:{ all -> 0x0053 }
                r1.addSuppressed(r0)     // Catch:{ all -> 0x0053 }
                ge.g r2 = r5.f41046b     // Catch:{ all -> 0x0053 }
                ge.c0 r3 = r5.f41048d     // Catch:{ all -> 0x0053 }
                r2.mo33320b(r3, r1)     // Catch:{ all -> 0x0053 }
            L_0x0052:
                throw r0     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r0 = move-exception
                goto L_0x0083
            L_0x0055:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0058:
                if (r1 == 0) goto L_0x007a
                ne.f r1 = p309ne.C12008f.m57887l()     // Catch:{ all -> 0x0053 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r3.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                ge.c0 r4 = r5.f41048d     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = r4.mo33248h()     // Catch:{ all -> 0x0053 }
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0053 }
                r1.mo36363s(r2, r3, r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x007a:
                ge.g r1 = r5.f41046b     // Catch:{ all -> 0x0053 }
                ge.c0 r2 = r5.f41048d     // Catch:{ all -> 0x0053 }
                r1.mo33320b(r2, r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x0082:
                return
            L_0x0083:
                ge.c0 r1 = r5.f41048d
                ge.a0 r1 = r1.f41041a
                ge.p r1 = r1.mo33213h()
                r1.mo33369c(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p244ge.C10357c0.C10358a.mo33250a():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public AtomicInteger mo33251b() {
            return this.f41047c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo33252d(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.f41048d.f41042b.mo35742l(interruptedIOException);
                this.f41046b.mo33320b(this.f41048d, interruptedIOException);
                this.f41048d.f41041a.mo33213h().mo33369c(this);
            } catch (Throwable th) {
                this.f41048d.f41041a.mo33213h().mo33369c(this);
                throw th;
            }
        }
    }

    private C10357c0(C10351a0 a0Var, C10360d0 d0Var, boolean z) {
        this.f41041a = a0Var;
        this.f41043c = d0Var;
        this.f41044d = z;
    }

    /* renamed from: f */
    static C10357c0 m52305f(C10351a0 a0Var, C10360d0 d0Var, boolean z) {
        C10357c0 c0Var = new C10357c0(a0Var, d0Var, z);
        c0Var.f41042b = new C11590k(a0Var, c0Var);
        return c0Var;
    }

    /* renamed from: b */
    public void mo33242b() {
        this.f41042b.mo35736d();
    }

    /* renamed from: c */
    public C10357c0 clone() {
        return m52305f(this.f41041a, this.f41043c, this.f41044d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p244ge.C10367f0 mo33245d() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ge.a0 r0 = r11.f41041a
            java.util.List r0 = r0.mo33219n()
            r1.addAll(r0)
            ke.j r0 = new ke.j
            ge.a0 r2 = r11.f41041a
            r0.<init>(r2)
            r1.add(r0)
            ke.a r0 = new ke.a
            ge.a0 r2 = r11.f41041a
            ge.o r2 = r2.mo33212g()
            r0.<init>(r2)
            r1.add(r0)
            ie.a r0 = new ie.a
            ge.a0 r2 = r11.f41041a
            ie.d r2 = r2.mo33220o()
            r0.<init>(r2)
            r1.add(r0)
            je.a r0 = new je.a
            ge.a0 r2 = r11.f41041a
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f41044d
            if (r0 != 0) goto L_0x004b
            ge.a0 r0 = r11.f41041a
            java.util.List r0 = r0.mo33221p()
            r1.addAll(r0)
        L_0x004b:
            ke.b r0 = new ke.b
            boolean r2 = r11.f41044d
            r0.<init>(r2)
            r1.add(r0)
            ke.g r10 = new ke.g
            je.k r2 = r11.f41042b
            r3 = 0
            r4 = 0
            ge.d0 r5 = r11.f41043c
            ge.a0 r0 = r11.f41041a
            int r7 = r0.mo33209d()
            ge.a0 r0 = r11.f41041a
            int r8 = r0.mo33201A()
            ge.a0 r0 = r11.f41041a
            int r9 = r0.mo33205E()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            ge.d0 r2 = r11.f41043c     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            ge.f0 r2 = r10.mo33449c(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            je.k r3 = r11.f41042b     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.mo35740i()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            je.k r0 = r11.f41042b
            r0.mo35742l(r1)
            return r2
        L_0x008a:
            p253he.C10543e.m53045f(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r2 = 1
            je.k r3 = r11.f41042b     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.mo35742l(r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x00aa
            je.k r0 = r11.f41042b
            r0.mo35742l(r1)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p244ge.C10357c0.mo33245d():ge.f0");
    }

    /* renamed from: e */
    public boolean mo33246e() {
        return this.f41042b.mo35740i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo33247g() {
        return this.f41043c.mo33260h().mo33434z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo33248h() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo33246e() ? "canceled " : "");
        sb.append(this.f41044d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo33247g());
        return sb.toString();
    }

    /* renamed from: t */
    public C10367f0 mo33249t() throws IOException {
        synchronized (this) {
            if (!this.f41045e) {
                this.f41045e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f41042b.mo35746p();
        this.f41042b.mo35734b();
        try {
            this.f41041a.mo33213h().mo33367a(this);
            return mo33245d();
        } finally {
            this.f41041a.mo33213h().mo33370d(this);
        }
    }
}
