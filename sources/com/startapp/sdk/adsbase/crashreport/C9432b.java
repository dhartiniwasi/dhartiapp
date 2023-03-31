package com.startapp.sdk.adsbase.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import com.startapp.C9605vb;
import com.startapp.sdk.components.C9507j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.adsbase.crashreport.b */
/* compiled from: Sta */
public class C9432b extends Thread implements Handler.Callback, Printer {

    /* renamed from: a */
    public C9436d f38862a = new C9433a(this);

    /* renamed from: b */
    public C9437e f38863b = new C9434b(this);

    /* renamed from: c */
    public C9439g f38864c = new C9435c(this);

    /* renamed from: d */
    public C9438f f38865d;

    /* renamed from: e */
    public final Handler f38866e = new Handler(Looper.getMainLooper(), this);

    /* renamed from: f */
    public final AtomicLong f38867f = new AtomicLong(0);

    /* renamed from: g */
    public final long f38868g;

    /* renamed from: h */
    public final AtomicReference<String> f38869h = new AtomicReference<>("");

    /* renamed from: i */
    public final boolean f38870i;

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$a */
    /* compiled from: Sta */
    public class C9433a implements C9436d {
        public C9433a(C9432b bVar) {
        }

        /* renamed from: a */
        public void mo30781a() {
        }

        /* renamed from: a */
        public boolean mo30782a(long j, String str) {
            return false;
        }

        public void remove() {
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$b */
    /* compiled from: Sta */
    public class C9434b implements C9437e {
        public C9434b(C9432b bVar) {
        }

        /* renamed from: a */
        public long mo30790a(long j) {
            return 0;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$c */
    /* compiled from: Sta */
    public class C9435c implements C9439g {
        public C9435c(C9432b bVar) {
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$d */
    /* compiled from: Sta */
    public interface C9436d {
        /* renamed from: a */
        void mo30781a();

        /* renamed from: a */
        boolean mo30782a(long j, String str);

        void remove();
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$e */
    /* compiled from: Sta */
    public interface C9437e {
        /* renamed from: a */
        long mo30790a(long j);
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$f */
    /* compiled from: Sta */
    public interface C9438f {
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$g */
    /* compiled from: Sta */
    public interface C9439g {
    }

    public C9432b(long j, boolean z) {
        super("startapp-anr");
        this.f38868g = j;
        this.f38870i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0048 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30784a() {
        /*
            r12 = this;
            long r0 = r12.f38868g
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1
        L_0x0006:
            boolean r6 = r12.isInterrupted()
            if (r6 != 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicLong r6 = r12.f38867f
            long r6 = r6.getAndAdd(r0)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r5 = r12.f38869h
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r12.mo30785a(r5)
            if (r5 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.crashreport.b$d r4 = r12.f38862a
            r4.remove()
            r4 = 0
        L_0x002e:
            android.os.Handler r5 = r12.f38866e
            r6 = 101(0x65, float:1.42E-43)
            r5.sendEmptyMessage(r6)
            r5 = 1
        L_0x0036:
            monitor-enter(r12)     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
            r12.wait(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            r6 = 0
            goto L_0x0046
        L_0x003d:
            r6 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            throw r6     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
        L_0x0040:
            com.startapp.sdk.adsbase.crashreport.b$g r6 = r12.f38864c
            r6.getClass()
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x0049
            return
        L_0x0049:
            java.util.concurrent.atomic.AtomicLong r6 = r12.f38867f
            long r6 = r6.get()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r10 = r12.f38869h
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0006
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0065
            boolean r11 = r12.mo30785a(r10)
            if (r11 == 0) goto L_0x0006
        L_0x0065:
            boolean r11 = android.os.Debug.isDebuggerConnected()
            if (r11 != 0) goto L_0x0088
            boolean r11 = android.os.Debug.waitingForDebugger()
            if (r11 == 0) goto L_0x0072
            goto L_0x0088
        L_0x0072:
            com.startapp.sdk.adsbase.crashreport.b$e r0 = r12.f38863b
            long r0 = r0.mo30790a(r6)
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x007e
            r5 = 0
            goto L_0x0006
        L_0x007e:
            com.startapp.sdk.adsbase.crashreport.b$d r0 = r12.f38862a
            boolean r4 = r0.mo30782a(r6, r10)
            long r0 = r12.f38868g
            goto L_0x0006
        L_0x0088:
            r4 = 1
            goto L_0x0006
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.crashreport.C9432b.mo30784a():void");
    }

    public boolean handleMessage(Message message) {
        this.f38867f.set(0);
        return true;
    }

    public void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f38869h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f38869h.set("");
            this.f38867f.set(0);
        }
    }

    public void run() {
        try {
            mo30784a();
        } catch (Throwable unused) {
        }
    }

    public void start() {
        this.f38862a.mo30781a();
        this.f38862a.remove();
        if (this.f38870i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    /* renamed from: a */
    public final boolean mo30785a(String str) {
        boolean z = !this.f38870i || !TextUtils.isEmpty(str);
        C9438f fVar = this.f38865d;
        boolean z2 = fVar == null || (C9605vb.m50479e(((C9507j) fVar).f39109a.f39105a) ^ true);
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
