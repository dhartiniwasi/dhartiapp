package com.google.android.gms.measurement.internal;

import java.util.Map;
import p033d5.C4141r;
import p402y5.C13030h;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7385i3 implements Runnable {

    /* renamed from: a */
    private final C7374h3 f32554a;

    /* renamed from: b */
    private final int f32555b;

    /* renamed from: c */
    private final Throwable f32556c;

    /* renamed from: d */
    private final byte[] f32557d;

    /* renamed from: e */
    private final String f32558e;

    /* renamed from: f */
    private final Map f32559f;

    /* synthetic */ C7385i3(String str, C7374h3 h3Var, int i, Throwable th, byte[] bArr, Map map, C13030h hVar) {
        C4141r.m28221k(h3Var);
        this.f32554a = h3Var;
        this.f32555b = i;
        this.f32556c = th;
        this.f32557d = bArr;
        this.f32558e = str;
        this.f32559f = map;
    }

    public final void run() {
        this.f32554a.mo24302a(this.f32558e, this.f32555b, this.f32556c, this.f32557d, this.f32559f);
    }
}
