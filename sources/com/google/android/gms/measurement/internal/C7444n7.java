package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7003i1;
import java.util.ArrayList;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7444n7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f32775a;

    /* renamed from: b */
    final /* synthetic */ String f32776b;

    /* renamed from: c */
    final /* synthetic */ C7446n9 f32777c;

    /* renamed from: d */
    final /* synthetic */ C7003i1 f32778d;

    /* renamed from: e */
    final /* synthetic */ C7532v7 f32779e;

    C7444n7(C7532v7 v7Var, String str, String str2, C7446n9 n9Var, C7003i1 i1Var) {
        this.f32779e = v7Var;
        this.f32775a = str;
        this.f32776b = str2;
        this.f32777c = n9Var;
        this.f32778d = i1Var;
    }

    public final void run() {
        C7397j4 j4Var;
        ArrayList arrayList = new ArrayList();
        try {
            C7532v7 v7Var = this.f32779e;
            C13028f H = v7Var.f33127d;
            if (H == null) {
                v7Var.f32389a.mo24135l().mo24256q().mo24210c("Failed to get conditional properties; not connected to service", this.f32775a, this.f32776b);
                j4Var = this.f32779e.f32389a;
            } else {
                C4141r.m28221k(this.f32777c);
                arrayList = C7391i9.m41604v(H.mo24155C3(this.f32775a, this.f32776b, this.f32777c));
                this.f32779e.m41978E();
                j4Var = this.f32779e.f32389a;
            }
        } catch (RemoteException e) {
            this.f32779e.f32389a.mo24135l().mo24256q().mo24211d("Failed to get conditional properties; remote exception", this.f32775a, this.f32776b, e);
            j4Var = this.f32779e.f32389a;
        } catch (Throwable th) {
            this.f32779e.f32389a.mo24423N().mo24368E(this.f32778d, arrayList);
            throw th;
        }
        j4Var.mo24423N().mo24368E(this.f32778d, arrayList);
    }
}
