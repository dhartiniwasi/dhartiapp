package androidx.core.p010os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.e */
/* compiled from: CancellationSignal */
public final class C0763e {

    /* renamed from: a */
    private boolean f2326a;

    /* renamed from: b */
    private C0765b f2327b;

    /* renamed from: c */
    private Object f2328c;

    /* renamed from: d */
    private boolean f2329d;

    /* renamed from: androidx.core.os.e$a */
    /* compiled from: CancellationSignal */
    static class C0764a {
        /* renamed from: a */
        static void m3516a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m3517b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.e$b */
    /* compiled from: CancellationSignal */
    public interface C0765b {
        /* renamed from: a */
        void mo3142a();
    }

    /* renamed from: d */
    private void m3512d() {
        while (this.f2329d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo3142a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        androidx.core.p010os.C0763e.C0764a.m3516a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f2329d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f2329d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3139a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f2326a     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return
        L_0x0007:
            r0 = 1
            r4.f2326a = r0     // Catch:{ all -> 0x003c }
            r4.f2329d = r0     // Catch:{ all -> 0x003c }
            androidx.core.os.e$b r0 = r4.f2327b     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r4.f2328c     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo3142a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0026
        L_0x001a:
            if (r1 == 0) goto L_0x0031
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0031
            androidx.core.p010os.C0763e.C0764a.m3516a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x0031
        L_0x0026:
            monitor-enter(r4)
            r4.f2329d = r2     // Catch:{ all -> 0x002e }
            r4.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            monitor-enter(r4)
            r4.f2329d = r2     // Catch:{ all -> 0x0039 }
            r4.notifyAll()     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p010os.C0763e.mo3139a():void");
    }

    /* renamed from: b */
    public boolean mo3140b() {
        boolean z;
        synchronized (this) {
            z = this.f2326a;
        }
        return z;
    }

    /* renamed from: c */
    public void mo3141c(C0765b bVar) {
        synchronized (this) {
            m3512d();
            if (this.f2327b != bVar) {
                this.f2327b = bVar;
                if (this.f2326a) {
                    if (bVar != null) {
                        bVar.mo3142a();
                    }
                }
            }
        }
    }
}
