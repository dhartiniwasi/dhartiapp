package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2781qp {

    /* renamed from: a */
    private final C2558kp[] f16485a = new C2558kp[1];

    /* renamed from: b */
    private int f16486b;

    /* renamed from: c */
    private int f16487c;

    /* renamed from: d */
    private int f16488d = 0;

    /* renamed from: e */
    private C2558kp[] f16489e = new C2558kp[100];

    public C2781qp(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo13576a() {
        return this.f16487c * 65536;
    }

    /* renamed from: b */
    public final synchronized C2558kp mo13577b() {
        C2558kp kpVar;
        this.f16487c++;
        int i = this.f16488d;
        if (i > 0) {
            C2558kp[] kpVarArr = this.f16489e;
            int i2 = i - 1;
            this.f16488d = i2;
            kpVar = kpVarArr[i2];
            kpVarArr[i2] = null;
        } else {
            kpVar = new C2558kp(new byte[65536], 0);
        }
        return kpVar;
    }

    /* renamed from: c */
    public final synchronized void mo13578c(C2558kp kpVar) {
        C2558kp[] kpVarArr = this.f16485a;
        kpVarArr[0] = kpVar;
        mo13579d(kpVarArr);
    }

    /* renamed from: d */
    public final synchronized void mo13579d(C2558kp[] kpVarArr) {
        int i = this.f16488d;
        int i2 = i + r1;
        C2558kp[] kpVarArr2 = this.f16489e;
        int length = kpVarArr2.length;
        if (i2 >= length) {
            this.f16489e = (C2558kp[]) Arrays.copyOf(kpVarArr2, Math.max(length + length, i2));
        }
        for (C2558kp kpVar : kpVarArr) {
            byte[] bArr = kpVar.f12205a;
            C2558kp[] kpVarArr3 = this.f16489e;
            int i3 = this.f16488d;
            this.f16488d = i3 + 1;
            kpVarArr3[i3] = kpVar;
        }
        this.f16487c -= kpVarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo13580e() {
        mo13581f(0);
    }

    /* renamed from: f */
    public final synchronized void mo13581f(int i) {
        int i2 = this.f16486b;
        this.f16486b = i;
        if (i < i2) {
            mo13582g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo13582g() {
        int max = Math.max(0, C2893tq.m21173d(this.f16486b, 65536) - this.f16487c);
        int i = this.f16488d;
        if (max < i) {
            Arrays.fill(this.f16489e, max, i, (Object) null);
            this.f16488d = max;
        }
    }
}
