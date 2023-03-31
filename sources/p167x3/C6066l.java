package p167x3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: x3.l */
/* compiled from: VideoFrameReleaseHelper */
public final class C6066l {

    /* renamed from: a */
    private final C6055e f29415a = new C6055e();

    /* renamed from: b */
    private final C6068b f29416b;

    /* renamed from: c */
    private final C6072e f29417c;

    /* renamed from: d */
    private boolean f29418d;

    /* renamed from: e */
    private Surface f29419e;

    /* renamed from: f */
    private float f29420f;

    /* renamed from: g */
    private float f29421g;

    /* renamed from: h */
    private float f29422h;

    /* renamed from: i */
    private float f29423i;

    /* renamed from: j */
    private int f29424j;

    /* renamed from: k */
    private long f29425k;

    /* renamed from: l */
    private long f29426l;

    /* renamed from: m */
    private long f29427m;

    /* renamed from: n */
    private long f29428n;

    /* renamed from: o */
    private long f29429o;

    /* renamed from: p */
    private long f29430p;

    /* renamed from: q */
    private long f29431q;

    /* renamed from: x3.l$a */
    /* compiled from: VideoFrameReleaseHelper */
    private static final class C6067a {
        /* renamed from: a */
        public static void m35615a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                C5961r.m35210d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: x3.l$b */
    /* compiled from: VideoFrameReleaseHelper */
    private interface C6068b {

        /* renamed from: x3.l$b$a */
        /* compiled from: VideoFrameReleaseHelper */
        public interface C6069a {
            /* renamed from: a */
            void mo20842a(Display display);
        }

        /* renamed from: a */
        void mo20840a(C6069a aVar);

        /* renamed from: b */
        void mo20841b();
    }

    /* renamed from: x3.l$c */
    /* compiled from: VideoFrameReleaseHelper */
    private static final class C6070c implements C6068b {

        /* renamed from: a */
        private final WindowManager f29432a;

        private C6070c(WindowManager windowManager) {
            this.f29432a = windowManager;
        }

        /* renamed from: c */
        public static C6068b m35619c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C6070c(windowManager);
            }
            return null;
        }

        /* renamed from: a */
        public void mo20840a(C6068b.C6069a aVar) {
            aVar.mo20842a(this.f29432a.getDefaultDisplay());
        }

        /* renamed from: b */
        public void mo20841b() {
        }
    }

    /* renamed from: x3.l$d */
    /* compiled from: VideoFrameReleaseHelper */
    private static final class C6071d implements C6068b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f29433a;

        /* renamed from: b */
        private C6068b.C6069a f29434b;

        private C6071d(DisplayManager displayManager) {
            this.f29433a = displayManager;
        }

        /* renamed from: c */
        private Display m35622c() {
            return this.f29433a.getDisplay(0);
        }

        /* renamed from: d */
        public static C6068b m35623d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C6071d(displayManager);
            }
            return null;
        }

        /* renamed from: a */
        public void mo20840a(C6068b.C6069a aVar) {
            this.f29434b = aVar;
            this.f29433a.registerDisplayListener(this, C5953m0.m35164w());
            aVar.mo20842a(m35622c());
        }

        /* renamed from: b */
        public void mo20841b() {
            this.f29433a.unregisterDisplayListener(this);
            this.f29434b = null;
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            C6068b.C6069a aVar = this.f29434b;
            if (aVar != null && i == 0) {
                aVar.mo20842a(m35622c());
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: x3.l$e */
    /* compiled from: VideoFrameReleaseHelper */
    private static final class C6072e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final C6072e f29435f = new C6072e();

        /* renamed from: a */
        public volatile long f29436a = -9223372036854775807L;

        /* renamed from: b */
        private final Handler f29437b;

        /* renamed from: c */
        private final HandlerThread f29438c;

        /* renamed from: d */
        private Choreographer f29439d;

        /* renamed from: e */
        private int f29440e;

        private C6072e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f29438c = handlerThread;
            handlerThread.start();
            Handler v = C5953m0.m35162v(handlerThread.getLooper(), this);
            this.f29437b = v;
            v.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m35626b() {
            Choreographer choreographer = this.f29439d;
            if (choreographer != null) {
                int i = this.f29440e + 1;
                this.f29440e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        private void m35627c() {
            try {
                this.f29439d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                C5961r.m35216j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        /* renamed from: d */
        public static C6072e m35628d() {
            return f29435f;
        }

        /* renamed from: f */
        private void m35629f() {
            Choreographer choreographer = this.f29439d;
            if (choreographer != null) {
                int i = this.f29440e - 1;
                this.f29440e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f29436a = -9223372036854775807L;
                }
            }
        }

        /* renamed from: a */
        public void mo20846a() {
            this.f29437b.sendEmptyMessage(1);
        }

        public void doFrame(long j) {
            this.f29436a = j;
            ((Choreographer) C5917a.m34872e(this.f29439d)).postFrameCallbackDelayed(this, 500);
        }

        /* renamed from: e */
        public void mo20848e() {
            this.f29437b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m35627c();
                return true;
            } else if (i == 1) {
                m35626b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m35629f();
                return true;
            }
        }
    }

    public C6066l(Context context) {
        C6068b f = m35601f(context);
        this.f29416b = f;
        this.f29417c = f != null ? C6072e.m35628d() : null;
        this.f29425k = -9223372036854775807L;
        this.f29426l = -9223372036854775807L;
        this.f29420f = -1.0f;
        this.f29423i = 1.0f;
        this.f29424j = 0;
    }

    /* renamed from: c */
    private static boolean m35598c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: d */
    private void m35599d() {
        Surface surface;
        if (C5953m0.f29110a >= 30 && (surface = this.f29419e) != null && this.f29424j != Integer.MIN_VALUE && this.f29422h != 0.0f) {
            this.f29422h = 0.0f;
            C6067a.m35615a(surface, 0.0f);
        }
    }

    /* renamed from: e */
    private static long m35600e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: f */
    private static C6068b m35601f(Context context) {
        C6068b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C5953m0.f29110a >= 17) {
            bVar = C6071d.m35623d(applicationContext);
        }
        return bVar == null ? C6070c.m35619c(applicationContext) : bVar;
    }

    /* renamed from: n */
    private void m35602n() {
        this.f29427m = 0;
        this.f29430p = -1;
        this.f29428n = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m35603p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f29425k = refreshRate;
            this.f29426l = (refreshRate * 80) / 100;
            return;
        }
        C5961r.m35215i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f29425k = -9223372036854775807L;
        this.f29426l = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f29421g) >= (r8.f29415a.mo20800e() && (r8.f29415a.mo20799d() > 5000000000L ? 1 : (r8.f29415a.mo20799d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r8.f29415a.mo20798c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35604q() {
        /*
            r8 = this;
            int r0 = p161w3.C5953m0.f29110a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r8.f29419e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            x3.e r0 = r8.f29415a
            boolean r0 = r0.mo20800e()
            if (r0 == 0) goto L_0x001b
            x3.e r0 = r8.f29415a
            float r0 = r0.mo20797b()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f29420f
        L_0x001d:
            float r2 = r8.f29421g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            x3.e r1 = r8.f29415a
            boolean r1 = r1.mo20800e()
            if (r1 == 0) goto L_0x0049
            x3.e r1 = r8.f29415a
            long r1 = r1.mo20799d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f29421g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r5 = 0
            goto L_0x006c
        L_0x0061:
            if (r6 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            x3.e r2 = r8.f29415a
            int r2 = r2.mo20798c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            r8.f29421g = r0
            r8.m35605r(r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p167x3.C6066l.m35604q():void");
    }

    /* renamed from: r */
    private void m35605r(boolean z) {
        Surface surface;
        if (C5953m0.f29110a >= 30 && (surface = this.f29419e) != null && this.f29424j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f29418d) {
                float f2 = this.f29421g;
                if (f2 != -1.0f) {
                    f = this.f29423i * f2;
                }
            }
            if (z || this.f29422h != f) {
                this.f29422h = f;
                C6067a.m35615a(surface, f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo20831b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f29430p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            x3.e r0 = r10.f29415a
            boolean r0 = r0.mo20800e()
            if (r0 == 0) goto L_0x0030
            x3.e r0 = r10.f29415a
            long r0 = r0.mo20796a()
            long r2 = r10.f29431q
            long r4 = r10.f29427m
            long r6 = r10.f29430p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f29423i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = m35598c(r11, r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.m35602n()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.f29427m
            r10.f29428n = r11
            r10.f29429o = r4
            x3.l$e r11 = r10.f29417c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.f29425k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f29436a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.f29425k
            long r11 = m35600e(r4, r6, r8)
            long r0 = r10.f29426l
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p167x3.C6066l.mo20831b(long):long");
    }

    /* renamed from: g */
    public void mo20832g(float f) {
        this.f29420f = f;
        this.f29415a.mo20802g();
        m35604q();
    }

    /* renamed from: h */
    public void mo20833h(long j) {
        long j2 = this.f29428n;
        if (j2 != -1) {
            this.f29430p = j2;
            this.f29431q = this.f29429o;
        }
        this.f29427m++;
        this.f29415a.mo20801f(j * 1000);
        m35604q();
    }

    /* renamed from: i */
    public void mo20834i(float f) {
        this.f29423i = f;
        m35602n();
        m35605r(false);
    }

    /* renamed from: j */
    public void mo20835j() {
        m35602n();
    }

    /* renamed from: k */
    public void mo20836k() {
        this.f29418d = true;
        m35602n();
        if (this.f29416b != null) {
            ((C6072e) C5917a.m34872e(this.f29417c)).mo20846a();
            this.f29416b.mo20840a(new C12962k(this));
        }
        m35605r(false);
    }

    /* renamed from: l */
    public void mo20837l() {
        this.f29418d = false;
        C6068b bVar = this.f29416b;
        if (bVar != null) {
            bVar.mo20841b();
            ((C6072e) C5917a.m34872e(this.f29417c)).mo20848e();
        }
        m35599d();
    }

    /* renamed from: m */
    public void mo20838m(Surface surface) {
        if (surface instanceof C6062i) {
            surface = null;
        }
        if (this.f29419e != surface) {
            m35599d();
            this.f29419e = surface;
            m35605r(true);
        }
    }

    /* renamed from: o */
    public void mo20839o(int i) {
        if (this.f29424j != i) {
            this.f29424j = i;
            m35605r(true);
        }
    }
}
