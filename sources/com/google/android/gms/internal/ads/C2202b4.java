package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.b4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2202b4 extends C2276d4 {

    /* renamed from: b */
    public final long f7086b;

    /* renamed from: c */
    public final List f7087c = new ArrayList();

    /* renamed from: d */
    public final List f7088d = new ArrayList();

    public C2202b4(int i, long j) {
        super(i);
        this.f7086b = j;
    }

    /* renamed from: c */
    public final C2202b4 mo8663c(int i) {
        int size = this.f7088d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2202b4 b4Var = (C2202b4) this.f7088d.get(i2);
            if (b4Var.f8046a == i) {
                return b4Var;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C2239c4 mo8664d(int i) {
        int size = this.f7087c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2239c4 c4Var = (C2239c4) this.f7087c.get(i2);
            if (c4Var.f8046a == i) {
                return c4Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo8665e(C2202b4 b4Var) {
        this.f7088d.add(b4Var);
    }

    /* renamed from: f */
    public final void mo8666f(C2239c4 c4Var) {
        this.f7087c.add(c4Var);
    }

    public final String toString() {
        String b = C2276d4.m11304b(this.f8046a);
        String arrays = Arrays.toString(this.f7087c.toArray());
        String arrays2 = Arrays.toString(this.f7088d.toArray());
        return b + " leaves: " + arrays + " containers: " + arrays2;
    }
}
