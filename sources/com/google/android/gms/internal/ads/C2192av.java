package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.av */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2192av {

    /* renamed from: a */
    private final byte[] f6776a;

    /* renamed from: b */
    private int f6777b;

    /* renamed from: c */
    final /* synthetic */ C2229bv f6778c;

    /* synthetic */ C2192av(C2229bv bvVar, byte[] bArr, C3119zu zuVar) {
        this.f6778c = bvVar;
        this.f6776a = bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized void m10011d() {
        try {
            C2229bv bvVar = this.f6778c;
            if (bvVar.f7464b) {
                bvVar.f7463a.mo14928q0(this.f6776a);
                this.f6778c.f7463a.mo14929x0(0);
                this.f6778c.f7463a.mo14927f0(this.f6777b);
                this.f6778c.f7463a.mo14925C0((int[]) null);
                this.f6778c.f7463a.mo14926T();
            }
        } catch (RemoteException e) {
            pm0.m18663c("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final C2192av mo8564a(int i) {
        this.f6777b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo8565c() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14311G8)).booleanValue()) {
            this.f6778c.f7465c.execute(new C3082yu(this));
        } else {
            m10011d();
        }
    }
}
