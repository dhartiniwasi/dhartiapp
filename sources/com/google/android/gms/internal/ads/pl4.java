package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pl4 extends Surface {

    /* renamed from: d */
    private static int f15903d;

    /* renamed from: e */
    private static boolean f15904e;

    /* renamed from: a */
    public final boolean f15905a;

    /* renamed from: b */
    private final nl4 f15906b;

    /* renamed from: c */
    private boolean f15907c;

    /* synthetic */ pl4(nl4 nl4, SurfaceTexture surfaceTexture, boolean z, ol4 ol4) {
        super(surfaceTexture);
        this.f15906b = nl4;
        this.f15905a = z;
    }

    /* renamed from: a */
    public static pl4 m18657a(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m18658b(context)) {
            z2 = false;
        }
        v91.m22052f(z2);
        nl4 nl4 = new nl4();
        if (z) {
            i = f15903d;
        }
        return nl4.mo12659a(i);
    }

    /* renamed from: b */
    public static synchronized boolean m18658b(Context context) {
        int i;
        synchronized (pl4.class) {
            if (!f15904e) {
                int i2 = gb2.f9812a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(gb2.f9814c)) {
                            if ("XT1650".equals(gb2.f9815d)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i3 = 1;
                            }
                            f15903d = i3;
                            f15904e = true;
                        }
                    }
                }
                i3 = 0;
                f15903d = i3;
                f15904e = true;
            }
            i = f15903d;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f15906b) {
            if (!this.f15907c) {
                this.f15906b.mo12660b();
                this.f15907c = true;
            }
        }
    }
}
