package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bg1 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g */
    private static final int[] f7234g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    private final Handler f7235a;

    /* renamed from: b */
    private final int[] f7236b = new int[1];

    /* renamed from: c */
    private EGLDisplay f7237c;

    /* renamed from: d */
    private EGLContext f7238d;

    /* renamed from: e */
    private EGLSurface f7239e;

    /* renamed from: f */
    private SurfaceTexture f7240f;

    public bg1(Handler handler, af1 af1) {
        this.f7235a = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture mo8779a() {
        SurfaceTexture surfaceTexture = this.f7240f;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void mo8780b(int i) throws ch1 {
        EGLSurface eGLSurface;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        di1.m11519a(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr2 = new int[2];
        di1.m11519a(EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1), "eglInitialize failed");
        this.f7237c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f7234g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        di1.m11519a(eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null, gb2.m13173i("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f7237c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        di1.m11519a(eglCreateContext != null, "eglCreateContext failed");
        this.f7238d = eglCreateContext;
        EGLDisplay eGLDisplay = this.f7237c;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            di1.m11519a(eGLSurface != null, "eglCreatePbufferSurface failed");
        }
        di1.m11519a(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext), "eglMakeCurrent failed");
        this.f7239e = eGLSurface;
        GLES20.glGenTextures(1, this.f7236b, 0);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (!z) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7236b[0]);
            this.f7240f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new ch1(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo8781c() {
        this.f7235a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f7240f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f7236b, 0);
            }
            EGLDisplay eGLDisplay = this.f7237c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f7237c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f7239e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7237c, this.f7239e);
            }
            EGLContext eGLContext = this.f7238d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f7237c, eGLContext);
            }
            int i = gb2.f9812a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f7237c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7237c);
            }
            this.f7237c = null;
            this.f7238d = null;
            this.f7239e = null;
            this.f7240f = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f7237c;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f7237c;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f7239e;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7237c, this.f7239e);
            }
            EGLContext eGLContext2 = this.f7238d;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f7237c, eGLContext2);
            }
            int i2 = gb2.f9812a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f7237c;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7237c);
            }
            this.f7237c = null;
            this.f7238d = null;
            this.f7239e = null;
            this.f7240f = null;
            throw th;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7235a.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f7240f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
