package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.kg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2549kg extends C2513jh {

    /* renamed from: j */
    private static final C2550kh f12076j = new C2550kh();

    /* renamed from: i */
    private final Context f12077i;

    public C2549kg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, Context context, C2804rb rbVar) {
        super(wfVar, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", ybVar, i, 27);
        this.f12077i = context;
    }

    /* renamed from: d */
    private final String m15402d() {
        try {
            if (this.f11600b.mo14911l() != null) {
                this.f11600b.mo14911l().get();
            }
            C2730pc c = this.f11600b.mo14903c();
            if (c == null || !c.mo13215q0()) {
                return null;
            }
            return c.mo13213F0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        C2359fd fdVar;
        int i;
        Boolean bool;
        AtomicReference a = f12076j.mo11700a(this.f12077i.getPackageName());
        synchronized (a) {
            C2359fd fdVar2 = (C2359fd) a.get();
            if (fdVar2 == null || C3104zf.m24571g(fdVar2.f9220b) || fdVar2.f9220b.equals("E") || fdVar2.f9220b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!C3104zf.m24571g((String) null)) {
                    i = 5;
                } else {
                    if (!C3104zf.m24571g((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i = (!bool.booleanValue() || !this.f11600b.mo14913p()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) C4596v.m30088c().mo12227b(C2679nz.f14481Y1);
                String c = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14472X1)).booleanValue() ? mo11694c() : null;
                if (bool2.booleanValue() && this.f11600b.mo14913p() && C3104zf.m24571g(c)) {
                    c = m15402d();
                }
                C2359fd fdVar3 = new C2359fd((String) this.f11604f.invoke((Object) null, new Object[]{this.f12077i, valueOf, c}));
                if (C3104zf.m24571g(fdVar3.f9220b) || fdVar3.f9220b.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = m15402d();
                        if (!C3104zf.m24571g(d)) {
                            fdVar3.f9220b = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(fdVar3);
            }
            fdVar = (C2359fd) a.get();
        }
        synchronized (this.f11603e) {
            if (fdVar != null) {
                this.f11603e.mo15412x0(fdVar.f9220b);
                this.f11603e.mo15374P(fdVar.f9221c);
                this.f11603e.mo15376R(fdVar.f9222d);
                this.f11603e.mo15391h0(fdVar.f9223e);
                this.f11603e.mo15410w0(fdVar.f9224f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo11694c() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] i = C3104zf.m24573i((String) C4596v.m30088c().mo12227b(C2679nz.f14490Z1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(C3104zf.m24573i((String) C4596v.m30088c().mo12227b(C2679nz.f14500a2)))));
            }
            Context context = this.f12077i;
            String packageName = context.getPackageName();
            this.f11600b.mo14910k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            uf3 D = uf3.m21609D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new C2587lh(D));
            return (String) D.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
