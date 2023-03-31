package p180z4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p033d5.C4083a1;
import p033d5.C4141r;
import p033d5.C4167z0;
import p067i5.C4687a;
import p067i5.C4696j;
import p088l5.C4956b;

/* renamed from: z4.b0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C6363b0 {

    /* renamed from: a */
    static final C6398z f30582a = new C6392t(C6396x.m37488P0("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C6398z f30583b = new C6393u(C6396x.m37488P0("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C6398z f30584c = new C6394v(C6396x.m37488P0("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C6398z f30585d = new C6395w(C6396x.m37488P0("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile C4083a1 f30586e;

    /* renamed from: f */
    private static final Object f30587f = new Object();

    /* renamed from: g */
    private static Context f30588g;

    /* renamed from: a */
    static C6383l0 m37404a(String str, C6396x xVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m37409f(str, xVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C6383l0 m37405b(String str, boolean z, boolean z2, boolean z3) {
        return m37410g(str, z, false, false, true);
    }

    /* renamed from: c */
    static /* synthetic */ String m37406c(boolean z, String str, C6396x xVar) throws Exception {
        String str2 = true != (!z && m37409f(str, xVar, true, false).f30628a) ? "not allowed" : "debug cert rejected";
        MessageDigest b = C4687a.m30365b("SHA-256");
        C4141r.m28221k(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, C4696j.m30401a(b.digest(xVar.mo21820o3())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m37407d(Context context) {
        synchronized (C6363b0.class) {
            if (f30588g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f30588g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m37408e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m37411h();
            boolean V = f30586e.mo17314V();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return V;
        } catch (RemoteException | DynamiteModule.C2142a e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C6383l0 m37409f(String str, C6396x xVar, boolean z, boolean z2) {
        try {
            m37411h();
            C4141r.m28221k(f30588g);
            try {
                return f30586e.mo17313T4(new C6373g0(str, xVar, z, z2), C4956b.m31385o3(f30588g.getPackageManager())) ? C6383l0.m37472b() : new C6379j0(new C6391s(z, str, xVar), (C6377i0) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C6383l0.m37474d("module call", e);
            }
        } catch (DynamiteModule.C2142a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C6383l0.m37474d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [l5.a, android.os.IBinder] */
    /* renamed from: g */
    private static C6383l0 m37410g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C6383l0 l0Var;
        C6369e0 e0Var;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C4141r.m28221k(f30588g);
            try {
                m37411h();
                C6365c0 c0Var = new C6365c0(str, z, false, C4956b.m31385o3(f30588g), false);
                if (z4) {
                    e0Var = f30586e.mo17316s6(c0Var);
                } else {
                    e0Var = f30586e.mo17315c4(c0Var);
                }
                if (e0Var.mo21790I1()) {
                    l0Var = C6383l0.m37475f(e0Var.mo21791J1());
                } else {
                    String zza = e0Var.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = e0Var.mo21792K1() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    l0Var = C6383l0.m37476g(e0Var.mo21791J1(), e0Var.mo21792K1(), zza, nameNotFoundException);
                }
            } catch (DynamiteModule.C2142a e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                l0Var = C6383l0.m37474d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            l0Var = C6383l0.m37474d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return l0Var;
    }

    /* renamed from: h */
    private static void m37411h() throws DynamiteModule.C2142a {
        if (f30586e == null) {
            C4141r.m28221k(f30588g);
            synchronized (f30587f) {
                if (f30586e == null) {
                    f30586e = C4167z0.m28278B0(DynamiteModule.m9486e(f30588g, DynamiteModule.f6329f, "com.google.android.gms.googlecertificates").mo8136d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
