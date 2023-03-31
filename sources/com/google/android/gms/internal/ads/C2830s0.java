package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.s0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2830s0 extends C3015x0 {

    /* renamed from: e */
    private static final int[] f17160e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f17161b;

    /* renamed from: c */
    private boolean f17162c;

    /* renamed from: d */
    private int f17163d;

    public C2830s0(C2792r rVar) {
        super(rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13915a(y22 y22) throws C2978w0 {
        if (!this.f17161b) {
            int s = y22.mo15306s();
            int i = s >> 4;
            this.f17163d = i;
            if (i == 2) {
                int i2 = f17160e[(s >> 2) & 3];
                C2311e2 e2Var = new C2311e2();
                e2Var.mo9776s("audio/mpeg");
                e2Var.mo9759e0(1);
                e2Var.mo9777t(i2);
                this.f19920a.mo8823e(e2Var.mo9782y());
                this.f17162c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C2311e2 e2Var2 = new C2311e2();
                e2Var2.mo9776s(str);
                e2Var2.mo9759e0(1);
                e2Var2.mo9777t(8000);
                this.f19920a.mo8823e(e2Var2.mo9782y());
                this.f17162c = true;
            } else if (i != 10) {
                throw new C2978w0("Audio format not supported: " + i);
            }
            this.f17161b = true;
        } else {
            y22.mo15294g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo13916b(y22 y22, long j) throws ea0 {
        if (this.f17163d == 2) {
            int i = y22.mo15296i();
            this.f19920a.mo8821c(y22, i);
            this.f19920a.mo8824f(j, 1, i, 0, (C2755q) null);
            return true;
        }
        int s = y22.mo15306s();
        if (s == 0 && !this.f17162c) {
            int i2 = y22.mo15296i();
            byte[] bArr = new byte[i2];
            y22.mo15289b(bArr, 0, i2);
            mm4 a = nm4.m17191a(bArr);
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9776s("audio/mp4a-latm");
            e2Var.mo9761f0(a.f13417c);
            e2Var.mo9759e0(a.f13416b);
            e2Var.mo9777t(a.f13415a);
            e2Var.mo9766i(Collections.singletonList(bArr));
            this.f19920a.mo8823e(e2Var.mo9782y());
            this.f17162c = true;
            return false;
        } else if (this.f17163d == 10 && s != 1) {
            return false;
        } else {
            int i3 = y22.mo15296i();
            this.f19920a.mo8821c(y22, i3);
            this.f19920a.mo8824f(j, 1, i3, 0, (C2755q) null);
            return true;
        }
    }
}
