package p021c2;

import java.util.ArrayDeque;
import p021c2.C1847f;
import p021c2.C1848g;
import p021c2.C1850h;
import p161w3.C5917a;

/* renamed from: c2.j */
/* compiled from: SimpleDecoder */
public abstract class C1853j<I extends C1848g, O extends C1850h, E extends C1847f> implements C1845d<I, O, E> {

    /* renamed from: a */
    private final Thread f5445a;

    /* renamed from: b */
    private final Object f5446b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f5447c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f5448d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f5449e;

    /* renamed from: f */
    private final O[] f5450f;

    /* renamed from: g */
    private int f5451g;

    /* renamed from: h */
    private int f5452h;

    /* renamed from: i */
    private I f5453i;

    /* renamed from: j */
    private E f5454j;

    /* renamed from: k */
    private boolean f5455k;

    /* renamed from: l */
    private boolean f5456l;

    /* renamed from: m */
    private int f5457m;

    /* renamed from: c2.j$a */
    /* compiled from: SimpleDecoder */
    class C1854a extends Thread {
        C1854a(String str) {
            super(str);
        }

        public void run() {
            C1853j.this.m8588u();
        }
    }

    protected C1853j(I[] iArr, O[] oArr) {
        this.f5449e = iArr;
        this.f5451g = iArr.length;
        for (int i = 0; i < this.f5451g; i++) {
            this.f5449e[i] = mo7057h();
        }
        this.f5450f = oArr;
        this.f5452h = oArr.length;
        for (int i2 = 0; i2 < this.f5452h; i2++) {
            this.f5450f[i2] = mo7058i();
        }
        C1854a aVar = new C1854a("ExoPlayer:SimpleDecoder");
        this.f5445a = aVar;
        aVar.start();
    }

    /* renamed from: g */
    private boolean m8582g() {
        return !this.f5447c.isEmpty() && this.f5452h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo7034s() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo7028k(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo7033r() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo7028k(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1.mo7035t() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r3.mo7028k(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = mo7060k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r0 = mo7059j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = mo7059j(r0);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8583l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5446b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f5456l     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m8582g()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f5446b     // Catch:{ all -> 0x009b }
            r1.wait()     // Catch:{ all -> 0x009b }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f5456l     // Catch:{ all -> 0x009b }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f5447c     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x009b }
            c2.g r1 = (p021c2.C1848g) r1     // Catch:{ all -> 0x009b }
            O[] r3 = r6.f5450f     // Catch:{ all -> 0x009b }
            int r4 = r6.f5452h     // Catch:{ all -> 0x009b }
            r5 = 1
            int r4 = r4 - r5
            r6.f5452h = r4     // Catch:{ all -> 0x009b }
            r3 = r3[r4]     // Catch:{ all -> 0x009b }
            boolean r4 = r6.f5455k     // Catch:{ all -> 0x009b }
            r6.f5455k = r2     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            boolean r0 = r1.mo7034s()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo7028k(r0)
            goto L_0x006e
        L_0x003c:
            boolean r0 = r1.mo7033r()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo7028k(r0)
        L_0x0047:
            boolean r0 = r1.mo7035t()
            if (r0 == 0) goto L_0x0052
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.mo7028k(r0)
        L_0x0052:
            c2.f r0 = r6.mo7060k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x005d, OutOfMemoryError -> 0x0057 }
            goto L_0x0062
        L_0x0057:
            r0 = move-exception
            c2.f r0 = r6.mo7059j(r0)
            goto L_0x0062
        L_0x005d:
            r0 = move-exception
            c2.f r0 = r6.mo7059j(r0)
        L_0x0062:
            if (r0 == 0) goto L_0x006e
            java.lang.Object r4 = r6.f5446b
            monitor-enter(r4)
            r6.f5454j = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            java.lang.Object r4 = r6.f5446b
            monitor-enter(r4)
            boolean r0 = r6.f5455k     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0079
            r3.mo7053w()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0079:
            boolean r0 = r3.mo7033r()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0088
            int r0 = r6.f5457m     // Catch:{ all -> 0x0098 }
            int r0 = r0 + r5
            r6.f5457m = r0     // Catch:{ all -> 0x0098 }
            r3.mo7053w()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0088:
            int r0 = r6.f5457m     // Catch:{ all -> 0x0098 }
            r3.f5439c = r0     // Catch:{ all -> 0x0098 }
            r6.f5457m = r2     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque<O> r0 = r6.f5448d     // Catch:{ all -> 0x0098 }
            r0.addLast(r3)     // Catch:{ all -> 0x0098 }
        L_0x0093:
            r6.m8586r(r1)     // Catch:{ all -> 0x0098 }
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            return r5
        L_0x0098:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c2.C1853j.m8583l():boolean");
    }

    /* renamed from: o */
    private void m8584o() {
        if (m8582g()) {
            this.f5446b.notify();
        }
    }

    /* renamed from: p */
    private void m8585p() throws C1847f {
        E e = this.f5454j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: r */
    private void m8586r(I i) {
        i.mo7029n();
        I[] iArr = this.f5449e;
        int i2 = this.f5451g;
        this.f5451g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: t */
    private void m8587t(O o) {
        o.mo7029n();
        O[] oArr = this.f5450f;
        int i = this.f5452h;
        this.f5452h = i + 1;
        oArr[i] = o;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m8588u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m8583l());
    }

    /* renamed from: a */
    public void mo7041a() {
        synchronized (this.f5446b) {
            this.f5456l = true;
            this.f5446b.notify();
        }
        try {
            this.f5445a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f5446b) {
            this.f5455k = true;
            this.f5457m = 0;
            I i = this.f5453i;
            if (i != null) {
                m8586r(i);
                this.f5453i = null;
            }
            while (!this.f5447c.isEmpty()) {
                m8586r((C1848g) this.f5447c.removeFirst());
            }
            while (!this.f5448d.isEmpty()) {
                ((C1850h) this.f5448d.removeFirst()).mo7053w();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract I mo7057h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract O mo7058i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract E mo7059j(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract E mo7060k(I i, O o, boolean z);

    /* renamed from: m */
    public final I mo7043d() throws C1847f {
        I i;
        synchronized (this.f5446b) {
            m8585p();
            C5917a.m34873f(this.f5453i == null);
            int i2 = this.f5451g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f5449e;
                int i3 = i2 - 1;
                this.f5451g = i3;
                i = iArr[i3];
            }
            this.f5453i = i;
        }
        return i;
    }

    /* renamed from: n */
    public final O mo7042c() throws C1847f {
        synchronized (this.f5446b) {
            m8585p();
            if (this.f5448d.isEmpty()) {
                return null;
            }
            O o = (C1850h) this.f5448d.removeFirst();
            return o;
        }
    }

    /* renamed from: q */
    public final void mo7044e(I i) throws C1847f {
        synchronized (this.f5446b) {
            m8585p();
            C5917a.m34868a(i == this.f5453i);
            this.f5447c.addLast(i);
            m8584o();
            this.f5453i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo7064s(O o) {
        synchronized (this.f5446b) {
            m8587t(o);
            m8584o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo7065v(int i) {
        C5917a.m34873f(this.f5451g == this.f5449e.length);
        for (I x : this.f5449e) {
            x.mo7050x(i);
        }
    }
}
