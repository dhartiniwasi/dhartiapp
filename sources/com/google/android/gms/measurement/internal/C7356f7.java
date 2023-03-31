package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7003i1;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7356f7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7524v f32482a;

    /* renamed from: b */
    final /* synthetic */ String f32483b;

    /* renamed from: c */
    final /* synthetic */ C7003i1 f32484c;

    /* renamed from: d */
    final /* synthetic */ C7532v7 f32485d;

    C7356f7(C7532v7 v7Var, C7524v vVar, String str, C7003i1 i1Var) {
        this.f32485d = v7Var;
        this.f32482a = vVar;
        this.f32483b = str;
        this.f32484c = i1Var;
    }

    public final void run() {
        C7397j4 j4Var;
        byte[] bArr = null;
        try {
            C7532v7 v7Var = this.f32485d;
            C13028f H = v7Var.f33127d;
            if (H == null) {
                v7Var.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Failed to send event to service to bundle");
                j4Var = this.f32485d.f32389a;
            } else {
                bArr = H.mo24159L1(this.f32482a, this.f32483b);
                this.f32485d.m41978E();
                j4Var = this.f32485d.f32389a;
            }
        } catch (RemoteException e) {
            this.f32485d.f32389a.mo24135l().mo24256q().mo24209b("Failed to send event to the service to bundle", e);
            j4Var = this.f32485d.f32389a;
        } catch (Throwable th) {
            this.f32485d.f32389a.mo24423N().mo24370G(this.f32484c, bArr);
            throw th;
        }
        j4Var.mo24423N().mo24370G(this.f32484c, bArr);
    }
}
