package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7433m7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f32750a;

    /* renamed from: b */
    final /* synthetic */ String f32751b;

    /* renamed from: c */
    final /* synthetic */ String f32752c;

    /* renamed from: d */
    final /* synthetic */ C7446n9 f32753d;

    /* renamed from: e */
    final /* synthetic */ C7532v7 f32754e;

    C7433m7(C7532v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, C7446n9 n9Var) {
        this.f32754e = v7Var;
        this.f32750a = atomicReference;
        this.f32751b = str2;
        this.f32752c = str3;
        this.f32753d = n9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f32750a) {
            try {
                C7532v7 v7Var = this.f32754e;
                C13028f H = v7Var.f33127d;
                if (H == null) {
                    v7Var.f32389a.mo24135l().mo24256q().mo24211d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f32751b, this.f32752c);
                    this.f32750a.set(Collections.emptyList());
                    this.f32750a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C4141r.m28221k(this.f32753d);
                    this.f32750a.set(H.mo24155C3(this.f32751b, this.f32752c, this.f32753d));
                } else {
                    this.f32750a.set(H.mo24170m2((String) null, this.f32751b, this.f32752c));
                }
                this.f32754e.m41978E();
                atomicReference = this.f32750a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f32754e.f32389a.mo24135l().mo24256q().mo24211d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f32751b, e);
                    this.f32750a.set(Collections.emptyList());
                    atomicReference = this.f32750a;
                } catch (Throwable th) {
                    this.f32750a.notify();
                    throw th;
                }
            }
        }
    }
}
