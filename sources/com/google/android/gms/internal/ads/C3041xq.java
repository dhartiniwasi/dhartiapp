package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.xq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3041xq extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: a */
    private final int[] f20319a = new int[1];

    /* renamed from: b */
    private Handler f20320b;

    /* renamed from: c */
    private SurfaceTexture f20321c;

    /* renamed from: d */
    private Error f20322d;

    /* renamed from: e */
    private RuntimeException f20323e;

    /* renamed from: f */
    private C3115zq f20324f;

    public C3041xq() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final C3115zq mo15223a(boolean z) {
        boolean z2;
        start();
        this.f20320b = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f20320b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f20324f == null && this.f20323e == null && this.f20322d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f20323e;
        if (runtimeException == null) {
            Error error = this.f20322d;
            if (error == null) {
                return this.f20324f;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo15224b() {
        this.f20320b.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                C2335eq.m12246f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C2335eq.m12246f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                C2335eq.m12246f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                C2335eq.m12246f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                C2335eq.m12246f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                C2335eq.m12246f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f20319a, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f20319a[0]);
                this.f20321c = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f20324f = new C3115zq(this, this.f20321c, z, (C3078yq) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f20323e = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f20322d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.f20321c.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f20321c.release();
                this.f20324f = null;
                this.f20321c = null;
                GLES20.glDeleteTextures(1, this.f20319a, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20320b.sendEmptyMessage(2);
    }
}
