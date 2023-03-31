package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sf4 implements wg4, md4 {

    /* renamed from: a */
    private final Object f17456a;

    /* renamed from: b */
    private vg4 f17457b;

    /* renamed from: c */
    private ld4 f17458c;

    /* renamed from: d */
    final /* synthetic */ uf4 f17459d;

    public sf4(uf4 uf4, Object obj) {
        this.f17459d = uf4;
        this.f17457b = uf4.mo12338q((mg4) null);
        this.f17458c = uf4.mo12335n((mg4) null);
        this.f17456a = obj;
    }

    /* renamed from: e */
    private final boolean m20351e(int i, mg4 mg4) {
        mg4 mg42;
        if (mg4 != null) {
            mg42 = this.f17459d.mo9593z(this.f17456a, mg4);
            if (mg42 == null) {
                return false;
            }
        } else {
            mg42 = null;
        }
        vg4 vg4 = this.f17457b;
        if (vg4.f19089a != i || !gb2.m13186t(vg4.f19090b, mg42)) {
            this.f17457b = this.f17459d.mo12339r(i, mg42, 0);
        }
        ld4 ld4 = this.f17458c;
        if (ld4.f12748a == i && gb2.m13186t(ld4.f12749b, mg42)) {
            return true;
        }
        this.f17458c = this.f17459d.mo12337p(i, mg42);
        return true;
    }

    /* renamed from: a */
    public final void mo11909a(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m20351e(i, mg4)) {
            this.f17457b.mo14757g(cg4, ig4);
        }
    }

    /* renamed from: b */
    public final void mo11910b(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m20351e(i, mg4)) {
            this.f17457b.mo14761k(cg4, ig4);
        }
    }

    /* renamed from: c */
    public final void mo11911c(int i, mg4 mg4, ig4 ig4) {
        if (m20351e(i, mg4)) {
            this.f17457b.mo14753c(ig4);
        }
    }

    /* renamed from: d */
    public final void mo11912d(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        if (m20351e(i, mg4)) {
            this.f17457b.mo14755e(cg4, ig4);
        }
    }

    /* renamed from: z */
    public final void mo11913z(int i, mg4 mg4, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        if (m20351e(i, mg4)) {
            this.f17457b.mo14759i(cg4, ig4, iOException, z);
        }
    }
}
