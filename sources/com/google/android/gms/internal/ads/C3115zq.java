package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.zq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3115zq extends Surface {

    /* renamed from: c */
    private static boolean f21222c;

    /* renamed from: d */
    private static boolean f21223d;

    /* renamed from: a */
    private final C3041xq f21224a;

    /* renamed from: b */
    private boolean f21225b;

    /* synthetic */ C3115zq(C3041xq xqVar, SurfaceTexture surfaceTexture, boolean z, C3078yq yqVar) {
        super(surfaceTexture);
        this.f21224a = xqVar;
    }

    /* renamed from: a */
    public static C3115zq m24731a(Context context, boolean z) {
        if (C2893tq.f18208a >= 17) {
            boolean z2 = true;
            if (z && !m24732b(context)) {
                z2 = false;
            }
            C2335eq.m12245e(z2);
            return new C3041xq().mo15223a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: b */
    public static synchronized boolean m24732b(Context context) {
        boolean z;
        synchronized (C3115zq.class) {
            if (!f21223d) {
                int i = C2893tq.f18208a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = C2893tq.f18211d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f21222c = z2;
                }
                f21223d = true;
            }
            z = f21222c;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f21224a) {
            if (!this.f21225b) {
                this.f21224a.mo15224b();
                this.f21225b = true;
            }
        }
    }
}
