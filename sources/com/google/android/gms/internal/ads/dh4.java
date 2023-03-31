package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dh4 extends uf4 {

    /* renamed from: t */
    private static final C2453hw f8274t;

    /* renamed from: k */
    private final og4[] f8275k;

    /* renamed from: l */
    private final gt0[] f8276l;

    /* renamed from: m */
    private final ArrayList f8277m;

    /* renamed from: n */
    private final Map f8278n;

    /* renamed from: o */
    private final qb3 f8279o;

    /* renamed from: p */
    private int f8280p = -1;

    /* renamed from: q */
    private long[][] f8281q;

    /* renamed from: r */
    private bh4 f8282r;

    /* renamed from: s */
    private final wf4 f8283s;

    static {
        C2541k8 k8Var = new C2541k8();
        k8Var.mo11617a("MergingMediaSource");
        f8274t = k8Var.mo11619c();
    }

    public dh4(boolean z, boolean z2, og4... og4Arr) {
        wf4 wf4 = new wf4();
        this.f8275k = og4Arr;
        this.f8283s = wf4;
        this.f8277m = new ArrayList(Arrays.asList(og4Arr));
        this.f8276l = new gt0[og4Arr.length];
        this.f8281q = new long[0][];
        this.f8278n = new HashMap();
        this.f8279o = xb3.m23170a(8).mo14887b(2).mo14491c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo9586A(Object obj, og4 og4, gt0 gt0) {
        int i;
        if (this.f8282r == null) {
            if (this.f8280p == -1) {
                i = gt0.mo8900b();
                this.f8280p = i;
            } else {
                int b = gt0.mo8900b();
                int i2 = this.f8280p;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f8282r = new bh4(0);
                    return;
                }
            }
            if (this.f8281q.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f8276l.length;
                iArr[0] = i;
                this.f8281q = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.f8277m.remove(og4);
            this.f8276l[((Integer) obj).intValue()] = gt0;
            if (this.f8277m.isEmpty()) {
                mo12342w(this.f8276l[0]);
            }
        }
    }

    /* renamed from: d */
    public final void mo9587d(kg4 kg4) {
        ah4 ah4 = (ah4) kg4;
        int i = 0;
        while (true) {
            og4[] og4Arr = this.f8275k;
            if (i < og4Arr.length) {
                og4Arr[i].mo9587d(ah4.mo8360j(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public final C2453hw mo9588j0() {
        og4[] og4Arr = this.f8275k;
        return og4Arr.length > 0 ? og4Arr[0].mo9588j0() : f8274t;
    }

    /* renamed from: k */
    public final kg4 mo9589k(mg4 mg4, nk4 nk4, long j) {
        int length = this.f8275k.length;
        kg4[] kg4Arr = new kg4[length];
        int a = this.f8276l[0].mo8899a(mg4.f12629a);
        for (int i = 0; i < length; i++) {
            kg4Arr[i] = this.f8275k[i].mo9589k(mg4.mo12346c(this.f8276l[i].mo8904f(a)), nk4, j - this.f8281q[a][i]);
        }
        return new ah4(this.f8283s, this.f8281q[a], kg4Arr, (byte[]) null);
    }

    /* renamed from: t */
    public final void mo9590t() throws IOException {
        bh4 bh4 = this.f8282r;
        if (bh4 == null) {
            super.mo9590t();
            return;
        }
        throw bh4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo9591v(ve3 ve3) {
        super.mo9591v(ve3);
        for (int i = 0; i < this.f8275k.length; i++) {
            mo14509B(Integer.valueOf(i), this.f8275k[i]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo9592x() {
        super.mo9592x();
        Arrays.fill(this.f8276l, (Object) null);
        this.f8280p = -1;
        this.f8282r = null;
        this.f8277m.clear();
        Collections.addAll(this.f8277m, this.f8275k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ mg4 mo9593z(Object obj, mg4 mg4) {
        if (((Integer) obj).intValue() == 0) {
            return mg4;
        }
        return null;
    }
}
