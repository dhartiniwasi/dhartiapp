package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ih */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2476ih {

    /* renamed from: a */
    private final C2993wf f10777a;

    /* renamed from: b */
    private final String f10778b;

    /* renamed from: c */
    private final String f10779c;

    /* renamed from: d */
    private volatile Method f10780d = null;

    /* renamed from: e */
    private final Class[] f10781e;

    /* renamed from: f */
    private final CountDownLatch f10782f = new CountDownLatch(1);

    public C2476ih(C2993wf wfVar, String str, String str2, Class... clsArr) {
        this.f10777a = wfVar;
        this.f10778b = str;
        this.f10779c = str2;
        this.f10781e = clsArr;
        wfVar.mo14910k().submit(new C2438hh(this));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m14322b(C2476ih ihVar) {
        CountDownLatch countDownLatch;
        try {
            C2993wf wfVar = ihVar.f10777a;
            Class loadClass = wfVar.mo14908i().loadClass(ihVar.m14323c(wfVar.mo14918u(), ihVar.f10778b));
            if (loadClass == null) {
                countDownLatch = ihVar.f10782f;
            } else {
                ihVar.f10780d = loadClass.getMethod(ihVar.m14323c(ihVar.f10777a.mo14918u(), ihVar.f10779c), ihVar.f10781e);
                if (ihVar.f10780d == null) {
                    countDownLatch = ihVar.f10782f;
                }
                countDownLatch = ihVar.f10782f;
            }
        } catch (C2176af | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = ihVar.f10782f;
        } catch (Throwable th) {
            ihVar.f10782f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m14323c(byte[] bArr, String str) throws C2176af, UnsupportedEncodingException {
        return new String(this.f10777a.mo14905e().mo8762b(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo11106a() {
        if (this.f10780d != null) {
            return this.f10780d;
        }
        try {
            if (!this.f10782f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f10780d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
