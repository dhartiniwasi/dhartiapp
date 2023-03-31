package p030d2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import p030d2.C4021h;
import p161w3.C5953m0;

/* renamed from: d2.c0 */
/* compiled from: DrmUtil */
public final class C4002c0 {

    /* renamed from: d2.c0$a */
    /* compiled from: DrmUtil */
    private static final class C4003a {
        /* renamed from: a */
        public static boolean m27644a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m27645b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* renamed from: d2.c0$b */
    /* compiled from: DrmUtil */
    private static final class C4004b {
        /* renamed from: a */
        public static boolean m27646a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m27647b(Throwable th) {
            return C5953m0.m35108U(C5953m0.m35110V(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: d2.c0$c */
    /* compiled from: DrmUtil */
    private static final class C4005c {
        /* renamed from: a */
        public static boolean m27648a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m27643a(Exception exc, int i) {
        int i2 = C5953m0.f29110a;
        if (i2 >= 21 && C4004b.m27646a(exc)) {
            return C4004b.m27647b(exc);
        }
        if (i2 >= 23 && C4005c.m27648a(exc)) {
            return 6006;
        }
        if (i2 >= 18 && C4003a.m27645b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i2 >= 18 && C4003a.m27644a(exc)) {
            return 6007;
        }
        if (exc instanceof C4046p0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof C4021h.C4026e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof C4039m0) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
