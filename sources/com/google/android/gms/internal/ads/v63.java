package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class v63 extends r63 {

    /* renamed from: b */
    final /* synthetic */ b73 f18959b;

    v63(b73 b73) {
        this.f18959b = b73;
    }

    /* renamed from: a */
    public final void mo8223a() {
        b73 b73 = this.f18959b;
        if (b73.f7147m != null) {
            b73.f7136b.mo13479d("Unbind from service.", new Object[0]);
            b73 b732 = this.f18959b;
            b732.f7135a.unbindService(b732.f7146l);
            this.f18959b.f7141g = false;
            this.f18959b.f7147m = null;
            this.f18959b.f7146l = null;
        }
        this.f18959b.m10226t();
    }
}
