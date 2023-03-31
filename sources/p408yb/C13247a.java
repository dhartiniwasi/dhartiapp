package p408yb;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p264io.flutter.embedding.engine.FlutterJNI;
import p264io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p264io.flutter.view.C11091f;
import p297mb.C11881b;

/* renamed from: yb.a */
/* compiled from: FlutterRenderer */
public class C13247a implements C11091f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FlutterJNI f47535a;

    /* renamed from: b */
    private final AtomicLong f47536b = new AtomicLong(0);

    /* renamed from: c */
    private Surface f47537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f47538d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f47539e = new Handler();

    /* renamed from: f */
    private final Set<WeakReference<C11091f.C11093b>> f47540f = new HashSet();

    /* renamed from: g */
    private final C13257b f47541g;

    /* renamed from: yb.a$a */
    /* compiled from: FlutterRenderer */
    class C13248a implements C13257b {
        C13248a() {
        }

        /* renamed from: b */
        public void mo33830b() {
            boolean unused = C13247a.this.f47538d = false;
        }

        /* renamed from: d */
        public void mo33831d() {
            boolean unused = C13247a.this.f47538d = true;
        }
    }

    /* renamed from: yb.a$c */
    /* compiled from: FlutterRenderer */
    public enum C13250c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: a */
        public final int f47550a;

        private C13250c(int i) {
            this.f47550a = i;
        }
    }

    /* renamed from: yb.a$d */
    /* compiled from: FlutterRenderer */
    public enum C13251d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: a */
        public final int f47556a;

        private C13251d(int i) {
            this.f47556a = i;
        }
    }

    /* renamed from: yb.a$e */
    /* compiled from: FlutterRenderer */
    static final class C13252e implements Runnable {

        /* renamed from: a */
        private final long f47557a;

        /* renamed from: b */
        private final FlutterJNI f47558b;

        C13252e(long j, FlutterJNI flutterJNI) {
            this.f47557a = j;
            this.f47558b = flutterJNI;
        }

        public void run() {
            if (this.f47558b.isAttached()) {
                C11881b.m57388f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f47557a + ").");
                this.f47558b.unregisterTexture(this.f47557a);
            }
        }
    }

    /* renamed from: yb.a$f */
    /* compiled from: FlutterRenderer */
    final class C13253f implements C11091f.C11094c, C11091f.C11093b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f47559a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f47560b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f47561c;

        /* renamed from: d */
        private C11091f.C11093b f47562d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C11091f.C11092a f47563e;

        /* renamed from: f */
        private final Runnable f47564f;

        /* renamed from: g */
        private SurfaceTexture.OnFrameAvailableListener f47565g = new C13255b();

        /* renamed from: yb.a$f$a */
        /* compiled from: FlutterRenderer */
        class C13254a implements Runnable {
            C13254a() {
            }

            public void run() {
                if (C13253f.this.f47563e != null) {
                    C13253f.this.f47563e.mo34277a();
                }
            }
        }

        /* renamed from: yb.a$f$b */
        /* compiled from: FlutterRenderer */
        class C13255b implements SurfaceTexture.OnFrameAvailableListener {
            C13255b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!C13253f.this.f47561c && C13247a.this.f47535a.isAttached()) {
                    C13253f fVar = C13253f.this;
                    C13247a.this.m62078m(fVar.f47559a);
                }
            }
        }

        C13253f(long j, SurfaceTexture surfaceTexture) {
            C13254a aVar = new C13254a();
            this.f47564f = aVar;
            this.f47559a = j;
            this.f47560b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            if (Build.VERSION.SDK_INT >= 21) {
                mo34885c().setOnFrameAvailableListener(this.f47565g, new Handler());
            } else {
                mo34885c().setOnFrameAvailableListener(this.f47565g);
            }
        }

        /* renamed from: i */
        private void m62102i() {
            C13247a.this.mo38356r(this);
        }

        /* renamed from: a */
        public void mo34883a() {
            if (!this.f47561c) {
                C11881b.m57388f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f47559a + ").");
                this.f47560b.release();
                C13247a.this.m62080y(this.f47559a);
                m62102i();
                this.f47561c = true;
            }
        }

        /* renamed from: b */
        public void mo34884b(C11091f.C11093b bVar) {
            this.f47562d = bVar;
        }

        /* renamed from: c */
        public SurfaceTexture mo34885c() {
            return this.f47560b.surfaceTexture();
        }

        /* renamed from: d */
        public long mo34886d() {
            return this.f47559a;
        }

        /* renamed from: e */
        public void mo34887e(C11091f.C11092a aVar) {
            this.f47563e = aVar;
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                if (!this.f47561c) {
                    C13247a.this.f47539e.post(new C13252e(this.f47559a, C13247a.this.f47535a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: j */
        public SurfaceTextureWrapper mo38365j() {
            return this.f47560b;
        }

        public void onTrimMemory(int i) {
            C11091f.C11093b bVar = this.f47562d;
            if (bVar != null) {
                bVar.onTrimMemory(i);
            }
        }
    }

    /* renamed from: yb.a$g */
    /* compiled from: FlutterRenderer */
    public static final class C13256g {

        /* renamed from: a */
        public float f47569a = 1.0f;

        /* renamed from: b */
        public int f47570b = 0;

        /* renamed from: c */
        public int f47571c = 0;

        /* renamed from: d */
        public int f47572d = 0;

        /* renamed from: e */
        public int f47573e = 0;

        /* renamed from: f */
        public int f47574f = 0;

        /* renamed from: g */
        public int f47575g = 0;

        /* renamed from: h */
        public int f47576h = 0;

        /* renamed from: i */
        public int f47577i = 0;

        /* renamed from: j */
        public int f47578j = 0;

        /* renamed from: k */
        public int f47579k = 0;

        /* renamed from: l */
        public int f47580l = 0;

        /* renamed from: m */
        public int f47581m = 0;

        /* renamed from: n */
        public int f47582n = 0;

        /* renamed from: o */
        public int f47583o = 0;

        /* renamed from: p */
        public int f47584p = -1;

        /* renamed from: q */
        public List<C13249b> f47585q = new ArrayList();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38368a() {
            return this.f47570b > 0 && this.f47571c > 0 && this.f47569a > 0.0f;
        }
    }

    public C13247a(FlutterJNI flutterJNI) {
        C13248a aVar = new C13248a();
        this.f47541g = aVar;
        this.f47535a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* renamed from: i */
    private void m62077i() {
        Iterator<WeakReference<C11091f.C11093b>> it = this.f47540f.iterator();
        while (it.hasNext()) {
            if (((C11091f.C11093b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m62078m(long j) {
        this.f47535a.markTextureFrameAvailable(j);
    }

    /* renamed from: p */
    private void m62079p(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f47535a.registerTexture(j, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m62080y(long j) {
        this.f47535a.unregisterTexture(j);
    }

    /* renamed from: f */
    public void mo38348f(C13257b bVar) {
        this.f47535a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f47538d) {
            bVar.mo33831d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo38349g(C11091f.C11093b bVar) {
        m62077i();
        this.f47540f.add(new WeakReference(bVar));
    }

    /* renamed from: h */
    public C11091f.C11094c mo34869h() {
        C11881b.m57388f("FlutterRenderer", "Creating a SurfaceTexture.");
        return mo38354o(new SurfaceTexture(0));
    }

    /* renamed from: j */
    public void mo38350j(ByteBuffer byteBuffer, int i) {
        this.f47535a.dispatchPointerDataPacket(byteBuffer, i);
    }

    /* renamed from: k */
    public boolean mo38351k() {
        return this.f47538d;
    }

    /* renamed from: l */
    public boolean mo38352l() {
        return this.f47535a.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: n */
    public void mo38353n(int i) {
        Iterator<WeakReference<C11091f.C11093b>> it = this.f47540f.iterator();
        while (it.hasNext()) {
            C11091f.C11093b bVar = (C11091f.C11093b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: o */
    public C11091f.C11094c mo38354o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        C13253f fVar = new C13253f(this.f47536b.getAndIncrement(), surfaceTexture);
        C11881b.m57388f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.mo34886d());
        m62079p(fVar.mo34886d(), fVar.mo38365j());
        mo38349g(fVar);
        return fVar;
    }

    /* renamed from: q */
    public void mo38355q(C13257b bVar) {
        this.f47535a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo38356r(C11091f.C11093b bVar) {
        for (WeakReference next : this.f47540f) {
            if (next.get() == bVar) {
                this.f47540f.remove(next);
                return;
            }
        }
    }

    /* renamed from: s */
    public void mo38357s(boolean z) {
        this.f47535a.setSemanticsEnabled(z);
    }

    /* renamed from: t */
    public void mo38358t(C13256g gVar) {
        C13256g gVar2 = gVar;
        if (gVar.mo38368a()) {
            C11881b.m57388f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f47570b + " x " + gVar2.f47571c + "\nPadding - L: " + gVar2.f47575g + ", T: " + gVar2.f47572d + ", R: " + gVar2.f47573e + ", B: " + gVar2.f47574f + "\nInsets - L: " + gVar2.f47579k + ", T: " + gVar2.f47576h + ", R: " + gVar2.f47577i + ", B: " + gVar2.f47578j + "\nSystem Gesture Insets - L: " + gVar2.f47583o + ", T: " + gVar2.f47580l + ", R: " + gVar2.f47581m + ", B: " + gVar2.f47581m + "\nDisplay Features: " + gVar2.f47585q.size());
            int[] iArr = new int[(gVar2.f47585q.size() * 4)];
            int[] iArr2 = new int[gVar2.f47585q.size()];
            int[] iArr3 = new int[gVar2.f47585q.size()];
            for (int i = 0; i < gVar2.f47585q.size(); i++) {
                C13249b bVar = gVar2.f47585q.get(i);
                int i2 = i * 4;
                Rect rect = bVar.f47543a;
                iArr[i2] = rect.left;
                iArr[i2 + 1] = rect.top;
                iArr[i2 + 2] = rect.right;
                iArr[i2 + 3] = rect.bottom;
                iArr2[i] = bVar.f47544b.f47556a;
                iArr3[i] = bVar.f47545c.f47550a;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f47535a;
            flutterJNI.setViewportMetrics(gVar2.f47569a, gVar2.f47570b, gVar2.f47571c, gVar2.f47572d, gVar2.f47573e, gVar2.f47574f, gVar2.f47575g, gVar2.f47576h, gVar2.f47577i, gVar2.f47578j, gVar2.f47579k, gVar2.f47580l, gVar2.f47581m, gVar2.f47582n, gVar2.f47583o, gVar2.f47584p, iArr, iArr2, iArr4);
        }
    }

    /* renamed from: u */
    public void mo38359u(Surface surface, boolean z) {
        if (this.f47537c != null && !z) {
            mo38360v();
        }
        this.f47537c = surface;
        this.f47535a.onSurfaceCreated(surface);
    }

    /* renamed from: v */
    public void mo38360v() {
        this.f47535a.onSurfaceDestroyed();
        this.f47537c = null;
        if (this.f47538d) {
            this.f47541g.mo33830b();
        }
        this.f47538d = false;
    }

    /* renamed from: w */
    public void mo38361w(int i, int i2) {
        this.f47535a.onSurfaceChanged(i, i2);
    }

    /* renamed from: x */
    public void mo38362x(Surface surface) {
        this.f47537c = surface;
        this.f47535a.onSurfaceWindowChanged(surface);
    }

    /* renamed from: yb.a$b */
    /* compiled from: FlutterRenderer */
    public static final class C13249b {

        /* renamed from: a */
        public final Rect f47543a;

        /* renamed from: b */
        public final C13251d f47544b;

        /* renamed from: c */
        public final C13250c f47545c;

        public C13249b(Rect rect, C13251d dVar, C13250c cVar) {
            this.f47543a = rect;
            this.f47544b = dVar;
            this.f47545c = cVar;
        }

        public C13249b(Rect rect, C13251d dVar) {
            this.f47543a = rect;
            this.f47544b = dVar;
            this.f47545c = C13250c.UNKNOWN;
        }
    }
}
