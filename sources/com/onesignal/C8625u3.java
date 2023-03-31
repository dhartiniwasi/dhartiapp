package com.onesignal;

import android.content.Context;
import com.onesignal.C8338d3;
import com.onesignal.C8605s3;
import java.io.IOException;

/* renamed from: com.onesignal.u3 */
/* compiled from: PushRegistratorAbstractGoogle */
abstract class C8625u3 implements C8605s3 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f36066d = 5;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f36067e = 10000;

    /* renamed from: a */
    private C8605s3.C8606a f36068a;

    /* renamed from: b */
    private Thread f36069b;

    /* renamed from: c */
    private boolean f36070c;

    /* renamed from: com.onesignal.u3$a */
    /* compiled from: PushRegistratorAbstractGoogle */
    class C8626a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f36071a;

        C8626a(String str) {
            this.f36071a = str;
        }

        public void run() {
            int i = 0;
            while (i < C8625u3.f36066d && !C8625u3.this.m47750e(this.f36071a, i)) {
                i++;
                OSUtils.m46190W(C8625u3.f36067e * i);
            }
        }
    }

    C8625u3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m47750e(String str, int i) {
        try {
            String g = mo28240g(str);
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
            C8338d3.m46492a(r0Var, "Device registered, push token = " + g);
            this.f36068a.mo27711a(g, 1);
            return true;
        } catch (IOException e) {
            int j = m47753j(e);
            String l = OSUtils.m46201l(e);
            if ("SERVICE_NOT_AVAILABLE".equals(l) || "AUTHENTICATION_FAILED".equals(l)) {
                Exception exc = new Exception(e);
                if (i >= f36066d - 1) {
                    C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.ERROR;
                    C8338d3.m46496b(r0Var2, "Retry count of " + f36066d + " exceed! Could not get a " + mo28239f() + " Token.", exc);
                } else {
                    C8338d3.C8384r0 r0Var3 = C8338d3.C8384r0.INFO;
                    C8338d3.m46496b(r0Var3, "'Google Play services' returned " + l + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        this.f36068a.mo27711a((String) null, j);
                        this.f36070c = true;
                        return true;
                    }
                }
                return false;
            }
            Exception exc2 = new Exception(e);
            C8338d3.C8384r0 r0Var4 = C8338d3.C8384r0.ERROR;
            C8338d3.m46496b(r0Var4, "Error Getting " + mo28239f() + " Token", exc2);
            if (!this.f36070c) {
                this.f36068a.mo27711a((String) null, j);
            }
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int j2 = m47753j(th);
            C8338d3.C8384r0 r0Var5 = C8338d3.C8384r0.ERROR;
            C8338d3.m46496b(r0Var5, "Unknown error getting " + mo28239f() + " Token", exc3);
            this.f36068a.mo27711a((String) null, j2);
            return true;
        }
    }

    /* renamed from: h */
    private void m47751h(String str) {
        try {
            if (OSUtils.m46171D()) {
                m47754k(str);
                return;
            }
            C8627v.m47761d();
            C8338d3.m46492a(C8338d3.C8384r0.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.f36068a.mo27711a((String) null, -7);
        } catch (Throwable th) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
            C8338d3.m46496b(r0Var, "Could not register with " + mo28239f() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f36068a.mo27711a((String) null, -8);
        }
    }

    /* renamed from: i */
    private boolean m47752i(String str, C8605s3.C8606a aVar) {
        boolean z;
        try {
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        C8338d3.m46492a(C8338d3.C8384r0.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.mo27711a((String) null, -6);
        return false;
    }

    /* renamed from: j */
    private static int m47753j(Throwable th) {
        String l = OSUtils.m46201l(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(l)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(l) ? -29 : -11;
    }

    /* renamed from: k */
    private synchronized void m47754k(String str) {
        Thread thread = this.f36069b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new C8626a(str));
            this.f36069b = thread2;
            thread2.start();
        }
    }

    /* renamed from: a */
    public void mo28203a(Context context, String str, C8605s3.C8606a aVar) {
        this.f36068a = aVar;
        if (m47752i(str, aVar)) {
            m47751h(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract String mo28239f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo28240g(String str) throws Throwable;
}
