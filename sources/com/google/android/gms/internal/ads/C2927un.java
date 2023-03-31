package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.un */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2927un implements C3077yp {

    /* renamed from: a */
    private final Uri f18634a;

    /* renamed from: b */
    private final C2669np f18635b;

    /* renamed from: c */
    private final C2964vn f18636c;

    /* renamed from: d */
    private final C2410gq f18637d;

    /* renamed from: e */
    private final C2219bl f18638e = new C2219bl();

    /* renamed from: f */
    private volatile boolean f18639f;

    /* renamed from: g */
    private boolean f18640g = true;

    /* renamed from: h */
    private long f18641h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f18642i = -1;

    /* renamed from: j */
    final /* synthetic */ C3038xn f18643j;

    public C2927un(C3038xn xnVar, Uri uri, C2669np npVar, C2964vn vnVar, C2410gq gqVar) {
        this.f18643j = xnVar;
        Objects.requireNonNull(uri);
        this.f18634a = uri;
        Objects.requireNonNull(npVar);
        this.f18635b = npVar;
        Objects.requireNonNull(vnVar);
        this.f18636c = vnVar;
        this.f18637d = gqVar;
    }

    /* renamed from: a */
    public final boolean mo14545a() {
        return this.f18639f;
    }

    /* renamed from: c */
    public final void mo14546c(long j, long j2) {
        this.f18638e.f7339a = j;
        this.f18641h = j2;
        this.f18640g = true;
    }

    /* renamed from: d */
    public final void mo14547d() {
        this.f18639f = true;
    }

    /* renamed from: e */
    public final void mo14548e() throws IOException, InterruptedException {
        C2924uk ukVar;
        long j;
        while (!this.f18639f) {
            int i = 0;
            try {
                long j2 = this.f18638e.f7339a;
                C2669np npVar = this.f18635b;
                C2744pp ppVar = r4;
                long j3 = j2;
                C2744pp ppVar2 = new C2744pp(this.f18634a, (byte[]) null, j2, j2, -1, (String) null, 0);
                long d = npVar.mo12053d(ppVar);
                this.f18642i = d;
                if (d != -1) {
                    j = j3;
                    d += j;
                    this.f18642i = d;
                } else {
                    j = j3;
                }
                ukVar = new C2924uk(this.f18635b, j, d);
                try {
                    C2961vk b = this.f18636c.mo14795b(ukVar, this.f18635b.mo12054e());
                    if (this.f18640g) {
                        b.mo10569d(j, this.f18641h);
                        this.f18640g = false;
                    }
                    long j4 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f18639f) {
                                i2 = 0;
                                break;
                            }
                            this.f18637d.mo10616a();
                            i2 = b.mo10567a(ukVar, this.f18638e);
                            if (ukVar.mo14524d() > this.f18643j.f20245g + j4) {
                                j4 = ukVar.mo14524d();
                                this.f18637d.mo10617b();
                                C3038xn xnVar = this.f18643j;
                                xnVar.f20251u.post(xnVar.f20250t);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || ukVar == null)) {
                                this.f18638e.f7339a = ukVar.mo14524d();
                            }
                            C2893tq.m21182m(this.f18635b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f18638e.f7339a = ukVar.mo14524d();
                        i = i2;
                    }
                    C2893tq.m21182m(this.f18635b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f18638e.f7339a = ukVar.mo14524d();
                    C2893tq.m21182m(this.f18635b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ukVar = null;
                this.f18638e.f7339a = ukVar.mo14524d();
                C2893tq.m21182m(this.f18635b);
                throw th;
            }
        }
    }
}
