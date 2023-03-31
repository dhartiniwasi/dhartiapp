package p161w3;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: w3.m */
/* compiled from: GlUtil */
public final class C5951m {

    /* renamed from: a */
    public static boolean f29105a = false;

    /* renamed from: b */
    private static final int[] f29106b = {12344};

    /* renamed from: c */
    private static final int[] f29107c = {12445, 13120, 12344};

    /* renamed from: d */
    private static final int[] f29108d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: e */
    private static final int[] f29109e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: w3.m$a */
    /* compiled from: GlUtil */
    public static final class C5952a extends RuntimeException {
        public C5952a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m35064a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            C5961r.m35209c("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            m35067d("glError: " + GLU.gluErrorString(i));
        }
    }

    /* renamed from: b */
    public static boolean m35065b(Context context) {
        String eglQueryString;
        int i = C5953m0.f29110a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(C5953m0.f29112c) || "XT1650".equals(C5953m0.f29113d))) {
            return false;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m35066c() {
        String eglQueryString;
        if (C5953m0.f29110a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static void m35067d(String str) {
        if (!f29105a) {
            C5961r.m35209c("GlUtil", str);
            return;
        }
        throw new C5952a(str);
    }
}
