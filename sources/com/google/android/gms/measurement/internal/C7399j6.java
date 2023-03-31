package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C7399j6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7421l6 f32643a;

    /* renamed from: b */
    public final /* synthetic */ int f32644b;

    /* renamed from: c */
    public final /* synthetic */ Exception f32645c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f32646d;

    /* renamed from: e */
    public final /* synthetic */ Map f32647e;

    public /* synthetic */ C7399j6(C7421l6 l6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f32643a = l6Var;
        this.f32644b = i;
        this.f32645c = exc;
        this.f32646d = bArr;
        this.f32647e = map;
    }

    public final void run() {
        this.f32643a.mo24505a(this.f32644b, this.f32645c, this.f32646d, this.f32647e);
    }
}
