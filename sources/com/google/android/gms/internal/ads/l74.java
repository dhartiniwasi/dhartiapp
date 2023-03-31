package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class l74 implements wg4, md4 {

    /* renamed from: a */
    private final n74 f12670a;

    /* renamed from: b */
    private vg4 f12671b;

    /* renamed from: c */
    private ld4 f12672c;

    /* renamed from: d */
    final /* synthetic */ p74 f12673d;

    public l74(p74 p74, n74 n74) {
        this.f12673d = p74;
        this.f12671b = p74.f15725f;
        this.f12672c = p74.f15726g;
        this.f12670a = n74;
    }

    /* renamed from: e */
    private final boolean m15848e(int i, mg4 mg4) {
        mg4 mg42 = null;
        if (mg4 != null) {
            n74 n74 = this.f12670a;
            int i2 = 0;
            while (true) {
                if (i2 >= n74.f13891c.size()) {
                    break;
                } else if (((mg4) n74.f13891c.get(i2)).f12632d == mg4.f12632d) {
                    mg42 = mg4.mo12346c(Pair.create(n74.f13890b, mg4.f12629a));
                    break;
                } else {
                    i2++;
                }
            }
            if (mg42 == null) {
                return false;
            }
        }
        int i3 = i + this.f12670a.f13892d;
        vg4 vg4 = this.f12671b;
        if (vg4.f19089a != i3 || !gb2.m13186t(vg4.f19090b, mg42)) {
            this.f12671b = this.f12673d.f15725f.mo14751a(i3, mg42, 0);
        }
        ld4 ld4 = this.f12672c;
        if (ld4.f12748a == i3 && gb2.m13186t(ld4.f12749b, mg42)) {
            return true;
        }
        this.f12672c = this.f12673d.f15726g.mo11980a(i3, mg42);
        return true;
    }

    /* renamed from: a */
    public final void mo11909a(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m15848e(i, mg4)) {
            this.f12671b.mo14757g(cg4, ig4);
        }
    }

    /* renamed from: b */
    public final void mo11910b(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m15848e(i, mg4)) {
            this.f12671b.mo14761k(cg4, ig4);
        }
    }

    /* renamed from: c */
    public final void mo11911c(int i, mg4 mg4, ig4 ig4) {
        if (m15848e(i, mg4)) {
            this.f12671b.mo14753c(ig4);
        }
    }

    /* renamed from: d */
    public final void mo11912d(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m15848e(i, mg4)) {
            this.f12671b.mo14755e(cg4, ig4);
        }
    }

    /* renamed from: z */
    public final void mo11913z(int i, mg4 mg4, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        if (m15848e(i, mg4)) {
            this.f12671b.mo14759i(cg4, ig4, iOException, z);
        }
    }
}
