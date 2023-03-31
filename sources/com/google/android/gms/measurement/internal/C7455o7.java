package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7455o7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f32835a;

    /* renamed from: b */
    final /* synthetic */ String f32836b;

    /* renamed from: c */
    final /* synthetic */ String f32837c;

    /* renamed from: d */
    final /* synthetic */ C7446n9 f32838d;

    /* renamed from: e */
    final /* synthetic */ boolean f32839e;

    /* renamed from: f */
    final /* synthetic */ C7532v7 f32840f;

    C7455o7(C7532v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, C7446n9 n9Var, boolean z) {
        this.f32840f = v7Var;
        this.f32835a = atomicReference;
        this.f32836b = str2;
        this.f32837c = str3;
        this.f32838d = n9Var;
        this.f32839e = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f32835a) {
            try {
                C7532v7 v7Var = this.f32840f;
                C13028f H = v7Var.f33127d;
                if (H == null) {
                    v7Var.f32389a.mo24135l().mo24256q().mo24211d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f32836b, this.f32837c);
                    this.f32835a.set(Collections.emptyList());
                    this.f32835a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C4141r.m28221k(this.f32838d);
                    this.f32835a.set(H.mo24160M4(this.f32836b, this.f32837c, this.f32839e, this.f32838d));
                } else {
                    this.f32835a.set(H.mo24174x1((String) null, this.f32836b, this.f32837c, this.f32839e));
                }
                this.f32840f.m41978E();
                atomicReference = this.f32835a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f32840f.f32389a.mo24135l().mo24256q().mo24211d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f32836b, e);
                    this.f32835a.set(Collections.emptyList());
                    atomicReference = this.f32835a;
                } catch (Throwable th) {
                    this.f32835a.notify();
                    throw th;
                }
            }
        }
    }
}
