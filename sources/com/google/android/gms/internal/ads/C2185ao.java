package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ao */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2185ao implements C2333eo, C2296do {

    /* renamed from: a */
    private final Uri f6685a;

    /* renamed from: b */
    private final C2632mp f6686b;

    /* renamed from: c */
    private final C3072yk f6687c;

    /* renamed from: d */
    private final int f6688d;

    /* renamed from: e */
    private final Handler f6689e;

    /* renamed from: f */
    private final C3075yn f6690f;

    /* renamed from: g */
    private final C2180aj f6691g = new C2180aj();

    /* renamed from: h */
    private final int f6692h;

    /* renamed from: i */
    private C2296do f6693i;

    /* renamed from: r */
    private C2254cj f6694r;

    /* renamed from: s */
    private boolean f6695s;

    public C2185ao(Uri uri, C2632mp mpVar, C3072yk ykVar, int i, Handler handler, C3075yn ynVar, String str, int i2) {
        this.f6685a = uri;
        this.f6686b = mpVar;
        this.f6687c = ykVar;
        this.f6688d = i;
        this.f6689e = handler;
        this.f6690f = ynVar;
        this.f6692h = i2;
    }

    /* renamed from: a */
    public final C2259co mo8444a(int i, C2781qp qpVar) {
        C2335eq.m12243c(i == 0);
        return new C3038xn(this.f6685a, this.f6686b.zza(), this.f6687c.zza(), this.f6688d, this.f6689e, this.f6690f, this, qpVar, (String) null, this.f6692h, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo8445b() {
        this.f6693i = null;
    }

    /* renamed from: c */
    public final void mo8446c(C2402gi giVar, boolean z, C2296do doVar) {
        this.f6693i = doVar;
        C2817ro roVar = new C2817ro(-9223372036854775807L, false);
        this.f6694r = roVar;
        doVar.mo8447d(roVar, (Object) null);
    }

    /* renamed from: d */
    public final void mo8447d(C2254cj cjVar, Object obj) {
        C2180aj ajVar = this.f6691g;
        boolean z = false;
        cjVar.mo9184d(0, ajVar, false);
        if (ajVar.f6593c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f6695s || z) {
            this.f6694r = cjVar;
            this.f6695s = z;
            this.f6693i.mo8447d(cjVar, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo8448e(C2259co coVar) {
        ((C3038xn) coVar).mo15193x();
    }

    public final void zza() throws IOException {
    }
}
