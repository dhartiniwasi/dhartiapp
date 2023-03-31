package p161w3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: w3.j */
/* compiled from: EGLSurfaceTexture */
public final class C5941j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f29094h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    private final Handler f29095a;

    /* renamed from: b */
    private final int[] f29096b;

    /* renamed from: c */
    private final C5944c f29097c;

    /* renamed from: d */
    private EGLDisplay f29098d;

    /* renamed from: e */
    private EGLContext f29099e;

    /* renamed from: f */
    private EGLSurface f29100f;

    /* renamed from: g */
    private SurfaceTexture f29101g;

    /* renamed from: w3.j$b */
    /* compiled from: EGLSurfaceTexture */
    public static final class C5943b extends RuntimeException {
        private C5943b(String str) {
            super(str);
        }
    }

    /* renamed from: w3.j$c */
    /* compiled from: EGLSurfaceTexture */
    public interface C5944c {
        /* renamed from: a */
        void mo20633a();
    }

    public C5941j(Handler handler) {
        this(handler, (C5944c) null);
    }

    /* renamed from: a */
    private static EGLConfig m35034a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f29094h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C5943b(C5953m0.m35072C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    private static EGLContext m35035b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C5943b("eglCreateContext failed");
    }

    /* renamed from: c */
    private static EGLSurface m35036c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new C5943b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C5943b("eglMakeCurrent failed");
    }

    /* renamed from: d */
    private void m35037d() {
        C5944c cVar = this.f29097c;
        if (cVar != null) {
            cVar.mo20633a();
        }
    }

    /* renamed from: e */
    private static void m35038e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C5951m.m35064a();
    }

    /* renamed from: f */
    private static EGLDisplay m35039f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C5943b("eglInitialize failed");
        }
        throw new C5943b("eglGetDisplay failed");
    }

    /* renamed from: g */
    public SurfaceTexture mo20628g() {
        return (SurfaceTexture) C5917a.m34872e(this.f29101g);
    }

    /* renamed from: h */
    public void mo20629h(int i) {
        EGLDisplay f = m35039f();
        this.f29098d = f;
        EGLConfig a = m35034a(f);
        EGLContext b = m35035b(this.f29098d, a, i);
        this.f29099e = b;
        this.f29100f = m35036c(this.f29098d, a, b, i);
        m35038e(this.f29096b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f29096b[0]);
        this.f29101g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void mo20630i() {
        this.f29095a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f29101g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f29096b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f29098d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f29098d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f29100f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f29098d, this.f29100f);
            }
            EGLContext eGLContext = this.f29099e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f29098d, eGLContext);
            }
            if (C5953m0.f29110a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f29098d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f29098d);
            }
            this.f29098d = null;
            this.f29099e = null;
            this.f29100f = null;
            this.f29101g = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f29095a.post(this);
    }

    public void run() {
        m35037d();
        SurfaceTexture surfaceTexture = this.f29101g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C5941j(Handler handler, C5944c cVar) {
        this.f29095a = handler;
        this.f29097c = cVar;
        this.f29096b = new int[1];
    }
}
