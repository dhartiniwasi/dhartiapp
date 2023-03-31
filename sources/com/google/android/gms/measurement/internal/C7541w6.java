package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7003i1;
import java.util.List;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7541w6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f33158a;

    /* renamed from: b */
    final /* synthetic */ String f33159b;

    /* renamed from: c */
    final /* synthetic */ C7446n9 f33160c;

    /* renamed from: d */
    final /* synthetic */ boolean f33161d;

    /* renamed from: e */
    final /* synthetic */ C7003i1 f33162e;

    /* renamed from: f */
    final /* synthetic */ C7532v7 f33163f;

    C7541w6(C7532v7 v7Var, String str, String str2, C7446n9 n9Var, boolean z, C7003i1 i1Var) {
        this.f33163f = v7Var;
        this.f33158a = str;
        this.f33159b = str2;
        this.f33160c = n9Var;
        this.f33161d = z;
        this.f33162e = i1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C7532v7 v7Var = this.f33163f;
            C13028f H = v7Var.f33127d;
            if (H == null) {
                v7Var.f32389a.mo24135l().mo24256q().mo24210c("Failed to get user properties; not connected to service", this.f33158a, this.f33159b);
                this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle2);
                return;
            }
            C4141r.m28221k(this.f33160c);
            List<C7336d9> M4 = H.mo24160M4(this.f33158a, this.f33159b, this.f33161d, this.f33160c);
            bundle = new Bundle();
            if (M4 != null) {
                for (C7336d9 d9Var : M4) {
                    String str = d9Var.f32442e;
                    if (str != null) {
                        bundle.putString(d9Var.f32439b, str);
                    } else {
                        Long l = d9Var.f32441d;
                        if (l != null) {
                            bundle.putLong(d9Var.f32439b, l.longValue());
                        } else {
                            Double d = d9Var.f32444g;
                            if (d != null) {
                                bundle.putDouble(d9Var.f32439b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f33163f.m41978E();
                this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f33163f.f32389a.mo24135l().mo24256q().mo24210c("Failed to get user properties; remote exception", this.f33158a, e);
                    this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f33163f.f32389a.mo24135l().mo24256q().mo24210c("Failed to get user properties; remote exception", this.f33158a, e);
            this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f33163f.f32389a.mo24423N().mo24369F(this.f33162e, bundle2);
            throw th;
        }
    }
}
